package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzbk implements zzbm {

    /* renamed from: a, reason: collision with root package name */
    public final zzh f350587a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350588b;

    public zzbk(zzh zzhVar, String str) {
        this.f350587a = zzhVar;
        this.f350588b = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final zzh zza(zzaq zzaqVar) {
        zzh zzhVarZza = this.f350587a.zza();
        zzhVarZza.zzb(this.f350588b, zzaqVar);
        return zzhVarZza;
    }
}
