package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.AbstractC37412t1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Set;

/* compiled from: ImmutableBiMap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.l1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37366l1<K, V> extends AbstractC37412t1<K, V> implements A<K, V> {

    /* compiled from: ImmutableBiMap.java */
    /* renamed from: com.google.common.collect.l1$a */
    public static final class a<K, V> extends AbstractC37412t1.b<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractC37412t1.b
        @InterfaceC19845a
        public final AbstractC37412t1.b c(Object obj, Object obj2) {
            super.c(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.AbstractC37412t1.b
        @InterfaceC19845a
        public final AbstractC37412t1.b d(Set set) {
            super.d(set);
            return this;
        }

        @Override // com.google.common.collect.AbstractC37412t1.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final AbstractC37366l1<K, V> b() {
            return this.f360001b == 0 ? H3.f359352j : new H3(this.f360000a, this.f360001b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC19845a
        public final void f(androidx.media3.common.Q q12, String str) {
            super.c(q12, str);
        }
    }

    /* compiled from: ImmutableBiMap.java */
    @XY0.d
    /* renamed from: com.google.common.collect.l1$b */
    public static class b<K, V> extends AbstractC37412t1.e<K, V> {
        private static final long serialVersionUID = 0;

        public b() {
            throw null;
        }

        @Override // com.google.common.collect.AbstractC37412t1.e
        public final AbstractC37412t1.b a(int i12) {
            return new a(i12);
        }
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K, V> AbstractC37366l1<K, V> t() {
        return H3.f359352j;
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final AbstractC37378n1 f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC37412t1
    /* renamed from: r */
    public final AbstractC37378n1 values() {
        return O().keySet();
    }

    @Override // com.google.common.collect.A
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC37366l1<V, K> O();

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map, java.util.SortedMap
    public final Collection values() {
        return O().keySet();
    }

    @Override // com.google.common.collect.AbstractC37412t1
    @XY0.d
    public Object writeReplace() {
        return new b(this);
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map, java.util.SortedMap
    public final Set values() {
        return O().keySet();
    }
}
