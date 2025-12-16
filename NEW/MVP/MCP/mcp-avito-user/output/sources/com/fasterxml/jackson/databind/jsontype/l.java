package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/* compiled from: TypeDeserializer.java */
/* loaded from: classes4.dex */
public abstract class l {

    /* compiled from: TypeDeserializer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342182a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f342182a = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342182a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342182a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f342182a[JsonToken.VALUE_TRUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f342182a[JsonToken.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Object a(JsonParser jsonParser, com.fasterxml.jackson.databind.h hVar) {
        Class<?> cls = hVar.f341930b;
        JsonToken jsonTokenF = jsonParser.f();
        if (jsonTokenF == null) {
            return null;
        }
        switch (jsonTokenF.ordinal()) {
            case 7:
                if (cls.isAssignableFrom(String.class)) {
                    return jsonParser.L();
                }
                return null;
            case 8:
                if (cls.isAssignableFrom(Integer.class)) {
                    return Integer.valueOf(jsonParser.z());
                }
                return null;
            case 9:
                if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(jsonParser.u());
                }
                return null;
            case 10:
                if (cls.isAssignableFrom(Boolean.class)) {
                    return Boolean.TRUE;
                }
                return null;
            case 11:
                if (cls.isAssignableFrom(Boolean.class)) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    public abstract Object b(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar);

    public abstract Object c(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar);

    public abstract Object d(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar);

    public abstract Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar);

    public abstract l f(com.fasterxml.jackson.databind.c cVar);

    public abstract Class<?> g();

    public abstract String h();

    public abstract m i();

    public abstract JsonTypeInfo.As k();

    public boolean l() {
        return g() != null;
    }
}
