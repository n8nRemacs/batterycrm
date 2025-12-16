package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import rX0.InterfaceC47610a;

/* compiled from: NumberSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class x extends L<Number> implements com.fasterxml.jackson.databind.ser.j {

    /* renamed from: d, reason: collision with root package name */
    public static final x f342414d = new x(Number.class);

    /* compiled from: NumberSerializer.java */
    public static /* synthetic */ class a {
        static {
            try {
                new int[JsonFormat.Shape.values().length][8] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: NumberSerializer.java */
    public static final class b extends S {

        /* renamed from: d, reason: collision with root package name */
        public static final b f342415d = new b();

        public b() {
            super(BigDecimal.class, 0);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.S, com.fasterxml.jackson.databind.l
        public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.S, com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) throws JsonMappingException {
            String string;
            if (jsonGenerator.i(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                int iScale = bigDecimal.scale();
                if (iScale < -9999 || iScale > 9999) {
                    throw new JsonMappingException(a12.y(), String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), 9999, 9999), (Throwable) null);
                }
                string = bigDecimal.toPlainString();
            } else {
                string = obj.toString();
            }
            jsonGenerator.i0(string);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.S
        public final String p(Object obj) {
            throw new IllegalStateException();
        }
    }

    public x() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.ser.j
    public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
        Class<T> cls = this.f342353b;
        JsonFormat.b bVarL = M.l(a12, cVar, cls);
        return (bVarL == null || bVarL.f340948c.ordinal() != 8) ? this : cls == BigDecimal.class ? b.f342415d : Q.f342354d;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        Number number = (Number) obj;
        if (number instanceof BigDecimal) {
            jsonGenerator.O((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            jsonGenerator.P((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            jsonGenerator.M(number.longValue());
            return;
        }
        if (number instanceof Double) {
            jsonGenerator.I(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            jsonGenerator.J(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.L(number.intValue());
        } else {
            jsonGenerator.N(number.toString());
        }
    }
}
