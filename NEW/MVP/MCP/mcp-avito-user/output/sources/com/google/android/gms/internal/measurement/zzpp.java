package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzpp implements zzpm {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351139a;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351139a = zzhdVarZza.zza("measurement.remove_app_background.client", false);
        zzhdVarZza.zza("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzb() {
        return f351139a.zza().booleanValue();
    }
}
