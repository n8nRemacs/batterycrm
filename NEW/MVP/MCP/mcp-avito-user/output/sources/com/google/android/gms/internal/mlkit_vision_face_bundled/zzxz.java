package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.ListIterator;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzxz implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final ListIterator f354143b;

    public zzxz(zzyb zzybVar, int i12) {
        this.f354143b = zzybVar.f354145b.listIterator(i12);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f354143b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f354143b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f354143b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f354143b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f354143b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f354143b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
