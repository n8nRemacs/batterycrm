package com.google.common.collect;

import com.google.common.collect.AbstractC37316d;
import com.google.common.collect.W3;
import java.util.Iterator;

/* compiled from: Sets.java */
/* loaded from: classes6.dex */
class U3 extends W3.i<Object> {

    /* compiled from: Sets.java */
    public class a extends AbstractC37316d<Object> {

        /* renamed from: d, reason: collision with root package name */
        public final Iterator<Object> f359579d;

        /* renamed from: e, reason: collision with root package name */
        public final Iterator<Object> f359580e;

        public a() {
            U3.this.getClass();
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37316d
        @I41.a
        public final Object a() {
            Iterator<Object> it = this.f359579d;
            if (it.hasNext()) {
                return it.next();
            }
            Iterator<Object> it2 = this.f359580e;
            if (!it2.hasNext()) {
                this.f359661b = AbstractC37316d.b.f359666d;
                return null;
            }
            it2.next();
            U3.this.getClass();
            throw null;
        }
    }

    @Override // com.google.common.collect.W3.i
    /* renamed from: b */
    public final N4<Object> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        throw null;
    }

    @Override // com.google.common.collect.W3.i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        throw null;
    }
}
