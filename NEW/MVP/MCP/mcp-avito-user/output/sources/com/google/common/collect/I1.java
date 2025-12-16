package com.google.common.collect;

import aZ0.InterfaceC19845a;
import bZ0.InterfaceC25601b;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.AbstractC37437y1;
import com.google.common.collect.H1;
import com.google.common.collect.N1;
import com.google.common.collect.S3;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: ImmutableSetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public class I1<K, V> extends AbstractC37437y1<K, V> implements T3<K, V> {

    @XY0.c
    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: i, reason: collision with root package name */
    public final transient H1<V> f359385i;

    /* renamed from: j, reason: collision with root package name */
    @I41.a
    @RetainedWith
    @InterfaceC25601b
    public transient H1<Map.Entry<K, V>> f359386j;

    /* compiled from: ImmutableSetMultimap.java */
    public static final class a<K, V> extends AbstractC37437y1.b<K, V> {
        public final I1<K, V> a() {
            Set<Map.Entry<K, V>> setEntrySet = ((K) this.f360078a).entrySet();
            if (setEntrySet.isEmpty()) {
                return C37347i0.f359798k;
            }
            AbstractC37412t1.b bVar = new AbstractC37412t1.b(setEntrySet.size());
            int size = 0;
            for (Map.Entry<K, V> entry : setEntrySet) {
                K key = entry.getKey();
                H1 h1V = H1.v((Collection) entry.getValue());
                if (!h1V.isEmpty()) {
                    bVar.c(key, h1V);
                    size = h1V.size() + size;
                }
            }
            return new I1<>(bVar.a(true), size);
        }
    }

    /* compiled from: ImmutableSetMultimap.java */
    public static final class b<K, V> extends H1<Map.Entry<K, V>> {

        /* renamed from: e, reason: collision with root package name */
        @Weak
        public final transient I1<K, V> f359387e;

        public b(I1<K, V> i12) {
            this.f359387e = i12;
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f359387e.R(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return false;
        }

        @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return this.f359387e.m();
        }

        @Override // com.google.common.collect.AbstractC37378n1
        /* renamed from: l */
        public final N4<Map.Entry<K, V>> iterator() {
            return this.f359387e.m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f359387e.f360074h;
        }
    }

    /* compiled from: ImmutableSetMultimap.java */
    @XY0.c
    @XY0.d
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final S3.b<I1> f359388a = S3.a(I1.class, "emptySet");
    }

    public I1(AbstractC37412t1 abstractC37412t1, int i12) {
        super(abstractC37412t1, i12);
        int i13 = H1.f359346d;
        this.f359385i = L3.f359468k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        Object objU;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i12 = objectInputStream.readInt();
        if (i12 < 0) {
            throw new InvalidObjectException(AK.c.g(i12, "Invalid key count "));
        }
        AbstractC37412t1.b bVar = new AbstractC37412t1.b();
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i15 = objectInputStream.readInt();
            if (i15 <= 0) {
                throw new InvalidObjectException(AK.c.g(i15, "Invalid value count "));
            }
            H1.a aVar = comparator == null ? new H1.a() : new N1.a(comparator);
            for (int i16 = 0; i16 < i15; i16++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                aVar.b(object2);
            }
            H1 h1J = aVar.j();
            if (h1J.size() != i15) {
                throw new InvalidObjectException(androidx.camera.view.k.a(object, "Duplicate key-value pairs exist for key "));
            }
            bVar.c(object, h1J);
            i13 += i15;
        }
        try {
            AbstractC37437y1.d.f360080a.a(this, bVar.a(true));
            S3.b<AbstractC37437y1> bVar2 = AbstractC37437y1.d.f360081b;
            bVar2.getClass();
            try {
                bVar2.f359573a.set(this, Integer.valueOf(i13));
                S3.b<I1> bVar3 = c.f359388a;
                if (comparator == null) {
                    int i17 = H1.f359346d;
                    objU = L3.f359468k;
                } else {
                    objU = N1.U(comparator);
                }
                bVar3.a(this, objU);
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            }
        } catch (IllegalArgumentException e13) {
            throw ((InvalidObjectException) new InvalidObjectException(e13.getMessage()).initCause(e13));
        }
    }

    @XY0.c
    @XY0.d
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        H1<V> h12 = this.f359385i;
        objectOutputStream.writeObject(h12 instanceof N1 ? ((N1) h12).f359521e : null);
        S3.f(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final Collection a(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
    public final Collection b() {
        H1<Map.Entry<K, V>> h12 = this.f359386j;
        if (h12 != null) {
            return h12;
        }
        b bVar = new b(this);
        this.f359386j = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final Collection get(Object obj) {
        return (H1) com.google.common.base.D.a((H1) this.f360073g.get(obj), this.f359385i);
    }

    @Override // com.google.common.collect.AbstractC37437y1
    /* renamed from: l */
    public final AbstractC37378n1 b() {
        H1<Map.Entry<K, V>> h12 = this.f359386j;
        if (h12 != null) {
            return h12;
        }
        b bVar = new b(this);
        this.f359386j = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.AbstractC37437y1
    /* renamed from: n */
    public final AbstractC37378n1 get(Object obj) {
        return (H1) com.google.common.base.D.a((H1) this.f360073g.get(obj), this.f359385i);
    }

    @Override // com.google.common.collect.AbstractC37437y1
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final AbstractC37378n1 p() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final Set a(@I41.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
    public final Set b() {
        H1<Map.Entry<K, V>> h12 = this.f359386j;
        if (h12 != null) {
            return h12;
        }
        b bVar = new b(this);
        this.f359386j = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final Set get(Object obj) {
        return (H1) com.google.common.base.D.a((H1) this.f360073g.get(obj), this.f359385i);
    }
}
