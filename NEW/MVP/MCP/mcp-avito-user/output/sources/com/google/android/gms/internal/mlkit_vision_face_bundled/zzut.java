package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.logging.Logger;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public abstract class zzut extends zzub {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f354036b = Logger.getLogger(zzut.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f354037c = zzyg.f354151e;

    /* renamed from: a, reason: collision with root package name */
    public zzuu f354038a;

    public zzut() {
    }

    @Deprecated
    public static int a(int i12, zzws zzwsVar, zzxf zzxfVar) {
        int iZzw = zzw(i12 << 3);
        return ((zztu) zzwsVar).a(zzxfVar) + iZzw + iZzw;
    }

    public static int b(zzws zzwsVar, zzxf zzxfVar) {
        int iA2 = ((zztu) zzwsVar).a(zzxfVar);
        return zzw(iA2) + iA2;
    }

    public static int zzv(String str) {
        int length;
        try {
            length = zzyl.c(str);
        } catch (zzyk unused) {
            length = str.getBytes(zzvt.f354067a).length;
        }
        return zzw(length) + length;
    }

    public static int zzw(int i12) {
        return (352 - (Integer.numberOfLeadingZeros(i12) * 9)) >>> 6;
    }

    public static int zzx(long j12) {
        return (640 - (Long.numberOfLeadingZeros(j12) * 9)) >>> 6;
    }

    public static zzut zzy(byte[] bArr, int i12, int i13) {
        return new zzuq(bArr, i13);
    }

    public abstract int zza();

    public abstract void zzb(byte b12);

    public abstract void zzd(int i12, boolean z12);

    public abstract void zze(int i12, zzul zzulVar);

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

    public final void zzz() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public /* synthetic */ zzut(zzus zzusVar) {
    }
}
