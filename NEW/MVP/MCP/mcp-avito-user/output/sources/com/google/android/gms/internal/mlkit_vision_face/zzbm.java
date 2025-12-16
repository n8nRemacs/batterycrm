package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzbm extends zzbn {

    /* renamed from: d, reason: collision with root package name */
    public final transient int f352996d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f352997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zzbn f352998f;

    public zzbm(zzbn zzbnVar, int i12, int i13) {
        this.f352998f = zzbnVar;
        this.f352996d = i12;
        this.f352997e = i13;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int b() {
        return this.f352998f.d() + this.f352996d + this.f352997e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int d() {
        return this.f352998f.d() + this.f352996d;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    @a
    public final Object[] e() {
        return this.f352998f.e();
    }

    @Override // java.util.List
    public final Object get(int i12) {
        zzab.zza(i12, this.f352997e, "index");
        return this.f352998f.get(i12 + this.f352996d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f352997e;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbn, java.util.List
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbn subList(int i12, int i13) {
        zzab.zzc(i12, i13, this.f352997e);
        int i14 = this.f352996d;
        return this.f352998f.subList(i12 + i14, i13 + i14);
    }
}
