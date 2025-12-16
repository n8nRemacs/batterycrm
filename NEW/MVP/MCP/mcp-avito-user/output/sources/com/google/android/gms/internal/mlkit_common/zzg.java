package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzg {

    /* renamed from: a, reason: collision with root package name */
    public final zzan f351312a = new zzan();

    /* renamed from: b, reason: collision with root package name */
    public Boolean f351313b;

    public zzg() {
    }

    public final zzg zza(zzs zzsVar) {
        zzae.zzc(this.f351313b, "Must call internal() or external() before appending rules.");
        this.f351312a.zzb(zzsVar);
        return this;
    }

    public final zzg zzb() {
        zzae.zze(this.f351313b == null, "A SourcePolicy can only set internal() or external() once.");
        this.f351313b = Boolean.FALSE;
        return this;
    }

    public final zzg zzc() {
        zzae.zze(this.f351313b == null, "A SourcePolicy can only set internal() or external() once.");
        this.f351313b = Boolean.TRUE;
        return this;
    }

    public final zzi zzd() {
        zzae.zzc(this.f351313b, "Must call internal() or external() when building a SourcePolicy.");
        return new zzi(this.f351313b.booleanValue(), false, this.f351312a.zzc(), null);
    }

    public /* synthetic */ zzg(zzf zzfVar) {
    }
}
