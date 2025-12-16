package com.avito.android.vas_planning_checkout.item.result_warning;

import com.avito.android.deep_linking.links.w;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanningResultWarningItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w> f322999a;

    public e(Provider<w> provider) {
        this.f322999a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f322999a.get());
    }
}
