package com.google.common.collect;

import com.google.common.collect.C37325e2;

/* compiled from: ImmutableMultimap.java */
/* renamed from: com.google.common.collect.z1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37452z1 extends N4<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final N4 f360150b;

    /* renamed from: c, reason: collision with root package name */
    public N4 f360151c = C37325e2.d.f359709e;

    public C37452z1(AbstractC37437y1 abstractC37437y1) {
        this.f360150b = abstractC37437y1.f360073g.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f360151c.hasNext() || this.f360150b.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f360151c.hasNext()) {
            this.f360151c = ((AbstractC37378n1) this.f360150b.next()).iterator();
        }
        return this.f360151c.next();
    }
}
