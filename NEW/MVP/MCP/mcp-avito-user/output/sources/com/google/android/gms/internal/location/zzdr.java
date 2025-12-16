package com.google.android.gms.internal.location;

import I41.a;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
final class zzdr extends zzds {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f350525d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f350526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzds f350527f;

    public zzdr(zzds zzdsVar, int i12, int i13) {
        this.f350527f = zzdsVar;
        this.f350525d = i12;
        this.f350526e = i13;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int b() {
        return this.f350527f.d() + this.f350525d + this.f350526e;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final int d() {
        return this.f350527f.d() + this.f350525d;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzdp
    @a
    public final Object[] g() {
        return this.f350527f.g();
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzdm.zza(i12, this.f350526e, "index");
        return this.f350527f.get(i12 + this.f350525d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350526e;
    }

    @Override // com.google.android.gms.internal.location.zzds, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzds subList(int i12, int i13) {
        zzdm.zzc(i12, i13, this.f350526e);
        int i14 = this.f350525d;
        return this.f350527f.subList(i12 + i14, i13 + i14);
    }
}
