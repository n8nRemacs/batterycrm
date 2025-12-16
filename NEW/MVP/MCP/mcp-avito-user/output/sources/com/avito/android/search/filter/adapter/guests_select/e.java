package com.avito.android.search.filter.adapter.guests_select;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GuestsSelectItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262343a;

    public e(Provider<InterfaceC34581l> provider) {
        this.f262343a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f262343a.get());
    }
}
