package com.google.protobuf;

import com.google.protobuf.C37670d0;
import com.google.protobuf.C37678h0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC37707w0;
import com.google.protobuf.V.c;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: FieldSet.java */
/* loaded from: classes7.dex */
final class V<T extends c<T>> {

    /* renamed from: d, reason: collision with root package name */
    public static final V f362768d;

    /* renamed from: a, reason: collision with root package name */
    public final X0<T, Object> f362769a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f362770b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f362771c;

    /* compiled from: FieldSet.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362772a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f362773b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f362773b = iArr;
            try {
                iArr[WireFormat.FieldType.f362789d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362773b[WireFormat.FieldType.f362790e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362773b[WireFormat.FieldType.f362791f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362773b[WireFormat.FieldType.f362792g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362773b[WireFormat.FieldType.f362793h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362773b[WireFormat.FieldType.f362794i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362773b[WireFormat.FieldType.f362795j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f362773b[WireFormat.FieldType.f362796k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f362773b[WireFormat.FieldType.f362798m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f362773b[WireFormat.FieldType.f362799n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f362773b[WireFormat.FieldType.f362797l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f362773b[WireFormat.FieldType.f362800o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f362773b[WireFormat.FieldType.f362801p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f362773b[WireFormat.FieldType.f362803r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f362773b[WireFormat.FieldType.f362804s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f362773b[WireFormat.FieldType.f362805t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f362773b[WireFormat.FieldType.f362806u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f362773b[WireFormat.FieldType.f362802q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f362772a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f362772a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f362772a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f362772a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f362772a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f362772a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f362772a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f362772a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f362772a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    public static final class b<T extends c<T>> {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            int i12 = X0.f362827i;
            new W0(16, null);
        }
    }

    /* compiled from: FieldSet.java */
    public interface c<T extends c<T>> extends Comparable<T> {
        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();

        GeneratedMessageLite.b x0(InterfaceC37707w0.a aVar, InterfaceC37707w0 interfaceC37707w0);
    }

    static {
        V v12 = new V(new W0(0, null));
        v12.n();
        f362768d = v12;
    }

    public /* synthetic */ V(X0 x02, a aVar) {
        this(x02);
    }

    public static int c(WireFormat.FieldType fieldType, int i12, Object obj) {
        int iB2 = CodedOutputStream.B(i12);
        if (fieldType == WireFormat.FieldType.f362798m) {
            iB2 *= 2;
        }
        return iB2 + d(fieldType, obj);
    }

