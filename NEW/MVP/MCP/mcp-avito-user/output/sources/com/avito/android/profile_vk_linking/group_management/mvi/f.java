package com.avito.android.profile_vk_linking.group_management.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VkLinkingGroupManagementActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f231206a;

    public f(u uVar) {
        this.f231206a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.profile_vk_linking.group_management.b) this.f231206a.get());
    }
}
