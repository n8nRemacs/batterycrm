package com.avito.android.search.filter.adapter.checkboxWithBadge;

import com.avito.android.search.filter.InterfaceC34581l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckBoxWithBadgeItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34581l> f262133a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f262134b;

    public h(Provider<InterfaceC34581l> provider, Provider<com.avito.android.deeplink_handler.handler.composite.a> provider2) {
        this.f262133a = provider;
        this.f262134b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f262134b.get(), this.f262133a.get());
    }
}
