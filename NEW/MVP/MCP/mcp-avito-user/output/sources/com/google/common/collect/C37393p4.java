package com.google.common.collect;

import java.util.Map;

/* compiled from: StandardTable.java */
/* renamed from: com.google.common.collect.p4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37393p4 extends N0<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f359951b;

    public C37393p4(Map.Entry entry) {
        this.f359951b = entry;
    }

    @Override // com.google.common.collect.N0, com.google.common.collect.S0
    public final Object X() {
        return this.f359951b;
    }

    @Override // com.google.common.collect.N0
    /* renamed from: Y */
    public final Map.Entry<Object, Object> X() {
        return this.f359951b;
    }

    @Override // com.google.common.collect.N0, java.util.Map.Entry
    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return com.google.common.base.F.a(getKey(), entry.getKey()) && com.google.common.base.F.a(getValue(), entry.getValue());
    }

    @Override // com.google.common.collect.N0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        return super.setValue(obj);
    }
}
