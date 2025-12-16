package com.avito.android.profile_vk_linking.group_management;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VkLinkingGroupManagementMviViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.group_management.mvi.m f231185a;

    public g(com.avito.android.profile_vk_linking.group_management.mvi.m mVar) {
        this.f231185a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile_vk_linking.group_management.mvi.l lVar = (com.avito.android.profile_vk_linking.group_management.mvi.l) this.f231185a.get();
        i2.f411430a.getClass();
        return new f(lVar, i2.a.f411433c);
    }
}
