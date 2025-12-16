package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;
import uI0.C48906b;
import uI0.C48907c;
import uI0.InterfaceC48905a;

/* compiled from: UserAdvertsHeaderModule_ProvideAppRaterViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<InterfaceC48905a> {

    /* renamed from: a, reason: collision with root package name */
    public final C35557b f312076a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312077b;

    /* renamed from: c, reason: collision with root package name */
    public final C48907c f312078c;

    public m(C35557b c35557b, dagger.internal.l lVar, C48907c c48907c) {
        this.f312076a = c35557b;
        this.f312077b = lVar;
        this.f312078c = c48907c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312077b.f393949a;
        C48906b c48906b = (C48906b) this.f312078c.get();
        this.f312076a.getClass();
        return (InterfaceC48905a) new P0(t02, new C13243a(new C35558c(c48906b))).a(C48906b.class);
    }
}
