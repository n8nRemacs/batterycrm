package com.google.common.collect;

import com.google.common.collect.M2;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class N2 extends M2.f<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M2.AbstractC37296d f359526b;

    public N2(M2.AbstractC37296d abstractC37296d) {
        this.f359526b = abstractC37296d;
    }

    @Override // com.google.common.collect.M2.f
    public final Map<Object, Object> e() {
        return this.f359526b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return this.f359526b.a0();
    }
}
