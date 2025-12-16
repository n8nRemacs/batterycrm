package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConstructorTabReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f318245a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<lE.g> f318246b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_stats.extended_user_stats.n f318247c;

    /* renamed from: d, reason: collision with root package name */
    public final u f318248d;

    public n(Provider provider, Provider provider2, com.avito.android.user_stats.extended_user_stats.n nVar, u uVar) {
        this.f318245a = provider;
        this.f318246b = provider2;
        this.f318247c = nVar;
        this.f318248d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f318245a.get(), this.f318246b.get(), (com.avito.android.user_stats.extended_user_stats.m) this.f318247c.get(), (QJ0.f) this.f318248d.get());
    }
}
