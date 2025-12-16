package com.google.common.collect;

import com.google.common.collect.M2;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class B2 extends AbstractC37340h<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f359262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2.g f359263c;

    public B2(Map.Entry entry, M2.g gVar) {
        this.f359262b = entry;
        this.f359263c = gVar;
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public final Object getKey() {
        return this.f359262b.getKey();
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public final Object getValue() {
        Map.Entry entry = this.f359262b;
        return this.f359263c.a(entry.getKey(), entry.getValue());
    }
}
