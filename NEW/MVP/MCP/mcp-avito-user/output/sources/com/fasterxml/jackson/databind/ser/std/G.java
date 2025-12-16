package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.util.HashMap;
import rX0.InterfaceC47610a;

/* compiled from: StdArraySerializers.java */
/* loaded from: classes4.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap<String, com.fasterxml.jackson.databind.l<?>> f342344a;

    /* compiled from: StdArraySerializers.java */
    @InterfaceC47610a
    public static class b extends M<char[]> {
        public b() {
            super(char[].class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
            return ((char[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            char[] cArr = (char[]) obj;
            if (!a12.f341330b.p(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.j0(cArr, 0, cArr.length);
                return;
            }
            jsonGenerator.b0(cArr.length, cArr);
            int length = cArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                jsonGenerator.j0(cArr, i12, 1);
            }
            jsonGenerator.A();
        }

        @Override // com.fasterxml.jackson.databind.l
        public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
            WritableTypeId writableTypeIdE;
            char[] cArr = (char[]) obj;
            if (a12.f341330b.p(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.START_ARRAY, cArr));
                int length = cArr.length;
                for (int i12 = 0; i12 < length; i12++) {
                    jsonGenerator.j0(cArr, i12, 1);
                }
            } else {
                writableTypeIdE = oVar.e(jsonGenerator, oVar.d(JsonToken.VALUE_STRING, cArr));
                jsonGenerator.j0(cArr, 0, cArr.length);
            }
            oVar.f(jsonGenerator, writableTypeIdE);
        }
    }

    /* compiled from: StdArraySerializers.java */
    @InterfaceC47610a
    public static class d extends h<float[]> {
        static {
            com.fasterxml.jackson.databind.type.n nVar = com.fasterxml.jackson.databind.type.n.f342486e;
            Class cls = Float.TYPE;
            nVar.getClass();
            com.fasterxml.jackson.databind.type.n.o(cls);
        }

        public d() {
            super(float[].class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
            return ((float[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            float[] fArr = (float[]) obj;
            int length = fArr.length;
            int i12 = 0;
            if (length == 1 && r(a12)) {
                int length2 = fArr.length;
                while (i12 < length2) {
                    jsonGenerator.J(fArr[i12]);
                    i12++;
                }
                return;
            }
            jsonGenerator.b0(length, fArr);
            int length3 = fArr.length;
            while (i12 < length3) {
                jsonGenerator.J(fArr[i12]);
                i12++;
            }
            jsonGenerator.A();
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final boolean q(Object obj) {
            return ((float[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
            return new d(this, cVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final void t(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            for (float f12 : (float[]) obj) {
                jsonGenerator.J(f12);
            }
        }
    }

    /* compiled from: StdArraySerializers.java */
    @InterfaceC47610a
    public static class f extends h<long[]> {
        static {
            com.fasterxml.jackson.databind.type.n nVar = com.fasterxml.jackson.databind.type.n.f342486e;
            Class cls = Long.TYPE;
            nVar.getClass();
            com.fasterxml.jackson.databind.type.n.o(cls);
        }

        public f() {
            super(long[].class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
            return ((long[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            long[] jArr = (long[]) obj;
            if (jArr.length != 1 || !r(a12)) {
                jsonGenerator.p(jArr, jArr.length);
                return;
            }
            for (long j12 : jArr) {
                jsonGenerator.M(j12);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final boolean q(Object obj) {
            return ((long[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
            return new f(this, cVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final void t(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            for (long j12 : (long[]) obj) {
                jsonGenerator.M(j12);
            }
        }
    }

    /* compiled from: StdArraySerializers.java */
    @InterfaceC47610a
    public static class g extends h<short[]> {
        static {
            com.fasterxml.jackson.databind.type.n nVar = com.fasterxml.jackson.databind.type.n.f342486e;
            Class cls = Short.TYPE;
            nVar.getClass();
            com.fasterxml.jackson.databind.type.n.o(cls);
        }

        public g() {
            super(short[].class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
            return ((short[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            int i12 = 0;
            if (length == 1 && r(a12)) {
                int length2 = sArr.length;
                while (i12 < length2) {
                    jsonGenerator.L(sArr[i12]);
                    i12++;
                }
                return;
            }
            jsonGenerator.b0(length, sArr);
            int length3 = sArr.length;
            while (i12 < length3) {
                jsonGenerator.L(sArr[i12]);
                i12++;
            }
            jsonGenerator.A();
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final boolean q(Object obj) {
            return ((short[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
            return new g(this, cVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final void t(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            for (short s5 : (short[]) obj) {
                jsonGenerator.L(s5);
            }
        }
    }

    static {
        HashMap<String, com.fasterxml.jackson.databind.l<?>> map = new HashMap<>();
        f342344a = map;
        map.put(boolean[].class.getName(), new a());
        map.put(byte[].class.getName(), new C36480f());
        map.put(char[].class.getName(), new b());
        map.put(short[].class.getName(), new g());
        map.put(int[].class.getName(), new e());
        map.put(long[].class.getName(), new f());
        map.put(float[].class.getName(), new d());
        map.put(double[].class.getName(), new c());
    }

    /* compiled from: StdArraySerializers.java */
    @InterfaceC47610a
    public static class a extends AbstractC36475a<boolean[]> {
        static {
            com.fasterxml.jackson.databind.type.n.f342486e.getClass();
            com.fasterxml.jackson.databind.type.n.o(Boolean.class);
        }

        public a() {
            super(boolean[].class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
            return ((boolean[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            int i12 = 0;
            if (length == 1 && r(a12)) {
                int length2 = zArr.length;
                while (i12 < length2) {
                    jsonGenerator.y(zArr[i12]);
                    i12++;
                }
                return;
            }
            jsonGenerator.b0(length, zArr);
            int length3 = zArr.length;
            while (i12 < length3) {
                jsonGenerator.y(zArr[i12]);
                i12++;
            }
            jsonGenerator.A();
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final boolean q(Object obj) {
            return ((boolean[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
            return new a(this, cVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final void t(boolean[] zArr, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            for (boolean z12 : zArr) {
                jsonGenerator.y(z12);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
            return this;
        }
    }

    /* compiled from: StdArraySerializers.java */
    @InterfaceC47610a
    public static class c extends AbstractC36475a<double[]> {
        static {
            com.fasterxml.jackson.databind.type.n nVar = com.fasterxml.jackson.databind.type.n.f342486e;
            Class cls = Double.TYPE;
            nVar.getClass();
            com.fasterxml.jackson.databind.type.n.o(cls);
        }

        public c() {
            super(double[].class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
            return ((double[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            double[] dArr = (double[]) obj;
            if (dArr.length != 1 || !r(a12)) {
                jsonGenerator.o(dArr, dArr.length);
                return;
            }
            for (double d12 : dArr) {
                jsonGenerator.I(d12);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final boolean q(Object obj) {
            return ((double[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
            return new c(this, cVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final void t(double[] dArr, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            for (double d12 : dArr) {
                jsonGenerator.I(d12);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
            return this;
        }
    }

    /* compiled from: StdArraySerializers.java */
    @InterfaceC47610a
    public static class e extends AbstractC36475a<int[]> {
        static {
            com.fasterxml.jackson.databind.type.n nVar = com.fasterxml.jackson.databind.type.n.f342486e;
            Class cls = Integer.TYPE;
            nVar.getClass();
            com.fasterxml.jackson.databind.type.n.o(cls);
        }

        public e() {
            super(int[].class);
        }

        @Override // com.fasterxml.jackson.databind.l
        public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
            return ((int[]) obj).length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a, com.fasterxml.jackson.databind.l
        public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            int[] iArr = (int[]) obj;
            if (iArr.length != 1 || !r(a12)) {
                jsonGenerator.n(iArr.length, iArr);
                return;
            }
            for (int i12 : iArr) {
                jsonGenerator.L(i12);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final boolean q(Object obj) {
            return ((int[]) obj).length == 1;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final com.fasterxml.jackson.databind.l<?> s(com.fasterxml.jackson.databind.c cVar, Boolean bool) {
            return new e(this, cVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36475a
        public final void t(int[] iArr, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
            for (int i12 : iArr) {
                jsonGenerator.L(i12);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
            return this;
        }
    }

    /* compiled from: StdArraySerializers.java */
    public static abstract class h<T> extends AbstractC36475a<T> {
        public h() {
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.ser.i
        public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
            return this;
        }
    }
}
