package com.avito.android.search.filter.adapter.inline_multiselect;

import com.avito.android.search.filter.InterfaceC34566e0;
import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineMultiselectItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262376a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f262377b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f262376a = provider;
        this.f262377b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f262376a.get(), (InterfaceC34566e0.b) this.f262377b.f393949a);
    }
}
