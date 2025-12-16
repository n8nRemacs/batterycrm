package com.avito.android.order.deeplink.v2;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RedesignedOrderDeeplinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final T40.c f209474a;

    /* renamed from: b, reason: collision with root package name */
    public final S40.c f209475b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f209476c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.navigation.c f209477d;

    /* renamed from: e, reason: collision with root package name */
    public final dD.d f209478e;

    public b(T40.c cVar, S40.c cVar2, dv.b bVar, com.avito.android.navigation.c cVar3, dD.d dVar) {
        this.f209474a = cVar;
        this.f209475b = cVar2;
        this.f209476c = bVar;
        this.f209477d = cVar3;
        this.f209478e = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((T40.a) this.f209474a.get(), (S40.a) this.f209475b.get(), (a.InterfaceC4053a) this.f209476c.get(), (com.avito.android.navigation.a) this.f209477d.get(), (dD.b) this.f209478e.get());
    }
}
