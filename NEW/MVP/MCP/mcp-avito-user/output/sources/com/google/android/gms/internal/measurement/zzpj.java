package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzpj implements zzpg {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351127a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351128b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgv<Boolean> f351129c;

    /* renamed from: d, reason: collision with root package name */
    public static final zzgv<Boolean> f351130d;

    /* renamed from: e, reason: collision with root package name */
    public static final zzgv<Boolean> f351131e;

    /* renamed from: f, reason: collision with root package name */
    public static final zzgv<Boolean> f351132f;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351127a = zzhdVarZza.zza("measurement.rb.attribution.client2", true);
        f351128b = zzhdVarZza.zza("measurement.rb.attribution.dma_fix", false);
        f351129c = zzhdVarZza.zza("measurement.rb.attribution.followup1.service", false);
        f351130d = zzhdVarZza.zza("measurement.rb.attribution.service", true);
        f351131e = zzhdVarZza.zza("measurement.rb.attribution.enable_trigger_redaction", true);
        f351132f = zzhdVarZza.zza("measurement.rb.attribution.uuid_generation", true);
        zzhdVarZza.zza("measurement.id.rb.attribution.dma_fix", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzb() {
        return f351127a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzc() {
        return f351128b.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzd() {
        return f351129c.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zze() {
        return f351130d.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzf() {
        return f351131e.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzg() {
        return f351132f.zza().booleanValue();
    }
}
