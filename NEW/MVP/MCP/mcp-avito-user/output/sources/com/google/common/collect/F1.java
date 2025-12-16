package com.google.common.collect;

/* compiled from: ImmutableRangeSet.java */
/* loaded from: classes6.dex */
class F1 extends AbstractC37401r1<B3<Comparable>> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f359304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f359305e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B3 f359306f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ G1 f359307g;

    public F1(G1 g12, int i12, int i13, B3 b32) {
        this.f359307g = g12;
        this.f359304d = i12;
        this.f359305e = i13;
        this.f359306f = b32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final Object get(int i12) {
        int i13 = this.f359304d;
        com.google.common.base.M.i(i12, i13);
        int i14 = this.f359305e;
        G1 g12 = this.f359307g;
        return (i12 == 0 || i12 == i13 + (-1)) ? ((B3) g12.f359334b.get(i12 + i14)).e(this.f359306f) : (B3) g12.f359334b.get(i12 + i14);
    }

    @Override // com.google.common.collect.AbstractC37378n1
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f359304d;
    }
}
