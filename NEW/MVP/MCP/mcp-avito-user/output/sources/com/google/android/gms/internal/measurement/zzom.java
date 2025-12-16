package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzom implements zzon {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351097a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351098b;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351097a = zzhdVarZza.zza("measurement.gbraid_campaign.gbraid.client.dev", false);
        f351098b = zzhdVarZza.zza("measurement.gbraid_campaign.gbraid.service", false);
        zzhdVarZza.zza("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zzb() {
        return f351097a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzon
    public final boolean zzc() {
        return f351098b.zza().booleanValue();
    }
}
