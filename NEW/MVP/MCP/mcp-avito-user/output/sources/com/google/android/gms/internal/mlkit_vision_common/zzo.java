package com.google.android.gms.internal.mlkit_vision_common;

import I41.a;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzo extends zzp {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f352914d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f352915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzp f352916f;

    public zzo(zzp zzpVar, int i12, int i13) {
        this.f352916f = zzpVar;
        this.f352914d = i12;
        this.f352915e = i13;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int b() {
        return this.f352916f.d() + this.f352914d + this.f352915e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int d() {
        return this.f352916f.d() + this.f352914d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    @a
    public final Object[] e() {
        return this.f352916f.e();
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzf.zza(i12, this.f352915e, "index");
        return this.f352916f.get(i12 + this.f352914d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352915e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzp subList(int i12, int i13) {
        zzf.zzc(i12, i13, this.f352915e);
        int i14 = this.f352914d;
        return this.f352916f.subList(i12 + i14, i13 + i14);
    }
}
