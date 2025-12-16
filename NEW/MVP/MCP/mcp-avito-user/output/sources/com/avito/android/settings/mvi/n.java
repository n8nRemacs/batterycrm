package com.avito.android.settings.mvi;

import com.avito.android.remote.H;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import jJ.InterfaceC42261a;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: SettingsItemsProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.settings.m f280946a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.lib.util.darkTheme.a> f280947b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.settings.di.f f280948c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<H> f280949d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C> f280950e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f280951f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC42261a> f280952g;

    public n(com.avito.android.settings.m mVar, Provider provider, com.avito.android.settings.di.f fVar, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f280946a = mVar;
        this.f280947b = provider;
        this.f280948c = fVar;
        this.f280949d = provider2;
        this.f280950e = provider3;
        this.f280951f = provider4;
        this.f280952g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.settings.k) this.f280946a.get(), this.f280947b.get(), (String) this.f280948c.get(), this.f280949d.get(), this.f280950e.get(), this.f280951f.get(), this.f280952g.get());
    }
}
