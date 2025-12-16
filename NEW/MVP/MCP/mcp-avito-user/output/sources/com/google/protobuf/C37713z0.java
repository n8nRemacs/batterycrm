package com.google.protobuf;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.google.protobuf.AbstractC37700t;
import com.google.protobuf.C37670d0;
import com.google.protobuf.C37685l;
import com.google.protobuf.C37694p0;
import com.google.protobuf.WireFormat;
import com.google.protobuf.r1;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.z0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C37713z0<T> implements T0<T> {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f363013q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f363014r = r1.n();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f363015a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f363016b;

    /* renamed from: c, reason: collision with root package name */
    public final int f363017c;

    /* renamed from: d, reason: collision with root package name */
    public final int f363018d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC37707w0 f363019e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f363020f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f363021g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f363022h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f363023i;

    /* renamed from: j, reason: collision with root package name */
    public final int f363024j;

    /* renamed from: k, reason: collision with root package name */
    public final int f363025k;

    /* renamed from: l, reason: collision with root package name */
    public final E0 f363026l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC37686l0 f363027m;

    /* renamed from: n, reason: collision with root package name */
    public final m1<?, ?> f363028n;

    /* renamed from: o, reason: collision with root package name */
    public final N<?> f363029o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC37697r0 f363030p;

    /* compiled from: MessageSchema.java */
    /* renamed from: com.google.protobuf.z0$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f363031a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f363031a = iArr;
            try {
                iArr[WireFormat.FieldType.f362796k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f363031a[WireFormat.FieldType.f362800o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f363031a[WireFormat.FieldType.f362789d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f363031a[WireFormat.FieldType.f362795j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f363031a[WireFormat.FieldType.f362803r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f363031a[WireFormat.FieldType.f362794i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f363031a[WireFormat.FieldType.f362804s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f363031a[WireFormat.FieldType.f362790e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f363031a[WireFormat.FieldType.f362802q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f363031a[WireFormat.FieldType.f362793h.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f363031a[WireFormat.FieldType.f362801p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f363031a[WireFormat.FieldType.f362791f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f363031a[WireFormat.FieldType.f362792g.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f363031a[WireFormat.FieldType.f362799n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f363031a[WireFormat.FieldType.f362805t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f363031a[WireFormat.FieldType.f362806u.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f363031a[WireFormat.FieldType.f362797l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C37713z0(int[] iArr, Object[] objArr, int i12, int i13, InterfaceC37707w0 interfaceC37707w0, boolean z12, int[] iArr2, int i14, int i15, E0 e02, AbstractC37686l0 abstractC37686l0, m1 m1Var, N n12, InterfaceC37697r0 interfaceC37697r0) {
        this.f363015a = iArr;
        this.f363016b = objArr;
        this.f363017c = i12;
        this.f363018d = i13;
        this.f363021g = interfaceC37707w0 instanceof GeneratedMessageLite;
        this.f363022h = z12;
        this.f363020f = n12 != null && n12.e(interfaceC37707w0);
        this.f363023i = iArr2;
        this.f363024j = i14;
        this.f363025k = i15;
        this.f363026l = e02;
        this.f363027m = abstractC37686l0;
        this.f363028n = m1Var;
        this.f363029o = n12;
        this.f363019e = interfaceC37707w0;
        this.f363030p = interfaceC37697r0;
    }

    public static C37713z0 A(InterfaceC37703u0 interfaceC37703u0, E0 e02, AbstractC37686l0 abstractC37686l0, m1 m1Var, N n12, InterfaceC37697r0 interfaceC37697r0) {
        if (interfaceC37703u0 instanceof Q0) {
            return B((Q0) interfaceC37703u0, e02, abstractC37686l0, m1Var, n12, interfaceC37697r0);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x03a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> com.google.protobuf.C37713z0<T> B(com.google.protobuf.Q0 r33, com.google.protobuf.E0 r34, com.google.protobuf.AbstractC37686l0 r35, com.google.protobuf.m1<?, ?> r36, com.google.protobuf.N<?> r37, com.google.protobuf.InterfaceC37697r0 r38) {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.B(com.google.protobuf.Q0, com.google.protobuf.E0, com.google.protobuf.l0, com.google.protobuf.m1, com.google.protobuf.N, com.google.protobuf.r0):com.google.protobuf.z0");
    }

    public static long C(int i12) {
        return i12 & 1048575;
    }

    public static <T> int D(T t12, long j12) {
        return ((Integer) r1.f362946c.m(t12, j12)).intValue();
    }

    public static <T> long E(T t12, long j12) {
        return ((Long) r1.f362946c.m(t12, j12)).longValue();
    }

    public static java.lang.reflect.Field O(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbA = androidx.appcompat.app.r.A("Field ", str, " for ");
            androidx.compose.ui.graphics.colorspace.e.u(cls, sbA, " not found. Known fields are ");
            sbA.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbA.toString());
        }
    }

    public static int U(int i12) {
        return (i12 & 267386880) >>> 20;
    }

    public static void Y(int i12, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i12, (String) obj);
        } else {
            writer.a(i12, (AbstractC37700t) obj);
        }
    }

    public static void h(Object obj) {
        if (!r(obj)) {
            throw new IllegalArgumentException(androidx.camera.view.k.a(obj, "Mutating immutable message: "));
        }
    }

    public static int i(byte[] bArr, int i12, int i13, WireFormat.FieldType fieldType, Class cls, C37685l.b bVar) {
        switch (a.f363031a[fieldType.ordinal()]) {
            case 1:
                int I12 = C37685l.I(bArr, i12, bVar);
                bVar.f362886c = Boolean.valueOf(bVar.f362885b != 0);
                return I12;
            case 2:
                return C37685l.b(bArr, i12, bVar);
            case 3:
                bVar.f362886c = Double.valueOf(C37685l.d(bArr, i12));
                return i12 + 8;
            case 4:
            case 5:
                bVar.f362886c = Integer.valueOf(C37685l.g(bArr, i12));
                return i12 + 4;
            case 6:
            case 7:
                bVar.f362886c = Long.valueOf(C37685l.i(bArr, i12));
                return i12 + 8;
            case 8:
                bVar.f362886c = Float.valueOf(C37685l.k(bArr, i12));
                return i12 + 4;
            case 9:
            case 10:
            case 11:
                int iG2 = C37685l.G(bArr, i12, bVar);
                bVar.f362886c = Integer.valueOf(bVar.f362884a);
                return iG2;
            case 12:
            case 13:
                int I13 = C37685l.I(bArr, i12, bVar);
                bVar.f362886c = Long.valueOf(bVar.f362885b);
                return I13;
            case 14:
                return C37685l.n(N0.f362717c.a(cls), bArr, i12, i13, bVar);
            case 15:
                int iG3 = C37685l.G(bArr, i12, bVar);
                bVar.f362886c = Integer.valueOf(AbstractC37708x.c(bVar.f362884a));
                return iG3;
            case 16:
                int I14 = C37685l.I(bArr, i12, bVar);
                bVar.f362886c = Long.valueOf(AbstractC37708x.d(bVar.f362885b));
                return I14;
            case 17:
                return C37685l.D(bArr, i12, bVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static n1 n(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var != n1.f362921f) {
            return n1Var;
        }
        n1 n1Var2 = new n1();
        generatedMessageLite.unknownFields = n1Var2;
        return n1Var2;
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public static List t(AbstractC37663a abstractC37663a, long j12) {
        return (List) r1.f362946c.m(abstractC37663a, j12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.protobuf.q0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public final <K, V> int F(T t12, byte[] bArr, int i12, int i13, int i14, long j12, C37685l.b bVar) throws InvalidProtocolBufferException {
        Unsafe unsafe = f363014r;
        Object objL = l(i14);
        Object object = unsafe.getObject(t12, j12);
        InterfaceC37697r0 interfaceC37697r0 = this.f363030p;
        if (interfaceC37697r0.isImmutable(object)) {
            C37696q0 c37696q0A = interfaceC37697r0.a();
            interfaceC37697r0.mergeFrom(c37696q0A, object);
            unsafe.putObject(t12, j12, c37696q0A);
            object = c37696q0A;
        }
        C37694p0.b<?, ?> bVarForMapMetadata = interfaceC37697r0.forMapMetadata(objL);
        ?? ForMutableMapData = interfaceC37697r0.forMutableMapData(object);
        int iG2 = C37685l.G(bArr, i12, bVar);
        int i15 = bVar.f362884a;
        if (i15 < 0 || i15 > i13 - iG2) {
            throw InvalidProtocolBufferException.h();
        }
        int i16 = iG2 + i15;
        bVarForMapMetadata.getClass();
        V v12 = bVarForMapMetadata.f362938c;
        Object obj = "";
        Object obj2 = v12;
        while (iG2 < i16) {
            int iF2 = iG2 + 1;
            byte b12 = bArr[iG2];
            if (b12 < 0) {
                iF2 = C37685l.F(b12, bArr, iF2, bVar);
                b12 = bVar.f362884a;
            }
            int i17 = b12 >>> 3;
            int i18 = b12 & 7;
            if (i17 != 1) {
                if (i17 == 2) {
                    WireFormat.FieldType fieldType = bVarForMapMetadata.f362937b;
                    if (i18 == fieldType.f362809c) {
                        iG2 = i(bArr, iF2, i13, fieldType, v12.getClass(), bVar);
                        obj2 = bVar.f362886c;
                    }
                }
                iG2 = C37685l.M(b12, bArr, iF2, i13, bVar);
            } else {
                WireFormat.FieldType fieldType2 = bVarForMapMetadata.f362936a;
                if (i18 == fieldType2.f362809c) {
                    iG2 = i(bArr, iF2, i13, fieldType2, null, bVar);
                    obj = bVar.f362886c;
                } else {
                    iG2 = C37685l.M(b12, bArr, iF2, i13, bVar);
                }
            }
        }
        if (iG2 != i16) {
            throw InvalidProtocolBufferException.g();
        }
        ForMutableMapData.put(obj, obj2);
        return i16;
    }

    public final int G(T t12, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, C37685l.b bVar) throws InvalidProtocolBufferException {
        Unsafe unsafe = f363014r;
        long j13 = this.f363015a[i19 + 2] & 1048575;
        switch (i18) {
            case 51:
                if (i16 == 1) {
                    unsafe.putObject(t12, j12, Double.valueOf(C37685l.d(bArr, i12)));
                    int i22 = i12 + 8;
                    unsafe.putInt(t12, j13, i15);
                    return i22;
                }
                break;
            case 52:
                if (i16 == 5) {
                    unsafe.putObject(t12, j12, Float.valueOf(C37685l.k(bArr, i12)));
                    int i23 = i12 + 4;
                    unsafe.putInt(t12, j13, i15);
                    return i23;
                }
                break;
            case 53:
            case 54:
                if (i16 == 0) {
                    int I12 = C37685l.I(bArr, i12, bVar);
                    unsafe.putObject(t12, j12, Long.valueOf(bVar.f362885b));
                    unsafe.putInt(t12, j13, i15);
                    return I12;
                }
                break;
            case 55:
            case 62:
                if (i16 == 0) {
                    int iG2 = C37685l.G(bArr, i12, bVar);
                    unsafe.putObject(t12, j12, Integer.valueOf(bVar.f362884a));
                    unsafe.putInt(t12, j13, i15);
                    return iG2;
                }
                break;
            case 56:
            case 65:
                if (i16 == 1) {
                    unsafe.putObject(t12, j12, Long.valueOf(C37685l.i(bArr, i12)));
                    int i24 = i12 + 8;
                    unsafe.putInt(t12, j13, i15);
                    return i24;
                }
                break;
            case 57:
            case 64:
                if (i16 == 5) {
                    unsafe.putObject(t12, j12, Integer.valueOf(C37685l.g(bArr, i12)));
                    int i25 = i12 + 4;
                    unsafe.putInt(t12, j13, i15);
                    return i25;
                }
                break;
            case 58:
                if (i16 == 0) {
                    int I13 = C37685l.I(bArr, i12, bVar);
                    unsafe.putObject(t12, j12, Boolean.valueOf(bVar.f362885b != 0));
                    unsafe.putInt(t12, j13, i15);
                    return I13;
                }
                break;
            case 59:
                if (i16 == 2) {
                    int iG3 = C37685l.G(bArr, i12, bVar);
                    int i26 = bVar.f362884a;
                    if (i26 == 0) {
                        unsafe.putObject(t12, j12, "");
                    } else {
                        if ((i17 & 536870912) != 0 && !s1.g(bArr, iG3, iG3 + i26)) {
                            throw InvalidProtocolBufferException.c();
                        }
                        unsafe.putObject(t12, j12, new String(bArr, iG3, i26, C37670d0.f362857a));
                        iG3 += i26;
                    }
                    unsafe.putInt(t12, j13, i15);
                    return iG3;
                }
                break;
            case 60:
                if (i16 == 2) {
                    Object objZ = z(t12, i15, i19);
                    int iL2 = C37685l.L(objZ, m(i19), bArr, i12, i13, bVar);
                    T(t12, i15, i19, objZ);
                    return iL2;
                }
                break;
            case 61:
                if (i16 == 2) {
                    int iB2 = C37685l.b(bArr, i12, bVar);
                    unsafe.putObject(t12, j12, bVar.f362886c);
                    unsafe.putInt(t12, j13, i15);
                    return iB2;
                }
                break;
            case 63:
                if (i16 == 0) {
                    int iG4 = C37685l.G(bArr, i12, bVar);
                    int i27 = bVar.f362884a;
                    C37670d0.e eVarK = k(i19);
                    if (eVarK == null || eVarK.isInRange(i27)) {
                        unsafe.putObject(t12, j12, Integer.valueOf(i27));
                        unsafe.putInt(t12, j13, i15);
                    } else {
                        n(t12).f(i14, Long.valueOf(i27));
                    }
                    return iG4;
                }
                break;
            case 66:
                if (i16 == 0) {
                    int iG5 = C37685l.G(bArr, i12, bVar);
                    unsafe.putObject(t12, j12, Integer.valueOf(AbstractC37708x.c(bVar.f362884a)));
                    unsafe.putInt(t12, j13, i15);
                    return iG5;
                }
                break;
            case 67:
                if (i16 == 0) {
                    int I14 = C37685l.I(bArr, i12, bVar);
                    unsafe.putObject(t12, j12, Long.valueOf(AbstractC37708x.d(bVar.f362885b)));
                    unsafe.putInt(t12, j13, i15);
                    return I14;
                }
                break;
            case 68:
                if (i16 == 3) {
                    Object objZ2 = z(t12, i15, i19);
                    int iK2 = C37685l.K(objZ2, m(i19), bArr, i12, i13, (i14 & (-8)) | 4, bVar);
                    T(t12, i15, i19, objZ2);
                    return iK2;
                }
                break;
        }
        return i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x03bd, code lost:
    
        if (r0 != r13) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03bf, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r3 = r32;
        r13 = r33;
        r11 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03d7, code lost:
    
        r8 = r32;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03ff, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0421, code lost:
    
        if (r0 != r15) goto L124;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x00a2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0426 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0457  */
    @com.google.protobuf.InterfaceC37704v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int H(T r30, byte[] r31, int r32, int r33, int r34, com.google.protobuf.C37685l.b r35) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.H(java.lang.Object, byte[], int, int, int, com.google.protobuf.l$b):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0275, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0277, code lost:
    
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r8 = r18;
        r2 = r19;
        r1 = r24;
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x028f, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02c3, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02e3, code lost:
    
        if (r0 != r15) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00a2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [int] */
    @com.google.protobuf.InterfaceC37704v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.C37685l.b r34) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.I(java.lang.Object, byte[], int, int, com.google.protobuf.l$b):void");
    }

    public final int J(T t12, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, long j12, int i18, long j13, C37685l.b bVar) throws InvalidProtocolBufferException {
        int iH2;
        Unsafe unsafe = f363014r;
        C37670d0.k kVarMutableCopyWithCapacity2 = (C37670d0.k) unsafe.getObject(t12, j13);
        if (!kVarMutableCopyWithCapacity2.isModifiable()) {
            int size = kVarMutableCopyWithCapacity2.size();
            kVarMutableCopyWithCapacity2 = kVarMutableCopyWithCapacity2.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t12, j13, kVarMutableCopyWithCapacity2);
        }
        switch (i18) {
            case 18:
            case 35:
                if (i16 == 2) {
                    return C37685l.q(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 1) {
                    return C37685l.e(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case 19:
            case 36:
                if (i16 == 2) {
                    return C37685l.t(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 5) {
                    return C37685l.l(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i16 == 2) {
                    return C37685l.x(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 0) {
                    return C37685l.J(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case 22:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 39:
            case 43:
                if (i16 == 2) {
                    return C37685l.w(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 0) {
                    return C37685l.H(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i16 == 2) {
                    return C37685l.s(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 1) {
                    return C37685l.j(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i16 == 2) {
                    return C37685l.r(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 5) {
                    return C37685l.h(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 42:
                if (i16 == 2) {
                    return C37685l.p(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 0) {
                    return C37685l.a(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (i16 == 2) {
                    return (j12 & 536870912) == 0 ? C37685l.B(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar) : C37685l.C(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (i16 == 2) {
                    return C37685l.o(m(i17), i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (i16 == 2) {
                    return C37685l.c(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case 30:
            case 44:
                if (i16 == 2) {
                    iH2 = C37685l.w(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                } else if (i16 == 0) {
                    iH2 = C37685l.H(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                V0.A(t12, i15, kVarMutableCopyWithCapacity2, k(i17), null, this.f363028n);
                return iH2;
            case 33:
            case 47:
                if (i16 == 2) {
                    return C37685l.u(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 0) {
                    return C37685l.y(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case 34:
            case 48:
                if (i16 == 2) {
                    return C37685l.v(bArr, i12, kVarMutableCopyWithCapacity2, bVar);
                }
                if (i16 == 0) {
                    return C37685l.z(i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
            case 49:
                if (i16 == 3) {
                    return C37685l.m(m(i17), i14, bArr, i12, i13, kVarMutableCopyWithCapacity2, bVar);
                }
                break;
        }
        return i12;
    }

    public final <E> void K(Object obj, long j12, R0 r02, T0<E> t02, M m12) {
        r02.g(this.f363027m.c(obj, j12), t02, m12);
    }

    public final <E> void L(Object obj, int i12, R0 r02, T0<E> t02, M m12) {
        r02.b(this.f363027m.c(obj, i12 & 1048575), t02, m12);
    }

    public final void M(Object obj, int i12, R0 r02) {
        if ((536870912 & i12) != 0) {
            r1.x(obj, i12 & 1048575, r02.readStringRequireUtf8());
        } else if (this.f363021g) {
            r1.x(obj, i12 & 1048575, r02.readString());
        } else {
            r1.x(obj, i12 & 1048575, r02.readBytes());
        }
    }

    public final void N(Object obj, int i12, R0 r02) {
        boolean z12 = (536870912 & i12) != 0;
        AbstractC37686l0 abstractC37686l0 = this.f363027m;
        if (z12) {
            r02.readStringListRequireUtf8(abstractC37686l0.c(obj, i12 & 1048575));
        } else {
            r02.readStringList(abstractC37686l0.c(obj, i12 & 1048575));
        }
    }

    public final void P(T t12, int i12) {
        int i13 = this.f363015a[i12 + 2];
        long j12 = 1048575 & i13;
        if (j12 == 1048575) {
            return;
        }
        r1.v(t12, j12, (1 << (i13 >>> 20)) | r1.f362946c.j(t12, j12));
    }

    public final void Q(T t12, int i12, int i13) {
        r1.v(t12, this.f363015a[i13 + 2] & 1048575, i12);
    }

    public final int R(int i12, int i13) {
        int[] iArr = this.f363015a;
        int length = (iArr.length / 3) - 1;
        while (i13 <= length) {
            int i14 = (length + i13) >>> 1;
            int i15 = i14 * 3;
            int i16 = iArr[i15];
            if (i12 == i16) {
                return i15;
            }
            if (i12 < i16) {
                length = i14 - 1;
            } else {
                i13 = i14 + 1;
            }
        }
        return -1;
    }

    public final void S(T t12, int i12, Object obj) {
        f363014r.putObject(t12, V(i12) & 1048575, obj);
        P(t12, i12);
    }

    public final void T(T t12, int i12, int i13, Object obj) {
        f363014r.putObject(t12, V(i13) & 1048575, obj);
        Q(t12, i12, i13);
    }

    public final int V(int i12) {
        return this.f363015a[i12 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(T r20, com.google.protobuf.Writer r21) {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.W(java.lang.Object, com.google.protobuf.Writer):void");
    }

    public final <K, V> void X(Writer writer, int i12, Object obj, int i13) {
        if (obj != null) {
            Object objL = l(i13);
            InterfaceC37697r0 interfaceC37697r0 = this.f363030p;
            writer.f(i12, interfaceC37697r0.forMapMetadata(objL), interfaceC37697r0.forMapData(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[PHI: r3
  0x00e4: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0219, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.google.protobuf.GeneratedMessageLite r12) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.a(com.google.protobuf.GeneratedMessageLite):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0894 A[PHI: r12
  0x0894: PHI (r12v30 boolean) = 
  (r12v10 boolean)
  (r12v11 boolean)
  (r12v11 boolean)
  (r12v12 boolean)
  (r12v18 boolean)
  (r12v19 boolean)
  (r12v33 boolean)
 binds: [B:322:0x0a98, B:319:0x0a7c, B:320:0x0a7e, B:317:0x0a67, B:298:0x09e4, B:296:0x09cd, B:274:0x0882] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(T r17, com.google.protobuf.Writer r18) {
        /*
            Method dump skipped, instructions count: 3216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.b(java.lang.Object, com.google.protobuf.Writer):void");
    }

    @Override // com.google.protobuf.T0
    public final int c(AbstractC37663a abstractC37663a) {
        return this.f363022h ? p(abstractC37663a) : o(abstractC37663a);
    }

    @Override // com.google.protobuf.T0
    public final void d(T t12, byte[] bArr, int i12, int i13, C37685l.b bVar) throws InvalidProtocolBufferException {
        if (this.f363022h) {
            I(t12, bArr, i12, i13, bVar);
        } else {
            H(t12, bArr, i12, i13, 0, bVar);
        }
    }

    @Override // com.google.protobuf.T0
    public final void e(T t12, R0 r02, M m12) throws Throwable {
        m12.getClass();
        h(t12);
        u(this.f363028n, this.f363029o, t12, r02, m12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // com.google.protobuf.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(com.google.protobuf.GeneratedMessageLite r12, com.google.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.f(com.google.protobuf.GeneratedMessageLite, com.google.protobuf.GeneratedMessageLite):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i12) {
        return q(generatedMessageLite, i12) == q(generatedMessageLite2, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.protobuf.T0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.protobuf.T0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.protobuf.T0] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [com.google.protobuf.T0] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    @Override // com.google.protobuf.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(T r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.isInitialized(java.lang.Object):boolean");
    }

    public final <UT, UB> UB j(Object obj, int i12, UB ub2, m1<UT, UB> m1Var, Object obj2) {
        C37670d0.e eVarK;
        int i13 = this.f363015a[i12];
        Object objM = r1.f362946c.m(obj, V(i12) & 1048575);
        if (objM == null || (eVarK = k(i12)) == null) {
            return ub2;
        }
        InterfaceC37697r0 interfaceC37697r0 = this.f363030p;
        C37696q0 c37696q0ForMutableMapData = interfaceC37697r0.forMutableMapData(objM);
        C37694p0.b<?, ?> bVarForMapMetadata = interfaceC37697r0.forMapMetadata(l(i12));
        Iterator it = c37696q0ForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!eVarK.isInRange(((Integer) entry.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) m1Var.f(obj2);
                }
                AbstractC37700t.h hVar = new AbstractC37700t.h(C37694p0.a(bVarForMapMetadata, entry.getKey(), entry.getValue()), null);
                CodedOutputStream codedOutputStream = hVar.f362962a;
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    V.s(codedOutputStream, bVarForMapMetadata.f362936a, 1, key);
                    V.s(codedOutputStream, bVarForMapMetadata.f362937b, 2, value);
                    if (codedOutputStream.J() != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    m1Var.d(ub2, i13, new AbstractC37700t.j(hVar.f362963b));
                    it.remove();
                } catch (IOException e12) {
                    throw new RuntimeException(e12);
                }
            }
        }
        return ub2;
    }

    public final C37670d0.e k(int i12) {
        return (C37670d0.e) this.f363016b[androidx.compose.ui.graphics.colorspace.e.x(i12, 3, 2, 1)];
    }

    public final Object l(int i12) {
        return this.f363016b[(i12 / 3) * 2];
    }

    public final T0 m(int i12) {
        int i13 = (i12 / 3) * 2;
        Object[] objArr = this.f363016b;
        T0 t02 = (T0) objArr[i13];
        if (t02 != null) {
            return t02;
        }
        T0<T> t0A = N0.f362717c.a((Class) objArr[i13 + 1]);
        objArr[i13] = t0A;
        return t0A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    @Override // com.google.protobuf.T0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void makeImmutable(T r9) {
        /*
            r8 = this;
            boolean r0 = r(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof com.google.protobuf.GeneratedMessageLite
            if (r0 == 0) goto L17
            r0 = r9
            com.google.protobuf.GeneratedMessageLite r0 = (com.google.protobuf.GeneratedMessageLite) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L17:
            int[] r0 = r8.f363015a
            int r1 = r0.length
            r2 = 0
        L1b:
            if (r2 >= r1) goto L7e
            int r3 = r8.V(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = U(r3)
            r6 = 9
            if (r3 == r6) goto L68
            r6 = 60
            if (r3 == r6) goto L52
            r6 = 68
            if (r3 == r6) goto L52
            switch(r3) {
                case 17: goto L68;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7b
        L3a:
            sun.misc.Unsafe r3 = com.google.protobuf.C37713z0.f363014r
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L7b
            com.google.protobuf.r0 r7 = r8.f363030p
            java.lang.Object r6 = r7.toImmutable(r6)
            r3.putObject(r9, r4, r6)
            goto L7b
        L4c:
            com.google.protobuf.l0 r3 = r8.f363027m
            r3.a(r9, r4)
            goto L7b
        L52:
            r3 = r0[r2]
            boolean r3 = r8.s(r9, r3, r2)
            if (r3 == 0) goto L7b
            com.google.protobuf.T0 r3 = r8.m(r2)
            sun.misc.Unsafe r6 = com.google.protobuf.C37713z0.f363014r
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.makeImmutable(r4)
            goto L7b
        L68:
            boolean r3 = r8.q(r9, r2)
            if (r3 == 0) goto L7b
            com.google.protobuf.T0 r3 = r8.m(r2)
            sun.misc.Unsafe r6 = com.google.protobuf.C37713z0.f363014r
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.makeImmutable(r4)
        L7b:
            int r2 = r2 + 3
            goto L1b
        L7e:
            com.google.protobuf.m1<?, ?> r0 = r8.f363028n
            r0.j(r9)
            boolean r0 = r8.f363020f
            if (r0 == 0) goto L8c
            com.google.protobuf.N<?> r0 = r8.f363029o
            r0.f(r9)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.makeImmutable(java.lang.Object):void");
    }

    @Override // com.google.protobuf.T0
    public final void mergeFrom(T t12, T t13) {
        h(t12);
        t13.getClass();
        int i12 = 0;
        while (true) {
            int[] iArr = this.f363015a;
            if (i12 >= iArr.length) {
                Class<?> cls = V0.f362774a;
                m1<?, ?> m1Var = this.f363028n;
                m1Var.o(t12, m1Var.k(m1Var.g(t12), m1Var.g(t13)));
                if (this.f363020f) {
                    N<?> n12 = this.f363029o;
                    V<T> vC2 = n12.c(t13);
                    if (vC2.f362769a.isEmpty()) {
                        return;
                    }
                    n12.d(t12).o(vC2);
                    return;
                }
                return;
            }
            int iV2 = V(i12);
            long j12 = 1048575 & iV2;
            int i13 = iArr[i12];
            switch (U(iV2)) {
                case 0:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.t(t12, j12, r1.f362946c.h(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 1:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.u(t12, j12, r1.f362946c.i(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 2:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.w(t12, j12, r1.f362946c.l(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 3:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.w(t12, j12, r1.f362946c.l(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 4:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.v(t12, j12, r1.f362946c.j(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 5:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.w(t12, j12, r1.f362946c.l(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 6:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.v(t12, j12, r1.f362946c.j(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 7:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.o(t12, j12, r1.f362946c.e(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 8:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.x(t12, j12, r1.f362946c.m(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 9:
                    w(t12, t13, i12);
                    break;
                case 10:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.x(t12, j12, r1.f362946c.m(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 11:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.v(t12, j12, r1.f362946c.j(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 12:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.v(t12, j12, r1.f362946c.j(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 13:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.v(t12, j12, r1.f362946c.j(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 14:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.w(t12, j12, r1.f362946c.l(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 15:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.v(t12, j12, r1.f362946c.j(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 16:
                    if (!q(t13, i12)) {
                        break;
                    } else {
                        r1.w(t12, j12, r1.f362946c.l(t13, j12));
                        P(t12, i12);
                        break;
                    }
                case 17:
                    w(t12, t13, i12);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f363027m.b(t12, t13, j12);
                    break;
                case 50:
                    Class<?> cls2 = V0.f362774a;
                    r1.e eVar = r1.f362946c;
                    r1.x(t12, j12, this.f363030p.mergeFrom(eVar.m(t12, j12), eVar.m(t13, j12)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!s(t13, i13, i12)) {
                        break;
                    } else {
                        r1.x(t12, j12, r1.f362946c.m(t13, j12));
                        Q(t12, i13, i12);
                        break;
                    }
                case 60:
                    x(t12, t13, i12);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!s(t13, i13, i12)) {
                        break;
                    } else {
                        r1.x(t12, j12, r1.f362946c.m(t13, j12));
                        Q(t12, i13, i12);
                        break;
                    }
                case 68:
                    x(t12, t13, i12);
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.protobuf.T0
    public final T newInstance() {
        return (T) this.f363026l.newInstance(this.f363019e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o(AbstractC37663a abstractC37663a) {
        int i12;
        int iL2;
        int iJ2;
        int iO2;
        Unsafe unsafe = f363014r;
        int i13 = 0;
        int iH2 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (true) {
            int[] iArr = this.f363015a;
            if (i13 >= iArr.length) {
                m1<?, ?> m1Var = this.f363028n;
                int iH3 = iH2 + m1Var.h(m1Var.g(abstractC37663a));
                return this.f363020f ? iH3 + this.f363029o.c(abstractC37663a).i() : iH3;
            }
            int iV2 = V(i13);
            int i16 = iArr[i13];
            int iU2 = U(iV2);
            if (iU2 <= 17) {
                int i17 = iArr[i13 + 2];
                int i18 = i17 & 1048575;
                i12 = 1 << (i17 >>> 20);
                if (i18 != i15) {
                    i14 = unsafe.getInt(abstractC37663a, i18);
                    i15 = i18;
                }
            } else {
                i12 = 0;
            }
            long j12 = iV2 & 1048575;
            switch (iU2) {
                case 0:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.l(i16);
                        iH2 += iL2;
                        break;
                    }
                case 1:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.p(i16);
                        iH2 += iL2;
                        break;
                    }
                case 2:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.t(i16, unsafe.getLong(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 3:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.E(i16, unsafe.getLong(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 4:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.r(i16, unsafe.getInt(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 5:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.o(i16);
                        iH2 += iL2;
                        break;
                    }
                case 6:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.n(i16);
                        iH2 += iL2;
                        break;
                    }
                case 7:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.i(i16);
                        iH2 += iL2;
                        break;
                    }
                case 8:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC37663a, j12);
                        iJ2 = object instanceof AbstractC37700t ? CodedOutputStream.j(i16, (AbstractC37700t) object) : CodedOutputStream.z(i16, (String) object);
                        iH2 = iJ2 + iH2;
                        break;
                    }
                case 9:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iO2 = V0.o(i16, unsafe.getObject(abstractC37663a, j12), m(i13));
                        iH2 += iO2;
                        break;
                    }
                case 10:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.j(i16, (AbstractC37700t) unsafe.getObject(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 11:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.C(i16, unsafe.getInt(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 12:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.m(i16, unsafe.getInt(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 13:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.v(i16);
                        iH2 += iL2;
                        break;
                    }
                case 14:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.w(i16);
                        iH2 += iL2;
                        break;
                    }
                case 15:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.x(i16, unsafe.getInt(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 16:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.y(i16, unsafe.getLong(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 17:
                    if ((i12 & i14) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.q(i16, (InterfaceC37707w0) unsafe.getObject(abstractC37663a, j12), m(i13));
                        iH2 += iL2;
                        break;
                    }
                case 18:
                    iO2 = V0.h(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 19:
                    iO2 = V0.f(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 20:
                    iO2 = V0.m(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 21:
                    iO2 = V0.x(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 22:
                    iO2 = V0.k(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 23:
                    iO2 = V0.h(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    iO2 = V0.f(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    iO2 = V0.a(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    iO2 = V0.u(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    iO2 = V0.p(i16, (List) unsafe.getObject(abstractC37663a, j12), m(i13));
                    iH2 += iO2;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iO2 = V0.c(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iO2 = V0.v(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 30:
                    iO2 = V0.d(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 31:
                    iO2 = V0.f(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 32:
                    iO2 = V0.h(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 33:
                    iO2 = V0.q(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 34:
                    iO2 = V0.s(i16, (List) unsafe.getObject(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 35:
                    int i19 = V0.i((List) unsafe.getObject(abstractC37663a, j12));
                    if (i19 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(i19, CodedOutputStream.B(i16), i19, iH2);
                        break;
                    }
                case 36:
                    int iG2 = V0.g((List) unsafe.getObject(abstractC37663a, j12));
                    if (iG2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iG2, CodedOutputStream.B(i16), iG2, iH2);
                        break;
                    }
                case 37:
                    int iN2 = V0.n((List) unsafe.getObject(abstractC37663a, j12));
                    if (iN2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iN2, CodedOutputStream.B(i16), iN2, iH2);
                        break;
                    }
                case 38:
                    int iY2 = V0.y((List) unsafe.getObject(abstractC37663a, j12));
                    if (iY2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iY2, CodedOutputStream.B(i16), iY2, iH2);
                        break;
                    }
                case 39:
                    int iL3 = V0.l((List) unsafe.getObject(abstractC37663a, j12));
                    if (iL3 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iL3, CodedOutputStream.B(i16), iL3, iH2);
                        break;
                    }
                case 40:
                    int i22 = V0.i((List) unsafe.getObject(abstractC37663a, j12));
                    if (i22 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(i22, CodedOutputStream.B(i16), i22, iH2);
                        break;
                    }
                case 41:
                    int iG3 = V0.g((List) unsafe.getObject(abstractC37663a, j12));
                    if (iG3 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iG3, CodedOutputStream.B(i16), iG3, iH2);
                        break;
                    }
                case 42:
                    int iB2 = V0.b((List) unsafe.getObject(abstractC37663a, j12));
                    if (iB2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iB2, CodedOutputStream.B(i16), iB2, iH2);
                        break;
                    }
                case 43:
                    int iW2 = V0.w((List) unsafe.getObject(abstractC37663a, j12));
                    if (iW2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iW2, CodedOutputStream.B(i16), iW2, iH2);
                        break;
                    }
                case 44:
                    int iE2 = V0.e((List) unsafe.getObject(abstractC37663a, j12));
                    if (iE2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iE2, CodedOutputStream.B(i16), iE2, iH2);
                        break;
                    }
                case 45:
                    int iG4 = V0.g((List) unsafe.getObject(abstractC37663a, j12));
                    if (iG4 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iG4, CodedOutputStream.B(i16), iG4, iH2);
                        break;
                    }
                case 46:
                    int i23 = V0.i((List) unsafe.getObject(abstractC37663a, j12));
                    if (i23 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(i23, CodedOutputStream.B(i16), i23, iH2);
                        break;
                    }
                case 47:
                    int iR2 = V0.r((List) unsafe.getObject(abstractC37663a, j12));
                    if (iR2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iR2, CodedOutputStream.B(i16), iR2, iH2);
                        break;
                    }
                case 48:
                    int iT2 = V0.t((List) unsafe.getObject(abstractC37663a, j12));
                    if (iT2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iT2, CodedOutputStream.B(i16), iT2, iH2);
                        break;
                    }
                case 49:
                    iO2 = V0.j(i16, (List) unsafe.getObject(abstractC37663a, j12), m(i13));
                    iH2 += iO2;
                    break;
                case 50:
                    iO2 = this.f363030p.getSerializedSize(i16, unsafe.getObject(abstractC37663a, j12), l(i13));
                    iH2 += iO2;
                    break;
                case 51:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.l(i16);
                        iH2 += iL2;
                        break;
                    }
                case 52:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.p(i16);
                        iH2 += iL2;
                        break;
                    }
                case 53:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.t(i16, E(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 54:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.E(i16, E(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 55:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.r(i16, D(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 56:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.o(i16);
                        iH2 += iL2;
                        break;
                    }
                case 57:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.n(i16);
                        iH2 += iL2;
                        break;
                    }
                case 58:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.i(i16);
                        iH2 += iL2;
                        break;
                    }
                case 59:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(abstractC37663a, j12);
                        iJ2 = object2 instanceof AbstractC37700t ? CodedOutputStream.j(i16, (AbstractC37700t) object2) : CodedOutputStream.z(i16, (String) object2);
                        iH2 = iJ2 + iH2;
                        break;
                    }
                case 60:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iO2 = V0.o(i16, unsafe.getObject(abstractC37663a, j12), m(i13));
                        iH2 += iO2;
                        break;
                    }
                case 61:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.j(i16, (AbstractC37700t) unsafe.getObject(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 62:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.C(i16, D(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 63:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.m(i16, D(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 64:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.v(i16);
                        iH2 += iL2;
                        break;
                    }
                case 65:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.w(i16);
                        iH2 += iL2;
                        break;
                    }
                case 66:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.x(i16, D(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 67:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.y(i16, E(abstractC37663a, j12));
                        iH2 += iL2;
                        break;
                    }
                case 68:
                    if (!s(abstractC37663a, i16, i13)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.q(i16, (InterfaceC37707w0) unsafe.getObject(abstractC37663a, j12), m(i13));
                        iH2 += iL2;
                        break;
                    }
            }
            i13 += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int p(AbstractC37663a abstractC37663a) {
        int iL2;
        int iO2;
        Unsafe unsafe = f363014r;
        int i12 = 0;
        int iH2 = 0;
        while (true) {
            int[] iArr = this.f363015a;
            if (i12 >= iArr.length) {
                m1<?, ?> m1Var = this.f363028n;
                return iH2 + m1Var.h(m1Var.g(abstractC37663a));
            }
            int iV2 = V(i12);
            int iU2 = U(iV2);
            int i13 = iArr[i12];
            long j12 = iV2 & 1048575;
            if (iU2 >= FieldType.f362653f.a() && iU2 <= FieldType.f362654g.a()) {
                int i14 = iArr[i12 + 2];
            }
            switch (iU2) {
                case 0:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.l(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 1:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.p(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 2:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.t(i13, r1.l(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 3:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.E(i13, r1.l(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 4:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.r(i13, r1.k(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 5:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.o(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 6:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.n(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 7:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.i(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 8:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        Object objM = r1.m(abstractC37663a, j12);
                        iL2 = objM instanceof AbstractC37700t ? CodedOutputStream.j(i13, (AbstractC37700t) objM) : CodedOutputStream.z(i13, (String) objM);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 9:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iO2 = V0.o(i13, r1.m(abstractC37663a, j12), m(i12));
                        iH2 += iO2;
                        break;
                    }
                case 10:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.j(i13, (AbstractC37700t) r1.m(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 11:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.C(i13, r1.k(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 12:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.m(i13, r1.k(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 13:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.v(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 14:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.w(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 15:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.x(i13, r1.k(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 16:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.y(i13, r1.l(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 17:
                    if (!q(abstractC37663a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.q(i13, (InterfaceC37707w0) r1.m(abstractC37663a, j12), m(i12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 18:
                    iO2 = V0.h(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 19:
                    iO2 = V0.f(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 20:
                    iO2 = V0.m(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 21:
                    iO2 = V0.x(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 22:
                    iO2 = V0.k(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 23:
                    iO2 = V0.h(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    iO2 = V0.f(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    iO2 = V0.a(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    iO2 = V0.u(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    iO2 = V0.p(i13, t(abstractC37663a, j12), m(i12));
                    iH2 += iO2;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iO2 = V0.c(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iO2 = V0.v(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 30:
                    iO2 = V0.d(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 31:
                    iO2 = V0.f(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 32:
                    iO2 = V0.h(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 33:
                    iO2 = V0.q(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 34:
                    iO2 = V0.s(i13, t(abstractC37663a, j12));
                    iH2 += iO2;
                    break;
                case 35:
                    int i15 = V0.i((List) unsafe.getObject(abstractC37663a, j12));
                    if (i15 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(i15, CodedOutputStream.B(i13), i15, iH2);
                        break;
                    }
                case 36:
                    int iG2 = V0.g((List) unsafe.getObject(abstractC37663a, j12));
                    if (iG2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iG2, CodedOutputStream.B(i13), iG2, iH2);
                        break;
                    }
                case 37:
                    int iN2 = V0.n((List) unsafe.getObject(abstractC37663a, j12));
                    if (iN2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iN2, CodedOutputStream.B(i13), iN2, iH2);
                        break;
                    }
                case 38:
                    int iY2 = V0.y((List) unsafe.getObject(abstractC37663a, j12));
                    if (iY2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iY2, CodedOutputStream.B(i13), iY2, iH2);
                        break;
                    }
                case 39:
                    int iL3 = V0.l((List) unsafe.getObject(abstractC37663a, j12));
                    if (iL3 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iL3, CodedOutputStream.B(i13), iL3, iH2);
                        break;
                    }
                case 40:
                    int i16 = V0.i((List) unsafe.getObject(abstractC37663a, j12));
                    if (i16 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(i16, CodedOutputStream.B(i13), i16, iH2);
                        break;
                    }
                case 41:
                    int iG3 = V0.g((List) unsafe.getObject(abstractC37663a, j12));
                    if (iG3 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iG3, CodedOutputStream.B(i13), iG3, iH2);
                        break;
                    }
                case 42:
                    int iB2 = V0.b((List) unsafe.getObject(abstractC37663a, j12));
                    if (iB2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iB2, CodedOutputStream.B(i13), iB2, iH2);
                        break;
                    }
                case 43:
                    int iW2 = V0.w((List) unsafe.getObject(abstractC37663a, j12));
                    if (iW2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iW2, CodedOutputStream.B(i13), iW2, iH2);
                        break;
                    }
                case 44:
                    int iE2 = V0.e((List) unsafe.getObject(abstractC37663a, j12));
                    if (iE2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iE2, CodedOutputStream.B(i13), iE2, iH2);
                        break;
                    }
                case 45:
                    int iG4 = V0.g((List) unsafe.getObject(abstractC37663a, j12));
                    if (iG4 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iG4, CodedOutputStream.B(i13), iG4, iH2);
                        break;
                    }
                case 46:
                    int i17 = V0.i((List) unsafe.getObject(abstractC37663a, j12));
                    if (i17 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(i17, CodedOutputStream.B(i13), i17, iH2);
                        break;
                    }
                case 47:
                    int iR2 = V0.r((List) unsafe.getObject(abstractC37663a, j12));
                    if (iR2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iR2, CodedOutputStream.B(i13), iR2, iH2);
                        break;
                    }
                case 48:
                    int iT2 = V0.t((List) unsafe.getObject(abstractC37663a, j12));
                    if (iT2 <= 0) {
                        break;
                    } else {
                        iH2 = com.google.firebase.components.g.h(iT2, CodedOutputStream.B(i13), iT2, iH2);
                        break;
                    }
                case 49:
                    iO2 = V0.j(i13, t(abstractC37663a, j12), m(i12));
                    iH2 += iO2;
                    break;
                case 50:
                    iO2 = this.f363030p.getSerializedSize(i13, r1.m(abstractC37663a, j12), l(i12));
                    iH2 += iO2;
                    break;
                case 51:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.l(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 52:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.p(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 53:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.t(i13, E(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 54:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.E(i13, E(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 55:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.r(i13, D(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 56:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.o(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 57:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.n(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 58:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.i(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 59:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        Object objM2 = r1.m(abstractC37663a, j12);
                        iL2 = objM2 instanceof AbstractC37700t ? CodedOutputStream.j(i13, (AbstractC37700t) objM2) : CodedOutputStream.z(i13, (String) objM2);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 60:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iO2 = V0.o(i13, r1.m(abstractC37663a, j12), m(i12));
                        iH2 += iO2;
                        break;
                    }
                case 61:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.j(i13, (AbstractC37700t) r1.m(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 62:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.C(i13, D(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 63:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.m(i13, D(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 64:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.v(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 65:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.w(i13);
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 66:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.x(i13, D(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 67:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.y(i13, E(abstractC37663a, j12));
                        iH2 = iL2 + iH2;
                        break;
                    }
                case 68:
                    if (!s(abstractC37663a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.q(i13, (InterfaceC37707w0) r1.m(abstractC37663a, j12), m(i12));
                        iH2 = iL2 + iH2;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    public final boolean q(T t12, int i12) {
        int i13 = this.f363015a[i12 + 2];
        long j12 = i13 & 1048575;
        if (j12 != 1048575) {
            return (r1.f362946c.j(t12, j12) & (1 << (i13 >>> 20))) != 0;
        }
        int iV2 = V(i12);
        long j13 = iV2 & 1048575;
        switch (U(iV2)) {
            case 0:
                return Double.doubleToRawLongBits(r1.f362946c.h(t12, j13)) != 0;
            case 1:
                return Float.floatToRawIntBits(r1.f362946c.i(t12, j13)) != 0;
            case 2:
                return r1.f362946c.l(t12, j13) != 0;
            case 3:
                return r1.f362946c.l(t12, j13) != 0;
            case 4:
                return r1.f362946c.j(t12, j13) != 0;
            case 5:
                return r1.f362946c.l(t12, j13) != 0;
            case 6:
                return r1.f362946c.j(t12, j13) != 0;
            case 7:
                return r1.f362946c.e(t12, j13);
            case 8:
                Object objM = r1.f362946c.m(t12, j13);
                if (objM instanceof String) {
                    return !((String) objM).isEmpty();
                }
                if (objM instanceof AbstractC37700t) {
                    return !AbstractC37700t.f362954c.equals(objM);
                }
                throw new IllegalArgumentException();
            case 9:
                return r1.f362946c.m(t12, j13) != null;
            case 10:
                return !AbstractC37700t.f362954c.equals(r1.f362946c.m(t12, j13));
            case 11:
                return r1.f362946c.j(t12, j13) != 0;
            case 12:
                return r1.f362946c.j(t12, j13) != 0;
            case 13:
                return r1.f362946c.j(t12, j13) != 0;
            case 14:
                return r1.f362946c.l(t12, j13) != 0;
            case 15:
                return r1.f362946c.j(t12, j13) != 0;
            case 16:
                return r1.f362946c.l(t12, j13) != 0;
            case 17:
                return r1.f362946c.m(t12, j13) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(T t12, int i12, int i13) {
        return r1.f362946c.j(t12, (long) (this.f363015a[i13 + 2] & 1048575)) == i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x061b A[Catch: all -> 0x0647, TryCatch #0 {all -> 0x0647, blocks: (B:177:0x0616, B:179:0x061b, B:180:0x0620), top: B:202:0x0616 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0655 A[LOOP:3: B:194:0x0653->B:195:0x0655, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0626 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <UT, UB, ET extends com.google.protobuf.V.c<ET>> void u(com.google.protobuf.m1<UT, UB> r20, com.google.protobuf.N<ET> r21, T r22, com.google.protobuf.R0 r23, com.google.protobuf.M r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C37713z0.u(com.google.protobuf.m1, com.google.protobuf.N, java.lang.Object, com.google.protobuf.R0, com.google.protobuf.M):void");
    }

    public final <K, V> void v(Object obj, int i12, Object obj2, M m12, R0 r02) {
        long jV2 = V(i12) & 1048575;
        Object objM = r1.f362946c.m(obj, jV2);
        InterfaceC37697r0 interfaceC37697r0 = this.f363030p;
        if (objM == null) {
            objM = interfaceC37697r0.a();
            r1.x(obj, jV2, objM);
        } else if (interfaceC37697r0.isImmutable(objM)) {
            C37696q0 c37696q0A = interfaceC37697r0.a();
            interfaceC37697r0.mergeFrom(c37696q0A, objM);
            r1.x(obj, jV2, c37696q0A);
            objM = c37696q0A;
        }
        r02.e(interfaceC37697r0.forMutableMapData(objM), interfaceC37697r0.forMapMetadata(obj2), m12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(T t12, T t13, int i12) {
        if (q(t13, i12)) {
            long jV2 = V(i12) & 1048575;
            Unsafe unsafe = f363014r;
            Object object = unsafe.getObject(t13, jV2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f363015a[i12] + " is present but null: " + t13);
            }
            T0 t0M = m(i12);
            if (!q(t12, i12)) {
                if (r(object)) {
                    Object objNewInstance = t0M.newInstance();
                    t0M.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t12, jV2, objNewInstance);
                } else {
                    unsafe.putObject(t12, jV2, object);
                }
                P(t12, i12);
                return;
            }
            Object object2 = unsafe.getObject(t12, jV2);
            if (!r(object2)) {
                Object objNewInstance2 = t0M.newInstance();
                t0M.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t12, jV2, objNewInstance2);
                object2 = objNewInstance2;
            }
            t0M.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(T t12, T t13, int i12) {
        int[] iArr = this.f363015a;
        int i13 = iArr[i12];
        if (s(t13, i13, i12)) {
            long jV2 = V(i12) & 1048575;
            Unsafe unsafe = f363014r;
            Object object = unsafe.getObject(t13, jV2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i12] + " is present but null: " + t13);
            }
            T0 t0M = m(i12);
            if (!s(t12, i13, i12)) {
                if (r(object)) {
                    Object objNewInstance = t0M.newInstance();
                    t0M.mergeFrom(objNewInstance, object);
                    unsafe.putObject(t12, jV2, objNewInstance);
                } else {
                    unsafe.putObject(t12, jV2, object);
                }
                Q(t12, i13, i12);
                return;
            }
            Object object2 = unsafe.getObject(t12, jV2);
            if (!r(object2)) {
                Object objNewInstance2 = t0M.newInstance();
                t0M.mergeFrom(objNewInstance2, object2);
                unsafe.putObject(t12, jV2, objNewInstance2);
                object2 = objNewInstance2;
            }
            t0M.mergeFrom(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object y(T t12, int i12) {
        T0 t0M = m(i12);
        long jV2 = V(i12) & 1048575;
        if (!q(t12, i12)) {
            return t0M.newInstance();
        }
        Object object = f363014r.getObject(t12, jV2);
        if (r(object)) {
            return object;
        }
        Object objNewInstance = t0M.newInstance();
        if (object != null) {
            t0M.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(T t12, int i12, int i13) {
        T0 t0M = m(i13);
        if (!s(t12, i12, i13)) {
            return t0M.newInstance();
        }
        Object object = f363014r.getObject(t12, V(i13) & 1048575);
        if (r(object)) {
            return object;
        }
        Object objNewInstance = t0M.newInstance();
        if (object != null) {
            t0M.mergeFrom(objNewInstance, object);
        }
        return objNewInstance;
    }
}
