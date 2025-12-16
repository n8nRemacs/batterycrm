package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.M2;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class A2 implements InterfaceC37276u<Map.Entry<Object, Object>, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M2.g f359259b;

    public A2(M2.g gVar) {
        this.f359259b = gVar;
    }

    @Override // com.google.common.base.InterfaceC37276u
    @InterfaceC37434x3
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getKey();
        return ((L2) this.f359259b).f359466b.apply(entry.getValue());
    }
}
