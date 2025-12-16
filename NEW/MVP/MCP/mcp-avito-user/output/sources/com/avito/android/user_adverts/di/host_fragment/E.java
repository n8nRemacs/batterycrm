package com.avito.android.user_adverts.di.host_fragment;

import Cd.C13243a;
import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.X;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0;

/* compiled from: UserAdvertsHostFragmentModule_ProvideShortcutsViewModelFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class E implements dagger.internal.h<e0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f311952a;

    /* renamed from: b, reason: collision with root package name */
    public final X f311953b;

    public E(dagger.internal.l lVar, X x12) {
        this.f311952a = lVar;
        this.f311953b = x12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        T0 t02 = (T0) this.f311952a.f393949a;
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f311953b));
        C.f311950a.getClass();
        return (e0) new P0(t02, new C13243a(new D(eVarA))).a(e0.class);
    }
}
