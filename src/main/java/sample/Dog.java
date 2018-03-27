package sample;

import com.facebook.presto.spi.function.ScalarFunction;
import com.facebook.presto.spi.function.SqlType;
import com.facebook.presto.spi.type.StandardTypes;
import io.airlift.slice.Slice;
import io.airlift.slice.Slices;

public class Dog {

    @ScalarFunction("dog_name")
    @SqlType(StandardTypes.VARCHAR)
    public static Slice dog_name() {
        return Slices.utf8Slice("Pochi");
    }
}
