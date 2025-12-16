package com.avito.android.profile_vk_linking.start.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VkLinkingStartActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f231453a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f231454b;

    public e(u uVar, Provider provider) {
        this.f231453a = uVar;
        this.f231454b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.profile_vk_linking.start.b) this.f231453a.get(), this.f231454b.get());
    }
}
