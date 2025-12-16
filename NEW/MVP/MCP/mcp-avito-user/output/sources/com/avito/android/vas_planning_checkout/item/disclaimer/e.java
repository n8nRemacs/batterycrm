package com.avito.android.vas_planning_checkout.item.disclaimer;

import com.avito.android.deep_linking.links.w;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanningDisclaimerItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<w> f322961a;

    public e(Provider<w> provider) {
        this.f322961a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f322961a.get());
    }
}