    public static int d(WireFormat.FieldType fieldType, Object obj) {
        switch (a.f362773b[fieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f362603b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f362603b;
                return 4;
            case 3:
                return CodedOutputStream.F(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.F(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.s(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.f362603b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f362603b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f362603b;
                return 1;
            case 9:
                Logger logger6 = CodedOutputStream.f362603b;
                return ((InterfaceC37707w0) obj).getSerializedSize();
            case 10:
                if (obj instanceof C37678h0) {
                    return CodedOutputStream.u((C37678h0) obj);
                }
                Logger logger7 = CodedOutputStream.f362603b;
                int serializedSize = ((InterfaceC37707w0) obj).getSerializedSize();
                return CodedOutputStream.D(serializedSize) + serializedSize;
            case 11:
                return obj instanceof AbstractC37700t ? CodedOutputStream.k((AbstractC37700t) obj) : CodedOutputStream.A((String) obj);
            case 12:
                if (obj instanceof AbstractC37700t) {
                    return CodedOutputStream.k((AbstractC37700t) obj);
                }
                Logger logger8 = CodedOutputStream.f362603b;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.D(length) + length;
            case 13:
                return CodedOutputStream.D(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = CodedOutputStream.f362603b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = CodedOutputStream.f362603b;
                return 8;
            case 16:
                return CodedOutputStream.D(CodedOutputStream.G(((Integer) obj).intValue()));
            case 17:
                return CodedOutputStream.F(CodedOutputStream.H(((Long) obj).longValue()));
            case 18:
                return obj instanceof C37670d0.c ? CodedOutputStream.s(((C37670d0.c) obj).getNumber()) : CodedOutputStream.s(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(c<?> cVar, Object obj) {
        WireFormat.FieldType liteType = cVar.getLiteType();
        int number = cVar.getNumber();
        if (!cVar.isRepeated()) {
            return c(liteType, number, obj);
        }
        List list = (List) obj;
        int iC2 = 0;
        if (!cVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iC2 += c(liteType, number, it.next());
            }
            return iC2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iC2 += d(liteType, it2.next());
        }
        return CodedOutputStream.D(iC2) + CodedOutputStream.B(number) + iC2;
    }

    public static int h(Map.Entry entry) {
        c cVar = (c) entry.getKey();
        Object value = entry.getValue();
        if (cVar.getLiteJavaType() != WireFormat.JavaType.MESSAGE || cVar.isRepeated() || cVar.isPacked()) {
            return e(cVar, value);
        }
        if (value instanceof C37678h0) {
            int number = ((c) entry.getKey()).getNumber();
            return CodedOutputStream.u((C37678h0) value) + CodedOutputStream.B(3) + CodedOutputStream.C(2, number) + (CodedOutputStream.B(1) * 2);
        }
        int number2 = ((c) entry.getKey()).getNumber();
        int iC2 = CodedOutputStream.C(2, number2) + (CodedOutputStream.B(1) * 2);
        int iB2 = CodedOutputStream.B(3);
        int serializedSize = ((InterfaceC37707w0) value).getSerializedSize();
        return com.google.firebase.components.g.h(serializedSize, serializedSize, iB2, iC2);
    }

    public static <T extends c<T>> boolean l(Map.Entry<T, Object> entry) {
        boolean zIsInitialized;
        T key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (!key.isRepeated()) {
                Object value = entry.getValue();
                if (value instanceof InterfaceC37709x0) {
                    return ((InterfaceC37709x0) value).isInitialized();
                }
                if (value instanceof C37678h0) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof InterfaceC37709x0) {
                    zIsInitialized = ((InterfaceC37709x0) obj).isInitialized();
                } else {
                    if (!(obj instanceof C37678h0)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zIsInitialized = true;
                }
                if (!zIsInitialized) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void r(com.google.protobuf.V.c r3, java.lang.Object r4) {
        /*
            com.google.protobuf.WireFormat$FieldType r0 = r3.getLiteType()
            java.nio.charset.Charset r1 = com.google.protobuf.C37670d0.f362857a
            r4.getClass()
            com.google.protobuf.WireFormat$JavaType r0 = r0.f362808b
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L42;
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L2a;
                case 7: goto L21;
                case 8: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r0 = r4 instanceof com.google.protobuf.InterfaceC37707w0
            if (r0 != 0) goto L1f
            boolean r0 = r4 instanceof com.google.protobuf.C37678h0
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            r2 = r1
            goto L44
        L21:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L1f
            boolean r0 = r4 instanceof com.google.protobuf.C37670d0.c
            if (r0 == 0) goto L1e
            goto L1f
        L2a:
            boolean r0 = r4 instanceof com.google.protobuf.AbstractC37700t
            if (r0 != 0) goto L1f
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L1e
            goto L1f
        L33:
            boolean r2 = r4 instanceof java.lang.String
            goto L44
        L36:
            boolean r2 = r4 instanceof java.lang.Boolean
            goto L44
        L39:
            boolean r2 = r4 instanceof java.lang.Double
            goto L44
        L3c:
            boolean r2 = r4 instanceof java.lang.Float
            goto L44
        L3f:
            boolean r2 = r4 instanceof java.lang.Long
            goto L44
        L42:
            boolean r2 = r4 instanceof java.lang.Integer
        L44:
            if (r2 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.getNumber()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.protobuf.WireFormat$FieldType r3 = r3.getLiteType()
            com.google.protobuf.WireFormat$JavaType r3 = r3.f362808b
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V.r(com.google.protobuf.V$c, java.lang.Object):void");
    }

    public static void s(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i12, Object obj) {
        if (fieldType == WireFormat.FieldType.f362798m) {
            codedOutputStream.W(i12, 3);
            ((InterfaceC37707w0) obj).writeTo(codedOutputStream);
            codedOutputStream.W(i12, 4);
            return;
        }
        codedOutputStream.W(i12, fieldType.f362809c);
        switch (a.f362773b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.O(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                codedOutputStream.N(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                codedOutputStream.Y(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.Y(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.P(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.O(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.N(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.K(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((InterfaceC37707w0) obj).writeTo(codedOutputStream);
                break;
            case 10:
                codedOutputStream.S((InterfaceC37707w0) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC37700t)) {
                    codedOutputStream.V((String) obj);
                    break;
                } else {
                    codedOutputStream.M((AbstractC37700t) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC37700t)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.L(bArr.length, bArr);
                    break;
                } else {
                    codedOutputStream.M((AbstractC37700t) obj);
                    break;
                }
            case 13:
                codedOutputStream.X(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.N(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.O(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.X(CodedOutputStream.G(((Integer) obj).intValue()));
                break;
            case 17:
                codedOutputStream.Y(CodedOutputStream.H(((Long) obj).longValue()));
                break;
            case 18:
                if (!(obj instanceof C37670d0.c)) {
                    codedOutputStream.P(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.P(((C37670d0.c) obj).getNumber());
                    break;
                }
        }
    }

    public final void a(T t12, Object obj) {
        List arrayList;
        if (!t12.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        r(t12, obj);
        Object objF = f(t12);
        if (objF == null) {
            arrayList = new ArrayList();
            this.f362769a.put(t12, arrayList);
        } else {
            arrayList = (List) objF;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final V<T> clone() {
        X0<T, Object> x02;
        V<T> v12 = new V<>();
        int i12 = 0;
        while (true) {
            x02 = this.f362769a;
            if (i12 >= x02.f362829c.size()) {
                break;
            }
            Map.Entry<K, Object> entryC = x02.c(i12);
            v12.q((c) entryC.getKey(), entryC.getValue());
            i12++;
        }
        Iterator it = x02.d().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            v12.q((c) entry.getKey(), entry.getValue());
        }
        v12.f362771c = this.f362771c;
        return v12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof V) {
            return this.f362769a.equals(((V) obj).f362769a);
        }
        return false;
    }

    public final Object f(T t12) {
        Object obj = this.f362769a.get(t12);
        return obj instanceof C37678h0 ? ((C37678h0) obj).a(null) : obj;
    }

    public final int g() {
        X0<T, Object> x02;
        int i12 = 0;
        int iH2 = 0;
        while (true) {
            x02 = this.f362769a;
            if (i12 >= x02.f362829c.size()) {
                break;
            }
            iH2 += h(x02.c(i12));
            i12++;
        }
        Iterator it = x02.d().iterator();
        while (it.hasNext()) {
            iH2 += h((Map.Entry) it.next());
        }
        return iH2;
    }

    public final int hashCode() {
        return this.f362769a.hashCode();
    }

    public final int i() {
        X0<T, Object> x02;
        int i12 = 0;
        int iE2 = 0;
        while (true) {
            x02 = this.f362769a;
            if (i12 >= x02.f362829c.size()) {
                break;
            }
            Map.Entry<K, Object> entryC = x02.c(i12);
            iE2 += e((c) entryC.getKey(), entryC.getValue());
            i12++;
        }
        Iterator it = x02.d().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iE2 += e((c) entry.getKey(), entry.getValue());
        }
        return iE2;
    }

    public final boolean j() {
        return this.f362769a.isEmpty();
    }

    public final boolean k() {
        int i12 = 0;
        while (true) {
            X0<T, Object> x02 = this.f362769a;
            if (i12 >= x02.f362829c.size()) {
                Iterator it = x02.d().iterator();
                while (it.hasNext()) {
                    if (!l((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!l(x02.c(i12))) {
                return false;
            }
            i12++;
        }
    }

    public final Iterator<Map.Entry<T, Object>> m() {
        boolean z12 = this.f362771c;
        X0<T, Object> x02 = this.f362769a;
        return z12 ? new C37678h0.c(x02.entrySet().iterator()) : x02.entrySet().iterator();
    }

    public final void n() {
        if (this.f362770b) {
            return;
        }
        int i12 = 0;
        while (true) {
            X0<T, Object> x02 = this.f362769a;
            if (i12 >= x02.f362829c.size()) {
                x02.f();
                this.f362770b = true;
                return;
            } else {
                Map.Entry<K, Object> entryC = x02.c(i12);
                if (entryC.getValue() instanceof GeneratedMessageLite) {
                    ((GeneratedMessageLite) entryC.getValue()).makeImmutable();
                }
                i12++;
            }
        }
    }

    public final void o(V<T> v12) {
        X0<T, Object> x02;
        int i12 = 0;
        while (true) {
            int size = v12.f362769a.f362829c.size();
            x02 = v12.f362769a;
            if (i12 >= size) {
                break;
            }
            p(x02.c(i12));
            i12++;
        }
        Iterator it = x02.d().iterator();
        while (it.hasNext()) {
            p((Map.Entry) it.next());
        }
    }

    public final void p(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C37678h0) {
            value = ((C37678h0) value).a(null);
        }
        boolean zIsRepeated = key.isRepeated();
        X0<T, Object> x02 = this.f362769a;
        if (zIsRepeated) {
            Object objF = f(key);
            if (objF == null) {
                objF = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objF;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            x02.put(key, objF);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            x02.put(key, value);
            return;
        }
        Object objF2 = f(key);
        if (objF2 != null) {
            x02.put(key, key.x0(((InterfaceC37707w0) objF2).toBuilder(), (InterfaceC37707w0) value).c5());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        x02.put(key, value);
    }

    public final void q(T t12, Object obj) {
        if (!t12.isRepeated()) {
            r(t12, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r(t12, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C37678h0) {
            this.f362771c = true;
        }
        this.f362769a.put(t12, obj);
    }

    public V() {
        this.f362769a = new W0(16, null);
    }

    public V(X0<T, Object> x02) {
        this.f362769a = x02;
        n();
    }
}
