package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorTabActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f318164a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f318165b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<lE.g> f318166c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f318164a = uVar;
        this.f318165b = provider;
        this.f318166c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.user_stats.b) this.f318164a.get(), this.f318165b.get(), this.f318166c.get());
    }
}
