package V61;

import java.lang.reflect.Array;
import java.util.Iterator;

/* compiled from: ArrayIterator.java */
/* loaded from: classes7.dex */
public class a implements Iterator<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final Object f16923b;

    /* renamed from: c, reason: collision with root package name */
    public int f16924c = 0;

    public a(Object obj) {
        if (!obj.getClass().isArray()) {
            throw new IllegalArgumentException("not an array");
        }
        this.f16923b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16924c < Array.getLength(this.f16923b);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i12 = this.f16924c;
        this.f16924c = i12 + 1;
        return Array.get(this.f16923b, i12);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("cannot remove items from an array");
    }
}
