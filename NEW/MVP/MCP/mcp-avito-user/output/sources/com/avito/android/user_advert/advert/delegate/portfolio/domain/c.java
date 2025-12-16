package com.avito.android.user_advert.advert.delegate.portfolio.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import mv0.InterfaceC44141a;

/* compiled from: ServicesPortfolioWidgetToggleInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308776a;

    public c(u uVar) {
        this.f308776a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC44141a) this.f308776a.get());
    }
}
