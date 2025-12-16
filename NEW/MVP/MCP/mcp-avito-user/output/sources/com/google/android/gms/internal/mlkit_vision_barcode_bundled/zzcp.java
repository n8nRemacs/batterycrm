package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzcp {
    public static int a(byte[] bArr, int i12, zzco zzcoVar) {
        int iJ2 = j(bArr, i12, zzcoVar);
        int i13 = zzcoVar.zza;
        if (i13 < 0) {
            throw zzen.b();
        }
        if (i13 > bArr.length - iJ2) {
            throw zzen.d();
        }
        if (i13 == 0) {
            zzcoVar.zzc = zzdb.zzb;
            return iJ2;
        }
        zzcoVar.zzc = zzdb.zzr(bArr, iJ2, i13);
        return iJ2 + i13;
    }

    public static int b(int i12, byte[] bArr) {
        return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
    }

    public static int c(zzgb zzgbVar, byte[] bArr, int i12, int i13, int i14, zzco zzcoVar) {
        zzfo zzfoVar = (zzfo) zzgbVar;
        Object objZze = zzfoVar.zze();
        int iP2 = zzfoVar.p(objZze, bArr, i12, i13, i14, zzcoVar);
        zzfoVar.zzf(objZze);
        zzcoVar.zzc = objZze;
        return iP2;
    }

    public static int d(zzgb zzgbVar, byte[] bArr, int i12, int i13, zzco zzcoVar) {
        int iK2 = i12 + 1;
        int i14 = bArr[i12];
        if (i14 < 0) {
            iK2 = k(i14, bArr, iK2, zzcoVar);
            i14 = zzcoVar.zza;
        }
        int i15 = iK2;
        if (i14 < 0 || i14 > i13 - i15) {
            throw zzen.d();
        }
        Object objZze = zzgbVar.zze();
        int i16 = i14 + i15;
        zzgbVar.zzh(objZze, bArr, i15, i16, zzcoVar);
        zzgbVar.zzf(objZze);
        zzcoVar.zzc = objZze;
        return i16;
    }

    public static int e(zzgb zzgbVar, int i12, byte[] bArr, int i13, int i14, zzek zzekVar, zzco zzcoVar) {
        int iD2 = d(zzgbVar, bArr, i13, i14, zzcoVar);
        zzekVar.add(zzcoVar.zzc);
        while (iD2 < i14) {
            int iJ2 = j(bArr, iD2, zzcoVar);
            if (i12 != zzcoVar.zza) {
                break;
            }
            iD2 = d(zzgbVar, bArr, iJ2, i14, zzcoVar);
            zzekVar.add(zzcoVar.zzc);
        }
        return iD2;
    }

    public static int f(byte[] bArr, int i12, zzek zzekVar, zzco zzcoVar) {
        zzed zzedVar = (zzed) zzekVar;
        int iJ2 = j(bArr, i12, zzcoVar);
        int i13 = zzcoVar.zza + iJ2;
        while (iJ2 < i13) {
            iJ2 = j(bArr, iJ2, zzcoVar);
            zzedVar.zzg(zzcoVar.zza);
        }
        if (iJ2 == i13) {
            return iJ2;
        }
        throw zzen.d();
    }

    public static int g(byte[] bArr, int i12, zzco zzcoVar) {
        int iJ2 = j(bArr, i12, zzcoVar);
        int i13 = zzcoVar.zza;
        if (i13 < 0) {
            throw zzen.b();
        }
        if (i13 == 0) {
            zzcoVar.zzc = "";
            return iJ2;
        }
        zzcoVar.zzc = new String(bArr, iJ2, i13, zzel.f352447a);
        return iJ2 + i13;
    }

    public static int h(byte[] bArr, int i12, zzco zzcoVar) throws zzen {
        int iJ2 = j(bArr, i12, zzcoVar);
        int i13 = zzcoVar.zza;
        if (i13 < 0) {
            throw zzen.b();
        }
        if (i13 == 0) {
            zzcoVar.zzc = "";
            return iJ2;
        }
        zzhc zzhcVar = zzhe.f352550a;
        int length = bArr.length;
        if ((iJ2 | i13 | ((length - iJ2) - i13)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iJ2), Integer.valueOf(i13)));
        }
        int i14 = iJ2 + i13;
        char[] cArr = new char[i13];
        int i15 = 0;
        while (iJ2 < i14) {
            byte b12 = bArr[iJ2];
            if (b12 < 0) {
                break;
            }
            iJ2++;
            cArr[i15] = (char) b12;
            i15++;
        }
        while (iJ2 < i14) {
            int i16 = iJ2 + 1;
            byte b13 = bArr[iJ2];
            if (b13 >= 0) {
                cArr[i15] = (char) b13;
                i15++;
                iJ2 = i16;
                while (iJ2 < i14) {
                    byte b14 = bArr[iJ2];
                    if (b14 >= 0) {
                        iJ2++;
                        cArr[i15] = (char) b14;
                        i15++;
                    }
                }
            } else {
                if (b13 >= -32) {
                    if (b13 < -16) {
                        if (i16 >= i14 - 1) {
                            throw zzen.a();
                        }
                        int i17 = iJ2 + 2;
                        iJ2 += 3;
                        int i18 = i15 + 1;
                        byte b15 = bArr[i16];
                        byte b16 = bArr[i17];
                        if (!zzha.a(b15)) {
                            if (b13 == -32) {
                                if (b15 >= -96) {
                                    b13 = -32;
                                }
                            }
                            if (b13 == -19) {
                                if (b15 < -96) {
                                    b13 = -19;
                                }
                            }
                            if (!zzha.a(b16)) {
                                cArr[i15] = (char) (((b15 & 63) << 6) | ((b13 & 15) << 12) | (b16 & 63));
                                i15 = i18;
                            }
                        }
                        throw zzen.a();
                    }
                    if (i16 >= i14 - 2) {
                        throw zzen.a();
                    }
                    int i19 = iJ2 + 2;
                    int i22 = iJ2 + 3;
                    iJ2 += 4;
                    byte b17 = bArr[i16];
                    byte b18 = bArr[i19];
                    byte b19 = bArr[i22];
                    if (!zzha.a(b17)) {
                        if ((((b17 + 112) + (b13 << 28)) >> 30) == 0 && !zzha.a(b18) && !zzha.a(b19)) {
                            int i23 = ((b17 & 63) << 12) | ((b13 & 7) << 18) | ((b18 & 63) << 6) | (b19 & 63);
                            cArr[i15] = (char) ((i23 >>> 10) + 55232);
                            cArr[i15 + 1] = (char) ((i23 & 1023) + 56320);
                            i15 += 2;
                        }
                    }
                    throw zzen.a();
                }
                if (i16 >= i14) {
                    throw zzen.a();
                }
                iJ2 += 2;
                int i24 = i15 + 1;
                byte b22 = bArr[i16];
                if (b13 < -62 || zzha.a(b22)) {
                    throw zzen.a();
                }
                cArr[i15] = (char) ((b22 & 63) | ((b13 & 31) << 6));
                i15 = i24;
            }
        }
        zzcoVar.zzc = new String(cArr, 0, i15);
        return i14;
    }

    public static int i(int i12, byte[] bArr, int i13, int i14, zzgq zzgqVar, zzco zzcoVar) {
        if ((i12 >>> 3) == 0) {
            throw new zzen("Protocol message contained an invalid tag (zero).");
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            int iM2 = m(bArr, i13, zzcoVar);
            zzgqVar.b(i12, Long.valueOf(zzcoVar.zzb));
            return iM2;
        }
        if (i15 == 1) {
            zzgqVar.b(i12, Long.valueOf(o(i13, bArr)));
            return i13 + 8;
        }
        if (i15 == 2) {
            int iJ2 = j(bArr, i13, zzcoVar);
            int i16 = zzcoVar.zza;
            if (i16 < 0) {
                throw zzen.b();
            }
            if (i16 > bArr.length - iJ2) {
                throw zzen.d();
            }
            if (i16 == 0) {
                zzgqVar.b(i12, zzdb.zzb);
            } else {
                zzgqVar.b(i12, zzdb.zzr(bArr, iJ2, i16));
            }
            return iJ2 + i16;
        }
        if (i15 != 3) {
            if (i15 != 5) {
                throw new zzen("Protocol message contained an invalid tag (zero).");
            }
            zzgqVar.b(i12, Integer.valueOf(b(i13, bArr)));
            return i13 + 4;
        }
        int i17 = (i12 & (-8)) | 4;
        zzgq zzgqVarA = zzgq.a();
        int i18 = 0;
        while (true) {
            if (i13 >= i14) {
                break;
            }
            int iJ3 = j(bArr, i13, zzcoVar);
            int i19 = zzcoVar.zza;
            if (i19 == i17) {
                i18 = i19;
                i13 = iJ3;
                break;
            }
            i18 = i19;
            i13 = i(i19, bArr, iJ3, i14, zzgqVarA, zzcoVar);
        }
        if (i13 > i14 || i18 != i17) {
            throw zzen.c();
        }
        zzgqVar.b(i12, zzgqVarA);
        return i13;
    }

    public static int j(byte[] bArr, int i12, zzco zzcoVar) {
        int i13 = i12 + 1;
        byte b12 = bArr[i12];
        if (b12 < 0) {
            return k(b12, bArr, i13, zzcoVar);
        }
        zzcoVar.zza = b12;
        return i13;
    }

    public static int k(int i12, byte[] bArr, int i13, zzco zzcoVar) {
        int i14 = i12 & 127;
        int i15 = i13 + 1;
        byte b12 = bArr[i13];
        if (b12 >= 0) {
            zzcoVar.zza = i14 | (b12 << 7);
            return i15;
        }
        int i16 = i14 | ((b12 & 127) << 7);
        int i17 = i13 + 2;
        byte b13 = bArr[i15];
        if (b13 >= 0) {
            zzcoVar.zza = i16 | (b13 << 14);
            return i17;
        }
        int i18 = i16 | ((b13 & 127) << 14);
        int i19 = i13 + 3;
        byte b14 = bArr[i17];
        if (b14 >= 0) {
            zzcoVar.zza = i18 | (b14 << 21);
            return i19;
        }
        int i22 = i18 | ((b14 & 127) << 21);
        int i23 = i13 + 4;
        byte b15 = bArr[i19];
        if (b15 >= 0) {
            zzcoVar.zza = i22 | (b15 << 28);
            return i23;
        }
        int i24 = i22 | ((b15 & 127) << 28);
        while (true) {
            int i25 = i23 + 1;
            if (bArr[i23] >= 0) {
                zzcoVar.zza = i24;
                return i25;
            }
            i23 = i25;
        }
    }

    public static int l(int i12, byte[] bArr, int i13, int i14, zzek zzekVar, zzco zzcoVar) {
        zzed zzedVar = (zzed) zzekVar;
        int iJ2 = j(bArr, i13, zzcoVar);
        zzedVar.zzg(zzcoVar.zza);
        while (iJ2 < i14) {
            int iJ3 = j(bArr, iJ2, zzcoVar);
            if (i12 != zzcoVar.zza) {
                break;
            }
            iJ2 = j(bArr, iJ3, zzcoVar);
            zzedVar.zzg(zzcoVar.zza);
        }
        return iJ2;
    }

    public static int m(byte[] bArr, int i12, zzco zzcoVar) {
        int i13 = i12 + 1;
        long j12 = bArr[i12];
        if (j12 >= 0) {
            zzcoVar.zzb = j12;
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
        zzcoVar.zzb = j13;
        return i14;
    }

    public static int n(int i12, byte[] bArr, int i13, int i14, zzco zzcoVar) {
        if ((i12 >>> 3) == 0) {
            throw new zzen("Protocol message contained an invalid tag (zero).");
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            return m(bArr, i13, zzcoVar);
        }
        if (i15 == 1) {
            return i13 + 8;
        }
        if (i15 == 2) {
            return j(bArr, i13, zzcoVar) + zzcoVar.zza;
        }
        if (i15 != 3) {
            if (i15 == 5) {
                return i13 + 4;
            }
            throw new zzen("Protocol message contained an invalid tag (zero).");
        }
        int i16 = (i12 & (-8)) | 4;
        int i17 = 0;
        while (i13 < i14) {
            i13 = j(bArr, i13, zzcoVar);
            i17 = zzcoVar.zza;
            if (i17 == i16) {
                break;
            }
            i13 = n(i17, bArr, i13, i14, zzcoVar);
        }
        if (i13 > i14 || i17 != i16) {
            throw zzen.c();
        }
        return i13;
    }

    public static long o(int i12, byte[] bArr) {
        return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
    }
}
