package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.C37325e2;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Iterables.java */
/* loaded from: classes6.dex */
class X1 extends AbstractC37431x0<Object> {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection f359600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC37276u f359601d;

    public X1(Collection collection, InterfaceC37276u interfaceC37276u) {
        this.f359600c = collection;
        this.f359601d = interfaceC37276u;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new C37325e2.c(this.f359600c.iterator(), this.f359601d);
    }
}
