package com.avito.android.timestamp_storage.di;

import com.avito.android.C34161r;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TimestampFeaturesModule_ProvideTimestampFeaturesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<BE0.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C34161r> f301482a;

    public b(Provider<C34161r> provider) {
        this.f301482a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f301482a.get();
        a.f301481a.getClass();
        return (BE0.a) c34161r.f246393a.b(BE0.a.class);
    }
}
