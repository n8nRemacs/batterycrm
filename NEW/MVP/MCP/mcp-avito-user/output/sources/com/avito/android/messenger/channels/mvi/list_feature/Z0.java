package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.persistence.messenger.C33126v0;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsListActorSubscriptions_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Z0 implements dagger.internal.h<W> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.w0> f187908a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f187909b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.data.M> f187910c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.service.user_last_activity.a> f187911d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f187912e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f187913f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f187914g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<C30277e1> f187915h;

    /* renamed from: i, reason: collision with root package name */
    public final dagger.internal.l f187916i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f187917j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.interactor.I f187918k;

    /* renamed from: l, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.filter.j> f187919l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<WY.a> f187920m;

    public Z0(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, dagger.internal.l lVar, dagger.internal.l lVar2, com.avito.android.messenger.channels.mvi.interactor.I i12, Provider provider9, Provider provider10) {
        this.f187908a = provider;
        this.f187909b = provider2;
        this.f187910c = provider3;
        this.f187911d = provider4;
        this.f187912e = provider5;
        this.f187913f = provider6;
        this.f187914g = provider7;
        this.f187915h = provider8;
        this.f187916i = lVar;
        this.f187917j = lVar2;
        this.f187918k = i12;
        this.f187919l = provider9;
        this.f187920m = provider10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new W(this.f187908a.get(), this.f187909b.get(), this.f187910c.get(), this.f187911d.get(), this.f187912e.get(), this.f187913f.get(), this.f187914g.get(), this.f187915h.get(), (C33126v0) this.f187916i.f393949a, (C33126v0) this.f187917j.f393949a, (com.avito.android.messenger.channels.mvi.interactor.A) this.f187918k.get(), this.f187919l.get(), dagger.internal.g.b(this.f187920m));
    }
}
