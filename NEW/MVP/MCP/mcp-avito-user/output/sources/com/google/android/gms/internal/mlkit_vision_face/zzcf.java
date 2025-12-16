package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzcf extends zzbq {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzbp f353016d;

    /* renamed from: e, reason: collision with root package name */
    public final transient zzbn f353017e;

    public zzcf(zzbp zzbpVar, zzbn zzbnVar) {
        this.f353016d = zzbpVar;
        this.f353017e = zzbnVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi
    public final int a(Object[] objArr) {
        return this.f353017e.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        return this.f353016d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f353017e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f353016d.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzbq, com.google.android.gms.internal.mlkit_vision_face.zzbi
    /* renamed from: zzd */
    public final zzcl iterator() {
        return this.f353017e.listIterator(0);
    }
}
