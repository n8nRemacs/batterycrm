package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.C37325e2;
import com.google.common.collect.InterfaceC37338g3;
import com.google.common.collect.S3;
import com.google.j2objc.annotations.Weak;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: ImmutableMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37437y1<K, V> extends AbstractC37450z<K, V> implements Serializable {

    @XY0.d
    private static final long serialVersionUID = 0;

    /* renamed from: g, reason: collision with root package name */
    public final transient AbstractC37412t1<K, ? extends AbstractC37378n1<V>> f360073g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f360074h;

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: com.google.common.collect.y1$a */
    public class a extends N4<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public final N4 f360075b;

        /* renamed from: c, reason: collision with root package name */
        @I41.a
        public K f360076c = null;

        /* renamed from: d, reason: collision with root package name */
        public N4 f360077d = C37325e2.d.f359709e;

        public a(AbstractC37437y1 abstractC37437y1) {
            this.f360075b = abstractC37437y1.f360073g.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f360077d.hasNext() || this.f360075b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!this.f360077d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f360075b.next();
                this.f360076c = (K) entry.getKey();
                this.f360077d = ((AbstractC37378n1) entry.getValue()).iterator();
            }
            K k12 = this.f360076c;
            Objects.requireNonNull(k12);
            return new C37384o1(k12, this.f360077d.next());
        }
    }

    /* compiled from: ImmutableMultimap.java */
    @aZ0.f
    /* renamed from: com.google.common.collect.y1$b */
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, Collection<V>> f360078a = new K();
    }

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: com.google.common.collect.y1$c */
    public static class c<K, V> extends AbstractC37378n1<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        @Weak
        public final AbstractC37437y1<K, V> f360079c;

        public c(AbstractC37437y1<K, V> abstractC37437y1) {
            this.f360079c = abstractC37437y1;
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f360079c.R(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return this.f360079c.f360073g.k();
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: l */
        public final N4<Map.Entry<K, V>> iterator() {
            AbstractC37437y1<K, V> abstractC37437y1 = this.f360079c;
            abstractC37437y1.getClass();
            return new a(abstractC37437y1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f360079c.f360074h;
        }
    }

    /* compiled from: ImmutableMultimap.java */
    @XY0.c
    @XY0.d
    /* renamed from: com.google.common.collect.y1$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final S3.b<AbstractC37437y1> f360080a = S3.a(AbstractC37437y1.class, "map");

        /* renamed from: b, reason: collision with root package name */
        public static final S3.b<AbstractC37437y1> f360081b = S3.a(AbstractC37437y1.class, "size");
    }

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: com.google.common.collect.y1$e */
    public class e extends A1<K> {
        public e() {
        }

        @XY0.c
        @XY0.d
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use KeysSerializedForm");
        }

        @Override // com.google.common.collect.InterfaceC37338g3
        public final int S5(@I41.a Object obj) {
            AbstractC37378n1<V> abstractC37378n1 = AbstractC37437y1.this.f360073g.get(obj);
            if (abstractC37378n1 == null) {
                return 0;
            }
            return abstractC37378n1.size();
        }

        @Override // com.google.common.collect.A1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return AbstractC37437y1.this.f360073g.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.A1, com.google.common.collect.InterfaceC37338g3
        /* renamed from: s */
        public final H1<K> k() {
            return AbstractC37437y1.this.f360073g.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return AbstractC37437y1.this.f360074h;
        }

        @Override // com.google.common.collect.A1
        public final InterfaceC37338g3.a<K> v(int i12) {
            Map.Entry<K, ? extends AbstractC37378n1<V>> entry = AbstractC37437y1.this.f360073g.entrySet().b().get(i12);
            return C37374m3.b(entry.getValue().size(), entry.getKey());
        }

        @Override // com.google.common.collect.A1, com.google.common.collect.AbstractC37378n1
        @XY0.c
        @XY0.d
        public Object writeReplace() {
            return new f(AbstractC37437y1.this);
        }
    }

    /* compiled from: ImmutableMultimap.java */
    @XY0.c
    @XY0.d
    /* renamed from: com.google.common.collect.y1$f */
    public static final class f implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37437y1<?, ?> f360083b;

        public f(AbstractC37437y1<?, ?> abstractC37437y1) {
            this.f360083b = abstractC37437y1;
        }

        public Object readResolve() {
            return this.f360083b.o();
        }
    }

    /* compiled from: ImmutableMultimap.java */
    /* renamed from: com.google.common.collect.y1$g */
    public static final class g<K, V> extends AbstractC37378n1<V> {

        @XY0.d
        private static final long serialVersionUID = 0;

        /* renamed from: c, reason: collision with root package name */
        @Weak
        public final transient AbstractC37437y1<K, V> f360084c;

        public g(AbstractC37437y1<K, V> abstractC37437y1) {
            this.f360084c = abstractC37437y1;
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@I41.a Object obj) {
            return this.f360084c.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractC37378n1
        @XY0.c
        public final int d(int i12, Object[] objArr) {
            N4<? extends AbstractC37378n1<V>> it = this.f360084c.f360073g.values().iterator();
            while (it.hasNext()) {
                i12 = it.next().d(i12, objArr);
            }
            return i12;
        }

        @Override // com.google.common.collect.AbstractC37378n1
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: l */
        public final N4<V> iterator() {
            AbstractC37437y1<K, V> abstractC37437y1 = this.f360084c;
            abstractC37437y1.getClass();
            return new C37452z1(abstractC37437y1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return this.f360084c.f360074h;
        }
    }

    public AbstractC37437y1(AbstractC37412t1<K, ? extends AbstractC37378n1<V>> abstractC37412t1, int i12) {
        this.f360073g = abstractC37412t1;
        this.f360074h = i12;
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final InterfaceC37338g3 Q() {
        return (A1) super.Q();
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public /* bridge */ /* synthetic */ Collection a(@I41.a Object obj) {
        p();
        throw null;
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Map<K, Collection<V>> c() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.R2
    @aZ0.e
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.R2
    public final boolean containsKey(@I41.a Object obj) {
        return this.f360073g.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final boolean containsValue(@I41.a Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Collection d() {
        return new c(this);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Set<K> e() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final InterfaceC37338g3 f() {
        return new e();
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Collection g() {
        return new g(this);
    }

    @Override // com.google.common.collect.AbstractC37346i
    public final Iterator i() {
        return new a(this);
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC37412t1<K, Collection<V>> V() {
        return this.f360073g;
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final Set keySet() {
        return this.f360073g.keySet();
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC37378n1<Map.Entry<K, V>> b() {
        return (AbstractC37378n1) super.b();
    }

    public final N4<Map.Entry<K, V>> m() {
        return new a(this);
    }

    @Override // com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC37378n1<V> get(K k12);

    public final A1<K> o() {
        return (A1) super.Q();
    }

    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public AbstractC37378n1 p() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean put(K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    @InterfaceC19845a
    @aZ0.e
    @Deprecated
    public final boolean remove(@I41.a Object obj, @I41.a Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.R2
    public final int size() {
        return this.f360074h;
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final Collection values() {
        return (AbstractC37378n1) super.values();
    }
}
