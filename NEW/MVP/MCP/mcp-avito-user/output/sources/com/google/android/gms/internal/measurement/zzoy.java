package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzoy implements zzoz {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351111a;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhdVarZza.zza("measurement.sdk.collection.enable_extend_user_property_size", true);
        zzhdVarZza.zza("measurement.sdk.collection.last_deep_link_referrer2", true);
        f351111a = zzhdVarZza.zza("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        zzhdVarZza.zza("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zza() {
        return f351111a.zza().booleanValue();
    }
}
