package com.google.common.collect;

import com.google.common.collect.C37326e3;
import com.google.common.collect.W2;
import java.util.Map;

/* compiled from: MultimapBuilder.java */
/* loaded from: classes6.dex */
class X2 extends W2.f<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W2.g f359602a;

    public X2(W2.g gVar) {
        this.f359602a = gVar;
    }

    @Override // com.google.common.collect.W2.f
    public final <K, V> InterfaceC37408s2<K, V> c() {
        Map mapB = this.f359602a.b();
        W2.a aVar = new W2.a();
        C37326e3.b bVar = new C37326e3.b(mapB);
        bVar.f359722i = aVar;
        return bVar;
    }
}
