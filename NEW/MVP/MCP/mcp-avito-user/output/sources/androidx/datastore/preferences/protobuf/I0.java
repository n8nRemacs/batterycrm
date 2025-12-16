package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22934w;
import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.C22939y0;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.K1;
import androidx.datastore.preferences.protobuf.WireFormat;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes.dex */
final class I0<T> implements InterfaceC22897g1<T> {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f45678q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    public static final Unsafe f45679r = K1.m();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f45680a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f45681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45682c;

    /* renamed from: d, reason: collision with root package name */
    public final int f45683d;

    /* renamed from: e, reason: collision with root package name */
    public final F0 f45684e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f45685f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f45686g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f45687h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f45688i;

    /* renamed from: j, reason: collision with root package name */
    public final int f45689j;

    /* renamed from: k, reason: collision with root package name */
    public final int f45690k;

    /* renamed from: l, reason: collision with root package name */
    public final P0 f45691l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC22929t0 f45692m;

    /* renamed from: n, reason: collision with root package name */
    public final G1<?, ?> f45693n;

    /* renamed from: o, reason: collision with root package name */
    public final U<?> f45694o;

    /* renamed from: p, reason: collision with root package name */
    public final A0 f45695p;

    /* compiled from: MessageSchema.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45696a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f45696a = iArr;
            try {
                iArr[WireFormat.FieldType.f45765k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45696a[WireFormat.FieldType.f45769o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45696a[WireFormat.FieldType.f45758d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45696a[WireFormat.FieldType.f45764j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45696a[WireFormat.FieldType.f45772r.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45696a[WireFormat.FieldType.f45763i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45696a[WireFormat.FieldType.f45773s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45696a[WireFormat.FieldType.f45759e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45696a[WireFormat.FieldType.f45771q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45696a[WireFormat.FieldType.f45762h.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45696a[WireFormat.FieldType.f45770p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45696a[WireFormat.FieldType.f45760f.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45696a[WireFormat.FieldType.f45761g.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45696a[WireFormat.FieldType.f45768n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45696a[WireFormat.FieldType.f45774t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45696a[WireFormat.FieldType.f45775u.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45696a[WireFormat.FieldType.f45766l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public I0(int[] iArr, Object[] objArr, int i12, int i13, F0 f02, boolean z12, int[] iArr2, int i14, int i15, P0 p02, AbstractC22929t0 abstractC22929t0, G1 g12, U u12, A0 a02) {
        this.f45680a = iArr;
        this.f45681b = objArr;
        this.f45682c = i12;
        this.f45683d = i13;
        this.f45686g = f02 instanceof GeneratedMessageLite;
        this.f45687h = z12;
        this.f45685f = u12 != null && u12.e(f02);
        this.f45688i = iArr2;
        this.f45689j = i14;
        this.f45690k = i15;
        this.f45691l = p02;
        this.f45692m = abstractC22929t0;
        this.f45693n = g12;
        this.f45694o = u12;
        this.f45684e = f02;
        this.f45695p = a02;
    }

    public static java.lang.reflect.Field D(Class<?> cls, String str) {
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

    public static int H(int i12) {
        return (i12 & 267386880) >>> 20;
    }

    public static void L(int i12, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.writeString(i12, (String) obj);
        } else {
            writer.b(i12, (AbstractC22934w) obj);
        }
    }

    public static List p(AbstractC22877a abstractC22877a, long j12) {
        return (List) K1.f45720d.m(abstractC22877a, j12);
    }

    public static I0 u(D0 d02, P0 p02, AbstractC22929t0 abstractC22929t0, G1 g12, U u12, A0 a02) {
        if (d02 instanceof C22888d1) {
            return v((C22888d1) d02, p02, abstractC22929t0, g12, u12, a02);
        }
        throw null;
    }

    public static <T> I0<T> v(C22888d1 c22888d1, P0 p02, AbstractC22929t0 abstractC22929t0, G1<?, ?> g12, U<?> u12, A0 a02) {
        int i12;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        char cCharAt;
        int i17;
        char cCharAt2;
        int i18;
        char cCharAt3;
        int i19;
        char cCharAt4;
        int i22;
        char cCharAt5;
        int i23;
        char cCharAt6;
        int i24;
        char cCharAt7;
        int i25;
        char cCharAt8;
        int i26;
        int i27;
        int i28;
        int i29;
        int i32;
        int i33;
        int i34;
        int[] iArr2;
        int i35;
        String str;
        int iObjectFieldOffset;
        int i36;
        int i37;
        int iObjectFieldOffset2;
        java.lang.reflect.Field fieldD;
        int i38;
        char cCharAt9;
        int i39;
        int i42;
        int i43;
        java.lang.reflect.Field fieldD2;
        java.lang.reflect.Field fieldD3;
        int i44;
        char cCharAt10;
        int i45;
        char cCharAt11;
        int i46;
        char cCharAt12;
        int i47;
        char cCharAt13;
        char cCharAt14;
        int i48 = 0;
        boolean z12 = c22888d1.getSyntax() == ProtoSyntax.f45736c;
        String strB = c22888d1.b();
        int length = strB.length();
        int iCharAt4 = strB.charAt(0);
        if (iCharAt4 >= 55296) {
            int i49 = iCharAt4 & 8191;
            int i52 = 1;
            int i53 = 13;
            while (true) {
                i12 = i52 + 1;
                cCharAt14 = strB.charAt(i52);
                if (cCharAt14 < 55296) {
                    break;
                }
                i49 |= (cCharAt14 & 8191) << i53;
                i53 += 13;
                i52 = i12;
            }
            iCharAt4 = i49 | (cCharAt14 << i53);
        } else {
            i12 = 1;
        }
        int i54 = i12 + 1;
        int iCharAt5 = strB.charAt(i12);
        if (iCharAt5 >= 55296) {
            int i55 = iCharAt5 & 8191;
            int i56 = 13;
            while (true) {
                i47 = i54 + 1;
                cCharAt13 = strB.charAt(i54);
                if (cCharAt13 < 55296) {
                    break;
                }
                i55 |= (cCharAt13 & 8191) << i56;
                i56 += 13;
                i54 = i47;
            }
            iCharAt5 = i55 | (cCharAt13 << i56);
            i54 = i47;
        }
        if (iCharAt5 == 0) {
            i15 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i13 = 0;
            iCharAt3 = 0;
            iArr = f45678q;
            i14 = 0;
        } else {
            int i57 = i54 + 1;
            int iCharAt6 = strB.charAt(i54);
            if (iCharAt6 >= 55296) {
                int i58 = iCharAt6 & 8191;
                int i59 = 13;
                while (true) {
                    i25 = i57 + 1;
                    cCharAt8 = strB.charAt(i57);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt8 & 8191) << i59;
                    i59 += 13;
                    i57 = i25;
                }
                iCharAt6 = i58 | (cCharAt8 << i59);
                i57 = i25;
            }
            int i62 = i57 + 1;
            int iCharAt7 = strB.charAt(i57);
            if (iCharAt7 >= 55296) {
                int i63 = iCharAt7 & 8191;
                int i64 = 13;
                while (true) {
                    i24 = i62 + 1;
                    cCharAt7 = strB.charAt(i62);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt7 & 8191) << i64;
                    i64 += 13;
                    i62 = i24;
                }
                iCharAt7 = i63 | (cCharAt7 << i64);
                i62 = i24;
            }
            int i65 = i62 + 1;
            int iCharAt8 = strB.charAt(i62);
            if (iCharAt8 >= 55296) {
                int i66 = iCharAt8 & 8191;
                int i67 = 13;
                while (true) {
                    i23 = i65 + 1;
                    cCharAt6 = strB.charAt(i65);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt6 & 8191) << i67;
                    i67 += 13;
                    i65 = i23;
                }
                iCharAt8 = i66 | (cCharAt6 << i67);
                i65 = i23;
            }
            int i68 = i65 + 1;
            iCharAt = strB.charAt(i65);
            if (iCharAt >= 55296) {
                int i69 = iCharAt & 8191;
                int i72 = 13;
                while (true) {
                    i22 = i68 + 1;
                    cCharAt5 = strB.charAt(i68);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i69 |= (cCharAt5 & 8191) << i72;
                    i72 += 13;
                    i68 = i22;
                }
                iCharAt = i69 | (cCharAt5 << i72);
                i68 = i22;
            }
            int i73 = i68 + 1;
            int iCharAt9 = strB.charAt(i68);
            if (iCharAt9 >= 55296) {
                int i74 = iCharAt9 & 8191;
                int i75 = 13;
                while (true) {
                    i19 = i73 + 1;
                    cCharAt4 = strB.charAt(i73);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt4 & 8191) << i75;
                    i75 += 13;
                    i73 = i19;
                }
                iCharAt9 = i74 | (cCharAt4 << i75);
                i73 = i19;
            }
            int i76 = i73 + 1;
            iCharAt2 = strB.charAt(i73);
            if (iCharAt2 >= 55296) {
                int i77 = iCharAt2 & 8191;
                int i78 = 13;
                while (true) {
                    i18 = i76 + 1;
                    cCharAt3 = strB.charAt(i76);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i77 |= (cCharAt3 & 8191) << i78;
                    i78 += 13;
                    i76 = i18;
                }
                iCharAt2 = i77 | (cCharAt3 << i78);
                i76 = i18;
            }
            int i79 = i76 + 1;
            int iCharAt10 = strB.charAt(i76);
            if (iCharAt10 >= 55296) {
                int i82 = iCharAt10 & 8191;
                int i83 = 13;
                while (true) {
                    i17 = i79 + 1;
                    cCharAt2 = strB.charAt(i79);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i82 |= (cCharAt2 & 8191) << i83;
                    i83 += 13;
                    i79 = i17;
                }
                iCharAt10 = i82 | (cCharAt2 << i83);
                i79 = i17;
            }
            int i84 = i79 + 1;
            iCharAt3 = strB.charAt(i79);
            if (iCharAt3 >= 55296) {
                int i85 = iCharAt3 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i16 = i86 + 1;
                    cCharAt = strB.charAt(i86);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i85 |= (cCharAt & 8191) << i87;
                    i87 += 13;
                    i86 = i16;
                }
                iCharAt3 = i85 | (cCharAt << i87);
                i84 = i16;
            }
            int[] iArr3 = new int[iCharAt3 + iCharAt2 + iCharAt10];
            i13 = (iCharAt6 * 2) + iCharAt7;
            i14 = iCharAt6;
            i54 = i84;
            int i88 = iCharAt9;
            iArr = iArr3;
            i48 = iCharAt8;
            i15 = i88;
        }
        Unsafe unsafe = f45679r;
        Object[] objArrA = c22888d1.a();
        Class<?> cls = c22888d1.getDefaultInstance().getClass();
        int[] iArr4 = new int[i15 * 3];
        int i89 = i54;
        Object[] objArr = new Object[i15 * 2];
        int i92 = iCharAt2 + iCharAt3;
        int i93 = i92;
        int i94 = iCharAt3;
        int i95 = 0;
        int i96 = 0;
        int i97 = i13;
        int i98 = i89;
        while (i98 < length) {
            int i99 = i98 + 1;
            int iCharAt11 = strB.charAt(i98);
            int i100 = length;
            if (iCharAt11 >= 55296) {
                int i101 = iCharAt11 & 8191;
                int i102 = i99;
                int i103 = 13;
                while (true) {
                    i46 = i102 + 1;
                    cCharAt12 = strB.charAt(i102);
                    i26 = i92;
                    if (cCharAt12 < 55296) {
                        break;
                    }
                    i101 |= (cCharAt12 & 8191) << i103;
                    i103 += 13;
                    i102 = i46;
                    i92 = i26;
                }
                iCharAt11 = i101 | (cCharAt12 << i103);
                i27 = i46;
            } else {
                i26 = i92;
                i27 = i99;
            }
            int i104 = i27 + 1;
            int iCharAt12 = strB.charAt(i27);
            if (iCharAt12 >= 55296) {
                int i105 = iCharAt12 & 8191;
                int i106 = i104;
                int i107 = 13;
                while (true) {
                    i45 = i106 + 1;
                    cCharAt11 = strB.charAt(i106);
                    i28 = iCharAt3;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i105 |= (cCharAt11 & 8191) << i107;
                    i107 += 13;
                    i106 = i45;
                    iCharAt3 = i28;
                }
                iCharAt12 = i105 | (cCharAt11 << i107);
                i29 = i45;
            } else {
                i28 = iCharAt3;
                i29 = i104;
            }
            int i108 = iCharAt12 & 255;
            boolean z13 = z12;
            if ((iCharAt12 & 1024) != 0) {
                iArr[i96] = i95;
                i96++;
            }
            if (i108 >= 51) {
                int i109 = i29 + 1;
                int iCharAt13 = strB.charAt(i29);
                char c12 = 55296;
                if (iCharAt13 >= 55296) {
                    int i110 = 13;
                    int i111 = iCharAt13 & 8191;
                    int i112 = i109;
                    while (true) {
                        i44 = i112 + 1;
                        cCharAt10 = strB.charAt(i112);
                        if (cCharAt10 < c12) {
                            break;
                        }
                        i111 |= (cCharAt10 & 8191) << i110;
                        i110 += 13;
                        i112 = i44;
                        c12 = 55296;
                    }
                    iCharAt13 = i111 | (cCharAt10 << i110);
                    i42 = i44;
                } else {
                    i42 = i109;
                }
                int i113 = i42;
                int i114 = i108 - 51;
                i33 = iCharAt;
                if (i114 == 9 || i114 == 17) {
                    i32 = i48;
                    i43 = 2;
                    objArr[androidx.compose.ui.graphics.colorspace.e.x(i95, 3, 2, 1)] = objArrA[i97];
                    i97++;
                } else if (i114 == 12 && (iCharAt4 & 1) == 1) {
                    i32 = i48;
                    i43 = 2;
                    objArr[androidx.compose.ui.graphics.colorspace.e.x(i95, 3, 2, 1)] = objArrA[i97];
                    i97++;
                } else {
                    i32 = i48;
                    i43 = 2;
                }
                int i115 = iCharAt13 * i43;
                Object obj = objArrA[i115];
                if (obj instanceof java.lang.reflect.Field) {
                    fieldD2 = (java.lang.reflect.Field) obj;
                } else {
                    fieldD2 = D(cls, (String) obj);
                    objArrA[i115] = fieldD2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD2);
                int i116 = i115 + 1;
                Object obj2 = objArrA[i116];
                if (obj2 instanceof java.lang.reflect.Field) {
                    fieldD3 = (java.lang.reflect.Field) obj2;
                } else {
                    fieldD3 = D(cls, (String) obj2);
                    objArrA[i116] = fieldD3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD3);
                str = strB;
                i34 = iCharAt12;
                iArr2 = iArr4;
                i37 = i97;
                i29 = i113;
                i36 = 0;
            } else {
                i32 = i48;
                i33 = iCharAt;
                int i117 = i97 + 1;
                java.lang.reflect.Field fieldD4 = D(cls, (String) objArrA[i97]);
                if (i108 == 9 || i108 == 17) {
                    i34 = iCharAt12;
                    iArr2 = iArr4;
                    i35 = 1;
                    objArr[androidx.compose.ui.graphics.colorspace.e.x(i95, 3, 2, 1)] = fieldD4.getType();
                } else {
                    if (i108 == 27 || i108 == 49) {
                        i34 = iCharAt12;
                        iArr2 = iArr4;
                        i35 = 1;
                        i39 = i97 + 2;
                        objArr[androidx.compose.ui.graphics.colorspace.e.x(i95, 3, 2, 1)] = objArrA[i117];
                    } else if (i108 == 12 || i108 == 30 || i108 == 44) {
                        i34 = iCharAt12;
                        i35 = 1;
                        if ((iCharAt4 & 1) == 1) {
                            iArr2 = iArr4;
                            i39 = i97 + 2;
                            objArr[androidx.compose.ui.graphics.colorspace.e.x(i95, 3, 2, 1)] = objArrA[i117];
                        } else {
                            iArr2 = iArr4;
                        }
                    } else {
                        if (i108 == 50) {
                            int i118 = i94 + 1;
                            iArr[i94] = i95;
                            int i119 = (i95 / 3) * 2;
                            int i120 = i97 + 2;
                            objArr[i119] = objArrA[i117];
                            if ((iCharAt12 & 2048) != 0) {
                                i117 = i97 + 3;
                                objArr[i119 + 1] = objArrA[i120];
                                i34 = iCharAt12;
                                iArr2 = iArr4;
                                i94 = i118;
                            } else {
                                iArr2 = iArr4;
                                i94 = i118;
                                i117 = i120;
                                i34 = iCharAt12;
                            }
                        } else {
                            i34 = iCharAt12;
                            iArr2 = iArr4;
                        }
                        i35 = 1;
                    }
                    i117 = i39;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD4);
                if ((iCharAt4 & 1) != i35 || i108 > 17) {
                    str = strB;
                    iObjectFieldOffset = 0;
                    i36 = 0;
                } else {
                    int i121 = i29 + 1;
                    int iCharAt14 = strB.charAt(i29);
                    if (iCharAt14 >= 55296) {
                        int i122 = iCharAt14 & 8191;
                        int i123 = 13;
                        while (true) {
                            i38 = i121 + 1;
                            cCharAt9 = strB.charAt(i121);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i122 |= (cCharAt9 & 8191) << i123;
                            i123 += 13;
                            i121 = i38;
                        }
                        iCharAt14 = i122 | (cCharAt9 << i123);
                        i121 = i38;
                    }
                    int i124 = (iCharAt14 / 32) + (i14 * 2);
                    Object obj3 = objArrA[i124];
                    if (obj3 instanceof java.lang.reflect.Field) {
                        fieldD = (java.lang.reflect.Field) obj3;
                    } else {
                        fieldD = D(cls, (String) obj3);
                        objArrA[i124] = fieldD;
                    }
                    str = strB;
                    i36 = iCharAt14 % 32;
                    i29 = i121;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD);
                }
                if (i108 >= 18 && i108 <= 49) {
                    iArr[i93] = iObjectFieldOffset3;
                    i93++;
                }
                i37 = i117;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i125 = i95 + 1;
            iArr2[i95] = iCharAt11;
            int i126 = i95 + 2;
            int i127 = i37;
            int i128 = i34;
            iArr2[i125] = ((i128 & 256) != 0 ? 268435456 : 0) | ((i128 & 512) != 0 ? 536870912 : 0) | (i108 << 20) | iObjectFieldOffset2;
            i95 += 3;
            iArr2[i126] = (i36 << 20) | iObjectFieldOffset;
            i98 = i29;
            iArr4 = iArr2;
            strB = str;
            z12 = z13;
            length = i100;
            i97 = i127;
            i92 = i26;
            iCharAt3 = i28;
            iCharAt = i33;
            i48 = i32;
        }
        return new I0<>(iArr4, objArr, i48, iCharAt, c22888d1.getDefaultInstance(), z12, iArr, iCharAt3, i92, p02, abstractC22929t0, g12, u12, a02);
    }

    public static long w(int i12) {
        return i12 & 1048575;
    }

    public static <T> int x(T t12, long j12) {
        return ((Integer) K1.f45720d.m(t12, j12)).intValue();
    }

    public static <T> long y(T t12, long j12) {
        return ((Long) K1.f45720d.m(t12, j12)).longValue();
    }

    public final <E> void A(Object obj, int i12, InterfaceC22891e1 interfaceC22891e1, InterfaceC22897g1<E> interfaceC22897g1, T t12) {
        interfaceC22891e1.b(this.f45692m.c(obj, i12 & 1048575), interfaceC22897g1, t12);
    }

    public final void B(Object obj, int i12, InterfaceC22891e1 interfaceC22891e1) {
        if ((536870912 & i12) != 0) {
            K1.w(obj, i12 & 1048575, interfaceC22891e1.readStringRequireUtf8());
        } else if (this.f45686g) {
            K1.w(obj, i12 & 1048575, interfaceC22891e1.readString());
        } else {
            K1.w(obj, i12 & 1048575, interfaceC22891e1.readBytes());
        }
    }

    public final void C(Object obj, int i12, InterfaceC22891e1 interfaceC22891e1) {
        boolean z12 = (536870912 & i12) != 0;
        AbstractC22929t0 abstractC22929t0 = this.f45692m;
        if (z12) {
            interfaceC22891e1.readStringListRequireUtf8(abstractC22929t0.c(obj, i12 & 1048575));
        } else {
            interfaceC22891e1.readStringList(abstractC22929t0.c(obj, i12 & 1048575));
        }
    }

    public final void E(T t12, int i12) {
        if (this.f45687h) {
            return;
        }
        int i13 = this.f45680a[i12 + 2];
        long j12 = i13 & 1048575;
        K1.u(t12, j12, K1.f45720d.j(t12, j12) | (1 << (i13 >>> 20)));
    }

    public final void F(T t12, int i12, int i13) {
        K1.u(t12, this.f45680a[i13 + 2] & 1048575, i12);
    }

    public final int G(int i12, int i13) {
        int[] iArr = this.f45680a;
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

    public final int I(int i12) {
        return this.f45680a[i12 + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(T r20, androidx.datastore.preferences.protobuf.Writer r21) {
        /*
            Method dump skipped, instructions count: 1280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.I0.J(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    public final <K, V> void K(Writer writer, int i12, Object obj, int i13) {
        if (obj != null) {
            Object objJ = j(i13);
            A0 a02 = this.f45695p;
            writer.c(i12, a02.forMapMetadata(objJ), a02.forMapData(obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final int a(AbstractC22877a abstractC22877a) {
        return this.f45687h ? m(abstractC22877a) : l(abstractC22877a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(androidx.datastore.preferences.protobuf.GeneratedMessageLite r12, androidx.datastore.preferences.protobuf.GeneratedMessageLite r13) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.I0.b(androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.GeneratedMessageLite):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(T r17, androidx.datastore.preferences.protobuf.Writer r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.I0.c(java.lang.Object, androidx.datastore.preferences.protobuf.Writer):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final void d(T t12, InterfaceC22891e1 interfaceC22891e1, T t13) throws Throwable {
        t13.getClass();
        q(this.f45693n, this.f45694o, t12, interfaceC22891e1, t13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final void e(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        generatedMessageLite2.getClass();
        int i12 = 0;
        while (true) {
            int[] iArr = this.f45680a;
            if (i12 >= iArr.length) {
                if (this.f45687h) {
                    return;
                }
                Class<?> cls = C22903i1.f45843a;
                G1<?, ?> g12 = this.f45693n;
                g12.o(generatedMessageLite, g12.k(g12.g(generatedMessageLite), g12.g(generatedMessageLite2)));
                if (this.f45685f) {
                    C22903i1.B(this.f45694o, generatedMessageLite, generatedMessageLite2);
                    return;
                }
                return;
            }
            int I12 = I(i12);
            long j12 = 1048575 & I12;
            int i13 = iArr[i12];
            switch (H(I12)) {
                case 0:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.s(generatedMessageLite, j12, K1.f45720d.h(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 1:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.t(generatedMessageLite, j12, K1.f45720d.i(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 2:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.v(generatedMessageLite, j12, K1.f45720d.l(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 3:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.v(generatedMessageLite, j12, K1.f45720d.l(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 4:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.u(generatedMessageLite, j12, K1.f45720d.j(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 5:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.v(generatedMessageLite, j12, K1.f45720d.l(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 6:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.u(generatedMessageLite, j12, K1.f45720d.j(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 7:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.n(generatedMessageLite, j12, K1.f45720d.e(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 8:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.w(generatedMessageLite, j12, K1.f45720d.m(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 9:
                    s(generatedMessageLite, generatedMessageLite2, i12);
                    break;
                case 10:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.w(generatedMessageLite, j12, K1.f45720d.m(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 11:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.u(generatedMessageLite, j12, K1.f45720d.j(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 12:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.u(generatedMessageLite, j12, K1.f45720d.j(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 13:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.u(generatedMessageLite, j12, K1.f45720d.j(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 14:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.v(generatedMessageLite, j12, K1.f45720d.l(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 15:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.u(generatedMessageLite, j12, K1.f45720d.j(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 16:
                    if (!n(generatedMessageLite2, i12)) {
                        break;
                    } else {
                        K1.v(generatedMessageLite, j12, K1.f45720d.l(generatedMessageLite2, j12));
                        E(generatedMessageLite, i12);
                        break;
                    }
                case 17:
                    s(generatedMessageLite, generatedMessageLite2, i12);
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
                    this.f45692m.b(generatedMessageLite, generatedMessageLite2, j12);
                    break;
                case 50:
                    Class<?> cls2 = C22903i1.f45843a;
                    K1.e eVar = K1.f45720d;
                    K1.w(generatedMessageLite, j12, this.f45695p.mergeFrom(eVar.m(generatedMessageLite, j12), eVar.m(generatedMessageLite2, j12)));
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
                    if (!o(generatedMessageLite2, i13, i12)) {
                        break;
                    } else {
                        K1.w(generatedMessageLite, j12, K1.f45720d.m(generatedMessageLite2, j12));
                        F(generatedMessageLite, i13, i12);
                        break;
                    }
                case 60:
                    t(generatedMessageLite, generatedMessageLite2, i12);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!o(generatedMessageLite2, i13, i12)) {
                        break;
                    } else {
                        K1.w(generatedMessageLite, j12, K1.f45720d.m(generatedMessageLite2, j12));
                        F(generatedMessageLite, i13, i12);
                        break;
                    }
                case 68:
                    t(generatedMessageLite, generatedMessageLite2, i12);
                    break;
            }
            i12 += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[PHI: r3
  0x00e4: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:84:0x0219, B:42:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(androidx.datastore.preferences.protobuf.GeneratedMessageLite r12) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.I0.f(androidx.datastore.preferences.protobuf.GeneratedMessageLite):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i12) {
        return n(generatedMessageLite, i12) == n(generatedMessageLite2, i12);
    }

    public final <UT, UB> UB h(Object obj, int i12, UB ub2, G1<UT, UB> g12) {
        C22914m0.e eVarI;
        int i13 = this.f45680a[i12];
        Object objM = K1.f45720d.m(obj, I(i12) & 1048575);
        if (objM == null || (eVarI = i(i12)) == null) {
            return ub2;
        }
        A0 a02 = this.f45695p;
        C22941z0 c22941z0ForMutableMapData = a02.forMutableMapData(objM);
        C22939y0.b<?, ?> bVarForMapMetadata = a02.forMapMetadata(j(i12));
        Iterator it = c22941z0ForMutableMapData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!eVarI.isInRange(((Integer) entry.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = (UB) g12.m();
                }
                AbstractC22934w.h hVar = new AbstractC22934w.h(C22939y0.a(bVarForMapMetadata, entry.getKey(), entry.getValue()), null);
                CodedOutputStream codedOutputStream = hVar.f45933a;
                try {
                    C22939y0.b(codedOutputStream, bVarForMapMetadata, entry.getKey(), entry.getValue());
                    CodedOutputStream.c cVar = (CodedOutputStream.c) codedOutputStream;
                    if (cVar.f45605e - cVar.f45606f != 0) {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                    g12.d(ub2, i13, new AbstractC22934w.j(hVar.f45934b));
                    it.remove();
                } catch (IOException e12) {
                    throw new RuntimeException(e12);
                }
            }
        }
        return ub2;
    }

    public final C22914m0.e i(int i12) {
        return (C22914m0.e) this.f45681b[androidx.compose.ui.graphics.colorspace.e.x(i12, 3, 2, 1)];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [androidx.datastore.preferences.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInitialized(T r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.I0.isInitialized(java.lang.Object):boolean");
    }

    public final Object j(int i12) {
        return this.f45681b[(i12 / 3) * 2];
    }

    public final InterfaceC22897g1 k(int i12) {
        int i13 = (i12 / 3) * 2;
        Object[] objArr = this.f45681b;
        InterfaceC22897g1 interfaceC22897g1 = (InterfaceC22897g1) objArr[i13];
        if (interfaceC22897g1 != null) {
            return interfaceC22897g1;
        }
        InterfaceC22897g1<T> interfaceC22897g1A = Z0.f45797c.a((Class) objArr[i13 + 1]);
        objArr[i13] = interfaceC22897g1A;
        return interfaceC22897g1A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int l(AbstractC22877a abstractC22877a) {
        int i12;
        int iL2;
        int iJ2;
        int iO2;
        Unsafe unsafe = f45679r;
        int i13 = -1;
        int i14 = 0;
        int iW2 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f45680a;
            if (i14 >= iArr.length) {
                G1<?, ?> g12 = this.f45693n;
                int iH2 = iW2 + g12.h(g12.g(abstractC22877a));
                return this.f45685f ? iH2 + this.f45694o.c(abstractC22877a).e() : iH2;
            }
            int I12 = I(i14);
            int i16 = iArr[i14];
            int iH3 = H(I12);
            if (iH3 <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & 1048575;
                i12 = 1 << (i17 >>> 20);
                if (i18 != i13) {
                    i15 = unsafe.getInt(abstractC22877a, i18);
                    i13 = i18;
                }
            } else {
                i12 = 0;
            }
            long j12 = I12 & 1048575;
            switch (iH3) {
                case 0:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.l(i16);
                        iW2 += iL2;
                        break;
                    }
                case 1:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.p(i16);
                        iW2 += iL2;
                        break;
                    }
                case 2:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.t(i16, unsafe.getLong(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 3:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.E(i16, unsafe.getLong(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 4:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.r(i16, unsafe.getInt(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 5:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.o(i16);
                        iW2 += iL2;
                        break;
                    }
                case 6:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.n(i16);
                        iW2 += iL2;
                        break;
                    }
                case 7:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.i(i16);
                        iW2 += iL2;
                        break;
                    }
                case 8:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC22877a, j12);
                        iJ2 = object instanceof AbstractC22934w ? CodedOutputStream.j(i16, (AbstractC22934w) object) : CodedOutputStream.z(i16, (String) object);
                        iW2 = iJ2 + iW2;
                        break;
                    }
                case 9:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iO2 = C22903i1.o(i16, unsafe.getObject(abstractC22877a, j12), k(i14));
                        iW2 += iO2;
                        break;
                    }
                case 10:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.j(i16, (AbstractC22934w) unsafe.getObject(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 11:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.C(i16, unsafe.getInt(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 12:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.m(i16, unsafe.getInt(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 13:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.v(i16);
                        iW2 += iL2;
                        break;
                    }
                case 14:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.w(i16);
                        iW2 += iL2;
                        break;
                    }
                case 15:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.x(i16, unsafe.getInt(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 16:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.y(i16, unsafe.getLong(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 17:
                    if ((i12 & i15) == 0) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.q(i16, (F0) unsafe.getObject(abstractC22877a, j12), k(i14));
                        iW2 += iL2;
                        break;
                    }
                case 18:
                    iO2 = C22903i1.h(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 19:
                    iO2 = C22903i1.f(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 20:
                    iO2 = C22903i1.m(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 21:
                    iO2 = C22903i1.x(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 22:
                    iO2 = C22903i1.k(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 23:
                    iO2 = C22903i1.h(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    iO2 = C22903i1.f(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    iO2 = C22903i1.a(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    iO2 = C22903i1.u(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    iO2 = C22903i1.p(i16, (List) unsafe.getObject(abstractC22877a, j12), k(i14));
                    iW2 += iO2;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iO2 = C22903i1.c(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iO2 = C22903i1.v(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 30:
                    iO2 = C22903i1.d(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 31:
                    iO2 = C22903i1.f(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 32:
                    iO2 = C22903i1.h(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 33:
                    iO2 = C22903i1.q(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 34:
                    iO2 = C22903i1.s(i16, (List) unsafe.getObject(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 35:
                    int i19 = C22903i1.i((List) unsafe.getObject(abstractC22877a, j12));
                    if (i19 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(i19, CodedOutputStream.B(i16), i19, iW2);
                        break;
                    }
                case 36:
                    int iG2 = C22903i1.g((List) unsafe.getObject(abstractC22877a, j12));
                    if (iG2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iG2, CodedOutputStream.B(i16), iG2, iW2);
                        break;
                    }
                case 37:
                    int iN2 = C22903i1.n((List) unsafe.getObject(abstractC22877a, j12));
                    if (iN2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iN2, CodedOutputStream.B(i16), iN2, iW2);
                        break;
                    }
                case 38:
                    int iY2 = C22903i1.y((List) unsafe.getObject(abstractC22877a, j12));
                    if (iY2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iY2, CodedOutputStream.B(i16), iY2, iW2);
                        break;
                    }
                case 39:
                    int iL3 = C22903i1.l((List) unsafe.getObject(abstractC22877a, j12));
                    if (iL3 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iL3, CodedOutputStream.B(i16), iL3, iW2);
                        break;
                    }
                case 40:
                    int i22 = C22903i1.i((List) unsafe.getObject(abstractC22877a, j12));
                    if (i22 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(i22, CodedOutputStream.B(i16), i22, iW2);
                        break;
                    }
                case 41:
                    int iG3 = C22903i1.g((List) unsafe.getObject(abstractC22877a, j12));
                    if (iG3 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iG3, CodedOutputStream.B(i16), iG3, iW2);
                        break;
                    }
                case 42:
                    int iB2 = C22903i1.b((List) unsafe.getObject(abstractC22877a, j12));
                    if (iB2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iB2, CodedOutputStream.B(i16), iB2, iW2);
                        break;
                    }
                case 43:
                    int iW3 = C22903i1.w((List) unsafe.getObject(abstractC22877a, j12));
                    if (iW3 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iW3, CodedOutputStream.B(i16), iW3, iW2);
                        break;
                    }
                case 44:
                    int iE2 = C22903i1.e((List) unsafe.getObject(abstractC22877a, j12));
                    if (iE2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iE2, CodedOutputStream.B(i16), iE2, iW2);
                        break;
                    }
                case 45:
                    int iG4 = C22903i1.g((List) unsafe.getObject(abstractC22877a, j12));
                    if (iG4 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iG4, CodedOutputStream.B(i16), iG4, iW2);
                        break;
                    }
                case 46:
                    int i23 = C22903i1.i((List) unsafe.getObject(abstractC22877a, j12));
                    if (i23 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(i23, CodedOutputStream.B(i16), i23, iW2);
                        break;
                    }
                case 47:
                    int iR2 = C22903i1.r((List) unsafe.getObject(abstractC22877a, j12));
                    if (iR2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iR2, CodedOutputStream.B(i16), iR2, iW2);
                        break;
                    }
                case 48:
                    int iT2 = C22903i1.t((List) unsafe.getObject(abstractC22877a, j12));
                    if (iT2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iT2, CodedOutputStream.B(i16), iT2, iW2);
                        break;
                    }
                case 49:
                    iO2 = C22903i1.j(i16, (List) unsafe.getObject(abstractC22877a, j12), k(i14));
                    iW2 += iO2;
                    break;
                case 50:
                    iO2 = this.f45695p.getSerializedSize(i16, unsafe.getObject(abstractC22877a, j12), j(i14));
                    iW2 += iO2;
                    break;
                case 51:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.l(i16);
                        iW2 += iL2;
                        break;
                    }
                case 52:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.p(i16);
                        iW2 += iL2;
                        break;
                    }
                case 53:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.t(i16, y(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 54:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.E(i16, y(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 55:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.r(i16, x(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 56:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.o(i16);
                        iW2 += iL2;
                        break;
                    }
                case 57:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.n(i16);
                        iW2 += iL2;
                        break;
                    }
                case 58:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.i(i16);
                        iW2 += iL2;
                        break;
                    }
                case 59:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(abstractC22877a, j12);
                        iJ2 = object2 instanceof AbstractC22934w ? CodedOutputStream.j(i16, (AbstractC22934w) object2) : CodedOutputStream.z(i16, (String) object2);
                        iW2 = iJ2 + iW2;
                        break;
                    }
                case 60:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iO2 = C22903i1.o(i16, unsafe.getObject(abstractC22877a, j12), k(i14));
                        iW2 += iO2;
                        break;
                    }
                case 61:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.j(i16, (AbstractC22934w) unsafe.getObject(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 62:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.C(i16, x(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 63:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.m(i16, x(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 64:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.v(i16);
                        iW2 += iL2;
                        break;
                    }
                case 65:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.w(i16);
                        iW2 += iL2;
                        break;
                    }
                case 66:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.x(i16, x(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 67:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.y(i16, y(abstractC22877a, j12));
                        iW2 += iL2;
                        break;
                    }
                case 68:
                    if (!o(abstractC22877a, i16, i14)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.q(i16, (F0) unsafe.getObject(abstractC22877a, j12), k(i14));
                        iW2 += iL2;
                        break;
                    }
            }
            i14 += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int m(AbstractC22877a abstractC22877a) {
        int iL2;
        int iO2;
        Unsafe unsafe = f45679r;
        int i12 = 0;
        int iW2 = 0;
        while (true) {
            int[] iArr = this.f45680a;
            if (i12 >= iArr.length) {
                G1<?, ?> g12 = this.f45693n;
                return iW2 + g12.h(g12.g(abstractC22877a));
            }
            int I12 = I(i12);
            int iH2 = H(I12);
            int i13 = iArr[i12];
            long j12 = I12 & 1048575;
            if (iH2 >= FieldType.f45645f.a() && iH2 <= FieldType.f45646g.a()) {
                int i14 = iArr[i12 + 2];
            }
            switch (iH2) {
                case 0:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.l(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 1:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.p(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 2:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.t(i13, K1.k(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 3:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.E(i13, K1.k(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 4:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.r(i13, K1.j(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 5:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.o(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 6:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.n(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 7:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.i(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 8:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        Object objL = K1.l(abstractC22877a, j12);
                        iL2 = objL instanceof AbstractC22934w ? CodedOutputStream.j(i13, (AbstractC22934w) objL) : CodedOutputStream.z(i13, (String) objL);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 9:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iO2 = C22903i1.o(i13, K1.l(abstractC22877a, j12), k(i12));
                        iW2 += iO2;
                        break;
                    }
                case 10:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.j(i13, (AbstractC22934w) K1.l(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 11:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.C(i13, K1.j(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 12:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.m(i13, K1.j(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 13:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.v(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 14:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.w(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 15:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.x(i13, K1.j(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 16:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.y(i13, K1.k(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 17:
                    if (!n(abstractC22877a, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.q(i13, (F0) K1.l(abstractC22877a, j12), k(i12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 18:
                    iO2 = C22903i1.h(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 19:
                    iO2 = C22903i1.f(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 20:
                    iO2 = C22903i1.m(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 21:
                    iO2 = C22903i1.x(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 22:
                    iO2 = C22903i1.k(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 23:
                    iO2 = C22903i1.h(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    iO2 = C22903i1.f(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    iO2 = C22903i1.a(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    iO2 = C22903i1.u(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    iO2 = C22903i1.p(i13, p(abstractC22877a, j12), k(i12));
                    iW2 += iO2;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iO2 = C22903i1.c(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iO2 = C22903i1.v(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 30:
                    iO2 = C22903i1.d(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 31:
                    iO2 = C22903i1.f(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 32:
                    iO2 = C22903i1.h(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 33:
                    iO2 = C22903i1.q(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 34:
                    iO2 = C22903i1.s(i13, p(abstractC22877a, j12));
                    iW2 += iO2;
                    break;
                case 35:
                    int i15 = C22903i1.i((List) unsafe.getObject(abstractC22877a, j12));
                    if (i15 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(i15, CodedOutputStream.B(i13), i15, iW2);
                        break;
                    }
                case 36:
                    int iG2 = C22903i1.g((List) unsafe.getObject(abstractC22877a, j12));
                    if (iG2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iG2, CodedOutputStream.B(i13), iG2, iW2);
                        break;
                    }
                case 37:
                    int iN2 = C22903i1.n((List) unsafe.getObject(abstractC22877a, j12));
                    if (iN2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iN2, CodedOutputStream.B(i13), iN2, iW2);
                        break;
                    }
                case 38:
                    int iY2 = C22903i1.y((List) unsafe.getObject(abstractC22877a, j12));
                    if (iY2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iY2, CodedOutputStream.B(i13), iY2, iW2);
                        break;
                    }
                case 39:
                    int iL3 = C22903i1.l((List) unsafe.getObject(abstractC22877a, j12));
                    if (iL3 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iL3, CodedOutputStream.B(i13), iL3, iW2);
                        break;
                    }
                case 40:
                    int i16 = C22903i1.i((List) unsafe.getObject(abstractC22877a, j12));
                    if (i16 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(i16, CodedOutputStream.B(i13), i16, iW2);
                        break;
                    }
                case 41:
                    int iG3 = C22903i1.g((List) unsafe.getObject(abstractC22877a, j12));
                    if (iG3 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iG3, CodedOutputStream.B(i13), iG3, iW2);
                        break;
                    }
                case 42:
                    int iB2 = C22903i1.b((List) unsafe.getObject(abstractC22877a, j12));
                    if (iB2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iB2, CodedOutputStream.B(i13), iB2, iW2);
                        break;
                    }
                case 43:
                    int iW3 = C22903i1.w((List) unsafe.getObject(abstractC22877a, j12));
                    if (iW3 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iW3, CodedOutputStream.B(i13), iW3, iW2);
                        break;
                    }
                case 44:
                    int iE2 = C22903i1.e((List) unsafe.getObject(abstractC22877a, j12));
                    if (iE2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iE2, CodedOutputStream.B(i13), iE2, iW2);
                        break;
                    }
                case 45:
                    int iG4 = C22903i1.g((List) unsafe.getObject(abstractC22877a, j12));
                    if (iG4 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iG4, CodedOutputStream.B(i13), iG4, iW2);
                        break;
                    }
                case 46:
                    int i17 = C22903i1.i((List) unsafe.getObject(abstractC22877a, j12));
                    if (i17 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(i17, CodedOutputStream.B(i13), i17, iW2);
                        break;
                    }
                case 47:
                    int iR2 = C22903i1.r((List) unsafe.getObject(abstractC22877a, j12));
                    if (iR2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iR2, CodedOutputStream.B(i13), iR2, iW2);
                        break;
                    }
                case 48:
                    int iT2 = C22903i1.t((List) unsafe.getObject(abstractC22877a, j12));
                    if (iT2 <= 0) {
                        break;
                    } else {
                        iW2 = androidx.compose.ui.graphics.colorspace.e.w(iT2, CodedOutputStream.B(i13), iT2, iW2);
                        break;
                    }
                case 49:
                    iO2 = C22903i1.j(i13, p(abstractC22877a, j12), k(i12));
                    iW2 += iO2;
                    break;
                case 50:
                    iO2 = this.f45695p.getSerializedSize(i13, K1.l(abstractC22877a, j12), j(i12));
                    iW2 += iO2;
                    break;
                case 51:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.l(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 52:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.p(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 53:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.t(i13, y(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 54:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.E(i13, y(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 55:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.r(i13, x(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 56:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.o(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 57:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.n(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 58:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.i(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 59:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        Object objL2 = K1.l(abstractC22877a, j12);
                        iL2 = objL2 instanceof AbstractC22934w ? CodedOutputStream.j(i13, (AbstractC22934w) objL2) : CodedOutputStream.z(i13, (String) objL2);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 60:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iO2 = C22903i1.o(i13, K1.l(abstractC22877a, j12), k(i12));
                        iW2 += iO2;
                        break;
                    }
                case 61:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.j(i13, (AbstractC22934w) K1.l(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 62:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.C(i13, x(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 63:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.m(i13, x(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 64:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.v(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 65:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.w(i13);
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 66:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.x(i13, x(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 67:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.y(i13, y(abstractC22877a, j12));
                        iW2 = iL2 + iW2;
                        break;
                    }
                case 68:
                    if (!o(abstractC22877a, i13, i12)) {
                        break;
                    } else {
                        iL2 = CodedOutputStream.q(i13, (F0) K1.l(abstractC22877a, j12), k(i12));
                        iW2 = iL2 + iW2;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final void makeImmutable(T t12) {
        int[] iArr;
        int i12;
        int i13 = this.f45689j;
        while (true) {
            iArr = this.f45688i;
            i12 = this.f45690k;
            if (i13 >= i12) {
                break;
            }
            long jI2 = I(iArr[i13]) & 1048575;
            Object objM = K1.f45720d.m(t12, jI2);
            if (objM != null) {
                K1.w(t12, jI2, this.f45695p.toImmutable(objM));
            }
            i13++;
        }
        int length = iArr.length;
        while (i12 < length) {
            this.f45692m.a(t12, iArr[i12]);
            i12++;
        }
        this.f45693n.j(t12);
        if (this.f45685f) {
            this.f45694o.f(t12);
        }
    }

    public final boolean n(T t12, int i12) {
        if (!this.f45687h) {
            int i13 = this.f45680a[i12 + 2];
            return (K1.f45720d.j(t12, (long) (i13 & 1048575)) & (1 << (i13 >>> 20))) != 0;
        }
        int I12 = I(i12);
        long j12 = I12 & 1048575;
        switch (H(I12)) {
            case 0:
                return K1.f45720d.h(t12, j12) != 0.0d;
            case 1:
                return K1.f45720d.i(t12, j12) != 0.0f;
            case 2:
                return K1.f45720d.l(t12, j12) != 0;
            case 3:
                return K1.f45720d.l(t12, j12) != 0;
            case 4:
                return K1.f45720d.j(t12, j12) != 0;
            case 5:
                return K1.f45720d.l(t12, j12) != 0;
            case 6:
                return K1.f45720d.j(t12, j12) != 0;
            case 7:
                return K1.f45720d.e(t12, j12);
            case 8:
                Object objM = K1.f45720d.m(t12, j12);
                if (objM instanceof String) {
                    return !((String) objM).isEmpty();
                }
                if (objM instanceof AbstractC22934w) {
                    return !AbstractC22934w.f45925c.equals(objM);
                }
                throw new IllegalArgumentException();
            case 9:
                return K1.f45720d.m(t12, j12) != null;
            case 10:
                return !AbstractC22934w.f45925c.equals(K1.f45720d.m(t12, j12));
            case 11:
                return K1.f45720d.j(t12, j12) != 0;
            case 12:
                return K1.f45720d.j(t12, j12) != 0;
            case 13:
                return K1.f45720d.j(t12, j12) != 0;
            case 14:
                return K1.f45720d.l(t12, j12) != 0;
            case 15:
                return K1.f45720d.j(t12, j12) != 0;
            case 16:
                return K1.f45720d.l(t12, j12) != 0;
            case 17:
                return K1.f45720d.m(t12, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC22897g1
    public final T newInstance() {
        return (T) this.f45691l.newInstance(this.f45684e);
    }

    public final boolean o(T t12, int i12, int i13) {
        return K1.f45720d.j(t12, (long) (this.f45680a[i13 + 2] & 1048575)) == i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x062d A[Catch: all -> 0x0633, TryCatch #2 {all -> 0x0633, blocks: (B:157:0x0628, B:159:0x062d, B:162:0x0635), top: B:183:0x0628 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0659 A[LOOP:3: B:174:0x0657->B:175:0x0659, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x063b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <UT, UB, ET extends androidx.datastore.preferences.protobuf.C22884c0.c<ET>> void q(androidx.datastore.preferences.protobuf.G1<UT, UB> r20, androidx.datastore.preferences.protobuf.U<ET> r21, T r22, androidx.datastore.preferences.protobuf.InterfaceC22891e1 r23, androidx.datastore.preferences.protobuf.T r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.I0.q(androidx.datastore.preferences.protobuf.G1, androidx.datastore.preferences.protobuf.U, java.lang.Object, androidx.datastore.preferences.protobuf.e1, androidx.datastore.preferences.protobuf.T):void");
    }

    public final <K, V> void r(Object obj, int i12, Object obj2, T t12, InterfaceC22891e1 interfaceC22891e1) {
        long jI2 = I(i12) & 1048575;
        Object objM = K1.f45720d.m(obj, jI2);
        A0 a02 = this.f45695p;
        if (objM == null) {
            objM = a02.a();
            K1.w(obj, jI2, objM);
        } else if (a02.isImmutable(objM)) {
            C22941z0 c22941z0A = a02.a();
            a02.mergeFrom(c22941z0A, objM);
            K1.w(obj, jI2, c22941z0A);
            objM = c22941z0A;
        }
        interfaceC22891e1.d(a02.forMutableMapData(objM), a02.forMapMetadata(obj2), t12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i12) {
        long jI2 = I(i12) & 1048575;
        if (n(generatedMessageLite2, i12)) {
            K1.e eVar = K1.f45720d;
            Object objM = eVar.m(generatedMessageLite, jI2);
            Object objM2 = eVar.m(generatedMessageLite2, jI2);
            if (objM != null && objM2 != null) {
                K1.w(generatedMessageLite, jI2, C22914m0.c(objM, objM2));
                E(generatedMessageLite, i12);
            } else if (objM2 != null) {
                K1.w(generatedMessageLite, jI2, objM2);
                E(generatedMessageLite, i12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i12) {
        int I12 = I(i12);
        int i13 = this.f45680a[i12];
        long j12 = I12 & 1048575;
        if (o(generatedMessageLite2, i13, i12)) {
            K1.e eVar = K1.f45720d;
            Object objM = eVar.m(generatedMessageLite, j12);
            Object objM2 = eVar.m(generatedMessageLite2, j12);
            if (objM != null && objM2 != null) {
                K1.w(generatedMessageLite, j12, C22914m0.c(objM, objM2));
                F(generatedMessageLite, i13, i12);
            } else if (objM2 != null) {
                K1.w(generatedMessageLite, j12, objM2);
                F(generatedMessageLite, i13, i12);
            }
        }
    }

    public final <E> void z(Object obj, long j12, InterfaceC22891e1 interfaceC22891e1, InterfaceC22897g1<E> interfaceC22897g1, T t12) {
        interfaceC22891e1.e(this.f45692m.c(obj, j12), interfaceC22897g1, t12);
    }
}
