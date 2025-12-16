package com.google.common.collect;

import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.B3;
import com.google.common.collect.M2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: ImmutableRangeMap.java */
@XY0.c
@InterfaceC37329f0
/* loaded from: classes6.dex */
public class E1<K extends Comparable<?>, V> implements D3<K, V>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final E1<Comparable<?>, Object> f359285d;
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final transient AbstractC37401r1<B3<K>> f359286b;

    /* renamed from: c, reason: collision with root package name */
    public final transient AbstractC37401r1<V> f359287c;

    /* compiled from: ImmutableRangeMap.java */
    @aZ0.f
    public static final class a<K extends Comparable<?>, V> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f359288a = new ArrayList();
    }

    /* compiled from: ImmutableRangeMap.java */
    public static class b<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37412t1<B3<K>, V> f359289b;

        public b(AbstractC37412t1<B3<K>, V> abstractC37412t1) {
            this.f359289b = abstractC37412t1;
        }

        public Object readResolve() {
            ArrayList arrayList;
            AbstractC37412t1<B3<K>, V> abstractC37412t1 = this.f359289b;
            if (abstractC37412t1.isEmpty()) {
                return E1.f359285d;
            }
            a aVar = new a();
            N4<Map.Entry<B3<K>, V>> it = abstractC37412t1.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = aVar.f359288a;
                if (!zHasNext) {
                    break;
                }
                Map.Entry<B3<K>, V> next = it.next();
                B3<K> key = next.getKey();
                V value = next.getValue();
                key.getClass();
                value.getClass();
                com.google.common.base.M.f("Range must not be empty, but was %s", !key.g(), key);
                arrayList.add(new C37384o1(key, value));
            }
            B3<Comparable> b32 = B3.f359264d;
            AbstractC37429w3<B3<?>> abstractC37429w3 = B3.c.f359269b;
            abstractC37429w3.getClass();
            Collections.sort(arrayList, new B(M2.EnumC37297e.f359488b, abstractC37429w3));
            AbstractC37401r1.a aVar2 = new AbstractC37401r1.a(arrayList.size());
            AbstractC37401r1.a aVar3 = new AbstractC37401r1.a(arrayList.size());
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                B3 b33 = (B3) ((Map.Entry) arrayList.get(i12)).getKey();
                if (i12 > 0) {
                    B3 b34 = (B3) ((Map.Entry) arrayList.get(i12 - 1)).getKey();
                    if (b33.f(b34) && !b33.e(b34).g()) {
                        throw new IllegalArgumentException("Overlapping ranges: range " + b34 + " overlaps with entry " + b33);
                    }
                }
                aVar2.g(b33);
                aVar3.g(((Map.Entry) arrayList.get(i12)).getValue());
            }
            return new E1(aVar2.i(), aVar3.i());
        }
    }

    static {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1<Object> abstractC37401r1 = I3.f359390f;
        f359285d = new E1<>(abstractC37401r1, abstractC37401r1);
    }

    public E1(AbstractC37401r1<B3<K>> abstractC37401r1, AbstractC37401r1<V> abstractC37401r12) {
        this.f359286b = abstractC37401r1;
        this.f359287c = abstractC37401r12;
    }

    public static /* synthetic */ void b() {
        throw null;
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.D3
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC37412t1<B3<K>, V> a() {
        AbstractC37401r1<B3<K>> abstractC37401r1 = this.f359286b;
        if (abstractC37401r1.isEmpty()) {
            return (AbstractC37412t1<B3<K>, V>) J3.f359405h;
        }
        B3<Comparable> b32 = B3.f359264d;
        return new J1(new N3(abstractC37401r1, B3.c.f359269b), this.f359287c, null);
    }

    public final boolean equals(@I41.a Object obj) {
        if (obj instanceof D3) {
            return a().equals(((D3) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        AbstractC37412t1<B3<K>, V> abstractC37412t1A = a();
        abstractC37412t1A.getClass();
        return M2.k(abstractC37412t1A);
    }

    public Object writeReplace() {
        return new b(a());
    }
}
