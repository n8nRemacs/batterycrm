package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzpd implements zzpa {

    /* renamed from: a, reason: collision with root package name */
    public static final zzgv<Boolean> f351117a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzgv<Double> f351118b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzgv<Long> f351119c;

    /* renamed from: d, reason: collision with root package name */
    public static final zzgv<Long> f351120d;

    /* renamed from: e, reason: collision with root package name */
    public static final zzgv<String> f351121e;

    static {
        zzhd zzhdVarZza = new zzhd(zzgs.zza("com.google.android.gms.measurement")).zzb().zza();
        f351117a = zzhdVarZza.zza("measurement.test.boolean_flag", false);
        f351118b = zzhdVarZza.zza("measurement.test.double_flag", -3.0d);
        f351119c = zzhdVarZza.zza("measurement.test.int_flag", -2L);
        f351120d = zzhdVarZza.zza("measurement.test.long_flag", -1L);
        f351121e = zzhdVarZza.zza("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final double zza() {
        return f351118b.zza().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final long zzb() {
        return f351119c.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final long zzc() {
        return f351120d.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final String zzd() {
        return f351121e.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final boolean zze() {
        return f351117a.zza().booleanValue();
    }
}
