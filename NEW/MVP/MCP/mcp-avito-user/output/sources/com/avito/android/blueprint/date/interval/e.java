package com.avito.android.blueprint.date.interval;

import com.avito.android.util.D0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishDateIntervalPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<D0> f105466a;

    public e(Provider<D0> provider) {
        this.f105466a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f105466a.get());
    }
}
