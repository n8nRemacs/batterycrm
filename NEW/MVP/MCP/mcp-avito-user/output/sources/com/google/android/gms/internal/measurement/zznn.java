package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zznn implements zznk {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Long> f351064a;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhdVarZza.zza("measurement.client.consent_state_v1", true);
        zzhdVarZza.zza("measurement.client.3p_consent_state_v1", true);
        zzhdVarZza.zza("measurement.service.consent_state_v1_W36", true);
        f351064a = zzhdVarZza.zza("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final long zza() {
        return f351064a.zza().longValue();
    }
}
