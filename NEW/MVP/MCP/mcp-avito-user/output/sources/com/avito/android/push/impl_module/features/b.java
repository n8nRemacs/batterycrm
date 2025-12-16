package com.avito.android.push.impl_module.features;

import Zf0.C19552a;
import com.avito.android.C34161r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PushFeaturesModule_ProvidePushFeaturesFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<C19552a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f245975a;

    public b(Provider<C34161r> provider) {
        this.f245975a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f245975a.get();
        a.f245974a.getClass();
        return (C19552a) c34161r.f246393a.b(C19552a.class);
    }
}
