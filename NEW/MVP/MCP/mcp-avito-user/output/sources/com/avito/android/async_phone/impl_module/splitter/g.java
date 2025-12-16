package com.avito.android.async_phone.impl_module.splitter;

import com.avito.android.C34161r;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AsyncPhoneInternalFeaturesModule_ProvideAsyncPhoneInternalFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f92205a;

    public g(Provider<C34161r> provider) {
        this.f92205a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f92205a.get();
        f.f92204a.getClass();
        return (d) c34161r.f246393a.b(d.class);
    }
}
