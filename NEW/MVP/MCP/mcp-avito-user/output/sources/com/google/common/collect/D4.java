package com.google.common.collect;

import com.google.common.collect.C37374m3;
import com.google.common.collect.E4;

/* compiled from: TreeMultiset.java */
/* loaded from: classes6.dex */
class D4 extends C37374m3.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E4.e f359283b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E4 f359284c;

    public D4(E4 e42, E4.e eVar) {
        this.f359284c = e42;
        this.f359283b = eVar;
    }

    @Override // com.google.common.collect.InterfaceC37338g3.a
    @InterfaceC37434x3
    public final Object a() {
        return this.f359283b.f359300a;
    }

    @Override // com.google.common.collect.InterfaceC37338g3.a
    public final int getCount() {
        int i12 = this.f359283b.f359301b;
        if (i12 != 0) {
            return i12;
        }
        this.f359284c.getClass();
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }
}
