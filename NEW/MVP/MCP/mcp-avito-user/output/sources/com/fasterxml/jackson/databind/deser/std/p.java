package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* compiled from: FromStringDeserializer.java */
/* loaded from: classes4.dex */
public abstract class p<T> extends G<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f341820e = 0;

    /* compiled from: FromStringDeserializer.java */
    public static class a extends p<Object> {
        private static final long serialVersionUID = 1;

        /* renamed from: f, reason: collision with root package name */
        public final int f341821f;

        public a(Class<?> cls, int i12) {
            super(cls);
            this.f341821f = i12;
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            int i12 = this.f341821f;
            if (i12 == 3) {
                return URI.create("");
            }
            if (i12 != 8) {
                return null;
            }
            return Locale.ROOT;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
        @Override // com.fasterxml.jackson.databind.deser.std.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object q0(com.fasterxml.jackson.databind.f r8, java.lang.String r9) throws com.fasterxml.jackson.databind.exc.InvalidFormatException, com.fasterxml.jackson.databind.exc.ValueInstantiationException {
            /*
                Method dump skipped, instructions count: 468
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.p.a.q0(com.fasterxml.jackson.databind.f, java.lang.String):java.lang.Object");
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p
        public final Object t0(com.fasterxml.jackson.databind.f fVar) {
            return l(fVar);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p
        public final boolean u0() {
            return this.f341821f != 7;
        }
    }

    /* compiled from: FromStringDeserializer.java */
    public static class b extends p<Object> {
        public b() {
            super(StringBuffer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p, com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            String strV = jsonParser.V();
            return strV != null ? new StringBuffer(strV) : super.e(jsonParser, fVar);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            return new StringBuffer();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p, com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return LogicalType.f342441k;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p
        public final Object q0(com.fasterxml.jackson.databind.f fVar, String str) {
            return new StringBuffer(str);
        }
    }

    /* compiled from: FromStringDeserializer.java */
    public static class c extends p<Object> {
        public c() {
            super(StringBuilder.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p, com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            String strV = jsonParser.V();
            return strV != null ? new StringBuilder(strV) : super.e(jsonParser, fVar);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object l(com.fasterxml.jackson.databind.f fVar) {
            return new StringBuilder();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p, com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return LogicalType.f342441k;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.p
        public final Object q0(com.fasterxml.jackson.databind.f fVar, String str) {
            return new StringBuilder(str);
        }
    }

    public p() {
        throw null;
    }

    public static p<?> v0(Class<?> cls) {
        int i12;
        if (cls == File.class) {
            i12 = 1;
        } else if (cls == URL.class) {
            i12 = 2;
        } else if (cls == URI.class) {
            i12 = 3;
        } else if (cls == Class.class) {
            i12 = 4;
        } else if (cls == com.fasterxml.jackson.databind.h.class) {
            i12 = 5;
        } else if (cls == Currency.class) {
            i12 = 6;
        } else if (cls == Pattern.class) {
            i12 = 7;
        } else if (cls == Locale.class) {
            i12 = 8;
        } else if (cls == Charset.class) {
            i12 = 9;
        } else if (cls == TimeZone.class) {
            i12 = 10;
        } else if (cls == InetAddress.class) {
            i12 = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                if (cls == StringBuilder.class) {
                    return new c();
                }
                if (cls == StringBuffer.class) {
                    return new b();
                }
                return null;
            }
            i12 = 12;
        }
        return new a(cls, i12);
    }

    @Override // com.fasterxml.jackson.databind.i
    public T e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        String strV = jsonParser.V();
        Class<?> cls = this.f341716b;
        if (strV == null) {
            JsonToken jsonTokenF = jsonParser.f();
            if (jsonTokenF == JsonToken.START_OBJECT) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            if (jsonTokenF == JsonToken.START_ARRAY) {
                return E(jsonParser, fVar);
            }
            if (jsonTokenF != JsonToken.VALUE_EMBEDDED_OBJECT) {
                fVar.E(cls, jsonParser);
                throw null;
            }
            T t12 = (T) jsonParser.x();
            if (t12 == null) {
                return null;
            }
            return cls.isAssignableFrom(t12.getClass()) ? t12 : (T) r0(fVar, t12);
        }
        if (strV.isEmpty()) {
            return (T) s0(fVar);
        }
        if (u0()) {
            String strTrim = strV.trim();
            if (strTrim != strV && strTrim.isEmpty()) {
                return (T) s0(fVar);
            }
            strV = strTrim;
        }
        try {
            return (T) q0(fVar, strV);
        } catch (IllegalArgumentException | MalformedURLException e12) {
            String message = e12.getMessage();
            InvalidFormatException invalidFormatExceptionA0 = fVar.a0(strV, message != null ? "not a valid textual representation, problem: ".concat(message) : "not a valid textual representation", cls);
            invalidFormatExceptionA0.initCause(e12);
            throw invalidFormatExceptionA0;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.G, com.fasterxml.jackson.databind.i
    public LogicalType q() {
        return LogicalType.f342444n;
    }

    public abstract Object q0(com.fasterxml.jackson.databind.f fVar, String str);

    public Object r0(com.fasterxml.jackson.databind.f fVar, Object obj) throws MismatchedInputException {
        fVar.V(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.f341716b.getName());
        throw null;
    }

    public final Object s0(com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        CoercionAction coercionActionN = fVar.n(q(), this.f341716b, CoercionInputShape.f341469f);
        if (coercionActionN == CoercionAction.f341460b) {
            fVar.V(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", C());
            throw null;
        }
        if (coercionActionN == CoercionAction.f341462d) {
            return null;
        }
        return coercionActionN == CoercionAction.f341463e ? l(fVar) : t0(fVar);
    }

    public Object t0(com.fasterxml.jackson.databind.f fVar) {
        return null;
    }

    public boolean u0() {
        return true;
    }
}
