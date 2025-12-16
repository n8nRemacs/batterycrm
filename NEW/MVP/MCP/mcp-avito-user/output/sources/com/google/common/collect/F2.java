package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class F2 extends z4<Object, Map.Entry<Object, Object>> {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC37276u f359308c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(Iterator it, InterfaceC37276u interfaceC37276u) {
        super(it);
        this.f359308c = interfaceC37276u;
    }

    @Override // com.google.common.collect.z4
    public final Map.Entry<Object, Object> a(@InterfaceC37434x3 Object obj) {
        return new C37384o1(obj, this.f359308c.apply(obj));
    }
}
