package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzof implements zzoc {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351088a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351089b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgv<Boolean> f351090c;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhdVarZza.zza("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f351088a = zzhdVarZza.zza("measurement.audience.refresh_event_count_filters_timestamp", false);
        f351089b = zzhdVarZza.zza("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f351090c = zzhdVarZza.zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final boolean zzb() {
        return f351088a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final boolean zzc() {
        return f351089b.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final boolean zzd() {
        return f351090c.zza().booleanValue();
    }
}
