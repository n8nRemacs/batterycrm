package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ImmutableMapEntrySet.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.v1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37422v1<K, V> extends H1<Map.Entry<K, V>> {

    /* compiled from: ImmutableMapEntrySet.java */
    @XY0.d
    @XY0.c
    /* renamed from: com.google.common.collect.v1$a */
    public static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37412t1<K, V> f360025b;

        public a(AbstractC37412t1<K, V> abstractC37412t1) {
            this.f360025b = abstractC37412t1;
        }

        public Object readResolve() {
            return this.f360025b.entrySet();
        }
    }

    /* compiled from: ImmutableMapEntrySet.java */
    /* renamed from: com.google.common.collect.v1$b */
    public static final class b<K, V> extends AbstractC37422v1<K, V> {
        @Override // com.google.common.collect.AbstractC37422v1
        public final AbstractC37412t1<K, V> Q() {
            return null;
        }

        @Override // com.google.common.collect.AbstractC37378n1
        @XY0.c
        public final int d(int i12, Object[] objArr) {
            throw null;
        }

        @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37378n1
        /* renamed from: l */
        public final N4<Map.Entry<K, V>> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.H1
        public final AbstractC37401r1<Map.Entry<K, V>> y() {
            return null;
        }
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.H1
    @XY0.c
    public final boolean C() {
        return Q().h();
    }

    public abstract AbstractC37412t1<K, V> Q();

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v12 = Q().get(entry.getKey());
        return v12 != null && v12.equals(entry.getValue());
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final int hashCode() {
        return Q().hashCode();
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return Q().k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return Q().size();
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    @XY0.c
    @XY0.d
    public Object writeReplace() {
        return new a(Q());
    }
}
