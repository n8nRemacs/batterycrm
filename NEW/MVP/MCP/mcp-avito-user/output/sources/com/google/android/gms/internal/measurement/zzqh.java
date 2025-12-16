package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzqh implements zzqe {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351162a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351163b;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351162a = zzhdVarZza.zza("measurement.tcf.client.dev", false);
        f351163b = zzhdVarZza.zza("measurement.tcf.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zzb() {
        return f351162a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zzc() {
        return f351163b.zza().booleanValue();
    }
}
