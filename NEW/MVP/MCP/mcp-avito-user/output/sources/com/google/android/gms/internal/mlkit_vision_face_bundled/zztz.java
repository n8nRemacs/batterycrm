package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zztz {
    public static int a(byte[] bArr, int i12, zzty zztyVar) {
        int i13 = i(bArr, i12, zztyVar);
        int i14 = zztyVar.zza;
        if (i14 < 0) {
            throw zzvv.b();
        }
        if (i14 > bArr.length - i13) {
            throw zzvv.d();
        }
        if (i14 == 0) {
            zztyVar.zzc = zzul.zzb;
            return i13;
        }
        zztyVar.zzc = zzul.zzl(bArr, i13, i14);
        return i13 + i14;
    }

    public static int b(int i12, byte[] bArr) {
        int i13 = bArr[i12] & 255;
        int i14 = bArr[i12 + 1] & 255;
        int i15 = bArr[i12 + 2] & 255;
        return ((bArr[i12 + 3] & 255) << 24) | (i14 << 8) | i13 | (i15 << 16);
    }

    public static int c(zzxf zzxfVar, byte[] bArr, int i12, int i13, int i14, zzty zztyVar) {
        Object objZze = zzxfVar.zze();
        int iM2 = m(objZze, zzxfVar, bArr, i12, i13, i14, zztyVar);
        zzxfVar.zzf(objZze);
        zztyVar.zzc = objZze;
        return iM2;
    }

    public static int d(zzxf zzxfVar, byte[] bArr, int i12, int i13, zzty zztyVar) {
        Object objZze = zzxfVar.zze();
        int iN2 = n(objZze, zzxfVar, bArr, i12, i13, zztyVar);
        zzxfVar.zzf(objZze);
        zztyVar.zzc = objZze;
        return iN2;
    }

    public static int e(zzxf zzxfVar, int i12, byte[] bArr, int i13, int i14, zzvs zzvsVar, zzty zztyVar) {
        int iD2 = d(zzxfVar, bArr, i13, i14, zztyVar);
        zzvsVar.add(zztyVar.zzc);
        while (iD2 < i14) {
            int i15 = i(bArr, iD2, zztyVar);
            if (i12 != zztyVar.zza) {
                break;
            }
            iD2 = d(zzxfVar, bArr, i15, i14, zztyVar);
            zzvsVar.add(zztyVar.zzc);
        }
        return iD2;
    }

    public static int f(byte[] bArr, int i12, zzvs zzvsVar, zzty zztyVar) {
        zzvo zzvoVar = (zzvo) zzvsVar;
        int i13 = i(bArr, i12, zztyVar);
        int i14 = zztyVar.zza + i13;
        while (i13 < i14) {
            i13 = i(bArr, i13, zztyVar);
            zzvoVar.zzf(zztyVar.zza);
        }
        if (i13 == i14) {
            return i13;
        }
        throw zzvv.d();
    }

    public static int g(byte[] bArr, int i12, zzty zztyVar) {
        int i13 = i(bArr, i12, zztyVar);
        int i14 = zztyVar.zza;
        if (i14 < 0) {
            throw zzvv.b();
        }
        if (i14 == 0) {
            zztyVar.zzc = "";
            return i13;
        }
        zztyVar.zzc = new String(bArr, i13, i14, zzvt.f354067a);
        return i13 + i14;
    }

    public static int h(int i12, byte[] bArr, int i13, int i14, zzxx zzxxVar, zzty zztyVar) {
        if ((i12 >>> 3) == 0) {
            throw new zzvv("Protocol message contained an invalid tag (zero).");
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            int iL2 = l(bArr, i13, zztyVar);
            zzxxVar.b(i12, Long.valueOf(zztyVar.zzb));
            return iL2;
        }
        if (i15 == 1) {
            zzxxVar.b(i12, Long.valueOf(p(i13, bArr)));
            return i13 + 8;
        }
        if (i15 == 2) {
            int i16 = i(bArr, i13, zztyVar);
            int i17 = zztyVar.zza;
            if (i17 < 0) {
                throw zzvv.b();
            }
            if (i17 > bArr.length - i16) {
                throw zzvv.d();
            }
            if (i17 == 0) {
                zzxxVar.b(i12, zzul.zzb);
            } else {
                zzxxVar.b(i12, zzul.zzl(bArr, i16, i17));
            }
            return i16 + i17;
        }
        if (i15 != 3) {
            if (i15 != 5) {
                throw new zzvv("Protocol message contained an invalid tag (zero).");
            }
            zzxxVar.b(i12, Integer.valueOf(b(i13, bArr)));
            return i13 + 4;
        }
        int i18 = (i12 & (-8)) | 4;
        zzxx zzxxVarA = zzxx.a();
        int i19 = 0;
        while (true) {
            if (i13 >= i14) {
                break;
            }
            int i22 = i(bArr, i13, zztyVar);
            int i23 = zztyVar.zza;
            i19 = i23;
            if (i23 == i18) {
                i13 = i22;
                break;
            }
            int iH2 = h(i19, bArr, i22, i14, zzxxVarA, zztyVar);
            i19 = i23;
            i13 = iH2;
        }
        if (i13 > i14 || i19 != i18) {
            throw zzvv.c();
        }
        zzxxVar.b(i12, zzxxVarA);
        return i13;
    }

    public static int i(byte[] bArr, int i12, zzty zztyVar) {
        int i13 = i12 + 1;
        byte b12 = bArr[i12];
        if (b12 < 0) {
            return j(b12, bArr, i13, zztyVar);
        }
        zztyVar.zza = b12;
        return i13;
    }

    public static int j(int i12, byte[] bArr, int i13, zzty zztyVar) {
        byte b12 = bArr[i13];
        int i14 = i13 + 1;
        int i15 = i12 & 127;
        if (b12 >= 0) {
            zztyVar.zza = i15 | (b12 << 7);
            return i14;
        }
        int i16 = i15 | ((b12 & 127) << 7);
        int i17 = i13 + 2;
        byte b13 = bArr[i14];
        if (b13 >= 0) {
            zztyVar.zza = i16 | (b13 << 14);
            return i17;
        }
        int i18 = i16 | ((b13 & 127) << 14);
        int i19 = i13 + 3;
        byte b14 = bArr[i17];
        if (b14 >= 0) {
            zztyVar.zza = i18 | (b14 << 21);
            return i19;
        }
        int i22 = i18 | ((b14 & 127) << 21);
        int i23 = i13 + 4;
        byte b15 = bArr[i19];
        if (b15 >= 0) {
            zztyVar.zza = i22 | (b15 << 28);
            return i23;
        }
        int i24 = i22 | ((b15 & 127) << 28);
        while (true) {
            int i25 = i23 + 1;
            if (bArr[i23] >= 0) {
                zztyVar.zza = i24;
                return i25;
            }
            i23 = i25;
        }
    }

    public static int k(int i12, byte[] bArr, int i13, int i14, zzvs zzvsVar, zzty zztyVar) {
        zzvo zzvoVar = (zzvo) zzvsVar;
        int i15 = i(bArr, i13, zztyVar);
        zzvoVar.zzf(zztyVar.zza);
        while (i15 < i14) {
            int i16 = i(bArr, i15, zztyVar);
            if (i12 != zztyVar.zza) {
                break;
            }
            i15 = i(bArr, i16, zztyVar);
            zzvoVar.zzf(zztyVar.zza);
        }
        return i15;
    }

    public static int l(byte[] bArr, int i12, zzty zztyVar) {
        long j12 = bArr[i12];
        int i13 = i12 + 1;
        if (j12 >= 0) {
            zztyVar.zzb = j12;
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
        zztyVar.zzb = j13;
        return i14;
    }

    public static int m(Object obj, zzxf zzxfVar, byte[] bArr, int i12, int i13, int i14, zzty zztyVar) {
        int iK2 = ((zzwv) zzxfVar).k(obj, bArr, i12, i13, i14, zztyVar);
        zztyVar.zzc = obj;
        return iK2;
    }

    public static int n(Object obj, zzxf zzxfVar, byte[] bArr, int i12, int i13, zzty zztyVar) {
        int iJ2 = i12 + 1;
        int i14 = bArr[i12];
        if (i14 < 0) {
            iJ2 = j(i14, bArr, iJ2, zztyVar);
            i14 = zztyVar.zza;
        }
        int i15 = iJ2;
        if (i14 < 0 || i14 > i13 - i15) {
            throw zzvv.d();
        }
        int i16 = i14 + i15;
        zzxfVar.zzh(obj, bArr, i15, i16, zztyVar);
        zztyVar.zzc = obj;
        return i16;
    }

    public static int o(int i12, byte[] bArr, int i13, int i14, zzty zztyVar) {
        if ((i12 >>> 3) == 0) {
            throw new zzvv("Protocol message contained an invalid tag (zero).");
        }
        int i15 = i12 & 7;
        if (i15 == 0) {
            return l(bArr, i13, zztyVar);
        }
        if (i15 == 1) {
            return i13 + 8;
        }
        if (i15 == 2) {
            return i(bArr, i13, zztyVar) + zztyVar.zza;
        }
        if (i15 != 3) {
            if (i15 == 5) {
                return i13 + 4;
            }
            throw new zzvv("Protocol message contained an invalid tag (zero).");
        }
        int i16 = (i12 & (-8)) | 4;
        int i17 = 0;
        while (i13 < i14) {
            i13 = i(bArr, i13, zztyVar);
            i17 = zztyVar.zza;
            if (i17 == i16) {
                break;
            }
            i13 = o(i17, bArr, i13, i14, zztyVar);
        }
        if (i13 > i14 || i17 != i16) {
            throw zzvv.c();
        }
        return i13;
    }

    public static long p(int i12, byte[] bArr) {
        return (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48) | ((bArr[i12 + 7] & 255) << 56);
    }
}
