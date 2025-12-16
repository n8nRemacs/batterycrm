package com.google.android.gms.internal.mlkit_vision_face;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
abstract class zzad extends zzcm {

    /* renamed from: b, reason: collision with root package name */
    public final int f352940b;

    /* renamed from: c, reason: collision with root package name */
    public int f352941c;

    public zzad(int i12, int i13) {
        zzab.zzb(i13, i12, "index");
        this.f352940b = i12;
        this.f352941c = i13;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f352941c < this.f352940b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f352941c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f352941c;
        this.f352941c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f352941c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f352941c - 1;
        this.f352941c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f352941c - 1;
    }
}
