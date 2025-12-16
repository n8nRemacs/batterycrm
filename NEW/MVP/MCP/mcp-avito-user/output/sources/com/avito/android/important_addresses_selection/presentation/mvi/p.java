package com.avito.android.important_addresses_selection.presentation.mvi;

import com.avito.android.J0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImportantAddressesSelectionViewStateBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<J0> f169898a;

    public p(Provider<J0> provider) {
        this.f169898a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f169898a.get());
    }
}
