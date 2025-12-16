package com.google.protobuf;

import com.google.protobuf.C37670d0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;

/* compiled from: ArrayDecoders.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37685l {

    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.protobuf.l$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362883a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f362883a = iArr;
            try {
                iArr[WireFormat.FieldType.f362789d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362883a[WireFormat.FieldType.f362790e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362883a[WireFormat.FieldType.f362791f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362883a[WireFormat.FieldType.f362792g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362883a[WireFormat.FieldType.f362793h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362883a[WireFormat.FieldType.f362801p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362883a[WireFormat.FieldType.f362794i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f362883a[WireFormat.FieldType.f362804s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f362883a[WireFormat.FieldType.f362795j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f362883a[WireFormat.FieldType.f362803r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f362883a[WireFormat.FieldType.f362796k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f362883a[WireFormat.FieldType.f362805t.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f362883a[WireFormat.FieldType.f362806u.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f362883a[WireFormat.FieldType.f362802q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f362883a[WireFormat.FieldType.f362800o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f362883a[WireFormat.FieldType.f362797l.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f362883a[WireFormat.FieldType.f362798m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f362883a[WireFormat.FieldType.f362799n.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static int A(byte[] bArr, int i12, b bVar) throws InvalidProtocolBufferException {
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 == 0) {
            bVar.f362886c = "";
            return iG2;
        }
        bVar.f362886c = new String(bArr, iG2, i13, C37670d0.f362857a);
        return iG2 + i13;
    }

    public static int B(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int iG2 = G(bArr, i13, bVar);
        int i15 = bVar.f362884a;
        if (i15 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i15 == 0) {
            kVar.add("");
        } else {
            kVar.add(new String(bArr, iG2, i15, C37670d0.f362857a));
            iG2 += i15;
        }
        while (iG2 < i14) {
            int iG3 = G(bArr, iG2, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            iG2 = G(bArr, iG3, bVar);
            int i16 = bVar.f362884a;
            if (i16 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i16 == 0) {
                kVar.add("");
            } else {
                kVar.add(new String(bArr, iG2, i16, C37670d0.f362857a));
                iG2 += i16;
            }
        }
        return iG2;
    }

    public static int C(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int iG2 = G(bArr, i13, bVar);
        int i15 = bVar.f362884a;
        if (i15 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i15 == 0) {
            kVar.add("");
        } else {
            int i16 = iG2 + i15;
            if (s1.f362953a.f(0, bArr, iG2, i16) != 0) {
                throw InvalidProtocolBufferException.c();
            }
            kVar.add(new String(bArr, iG2, i15, C37670d0.f362857a));
            iG2 = i16;
        }
        while (iG2 < i14) {
            int iG3 = G(bArr, iG2, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            iG2 = G(bArr, iG3, bVar);
            int i17 = bVar.f362884a;
            if (i17 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i17 == 0) {
                kVar.add("");
            } else {
                int i18 = iG2 + i17;
                if (s1.f362953a.f(0, bArr, iG2, i18) != 0) {
                    throw InvalidProtocolBufferException.c();
                }
                kVar.add(new String(bArr, iG2, i17, C37670d0.f362857a));
                iG2 = i18;
            }
        }
        return iG2;
    }

    public static int D(byte[] bArr, int i12, b bVar) throws InvalidProtocolBufferException {
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 == 0) {
            bVar.f362886c = "";
            return iG2;
        }
        bVar.f362886c = s1.f362953a.a(bArr, iG2, i13);
        return iG2 + i13;
    }

    public static int E(int i12, byte[] bArr, int i13, int i14, n1 n1Var, b bVar) throws InvalidProtocolBufferException {
        if ((i12 >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            int I12 = I(bArr, i13, bVar);
            n1Var.f(i12, Long.valueOf(bVar.f362885b));
            return I12;
        }
        if (i15 == 1) {
            n1Var.f(i12, Long.valueOf(i(bArr, i13)));
            return i13 + 8;
        }
        if (i15 == 2) {
            int iG2 = G(bArr, i13, bVar);
            int i16 = bVar.f362884a;
            if (i16 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i16 > bArr.length - iG2) {
                throw InvalidProtocolBufferException.h();
            }
            if (i16 == 0) {
                n1Var.f(i12, AbstractC37700t.f362954c);
            } else {
                n1Var.f(i12, AbstractC37700t.h(iG2, i16, bArr));
            }
            return iG2 + i16;
        }
        if (i15 != 3) {
            if (i15 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            n1Var.f(i12, Integer.valueOf(g(bArr, i13)));
            return i13 + 4;
        }
        n1 n1Var2 = new n1();
        int i17 = (i12 & (-8)) | 4;
        int i18 = 0;
        while (true) {
            if (i13 >= i14) {
                break;
            }
            int iG3 = G(bArr, i13, bVar);
            int i19 = bVar.f362884a;
            if (i19 == i17) {
                i18 = i19;
                i13 = iG3;
                break;
            }
            i18 = i19;
            i13 = E(i19, bArr, iG3, i14, n1Var2, bVar);
        }
        if (i13 > i14 || i18 != i17) {
            throw InvalidProtocolBufferException.g();
        }
        n1Var.f(i12, n1Var2);
        return i13;
    }

    public static int F(int i12, byte[] bArr, int i13, b bVar) {
        int i14 = i12 & 127;
        int i15 = i13 + 1;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            bVar.f362884a = i14 | (b12 << 7);
            return i15;
        }
        int i16 = i14 | ((b12 & 127) << 7);
        int i17 = i13 + 2;
        byte b13 = bArr[i15];
        if (b13 >= 0) {
            bVar.f362884a = i16 | (b13 << 14);
            return i17;
        }
        int i18 = i16 | ((b13 & 127) << 14);
        int i19 = i13 + 3;
        byte b14 = bArr[i17];
        if (b14 >= 0) {
            bVar.f362884a = i18 | (b14 << 21);
            return i19;
        }
        int i22 = i18 | ((b14 & 127) << 21);
        int i23 = i13 + 4;
        byte b15 = bArr[i19];
        if (b15 >= 0) {
            bVar.f362884a = i22 | (b15 << 28);
            return i23;
        }
        int i24 = i22 | ((b15 & 127) << 28);
        while (true) {
            int i25 = i23 + 1;
            if (bArr[i23] >= 0) {
                bVar.f362884a = i24;
                return i25;
            }
            i23 = i25;
        }
    }

    public static int G(byte[] bArr, int i12, b bVar) {
        int i13 = i12 + 1;
        byte b12 = bArr[i12];
        if (b12 < 0) {
            return F(b12, bArr, i13, bVar);
        }
        bVar.f362884a = b12;
        return i13;
    }

    public static int H(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        C37668c0 c37668c0 = (C37668c0) kVar;
        int iG2 = G(bArr, i13, bVar);
        c37668c0.addInt(bVar.f362884a);
        while (iG2 < i14) {
            int iG3 = G(bArr, iG2, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            iG2 = G(bArr, iG3, bVar);
            c37668c0.addInt(bVar.f362884a);
        }
        return iG2;
    }

    public static int I(byte[] bArr, int i12, b bVar) {
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        if (j12 >= 0) {
            bVar.f362885b = j12;
            return i13;
        }
        int i14 = i12 + 2;
        byte b12 = bArr[i13];
        long j13 = (j12 & 127) | ((b12 & 127) << 7);
        int i15 = 7;
        while (b12 < 0) {
            int i16 = i14 + 1;
            i15 += 7;
            j13 |= (r10 & 127) << i15;
            b12 = bArr[i14];
            i14 = i16;
        }
        bVar.f362885b = j13;
        return i14;
    }

    public static int J(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        C37690n0 c37690n0 = (C37690n0) kVar;
        int I12 = I(bArr, i13, bVar);
        c37690n0.addLong(bVar.f362885b);
        while (I12 < i14) {
            int iG2 = G(bArr, I12, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            I12 = I(bArr, iG2, bVar);
            c37690n0.addLong(bVar.f362885b);
        }
        return I12;
    }

    public static int K(Object obj, T0 t02, byte[] bArr, int i12, int i13, int i14, b bVar) {
        int iH2 = ((C37713z0) t02).H(obj, bArr, i12, i13, i14, bVar);
        bVar.f362886c = obj;
        return iH2;
    }

    public static int L(Object obj, T0 t02, byte[] bArr, int i12, int i13, b bVar) throws InvalidProtocolBufferException {
        int iF2 = i12 + 1;
        int i14 = bArr[i12];
        if (i14 < 0) {
            iF2 = F(i14, bArr, iF2, bVar);
            i14 = bVar.f362884a;
        }
        int i15 = iF2;
        if (i14 < 0 || i14 > i13 - i15) {
            throw InvalidProtocolBufferException.h();
        }
        int i16 = i14 + i15;
        t02.d(obj, bArr, i15, i16, bVar);
        bVar.f362886c = obj;
        return i16;
    }

    public static int M(int i12, byte[] bArr, int i13, int i14, b bVar) throws InvalidProtocolBufferException {
        if ((i12 >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            return I(bArr, i13, bVar);
        }
        if (i15 == 1) {
            return i13 + 8;
        }
        if (i15 == 2) {
            return G(bArr, i13, bVar) + bVar.f362884a;
        }
        if (i15 != 3) {
            if (i15 == 5) {
                return i13 + 4;
            }
            throw InvalidProtocolBufferException.b();
        }
        int i16 = (i12 & (-8)) | 4;
        int i17 = 0;
        while (i13 < i14) {
            i13 = G(bArr, i13, bVar);
            i17 = bVar.f362884a;
            if (i17 == i16) {
                break;
            }
            i13 = M(i17, bArr, i13, i14, bVar);
        }
        if (i13 > i14 || i17 != i16) {
            throw InvalidProtocolBufferException.g();
        }
        return i13;
    }

    public static int a(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        C37693p c37693p = (C37693p) kVar;
        int I12 = I(bArr, i13, bVar);
        c37693p.addBoolean(bVar.f362885b != 0);
        while (I12 < i14) {
            int iG2 = G(bArr, I12, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            I12 = I(bArr, iG2, bVar);
            c37693p.addBoolean(bVar.f362885b != 0);
        }
        return I12;
    }

    public static int b(byte[] bArr, int i12, b bVar) throws InvalidProtocolBufferException {
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i13 > bArr.length - iG2) {
            throw InvalidProtocolBufferException.h();
        }
        if (i13 == 0) {
            bVar.f362886c = AbstractC37700t.f362954c;
            return iG2;
        }
        bVar.f362886c = AbstractC37700t.h(iG2, i13, bArr);
        return iG2 + i13;
    }

    public static int c(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int iG2 = G(bArr, i13, bVar);
        int i15 = bVar.f362884a;
        if (i15 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i15 > bArr.length - iG2) {
            throw InvalidProtocolBufferException.h();
        }
        if (i15 == 0) {
            kVar.add(AbstractC37700t.f362954c);
        } else {
            kVar.add(AbstractC37700t.h(iG2, i15, bArr));
            iG2 += i15;
        }
        while (iG2 < i14) {
            int iG3 = G(bArr, iG2, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            iG2 = G(bArr, iG3, bVar);
            int i16 = bVar.f362884a;
            if (i16 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i16 > bArr.length - iG2) {
                throw InvalidProtocolBufferException.h();
            }
            if (i16 == 0) {
                kVar.add(AbstractC37700t.f362954c);
            } else {
                kVar.add(AbstractC37700t.h(iG2, i16, bArr));
                iG2 += i16;
            }
        }
        return iG2;
    }

    public static double d(byte[] bArr, int i12) {
        return Double.longBitsToDouble(i(bArr, i12));
    }

    public static int e(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        B b12 = (B) kVar;
        b12.addDouble(d(bArr, i13));
        int i15 = i13 + 8;
        while (i15 < i14) {
            int iG2 = G(bArr, i15, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            b12.addDouble(Double.longBitsToDouble(i(bArr, iG2)));
            i15 = iG2 + 8;
        }
        return i15;
    }

    public static int f(int i12, byte[] bArr, int i13, int i14, Object obj, InterfaceC37707w0 interfaceC37707w0, m1<n1, n1> m1Var, b bVar) throws InvalidProtocolBufferException {
        int I12;
        int i15 = i12 >>> 3;
        GeneratedMessageLite.g gVarA = bVar.f362887d.a(i15, interfaceC37707w0);
        if (gVarA == null) {
            return E(i12, bArr, i13, i14, C37713z0.n(obj), bVar);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        extendableMessage.ensureExtensionsAreMutable();
        V<GeneratedMessageLite.f> v12 = extendableMessage.extensions;
        GeneratedMessageLite.f fVar = gVarA.f362691d;
        boolean z12 = fVar.f362686e;
        WireFormat.FieldType fieldType = fVar.f362685d;
        if (z12 && fVar.f362687f) {
            switch (fieldType.ordinal()) {
                case 0:
                    B b12 = new B();
                    int iQ2 = q(bArr, i13, b12, bVar);
                    v12.q(fVar, b12);
                    return iQ2;
                case 1:
                    W w12 = new W();
                    int iT2 = t(bArr, i13, w12, bVar);
                    v12.q(fVar, w12);
                    return iT2;
                case 2:
                case 3:
                    C37690n0 c37690n0 = new C37690n0();
                    int iX2 = x(bArr, i13, c37690n0, bVar);
                    v12.q(fVar, c37690n0);
                    return iX2;
                case 4:
                case 12:
                    C37668c0 c37668c0 = new C37668c0();
                    int iW2 = w(bArr, i13, c37668c0, bVar);
                    v12.q(fVar, c37668c0);
                    return iW2;
                case 5:
                case 15:
                    C37690n0 c37690n02 = new C37690n0();
                    int iS2 = s(bArr, i13, c37690n02, bVar);
                    v12.q(fVar, c37690n02);
                    return iS2;
                case 6:
                case 14:
                    C37668c0 c37668c02 = new C37668c0();
                    int iR2 = r(bArr, i13, c37668c02, bVar);
                    v12.q(fVar, c37668c02);
                    return iR2;
                case 7:
                    C37693p c37693p = new C37693p();
                    int iP2 = p(bArr, i13, c37693p, bVar);
                    v12.q(fVar, c37693p);
                    return iP2;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new IllegalStateException("Type cannot be packed: " + fieldType);
                case 13:
                    C37668c0 c37668c03 = new C37668c0();
                    int iW3 = w(bArr, i13, c37668c03, bVar);
                    V0.z(extendableMessage, i15, c37668c03, fVar.f362683b, null, m1Var);
                    v12.q(fVar, c37668c03);
                    return iW3;
                case 16:
                    C37668c0 c37668c04 = new C37668c0();
                    int iU2 = u(bArr, i13, c37668c04, bVar);
                    v12.q(fVar, c37668c04);
                    return iU2;
                case 17:
                    C37690n0 c37690n03 = new C37690n0();
                    int iV2 = v(bArr, i13, c37690n03, bVar);
                    v12.q(fVar, c37690n03);
                    return iV2;
            }
        }
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.f362802q;
        boolean z13 = fVar.f362686e;
        Object objValueOf = null;
        if (fieldType != fieldType2) {
            int i16 = a.f362883a[fieldType.ordinal()];
            InterfaceC37707w0 interfaceC37707w02 = gVarA.f362690c;
            switch (i16) {
                case 1:
                    objValueOf = Double.valueOf(d(bArr, i13));
                    I12 = i13 + 8;
                    break;
                case 2:
                    objValueOf = Float.valueOf(k(bArr, i13));
                    I12 = i13 + 4;
                    break;
                case 3:
                case 4:
                    I12 = I(bArr, i13, bVar);
                    objValueOf = Long.valueOf(bVar.f362885b);
                    break;
                case 5:
                case 6:
                    I12 = G(bArr, i13, bVar);
                    objValueOf = Integer.valueOf(bVar.f362884a);
                    break;
                case 7:
                case 8:
                    objValueOf = Long.valueOf(i(bArr, i13));
                    I12 = i13 + 8;
                    break;
                case 9:
                case 10:
                    objValueOf = Integer.valueOf(g(bArr, i13));
                    I12 = i13 + 4;
                    break;
                case 11:
                    I12 = I(bArr, i13, bVar);
                    objValueOf = Boolean.valueOf(bVar.f362885b != 0);
                    break;
                case 12:
                    I12 = G(bArr, i13, bVar);
                    objValueOf = Integer.valueOf(AbstractC37708x.c(bVar.f362884a));
                    break;
                case 13:
                    I12 = I(bArr, i13, bVar);
                    objValueOf = Long.valueOf(AbstractC37708x.d(bVar.f362885b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    I12 = b(bArr, i13, bVar);
                    objValueOf = bVar.f362886c;
                    break;
                case 16:
                    I12 = A(bArr, i13, bVar);
                    objValueOf = bVar.f362886c;
                    break;
                case 17:
                    int i17 = (i15 << 3) | 4;
                    T0 t0A = N0.f362717c.a(interfaceC37707w02.getClass());
                    if (z13) {
                        Object objNewInstance = t0A.newInstance();
                        I12 = K(objNewInstance, t0A, bArr, i13, i14, i17, bVar);
                        t0A.makeImmutable(objNewInstance);
                        bVar.f362886c = objNewInstance;
                        v12.a(fVar, objNewInstance);
                    } else {
                        Object objF = v12.f(fVar);
                        if (objF == null) {
                            objF = t0A.newInstance();
                            v12.q(fVar, objF);
                        }
                        I12 = K(objF, t0A, bArr, i13, i14, i17, bVar);
                    }
                    return I12;
                case 18:
                    T0 t0A2 = N0.f362717c.a(interfaceC37707w02.getClass());
                    if (z13) {
                        I12 = n(t0A2, bArr, i13, i14, bVar);
                        v12.a(fVar, bVar.f362886c);
                    } else {
                        Object objF2 = v12.f(fVar);
                        if (objF2 == null) {
                            objF2 = t0A2.newInstance();
                            v12.q(fVar, objF2);
                        }
                        I12 = L(objF2, t0A2, bArr, i13, i14, bVar);
                    }
                    return I12;
                default:
                    I12 = i13;
                    break;
            }
        } else {
            int iG2 = G(bArr, i13, bVar);
            if (fVar.f362683b.findValueByNumber(bVar.f362884a) == null) {
                V0.C(extendableMessage, i15, bVar.f362884a, null, m1Var);
                return iG2;
            }
            objValueOf = Integer.valueOf(bVar.f362884a);
            I12 = iG2;
        }
        if (z13) {
            v12.a(fVar, objValueOf);
        } else {
            v12.q(fVar, objValueOf);
        }
        return I12;
    }

    public static int g(byte[] bArr, int i12) {
        return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
    }

    public static int h(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        C37668c0 c37668c0 = (C37668c0) kVar;
        c37668c0.addInt(g(bArr, i13));
        int i15 = i13 + 4;
        while (i15 < i14) {
            int iG2 = G(bArr, i15, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            c37668c0.addInt(g(bArr, iG2));
            i15 = iG2 + 4;
        }
        return i15;
    }

    public static long i(byte[] bArr, int i12) {
        return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
    }

    public static int j(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        C37690n0 c37690n0 = (C37690n0) kVar;
        c37690n0.addLong(i(bArr, i13));
        int i15 = i13 + 8;
        while (i15 < i14) {
            int iG2 = G(bArr, i15, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            c37690n0.addLong(i(bArr, iG2));
            i15 = iG2 + 8;
        }
        return i15;
    }

    public static float k(byte[] bArr, int i12) {
        return Float.intBitsToFloat(g(bArr, i12));
    }

    public static int l(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        W w12 = (W) kVar;
        w12.addFloat(k(bArr, i13));
        int i15 = i13 + 4;
        while (i15 < i14) {
            int iG2 = G(bArr, i15, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            w12.addFloat(Float.intBitsToFloat(g(bArr, iG2)));
            i15 = iG2 + 4;
        }
        return i15;
    }

    public static int m(T0 t02, int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        int i15 = (i12 & (-8)) | 4;
        Object objNewInstance = t02.newInstance();
        int iK2 = K(objNewInstance, t02, bArr, i13, i14, i15, bVar);
        t02.makeImmutable(objNewInstance);
        bVar.f362886c = objNewInstance;
        kVar.add(objNewInstance);
        while (iK2 < i14) {
            int iG2 = G(bArr, iK2, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            Object objNewInstance2 = t02.newInstance();
            int iK3 = K(objNewInstance2, t02, bArr, iG2, i14, i15, bVar);
            t02.makeImmutable(objNewInstance2);
            bVar.f362886c = objNewInstance2;
            kVar.add(objNewInstance2);
            iK2 = iK3;
        }
        return iK2;
    }

    public static int n(T0 t02, byte[] bArr, int i12, int i13, b bVar) throws InvalidProtocolBufferException {
        Object objNewInstance = t02.newInstance();
        int iL2 = L(objNewInstance, t02, bArr, i12, i13, bVar);
        t02.makeImmutable(objNewInstance);
        bVar.f362886c = objNewInstance;
        return iL2;
    }

    public static int o(T0<?> t02, int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        int iN2 = n(t02, bArr, i13, i14, bVar);
        kVar.add(bVar.f362886c);
        while (iN2 < i14) {
            int iG2 = G(bArr, iN2, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            iN2 = n(t02, bArr, iG2, i14, bVar);
            kVar.add(bVar.f362886c);
        }
        return iN2;
    }

    public static int p(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        C37693p c37693p = (C37693p) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            iG2 = I(bArr, iG2, bVar);
            c37693p.addBoolean(bVar.f362885b != 0);
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int q(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        B b12 = (B) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            b12.addDouble(Double.longBitsToDouble(i(bArr, iG2)));
            iG2 += 8;
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int r(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        C37668c0 c37668c0 = (C37668c0) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            c37668c0.addInt(g(bArr, iG2));
            iG2 += 4;
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int s(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        C37690n0 c37690n0 = (C37690n0) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            c37690n0.addLong(i(bArr, iG2));
            iG2 += 8;
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int t(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        W w12 = (W) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            w12.addFloat(Float.intBitsToFloat(g(bArr, iG2)));
            iG2 += 4;
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int u(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        C37668c0 c37668c0 = (C37668c0) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            iG2 = G(bArr, iG2, bVar);
            c37668c0.addInt(AbstractC37708x.c(bVar.f362884a));
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int v(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        C37690n0 c37690n0 = (C37690n0) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            iG2 = I(bArr, iG2, bVar);
            c37690n0.addLong(AbstractC37708x.d(bVar.f362885b));
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int w(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        C37668c0 c37668c0 = (C37668c0) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            iG2 = G(bArr, iG2, bVar);
            c37668c0.addInt(bVar.f362884a);
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int x(byte[] bArr, int i12, C37670d0.k<?> kVar, b bVar) throws InvalidProtocolBufferException {
        C37690n0 c37690n0 = (C37690n0) kVar;
        int iG2 = G(bArr, i12, bVar);
        int i13 = bVar.f362884a + iG2;
        while (iG2 < i13) {
            iG2 = I(bArr, iG2, bVar);
            c37690n0.addLong(bVar.f362885b);
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int y(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        C37668c0 c37668c0 = (C37668c0) kVar;
        int iG2 = G(bArr, i13, bVar);
        c37668c0.addInt(AbstractC37708x.c(bVar.f362884a));
        while (iG2 < i14) {
            int iG3 = G(bArr, iG2, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            iG2 = G(bArr, iG3, bVar);
            c37668c0.addInt(AbstractC37708x.c(bVar.f362884a));
        }
        return iG2;
    }

    public static int z(int i12, byte[] bArr, int i13, int i14, C37670d0.k<?> kVar, b bVar) {
        C37690n0 c37690n0 = (C37690n0) kVar;
        int I12 = I(bArr, i13, bVar);
        c37690n0.addLong(AbstractC37708x.d(bVar.f362885b));
        while (I12 < i14) {
            int iG2 = G(bArr, I12, bVar);
            if (i12 != bVar.f362884a) {
                break;
            }
            I12 = I(bArr, iG2, bVar);
            c37690n0.addLong(AbstractC37708x.d(bVar.f362885b));
        }
        return I12;
    }

    /* compiled from: ArrayDecoders.java */
    /* renamed from: com.google.protobuf.l$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f362884a;

        /* renamed from: b, reason: collision with root package name */
        public long f362885b;

        /* renamed from: c, reason: collision with root package name */
        public Object f362886c;

        /* renamed from: d, reason: collision with root package name */
        public final M f362887d;

        public b() {
            this.f362887d = M.b();
        }

        public b(M m12) {
            m12.getClass();
            this.f362887d = m12;
        }
    }
}
