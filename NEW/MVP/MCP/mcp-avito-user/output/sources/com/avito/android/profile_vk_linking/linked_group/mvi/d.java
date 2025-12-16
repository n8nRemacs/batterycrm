package com.avito.android.profile_vk_linking.linked_group.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VkLinkedGroupBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f231302a;

    public d(u uVar) {
        this.f231302a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.profile_vk_linking.linked_group.c) this.f231302a.get());
    }
}
