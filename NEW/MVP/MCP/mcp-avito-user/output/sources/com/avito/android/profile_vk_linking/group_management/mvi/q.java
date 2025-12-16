package com.avito.android.profile_vk_linking.group_management.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkingGroupManagementReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f231229a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f231230b;

    public q(Provider<InterfaceC28373a> provider, Provider<E> provider2) {
        this.f231229a = provider;
        this.f231230b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f231230b.get(), this.f231229a.get());
    }
}
