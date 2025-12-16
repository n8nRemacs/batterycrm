package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* compiled from: StackTraceElementDeserializer.java */
/* loaded from: classes4.dex */
public class A extends G<StackTraceElement> {
    private static final long serialVersionUID = 1;

    public A() {
        super(StackTraceElement.class);
    }

    @Override // com.fasterxml.jackson.databind.i
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final StackTraceElement e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        JsonToken jsonTokenF = jsonParser.f();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        Class<?> cls = this.f341716b;
        if (jsonTokenF != jsonToken) {
            if (jsonTokenF != JsonToken.START_ARRAY || !fVar.O(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            jsonParser.g0();
            StackTraceElement stackTraceElementE = e(jsonParser, fVar);
            if (jsonParser.g0() == JsonToken.END_ARRAY) {
                return stackTraceElementE;
            }
            o0(fVar);
            throw null;
        }
        String strL = "";
        String strL2 = "";
        int iZ2 = -1;
        String strL3 = strL2;
        while (true) {
            JsonToken jsonTokenH0 = jsonParser.h0();
            if (jsonTokenH0 == JsonToken.END_OBJECT) {
                return new StackTraceElement(strL, strL3, strL2, iZ2);
            }
            String strD = jsonParser.d();
            if ("className".equals(strD)) {
                strL = jsonParser.L();
            } else if ("classLoaderName".equals(strD)) {
                jsonParser.L();
            } else if ("fileName".equals(strD)) {
                strL2 = jsonParser.L();
            } else if ("lineNumber".equals(strD)) {
                iZ2 = jsonTokenH0.f341102h ? jsonParser.z() : V(jsonParser, fVar);
            } else if ("methodName".equals(strD)) {
                strL3 = jsonParser.L();
            } else if (!"nativeMethod".equals(strD)) {
                if ("moduleName".equals(strD)) {
                    jsonParser.L();
                } else if ("moduleVersion".equals(strD)) {
                    jsonParser.L();
                } else if (!"declaringClass".equals(strD) && !"format".equals(strD)) {
                    p0(jsonParser, fVar, cls, strD);
                }
            }
            jsonParser.l0();
        }
    }
}
