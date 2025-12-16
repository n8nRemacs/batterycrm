package com.avito.android.safety.sessions.social_logout;

import com.avito.android.account.E;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safety.sessions.social_logout.i;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SessionsSocialLogoutPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f258055a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f258056b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f258057c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<s> f258058d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f258059e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f258060f;

    public r(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f258055a = provider;
        this.f258056b = lVar;
        this.f258057c = provider2;
        this.f258058d = provider3;
        this.f258059e = provider4;
        this.f258060f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f258055a.get(), (i.b) this.f258056b.f393949a, this.f258057c.get(), this.f258058d.get(), this.f258059e.get(), (ScreenPerformanceTracker) this.f258060f.get());
    }
}
