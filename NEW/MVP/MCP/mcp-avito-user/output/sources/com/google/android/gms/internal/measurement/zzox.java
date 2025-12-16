package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzox implements zzou {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351109a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351110b;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351109a = zzhdVarZza.zza("measurement.item_scoped_custom_parameters.client", true);
        f351110b = zzhdVarZza.zza("measurement.item_scoped_custom_parameters.service", false);
        zzhdVarZza.zza("measurement.id.item_scoped_custom_parameters.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zzb() {
        return f351109a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzou
    public final boolean zzc() {
        return f351110b.zza().booleanValue();
    }
}
