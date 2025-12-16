package kotlin.reflect.jvm.internal.impl.protobuf;

import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import kotlin.reflect.jvm.internal.impl.protobuf.g.b;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: FieldSet.java */
/* loaded from: classes8.dex */
final class g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d, reason: collision with root package name */
    public static final g f409352d = new g(0);

    /* renamed from: a, reason: collision with root package name */
    public final t f409353a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f409354b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f409355c;

    /* compiled from: FieldSet.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f409356a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f409357b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f409357b = iArr;
            try {
                iArr[WireFormat.FieldType.f409296d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f409357b[WireFormat.FieldType.f409297e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f409357b[WireFormat.FieldType.f409298f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f409357b[WireFormat.FieldType.f409299g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f409357b[WireFormat.FieldType.f409300h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f409357b[WireFormat.FieldType.f409301i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f409357b[WireFormat.FieldType.f409302j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f409357b[WireFormat.FieldType.f409303k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f409357b[WireFormat.FieldType.f409304l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f409357b[WireFormat.FieldType.f409307o.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f409357b[WireFormat.FieldType.f409308p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f409357b[WireFormat.FieldType.f409310r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f409357b[WireFormat.FieldType.f409311s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f409357b[WireFormat.FieldType.f409312t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f409357b[WireFormat.FieldType.f409313u.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f409357b[WireFormat.FieldType.f409305m.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f409357b[WireFormat.FieldType.f409306n.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f409357b[WireFormat.FieldType.f409309q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f409356a = iArr2;
            try {
                WireFormat.JavaType javaType = WireFormat.JavaType.INT;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                int[] iArr3 = f409356a;
                WireFormat.JavaType javaType2 = WireFormat.JavaType.INT;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                int[] iArr4 = f409356a;
                WireFormat.JavaType javaType3 = WireFormat.JavaType.INT;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                int[] iArr5 = f409356a;
                WireFormat.JavaType javaType4 = WireFormat.JavaType.INT;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                int[] iArr6 = f409356a;
                WireFormat.JavaType javaType5 = WireFormat.JavaType.INT;
                iArr6[4] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                int[] iArr7 = f409356a;
                WireFormat.JavaType javaType6 = WireFormat.JavaType.INT;
                iArr7[5] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f409356a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f409356a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f409356a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    public interface b<T extends b<T>> extends Comparable<T> {
        h.b G2(o.a aVar, o oVar);

        WireFormat.JavaType getLiteJavaType();

        WireFormat.FieldType getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    public g() {
        this.f409355c = false;
        this.f409353a = new t(16, null);
    }

    public static int c(WireFormat.FieldType fieldType, Object obj) throws UnsupportedEncodingException {
        switch (a.f409357b[fieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                return 8;
            case 2:
                ((Float) obj).getClass();
                return 4;
            case 3:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.g(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.c(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                return 8;
            case 7:
                ((Integer) obj).getClass();
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                return 1;
            case 9:
                try {
                    byte[] bytes = ((String) obj).getBytes(Constants.ENCODING);
                    return CodedOutputStream.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e12) {
                    throw new RuntimeException("UTF-8 not supported.", e12);
                }
            case 10:
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return dVar.size() + CodedOutputStream.f(dVar.size());
                }
                byte[] bArr = (byte[]) obj;
                return CodedOutputStream.f(bArr.length) + bArr.length;
            case 11:
                return CodedOutputStream.f(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).getClass();
                return 4;
            case 13:
                ((Long) obj).getClass();
                return 8;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                return CodedOutputStream.f((iIntValue >> 31) ^ (iIntValue << 1));
            case 15:
                long jLongValue = ((Long) obj).longValue();
                return CodedOutputStream.g((jLongValue >> 63) ^ (jLongValue << 1));
            case 16:
                return ((o) obj).getSerializedSize();
            case 17:
                if (!(obj instanceof j)) {
                    return CodedOutputStream.e((o) obj);
                }
                j jVar = (j) obj;
                jVar.getClass();
                int serializedSize = jVar.f409377a.getSerializedSize();
                return CodedOutputStream.f(serializedSize) + serializedSize;
            case 18:
                return obj instanceof i.a ? CodedOutputStream.c(((i.a) obj).getNumber()) : CodedOutputStream.c(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b<?> bVar, Object obj) {
        WireFormat.FieldType liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            int iH2 = CodedOutputStream.h(number);
            if (liteType == WireFormat.FieldType.f409305m) {
                iH2 *= 2;
            }
            return iH2 + c(liteType, obj);
        }
        int iC2 = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iC2 += c(liteType, it.next());
            }
            return CodedOutputStream.f(iC2) + CodedOutputStream.h(number) + iC2;
        }
        for (Object obj2 : (List) obj) {
            int iH3 = CodedOutputStream.h(number);
            if (liteType == WireFormat.FieldType.f409305m) {
                iH3 *= 2;
            }
            iC2 += iH3 + c(liteType, obj2);
        }
        return iC2;
    }

    public static boolean f(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.getLiteJavaType() == WireFormat.JavaType.MESSAGE) {
            if (bVar.isRepeated()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((o) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof o)) {
                    if (value instanceof j) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((o) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Object h(e eVar, WireFormat.FieldType fieldType) {
        switch (a.f409357b[fieldType.ordinal()]) {
            case 1:
                return Double.valueOf(Double.longBitsToDouble(eVar.j()));
            case 2:
                return Float.valueOf(Float.intBitsToFloat(eVar.i()));
            case 3:
                return Long.valueOf(eVar.l());
            case 4:
                return Long.valueOf(eVar.l());
            case 5:
                return Integer.valueOf(eVar.k());
            case 6:
                return Long.valueOf(eVar.j());
            case 7:
                return Integer.valueOf(eVar.i());
            case 8:
                return Boolean.valueOf(eVar.l() != 0);
            case 9:
                int iK2 = eVar.k();
                int i12 = eVar.f409340b;
                int i13 = eVar.f409342d;
                if (iK2 > i12 - i13 || iK2 <= 0) {
                    return iK2 == 0 ? "" : new String(eVar.h(iK2), Constants.ENCODING);
                }
                String str = new String(eVar.f409339a, i13, iK2, Constants.ENCODING);
                eVar.f409342d += iK2;
                return str;
            case 10:
                return eVar.e();
            case 11:
                return Integer.valueOf(eVar.k());
            case 12:
                return Integer.valueOf(eVar.i());
            case 13:
                return Long.valueOf(eVar.j());
            case 14:
                int iK3 = eVar.k();
                return Integer.valueOf((-(iK3 & 1)) ^ (iK3 >>> 1));
            case 15:
                long jL2 = eVar.l();
                return Long.valueOf((-(jL2 & 1)) ^ (jL2 >>> 1));
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType r2, java.lang.Object r3) {
        /*
            r3.getClass()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.f409315b
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L3c;
                case 1: goto L39;
                case 2: goto L36;
                case 3: goto L33;
                case 4: goto L30;
                case 5: goto L2d;
                case 6: goto L24;
                case 7: goto L1b;
                case 8: goto Lf;
                default: goto Le;
            }
        Le:
            goto L3e
        Lf:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.o
            if (r2 != 0) goto L19
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.j
            if (r2 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            r1 = r0
            goto L3e
        L1b:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L19
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i.a
            if (r2 == 0) goto L18
            goto L19
        L24:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.d
            if (r2 != 0) goto L19
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L18
            goto L19
        L2d:
            boolean r1 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r1 = r3 instanceof java.lang.Integer
        L3e:
            if (r1 == 0) goto L41
            return
        L41:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.g.j(kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType, java.lang.Object):void");
    }

    public static void k(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i12, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.f409305m) {
            codedOutputStream.x(i12, 3);
            ((o) obj).a(codedOutputStream);
            codedOutputStream.x(i12, 4);
            return;
        }
        codedOutputStream.x(i12, fieldType.f409316c);
        switch (a.f409357b[fieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                codedOutputStream.w(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.w(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.n(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.u(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.t(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes(Constants.ENCODING);
                codedOutputStream.v(bytes.length);
                codedOutputStream.s(bytes);
                break;
            case 10:
                if (!(obj instanceof d)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(bArr.length);
                    codedOutputStream.s(bArr);
                    break;
                } else {
                    d dVar = (d) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.v(dVar.size());
                    codedOutputStream.r(dVar);
                    break;
                }
            case 11:
                codedOutputStream.v(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.t(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.u(((Long) obj).longValue());
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 15:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 16:
                codedOutputStream.getClass();
                ((o) obj).a(codedOutputStream);
                break;
            case 17:
                codedOutputStream.p((o) obj);
                break;
            case 18:
                if (!(obj instanceof i.a)) {
                    codedOutputStream.n(((Integer) obj).intValue());
                    break;
                } else {
                    codedOutputStream.n(((i.a) obj).getNumber());
                    break;
                }
        }
    }

    public final void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List arrayList;
        if (!((h.f) fielddescriptortype).f409368d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(((h.f) fielddescriptortype).f409367c, obj);
        Object objE = e(fielddescriptortype);
        if (objE == null) {
            arrayList = new ArrayList();
            this.f409353a.put(fielddescriptortype, arrayList);
        } else {
            arrayList = (List) objE;
        }
        arrayList.add(obj);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g<FieldDescriptorType> clone() {
        t tVar;
        g<FieldDescriptorType> gVar = new g<>();
        int i12 = 0;
        while (true) {
            tVar = this.f409353a;
            if (i12 >= tVar.f409406c.size()) {
                break;
            }
            u<K, V>.b bVar = tVar.f409406c.get(i12);
            gVar.i((b) bVar.getKey(), bVar.getValue());
            i12++;
        }
        for (Map.Entry<Object, Object> entry : tVar.c()) {
            gVar.i((b) entry.getKey(), entry.getValue());
        }
        gVar.f409355c = this.f409355c;
        return gVar;
    }

    public final Object e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f409353a.get(fielddescriptortype);
        return obj instanceof j ? ((j) obj).a() : obj;
    }

    public final void g(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof j) {
            value = ((j) value).a();
        }
        boolean zIsRepeated = key.isRepeated();
        t tVar = this.f409353a;
        if (zIsRepeated) {
            Object objE = e(key);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objE;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            tVar.put(key, objE);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            tVar.put(key, value);
            return;
        }
        Object objE2 = e(key);
        if (objE2 != null) {
            tVar.put(key, key.G2(((o) objE2).toBuilder(), (o) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        tVar.put(key, value);
    }

    public final void i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            j(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof j) {
            this.f409355c = true;
        }
        this.f409353a.put(fielddescriptortype, obj);
    }

    public g(int i12) {
        this.f409355c = false;
        t tVar = new t(0, null);
        this.f409353a = tVar;
        if (this.f409354b) {
            return;
        }
        tVar.e();
        this.f409354b = true;
    }
}
