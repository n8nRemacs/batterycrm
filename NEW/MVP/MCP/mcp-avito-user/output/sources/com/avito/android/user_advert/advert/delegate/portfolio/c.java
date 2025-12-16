package com.avito.android.user_advert.advert.delegate.portfolio;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import rH0.C47546c;
import rH0.InterfaceC47544a;

/* compiled from: PortfolioWidgetPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308768a;

    /* renamed from: b, reason: collision with root package name */
    public final C47546c f308769b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_advert.advert.delegate.portfolio.domain.c f308770c;

    /* renamed from: d, reason: collision with root package name */
    public final u f308771d;

    public c(u uVar, C47546c c47546c, com.avito.android.user_advert.advert.delegate.portfolio.domain.c cVar, u uVar2) {
        this.f308768a = uVar;
        this.f308769b = c47546c;
        this.f308770c = cVar;
        this.f308771d = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.deeplink_handler.handler.composite.a) this.f308768a.get(), (InterfaceC47544a) this.f308769b.get(), (com.avito.android.user_advert.advert.delegate.portfolio.domain.b) this.f308770c.get(), (R0) this.f308771d.get());
    }
}
