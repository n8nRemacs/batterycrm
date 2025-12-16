package com.google.common.collect;

import com.google.common.collect.C37425w;

/* compiled from: ArrayTable.java */
/* renamed from: com.google.common.collect.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37435y extends AbstractC37340h<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37425w.c f360072c;

    public C37435y(C37425w.c cVar, int i12) {
        this.f360072c = cVar;
        this.f360071b = i12;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        C37425w.c cVar = this.f360072c;
        return cVar.f360047b.keySet().b().get(this.f360071b);
    }

    @Override // java.util.Map.Entry
    @InterfaceC37434x3
    public final Object getValue() {
        return this.f360072c.c(this.f360071b);
    }

    @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
    @InterfaceC37434x3
    public final Object setValue(@InterfaceC37434x3 Object obj) {
        this.f360072c.d(obj);
        throw null;
    }
}
