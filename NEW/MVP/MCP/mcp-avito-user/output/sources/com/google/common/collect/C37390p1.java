package com.google.common.collect;

import com.google.common.collect.AbstractC37412t1;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: ImmutableEnumMap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.p1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37390p1<K extends Enum<K>, V> extends AbstractC37412t1.c<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public final transient EnumMap<K, V> f359912e;

    /* compiled from: ImmutableEnumMap.java */
    @XY0.d
    /* renamed from: com.google.common.collect.p1$b */
    public static class b<K extends Enum<K>, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b, reason: collision with root package name */
        public final EnumMap<K, V> f359913b;

        public b(EnumMap<K, V> enumMap) {
            this.f359913b = enumMap;
        }

        public Object readResolve() {
            return new C37390p1(this.f359913b, null);
        }
    }

    public C37390p1() {
        throw null;
    }

    public C37390p1(EnumMap enumMap, a aVar) {
        this.f359912e = enumMap;
        com.google.common.base.M.g(!enumMap.isEmpty());
    }

    @XY0.d
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EnumSerializedForm");
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
    public final boolean containsKey(@I41.a Object obj) {
        return this.f359912e.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
    public final boolean equals(@I41.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37390p1) {
            obj = ((C37390p1) obj).f359912e;
        }
        return this.f359912e.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
    @I41.a
    public final V get(@I41.a Object obj) {
        return this.f359912e.get(obj);
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final boolean k() {
        return false;
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final N4<K> l() {
        return C37325e2.n(this.f359912e.keySet().iterator());
    }

    @Override // com.google.common.collect.AbstractC37412t1.c
    public final N4<Map.Entry<K, V>> s() {
        return new K2(this.f359912e.entrySet().iterator());
    }

    @Override // java.util.Map
    public final int size() {
        return this.f359912e.size();
    }

    @Override // com.google.common.collect.AbstractC37412t1
    @XY0.d
    public Object writeReplace() {
        return new b(this.f359912e);
    }
}
