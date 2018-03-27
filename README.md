```sql
select answer_to_life('the unierse');

>> 42
```

Install
---

build
```
$ mvn clean install
$ scp target/presto-udaf-1.0-SNAPSHOT.zip #{emr.ip}.ap-northeast-1.compute.amazonaws.com:/home/hadoop/
```

on emr
```
$ unzip presto-udaf-1.0-SNAPSHOT.zip
$ sudo cp -a presto-udaf-1.0-SNAPSHOT/ /usr/lib/presto/plugin/
$ sudo restart presto-server
```

see server.log
```
$ tail -f /mnt/var/log/presto/server.log
```

execute `presto-cli`

```
$ presto-cli
# debug mode
$ presto-cli --debug
```

function list
```
presto> show functions;
```