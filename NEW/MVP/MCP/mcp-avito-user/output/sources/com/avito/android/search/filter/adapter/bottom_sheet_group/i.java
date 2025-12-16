package com.avito.android.search.filter.adapter.bottom_sheet_group;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BottomSheetGroupItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262021a;

    /* renamed from: b, reason: collision with root package name */
    public final u f262022b;

    public i(u uVar, Provider provider) {
        this.f262021a = provider;
        this.f262022b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f262021a.get(), (l) this.f262022b.get());
    }
}
