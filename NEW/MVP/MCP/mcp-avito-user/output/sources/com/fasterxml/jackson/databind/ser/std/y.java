package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.ser.std.x;
import java.math.BigDecimal;
import rX0.InterfaceC47610a;

/* compiled from: NumberSerializers.java */
/* loaded from: classes4.dex */
public class y {

    /* compiled from: NumberSerializers.java */
    public static /* synthetic */ class a {
        static {
            try {
                new int[JsonFormat.Shape.values().length][8] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: NumberSerializers.java */
    public static abstract class b<T> extends L<T> implements com.fasterxml.jackson.databind.ser.j {
        public b() {
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.ser.j
        public final com.fasterxml.jackson.databind.l<?> a(com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.c cVar) {
            Class<T> cls = this.f342353b;
            JsonFormat.b bVarL = M.l(a12, cVar, cls);
            if (bVarL == null || bVarL.f340948c.ordinal() != 8) {
                return this;
            }
            if (cls != BigDecimal.class) {
                return Q.f342354d;
            }
            x xVar = x.f342414d;
            return x.b.f342415d;
        }
    }

    /* compiled from: NumberSerializers.java */
    @InterfaceC47610a
    public static class c extends b<Object> {
        public c() {
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.I(((Double) obj).doubleValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
        public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
            Double d12 = (Double) obj;
            double dDoubleValue = d12.doubleValue();
            String str = com.fasterxml.jackson.core.io.k.f341181a;
            if (!Double.isNaN(dDoubleValue) && !Double.isInfinite(dDoubleValue)) {
                jsonGenerator.I(d12.doubleValue());
                return;
            }
            WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_NUMBER_FLOAT, obj));
            jsonGenerator.I(d12.doubleValue());
            oVar.f(jsonGenerator, writableTypeIdE);
        }
    }

    /* compiled from: NumberSerializers.java */
    @InterfaceC47610a
    public static class d extends b<Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final d f342416d = new d();

        public d() {
            super(Float.class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.J(((Float) obj).floatValue());
        }
    }

    /* compiled from: NumberSerializers.java */
    @InterfaceC47610a
    public static class e extends b<Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final e f342417d = new e();

        public e() {
            super(Number.class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.L(((Number) obj).intValue());
        }
    }

    /* compiled from: NumberSerializers.java */
    @InterfaceC47610a
    public static class f extends b<Object> {
        public f() {
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.L(((Integer) obj).intValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.L, com.fasterxml.jackson.databind.l
        public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
            f(obj, jsonGenerator, a12);
        }
    }

    /* compiled from: NumberSerializers.java */
    @InterfaceC47610a
    public static class g extends b<Object> {
        public g() {
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.M(((Long) obj).longValue());
        }
    }

    /* compiled from: NumberSerializers.java */
    @InterfaceC47610a
    public static class h extends b<Object> {

        /* renamed from: d, reason: collision with root package name */
        public static final h f342418d = new h();

        public h() {
            super(Short.class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            jsonGenerator.Q(((Short) obj).shortValue());
        }
    }
}
