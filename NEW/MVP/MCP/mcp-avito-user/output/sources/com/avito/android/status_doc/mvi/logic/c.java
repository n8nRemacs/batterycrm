package com.avito.android.status_doc.mvi.logic;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigStatusDocActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f284938a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f284939b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f284940c;

    public c(u uVar, Provider provider, Provider provider2) {
        this.f284938a = uVar;
        this.f284939b = provider;
        this.f284940c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.status_doc.mvi.interactor.a) this.f284938a.get(), this.f284939b.get(), this.f284940c.get());
    }
}
