package com.avito.android.order.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OrderLinkDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final S40.c f209465a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f209466b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f209467c;

    public e(S40.c cVar, dv.b bVar, com.avito.android.navigation.c cVar2) {
        this.f209465a = cVar;
        this.f209466b = bVar;
        this.f209467c = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((S40.a) this.f209465a.get(), (a.InterfaceC4053a) this.f209466b.get(), (com.avito.android.navigation.a) this.f209467c.get());
    }
}
