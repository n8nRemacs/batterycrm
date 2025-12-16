package com.google.common.graph;

import com.google.common.graph.F;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: AbstractBaseGraph.java */
/* renamed from: com.google.common.graph.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37455a extends AbstractSet<E<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC37461d f360184b;

    public C37455a(AbstractC37461d abstractC37461d) {
        this.f360184b = abstractC37461d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@I41.a Object obj) {
        if (!(obj instanceof E)) {
            return false;
        }
        E e12 = (E) obj;
        AbstractC37461d abstractC37461d = this.f360184b;
        abstractC37461d.getClass();
        if (e12.b() != abstractC37461d.c()) {
            return false;
        }
        Set<N> setD = abstractC37461d.d();
        N n12 = e12.f360173b;
        return setD.contains(n12) && abstractC37461d.h(n12).contains(e12.f360174c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC37461d abstractC37461d = this.f360184b;
        return abstractC37461d.c() ? new F.b(abstractC37461d, null) : new F.c(abstractC37461d, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return com.google.common.primitives.l.f(this.f360184b.n());
    }
}
