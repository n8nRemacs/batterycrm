package com.avito.android.search.filter.adapter.group_clearance;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupClearanceItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262332a;

    /* renamed from: b, reason: collision with root package name */
    public final u f262333b;

    public i(u uVar, Provider provider) {
        this.f262332a = provider;
        this.f262333b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f262332a.get(), (j) this.f262333b.get());
    }
}
