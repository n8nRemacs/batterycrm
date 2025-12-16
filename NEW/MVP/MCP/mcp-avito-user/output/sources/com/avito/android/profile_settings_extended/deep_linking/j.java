package com.avito.android.profile_settings_extended.deep_linking;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.profile_settings_extended.C33474h;
import com.avito.android.profile_settings_extended.InterfaceC33472f;
import com.avito.android.remote.analytics.n;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileDisableExtendedLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final C33474h f230076a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f230077b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f230078c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f230079d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f230080e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<E> f230081f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<n> f230082g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<R0> f230083h;

    public j(C33474h c33474h, dv.b bVar, dv.b bVar2, dv.b bVar3, dagger.internal.f fVar, Provider provider, Provider provider2, Provider provider3) {
        this.f230076a = c33474h;
        this.f230077b = bVar;
        this.f230078c = bVar2;
        this.f230079d = bVar3;
        this.f230080e = fVar;
        this.f230081f = provider;
        this.f230082g = provider2;
        this.f230083h = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((InterfaceC33472f) this.f230076a.get(), (a.g) this.f230077b.get(), (a.i) this.f230078c.get(), (a.d) this.f230079d.get(), (InterfaceC28373a) this.f230080e.get(), this.f230081f.get(), this.f230082g.get(), this.f230083h.get());
    }
}
