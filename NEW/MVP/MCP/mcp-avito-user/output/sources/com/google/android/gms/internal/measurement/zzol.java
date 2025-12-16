package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzol implements zzoi {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351096a;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351096a = zzhdVarZza.zza("measurement.client.sessions.check_on_reset_and_enable2", true);
        zzhdVarZza.zza("measurement.client.sessions.check_on_startup", true);
        zzhdVarZza.zza("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzoi
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoi
    public final boolean zzb() {
        return f351096a.zza().booleanValue();
    }
}
