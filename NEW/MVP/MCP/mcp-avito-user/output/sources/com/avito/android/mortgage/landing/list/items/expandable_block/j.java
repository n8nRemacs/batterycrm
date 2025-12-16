package com.avito.android.mortgage.landing.list.items.expandable_block;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.mortgage.landing.model.LandingArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExpandableBlockVisibilityTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f199715a;

    /* renamed from: b, reason: collision with root package name */
    public final l f199716b;

    public j(l lVar, Provider provider) {
        this.f199715a = provider;
        this.f199716b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f199715a.get(), (LandingArguments) this.f199716b.f393949a);
    }
}
