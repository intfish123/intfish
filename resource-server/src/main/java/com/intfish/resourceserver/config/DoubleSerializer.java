package com.intfish.resourceserver.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

public class DoubleSerializer extends JsonSerializer<Double> {
    @Override
    public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers)
            throws IOException {
        BigDecimal d = new BigDecimal(value.toString());
        gen.writeNumber(d.stripTrailingZeros().toPlainString());
    }

    @Override
    public Class<Double> handledType() {
        return Double.class;
    }
}
