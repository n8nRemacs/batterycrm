package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzpk implements zzpl {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351133a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351134b;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhdVarZza.zza("measurement.redaction.app_instance_id", true);
        zzhdVarZza.zza("measurement.redaction.client_ephemeral_aiid_generation", true);
        zzhdVarZza.zza("measurement.redaction.config_redacted_fields", true);
        zzhdVarZza.zza("measurement.redaction.device_info", true);
        zzhdVarZza.zza("measurement.redaction.e_tag", true);
        zzhdVarZza.zza("measurement.redaction.enhanced_uid", true);
        zzhdVarZza.zza("measurement.redaction.populate_ephemeral_app_instance_id", true);
        zzhdVarZza.zza("measurement.redaction.google_signals", true);
        zzhdVarZza.zza("measurement.redaction.no_aiid_in_config_request", true);
        f351133a = zzhdVarZza.zza("measurement.redaction.retain_major_os_version", true);
        f351134b = zzhdVarZza.zza("measurement.redaction.scion_payload_generator", true);
        zzhdVarZza.zza("measurement.redaction.upload_redacted_fields", true);
        zzhdVarZza.zza("measurement.redaction.upload_subdomain_override", true);
        zzhdVarZza.zza("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zza() {
        return f351133a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zzb() {
        return f351134b.zza().booleanValue();
    }
}
