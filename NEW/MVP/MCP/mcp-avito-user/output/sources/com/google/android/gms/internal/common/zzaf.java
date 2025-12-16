package com.google.android.gms.internal.common;

import I41.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class zzaf extends zzag {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f350227d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f350228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzag f350229f;

    public zzaf(zzag zzagVar, int i12, int i13) {
        this.f350229f = zzagVar;
        this.f350227d = i12;
        this.f350228e = i13;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int b() {
        return this.f350229f.d() + this.f350227d + this.f350228e;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int d() {
        return this.f350229f.d() + this.f350227d;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean e() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @a
    public final Object[] g() {
        return this.f350229f.g();
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzs.zza(i12, this.f350228e, "index");
        return this.f350229f.get(i12 + this.f350227d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f350228e;
    }

    @Override // com.google.android.gms.internal.common.zzag, java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzag subList(int i12, int i13) {
        zzs.zzc(i12, i13, this.f350228e);
        int i14 = this.f350227d;
        return this.f350229f.subList(i12 + i14, i13 + i14);
    }
}
