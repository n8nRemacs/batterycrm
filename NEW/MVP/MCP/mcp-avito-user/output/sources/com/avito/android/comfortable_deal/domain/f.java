package com.avito.android.comfortable_deal.domain;

import cp.InterfaceC39387a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SendPhoneInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC39387a> f122019a;

    public f(Provider<InterfaceC39387a> provider) {
        this.f122019a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f122019a.get());
    }
}
