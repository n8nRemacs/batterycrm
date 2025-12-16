package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* compiled from: EmptyImmutableSetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37347i0 extends I1<Object, Object> {

    /* renamed from: k, reason: collision with root package name */
    public static final C37347i0 f359798k = new C37347i0();
    private static final long serialVersionUID = 0;

    public C37347i0() {
        super(J3.f359405h, 0);
    }

    private Object readResolve() {
        return f359798k;
    }

    @Override // com.google.common.collect.AbstractC37437y1, com.google.common.collect.AbstractC37346i, com.google.common.collect.R2
    public final Map V() {
        return this.f360073g;
    }

    @Override // com.google.common.collect.AbstractC37437y1
    /* renamed from: k */
    public final AbstractC37412t1<Object, Collection<Object>> V() {
        return this.f360073g;
    }
}
