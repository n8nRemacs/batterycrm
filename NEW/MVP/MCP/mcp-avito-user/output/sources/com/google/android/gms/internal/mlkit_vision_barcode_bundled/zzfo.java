package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import AK.c;
import androidx.media3.exoplayer.analytics.m;
import com.google.android.gms.common.internal.P0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzfo<T> implements zzgb<T> {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f352470n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f352471o = zzgz.j();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f352472a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f352473b;

    /* renamed from: c, reason: collision with root package name */
    public final int f352474c;

    /* renamed from: d, reason: collision with root package name */
    public final int f352475d;

    /* renamed from: e, reason: collision with root package name */
    public final zzfl f352476e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f352477f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f352478g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f352479h;

    /* renamed from: i, reason: collision with root package name */
    public final int f352480i;

    /* renamed from: j, reason: collision with root package name */
    public final int f352481j;

    /* renamed from: k, reason: collision with root package name */
    public final zzez f352482k;

    /* renamed from: l, reason: collision with root package name */
    public final zzgp f352483l;

    /* renamed from: m, reason: collision with root package name */
    public final zzdo f352484m;

    public zzfo(int[] iArr, Object[] objArr, int i12, int i13, zzfl zzflVar, boolean z12, int[] iArr2, int i14, int i15, zzez zzezVar, zzgp zzgpVar, zzdo zzdoVar, zzfg zzfgVar) {
        this.f352472a = iArr;
        this.f352473b = objArr;
        this.f352474c = i12;
        this.f352475d = i13;
        this.f352478g = z12;
        boolean z13 = false;
        if (zzdoVar != null && zzdoVar.f(zzflVar)) {
            z13 = true;
        }
        this.f352477f = z13;
        this.f352479h = iArr2;
        this.f352480i = i14;
        this.f352481j = i15;
        this.f352482k = zzezVar;
        this.f352483l = zzgpVar;
        this.f352484m = zzdoVar;
        this.f352476e = zzflVar;
    }

    public static int a(int i12) {
        return (i12 >>> 20) & 255;
    }

    public static long c(long j12, Object obj) {
        return ((Long) zzgz.f352545c.zzm(obj, j12)).longValue();
    }

    public static Field g(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            m.p(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(c.s(sb2, " not found. Known fields are ", string));
        }
    }

    public static final void o(int i12, Object obj, zzdj zzdjVar) {
        if (obj instanceof String) {
            zzdjVar.zzG(i12, (String) obj);
        } else {
            zzdjVar.zzd(i12, (zzdb) obj);
        }
    }

    public static zzgq q(Object obj) {
        zzec zzecVar = (zzec) obj;
        zzgq zzgqVar = zzecVar.zzc;
        if (zzgqVar != zzgq.zzc()) {
            return zzgqVar;
        }
        zzgq zzgqVarA = zzgq.a();
        zzecVar.zzc = zzgqVarA;
        return zzgqVarA;
    }

    public static zzfo r(zzfi zzfiVar, zzez zzezVar, zzgp zzgpVar, zzdo zzdoVar, zzfg zzfgVar) {
        if (zzfiVar instanceof zzfw) {
            return s((zzfw) zzfiVar, zzezVar, zzgpVar, zzdoVar, zzfgVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo s(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfw r32, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez r33, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo r35, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg r36) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.s(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfw, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzez, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgp, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfg):com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo");
    }

    public static int v(long j12, Object obj) {
        return ((Integer) zzgz.f352545c.zzm(obj, j12)).intValue();
    }

    public final int A(int i12, int i13) {
        int[] iArr = this.f352472a;
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

    public final int b(int i12) {
        return this.f352472a[i12 + 1];
    }

    public final zzeg d(int i12) {
        int i13 = i12 / 3;
        return (zzeg) this.f352473b[i13 + i13 + 1];
    }

    public final zzgb e(int i12) {
        int i13 = i12 / 3;
        int i14 = i13 + i13;
        Object[] objArr = this.f352473b;
        zzgb zzgbVar = (zzgb) objArr[i14];
        if (zzgbVar != null) {
            return zzgbVar;
        }
        zzgb zzgbVarZzb = zzfu.zza().zzb((Class) objArr[i14 + 1]);
        objArr[i14] = zzgbVarZzb;
        return zzgbVarZzb;
    }

    public final Object f(int i12) {
        int i13 = i12 / 3;
        return this.f352473b[i13 + i13];
    }

    public final void h(int i12, Object obj, Object obj2) {
        long jB2 = b(i12) & 1048575;
        if (l(i12, obj2)) {
            zzgy zzgyVar = zzgz.f352545c;
            Object objZzm = zzgyVar.zzm(obj, jB2);
            Object objZzm2 = zzgyVar.zzm(obj2, jB2);
            if (objZzm != null && objZzm2 != null) {
                zzgz.o(obj, jB2, zzel.a(objZzm, objZzm2));
                j(i12, obj);
            } else if (objZzm2 != null) {
                zzgz.o(obj, jB2, objZzm2);
                j(i12, obj);
            }
        }
    }

    public final void i(int i12, Object obj, Object obj2) {
        int iB2 = b(i12);
        int i13 = this.f352472a[i12];
        long j12 = iB2 & 1048575;
        if (m(i13, i12, obj2)) {
            Object objZzm = m(i13, i12, obj) ? zzgz.f352545c.zzm(obj, j12) : null;
            Object objZzm2 = zzgz.f352545c.zzm(obj2, j12);
            if (objZzm != null && objZzm2 != null) {
                zzgz.o(obj, j12, zzel.a(objZzm, objZzm2));
                zzgz.n(i13, r1[i12 + 2] & 1048575, obj);
            } else if (objZzm2 != null) {
                zzgz.o(obj, j12, objZzm2);
                zzgz.n(i13, r1[i12 + 2] & 1048575, obj);
            }
        }
    }

    public final void j(int i12, Object obj) {
        int i13 = this.f352472a[i12 + 2];
        long j12 = 1048575 & i13;
        if (j12 == 1048575) {
            return;
        }
        zzgz.n((1 << (i13 >>> 20)) | zzgz.f352545c.zzj(obj, j12), j12, obj);
    }

    public final boolean k(int i12, Object obj, Object obj2) {
        return l(i12, obj) == l(i12, obj2);
    }

    public final boolean l(int i12, Object obj) {
        int i13 = this.f352472a[i12 + 2];
        long j12 = i13 & 1048575;
        if (j12 != 1048575) {
            return (zzgz.f352545c.zzj(obj, j12) & (1 << (i13 >>> 20))) != 0;
        }
        int iB2 = b(i12);
        long j13 = iB2 & 1048575;
        switch (a(iB2)) {
            case 0:
                return Double.doubleToRawLongBits(zzgz.f352545c.zza(obj, j13)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgz.f352545c.zzb(obj, j13)) != 0;
            case 2:
                return zzgz.f352545c.zzk(obj, j13) != 0;
            case 3:
                return zzgz.f352545c.zzk(obj, j13) != 0;
            case 4:
                return zzgz.f352545c.zzj(obj, j13) != 0;
            case 5:
                return zzgz.f352545c.zzk(obj, j13) != 0;
            case 6:
                return zzgz.f352545c.zzj(obj, j13) != 0;
            case 7:
                return zzgz.f352545c.zzg(obj, j13);
            case 8:
                Object objZzm = zzgz.f352545c.zzm(obj, j13);
                if (objZzm instanceof String) {
                    return !((String) objZzm).isEmpty();
                }
                if (objZzm instanceof zzdb) {
                    return !zzdb.zzb.equals(objZzm);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzgz.f352545c.zzm(obj, j13) != null;
            case 10:
                return !zzdb.zzb.equals(zzgz.f352545c.zzm(obj, j13));
            case 11:
                return zzgz.f352545c.zzj(obj, j13) != 0;
            case 12:
                return zzgz.f352545c.zzj(obj, j13) != 0;
            case 13:
                return zzgz.f352545c.zzj(obj, j13) != 0;
            case 14:
                return zzgz.f352545c.zzk(obj, j13) != 0;
            case 15:
                return zzgz.f352545c.zzj(obj, j13) != 0;
            case 16:
                return zzgz.f352545c.zzk(obj, j13) != 0;
            case 17:
                return zzgz.f352545c.zzm(obj, j13) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean m(int i12, int i13, Object obj) {
        return zzgz.f352545c.zzj(obj, (long) (this.f352472a[i13 + 2] & 1048575)) == i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.Object r21, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj r22) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.n(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x05f7, code lost:
    
        if (r2 == r3) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05f9, code lost:
    
        r33.putInt(r11, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x05ff, code lost:
    
        r2 = r36.f352480i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0603, code lost:
    
        if (r2 >= r36.f352481j) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0605, code lost:
    
        r4 = r36.f352479h[r2];
        r5 = r26[r4];
        r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgz.i(b(r4) & r3, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0615, code lost:
    
        if (r5 != null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x061c, code lost:
    
        if (d(r4) != null) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x061e, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0621, code lost:
    
        r5 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzff) r5;
        r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfe) f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0629, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x062a, code lost:
    
        if (r7 != 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x062c, code lost:
    
        if (r0 != r6) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0633, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0634, code lost:
    
        if (r0 > r6) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0636, code lost:
    
        if (r1 != r7) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0638, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x063d, code lost:
    
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen.c();
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r42) throws com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen {
        /*
            Method dump skipped, instructions count: 1676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.p(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):int");
    }

    public final int t(Object obj) {
        int i12;
        int iZzD;
        int iZzE;
        int iZzD2;
        int iZzx;
        int iR2;
        int iA2;
        Unsafe unsafe = f352471o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int iD2 = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f352472a;
            if (i15 < iArr.length) {
                int iB2 = b(i15);
                int i17 = iArr[i15];
                int iA3 = a(iB2);
                if (iA3 <= 17) {
                    int i18 = iArr[i15 + 2];
                    int i19 = i18 & i13;
                    i12 = 1 << (i18 >>> 20);
                    if (i19 != i14) {
                        i16 = unsafe.getInt(obj, i19);
                        i14 = i19;
                    }
                } else {
                    i12 = 0;
                }
                long j12 = iB2 & i13;
                switch (iA3) {
                    case 0:
                        if ((i16 & i12) != 0) {
                            iD2 = P0.d(i17 << 3, 8, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if ((i16 & i12) != 0) {
                            iD2 = P0.d(i17 << 3, 4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if ((i12 & i16) != 0) {
                            long j13 = unsafe.getLong(obj, j12);
                            iZzD = zzdi.zzD(i17 << 3);
                            iZzE = zzdi.zzE(j13);
                            iA2 = iZzE + iZzD;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if ((i12 & i16) != 0) {
                            long j14 = unsafe.getLong(obj, j12);
                            iZzD = zzdi.zzD(i17 << 3);
                            iZzE = zzdi.zzE(j14);
                            iA2 = iZzE + iZzD;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if ((i12 & i16) != 0) {
                            int i22 = unsafe.getInt(obj, j12);
                            iZzD2 = zzdi.zzD(i17 << 3);
                            iZzx = zzdi.zzx(i22);
                            iA2 = iZzx + iZzD2;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if ((i16 & i12) != 0) {
                            iD2 = P0.d(i17 << 3, 8, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if ((i16 & i12) != 0) {
                            iD2 = P0.d(i17 << 3, 4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if ((i16 & i12) != 0) {
                            iD2 = P0.d(i17 << 3, 1, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if ((i12 & i16) != 0) {
                            Object object = unsafe.getObject(obj, j12);
                            if (object instanceof zzdb) {
                                int iZzD3 = zzdi.zzD(i17 << 3);
                                int iZzd = ((zzdb) object).zzd();
                                iD2 = P0.e(iZzd, iZzd, iZzD3, iD2);
                                break;
                            } else {
                                iZzD2 = zzdi.zzD(i17 << 3);
                                iZzx = zzdi.zzB((String) object);
                                iA2 = iZzx + iZzD2;
                                iD2 += iA2;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if ((i12 & i16) != 0) {
                            iR2 = zzgd.r(i17, unsafe.getObject(obj, j12), e(i15));
                            iD2 += iR2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if ((i12 & i16) != 0) {
                            zzdb zzdbVar = (zzdb) unsafe.getObject(obj, j12);
                            int iZzD4 = zzdi.zzD(i17 << 3);
                            int iZzd2 = zzdbVar.zzd();
                            iD2 = P0.e(iZzd2, iZzd2, iZzD4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if ((i12 & i16) != 0) {
                            iD2 = P0.d(unsafe.getInt(obj, j12), zzdi.zzD(i17 << 3), iD2);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if ((i12 & i16) != 0) {
                            int i23 = unsafe.getInt(obj, j12);
                            iZzD2 = zzdi.zzD(i17 << 3);
                            iZzx = zzdi.zzx(i23);
                            iA2 = iZzx + iZzD2;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if ((i16 & i12) != 0) {
                            iD2 = P0.d(i17 << 3, 4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if ((i16 & i12) != 0) {
                            iD2 = P0.d(i17 << 3, 8, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if ((i12 & i16) != 0) {
                            int i24 = unsafe.getInt(obj, j12);
                            iD2 = P0.d((i24 >> 31) ^ (i24 + i24), zzdi.zzD(i17 << 3), iD2);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if ((i12 & i16) != 0) {
                            long j15 = unsafe.getLong(obj, j12);
                            iZzD = zzdi.zzD(i17 << 3);
                            iZzE = zzdi.zzE((j15 >> 63) ^ (j15 + j15));
                            iA2 = iZzE + iZzD;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if ((i12 & i16) != 0) {
                            iA2 = zzdi.a(i17, (zzfl) unsafe.getObject(obj, j12), e(i15));
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        iR2 = zzgd.k(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 19:
                        iR2 = zzgd.i(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 20:
                        iR2 = zzgd.p(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 21:
                        iR2 = zzgd.A(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 22:
                        iR2 = zzgd.n(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 23:
                        iR2 = zzgd.k(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        iR2 = zzgd.i(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        iR2 = zzgd.c(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        iR2 = zzgd.x(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        iR2 = zzgd.s(i17, (List) unsafe.getObject(obj, j12), e(i15));
                        iD2 += iR2;
                        break;
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        iR2 = zzgd.f(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        iR2 = zzgd.y(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 30:
                        iR2 = zzgd.g(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 31:
                        iR2 = zzgd.i(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 32:
                        iR2 = zzgd.k(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 33:
                        iR2 = zzgd.t(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 34:
                        iR2 = zzgd.v(i17, (List) unsafe.getObject(obj, j12));
                        iD2 += iR2;
                        break;
                    case 35:
                        int iL2 = zzgd.l((List) unsafe.getObject(obj, j12));
                        if (iL2 > 0) {
                            iD2 = P0.e(iL2, zzdi.zzC(i17), iL2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        int iJ2 = zzgd.j((List) unsafe.getObject(obj, j12));
                        if (iJ2 > 0) {
                            iD2 = P0.e(iJ2, zzdi.zzC(i17), iJ2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        int iQ2 = zzgd.q((List) unsafe.getObject(obj, j12));
                        if (iQ2 > 0) {
                            iD2 = P0.e(iQ2, zzdi.zzC(i17), iQ2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        int iB3 = zzgd.B((List) unsafe.getObject(obj, j12));
                        if (iB3 > 0) {
                            iD2 = P0.e(iB3, zzdi.zzC(i17), iB3, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        int iO2 = zzgd.o((List) unsafe.getObject(obj, j12));
                        if (iO2 > 0) {
                            iD2 = P0.e(iO2, zzdi.zzC(i17), iO2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        int iL3 = zzgd.l((List) unsafe.getObject(obj, j12));
                        if (iL3 > 0) {
                            iD2 = P0.e(iL3, zzdi.zzC(i17), iL3, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        int iJ3 = zzgd.j((List) unsafe.getObject(obj, j12));
                        if (iJ3 > 0) {
                            iD2 = P0.e(iJ3, zzdi.zzC(i17), iJ3, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        int iE2 = zzgd.e((List) unsafe.getObject(obj, j12));
                        if (iE2 > 0) {
                            iD2 = P0.e(iE2, zzdi.zzC(i17), iE2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        int iZ2 = zzgd.z((List) unsafe.getObject(obj, j12));
                        if (iZ2 > 0) {
                            iD2 = P0.e(iZ2, zzdi.zzC(i17), iZ2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        int iH2 = zzgd.h((List) unsafe.getObject(obj, j12));
                        if (iH2 > 0) {
                            iD2 = P0.e(iH2, zzdi.zzC(i17), iH2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        int iJ4 = zzgd.j((List) unsafe.getObject(obj, j12));
                        if (iJ4 > 0) {
                            iD2 = P0.e(iJ4, zzdi.zzC(i17), iJ4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        int iL4 = zzgd.l((List) unsafe.getObject(obj, j12));
                        if (iL4 > 0) {
                            iD2 = P0.e(iL4, zzdi.zzC(i17), iL4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        int iU2 = zzgd.u((List) unsafe.getObject(obj, j12));
                        if (iU2 > 0) {
                            iD2 = P0.e(iU2, zzdi.zzC(i17), iU2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        int iW2 = zzgd.w((List) unsafe.getObject(obj, j12));
                        if (iW2 > 0) {
                            iD2 = P0.e(iW2, zzdi.zzC(i17), iW2, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        iR2 = zzgd.m(i17, (List) unsafe.getObject(obj, j12), e(i15));
                        iD2 += iR2;
                        break;
                    case 50:
                        zzfg.zza(i17, unsafe.getObject(obj, j12), f(i15));
                        break;
                    case 51:
                        if (m(i17, i15, obj)) {
                            iD2 = P0.d(i17 << 3, 8, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (m(i17, i15, obj)) {
                            iD2 = P0.d(i17 << 3, 4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (m(i17, i15, obj)) {
                            long jC2 = c(j12, obj);
                            iZzD = zzdi.zzD(i17 << 3);
                            iZzE = zzdi.zzE(jC2);
                            iA2 = iZzE + iZzD;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m(i17, i15, obj)) {
                            long jC3 = c(j12, obj);
                            iZzD = zzdi.zzD(i17 << 3);
                            iZzE = zzdi.zzE(jC3);
                            iA2 = iZzE + iZzD;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m(i17, i15, obj)) {
                            int iV2 = v(j12, obj);
                            iZzD2 = zzdi.zzD(i17 << 3);
                            iZzx = zzdi.zzx(iV2);
                            iA2 = iZzx + iZzD2;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m(i17, i15, obj)) {
                            iD2 = P0.d(i17 << 3, 8, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m(i17, i15, obj)) {
                            iD2 = P0.d(i17 << 3, 4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (m(i17, i15, obj)) {
                            iD2 = P0.d(i17 << 3, 1, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (m(i17, i15, obj)) {
                            Object object2 = unsafe.getObject(obj, j12);
                            if (object2 instanceof zzdb) {
                                int iZzD5 = zzdi.zzD(i17 << 3);
                                int iZzd3 = ((zzdb) object2).zzd();
                                iD2 = P0.e(iZzd3, iZzd3, iZzD5, iD2);
                                break;
                            } else {
                                iZzD2 = zzdi.zzD(i17 << 3);
                                iZzx = zzdi.zzB((String) object2);
                                iA2 = iZzx + iZzD2;
                                iD2 += iA2;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (m(i17, i15, obj)) {
                            iR2 = zzgd.r(i17, unsafe.getObject(obj, j12), e(i15));
                            iD2 += iR2;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m(i17, i15, obj)) {
                            zzdb zzdbVar2 = (zzdb) unsafe.getObject(obj, j12);
                            int iZzD6 = zzdi.zzD(i17 << 3);
                            int iZzd4 = zzdbVar2.zzd();
                            iD2 = P0.e(iZzd4, iZzd4, iZzD6, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m(i17, i15, obj)) {
                            iD2 = P0.d(v(j12, obj), zzdi.zzD(i17 << 3), iD2);
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m(i17, i15, obj)) {
                            int iV3 = v(j12, obj);
                            iZzD2 = zzdi.zzD(i17 << 3);
                            iZzx = zzdi.zzx(iV3);
                            iA2 = iZzx + iZzD2;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m(i17, i15, obj)) {
                            iD2 = P0.d(i17 << 3, 4, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (m(i17, i15, obj)) {
                            iD2 = P0.d(i17 << 3, 8, iD2);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (m(i17, i15, obj)) {
                            int iV4 = v(j12, obj);
                            iD2 = P0.d((iV4 >> 31) ^ (iV4 + iV4), zzdi.zzD(i17 << 3), iD2);
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (m(i17, i15, obj)) {
                            long jC4 = c(j12, obj);
                            iZzD = zzdi.zzD(i17 << 3);
                            iZzE = zzdi.zzE((jC4 >> 63) ^ (jC4 + jC4));
                            iA2 = iZzE + iZzD;
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (m(i17, i15, obj)) {
                            iA2 = zzdi.a(i17, (zzfl) unsafe.getObject(obj, j12), e(i15));
                            iD2 += iA2;
                            break;
                        } else {
                            break;
                        }
                }
                i15 += 3;
                i13 = 1048575;
            } else {
                zzgp zzgpVar = this.f352483l;
                int iA4 = iD2 + zzgpVar.a(zzgpVar.c(obj));
                if (!this.f352477f) {
                    return iA4;
                }
                zzds zzdsVarB = this.f352484m.b(obj);
                int i25 = 0;
                int iZza = 0;
                while (true) {
                    int iZzb = zzdsVarB.f352425a.zzb();
                    zzge zzgeVar = zzdsVarB.f352425a;
                    if (i25 >= iZzb) {
                        for (Map.Entry entry : zzgeVar.zzc()) {
                            iZza += zzds.zza((zzdr) entry.getKey(), entry.getValue());
                        }
                        return iA4 + iZza;
                    }
                    Map.Entry entryZzg = zzgeVar.zzg(i25);
                    iZza += zzds.zza((zzdr) entryZzg.getKey(), entryZzg.getValue());
                    i25++;
                }
            }
        }
    }

    public final int u(Object obj) {
        int iZzD;
        int iZzE;
        int iZzD2;
        int iZzx;
        int iR2;
        int iZzD3;
        int iZzE2;
        int iA2;
        Unsafe unsafe = f352471o;
        int i12 = 0;
        int iD2 = 0;
        while (true) {
            int[] iArr = this.f352472a;
            if (i12 >= iArr.length) {
                zzgp zzgpVar = this.f352483l;
                return iD2 + zzgpVar.a(zzgpVar.c(obj));
            }
            int iB2 = b(i12);
            int iA3 = a(iB2);
            int i13 = iArr[i12];
            long j12 = iB2 & 1048575;
            if (iA3 >= zzdt.zzJ.zza() && iA3 <= zzdt.zzW.zza()) {
                int i14 = iArr[i12 + 2];
            }
            switch (iA3) {
                case 0:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 8, iD2);
                        break;
                    }
                case 1:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 4, iD2);
                        break;
                    }
                case 2:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        long jG2 = zzgz.g(j12, obj);
                        iZzD = zzdi.zzD(i13 << 3);
                        iZzE = zzdi.zzE(jG2);
                        iA2 = iZzE + iZzD;
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 3:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        long jG3 = zzgz.g(j12, obj);
                        iZzD = zzdi.zzD(i13 << 3);
                        iZzE = zzdi.zzE(jG3);
                        iA2 = iZzE + iZzD;
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 4:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        int iF2 = zzgz.f(j12, obj);
                        iZzD2 = zzdi.zzD(i13 << 3);
                        iZzx = zzdi.zzx(iF2);
                        iA2 = iZzx + iZzD2;
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 5:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 8, iD2);
                        break;
                    }
                case 6:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 4, iD2);
                        break;
                    }
                case 7:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 1, iD2);
                        break;
                    }
                case 8:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        Object objI = zzgz.i(j12, obj);
                        if (!(objI instanceof zzdb)) {
                            iZzD2 = zzdi.zzD(i13 << 3);
                            iZzx = zzdi.zzB((String) objI);
                            iA2 = iZzx + iZzD2;
                            iD2 = iA2 + iD2;
                            break;
                        } else {
                            int iZzD4 = zzdi.zzD(i13 << 3);
                            int iZzd = ((zzdb) objI).zzd();
                            iD2 = P0.e(iZzd, iZzd, iZzD4, iD2);
                            break;
                        }
                    }
                case 9:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iR2 = zzgd.r(i13, zzgz.i(j12, obj), e(i12));
                        iD2 += iR2;
                        break;
                    }
                case 10:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        zzdb zzdbVar = (zzdb) zzgz.i(j12, obj);
                        int iZzD5 = zzdi.zzD(i13 << 3);
                        int iZzd2 = zzdbVar.zzd();
                        iD2 = P0.e(iZzd2, iZzd2, iZzD5, iD2);
                        break;
                    }
                case 11:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(zzgz.f(j12, obj), zzdi.zzD(i13 << 3), iD2);
                        break;
                    }
                case 12:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        int iF3 = zzgz.f(j12, obj);
                        iZzD2 = zzdi.zzD(i13 << 3);
                        iZzx = zzdi.zzx(iF3);
                        iA2 = iZzx + iZzD2;
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 13:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 4, iD2);
                        break;
                    }
                case 14:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 8, iD2);
                        break;
                    }
                case 15:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        int iF4 = zzgz.f(j12, obj);
                        iD2 = P0.d((iF4 >> 31) ^ (iF4 + iF4), zzdi.zzD(i13 << 3), iD2);
                        break;
                    }
                case 16:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        long jG4 = zzgz.g(j12, obj);
                        iZzD3 = zzdi.zzD(i13 << 3);
                        iZzE2 = zzdi.zzE((jG4 + jG4) ^ (jG4 >> 63));
                        iD2 = iZzE2 + iZzD3 + iD2;
                        break;
                    }
                case 17:
                    if (!l(i12, obj)) {
                        break;
                    } else {
                        iA2 = zzdi.a(i13, (zzfl) zzgz.i(j12, obj), e(i12));
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 18:
                    iR2 = zzgd.k(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 19:
                    iR2 = zzgd.i(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 20:
                    iR2 = zzgd.p(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 21:
                    iR2 = zzgd.A(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 22:
                    iR2 = zzgd.n(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 23:
                    iR2 = zzgd.k(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    iR2 = zzgd.i(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    iR2 = zzgd.c(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    iR2 = zzgd.x(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    iR2 = zzgd.s(i13, (List) zzgz.i(j12, obj), e(i12));
                    iD2 += iR2;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    iR2 = zzgd.f(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    iR2 = zzgd.y(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 30:
                    iR2 = zzgd.g(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 31:
                    iR2 = zzgd.i(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 32:
                    iR2 = zzgd.k(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 33:
                    iR2 = zzgd.t(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 34:
                    iR2 = zzgd.v(i13, (List) zzgz.i(j12, obj));
                    iD2 += iR2;
                    break;
                case 35:
                    int iL2 = zzgd.l((List) unsafe.getObject(obj, j12));
                    if (iL2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iL2, zzdi.zzC(i13), iL2, iD2);
                        break;
                    }
                case 36:
                    int iJ2 = zzgd.j((List) unsafe.getObject(obj, j12));
                    if (iJ2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iJ2, zzdi.zzC(i13), iJ2, iD2);
                        break;
                    }
                case 37:
                    int iQ2 = zzgd.q((List) unsafe.getObject(obj, j12));
                    if (iQ2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iQ2, zzdi.zzC(i13), iQ2, iD2);
                        break;
                    }
                case 38:
                    int iB3 = zzgd.B((List) unsafe.getObject(obj, j12));
                    if (iB3 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iB3, zzdi.zzC(i13), iB3, iD2);
                        break;
                    }
                case 39:
                    int iO2 = zzgd.o((List) unsafe.getObject(obj, j12));
                    if (iO2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iO2, zzdi.zzC(i13), iO2, iD2);
                        break;
                    }
                case 40:
                    int iL3 = zzgd.l((List) unsafe.getObject(obj, j12));
                    if (iL3 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iL3, zzdi.zzC(i13), iL3, iD2);
                        break;
                    }
                case 41:
                    int iJ3 = zzgd.j((List) unsafe.getObject(obj, j12));
                    if (iJ3 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iJ3, zzdi.zzC(i13), iJ3, iD2);
                        break;
                    }
                case 42:
                    int iE2 = zzgd.e((List) unsafe.getObject(obj, j12));
                    if (iE2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iE2, zzdi.zzC(i13), iE2, iD2);
                        break;
                    }
                case 43:
                    int iZ2 = zzgd.z((List) unsafe.getObject(obj, j12));
                    if (iZ2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iZ2, zzdi.zzC(i13), iZ2, iD2);
                        break;
                    }
                case 44:
                    int iH2 = zzgd.h((List) unsafe.getObject(obj, j12));
                    if (iH2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iH2, zzdi.zzC(i13), iH2, iD2);
                        break;
                    }
                case 45:
                    int iJ4 = zzgd.j((List) unsafe.getObject(obj, j12));
                    if (iJ4 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iJ4, zzdi.zzC(i13), iJ4, iD2);
                        break;
                    }
                case 46:
                    int iL4 = zzgd.l((List) unsafe.getObject(obj, j12));
                    if (iL4 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iL4, zzdi.zzC(i13), iL4, iD2);
                        break;
                    }
                case 47:
                    int iU2 = zzgd.u((List) unsafe.getObject(obj, j12));
                    if (iU2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iU2, zzdi.zzC(i13), iU2, iD2);
                        break;
                    }
                case 48:
                    int iW2 = zzgd.w((List) unsafe.getObject(obj, j12));
                    if (iW2 <= 0) {
                        break;
                    } else {
                        iD2 = P0.e(iW2, zzdi.zzC(i13), iW2, iD2);
                        break;
                    }
                case 49:
                    iR2 = zzgd.m(i13, (List) zzgz.i(j12, obj), e(i12));
                    iD2 += iR2;
                    break;
                case 50:
                    zzfg.zza(i13, zzgz.i(j12, obj), f(i12));
                    break;
                case 51:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 8, iD2);
                        break;
                    }
                case 52:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 4, iD2);
                        break;
                    }
                case 53:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        long jC2 = c(j12, obj);
                        iZzD = zzdi.zzD(i13 << 3);
                        iZzE = zzdi.zzE(jC2);
                        iA2 = iZzE + iZzD;
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 54:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        long jC3 = c(j12, obj);
                        iZzD = zzdi.zzD(i13 << 3);
                        iZzE = zzdi.zzE(jC3);
                        iA2 = iZzE + iZzD;
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 55:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        int iV2 = v(j12, obj);
                        iZzD2 = zzdi.zzD(i13 << 3);
                        iZzx = zzdi.zzx(iV2);
                        iA2 = iZzx + iZzD2;
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 56:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 8, iD2);
                        break;
                    }
                case 57:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 4, iD2);
                        break;
                    }
                case 58:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 1, iD2);
                        break;
                    }
                case 59:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        Object objI2 = zzgz.i(j12, obj);
                        if (!(objI2 instanceof zzdb)) {
                            iZzD2 = zzdi.zzD(i13 << 3);
                            iZzx = zzdi.zzB((String) objI2);
                            iA2 = iZzx + iZzD2;
                            iD2 = iA2 + iD2;
                            break;
                        } else {
                            int iZzD6 = zzdi.zzD(i13 << 3);
                            int iZzd3 = ((zzdb) objI2).zzd();
                            iD2 = P0.e(iZzd3, iZzd3, iZzD6, iD2);
                            break;
                        }
                    }
                case 60:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iR2 = zzgd.r(i13, zzgz.i(j12, obj), e(i12));
                        iD2 += iR2;
                        break;
                    }
                case 61:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        zzdb zzdbVar2 = (zzdb) zzgz.i(j12, obj);
                        int iZzD7 = zzdi.zzD(i13 << 3);
                        int iZzd4 = zzdbVar2.zzd();
                        iD2 = P0.e(iZzd4, iZzd4, iZzD7, iD2);
                        break;
                    }
                case 62:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(v(j12, obj), zzdi.zzD(i13 << 3), iD2);
                        break;
                    }
                case 63:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        int iV3 = v(j12, obj);
                        iZzD2 = zzdi.zzD(i13 << 3);
                        iZzx = zzdi.zzx(iV3);
                        iA2 = iZzx + iZzD2;
                        iD2 = iA2 + iD2;
                        break;
                    }
                case 64:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 4, iD2);
                        break;
                    }
                case 65:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iD2 = P0.d(i13 << 3, 8, iD2);
                        break;
                    }
                case 66:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        int iV4 = v(j12, obj);
                        iD2 = P0.d((iV4 >> 31) ^ (iV4 + iV4), zzdi.zzD(i13 << 3), iD2);
                        break;
                    }
                case 67:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        long jC4 = c(j12, obj);
                        iZzD3 = zzdi.zzD(i13 << 3);
                        iZzE2 = zzdi.zzE((jC4 + jC4) ^ (jC4 >> 63));
                        iD2 = iZzE2 + iZzD3 + iD2;
                        break;
                    }
                case 68:
                    if (!m(i13, i12, obj)) {
                        break;
                    } else {
                        iA2 = zzdi.a(i13, (zzfl) zzgz.i(j12, obj), e(i12));
                        iD2 = iA2 + iD2;
                        break;
                    }
            }
            i12 += 3;
        }
    }

    public final void w(int i12, long j12, Object obj) {
        Unsafe unsafe = f352471o;
        Object objF = f(i12);
        Object object = unsafe.getObject(obj, j12);
        if (!((zzff) object).zze()) {
            zzff zzffVarZzb = zzff.zza().zzb();
            zzfg.zzb(zzffVarZzb, object);
            unsafe.putObject(obj, j12, zzffVarZzb);
        }
        throw null;
    }

    public final int x(Object obj, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, int i18, long j12, int i19, zzco zzcoVar) throws zzen {
        Unsafe unsafe = f352471o;
        long j13 = this.f352472a[i19 + 2] & 1048575;
        switch (i18) {
            case 51:
                if (i16 == 1) {
                    unsafe.putObject(obj, j12, Double.valueOf(Double.longBitsToDouble(zzcp.o(i12, bArr))));
                    unsafe.putInt(obj, j13, i15);
                    return i12 + 8;
                }
                break;
            case 52:
                if (i16 == 5) {
                    unsafe.putObject(obj, j12, Float.valueOf(Float.intBitsToFloat(zzcp.b(i12, bArr))));
                    unsafe.putInt(obj, j13, i15);
                    return i12 + 4;
                }
                break;
            case 53:
            case 54:
                if (i16 == 0) {
                    int iM2 = zzcp.m(bArr, i12, zzcoVar);
                    unsafe.putObject(obj, j12, Long.valueOf(zzcoVar.zzb));
                    unsafe.putInt(obj, j13, i15);
                    return iM2;
                }
                break;
            case 55:
            case 62:
                if (i16 == 0) {
                    int iJ2 = zzcp.j(bArr, i12, zzcoVar);
                    unsafe.putObject(obj, j12, Integer.valueOf(zzcoVar.zza));
                    unsafe.putInt(obj, j13, i15);
                    return iJ2;
                }
                break;
            case 56:
            case 65:
                if (i16 == 1) {
                    unsafe.putObject(obj, j12, Long.valueOf(zzcp.o(i12, bArr)));
                    unsafe.putInt(obj, j13, i15);
                    return i12 + 8;
                }
                break;
            case 57:
            case 64:
                if (i16 == 5) {
                    unsafe.putObject(obj, j12, Integer.valueOf(zzcp.b(i12, bArr)));
                    unsafe.putInt(obj, j13, i15);
                    return i12 + 4;
                }
                break;
            case 58:
                if (i16 == 0) {
                    int iM3 = zzcp.m(bArr, i12, zzcoVar);
                    unsafe.putObject(obj, j12, Boolean.valueOf(zzcoVar.zzb != 0));
                    unsafe.putInt(obj, j13, i15);
                    return iM3;
                }
                break;
            case 59:
                if (i16 == 2) {
                    int iJ3 = zzcp.j(bArr, i12, zzcoVar);
                    int i22 = zzcoVar.zza;
                    if (i22 == 0) {
                        unsafe.putObject(obj, j12, "");
                    } else {
                        if ((i17 & 536870912) != 0 && !zzhe.d(iJ3, iJ3 + i22, bArr)) {
                            throw zzen.a();
                        }
                        unsafe.putObject(obj, j12, new String(bArr, iJ3, i22, zzel.f352447a));
                        iJ3 += i22;
                    }
                    unsafe.putInt(obj, j13, i15);
                    return iJ3;
                }
                break;
            case 60:
                if (i16 == 2) {
                    int iD2 = zzcp.d(e(i19), bArr, i12, i13, zzcoVar);
                    Object object = unsafe.getInt(obj, j13) == i15 ? unsafe.getObject(obj, j12) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j12, zzcoVar.zzc);
                    } else {
                        unsafe.putObject(obj, j12, zzel.a(object, zzcoVar.zzc));
                    }
                    unsafe.putInt(obj, j13, i15);
                    return iD2;
                }
                break;
            case 61:
                if (i16 == 2) {
                    int iA2 = zzcp.a(bArr, i12, zzcoVar);
                    unsafe.putObject(obj, j12, zzcoVar.zzc);
                    unsafe.putInt(obj, j13, i15);
                    return iA2;
                }
                break;
            case 63:
                if (i16 == 0) {
                    int iJ4 = zzcp.j(bArr, i12, zzcoVar);
                    int i23 = zzcoVar.zza;
                    zzeg zzegVarD = d(i19);
                    if (zzegVarD == null || zzegVarD.zza(i23)) {
                        unsafe.putObject(obj, j12, Integer.valueOf(i23));
                        unsafe.putInt(obj, j13, i15);
                    } else {
                        q(obj).b(i14, Long.valueOf(i23));
                    }
                    return iJ4;
                }
                break;
            case 66:
                if (i16 == 0) {
                    int iJ5 = zzcp.j(bArr, i12, zzcoVar);
                    unsafe.putObject(obj, j12, Integer.valueOf(zzde.zzb(zzcoVar.zza)));
                    unsafe.putInt(obj, j13, i15);
                    return iJ5;
                }
                break;
            case 67:
                if (i16 == 0) {
                    int iM4 = zzcp.m(bArr, i12, zzcoVar);
                    unsafe.putObject(obj, j12, Long.valueOf(zzde.zzc(zzcoVar.zzb)));
                    unsafe.putInt(obj, j13, i15);
                    return iM4;
                }
                break;
            case 68:
                if (i16 == 3) {
                    int iC2 = zzcp.c(e(i19), bArr, i12, i13, (i14 & (-8)) | 4, zzcoVar);
                    Object object2 = unsafe.getInt(obj, j13) == i15 ? unsafe.getObject(obj, j12) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j12, zzcoVar.zzc);
                    } else {
                        unsafe.putObject(obj, j12, zzel.a(object2, zzcoVar.zzc));
                    }
                    unsafe.putInt(obj, j13, i15);
                    return iC2;
                }
                break;
        }
        return i12;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:34:0x00a2. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco r35) throws com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzen {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.y(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzco):void");
    }

    public final int z(Object obj, byte[] bArr, int i12, int i13, int i14, int i15, int i16, int i17, long j12, int i18, long j13, zzco zzcoVar) throws zzen {
        int i19;
        int i22;
        int i23;
        int i24;
        int iJ2;
        int iJ3 = i12;
        Unsafe unsafe = f352471o;
        zzek zzekVarZzd = (zzek) unsafe.getObject(obj, j13);
        if (!zzekVarZzd.zzc()) {
            int size = zzekVarZzd.size();
            zzekVarZzd = zzekVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j13, zzekVarZzd);
        }
        switch (i18) {
            case 18:
            case 35:
                if (i16 == 2) {
                    zzdk zzdkVar = (zzdk) zzekVarZzd;
                    int iJ4 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i25 = zzcoVar.zza + iJ4;
                    while (iJ4 < i25) {
                        zzdkVar.zze(Double.longBitsToDouble(zzcp.o(iJ4, bArr)));
                        iJ4 += 8;
                    }
                    if (iJ4 == i25) {
                        return iJ4;
                    }
                    throw zzen.d();
                }
                if (i16 == 1) {
                    zzdk zzdkVar2 = (zzdk) zzekVarZzd;
                    zzdkVar2.zze(Double.longBitsToDouble(zzcp.o(iJ3, bArr)));
                    while (true) {
                        i19 = iJ3 + 8;
                        if (i19 < i13) {
                            iJ3 = zzcp.j(bArr, i19, zzcoVar);
                            if (i14 == zzcoVar.zza) {
                                zzdkVar2.zze(Double.longBitsToDouble(zzcp.o(iJ3, bArr)));
                            }
                        }
                    }
                    return i19;
                }
                return iJ3;
            case 19:
            case 36:
                if (i16 == 2) {
                    zzdu zzduVar = (zzdu) zzekVarZzd;
                    int iJ5 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i26 = zzcoVar.zza + iJ5;
                    while (iJ5 < i26) {
                        zzduVar.zzg(Float.intBitsToFloat(zzcp.b(iJ5, bArr)));
                        iJ5 += 4;
                    }
                    if (iJ5 == i26) {
                        return iJ5;
                    }
                    throw zzen.d();
                }
                if (i16 == 5) {
                    zzdu zzduVar2 = (zzdu) zzekVarZzd;
                    zzduVar2.zzg(Float.intBitsToFloat(zzcp.b(iJ3, bArr)));
                    while (true) {
                        i22 = iJ3 + 4;
                        if (i22 < i13) {
                            iJ3 = zzcp.j(bArr, i22, zzcoVar);
                            if (i14 == zzcoVar.zza) {
                                zzduVar2.zzg(Float.intBitsToFloat(zzcp.b(iJ3, bArr)));
                            }
                        }
                    }
                    return i22;
                }
                return iJ3;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i16 == 2) {
                    zzfa zzfaVar = (zzfa) zzekVarZzd;
                    int iJ6 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i27 = zzcoVar.zza + iJ6;
                    while (iJ6 < i27) {
                        iJ6 = zzcp.m(bArr, iJ6, zzcoVar);
                        zzfaVar.zzf(zzcoVar.zzb);
                    }
                    if (iJ6 == i27) {
                        return iJ6;
                    }
                    throw zzen.d();
                }
                if (i16 == 0) {
                    zzfa zzfaVar2 = (zzfa) zzekVarZzd;
                    int iM2 = zzcp.m(bArr, iJ3, zzcoVar);
                    zzfaVar2.zzf(zzcoVar.zzb);
                    while (iM2 < i13) {
                        int iJ7 = zzcp.j(bArr, iM2, zzcoVar);
                        if (i14 != zzcoVar.zza) {
                            return iM2;
                        }
                        iM2 = zzcp.m(bArr, iJ7, zzcoVar);
                        zzfaVar2.zzf(zzcoVar.zzb);
                    }
                    return iM2;
                }
                return iJ3;
            case 22:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 39:
            case 43:
                if (i16 == 2) {
                    return zzcp.f(bArr, iJ3, zzekVarZzd, zzcoVar);
                }
                if (i16 == 0) {
                    return zzcp.l(i14, bArr, i12, i13, zzekVarZzd, zzcoVar);
                }
                return iJ3;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i16 == 2) {
                    zzfa zzfaVar3 = (zzfa) zzekVarZzd;
                    int iJ8 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i28 = zzcoVar.zza + iJ8;
                    while (iJ8 < i28) {
                        zzfaVar3.zzf(zzcp.o(iJ8, bArr));
                        iJ8 += 8;
                    }
                    if (iJ8 == i28) {
                        return iJ8;
                    }
                    throw zzen.d();
                }
                if (i16 == 1) {
                    zzfa zzfaVar4 = (zzfa) zzekVarZzd;
                    zzfaVar4.zzf(zzcp.o(iJ3, bArr));
                    while (true) {
                        i23 = iJ3 + 8;
                        if (i23 < i13) {
                            iJ3 = zzcp.j(bArr, i23, zzcoVar);
                            if (i14 == zzcoVar.zza) {
                                zzfaVar4.zzf(zzcp.o(iJ3, bArr));
                            }
                        }
                    }
                    return i23;
                }
                return iJ3;
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i16 == 2) {
                    zzed zzedVar = (zzed) zzekVarZzd;
                    int iJ9 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i29 = zzcoVar.zza + iJ9;
                    while (iJ9 < i29) {
                        zzedVar.zzg(zzcp.b(iJ9, bArr));
                        iJ9 += 4;
                    }
                    if (iJ9 == i29) {
                        return iJ9;
                    }
                    throw zzen.d();
                }
                if (i16 == 5) {
                    zzed zzedVar2 = (zzed) zzekVarZzd;
                    zzedVar2.zzg(zzcp.b(iJ3, bArr));
                    while (true) {
                        i24 = iJ3 + 4;
                        if (i24 < i13) {
                            iJ3 = zzcp.j(bArr, i24, zzcoVar);
                            if (i14 == zzcoVar.zza) {
                                zzedVar2.zzg(zzcp.b(iJ3, bArr));
                            }
                        }
                    }
                    return i24;
                }
                return iJ3;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 42:
                if (i16 == 2) {
                    zzcq zzcqVar = (zzcq) zzekVarZzd;
                    iJ2 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i32 = zzcoVar.zza + iJ2;
                    while (iJ2 < i32) {
                        iJ2 = zzcp.m(bArr, iJ2, zzcoVar);
                        zzcqVar.zze(zzcoVar.zzb != 0);
                    }
                    if (iJ2 != i32) {
                        throw zzen.d();
                    }
                    return iJ2;
                }
                if (i16 == 0) {
                    zzcq zzcqVar2 = (zzcq) zzekVarZzd;
                    int iM3 = zzcp.m(bArr, iJ3, zzcoVar);
                    zzcqVar2.zze(zzcoVar.zzb != 0);
                    while (iM3 < i13) {
                        int iJ10 = zzcp.j(bArr, iM3, zzcoVar);
                        if (i14 != zzcoVar.zza) {
                            return iM3;
                        }
                        iM3 = zzcp.m(bArr, iJ10, zzcoVar);
                        zzcqVar2.zze(zzcoVar.zzb != 0);
                    }
                    return iM3;
                }
                return iJ3;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                if (i16 == 2) {
                    if ((j12 & 536870912) == 0) {
                        int iJ11 = zzcp.j(bArr, iJ3, zzcoVar);
                        int i33 = zzcoVar.zza;
                        if (i33 < 0) {
                            throw zzen.b();
                        }
                        if (i33 == 0) {
                            zzekVarZzd.add("");
                        } else {
                            zzekVarZzd.add(new String(bArr, iJ11, i33, zzel.f352447a));
                            iJ11 += i33;
                        }
                        while (iJ11 < i13) {
                            int iJ12 = zzcp.j(bArr, iJ11, zzcoVar);
                            if (i14 != zzcoVar.zza) {
                                return iJ11;
                            }
                            iJ11 = zzcp.j(bArr, iJ12, zzcoVar);
                            int i34 = zzcoVar.zza;
                            if (i34 < 0) {
                                throw zzen.b();
                            }
                            if (i34 == 0) {
                                zzekVarZzd.add("");
                            } else {
                                zzekVarZzd.add(new String(bArr, iJ11, i34, zzel.f352447a));
                                iJ11 += i34;
                            }
                        }
                        return iJ11;
                    }
                    int iJ13 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i35 = zzcoVar.zza;
                    if (i35 < 0) {
                        throw zzen.b();
                    }
                    if (i35 == 0) {
                        zzekVarZzd.add("");
                    } else {
                        int i36 = iJ13 + i35;
                        if (!zzhe.d(iJ13, i36, bArr)) {
                            throw zzen.a();
                        }
                        zzekVarZzd.add(new String(bArr, iJ13, i35, zzel.f352447a));
                        iJ13 = i36;
                    }
                    while (iJ13 < i13) {
                        int iJ14 = zzcp.j(bArr, iJ13, zzcoVar);
                        if (i14 != zzcoVar.zza) {
                            return iJ13;
                        }
                        iJ13 = zzcp.j(bArr, iJ14, zzcoVar);
                        int i37 = zzcoVar.zza;
                        if (i37 < 0) {
                            throw zzen.b();
                        }
                        if (i37 == 0) {
                            zzekVarZzd.add("");
                        } else {
                            int i38 = iJ13 + i37;
                            if (!zzhe.d(iJ13, i38, bArr)) {
                                throw zzen.a();
                            }
                            zzekVarZzd.add(new String(bArr, iJ13, i37, zzel.f352447a));
                            iJ13 = i38;
                        }
                    }
                    return iJ13;
                }
                return iJ3;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (i16 == 2) {
                    return zzcp.e(e(i17), i14, bArr, i12, i13, zzekVarZzd, zzcoVar);
                }
                return iJ3;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (i16 == 2) {
                    int iJ15 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i39 = zzcoVar.zza;
                    if (i39 < 0) {
                        throw zzen.b();
                    }
                    if (i39 > bArr.length - iJ15) {
                        throw zzen.d();
                    }
                    if (i39 == 0) {
                        zzekVarZzd.add(zzdb.zzb);
                    } else {
                        zzekVarZzd.add(zzdb.zzr(bArr, iJ15, i39));
                        iJ15 += i39;
                    }
                    while (iJ15 < i13) {
                        int iJ16 = zzcp.j(bArr, iJ15, zzcoVar);
                        if (i14 != zzcoVar.zza) {
                            return iJ15;
                        }
                        iJ15 = zzcp.j(bArr, iJ16, zzcoVar);
                        int i42 = zzcoVar.zza;
                        if (i42 < 0) {
                            throw zzen.b();
                        }
                        if (i42 > bArr.length - iJ15) {
                            throw zzen.d();
                        }
                        if (i42 == 0) {
                            zzekVarZzd.add(zzdb.zzb);
                        } else {
                            zzekVarZzd.add(zzdb.zzr(bArr, iJ15, i42));
                            iJ15 += i42;
                        }
                    }
                    return iJ15;
                }
                return iJ3;
            case 30:
            case 44:
                if (i16 != 2) {
                    if (i16 == 0) {
                        iJ2 = zzcp.l(i14, bArr, i12, i13, zzekVarZzd, zzcoVar);
                    }
                    return iJ3;
                }
                iJ2 = zzcp.f(bArr, iJ3, zzekVarZzd, zzcoVar);
                zzec zzecVar = (zzec) obj;
                zzgq zzgqVar = zzecVar.zzc;
                if (zzgqVar == zzgq.zzc()) {
                    zzgqVar = null;
                }
                Object objA = zzgd.a(i15, zzekVarZzd, d(i17), zzgqVar, this.f352483l);
                if (objA != null) {
                    zzecVar.zzc = (zzgq) objA;
                    return iJ2;
                }
                return iJ2;
            case 33:
            case 47:
                if (i16 == 2) {
                    zzed zzedVar3 = (zzed) zzekVarZzd;
                    int iJ17 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i43 = zzcoVar.zza + iJ17;
                    while (iJ17 < i43) {
                        iJ17 = zzcp.j(bArr, iJ17, zzcoVar);
                        zzedVar3.zzg(zzde.zzb(zzcoVar.zza));
                    }
                    if (iJ17 == i43) {
                        return iJ17;
                    }
                    throw zzen.d();
                }
                if (i16 == 0) {
                    zzed zzedVar4 = (zzed) zzekVarZzd;
                    int iJ18 = zzcp.j(bArr, iJ3, zzcoVar);
                    zzedVar4.zzg(zzde.zzb(zzcoVar.zza));
                    while (iJ18 < i13) {
                        int iJ19 = zzcp.j(bArr, iJ18, zzcoVar);
                        if (i14 != zzcoVar.zza) {
                            return iJ18;
                        }
                        iJ18 = zzcp.j(bArr, iJ19, zzcoVar);
                        zzedVar4.zzg(zzde.zzb(zzcoVar.zza));
                    }
                    return iJ18;
                }
                return iJ3;
            case 34:
            case 48:
                if (i16 == 2) {
                    zzfa zzfaVar5 = (zzfa) zzekVarZzd;
                    int iJ20 = zzcp.j(bArr, iJ3, zzcoVar);
                    int i44 = zzcoVar.zza + iJ20;
                    while (iJ20 < i44) {
                        iJ20 = zzcp.m(bArr, iJ20, zzcoVar);
                        zzfaVar5.zzf(zzde.zzc(zzcoVar.zzb));
                    }
                    if (iJ20 == i44) {
                        return iJ20;
                    }
                    throw zzen.d();
                }
                if (i16 == 0) {
                    zzfa zzfaVar6 = (zzfa) zzekVarZzd;
                    int iM4 = zzcp.m(bArr, iJ3, zzcoVar);
                    zzfaVar6.zzf(zzde.zzc(zzcoVar.zzb));
                    while (iM4 < i13) {
                        int iJ21 = zzcp.j(bArr, iM4, zzcoVar);
                        if (i14 != zzcoVar.zza) {
                            return iM4;
                        }
                        iM4 = zzcp.m(bArr, iJ21, zzcoVar);
                        zzfaVar6.zzf(zzde.zzc(zzcoVar.zzb));
                    }
                    return iM4;
                }
                return iJ3;
            default:
                if (i16 == 3) {
                    zzgb zzgbVarE = e(i17);
                    int i45 = (i14 & (-8)) | 4;
                    int iC2 = zzcp.c(zzgbVarE, bArr, i12, i13, i45, zzcoVar);
                    zzekVarZzd.add(zzcoVar.zzc);
                    while (iC2 < i13) {
                        int iJ22 = zzcp.j(bArr, iC2, zzcoVar);
                        if (i14 != zzcoVar.zza) {
                            return iC2;
                        }
                        iC2 = zzcp.c(zzgbVarE, bArr, iJ22, i13, i45, zzcoVar);
                        zzekVarZzd.add(zzcoVar.zzc);
                    }
                    return iC2;
                }
                return iJ3;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final int zza(Object obj) {
        return this.f352478g ? u(obj) : t(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final int zzb(Object obj) {
        int i12;
        int iZzc;
        int i13;
        int iZzj;
        int[] iArr = this.f352472a;
        int length = iArr.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iB2 = b(i15);
            int i16 = iArr[i15];
            long j12 = 1048575 & iB2;
            int iHashCode = 37;
            switch (a(iB2)) {
                case 0:
                    i12 = i14 * 53;
                    iZzc = zzel.zzc(Double.doubleToLongBits(zzgz.f352545c.zza(obj, j12)));
                    i14 = iZzc + i12;
                    break;
                case 1:
                    i12 = i14 * 53;
                    iZzc = Float.floatToIntBits(zzgz.f352545c.zzb(obj, j12));
                    i14 = iZzc + i12;
                    break;
                case 2:
                    i12 = i14 * 53;
                    iZzc = zzel.zzc(zzgz.f352545c.zzk(obj, j12));
                    i14 = iZzc + i12;
                    break;
                case 3:
                    i12 = i14 * 53;
                    iZzc = zzel.zzc(zzgz.f352545c.zzk(obj, j12));
                    i14 = iZzc + i12;
                    break;
                case 4:
                    i13 = i14 * 53;
                    iZzj = zzgz.f352545c.zzj(obj, j12);
                    i14 = i13 + iZzj;
                    break;
                case 5:
                    i12 = i14 * 53;
                    iZzc = zzel.zzc(zzgz.f352545c.zzk(obj, j12));
                    i14 = iZzc + i12;
                    break;
                case 6:
                    i13 = i14 * 53;
                    iZzj = zzgz.f352545c.zzj(obj, j12);
                    i14 = i13 + iZzj;
                    break;
                case 7:
                    i12 = i14 * 53;
                    iZzc = zzel.zza(zzgz.f352545c.zzg(obj, j12));
                    i14 = iZzc + i12;
                    break;
                case 8:
                    i12 = i14 * 53;
                    iZzc = ((String) zzgz.f352545c.zzm(obj, j12)).hashCode();
                    i14 = iZzc + i12;
                    break;
                case 9:
                    Object objZzm = zzgz.f352545c.zzm(obj, j12);
                    if (objZzm != null) {
                        iHashCode = objZzm.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i12 = i14 * 53;
                    iZzc = zzgz.f352545c.zzm(obj, j12).hashCode();
                    i14 = iZzc + i12;
                    break;
                case 11:
                    i13 = i14 * 53;
                    iZzj = zzgz.f352545c.zzj(obj, j12);
                    i14 = i13 + iZzj;
                    break;
                case 12:
                    i13 = i14 * 53;
                    iZzj = zzgz.f352545c.zzj(obj, j12);
                    i14 = i13 + iZzj;
                    break;
                case 13:
                    i13 = i14 * 53;
                    iZzj = zzgz.f352545c.zzj(obj, j12);
                    i14 = i13 + iZzj;
                    break;
                case 14:
                    i12 = i14 * 53;
                    iZzc = zzel.zzc(zzgz.f352545c.zzk(obj, j12));
                    i14 = iZzc + i12;
                    break;
                case 15:
                    i13 = i14 * 53;
                    iZzj = zzgz.f352545c.zzj(obj, j12);
                    i14 = i13 + iZzj;
                    break;
                case 16:
                    i12 = i14 * 53;
                    iZzc = zzel.zzc(zzgz.f352545c.zzk(obj, j12));
                    i14 = iZzc + i12;
                    break;
                case 17:
                    Object objZzm2 = zzgz.f352545c.zzm(obj, j12);
                    if (objZzm2 != null) {
                        iHashCode = objZzm2.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
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
                    i12 = i14 * 53;
                    iZzc = zzgz.f352545c.zzm(obj, j12).hashCode();
                    i14 = iZzc + i12;
                    break;
                case 50:
                    i12 = i14 * 53;
                    iZzc = zzgz.f352545c.zzm(obj, j12).hashCode();
                    i14 = iZzc + i12;
                    break;
                case 51:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzel.zzc(Double.doubleToLongBits(((Double) zzgz.f352545c.zzm(obj, j12)).doubleValue()));
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = Float.floatToIntBits(((Float) zzgz.f352545c.zzm(obj, j12)).floatValue());
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzel.zzc(c(j12, obj));
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzel.zzc(c(j12, obj));
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iZzj = v(j12, obj);
                        i14 = i13 + iZzj;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzel.zzc(c(j12, obj));
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iZzj = v(j12, obj);
                        i14 = i13 + iZzj;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzel.zza(((Boolean) zzgz.f352545c.zzm(obj, j12)).booleanValue());
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = ((String) zzgz.f352545c.zzm(obj, j12)).hashCode();
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzgz.f352545c.zzm(obj, j12).hashCode();
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzgz.f352545c.zzm(obj, j12).hashCode();
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iZzj = v(j12, obj);
                        i14 = i13 + iZzj;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iZzj = v(j12, obj);
                        i14 = i13 + iZzj;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iZzj = v(j12, obj);
                        i14 = i13 + iZzj;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzel.zzc(c(j12, obj));
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (m(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iZzj = v(j12, obj);
                        i14 = i13 + iZzj;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzel.zzc(c(j12, obj));
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (m(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iZzc = zzgz.f352545c.zzm(obj, j12).hashCode();
                        i14 = iZzc + i12;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = this.f352483l.c(obj).hashCode() + (i14 * 53);
        return this.f352477f ? (iHashCode2 * 53) + this.f352484m.b(obj).f352425a.hashCode() : iHashCode2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final Object zze() {
        return ((zzec) this.f352476e).m(4, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzf(Object obj) {
        int[] iArr;
        int i12;
        int i13 = this.f352480i;
        while (true) {
            iArr = this.f352479h;
            i12 = this.f352481j;
            if (i13 >= i12) {
                break;
            }
            long jB2 = b(iArr[i13]) & 1048575;
            Object objZzm = zzgz.f352545c.zzm(obj, jB2);
            if (objZzm != null) {
                ((zzff) objZzm).zzc();
                zzgz.o(obj, jB2, objZzm);
            }
            i13++;
        }
        int length = iArr.length;
        while (i12 < length) {
            this.f352482k.a(iArr[i12], obj);
            i12++;
        }
        this.f352483l.g(obj);
        if (this.f352477f) {
            this.f352484m.e(obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        int i12 = 0;
        while (true) {
            int[] iArr = this.f352472a;
            if (i12 >= iArr.length) {
                Class cls = zzgd.f352512a;
                zzgp zzgpVar = this.f352483l;
                zzgpVar.h(obj, zzgpVar.d(zzgpVar.c(obj), zzgpVar.c(obj2)));
                if (this.f352477f) {
                    zzdo zzdoVar = this.f352484m;
                    zzds zzdsVarB = zzdoVar.b(obj2);
                    if (zzdsVarB.f352425a.isEmpty()) {
                        return;
                    }
                    zzdoVar.c(obj).zzh(zzdsVarB);
                    return;
                }
                return;
            }
            int iB2 = b(i12);
            long j12 = iB2 & 1048575;
            int i13 = iArr[i12];
            switch (a(iB2)) {
                case 0:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.l(obj, j12, zzgz.f352545c.zza(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 1:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.m(obj, j12, zzgz.f352545c.zzb(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 2:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgy zzgyVar = zzgz.f352545c;
                        zzgyVar.zzo(obj, j12, zzgyVar.zzk(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 3:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgy zzgyVar2 = zzgz.f352545c;
                        zzgyVar2.zzo(obj, j12, zzgyVar2.zzk(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 4:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.n(zzgz.f352545c.zzj(obj2, j12), j12, obj);
                        j(i12, obj);
                        break;
                    }
                case 5:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgy zzgyVar3 = zzgz.f352545c;
                        zzgyVar3.zzo(obj, j12, zzgyVar3.zzk(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 6:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.n(zzgz.f352545c.zzj(obj2, j12), j12, obj);
                        j(i12, obj);
                        break;
                    }
                case 7:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.k(obj, j12, zzgz.f352545c.zzg(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 8:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.o(obj, j12, zzgz.f352545c.zzm(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 9:
                    h(i12, obj, obj2);
                    break;
                case 10:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.o(obj, j12, zzgz.f352545c.zzm(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 11:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.n(zzgz.f352545c.zzj(obj2, j12), j12, obj);
                        j(i12, obj);
                        break;
                    }
                case 12:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.n(zzgz.f352545c.zzj(obj2, j12), j12, obj);
                        j(i12, obj);
                        break;
                    }
                case 13:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.n(zzgz.f352545c.zzj(obj2, j12), j12, obj);
                        j(i12, obj);
                        break;
                    }
                case 14:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgy zzgyVar4 = zzgz.f352545c;
                        zzgyVar4.zzo(obj, j12, zzgyVar4.zzk(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 15:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgz.n(zzgz.f352545c.zzj(obj2, j12), j12, obj);
                        j(i12, obj);
                        break;
                    }
                case 16:
                    if (!l(i12, obj2)) {
                        break;
                    } else {
                        zzgy zzgyVar5 = zzgz.f352545c;
                        zzgyVar5.zzo(obj, j12, zzgyVar5.zzk(obj2, j12));
                        j(i12, obj);
                        break;
                    }
                case 17:
                    h(i12, obj, obj2);
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
                    this.f352482k.b(obj, j12, obj2);
                    break;
                case 50:
                    Class cls2 = zzgd.f352512a;
                    zzgy zzgyVar6 = zzgz.f352545c;
                    zzgz.o(obj, j12, zzfg.zzb(zzgyVar6.zzm(obj, j12), zzgyVar6.zzm(obj2, j12)));
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
                    if (!m(i13, i12, obj2)) {
                        break;
                    } else {
                        zzgz.o(obj, j12, zzgz.f352545c.zzm(obj2, j12));
                        zzgz.n(i13, iArr[i12 + 2] & 1048575, obj);
                        break;
                    }
                case 60:
                    i(i12, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m(i13, i12, obj2)) {
                        break;
                    } else {
                        zzgz.o(obj, j12, zzgz.f352545c.zzm(obj2, j12));
                        zzgz.n(i13, iArr[i12 + 2] & 1048575, obj);
                        break;
                    }
                case 68:
                    i(i12, obj, obj2);
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final void zzh(Object obj, byte[] bArr, int i12, int i13, zzco zzcoVar) throws zzen {
        if (this.f352478g) {
            y(obj, bArr, i12, i13, zzcoVar);
        } else {
            p(obj, bArr, i12, i13, 0, zzcoVar);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    public final boolean zzi(Object obj, Object obj2) {
        boolean zB2;
        int[] iArr = this.f352472a;
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iB2 = b(i12);
            long j12 = iB2 & 1048575;
            switch (a(iB2)) {
                case 0:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar = zzgz.f352545c;
                        if (Double.doubleToLongBits(zzgyVar.zza(obj, j12)) == Double.doubleToLongBits(zzgyVar.zza(obj2, j12))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar2 = zzgz.f352545c;
                        if (Float.floatToIntBits(zzgyVar2.zzb(obj, j12)) == Float.floatToIntBits(zzgyVar2.zzb(obj2, j12))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar3 = zzgz.f352545c;
                        if (zzgyVar3.zzk(obj, j12) == zzgyVar3.zzk(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 3:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar4 = zzgz.f352545c;
                        if (zzgyVar4.zzk(obj, j12) == zzgyVar4.zzk(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 4:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar5 = zzgz.f352545c;
                        if (zzgyVar5.zzj(obj, j12) == zzgyVar5.zzj(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 5:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar6 = zzgz.f352545c;
                        if (zzgyVar6.zzk(obj, j12) == zzgyVar6.zzk(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 6:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar7 = zzgz.f352545c;
                        if (zzgyVar7.zzj(obj, j12) == zzgyVar7.zzj(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 7:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar8 = zzgz.f352545c;
                        if (zzgyVar8.zzg(obj, j12) == zzgyVar8.zzg(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar9 = zzgz.f352545c;
                        if (zzgd.b(zzgyVar9.zzm(obj, j12), zzgyVar9.zzm(obj2, j12))) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar10 = zzgz.f352545c;
                        if (zzgd.b(zzgyVar10.zzm(obj, j12), zzgyVar10.zzm(obj2, j12))) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar11 = zzgz.f352545c;
                        if (zzgd.b(zzgyVar11.zzm(obj, j12), zzgyVar11.zzm(obj2, j12))) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar12 = zzgz.f352545c;
                        if (zzgyVar12.zzj(obj, j12) == zzgyVar12.zzj(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 12:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar13 = zzgz.f352545c;
                        if (zzgyVar13.zzj(obj, j12) == zzgyVar13.zzj(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 13:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar14 = zzgz.f352545c;
                        if (zzgyVar14.zzj(obj, j12) == zzgyVar14.zzj(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 14:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar15 = zzgz.f352545c;
                        if (zzgyVar15.zzk(obj, j12) == zzgyVar15.zzk(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 15:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar16 = zzgz.f352545c;
                        if (zzgyVar16.zzj(obj, j12) == zzgyVar16.zzj(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 16:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar17 = zzgz.f352545c;
                        if (zzgyVar17.zzk(obj, j12) == zzgyVar17.zzk(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 17:
                    if (k(i12, obj, obj2)) {
                        zzgy zzgyVar18 = zzgz.f352545c;
                        if (zzgd.b(zzgyVar18.zzm(obj, j12), zzgyVar18.zzm(obj2, j12))) {
                            continue;
                        }
                    }
                    return false;
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
                    zzgy zzgyVar19 = zzgz.f352545c;
                    zB2 = zzgd.b(zzgyVar19.zzm(obj, j12), zzgyVar19.zzm(obj2, j12));
                    break;
                case 50:
                    zzgy zzgyVar20 = zzgz.f352545c;
                    zB2 = zzgd.b(zzgyVar20.zzm(obj, j12), zzgyVar20.zzm(obj2, j12));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j13 = iArr[i12 + 2] & 1048575;
                    zzgy zzgyVar21 = zzgz.f352545c;
                    if (zzgyVar21.zzj(obj, j13) != zzgyVar21.zzj(obj2, j13) || !zzgd.b(zzgyVar21.zzm(obj, j12), zzgyVar21.zzm(obj2, j12))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!zB2) {
                return false;
            }
        }
        zzgp zzgpVar = this.f352483l;
        if (!zzgpVar.c(obj).equals(zzgpVar.c(obj2))) {
            return false;
        }
        if (!this.f352477f) {
            return true;
        }
        zzdo zzdoVar = this.f352484m;
        return zzdoVar.b(obj).equals(zzdoVar.b(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzj(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzj(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdo] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map$Entry] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzm(java.lang.Object r18, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo.zzm(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj):void");
    }
}
