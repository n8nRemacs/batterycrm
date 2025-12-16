package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;
import zI0.InterfaceC50474d;

/* compiled from: UserAdvertsHeaderModule_ProvideProfileHeaderViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class s implements dagger.internal.h<InterfaceC50474d> {

    /* renamed from: a, reason: collision with root package name */
    public final C35557b f312094a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f312095b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.p f312096c;

    public s(C35557b c35557b, dagger.internal.l lVar, com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.p pVar) {
        this.f312094a = c35557b;
        this.f312095b = lVar;
        this.f312096c = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f312095b.f393949a;
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f312096c));
        this.f312094a.getClass();
        return (InterfaceC50474d) new P0(t02, new C13243a(new i(0, eVarA, h31.e.class, "get", "get()Ljava/lang/Object;", 0))).a(com.avito.android.user_adverts.root_screen.adverts_host.header.mvi.b.class);
    }
}
