package com.avito.android.autoteka.di.landing;

import Mf.C14480a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;

/* compiled from: AutotekaLandingModule_Companion_ProvideComponentsFormsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<C14480a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f96438a;

    public f(u uVar) {
        this.f96438a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = (InterfaceC40691b) this.f96438a.get();
        b.f96428a.getClass();
        return new C14480a(interfaceC40691b.j(), interfaceC40691b.j(), interfaceC40691b.j());
    }
}
