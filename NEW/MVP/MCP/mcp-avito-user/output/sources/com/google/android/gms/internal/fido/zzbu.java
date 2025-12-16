package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
abstract class zzbu extends zzdd {

    /* renamed from: b, reason: collision with root package name */
    public final int f350274b;

    /* renamed from: c, reason: collision with root package name */
    public int f350275c;

    public zzbu(int i12, int i13) {
        zzbm.zzb(i13, i12, "index");
        this.f350274b = i12;
        this.f350275c = i13;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f350275c < this.f350274b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f350275c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f350275c;
        this.f350275c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f350275c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f350275c - 1;
        this.f350275c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f350275c - 1;
    }
}
