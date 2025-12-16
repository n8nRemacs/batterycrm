package com.google.common.collect;

import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.J3;
import java.util.Map;

/* compiled from: RegularImmutableBiMap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
final class H3<K, V> extends AbstractC37366l1<K, V> {

    /* renamed from: j, reason: collision with root package name */
    public static final H3<Object, Object> f359352j = new H3<>();

    /* renamed from: e, reason: collision with root package name */
    @I41.a
    public final transient Object f359353e;

    /* renamed from: f, reason: collision with root package name */
    @XY0.e
    public final transient Object[] f359354f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f359355g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f359356h;

    /* renamed from: i, reason: collision with root package name */
    public final transient H3<V, K> f359357i;

    /* JADX WARN: Multi-variable type inference failed */
    public H3() {
        this.f359353e = null;
        this.f359354f = new Object[0];
        this.f359355g = 0;
        this.f359356h = 0;
        this.f359357i = this;
    }

    @Override // com.google.common.collect.AbstractC37366l1, com.google.common.collect.A
    public final A O() {
        return this.f359357i;
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final H1<Map.Entry<K, V>> d() {
        return new J3.a(this, this.f359354f, this.f359355g, this.f359356h);
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final H1<K> e() {
        return new J3.b(this, new J3.c(this.f359354f, this.f359355g, this.f359356h));
    }

    @Override // com.google.common.collect.AbstractC37412t1, java.util.Map
    @I41.a
    public final V get(@I41.a Object obj) {
        V v12 = (V) J3.u(this.f359353e, this.f359354f, this.f359356h, this.f359355g, obj);
        if (v12 == null) {
            return null;
        }
        return v12;
    }

    @Override // com.google.common.collect.AbstractC37412t1
    public final boolean k() {
        return false;
    }

    @Override // com.google.common.collect.AbstractC37366l1
    /* renamed from: s */
    public final AbstractC37366l1<V, K> O() {
        return this.f359357i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f359356h;
    }

    public H3(Object[] objArr, int i12) {
        this.f359354f = objArr;
        this.f359356h = i12;
        this.f359355g = 0;
        int iS2 = i12 >= 2 ? H1.s(i12) : 0;
        Object objT = J3.t(objArr, i12, iS2, 0);
        if (!(objT instanceof Object[])) {
            this.f359353e = objT;
            Object objT2 = J3.t(objArr, i12, iS2, 1);
            if (!(objT2 instanceof Object[])) {
                this.f359357i = new H3<>(objT2, objArr, i12, this);
                return;
            }
            throw ((AbstractC37412t1.b.a) ((Object[]) objT2)[2]).a();
        }
        throw ((AbstractC37412t1.b.a) ((Object[]) objT)[2]).a();
    }

    public H3(@I41.a Object obj, Object[] objArr, int i12, H3<V, K> h32) {
        this.f359353e = obj;
        this.f359354f = objArr;
        this.f359355g = 1;
        this.f359356h = i12;
        this.f359357i = h32;
    }
}
