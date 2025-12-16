package com.avito.android.iac_dialer.impl_module.splitter.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacDialerFeaturesModule_ProvideInAppCallsFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f166400a;

    public c(Provider<C34161r> provider) {
        this.f166400a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f166400a.get();
        b.f166399a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
