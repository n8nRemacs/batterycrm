package com.avito.android.iac_util_deeplinks.impl_module.splitter.features;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacUtilDeeplinksFeaturesModule_ProvideInAppCallsFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f169225a;

    public c(Provider<C34161r> provider) {
        this.f169225a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f169225a.get();
        b.f169224a.getClass();
        return (a) c34161r.f246393a.b(a.class);
    }
}
