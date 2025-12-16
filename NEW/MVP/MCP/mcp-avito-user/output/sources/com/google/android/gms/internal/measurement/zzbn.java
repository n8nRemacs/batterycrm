package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzbn implements zzbm {

    /* renamed from: a, reason: collision with root package name */
    public final zzh f350590a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350591b;

    public zzbn(zzh zzhVar, String str) {
        this.f350590a = zzhVar;
        this.f350591b = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final zzh zza(zzaq zzaqVar) {
        zzh zzhVarZza = this.f350590a.zza();
        zzhVarZza.zza(this.f350591b, zzaqVar);
        return zzhVarZza;
    }
}
