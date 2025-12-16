package com.avito.android.search.filter.adapter.suggest_location;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SuggestLocationItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262605a;

    public i(Provider<InterfaceC34581l> provider) {
        this.f262605a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f262605a.get());
    }
}
