package com.avito.android.authorization.select_social.di;

import com.avito.android.authorization.select_social.adapter.k;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectSocialModule_ProvideItemBinder$_avito_authorization_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.authorization.select_social.adapter.a> f94529a;

    /* renamed from: b, reason: collision with root package name */
    public final u f94530b;

    public g(u uVar, Provider provider) {
        this.f94529a = provider;
        this.f94530b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.authorization.select_social.adapter.a aVar = this.f94529a.get();
        k kVar = (k) this.f94530b.get();
        int i12 = d.f94526a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(kVar);
        return c10493a.a();
    }
}
