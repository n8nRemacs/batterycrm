package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.H1;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: FluentIterable.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37431x0<E> implements Iterable<E> {

    /* renamed from: b, reason: collision with root package name */
    public final com.google.common.base.H<Iterable<E>> f360057b;

    /* compiled from: FluentIterable.java */
    /* renamed from: com.google.common.collect.x0$a */
    public class a extends AbstractC37431x0<E> {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Iterable f360058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Iterable iterable, Iterable iterable2) {
            super(iterable);
            this.f360058c = iterable2;
        }

        @Override // java.lang.Iterable
        public final Iterator<E> iterator() {
            return this.f360058c.iterator();
        }
    }

    /* compiled from: FluentIterable.java */
    /* renamed from: com.google.common.collect.x0$b */
    public static class b<E> implements InterfaceC37276u<Iterable<E>, AbstractC37431x0<E>> {
        @Override // com.google.common.base.InterfaceC37276u
        public final Object apply(Object obj) {
            return AbstractC37431x0.a((Iterable) obj);
        }
    }

    public AbstractC37431x0() {
        this.f360057b = com.google.common.base.H.a();
    }

    public static <E> AbstractC37431x0<E> a(Iterable<E> iterable) {
        return iterable instanceof AbstractC37431x0 ? (AbstractC37431x0) iterable : new a(iterable, iterable);
    }

    public final Iterable<E> b() {
        return (Iterable) this.f360057b.e(this);
    }

    public final H1<E> d() {
        Iterable<E> iterableB = b();
        int i12 = H1.f359346d;
        if (iterableB instanceof Collection) {
            return H1.v((Collection) iterableB);
        }
        Iterator<E> it = iterableB.iterator();
        if (!it.hasNext()) {
            return L3.f359468k;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return new C37309b4(next);
        }
        H1.a aVar = new H1.a();
        aVar.b(next);
        while (it.hasNext()) {
            aVar.b(it.next());
        }
        return aVar.j();
    }

    public String toString() {
        Iterator<E> it = b().iterator();
        StringBuilder sb2 = new StringBuilder("[");
        boolean z12 = true;
        while (it.hasNext()) {
            if (!z12) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z12 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    public AbstractC37431x0(Iterable<E> iterable) {
        this.f360057b = com.google.common.base.H.d(iterable);
    }
}
