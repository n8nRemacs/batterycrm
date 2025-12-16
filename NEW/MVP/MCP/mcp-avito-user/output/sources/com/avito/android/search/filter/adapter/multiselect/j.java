package com.avito.android.search.filter.adapter.multiselect;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiselectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262549a;

    public j(Provider<InterfaceC34581l> provider) {
        this.f262549a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f262549a.get());
    }
}
