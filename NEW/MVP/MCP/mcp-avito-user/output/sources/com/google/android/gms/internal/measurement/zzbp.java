package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class zzbp implements zzbm {

    /* renamed from: a, reason: collision with root package name */
    public final zzh f350592a;

    /* renamed from: b, reason: collision with root package name */
    public final String f350593b;

    public zzbp(zzh zzhVar, String str) {
        this.f350592a = zzhVar;
        this.f350593b = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final zzh zza(zzaq zzaqVar) {
        String str = this.f350593b;
        zzh zzhVar = this.f350592a;
        zzhVar.zza(str, zzaqVar);
        return zzhVar;
    }
}
