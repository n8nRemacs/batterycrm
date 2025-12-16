package com.avito.android.status_doc.mvi.interactor;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.H;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigStatusDocInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<WG.a> f284927a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f284928b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f284929c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<H> f284930d;

    public d(Provider<WG.a> provider, Provider<InterfaceC28373a> provider2, Provider<E> provider3, Provider<H> provider4) {
        this.f284927a = provider;
        this.f284928b = provider2;
        this.f284929c = provider3;
        this.f284930d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f284927a.get(), this.f284928b.get(), this.f284929c.get(), this.f284930d.get());
    }
}
