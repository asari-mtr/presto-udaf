package sample;

import com.facebook.presto.spi.Plugin;
import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class AnswerToLifePlugin implements Plugin{

    @Override
    public Set<Class<?>> getFunctions() {
        return ImmutableSet.<Class<?>>builder()
                .add(Dog.class)
                .add(AnswerToLife.class)
                .build();
    }

}
