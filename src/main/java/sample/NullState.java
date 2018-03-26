package sample;

import com.facebook.presto.spi.function.AccumulatorState;

public interface NullState extends AccumulatorState {
    // Occur errors if nothing accessor(Why?)
    long getLong();

    void setLong(long l);
}
