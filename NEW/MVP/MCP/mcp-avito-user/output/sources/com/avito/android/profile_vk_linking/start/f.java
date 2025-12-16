package com.avito.android.profile_vk_linking.start;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VkLinkingStartMviViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.start.mvi.m f231440a;

    public f(com.avito.android.profile_vk_linking.start.mvi.m mVar) {
        this.f231440a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile_vk_linking.start.mvi.l lVar = (com.avito.android.profile_vk_linking.start.mvi.l) this.f231440a.get();
        i2.f411430a.getClass();
        return new e(lVar, i2.a.f411433c);
    }
}
