package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: ImmutableAsList.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37360k1<E> extends AbstractC37401r1<E> {

    /* compiled from: ImmutableAsList.java */
    @XY0.c
    @XY0.d
    /* renamed from: com.google.common.collect.k1$a */
    public static class a implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC37378n1<?> f359809b;

        public a(AbstractC37378n1<?> abstractC37378n1) {
            this.f359809b = abstractC37378n1;
        }

        public Object readResolve() {
            return this.f359809b.b();
        }
    }

    @XY0.c
    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public abstract AbstractC37378n1<E> P();

    @Override // com.google.common.collect.AbstractC37401r1, com.google.common.collect.AbstractC37378n1, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        return P().contains(obj);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        ((F3) P()).getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        ((F3) P()).getClass();
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return P().size();
    }

    @Override // com.google.common.collect.AbstractC37401r1, com.google.common.collect.AbstractC37378n1
    @XY0.c
    @XY0.d
    public Object writeReplace() {
        return new a(P());
    }
}
