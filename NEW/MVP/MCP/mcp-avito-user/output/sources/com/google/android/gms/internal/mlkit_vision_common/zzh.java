package com.google.android.gms.internal.mlkit_vision_common;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
abstract class zzh extends zzac {

    /* renamed from: b, reason: collision with root package name */
    public final int f352825b;

    /* renamed from: c, reason: collision with root package name */
    public int f352826c;

    public zzh(int i12, int i13) {
        zzf.zzb(i13, i12, "index");
        this.f352825b = i12;
        this.f352826c = i13;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f352826c < this.f352825b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f352826c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f352826c;
        this.f352826c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f352826c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f352826c - 1;
        this.f352826c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f352826c - 1;
    }
}
