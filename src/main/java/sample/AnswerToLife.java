package sample;

import com.facebook.presto.spi.block.BlockBuilder;
import com.facebook.presto.spi.function.*;
import com.facebook.presto.spi.type.BigintType;
import com.facebook.presto.spi.type.StandardTypes;
import io.airlift.slice.Slice;

@AggregationFunction("answer_to_life")
public final class AnswerToLife {
    private AnswerToLife() {

    }

    @InputFunction
    public static void input(@AggregationState NullState state, @SqlType(StandardTypes.VARCHAR) Slice value) {

    }

    @CombineFunction
    public static void combine(@AggregationState NullState state, @AggregationState NullState other) {

    }

    @OutputFunction(StandardTypes.BIGINT)
    public static void output(@AggregationState NullState state, BlockBuilder out) {
        BigintType.BIGINT.writeLong(out, 42);
    }
}
