package com.avito.android.profile_vk_linking.group_management.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkingGroupManagementBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final u f231216a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f231217b;

    public j(u uVar, Provider provider) {
        this.f231216a = uVar;
        this.f231217b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((com.avito.android.profile_vk_linking.group_management.b) this.f231216a.get(), this.f231217b.get());
    }
}
