package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zznz implements zznw {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351081a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351082b;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        zzhdVarZza.zza("measurement.collection.event_safelist", true);
        f351081a = zzhdVarZza.zza("measurement.service.store_null_safelist", true);
        f351082b = zzhdVarZza.zza("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final boolean zzb() {
        return f351081a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final boolean zzc() {
        return f351082b.zza().booleanValue();
    }
}
