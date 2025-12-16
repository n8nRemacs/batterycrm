package com.google.common.collect;

import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.P1;
import com.google.common.collect.t4;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: SparseImmutableTable.java */
@XY0.b
@InterfaceC37329f0
@aZ0.j
/* renamed from: com.google.common.collect.l4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37369l4<R, C, V> extends O3<R, C, V> {

    /* renamed from: h, reason: collision with root package name */
    public static final P1<Object, Object, Object> f359822h;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC37412t1<R, AbstractC37412t1<C, V>> f359823d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC37412t1<C, AbstractC37412t1<R, V>> f359824e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f359825f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f359826g;

    static {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1<Object> abstractC37401r1 = I3.f359390f;
        int i12 = H1.f359346d;
        L3<Object> l32 = L3.f359468k;
        f359822h = new C37369l4(abstractC37401r1, l32, l32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37369l4(AbstractC37401r1<t4.a<R, C, V>> abstractC37401r1, H1<R> h12, H1<C> h13) {
        AbstractC37412t1 abstractC37412t1F = M2.f(h12);
        LinkedHashMap linkedHashMapH = M2.h();
        N4<R> it = h12.iterator();
        while (it.hasNext()) {
            linkedHashMapH.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapH2 = M2.h();
        N4<C> it2 = h13.iterator();
        while (it2.hasNext()) {
            linkedHashMapH2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[abstractC37401r1.size()];
        int[] iArr2 = new int[abstractC37401r1.size()];
        for (int i12 = 0; i12 < abstractC37401r1.size(); i12++) {
            t4.a aVar = (t4.a) ((I3) abstractC37401r1).get(i12);
            Object objB = aVar.b();
            Object objA = aVar.a();
            Object value = aVar.getValue();
            Integer num = (Integer) ((J3) abstractC37412t1F).get(objB);
            Objects.requireNonNull(num);
            iArr[i12] = num.intValue();
            Map map = (Map) linkedHashMapH.get(objB);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i12] = map2.size();
            O3.u(objB, objA, map2.put(objA, value), value);
            Map map3 = (Map) linkedHashMapH2.get(objA);
            Objects.requireNonNull(map3);
            map3.put(objB, value);
        }
        this.f359825f = iArr;
        this.f359826g = iArr2;
        AbstractC37412t1.b bVar = new AbstractC37412t1.b(linkedHashMapH.size());
        for (Map.Entry entry : linkedHashMapH.entrySet()) {
            bVar.c(entry.getKey(), AbstractC37412t1.c((Map) entry.getValue()));
        }
        this.f359823d = bVar.b();
        AbstractC37412t1.b bVar2 = new AbstractC37412t1.b(linkedHashMapH2.size());
        for (Map.Entry entry2 : linkedHashMapH2.entrySet()) {
            bVar2.c(entry2.getKey(), AbstractC37412t1.c((Map) entry2.getValue()));
        }
        this.f359824e = bVar2.b();
    }

    @Override // com.google.common.collect.P1, com.google.common.collect.t4, com.google.common.collect.R3
    public final Map d() {
        return AbstractC37412t1.c(this.f359823d);
    }

    @Override // com.google.common.collect.P1
    public final AbstractC37412t1<C, Map<R, V>> m() {
        return AbstractC37412t1.c(this.f359824e);
    }

    @Override // com.google.common.collect.P1
    public final P1.b o() {
        AbstractC37412t1 abstractC37412t1F = M2.f(l());
        int[] iArr = new int[k().size()];
        N4<t4.a<R, C, V>> it = k().iterator();
        int i12 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) ((J3) abstractC37412t1F).get(it.next().a());
            Objects.requireNonNull(num);
            iArr[i12] = num.intValue();
            i12++;
        }
        return P1.b.a(this, this.f359825f, iArr);
    }

    @Override // com.google.common.collect.P1
    /* renamed from: s */
    public final AbstractC37412t1<R, Map<C, V>> d() {
        return AbstractC37412t1.c(this.f359823d);
    }

    @Override // com.google.common.collect.t4
    public final int size() {
        return this.f359825f.length;
    }

    @Override // com.google.common.collect.O3
    public final t4.a<R, C, V> v(int i12) {
        Map.Entry<R, AbstractC37412t1<C, V>> entry = this.f359823d.entrySet().b().get(this.f359825f[i12]);
        AbstractC37412t1<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().b().get(this.f359826g[i12]);
        return P1.i(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.O3
    public final V w(int i12) {
        AbstractC37412t1<C, V> abstractC37412t1 = this.f359823d.values().b().get(this.f359825f[i12]);
        return abstractC37412t1.values().b().get(this.f359826g[i12]);
    }
}
