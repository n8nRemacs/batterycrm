package com.avito.android.advert_item_actions.deeplink;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertItemActionsDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f85853a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert_item_actions.view.c f85854b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert_item_actions.actions.d f85855c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f85856d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f85857e;

    public i(dv.b bVar, com.avito.android.advert_item_actions.view.c cVar, com.avito.android.advert_item_actions.actions.d dVar, dagger.internal.f fVar, Provider provider) {
        this.f85853a = bVar;
        this.f85854b = cVar;
        this.f85855c = dVar;
        this.f85856d = fVar;
        this.f85857e = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.d dVar = (a.d) this.f85853a.get();
        this.f85854b.getClass();
        return new f(dVar, new com.avito.android.advert_item_actions.view.b(), (La.c) this.f85855c.get(), (InterfaceC28373a) this.f85856d.get(), this.f85857e.get());
    }
}
