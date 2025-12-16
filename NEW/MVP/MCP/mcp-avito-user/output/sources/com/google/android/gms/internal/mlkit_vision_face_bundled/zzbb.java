package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.NoSuchElementException;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
abstract class zzbb extends zzbv {

    /* renamed from: b, reason: collision with root package name */
    public final int f353489b;

    /* renamed from: c, reason: collision with root package name */
    public int f353490c;

    public zzbb(int i12, int i13) {
        zzav.zzb(i13, i12, "index");
        this.f353489b = i12;
        this.f353490c = i13;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f353490c < this.f353489b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f353490c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f353490c;
        this.f353490c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f353490c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f353490c - 1;
        this.f353490c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f353490c - 1;
    }
}
