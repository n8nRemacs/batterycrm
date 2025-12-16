package com.google.common.collect;

import bZ0.InterfaceC25601b;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* compiled from: ImmutableEnumSet.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37396q1<E extends Enum<E>> extends H1<E> {

    /* renamed from: e, reason: collision with root package name */
    public final transient EnumSet<E> f359954e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC25601b
    public transient int f359955f;

    /* compiled from: ImmutableEnumSet.java */
    @XY0.d
    /* renamed from: com.google.common.collect.q1$b */
    public static class b<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final EnumSet<E> f359956b;

        public b(EnumSet<E> enumSet) {
            this.f359956b = enumSet;
        }

        public Object readResolve() {
            return new C37396q1(this.f359956b.clone(), null);
        }
    }

    public C37396q1() {
        throw null;
    }

    public C37396q1(EnumSet enumSet, a aVar) {
        this.f359954e = enumSet;
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.H1
    public final boolean C() {
        return true;
    }

    @Override // com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        return this.f359954e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof C37396q1) {
            collection = ((C37396q1) collection).f359954e;
        }
        return this.f359954e.containsAll(collection);
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37396q1) {
            obj = ((C37396q1) obj).f359954e;
        }
        return this.f359954e.equals(obj);
    }

    @Override // com.google.common.collect.H1, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i12 = this.f359955f;
        if (i12 != 0) {
            return i12;
        }
        int iHashCode = this.f359954e.hashCode();
        this.f359955f = iHashCode;
        return iHashCode;
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f359954e.isEmpty();
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public final N4<E> iterator() {
        return C37325e2.n(this.f359954e.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f359954e.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return this.f359954e.toString();
    }

    @Override // com.google.common.collect.H1, com.google.common.collect.AbstractC37378n1
    @XY0.d
    public Object writeReplace() {
        return new b(this.f359954e);
    }
}
