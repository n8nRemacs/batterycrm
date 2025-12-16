package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Logger;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public abstract class zzdi extends zzcr {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f352411b = Logger.getLogger(zzdi.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f352412c = zzgz.f352547e;

    /* renamed from: a, reason: collision with root package name */
    public zzdj f352413a;

    public zzdi() {
    }

    @Deprecated
    public static int a(int i12, zzfl zzflVar, zzgb zzgbVar) {
        int iZzD = zzD(i12 << 3);
        int i13 = iZzD + iZzD;
        zzck zzckVar = (zzck) zzflVar;
        int iA2 = zzckVar.a();
        if (iA2 == -1) {
            iA2 = zzgbVar.zza(zzckVar);
            zzckVar.b(iA2);
        }
        return i13 + iA2;
    }

    public static int zzB(String str) {
        int length;
        try {
            length = zzhe.c(str);
        } catch (zzhd unused) {
            length = str.getBytes(zzel.f352447a).length;
        }
        return zzD(length) + length;
    }

    public static int zzC(int i12) {
        return zzD(i12 << 3);
    }

    public static int zzD(int i12) {
        if ((i12 & (-128)) == 0) {
            return 1;
        }
        if ((i12 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i12) == 0) {
            return 3;
        }
        return (i12 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzE(long j12) {
        int i12;
        if (((-128) & j12) == 0) {
            return 1;
        }
        if (j12 < 0) {
            return 10;
        }
        if (((-34359738368L) & j12) != 0) {
            j12 >>>= 28;
            i12 = 6;
        } else {
            i12 = 2;
        }
        if (((-2097152) & j12) != 0) {
            i12 += 2;
            j12 >>>= 14;
        }
        return (j12 & (-16384)) != 0 ? i12 + 1 : i12;
    }

    public static zzdi zzF(byte[] bArr) {
        return new zzdg(bArr, bArr.length);
    }

    public static int zzt(byte[] bArr) {
        int length = bArr.length;
        return zzD(length) + length;
    }

    public static int zzu(zzdb zzdbVar) {
        int iZzd = zzdbVar.zzd();
        return zzD(iZzd) + iZzd;
    }

    @Deprecated
    public static int zzw(zzfl zzflVar) {
        return zzflVar.zzE();
    }

    public static int zzx(int i12) {
        if (i12 >= 0) {
            return zzD(i12);
        }
        return 10;
    }

    public static int zzy(zzet zzetVar) {
        int iZza = zzetVar.zza();
        return zzD(iZza) + iZza;
    }

    public static int zzz(zzfl zzflVar) {
        int iZzE = zzflVar.zzE();
        return zzD(iZzE) + iZzE;
    }

    public final void zzG() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b12);

    public abstract void zzd(int i12, boolean z12);

    public abstract void zze(int i12, zzdb zzdbVar);

    public abstract void zzf(int i12, int i13);

    public abstract void zzg(int i12);

    public abstract void zzh(int i12, long j12);

    public abstract void zzi(long j12);

    public abstract void zzj(int i12, int i13);

    public abstract void zzk(int i12);

    public abstract void zzl(byte[] bArr, int i12, int i13);

    public abstract void zzm(int i12, String str);

    public abstract void zzo(int i12, int i13);

    public abstract void zzp(int i12, int i13);

    public abstract void zzq(int i12);

    public abstract void zzr(int i12, long j12);

    public abstract void zzs(long j12);

    public /* synthetic */ zzdi(zzdf zzdfVar) {
    }
}
