package com.google.common.collect;

import bZ0.InterfaceC25601b;
import com.google.common.collect.C37357j4;
import com.google.common.collect.C37374m3;
import com.google.common.collect.E4;
import com.google.common.collect.InterfaceC37338g3;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: AbstractSortedMultiset.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37394q<E> extends AbstractC37352j<E> implements InterfaceC37345h4<E> {

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC37312c1
    public final Comparator<? super E> f359952d;

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient InterfaceC37345h4<E> f359953e;

    public AbstractC37394q(Comparator<? super E> comparator) {
        comparator.getClass();
        this.f359952d = comparator;
    }

    public InterfaceC37345h4<E> C2(@InterfaceC37434x3 E e12, BoundType boundType, @InterfaceC37434x3 E e13, BoundType boundType2) {
        return ((E4) ((E4) this).V5(e12, boundType)).l1(e13, boundType2);
    }

    @Override // com.google.common.collect.AbstractC37352j
    public final Set b() {
        return new C37357j4.b(this);
    }

    public Comparator<? super E> comparator() {
        return this.f359952d;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    public InterfaceC37345h4<E> d1() {
        InterfaceC37345h4<E> interfaceC37345h4 = this.f359953e;
        if (interfaceC37345h4 != null) {
            return interfaceC37345h4;
        }
        C37388p c37388p = new C37388p(this);
        this.f359953e = c37388p;
        return c37388p;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public InterfaceC37338g3.a<E> firstEntry() {
        Iterator<InterfaceC37338g3.a<E>> itH = h();
        if (itH.hasNext()) {
            return itH.next();
        }
        return null;
    }

    public abstract Iterator<InterfaceC37338g3.a<E>> i();

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public InterfaceC37338g3.a<E> lastEntry() {
        E4.b bVar = (E4.b) i();
        if (bVar.hasNext()) {
            return (InterfaceC37338g3.a) bVar.next();
        }
        return null;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public InterfaceC37338g3.a<E> pollFirstEntry() {
        Iterator<InterfaceC37338g3.a<E>> itH = h();
        if (!itH.hasNext()) {
            return null;
        }
        InterfaceC37338g3.a<E> next = itH.next();
        C37374m3.f fVar = new C37374m3.f(next.a(), next.getCount());
        itH.remove();
        return fVar;
    }

    @Override // com.google.common.collect.InterfaceC37345h4
    @I41.a
    public InterfaceC37338g3.a<E> pollLastEntry() {
        E4.b bVar = (E4.b) i();
        if (!bVar.hasNext()) {
            return null;
        }
        InterfaceC37338g3.a aVar = (InterfaceC37338g3.a) bVar.next();
        C37374m3.f fVar = new C37374m3.f(aVar.a(), aVar.getCount());
        bVar.remove();
        return fVar;
    }

    @Override // com.google.common.collect.AbstractC37352j, com.google.common.collect.InterfaceC37338g3
    public NavigableSet<E> k() {
        return (NavigableSet) super.k();
    }

    public AbstractC37394q() {
        this(C37392p3.f359948d);
    }
}
