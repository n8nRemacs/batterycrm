package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C36496b;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import rX0.InterfaceC47610a;

/* compiled from: PrimitiveArrayDeserializers.java */
/* loaded from: classes4.dex */
public abstract class y<T> extends C<T> implements com.fasterxml.jackson.databind.deser.i {

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f341876e;

    /* renamed from: f, reason: collision with root package name */
    public transient Object f341877f;

    /* renamed from: g, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.s f341878g;

    /* compiled from: PrimitiveArrayDeserializers.java */
    @InterfaceC47610a
    public static final class a extends y<boolean[]> {
        private static final long serialVersionUID = 1;

        public a() {
            super(boolean[].class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
            boolean zP2;
            int i12;
            if (!jsonParser.b0()) {
                return t0(jsonParser, fVar);
            }
            C36496b c36496bV = fVar.v();
            if (c36496bV.f342582a == null) {
                c36496bV.f342582a = new C36496b.C10548b();
            }
            C36496b.C10548b c10548b = c36496bV.f342582a;
            boolean[] zArrD = c10548b.d();
            int i13 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (boolean[]) c10548b.c(i13, zArrD);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_TRUE) {
                            zP2 = true;
                        } else {
                            if (jsonTokenG0 != JsonToken.VALUE_FALSE) {
                                if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                                    com.fasterxml.jackson.databind.deser.s sVar = this.f341878g;
                                    if (sVar != null) {
                                        sVar.d(fVar);
                                    } else {
                                        e0(fVar);
                                    }
                                } else {
                                    zP2 = P(jsonParser, fVar);
                                }
                            }
                            zP2 = false;
                        }
                        zArrD[i13] = zP2;
                        i13 = i12;
                    } catch (Exception e12) {
                        e = e12;
                        i13 = i12;
                        throw JsonMappingException.i(e, zArrD, c10548b.f342642d + i13);
                    }
                    if (i13 >= zArrD.length) {
                        boolean[] zArr = (boolean[]) c10548b.b(i13, zArrD);
                        i13 = 0;
                        zArrD = zArr;
                    }
                    i12 = i13 + 1;
                } catch (Exception e13) {
                    e = e13;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final boolean[] q0(boolean[] zArr, boolean[] zArr2) {
            boolean[] zArr3 = zArr;
            boolean[] zArr4 = zArr2;
            int length = zArr3.length;
            int length2 = zArr4.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr3, length + length2);
            System.arraycopy(zArr4, 0, zArrCopyOf, length, length2);
            return zArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final boolean[] r0() {
            return new boolean[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final boolean[] u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return new boolean[]{P(jsonParser, fVar)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
            return new a(this, sVar, bool);
        }
    }

    /* compiled from: PrimitiveArrayDeserializers.java */
    @InterfaceC47610a
    public static final class b extends y<byte[]> {
        private static final long serialVersionUID = 1;

        public b() {
            super(byte[].class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
            byte bJ2;
            int i12;
            JsonToken jsonTokenF = jsonParser.f();
            if (jsonTokenF == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.i(fVar.f341921d.f341506c.f341481i);
                } catch (StreamReadException e12) {
                    String strB = e12.b();
                    if (strB.contains("base64")) {
                        fVar.I(byte[].class, jsonParser.L(), strB, new Object[0]);
                        throw null;
                    }
                }
            }
            if (jsonTokenF == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objX = jsonParser.x();
                if (objX == null) {
                    return null;
                }
                if (objX instanceof byte[]) {
                    return (byte[]) objX;
                }
            }
            if (!jsonParser.b0()) {
                return t0(jsonParser, fVar);
            }
            C36496b c36496bV = fVar.v();
            if (c36496bV.f342583b == null) {
                c36496bV.f342583b = new C36496b.c();
            }
            C36496b.c cVar = c36496bV.f342583b;
            byte[] bArrD = cVar.d();
            int i13 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (byte[]) cVar.c(i13, bArrD);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_NUMBER_INT) {
                            bJ2 = jsonParser.j();
                        } else if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                            com.fasterxml.jackson.databind.deser.s sVar = this.f341878g;
                            if (sVar != null) {
                                sVar.d(fVar);
                            } else {
                                e0(fVar);
                                bJ2 = 0;
                            }
                        } else {
                            bJ2 = Q(jsonParser, fVar);
                        }
                        bArrD[i13] = bJ2;
                        i13 = i12;
                    } catch (Exception e13) {
                        e = e13;
                        i13 = i12;
                        throw JsonMappingException.i(e, bArrD, cVar.f342642d + i13);
                    }
                    if (i13 >= bArrD.length) {
                        byte[] bArr = (byte[]) cVar.b(i13, bArrD);
                        i13 = 0;
                        bArrD = bArr;
                    }
                    i12 = i13 + 1;
                } catch (Exception e14) {
                    e = e14;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y, com.fasterxml.jackson.databind.i
        public final LogicalType q() {
            return LogicalType.f342442l;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final byte[] q0(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            int length = bArr3.length;
            int length2 = bArr4.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + length2);
            System.arraycopy(bArr4, 0, bArrCopyOf, length, length2);
            return bArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final byte[] r0() {
            return new byte[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final byte[] u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            JsonToken jsonTokenF = jsonParser.f();
            if (jsonTokenF == JsonToken.VALUE_NUMBER_INT) {
                return new byte[]{jsonParser.j()};
            }
            if (jsonTokenF != JsonToken.VALUE_NULL) {
                fVar.E(this.f341716b.getComponentType(), jsonParser);
                throw null;
            }
            com.fasterxml.jackson.databind.deser.s sVar = this.f341878g;
            if (sVar != null) {
                sVar.d(fVar);
                return (byte[]) l(fVar);
            }
            e0(fVar);
            return null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
            return new b(this, sVar, bool);
        }
    }

    /* compiled from: PrimitiveArrayDeserializers.java */
    @InterfaceC47610a
    public static final class d extends y<double[]> {
        private static final long serialVersionUID = 1;

        public d() {
            super(double[].class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
            com.fasterxml.jackson.databind.deser.s sVar;
            if (!jsonParser.b0()) {
                return t0(jsonParser, fVar);
            }
            C36496b c36496bV = fVar.v();
            if (c36496bV.f342588g == null) {
                c36496bV.f342588g = new C36496b.d();
            }
            C36496b.d dVar = c36496bV.f342588g;
            double[] dArr = (double[]) dVar.d();
            int i12 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (double[]) dVar.c(i12, dArr);
                    }
                    if (jsonTokenG0 != JsonToken.VALUE_NULL || (sVar = this.f341878g) == null) {
                        double dT2 = T(jsonParser, fVar);
                        if (i12 >= dArr.length) {
                            double[] dArr2 = (double[]) dVar.b(i12, dArr);
                            i12 = 0;
                            dArr = dArr2;
                        }
                        int i13 = i12 + 1;
                        try {
                            dArr[i12] = dT2;
                            i12 = i13;
                        } catch (Exception e12) {
                            e = e12;
                            i12 = i13;
                            throw JsonMappingException.i(e, dArr, dVar.f342642d + i12);
                        }
                    } else {
                        sVar.d(fVar);
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final double[] q0(double[] dArr, double[] dArr2) {
            double[] dArr3 = dArr;
            double[] dArr4 = dArr2;
            int length = dArr3.length;
            int length2 = dArr4.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr3, length + length2);
            System.arraycopy(dArr4, 0, dArrCopyOf, length, length2);
            return dArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final double[] r0() {
            return new double[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final double[] u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return new double[]{T(jsonParser, fVar)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
            return new d(this, sVar, bool);
        }
    }

    /* compiled from: PrimitiveArrayDeserializers.java */
    @InterfaceC47610a
    public static final class e extends y<float[]> {
        private static final long serialVersionUID = 1;

        public e() {
            super(float[].class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
            com.fasterxml.jackson.databind.deser.s sVar;
            if (!jsonParser.b0()) {
                return t0(jsonParser, fVar);
            }
            C36496b c36496bV = fVar.v();
            if (c36496bV.f342587f == null) {
                c36496bV.f342587f = new C36496b.e();
            }
            C36496b.e eVar = c36496bV.f342587f;
            float[] fArr = (float[]) eVar.d();
            int i12 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (float[]) eVar.c(i12, fArr);
                    }
                    if (jsonTokenG0 != JsonToken.VALUE_NULL || (sVar = this.f341878g) == null) {
                        float fU2 = U(jsonParser, fVar);
                        if (i12 >= fArr.length) {
                            float[] fArr2 = (float[]) eVar.b(i12, fArr);
                            i12 = 0;
                            fArr = fArr2;
                        }
                        int i13 = i12 + 1;
                        try {
                            fArr[i12] = fU2;
                            i12 = i13;
                        } catch (Exception e12) {
                            e = e12;
                            i12 = i13;
                            throw JsonMappingException.i(e, fArr, eVar.f342642d + i12);
                        }
                    } else {
                        sVar.d(fVar);
                    }
                } catch (Exception e13) {
                    e = e13;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final float[] q0(float[] fArr, float[] fArr2) {
            float[] fArr3 = fArr;
            float[] fArr4 = fArr2;
            int length = fArr3.length;
            int length2 = fArr4.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr3, length + length2);
            System.arraycopy(fArr4, 0, fArrCopyOf, length, length2);
            return fArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final float[] r0() {
            return new float[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final float[] u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return new float[]{U(jsonParser, fVar)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
            return new e(this, sVar, bool);
        }
    }

    /* compiled from: PrimitiveArrayDeserializers.java */
    @InterfaceC47610a
    public static final class f extends y<int[]> {

        /* renamed from: h, reason: collision with root package name */
        public static final f f341879h = new f();
        private static final long serialVersionUID = 1;

        public f() {
            super(int[].class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
            int iZ2;
            int i12;
            if (!jsonParser.b0()) {
                return t0(jsonParser, fVar);
            }
            C36496b c36496bV = fVar.v();
            if (c36496bV.f342585d == null) {
                c36496bV.f342585d = new C36496b.f();
            }
            C36496b.f fVar2 = c36496bV.f342585d;
            int[] iArr = (int[]) fVar2.d();
            int i13 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (int[]) fVar2.c(i13, iArr);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_NUMBER_INT) {
                            iZ2 = jsonParser.z();
                        } else if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                            com.fasterxml.jackson.databind.deser.s sVar = this.f341878g;
                            if (sVar != null) {
                                sVar.d(fVar);
                            } else {
                                e0(fVar);
                                iZ2 = 0;
                            }
                        } else {
                            iZ2 = V(jsonParser, fVar);
                        }
                        iArr[i13] = iZ2;
                        i13 = i12;
                    } catch (Exception e12) {
                        e = e12;
                        i13 = i12;
                        throw JsonMappingException.i(e, iArr, fVar2.f342642d + i13);
                    }
                    if (i13 >= iArr.length) {
                        int[] iArr2 = (int[]) fVar2.b(i13, iArr);
                        i13 = 0;
                        iArr = iArr2;
                    }
                    i12 = i13 + 1;
                } catch (Exception e13) {
                    e = e13;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final int[] q0(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int length = iArr3.length;
            int length2 = iArr4.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr3, length + length2);
            System.arraycopy(iArr4, 0, iArrCopyOf, length, length2);
            return iArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final int[] r0() {
            return new int[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final int[] u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return new int[]{V(jsonParser, fVar)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
            return new f(this, sVar, bool);
        }
    }

    /* compiled from: PrimitiveArrayDeserializers.java */
    @InterfaceC47610a
    public static final class g extends y<long[]> {

        /* renamed from: h, reason: collision with root package name */
        public static final g f341880h = new g();
        private static final long serialVersionUID = 1;

        public g() {
            super(long[].class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
            long jA2;
            int i12;
            if (!jsonParser.b0()) {
                return t0(jsonParser, fVar);
            }
            C36496b c36496bV = fVar.v();
            if (c36496bV.f342586e == null) {
                c36496bV.f342586e = new C36496b.g();
            }
            C36496b.g gVar = c36496bV.f342586e;
            long[] jArr = (long[]) gVar.d();
            int i13 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (long[]) gVar.c(i13, jArr);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_NUMBER_INT) {
                            jA2 = jsonParser.A();
                        } else if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                            com.fasterxml.jackson.databind.deser.s sVar = this.f341878g;
                            if (sVar != null) {
                                sVar.d(fVar);
                            } else {
                                e0(fVar);
                                jA2 = 0;
                            }
                        } else {
                            jA2 = Z(jsonParser, fVar);
                        }
                        jArr[i13] = jA2;
                        i13 = i12;
                    } catch (Exception e12) {
                        e = e12;
                        i13 = i12;
                        throw JsonMappingException.i(e, jArr, gVar.f342642d + i13);
                    }
                    if (i13 >= jArr.length) {
                        long[] jArr2 = (long[]) gVar.b(i13, jArr);
                        i13 = 0;
                        jArr = jArr2;
                    }
                    i12 = i13 + 1;
                } catch (Exception e13) {
                    e = e13;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final long[] q0(long[] jArr, long[] jArr2) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int length = jArr3.length;
            int length2 = jArr4.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr3, length + length2);
            System.arraycopy(jArr4, 0, jArrCopyOf, length, length2);
            return jArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final long[] r0() {
            return new long[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final long[] u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return new long[]{Z(jsonParser, fVar)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
            return new g(this, sVar, bool);
        }
    }

    /* compiled from: PrimitiveArrayDeserializers.java */
    @InterfaceC47610a
    public static final class h extends y<short[]> {
        private static final long serialVersionUID = 1;

        public h() {
            super(short[].class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonMappingException {
            short sA02;
            int i12;
            if (!jsonParser.b0()) {
                return t0(jsonParser, fVar);
            }
            C36496b c36496bV = fVar.v();
            if (c36496bV.f342584c == null) {
                c36496bV.f342584c = new C36496b.h();
            }
            C36496b.h hVar = c36496bV.f342584c;
            short[] sArrD = hVar.d();
            int i13 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenG0 = jsonParser.g0();
                    if (jsonTokenG0 == JsonToken.END_ARRAY) {
                        return (short[]) hVar.c(i13, sArrD);
                    }
                    try {
                        if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                            com.fasterxml.jackson.databind.deser.s sVar = this.f341878g;
                            if (sVar != null) {
                                sVar.d(fVar);
                            } else {
                                e0(fVar);
                                sA02 = 0;
                            }
                        } else {
                            sA02 = a0(jsonParser, fVar);
                        }
                        sArrD[i13] = sA02;
                        i13 = i12;
                    } catch (Exception e12) {
                        e = e12;
                        i13 = i12;
                        throw JsonMappingException.i(e, sArrD, hVar.f342642d + i13);
                    }
                    if (i13 >= sArrD.length) {
                        short[] sArr = (short[]) hVar.b(i13, sArrD);
                        i13 = 0;
                        sArrD = sArr;
                    }
                    i12 = i13 + 1;
                } catch (Exception e13) {
                    e = e13;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final short[] q0(short[] sArr, short[] sArr2) {
            short[] sArr3 = sArr;
            short[] sArr4 = sArr2;
            int length = sArr3.length;
            int length2 = sArr4.length;
            short[] sArrCopyOf = Arrays.copyOf(sArr3, length + length2);
            System.arraycopy(sArr4, 0, sArrCopyOf, length, length2);
            return sArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final short[] r0() {
            return new short[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final short[] u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) {
            return new short[]{a0(jsonParser, fVar)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
            return new h(this, sVar, bool);
        }
    }

    public y(Class<T> cls) {
        super((Class<?>) cls);
        this.f341876e = null;
        this.f341878g = null;
    }

    public static y s0(Class cls) {
        if (cls == Integer.TYPE) {
            return f.f341879h;
        }
        if (cls == Long.TYPE) {
            return g.f341880h;
        }
        if (cls == Byte.TYPE) {
            return new b();
        }
        if (cls == Short.TYPE) {
            return new h();
        }
        if (cls == Float.TYPE) {
            return new e();
        }
        if (cls == Double.TYPE) {
            return new d();
        }
        if (cls == Boolean.TYPE) {
            return new a();
        }
        if (cls == Character.TYPE) {
            return new c();
        }
        throw new IllegalStateException();
    }

    @Override // com.fasterxml.jackson.databind.deser.i
    public final com.fasterxml.jackson.databind.i<?> a(com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.c cVar) {
        JsonFormat.Feature feature = JsonFormat.Feature.f340927b;
        Class<?> cls = this.f341716b;
        Boolean boolI0 = C.i0(fVar, cVar, cls, feature);
        Nulls nulls = cVar != null ? cVar.getMetadata().f342521h : fVar.f341921d.f341514h.f341489c.f341001c;
        com.fasterxml.jackson.databind.deser.s rVar = nulls == Nulls.f340979b ? com.fasterxml.jackson.databind.deser.impl.q.f341662c : nulls == Nulls.f340980c ? cVar == null ? new com.fasterxml.jackson.databind.deser.impl.r(null, fVar.l(cls.getComponentType())) : new com.fasterxml.jackson.databind.deser.impl.r(cVar.c(), cVar.getType().n()) : null;
        return (Objects.equals(boolI0, this.f341876e) && rVar == this.f341878g) ? this : v0(rVar, boolI0);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final T f(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, T t12) {
        T tE2 = e(jsonParser, fVar);
        return (t12 == null || Array.getLength(t12) == 0) ? tE2 : q0(t12, tE2);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.c(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.i
    public final AccessPattern k() {
        return AccessPattern.f342525c;
    }

    @Override // com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        Object obj = this.f341877f;
        if (obj != null) {
            return obj;
        }
        T tR02 = r0();
        this.f341877f = tR02;
        return tR02;
    }

    @Override // com.fasterxml.jackson.databind.i
    public LogicalType q() {
        return LogicalType.f342432b;
    }

    public abstract T q0(T t12, T t13);

    @Override // com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.TRUE;
    }

    public abstract T r0();

    public final T t0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
        if (jsonParser.Y(JsonToken.VALUE_STRING)) {
            return G(jsonParser, fVar);
        }
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.f341876e;
        if (bool2 == bool || (bool2 == null && fVar.O(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return u0(jsonParser, fVar);
        }
        fVar.E(this.f341716b, jsonParser);
        throw null;
    }

    public abstract T u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar);

    public abstract y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool);

    public y(y<?> yVar, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        super(yVar.f341716b);
        this.f341876e = bool;
        this.f341878g = sVar;
    }

    /* compiled from: PrimitiveArrayDeserializers.java */
    @InterfaceC47610a
    public static final class c extends y<char[]> {
        private static final long serialVersionUID = 1;

        public c() {
            super(char[].class);
        }

        @Override // com.fasterxml.jackson.databind.i
        public final Object e(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            String strL;
            if (jsonParser.Y(JsonToken.VALUE_STRING)) {
                char[] cArrM = jsonParser.M();
                int iO2 = jsonParser.O();
                int iN2 = jsonParser.N();
                char[] cArr = new char[iN2];
                System.arraycopy(cArrM, iO2, cArr, 0, iN2);
                return cArr;
            }
            if (!jsonParser.b0()) {
                if (jsonParser.Y(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object objX = jsonParser.x();
                    if (objX == null) {
                        return null;
                    }
                    if (objX instanceof char[]) {
                        return (char[]) objX;
                    }
                    if (objX instanceof String) {
                        return ((String) objX).toCharArray();
                    }
                    if (objX instanceof byte[]) {
                        return com.fasterxml.jackson.core.a.f341119b.e((byte[]) objX).toCharArray();
                    }
                }
                fVar.E(this.f341716b, jsonParser);
                throw null;
            }
            StringBuilder sb2 = new StringBuilder(64);
            while (true) {
                JsonToken jsonTokenG0 = jsonParser.g0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    return sb2.toString().toCharArray();
                }
                if (jsonTokenG0 == JsonToken.VALUE_STRING) {
                    strL = jsonParser.L();
                } else {
                    if (jsonTokenG0 != JsonToken.VALUE_NULL) {
                        fVar.E(Character.TYPE, jsonParser);
                        throw null;
                    }
                    com.fasterxml.jackson.databind.deser.s sVar = this.f341878g;
                    if (sVar != null) {
                        sVar.d(fVar);
                    } else {
                        e0(fVar);
                        strL = "\u0000";
                    }
                }
                if (strL.length() != 1) {
                    fVar.V(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(strL.length()));
                    throw null;
                }
                sb2.append(strL.charAt(0));
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final char[] q0(char[] cArr, char[] cArr2) {
            char[] cArr3 = cArr;
            char[] cArr4 = cArr2;
            int length = cArr3.length;
            int length2 = cArr4.length;
            char[] cArrCopyOf = Arrays.copyOf(cArr3, length + length2);
            System.arraycopy(cArr4, 0, cArrCopyOf, length, length2);
            return cArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final char[] r0() {
            return new char[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final char[] u0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws MismatchedInputException {
            fVar.E(this.f341716b, jsonParser);
            throw null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.y
        public final y<?> v0(com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
            return this;
        }
    }
}
