package com.avito.android.onboarding_manager;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineFiltersTooltipShowsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f209425a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f209426b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f209427c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f209425a = uVar;
        this.f209426b = provider;
        this.f209427c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f209425a.get(), this.f209426b.get(), this.f209427c.get());
    }
}
