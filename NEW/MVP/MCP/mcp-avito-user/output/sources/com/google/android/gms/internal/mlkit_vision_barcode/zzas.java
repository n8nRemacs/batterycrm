package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
abstract class zzas extends zzdb {

    /* renamed from: b, reason: collision with root package name */
    public final int f351754b;

    /* renamed from: c, reason: collision with root package name */
    public int f351755c;

    public zzas(int i12, int i13) {
        zzaq.zzb(i13, i12, "index");
        this.f351754b = i12;
        this.f351755c = i13;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f351755c < this.f351754b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f351755c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f351755c;
        this.f351755c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f351755c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f351755c - 1;
        this.f351755c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f351755c - 1;
    }
}
