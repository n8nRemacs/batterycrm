package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzos implements zzot {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351104a;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351104a = zzhdVarZza.zza("measurement.increase_param_lengths", false);
        zzhdVarZza.zza("measurement.id.increase_param_lengths", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zzb() {
        return f351104a.zza().booleanValue();
    }
}
