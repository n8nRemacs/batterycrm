package com.google.common.collect;

import com.google.common.collect.InterfaceC37338g3;
import java.util.Iterator;

/* compiled from: AbstractSortedMultiset.java */
/* renamed from: com.google.common.collect.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37388p extends AbstractC37317d0<Object> {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC37394q f359905e;

    public C37388p(AbstractC37394q abstractC37394q) {
        this.f359905e = abstractC37394q;
    }

    @Override // com.google.common.collect.AbstractC37317d0
    public final Iterator<InterfaceC37338g3.a<Object>> c0() {
        return this.f359905e.i();
    }

    @Override // com.google.common.collect.AbstractC37317d0
    public final InterfaceC37345h4<Object> d0() {
        return this.f359905e;
    }

    @Override // com.google.common.collect.AbstractC37317d0, com.google.common.collect.B0, java.util.Collection, java.lang.Iterable
    public final Iterator<Object> iterator() {
        return C37374m3.c(this.f359905e.d1());
    }
}
