package com.avito.android.vas_planning.item.radio;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasPlanningRadioPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f322399a;

    public g(Provider<a> provider) {
        this.f322399a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f322399a.get());
    }
}
