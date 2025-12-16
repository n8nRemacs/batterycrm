package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzqc implements zzqd {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351155a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351156b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgv<Boolean> f351157c;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351155a = zzhdVarZza.zza("measurement.sgtm.client.dev", false);
        f351156b = zzhdVarZza.zza("measurement.sgtm.preview_mode_enabled.dev", false);
        f351157c = zzhdVarZza.zza("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqd
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqd
    public final boolean zzb() {
        return f351155a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqd
    public final boolean zzc() {
        return f351156b.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqd
    public final boolean zzd() {
        return f351157c.zza().booleanValue();
    }
}
