package com.avito.android.registration_self_employment_redirect_screen.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelfEmploymentRedirectModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.registration_self_employment_redirect_screen.steps_list.b f252722a;

    public f(com.avito.android.registration_self_employment_redirect_screen.steps_list.b bVar) {
        this.f252722a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.registration_self_employment_redirect_screen.steps_list.a aVar = (com.avito.android.registration_self_employment_redirect_screen.steps_list.a) this.f252722a.get();
        e.f252721a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
