package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzqb implements zzpy {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351153a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351154b;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351153a = zzhdVarZza.zza("measurement.sfmc.client", true);
        f351154b = zzhdVarZza.zza("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzb() {
        return f351153a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpy
    public final boolean zzc() {
        return f351154b.zza().booleanValue();
    }
}
