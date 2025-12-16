package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzpv implements zzps {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351145a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Boolean> f351146b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgv<Boolean> f351147c;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351145a = zzhdVarZza.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
        f351146b = zzhdVarZza.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f351147c = zzhdVarZza.zza("measurement.session_stitching_token_enabled", false);
        zzhdVarZza.zza("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final boolean zzb() {
        return f351145a.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final boolean zzc() {
        return f351146b.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final boolean zzd() {
        return f351147c.zza().booleanValue();
    }
}
