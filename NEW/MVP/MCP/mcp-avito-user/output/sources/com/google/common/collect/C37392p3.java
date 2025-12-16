package com.google.common.collect;

import bZ0.InterfaceC25601b;
import java.io.Serializable;

/* compiled from: NaturalOrdering.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.p3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37392p3 extends AbstractC37429w3<Comparable<?>> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C37392p3 f359948d = new C37392p3();
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient AbstractC37429w3<Comparable<?>> f359949b;

    /* renamed from: c, reason: collision with root package name */
    @I41.a
    @InterfaceC25601b
    public transient AbstractC37429w3<Comparable<?>> f359950c;

    private Object readResolve() {
        return f359948d;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S extends Comparable<?>> AbstractC37429w3<S> e() {
        AbstractC37429w3<S> abstractC37429w3 = (AbstractC37429w3<S>) this.f359949b;
        if (abstractC37429w3 != null) {
            return abstractC37429w3;
        }
        C37403r3 c37403r3 = new C37403r3(this);
        this.f359949b = c37403r3;
        return c37403r3;
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S extends Comparable<?>> AbstractC37429w3<S> f() {
        AbstractC37429w3<S> abstractC37429w3 = (AbstractC37429w3<S>) this.f359950c;
        if (abstractC37429w3 != null) {
            return abstractC37429w3;
        }
        C37409s3 c37409s3 = new C37409s3(this);
        this.f359950c = c37409s3;
        return c37409s3;
    }

    @Override // com.google.common.collect.AbstractC37429w3
    public final <S extends Comparable<?>> AbstractC37429w3<S> h() {
        return P3.f359543b;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
