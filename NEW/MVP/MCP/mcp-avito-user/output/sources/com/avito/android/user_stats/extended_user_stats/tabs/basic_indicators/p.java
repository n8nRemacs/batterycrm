package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BasicIndicatorsTabViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317515a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f317516b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f317517c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f317518d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f317519e;

    public p(u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f317515a = uVar;
        this.f317516b = provider;
        this.f317517c = provider2;
        this.f317518d = provider3;
        this.f317519e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.user_stats.b) this.f317515a.get(), this.f317516b.get(), this.f317517c.get(), this.f317518d.get(), this.f317519e.get());
    }
}
