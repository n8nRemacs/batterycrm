package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzhq {
    public static double a(int i12, byte[] bArr) {
        return Double.longBitsToDouble(q(i12, bArr));
    }

    public static int b(int i12, byte[] bArr, int i13, int i14, zzht zzhtVar) {
        if ((i12 >>> 3) == 0) {
            throw new zzjq("Protocol message contained an invalid tag (zero).");
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            return p(bArr, i13, zzhtVar);
        }
        if (i15 == 1) {
            return i13 + 8;
        }
        if (i15 == 2) {
            return o(bArr, i13, zzhtVar) + zzhtVar.zza;
        }
        if (i15 != 3) {
            if (i15 == 5) {
                return i13 + 4;
            }
            throw new zzjq("Protocol message contained an invalid tag (zero).");
        }
        int i16 = (i12 & (-8)) | 4;
        int i17 = 0;
        while (i13 < i14) {
            i13 = o(bArr, i13, zzhtVar);
            i17 = zzhtVar.zza;
            if (i17 == i16) {
                break;
            }
            i13 = b(i17, bArr, i13, i14, zzhtVar);
        }
        if (i13 > i14 || i17 != i16) {
            throw zzjq.d();
        }
        return i13;
    }

    public static int c(int i12, byte[] bArr, int i13, int i14, zzjn<?> zzjnVar, zzht zzhtVar) {
        zzji zzjiVar = (zzji) zzjnVar;
        int iO2 = o(bArr, i13, zzhtVar);
        zzjiVar.zzd(zzhtVar.zza);
        while (iO2 < i14) {
            int iO3 = o(bArr, iO2, zzhtVar);
            if (i12 != zzhtVar.zza) {
                break;
            }
            iO2 = o(bArr, iO3, zzhtVar);
            zzjiVar.zzd(zzhtVar.zza);
        }
        return iO2;
    }

    public static int d(int i12, byte[] bArr, int i13, int i14, zzmh zzmhVar, zzht zzhtVar) {
        if ((i12 >>> 3) == 0) {
            throw new zzjq("Protocol message contained an invalid tag (zero).");
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            int iP2 = p(bArr, i13, zzhtVar);
            zzmhVar.b(i12, Long.valueOf(zzhtVar.zzb));
            return iP2;
        }
        if (i15 == 1) {
            zzmhVar.b(i12, Long.valueOf(q(i13, bArr)));
            return i13 + 8;
        }
        if (i15 == 2) {
            int iO2 = o(bArr, i13, zzhtVar);
            int i16 = zzhtVar.zza;
            if (i16 < 0) {
                throw zzjq.c();
            }
            if (i16 > bArr.length - iO2) {
                throw zzjq.e();
            }
            if (i16 == 0) {
                zzmhVar.b(i12, zzhu.zza);
            } else {
                zzmhVar.b(i12, zzhu.zza(bArr, iO2, i16));
            }
            return iO2 + i16;
        }
        if (i15 != 3) {
            if (i15 != 5) {
                throw new zzjq("Protocol message contained an invalid tag (zero).");
            }
            zzmhVar.b(i12, Integer.valueOf(n(i13, bArr)));
            return i13 + 4;
        }
        zzmh zzmhVar2 = new zzmh();
        int i17 = (i12 & (-8)) | 4;
        int i18 = 0;
        while (true) {
            if (i13 >= i14) {
                break;
            }
            int iO3 = o(bArr, i13, zzhtVar);
            int i19 = zzhtVar.zza;
            i18 = i19;
            if (i19 == i17) {
                i13 = iO3;
                break;
            }
            int iD2 = d(i18, bArr, iO3, i14, zzmhVar2, zzhtVar);
            i18 = i19;
            i13 = iD2;
        }
        if (i13 > i14 || i18 != i17) {
            throw zzjq.d();
        }
        zzmhVar.b(i12, zzmhVar2);
        return i13;
    }

    public static int e(int i12, byte[] bArr, int i13, zzht zzhtVar) {
        int i14 = i12 & 127;
        int i15 = i13 + 1;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            zzhtVar.zza = i14 | (b12 << 7);
            return i15;
        }
        int i16 = i14 | ((b12 & 127) << 7);
        int i17 = i13 + 2;
        byte b13 = bArr[i15];
        if (b13 >= 0) {
            zzhtVar.zza = i16 | (b13 << 14);
            return i17;
        }
        int i18 = i16 | ((b13 & 127) << 14);
        int i19 = i13 + 3;
        byte b14 = bArr[i17];
        if (b14 >= 0) {
            zzhtVar.zza = i18 | (b14 << 21);
            return i19;
        }
        int i22 = i18 | ((b14 & 127) << 21);
        int i23 = i13 + 4;
        byte b15 = bArr[i19];
        if (b15 >= 0) {
            zzhtVar.zza = i22 | (b15 << 28);
            return i23;
        }
        int i24 = i22 | ((b15 & 127) << 28);
        while (true) {
            int i25 = i23 + 1;
            if (bArr[i23] >= 0) {
                zzhtVar.zza = i24;
                return i25;
            }
            i23 = i25;
        }
    }

    public static int f(zzlj<?> zzljVar, int i12, byte[] bArr, int i13, int i14, zzjn<?> zzjnVar, zzht zzhtVar) {
        Object objZza = zzljVar.zza();
        int i15 = i(objZza, zzljVar, bArr, i13, i14, zzhtVar);
        zzljVar.zzc(objZza);
        zzhtVar.zzc = objZza;
        zzjnVar.add(objZza);
        while (i15 < i14) {
            int iO2 = o(bArr, i15, zzhtVar);
            if (i12 != zzhtVar.zza) {
                break;
            }
            Object objZza2 = zzljVar.zza();
            int i16 = i(objZza2, zzljVar, bArr, iO2, i14, zzhtVar);
            zzljVar.zzc(objZza2);
            zzhtVar.zzc = objZza2;
            zzjnVar.add(objZza2);
            i15 = i16;
        }
        return i15;
    }

    public static int g(zzlj zzljVar, byte[] bArr, int i12, int i13, int i14, zzht zzhtVar) {
        Object objZza = zzljVar.zza();
        int iH2 = h(objZza, zzljVar, bArr, i12, i13, i14, zzhtVar);
        zzljVar.zzc(objZza);
        zzhtVar.zzc = objZza;
        return iH2;
    }

    public static int h(Object obj, zzlj zzljVar, byte[] bArr, int i12, int i13, int i14, zzht zzhtVar) {
        int iB2 = ((zzkv) zzljVar).b(obj, bArr, i12, i13, i14, zzhtVar);
        zzhtVar.zzc = obj;
        return iB2;
    }

    public static int i(Object obj, zzlj zzljVar, byte[] bArr, int i12, int i13, zzht zzhtVar) {
        int iE2 = i12 + 1;
        int i14 = bArr[i12];
        if (i14 < 0) {
            iE2 = e(i14, bArr, iE2, zzhtVar);
            i14 = zzhtVar.zza;
        }
        int i15 = iE2;
        if (i14 < 0 || i14 > i13 - i15) {
            throw zzjq.e();
        }
        int i16 = i14 + i15;
        zzljVar.zza(obj, bArr, i15, i16, zzhtVar);
        zzhtVar.zzc = obj;
        return i16;
    }

    public static int j(byte[] bArr, int i12, zzht zzhtVar) {
        int iO2 = o(bArr, i12, zzhtVar);
        int i13 = zzhtVar.zza;
        if (i13 < 0) {
            throw zzjq.c();
        }
        if (i13 > bArr.length - iO2) {
            throw zzjq.e();
        }
        if (i13 == 0) {
            zzhtVar.zzc = zzhu.zza;
            return iO2;
        }
        zzhtVar.zzc = zzhu.zza(bArr, iO2, i13);
        return iO2 + i13;
    }

    public static int k(byte[] bArr, int i12, zzjn<?> zzjnVar, zzht zzhtVar) {
        zzji zzjiVar = (zzji) zzjnVar;
        int iO2 = o(bArr, i12, zzhtVar);
        int i13 = zzhtVar.zza + iO2;
        while (iO2 < i13) {
            iO2 = o(bArr, iO2, zzhtVar);
            zzjiVar.zzd(zzhtVar.zza);
        }
        if (iO2 == i13) {
            return iO2;
        }
        throw zzjq.e();
    }

    public static float l(int i12, byte[] bArr) {
        return Float.intBitsToFloat(n(i12, bArr));
    }

    public static int m(byte[] bArr, int i12, zzht zzhtVar) {
        int iO2 = o(bArr, i12, zzhtVar);
        int i13 = zzhtVar.zza;
        if (i13 < 0) {
            throw zzjq.c();
        }
        if (i13 == 0) {
            zzhtVar.zzc = "";
            return iO2;
        }
        zzhtVar.zzc = zzmp.d(iO2, i13, bArr);
        return iO2 + i13;
    }

    public static int n(int i12, byte[] bArr) {
        return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
    }

    public static int o(byte[] bArr, int i12, zzht zzhtVar) {
        int i13 = i12 + 1;
        byte b12 = bArr[i12];
        if (b12 < 0) {
            return e(b12, bArr, i13, zzhtVar);
        }
        zzhtVar.zza = b12;
        return i13;
    }

    public static int p(byte[] bArr, int i12, zzht zzhtVar) {
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        if (j12 >= 0) {
            zzhtVar.zzb = j12;
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
        zzhtVar.zzb = j13;
        return i14;
    }

    public static long q(int i12, byte[] bArr) {
        return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
    }
}
