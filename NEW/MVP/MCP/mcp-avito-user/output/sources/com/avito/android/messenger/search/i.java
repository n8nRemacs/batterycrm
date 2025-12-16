package com.avito.android.messenger.search;

import com.avito.android.messenger.search.InterfaceC32569e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class i implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f197158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32569e.b f197159c;

    public /* synthetic */ i(InterfaceC32569e.b bVar, int i12) {
        this.f197158b = i12;
        this.f197159c = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f197158b) {
            case 0:
                return InterfaceC32569e.b.c.e((InterfaceC32569e.b.c) this.f197159c, null, null, new InterfaceC32569e.b.d.a(com.avito.android.messenger.util.q.a(th2)), 15);
            default:
                return this.f197159c;
        }
    }
}
