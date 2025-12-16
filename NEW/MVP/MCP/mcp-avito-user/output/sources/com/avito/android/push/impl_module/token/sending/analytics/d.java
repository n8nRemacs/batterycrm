package com.avito.android.push.impl_module.token.sending.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.C30214v6;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import fg0.InterfaceC40417a;
import javax.inject.Provider;

/* compiled from: NotificationSystemSettingsLoggerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C30214v6 f246007a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC40417a> f246008b;

    /* renamed from: c, reason: collision with root package name */
    public final I30.b f246009c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f246010d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C> f246011e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<j> f246012f;

    public d(C30214v6 c30214v6, Provider provider, I30.b bVar, dagger.internal.f fVar, Provider provider2, Provider provider3) {
        this.f246007a = c30214v6;
        this.f246008b = provider;
        this.f246009c = bVar;
        this.f246010d = fVar;
        this.f246011e = provider2;
        this.f246012f = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((AK0.l) this.f246007a.get(), this.f246008b.get(), (I30.d) this.f246009c.get(), (InterfaceC28373a) this.f246010d.get(), this.f246011e.get(), this.f246012f.get());
    }
}
