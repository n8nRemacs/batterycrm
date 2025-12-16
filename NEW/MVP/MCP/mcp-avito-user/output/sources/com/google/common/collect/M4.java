package com.google.common.collect;

import java.util.ArrayDeque;

/* compiled from: TreeTraverser.java */
@InterfaceC37329f0
@Deprecated
@XY0.b
@XY0.a
/* loaded from: classes6.dex */
public abstract class M4<T> {

    /* compiled from: TreeTraverser.java */
    public final class a extends N4<T> implements InterfaceC37449y3<T> {

        /* renamed from: b, reason: collision with root package name */
        public final ArrayDeque f359517b;

        public a() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f359517b = arrayDeque;
            arrayDeque.add(null);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f359517b.isEmpty();
        }

        @Override // java.util.Iterator
        public final T next() {
            this.f359517b.remove();
            throw null;
        }
    }

    /* compiled from: TreeTraverser.java */
    public final class b extends AbstractC37316d<T> {
        public b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final T a() {
            throw null;
        }
    }

    /* compiled from: TreeTraverser.java */
    public static final class c<T> {
    }

    /* compiled from: TreeTraverser.java */
    public final class d extends N4<T> {
        public d() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw null;
        }
    }
}
