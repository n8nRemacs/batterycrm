package com.avito.android.search.filter.adapter.bottom_sheet_group;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BottomSheetGroupOnboardingInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AK0.l> f262031a;

    public n(Provider<AK0.l> provider) {
        this.f262031a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f262031a.get());
    }
}
