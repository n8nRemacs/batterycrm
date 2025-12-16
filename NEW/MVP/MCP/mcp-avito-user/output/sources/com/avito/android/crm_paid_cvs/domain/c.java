package com.avito.android.crm_paid_cvs.domain;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import sP.InterfaceC48087a;

/* compiled from: FavoritesInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48087a> f130300a;

    public c(Provider<InterfaceC48087a> provider) {
        this.f130300a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f130300a.get());
    }
}
