package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class K2 extends N4<Map.Entry<Object, Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f359439b;

    public K2(Iterator it) {
        this.f359439b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f359439b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f359439b.next();
        entry.getClass();
        return new J2(entry);
    }
}
