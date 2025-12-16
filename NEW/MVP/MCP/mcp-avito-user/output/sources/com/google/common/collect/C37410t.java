package com.google.common.collect;

import java.io.Serializable;

/* compiled from: AllEqualOrdering.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37410t extends AbstractC37429w3<Object> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final C37410t f359995b = new C37410t();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f359995b;
    }

    @Override // java.util.Comparator
    public final int compare(@I41.a Object obj, @I41.a Object obj2) {
        return 0;
    }

    public final String toString() {
        return "Ordering.allEqual()";
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S> AbstractC37429w3<S> h() {
        return this;
    }
}
