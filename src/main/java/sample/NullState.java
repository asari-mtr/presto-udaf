package sample;

import com.facebook.presto.spi.function.AccumulatorState;

public interface NullState extends AccumulatorState {
    long getLong();

    void setLong(long l);
}
