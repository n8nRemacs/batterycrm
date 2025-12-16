package com.google.android.gms.internal.mlkit_vision_face_bundled;

import I41.a;
import java.util.Iterator;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzbq extends zzbm {

    /* renamed from: d, reason: collision with root package name */
    public final transient zzbl f353511d;

    /* renamed from: e, reason: collision with root package name */
    public final transient zzbj f353512e;

    public zzbq(zzbl zzblVar, zzbj zzbjVar) {
        this.f353511d = zzblVar;
        this.f353512e = zzbjVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    public final int a(Object[] objArr) {
        return this.f353512e.a(objArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@a Object obj) {
        return this.f353511d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm, com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f353512e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f353511d.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzbm, com.google.android.gms.internal.mlkit_vision_face_bundled.zzbf
    /* renamed from: zzd */
    public final zzbu iterator() {
        return this.f353512e.listIterator(0);
    }
}
