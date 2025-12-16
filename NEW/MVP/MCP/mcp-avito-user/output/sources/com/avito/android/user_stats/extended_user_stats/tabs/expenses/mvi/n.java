package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpensesTabReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f317854a;

    /* renamed from: b, reason: collision with root package name */
    public final u f317855b;

    public n(u uVar, Provider provider) {
        this.f317854a = provider;
        this.f317855b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f317854a.get(), (QJ0.f) this.f317855b.get());
    }
}
