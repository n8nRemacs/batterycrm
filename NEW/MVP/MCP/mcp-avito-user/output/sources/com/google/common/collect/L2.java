package com.google.common.collect;

import com.google.common.base.InterfaceC37276u;
import com.google.common.collect.M2;

/* compiled from: Maps.java */
/* loaded from: classes6.dex */
class L2 implements M2.g<Object, Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC37276u f359466b;

    public L2(InterfaceC37276u interfaceC37276u) {
        this.f359466b = interfaceC37276u;
    }

    @Override // com.google.common.collect.M2.g
    @InterfaceC37434x3
    public final Object a(@InterfaceC37434x3 Object obj, @InterfaceC37434x3 Object obj2) {
        return this.f359466b.apply(obj2);
    }
}
