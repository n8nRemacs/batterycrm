package com.avito.android.search.filter.adapter.keywords;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: KeywordsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262482a;

    public r(Provider<InterfaceC34581l> provider) {
        this.f262482a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f262482a.get());
    }
}
