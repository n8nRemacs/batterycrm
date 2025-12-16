package com.google.android.gms.internal.auth;

import androidx.media3.common.C23088b;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzga<T> implements zzgi<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f350121k = new int[0];

    /* renamed from: l, reason: collision with root package name */
    public static final Unsafe f350122l = zzhj.e();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f350123a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f350124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350125c;

    /* renamed from: d, reason: collision with root package name */
    public final int f350126d;

    /* renamed from: e, reason: collision with root package name */
    public final zzfx f350127e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f350128f;

    /* renamed from: g, reason: collision with root package name */
    public final int f350129g;

    /* renamed from: h, reason: collision with root package name */
    public final int f350130h;

    /* renamed from: i, reason: collision with root package name */
    public final zzfl f350131i;

    /* renamed from: j, reason: collision with root package name */
    public final zzgz f350132j;

    public zzga(int[] iArr, Object[] objArr, int i12, int i13, zzfx zzfxVar, int[] iArr2, int i14, int i15, zzfl zzflVar, zzgz zzgzVar) {
        this.f350123a = iArr;
        this.f350124b = objArr;
        this.f350125c = i12;
        this.f350126d = i13;
        this.f350128f = iArr2;
        this.f350129g = i14;
        this.f350130h = i15;
        this.f350131i = zzflVar;
        this.f350132j = zzgzVar;
        this.f350127e = zzfxVar;
    }

    public static boolean e(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).f();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0370  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.auth.zzga h(com.google.android.gms.internal.auth.zzfu r31, com.google.android.gms.internal.auth.zzfl r32, com.google.android.gms.internal.auth.zzgz r33) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.h(com.google.android.gms.internal.auth.zzfu, com.google.android.gms.internal.auth.zzfl, com.google.android.gms.internal.auth.zzgz):com.google.android.gms.internal.auth.zzga");
    }

    public static int i(long j12, Object obj) {
        return ((Integer) zzhj.d(j12, obj)).intValue();
    }

    public static int k(int i12) {
        return (i12 >>> 20) & 255;
    }

    public static Field q(Class cls, String str) {
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
            StringBuilder sbB = C23088b.b("Field ", str, " for ", name, " not found. Known fields are ");
            sbB.append(string);
            throw new RuntimeException(sbB.toString());
        }
    }

    public final void a(int i12, Object obj, Object obj2) {
        f350122l.putObject(obj, l(i12) & 1048575, obj2);
        t(i12, obj);
    }

    public final void b(int i12, Object obj, Object obj2, int i13) {
        f350122l.putObject(obj, l(i13) & 1048575, obj2);
        zzhj.k(obj, this.f350123a[i13 + 2] & 1048575, i12);
    }

    public final boolean c(int i12, Object obj, Object obj2) {
        return d(i12, obj) == d(i12, obj2);
    }

    public final boolean d(int i12, Object obj) {
        int i13 = this.f350123a[i12 + 2];
        long j12 = i13 & 1048575;
        if (j12 != 1048575) {
            return ((1 << (i13 >>> 20)) & zzhj.a(j12, obj)) != 0;
        }
        int iL2 = l(i12);
        long j13 = iL2 & 1048575;
        switch (k(iL2)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.f350177c.zza(obj, j13)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.f350177c.zzb(obj, j13)) != 0;
            case 2:
                return zzhj.b(j13, obj) != 0;
            case 3:
                return zzhj.b(j13, obj) != 0;
            case 4:
                return zzhj.a(j13, obj) != 0;
            case 5:
                return zzhj.b(j13, obj) != 0;
            case 6:
                return zzhj.a(j13, obj) != 0;
            case 7:
                return zzhj.f350177c.zzf(obj, j13);
            case 8:
                Object objD = zzhj.d(j13, obj);
                if (objD instanceof String) {
                    return !((String) objD).isEmpty();
                }
                if (objD instanceof zzef) {
                    return !zzef.zzb.equals(objD);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.d(j13, obj) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.d(j13, obj));
            case 11:
                return zzhj.a(j13, obj) != 0;
            case 12:
                return zzhj.a(j13, obj) != 0;
            case 13:
                return zzhj.a(j13, obj) != 0;
            case 14:
                return zzhj.b(j13, obj) != 0;
            case 15:
                return zzhj.a(j13, obj) != 0;
            case 16:
                return zzhj.b(j13, obj) != 0;
            case 17:
                return zzhj.d(j13, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean f(int i12, int i13, Object obj) {
        return zzhj.a((long) (this.f350123a[i13 + 2] & 1048575), obj) == i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x0840, code lost:
    
        r39 = r6;
        r1 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0e56  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0b4c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0e24 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0b5a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x0e38 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:763:0x02f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) throws com.google.android.gms.internal.auth.zzfb {
        /*
            Method dump skipped, instructions count: 3964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.g(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    public final int j(int i12, int i13) {
        int[] iArr = this.f350123a;
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

    public final int l(int i12) {
        return this.f350123a[i12 + 1];
    }

    public final zzey m(int i12) {
        int i13 = i12 / 3;
        return (zzey) this.f350124b[i13 + i13 + 1];
    }

    public final zzgi n(int i12) {
        int i13 = i12 / 3;
        int i14 = i13 + i13;
        Object[] objArr = this.f350124b;
        zzgi zzgiVar = (zzgi) objArr[i14];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) objArr[i14 + 1]);
        objArr[i14] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    public final Object o(int i12, Object obj) {
        zzgi zzgiVarN = n(i12);
        int iL2 = l(i12) & 1048575;
        if (!d(i12, obj)) {
            return zzgiVarN.zzd();
        }
        Object object = f350122l.getObject(obj, iL2);
        if (e(object)) {
            return object;
        }
        Object objZzd = zzgiVarN.zzd();
        if (object != null) {
            zzgiVarN.zzf(objZzd, object);
        }
        return objZzd;
    }

    public final Object p(int i12, int i13, Object obj) {
        zzgi zzgiVarN = n(i13);
        if (!f(i12, i13, obj)) {
            return zzgiVarN.zzd();
        }
        Object object = f350122l.getObject(obj, l(i13) & 1048575);
        if (e(object)) {
            return object;
        }
        Object objZzd = zzgiVarN.zzd();
        if (object != null) {
            zzgiVarN.zzf(objZzd, object);
        }
        return objZzd;
    }

    public final void r(int i12, Object obj, Object obj2) {
        if (d(i12, obj2)) {
            int iL2 = l(i12) & 1048575;
            Unsafe unsafe = f350122l;
            long j12 = iL2;
            Object object = unsafe.getObject(obj2, j12);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f350123a[i12] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarN = n(i12);
            if (!d(i12, obj)) {
                if (e(object)) {
                    Object objZzd = zzgiVarN.zzd();
                    zzgiVarN.zzf(objZzd, object);
                    unsafe.putObject(obj, j12, objZzd);
                } else {
                    unsafe.putObject(obj, j12, object);
                }
                t(i12, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j12);
            if (!e(object2)) {
                Object objZzd2 = zzgiVarN.zzd();
                zzgiVarN.zzf(objZzd2, object2);
                unsafe.putObject(obj, j12, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarN.zzf(object2, object);
        }
    }

    public final void s(int i12, Object obj, Object obj2) {
        int[] iArr = this.f350123a;
        int i13 = iArr[i12];
        if (f(i13, i12, obj2)) {
            int iL2 = l(i12) & 1048575;
            Unsafe unsafe = f350122l;
            long j12 = iL2;
            Object object = unsafe.getObject(obj2, j12);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i12] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarN = n(i12);
            if (!f(i13, i12, obj)) {
                if (e(object)) {
                    Object objZzd = zzgiVarN.zzd();
                    zzgiVarN.zzf(objZzd, object);
                    unsafe.putObject(obj, j12, objZzd);
                } else {
                    unsafe.putObject(obj, j12, object);
                }
                zzhj.k(obj, iArr[i12 + 2] & 1048575, i13);
                return;
            }
            Object object2 = unsafe.getObject(obj, j12);
            if (!e(object2)) {
                Object objZzd2 = zzgiVarN.zzd();
                zzgiVarN.zzf(objZzd2, object2);
                unsafe.putObject(obj, j12, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarN.zzf(object2, object);
        }
    }

    public final void t(int i12, Object obj) {
        int i13 = this.f350123a[i12 + 2];
        long j12 = 1048575 & i13;
        if (j12 == 1048575) {
            return;
        }
        zzhj.k(obj, j12, (1 << (i13 >>> 20)) | zzhj.a(j12, obj));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i12;
        long jDoubleToLongBits;
        int i13;
        int iFloatToIntBits;
        int iA2;
        int[] iArr = this.f350123a;
        int length = iArr.length;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15 += 3) {
            int iL2 = l(i15);
            int i16 = iArr[i15];
            long j12 = 1048575 & iL2;
            int iHashCode = 37;
            switch (k(iL2)) {
                case 0:
                    i12 = i14 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.f350177c.zza(obj, j12));
                    Charset charset = zzfa.f350106a;
                    iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i12 + iA2;
                    break;
                case 1:
                    i13 = i14 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.f350177c.zzb(obj, j12));
                    i14 = iFloatToIntBits + i13;
                    break;
                case 2:
                    i12 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(j12, obj);
                    Charset charset2 = zzfa.f350106a;
                    iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i12 + iA2;
                    break;
                case 3:
                    i12 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(j12, obj);
                    Charset charset3 = zzfa.f350106a;
                    iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i12 + iA2;
                    break;
                case 4:
                    i12 = i14 * 53;
                    iA2 = zzhj.a(j12, obj);
                    i14 = i12 + iA2;
                    break;
                case 5:
                    i12 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(j12, obj);
                    Charset charset4 = zzfa.f350106a;
                    iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i12 + iA2;
                    break;
                case 6:
                    i12 = i14 * 53;
                    iA2 = zzhj.a(j12, obj);
                    i14 = i12 + iA2;
                    break;
                case 7:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.f350177c.zzf(obj, j12));
                    i14 = iFloatToIntBits + i13;
                    break;
                case 8:
                    i13 = i14 * 53;
                    iFloatToIntBits = ((String) zzhj.d(j12, obj)).hashCode();
                    i14 = iFloatToIntBits + i13;
                    break;
                case 9:
                    Object objD = zzhj.d(j12, obj);
                    if (objD != null) {
                        iHashCode = objD.hashCode();
                    }
                    i14 = (i14 * 53) + iHashCode;
                    break;
                case 10:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.d(j12, obj).hashCode();
                    i14 = iFloatToIntBits + i13;
                    break;
                case 11:
                    i12 = i14 * 53;
                    iA2 = zzhj.a(j12, obj);
                    i14 = i12 + iA2;
                    break;
                case 12:
                    i12 = i14 * 53;
                    iA2 = zzhj.a(j12, obj);
                    i14 = i12 + iA2;
                    break;
                case 13:
                    i12 = i14 * 53;
                    iA2 = zzhj.a(j12, obj);
                    i14 = i12 + iA2;
                    break;
                case 14:
                    i12 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(j12, obj);
                    Charset charset5 = zzfa.f350106a;
                    iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i12 + iA2;
                    break;
                case 15:
                    i12 = i14 * 53;
                    iA2 = zzhj.a(j12, obj);
                    i14 = i12 + iA2;
                    break;
                case 16:
                    i12 = i14 * 53;
                    jDoubleToLongBits = zzhj.b(j12, obj);
                    Charset charset6 = zzfa.f350106a;
                    iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i14 = i12 + iA2;
                    break;
                case 17:
                    Object objD2 = zzhj.d(j12, obj);
                    if (objD2 != null) {
                        iHashCode = objD2.hashCode();
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
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.d(j12, obj).hashCode();
                    i14 = iFloatToIntBits + i13;
                    break;
                case 50:
                    i13 = i14 * 53;
                    iFloatToIntBits = zzhj.d(j12, obj).hashCode();
                    i14 = iFloatToIntBits + i13;
                    break;
                case 51:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.d(j12, obj)).doubleValue());
                        Charset charset7 = zzfa.f350106a;
                        iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (f(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.d(j12, obj)).floatValue());
                        i14 = iFloatToIntBits + i13;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(j12, obj)).longValue();
                        Charset charset8 = zzfa.f350106a;
                        iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(j12, obj)).longValue();
                        Charset charset9 = zzfa.f350106a;
                        iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iA2 = i(j12, obj);
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(j12, obj)).longValue();
                        Charset charset10 = zzfa.f350106a;
                        iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iA2 = i(j12, obj);
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (f(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.d(j12, obj)).booleanValue());
                        i14 = iFloatToIntBits + i13;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (f(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = ((String) zzhj.d(j12, obj)).hashCode();
                        i14 = iFloatToIntBits + i13;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (f(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzhj.d(j12, obj).hashCode();
                        i14 = iFloatToIntBits + i13;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (f(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzhj.d(j12, obj).hashCode();
                        i14 = iFloatToIntBits + i13;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iA2 = i(j12, obj);
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iA2 = i(j12, obj);
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iA2 = i(j12, obj);
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(j12, obj)).longValue();
                        Charset charset11 = zzfa.f350106a;
                        iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        iA2 = i(j12, obj);
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (f(i16, i15, obj)) {
                        i12 = i14 * 53;
                        jDoubleToLongBits = ((Long) zzhj.d(j12, obj)).longValue();
                        Charset charset12 = zzfa.f350106a;
                        iA2 = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i14 = i12 + iA2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (f(i16, i15, obj)) {
                        i13 = i14 * 53;
                        iFloatToIntBits = zzhj.d(j12, obj).hashCode();
                        i14 = iFloatToIntBits + i13;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this.f350132j.b(obj).hashCode() + (i14 * 53);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return (zzev) ((zzev) this.f350127e).g(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = e(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof com.google.android.gms.internal.auth.zzev
            r1 = 0
            if (r0 == 0) goto L17
            r0 = r9
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            r0.e()
            r0.zza = r1
            r0.c()
        L17:
            int[] r0 = r8.f350123a
            int r2 = r0.length
        L1a:
            if (r1 >= r2) goto L7d
            int r3 = r8.l(r1)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            int r3 = k(r3)
            long r4 = (long) r4
            r6 = 9
            if (r3 == r6) goto L67
            r6 = 60
            if (r3 == r6) goto L51
            r6 = 68
            if (r3 == r6) goto L51
            switch(r3) {
                case 17: goto L67;
                case 18: goto L4b;
                case 19: goto L4b;
                case 20: goto L4b;
                case 21: goto L4b;
                case 22: goto L4b;
                case 23: goto L4b;
                case 24: goto L4b;
                case 25: goto L4b;
                case 26: goto L4b;
                case 27: goto L4b;
                case 28: goto L4b;
                case 29: goto L4b;
                case 30: goto L4b;
                case 31: goto L4b;
                case 32: goto L4b;
                case 33: goto L4b;
                case 34: goto L4b;
                case 35: goto L4b;
                case 36: goto L4b;
                case 37: goto L4b;
                case 38: goto L4b;
                case 39: goto L4b;
                case 40: goto L4b;
                case 41: goto L4b;
                case 42: goto L4b;
                case 43: goto L4b;
                case 44: goto L4b;
                case 45: goto L4b;
                case 46: goto L4b;
                case 47: goto L4b;
                case 48: goto L4b;
                case 49: goto L4b;
                case 50: goto L39;
                default: goto L38;
            }
        L38:
            goto L7a
        L39:
            sun.misc.Unsafe r3 = com.google.android.gms.internal.auth.zzga.f350122l
            java.lang.Object r6 = r3.getObject(r9, r4)
            if (r6 == 0) goto L7a
            r7 = r6
            com.google.android.gms.internal.auth.zzfr r7 = (com.google.android.gms.internal.auth.zzfr) r7
            r7.zzc()
            r3.putObject(r9, r4, r6)
            goto L7a
        L4b:
            com.google.android.gms.internal.auth.zzfl r3 = r8.f350131i
            r3.a(r4, r9)
            goto L7a
        L51:
            r3 = r0[r1]
            boolean r3 = r8.f(r3, r1, r9)
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.auth.zzgi r3 = r8.n(r1)
            sun.misc.Unsafe r6 = com.google.android.gms.internal.auth.zzga.f350122l
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.zze(r4)
            goto L7a
        L67:
            boolean r3 = r8.d(r1, r9)
            if (r3 == 0) goto L7a
            com.google.android.gms.internal.auth.zzgi r3 = r8.n(r1)
            sun.misc.Unsafe r6 = com.google.android.gms.internal.auth.zzga.f350122l
            java.lang.Object r4 = r6.getObject(r9, r4)
            r3.zze(r4)
        L7a:
            int r1 = r1 + 3
            goto L1a
        L7d:
            com.google.android.gms.internal.auth.zzgz r0 = r8.f350132j
            r0.e(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zze(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        if (!e(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i12 = 0;
        while (true) {
            int[] iArr = this.f350123a;
            if (i12 >= iArr.length) {
                Class cls = zzgk.f350146a;
                zzgz zzgzVar = this.f350132j;
                zzgzVar.f(obj, zzgzVar.c(zzgzVar.b(obj), zzgzVar.b(obj2)));
                return;
            }
            int iL2 = l(i12);
            int i13 = iArr[i12];
            long j12 = iL2 & 1048575;
            switch (k(iL2)) {
                case 0:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.i(obj, j12, zzhj.f350177c.zza(obj2, j12));
                        t(i12, obj);
                        break;
                    }
                case 1:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.j(obj, j12, zzhj.f350177c.zzb(obj2, j12));
                        t(i12, obj);
                        break;
                    }
                case 2:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.l(obj, j12, zzhj.b(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 3:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.l(obj, j12, zzhj.b(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 4:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.k(obj, j12, zzhj.a(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 5:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.l(obj, j12, zzhj.b(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 6:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.k(obj, j12, zzhj.a(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 7:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.h(obj, j12, zzhj.f350177c.zzf(obj2, j12));
                        t(i12, obj);
                        break;
                    }
                case 8:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.m(obj, j12, zzhj.d(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 9:
                    r(i12, obj, obj2);
                    break;
                case 10:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.m(obj, j12, zzhj.d(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 11:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.k(obj, j12, zzhj.a(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 12:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.k(obj, j12, zzhj.a(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 13:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.k(obj, j12, zzhj.a(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 14:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.l(obj, j12, zzhj.b(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 15:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.k(obj, j12, zzhj.a(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 16:
                    if (!d(i12, obj2)) {
                        break;
                    } else {
                        zzhj.l(obj, j12, zzhj.b(j12, obj2));
                        t(i12, obj);
                        break;
                    }
                case 17:
                    r(i12, obj, obj2);
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
                    this.f350131i.b(obj, j12, obj2);
                    break;
                case 50:
                    Class cls2 = zzgk.f350146a;
                    zzhj.m(obj, j12, zzfs.zza(zzhj.d(j12, obj), zzhj.d(j12, obj2)));
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
                    if (!f(i13, i12, obj2)) {
                        break;
                    } else {
                        zzhj.m(obj, j12, zzhj.d(j12, obj2));
                        zzhj.k(obj, iArr[i12 + 2] & 1048575, i13);
                        break;
                    }
                case 60:
                    s(i12, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!f(i13, i12, obj2)) {
                        break;
                    } else {
                        zzhj.m(obj, j12, zzhj.d(j12, obj2));
                        zzhj.k(obj, iArr[i12 + 2] & 1048575, i13);
                        break;
                    }
                case 68:
                    s(i12, obj, obj2);
                    break;
            }
            i12 += 3;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i12, int i13, zzdt zzdtVar) throws zzfb {
        g(obj, bArr, i12, i13, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zB2;
        int[] iArr = this.f350123a;
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iL2 = l(i12);
            long j12 = iL2 & 1048575;
            switch (k(iL2)) {
                case 0:
                    if (c(i12, obj, obj2)) {
                        zzhi zzhiVar = zzhj.f350177c;
                        if (Double.doubleToLongBits(zzhiVar.zza(obj, j12)) == Double.doubleToLongBits(zzhiVar.zza(obj2, j12))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (c(i12, obj, obj2)) {
                        zzhi zzhiVar2 = zzhj.f350177c;
                        if (Float.floatToIntBits(zzhiVar2.zzb(obj, j12)) == Float.floatToIntBits(zzhiVar2.zzb(obj2, j12))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (!c(i12, obj, obj2) || zzhj.b(j12, obj) != zzhj.b(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!c(i12, obj, obj2) || zzhj.b(j12, obj) != zzhj.b(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!c(i12, obj, obj2) || zzhj.a(j12, obj) != zzhj.a(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!c(i12, obj, obj2) || zzhj.b(j12, obj) != zzhj.b(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!c(i12, obj, obj2) || zzhj.a(j12, obj) != zzhj.a(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (c(i12, obj, obj2)) {
                        zzhi zzhiVar3 = zzhj.f350177c;
                        if (zzhiVar3.zzf(obj, j12) == zzhiVar3.zzf(obj2, j12)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (!c(i12, obj, obj2) || !zzgk.b(zzhj.d(j12, obj), zzhj.d(j12, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!c(i12, obj, obj2) || !zzgk.b(zzhj.d(j12, obj), zzhj.d(j12, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!c(i12, obj, obj2) || !zzgk.b(zzhj.d(j12, obj), zzhj.d(j12, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!c(i12, obj, obj2) || zzhj.a(j12, obj) != zzhj.a(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!c(i12, obj, obj2) || zzhj.a(j12, obj) != zzhj.a(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!c(i12, obj, obj2) || zzhj.a(j12, obj) != zzhj.a(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!c(i12, obj, obj2) || zzhj.b(j12, obj) != zzhj.b(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!c(i12, obj, obj2) || zzhj.a(j12, obj) != zzhj.a(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!c(i12, obj, obj2) || zzhj.b(j12, obj) != zzhj.b(j12, obj2)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!c(i12, obj, obj2) || !zzgk.b(zzhj.d(j12, obj), zzhj.d(j12, obj2))) {
                        return false;
                    }
                    continue;
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
                    zB2 = zzgk.b(zzhj.d(j12, obj), zzhj.d(j12, obj2));
                    break;
                case 50:
                    zB2 = zzgk.b(zzhj.d(j12, obj), zzhj.d(j12, obj2));
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
                    if (zzhj.a(j13, obj) != zzhj.a(j13, obj2) || !zzgk.b(zzhj.d(j12, obj), zzhj.d(j12, obj2))) {
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
        zzgz zzgzVar = this.f350132j;
        return zzgzVar.b(obj).equals(zzgzVar.b(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzi(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzi(java.lang.Object):boolean");
    }
}
