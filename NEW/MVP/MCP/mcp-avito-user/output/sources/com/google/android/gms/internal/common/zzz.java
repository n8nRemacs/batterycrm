package com.google.android.gms.internal.common;

import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes6.dex */
abstract class zzz extends zzak {

    /* renamed from: b, reason: collision with root package name */
    public final int f350252b;

    /* renamed from: c, reason: collision with root package name */
    public int f350253c;

    public zzz(int i12, int i13) {
        zzs.zzb(i13, i12, "index");
        this.f350252b = i12;
        this.f350253c = i13;
    }

    public abstract Object a(int i12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f350253c < this.f350252b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f350253c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f350253c;
        this.f350253c = i12 + 1;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f350253c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i12 = this.f350253c - 1;
        this.f350253c = i12;
        return a(i12);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f350253c - 1;
    }
}
