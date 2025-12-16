package com.google.android.gms.internal.location;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
abstract class zzdo extends zzdv {

    /* renamed from: b, reason: collision with root package name */
    public final int f350521b;

    /* renamed from: c, reason: collision with root package name */
    public int f350522c;

    public zzdo(int i12, int i13) {
        zzdm.zzb(i13, i12, "index");
        this.f350521b = i12;
        this.f350522c = i13;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f350522c < this.f350521b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f350522c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f350522c;
        this.f350522c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f350522c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f350522c - 1;
        this.f350522c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f350522c - 1;
    }
}
