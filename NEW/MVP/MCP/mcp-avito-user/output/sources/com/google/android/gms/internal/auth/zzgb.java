package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzgb implements zzgi {

    /* renamed from: a, reason: collision with root package name */
    public final zzfx f350133a;

    /* renamed from: b, reason: collision with root package name */
    public final zzgz f350134b;

    /* renamed from: c, reason: collision with root package name */
    public final zzem f350135c;

    public zzgb(zzgz zzgzVar, zzem zzemVar, zzfx zzfxVar) {
        this.f350134b = zzgzVar;
        this.f350135c = zzemVar;
        this.f350133a = zzfxVar;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        return this.f350134b.b(obj).hashCode();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        zzfx zzfxVar = this.f350133a;
        return zzfxVar instanceof zzev ? (zzev) ((zzev) zzfxVar).g(4) : ((zzet) ((zzev) zzfxVar).g(5)).zzd();
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        this.f350134b.e(obj);
        this.f350135c.b(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        Class cls = zzgk.f350146a;
        zzgz zzgzVar = this.f350134b;
        zzgzVar.f(obj, zzgzVar.c(zzgzVar.b(obj), zzgzVar.b(obj2)));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i12, int i13, zzdt zzdtVar) {
        zzev zzevVar = (zzev) obj;
        if (zzevVar.zzc == zzha.zza()) {
            zzevVar.zzc = zzha.a();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        zzgz zzgzVar = this.f350134b;
        return zzgzVar.b(obj).equals(zzgzVar.b(obj2));
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        this.f350135c.a(obj);
        throw null;
    }
}
