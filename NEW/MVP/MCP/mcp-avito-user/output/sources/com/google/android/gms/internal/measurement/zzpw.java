package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzpw implements zzpx {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351148a;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhdVarZza.zza("measurement.client.sessions.background_sessions_enabled", true);
        f351148a = zzhdVarZza.zza("measurement.client.sessions.enable_fix_background_engagement", false);
        zzhdVarZza.zza("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzhdVarZza.zza("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        zzhdVarZza.zza("measurement.client.sessions.session_id_enabled", true);
        zzhdVarZza.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zza() {
        return f351148a.zza().booleanValue();
    }
}
