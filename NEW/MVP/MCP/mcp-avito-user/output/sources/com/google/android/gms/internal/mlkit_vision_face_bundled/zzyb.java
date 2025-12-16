package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
@Deprecated
/* loaded from: classes6.dex */
public final class zzyb extends AbstractList implements RandomAccess, zzwa {

    /* renamed from: b, reason: collision with root package name */
    public final zzwa f354145b;

    public zzyb(zzwa zzwaVar) {
        this.f354145b = zzwaVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i12) {
        return ((zzvz) this.f354145b).get(i12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzya(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i12) {
        return new zzxz(this, i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f354145b.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwa
    public final Object zzf(int i12) {
        return this.f354145b.zzf(i12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwa
    public final List zzh() {
        return this.f354145b.zzh();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzwa
    public final zzwa zze() {
        return this;
    }
}
