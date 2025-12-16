package com.avito.android.profile_vk_linking.linked_group.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkedGroupReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f231314a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<E> f231315b;

    public k(Provider<InterfaceC28373a> provider, Provider<E> provider2) {
        this.f231314a = provider;
        this.f231315b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f231315b.get(), this.f231314a.get());
    }
}
