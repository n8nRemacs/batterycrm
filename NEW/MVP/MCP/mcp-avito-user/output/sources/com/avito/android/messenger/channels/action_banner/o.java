package com.avito.android.messenger.channels.action_banner;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import jM.InterfaceC42283a;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsListBannerInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f186768a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f186769b;

    /* renamed from: c, reason: collision with root package name */
    public final I30.b f186770c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC42283a> f186771d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f186772e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f186773f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.filter.j> f186774g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.f f186775h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<C> f186776i;

    /* renamed from: j, reason: collision with root package name */
    public final Provider<JY.a> f186777j;

    public o(Provider provider, Provider provider2, I30.b bVar, Provider provider3, dagger.internal.f fVar, Provider provider4, Provider provider5, dagger.internal.f fVar2, Provider provider6, Provider provider7) {
        this.f186768a = provider;
        this.f186769b = provider2;
        this.f186770c = bVar;
        this.f186771d = provider3;
        this.f186772e = fVar;
        this.f186773f = provider4;
        this.f186774g = provider5;
        this.f186775h = fVar2;
        this.f186776i = provider6;
        this.f186777j = provider7;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f186768a.get(), this.f186769b.get(), (I30.d) this.f186770c.get(), this.f186771d.get(), (InterfaceC47842z) this.f186772e.get(), this.f186773f.get(), this.f186774g.get(), (InterfaceC28373a) this.f186775h.get(), this.f186776i.get(), this.f186777j.get());
    }
}
