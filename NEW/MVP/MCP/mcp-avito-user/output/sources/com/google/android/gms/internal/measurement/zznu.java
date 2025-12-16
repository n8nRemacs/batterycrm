package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zznu implements zznv {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351071a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351072b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgv<Boolean> f351073c;

    /* renamed from: d, reason: collision with root package name */
    public static final zzgv<Boolean> f351074d;

    /* renamed from: e, reason: collision with root package name */
    public static final zzgv<Boolean> f351075e;

    /* renamed from: f, reason: collision with root package name */
    public static final zzgv<Boolean> f351076f;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351071a = zzhdVarZza.zza("measurement.dma_consent.client", true);
        f351072b = zzhdVarZza.zza("measurement.dma_consent.client_bow_check2", false);
        f351073c = zzhdVarZza.zza("measurement.dma_consent.service", true);
        f351074d = zzhdVarZza.zza("measurement.dma_consent.service_gcs_v2", false);
        f351075e = zzhdVarZza.zza("measurement.dma_consent.service_npa_remote_default", false);
        f351076f = zzhdVarZza.zza("measurement.dma_consent.service_split_batch_on_consent", true);
        zzhdVarZza.zza("measurement.id.dma_consent.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzb() {
        return f351071a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzc() {
        return f351072b.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzd() {
        return f351073c.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zze() {
        return f351074d.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzf() {
        return f351075e.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzg() {
        return f351076f.zza().booleanValue();
    }
}
