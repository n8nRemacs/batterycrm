package com.google.common.collect;

import java.util.Map;

/* compiled from: MutableClassToInstanceMap.java */
/* renamed from: com.google.common.collect.n3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37380n3 extends N0<Class<Object>, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f359869b;

    public C37380n3(Map.Entry entry) {
        this.f359869b = entry;
    }

    @Override // com.google.common.collect.N0, com.google.common.collect.S0
    public final Object X() {
        return this.f359869b;
    }

    @Override // com.google.common.collect.N0
    /* renamed from: Y */
    public final Map.Entry<Class<Object>, Object> X() {
        return this.f359869b;
    }

    @Override // com.google.common.collect.N0, java.util.Map.Entry
    @InterfaceC37434x3
    public final Object setValue(@InterfaceC37434x3 Object obj) {
        Class<?> key = getKey();
        Map<Class<?>, Class<?>> map = com.google.common.primitives.q.f360407a;
        key.getClass();
        Class<?> cls = com.google.common.primitives.q.f360407a.get(key);
        if (cls != null) {
            key = cls;
        }
        key.cast(obj);
        return super.setValue(obj);
    }
}
