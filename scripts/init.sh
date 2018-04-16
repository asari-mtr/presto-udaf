#/bin/bash
aws s3 cp s3://$1/presto-udaf-1.0-SNAPSHOT.zip /tmp/
sudo mkdir -p /usr/lib/presto/plugin/
sudo unzip -d /usr/lib/presto/plugin/ /tmp/presto-udaf-1.0-SNAPSHOT.zip