package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpensesTabActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317806a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f317807b;

    public d(u uVar, Provider provider) {
        this.f317806a = uVar;
        this.f317807b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.user_stats.b) this.f317806a.get(), this.f317807b.get());
    }
}
