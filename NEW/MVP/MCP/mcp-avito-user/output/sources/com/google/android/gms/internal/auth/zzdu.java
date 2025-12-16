package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzdu {
    public static int a(byte[] bArr, int i12, zzdt zzdtVar) {
        int iG2 = g(bArr, i12, zzdtVar);
        int i13 = zzdtVar.zza;
        if (i13 < 0) {
            throw zzfb.b();
        }
        if (i13 > bArr.length - iG2) {
            throw zzfb.d();
        }
        if (i13 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return iG2;
        }
        zzdtVar.zzc = zzef.zzk(bArr, iG2, i13);
        return iG2 + i13;
    }

    public static int b(int i12, byte[] bArr) {
        int i13 = bArr[i12] & 255;
        int i14 = bArr[i12 + 1] & 255;
        int i15 = bArr[i12 + 2] & 255;
        return ((bArr[i12 + 3] & 255) << 24) | (i14 << 8) | i13 | (i15 << 16);
    }

    public static int c(zzgi zzgiVar, byte[] bArr, int i12, int i13, int i14, zzdt zzdtVar) {
        Object objZzd = zzgiVar.zzd();
        int iK2 = k(objZzd, zzgiVar, bArr, i12, i13, i14, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iK2;
    }

    public static int d(zzgi zzgiVar, int i12, byte[] bArr, int i13, int i14, zzez zzezVar, zzdt zzdtVar) {
        Object objZzd = zzgiVar.zzd();
        int iL2 = l(objZzd, zzgiVar, bArr, i13, i14, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        zzezVar.add(objZzd);
        while (iL2 < i14) {
            int iG2 = g(bArr, iL2, zzdtVar);
            if (i12 != zzdtVar.zza) {
                break;
            }
            Object objZzd2 = zzgiVar.zzd();
            int iL3 = l(objZzd2, zzgiVar, bArr, iG2, i14, zzdtVar);
            zzgiVar.zze(objZzd2);
            zzdtVar.zzc = objZzd2;
            zzezVar.add(objZzd2);
            iL2 = iL3;
        }
        return iL2;
    }

    public static int e(byte[] bArr, int i12, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iG2 = g(bArr, i12, zzdtVar);
        int i13 = zzdtVar.zza + iG2;
        while (iG2 < i13) {
            iG2 = g(bArr, iG2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (iG2 == i13) {
            return iG2;
        }
        throw zzfb.d();
    }

    public static int f(int i12, byte[] bArr, int i13, int i14, zzha zzhaVar, zzdt zzdtVar) {
        if ((i12 >>> 3) == 0) {
            throw new zzfb("Protocol message contained an invalid tag (zero).");
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            int iJ2 = j(bArr, i13, zzdtVar);
            zzhaVar.b(i12, Long.valueOf(zzdtVar.zzb));
            return iJ2;
        }
        if (i15 == 1) {
            zzhaVar.b(i12, Long.valueOf(m(i13, bArr)));
            return i13 + 8;
        }
        if (i15 == 2) {
            int iG2 = g(bArr, i13, zzdtVar);
            int i16 = zzdtVar.zza;
            if (i16 < 0) {
                throw zzfb.b();
            }
            if (i16 > bArr.length - iG2) {
                throw zzfb.d();
            }
            if (i16 == 0) {
                zzhaVar.b(i12, zzef.zzb);
            } else {
                zzhaVar.b(i12, zzef.zzk(bArr, iG2, i16));
            }
            return iG2 + i16;
        }
        if (i15 != 3) {
            if (i15 != 5) {
                throw new zzfb("Protocol message contained an invalid tag (zero).");
            }
            zzhaVar.b(i12, Integer.valueOf(b(i13, bArr)));
            return i13 + 4;
        }
        int i17 = (i12 & (-8)) | 4;
        zzha zzhaVarA = zzha.a();
        int i18 = 0;
        while (true) {
            if (i13 >= i14) {
                break;
            }
            int iG3 = g(bArr, i13, zzdtVar);
            int i19 = zzdtVar.zza;
            i18 = i19;
            if (i19 == i17) {
                i13 = iG3;
                break;
            }
            int iF2 = f(i18, bArr, iG3, i14, zzhaVarA, zzdtVar);
            i18 = i19;
            i13 = iF2;
        }
        if (i13 > i14 || i18 != i17) {
            throw zzfb.c();
        }
        zzhaVar.b(i12, zzhaVarA);
        return i13;
    }

    public static int g(byte[] bArr, int i12, zzdt zzdtVar) {
        int i13 = i12 + 1;
        byte b12 = bArr[i12];
        if (b12 < 0) {
            return h(b12, bArr, i13, zzdtVar);
        }
        zzdtVar.zza = b12;
        return i13;
    }

    public static int h(int i12, byte[] bArr, int i13, zzdt zzdtVar) {
        byte b12 = bArr[i13];
        int i14 = i13 + 1;
        int i15 = i12 & 127;
        if (b12 >= 0) {
            zzdtVar.zza = i15 | (b12 << 7);
            return i14;
        }
        int i16 = i15 | ((b12 & 127) << 7);
        int i17 = i13 + 2;
        byte b13 = bArr[i14];
        if (b13 >= 0) {
            zzdtVar.zza = i16 | (b13 << 14);
            return i17;
        }
        int i18 = i16 | ((b13 & 127) << 14);
        int i19 = i13 + 3;
        byte b14 = bArr[i17];
        if (b14 >= 0) {
            zzdtVar.zza = i18 | (b14 << 21);
            return i19;
        }
        int i22 = i18 | ((b14 & 127) << 21);
        int i23 = i13 + 4;
        byte b15 = bArr[i19];
        if (b15 >= 0) {
            zzdtVar.zza = i22 | (b15 << 28);
            return i23;
        }
        int i24 = i22 | ((b15 & 127) << 28);
        while (true) {
            int i25 = i23 + 1;
            if (bArr[i23] >= 0) {
                zzdtVar.zza = i24;
                return i25;
            }
            i23 = i25;
        }
    }

    public static int i(int i12, byte[] bArr, int i13, int i14, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iG2 = g(bArr, i13, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (iG2 < i14) {
            int iG3 = g(bArr, iG2, zzdtVar);
            if (i12 != zzdtVar.zza) {
                break;
            }
            iG2 = g(bArr, iG3, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return iG2;
    }

    public static int j(byte[] bArr, int i12, zzdt zzdtVar) {
        long j12 = bArr[i12];
        int i13 = i12 + 1;
        if (j12 >= 0) {
            zzdtVar.zzb = j12;
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
        zzdtVar.zzb = j13;
        return i14;
    }

    public static int k(Object obj, zzgi zzgiVar, byte[] bArr, int i12, int i13, int i14, zzdt zzdtVar) {
        int iG2 = ((zzga) zzgiVar).g(obj, bArr, i12, i13, i14, zzdtVar);
        zzdtVar.zzc = obj;
        return iG2;
    }

    public static int l(Object obj, zzgi zzgiVar, byte[] bArr, int i12, int i13, zzdt zzdtVar) {
        int iH2 = i12 + 1;
        int i14 = bArr[i12];
        if (i14 < 0) {
            iH2 = h(i14, bArr, iH2, zzdtVar);
            i14 = zzdtVar.zza;
        }
        int i15 = iH2;
        if (i14 < 0 || i14 > i13 - i15) {
            throw zzfb.d();
        }
        int i16 = i14 + i15;
        zzgiVar.zzg(obj, bArr, i15, i16, zzdtVar);
        zzdtVar.zzc = obj;
        return i16;
    }

    public static long m(int i12, byte[] bArr) {
        return (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48) | ((bArr[i12 + 7] & 255) << 56);
    }
}
