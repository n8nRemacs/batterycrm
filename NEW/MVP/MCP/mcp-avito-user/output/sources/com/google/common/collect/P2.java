package com.google.common.collect;

import com.google.common.collect.M2;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class P2 extends N0<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f359541b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2.i.a.C10663a f359542c;

    public P2(M2.i.a.C10663a c10663a, Map.Entry entry) {
        this.f359542c = c10663a;
        this.f359541b = entry;
    }

    @Override // com.google.common.collect.N0, com.google.common.collect.S0
    public final Object X() {
        return this.f359541b;
    }

    @Override // com.google.common.collect.N0
    /* renamed from: Y */
    public final Map.Entry<Object, Object> X() {
        return this.f359541b;
    }

    @Override // com.google.common.collect.N0, java.util.Map.Entry
    @InterfaceC37434x3
    public final Object setValue(@InterfaceC37434x3 Object obj) {
        com.google.common.base.M.g(M2.i.this.d(getKey(), obj));
        return super.setValue(obj);
    }
}
