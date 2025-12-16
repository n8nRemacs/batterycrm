package com.avito.android.profile_vk_linking.linked_group.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkedGroupActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f231299a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f231300b;

    public b(u uVar, Provider provider) {
        this.f231299a = uVar;
        this.f231300b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.profile_vk_linking.linked_group.c) this.f231299a.get(), this.f231300b.get());
    }
}
