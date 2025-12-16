package com.google.android.gms.internal.common;

import I41.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes6.dex */
abstract class zzj implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    @a
    public Object f350236b;

    /* renamed from: c, reason: collision with root package name */
    public int f350237c = 2;

    @a
    public abstract String a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i12 = this.f350237c;
        if (i12 == 4) {
            throw new IllegalStateException();
        }
        int i13 = i12 - 1;
        if (i12 == 0) {
            throw null;
        }
        if (i13 == 0) {
            return true;
        }
        if (i13 != 2) {
            this.f350237c = 4;
            this.f350236b = a();
            if (this.f350237c != 3) {
                this.f350237c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f350237c = 2;
        Object obj = this.f350236b;
        this.f350236b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
