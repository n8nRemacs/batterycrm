package com.google.android.gms.internal.mlkit_common;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
abstract class zzag extends zzbe {

    /* renamed from: b, reason: collision with root package name */
    public final int f351177b;

    /* renamed from: c, reason: collision with root package name */
    public int f351178c;

    public zzag(int i12, int i13) {
        zzae.zzb(i13, i12, "index");
        this.f351177b = i12;
        this.f351178c = i13;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f351178c < this.f351177b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f351178c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f351178c;
        this.f351178c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f351178c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f351178c - 1;
        this.f351178c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f351178c - 1;
    }
}
