package com.google.common.collect;

import java.util.Map;

/* compiled from: ImmutableMap.java */
/* renamed from: com.google.common.collect.u1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37417u1 extends AbstractC37340h<Object, H1<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f360012b;

    public C37417u1(Map.Entry entry) {
        this.f360012b = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f360012b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object value = this.f360012b.getValue();
        int i12 = H1.f359346d;
        return new C37309b4(value);
    }
}
