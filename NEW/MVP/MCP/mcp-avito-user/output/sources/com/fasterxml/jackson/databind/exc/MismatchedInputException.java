package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.g;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public class MismatchedInputException extends JsonMappingException {
    public MismatchedInputException() {
        throw null;
    }

    public MismatchedInputException(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        Annotation[] annotationArr = g.f342596a;
    }
}
