package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.M2;
import java.util.Map;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class C2 implements InterfaceC37276u<Map.Entry<Object, Object>, Map.Entry<Object, Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M2.g f359279b;

    public C2(M2.g gVar) {
        this.f359279b = gVar;
    }

    @Override // com.google.common.base.InterfaceC37276u
    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        M2.g gVar = this.f359279b;
        gVar.getClass();
        entry.getClass();
        return new B2(entry, gVar);
    }
}
