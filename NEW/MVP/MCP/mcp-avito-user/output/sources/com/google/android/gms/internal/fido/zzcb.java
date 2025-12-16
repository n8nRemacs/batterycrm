package com.google.android.gms.internal.fido;

import I41.a;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzcb extends zzcc {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f350281d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f350282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzcc f350283f;

    public zzcb(zzcc zzccVar, int i12, int i13) {
        this.f350283f = zzccVar;
        this.f350281d = i12;
        this.f350282e = i13;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int b() {
        return this.f350283f.d() + this.f350281d + this.f350282e;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    public final int d() {
        return this.f350283f.d() + this.f350281d;
    }

    @Override // com.google.android.gms.internal.fido.zzby
    @a
    public final Object[] e() {
        return this.f350283f.e();
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzbm.zza(i12, this.f350282e, "index");
        return this.f350283f.get(i12 + this.f350281d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350282e;
    }

    @Override // com.google.android.gms.internal.fido.zzcc, java.util.List
    /* renamed from: zzg */
    public final zzcc subList(int i12, int i13) {
        zzbm.zze(i12, i13, this.f350282e);
        int i14 = this.f350281d;
        return this.f350283f.subList(i12 + i14, i13 + i14);
    }
}
