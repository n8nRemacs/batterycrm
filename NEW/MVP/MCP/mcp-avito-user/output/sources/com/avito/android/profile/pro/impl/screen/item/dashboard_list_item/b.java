package com.avito.android.profile.pro.impl.screen.item.dashboard_list_item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileOtherDashboardBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f223134a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f223135b;

    public b(e eVar, Provider provider) {
        this.f223134a = eVar;
        this.f223135b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f223134a.get(), this.f223135b.get());
    }
}
