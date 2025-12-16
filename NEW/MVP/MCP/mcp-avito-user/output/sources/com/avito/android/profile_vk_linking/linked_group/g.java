package com.avito.android.profile_vk_linking.linked_group;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: VkLinkedGroupMviViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.linked_group.mvi.g f231291a;

    public g(com.avito.android.profile_vk_linking.linked_group.mvi.g gVar) {
        this.f231291a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.profile_vk_linking.linked_group.mvi.f fVar = (com.avito.android.profile_vk_linking.linked_group.mvi.f) this.f231291a.get();
        i2.f411430a.getClass();
        return new f(fVar, i2.a.f411433c);
    }
}
