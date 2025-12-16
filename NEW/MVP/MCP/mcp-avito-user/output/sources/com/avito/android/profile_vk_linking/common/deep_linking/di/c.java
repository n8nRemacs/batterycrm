package com.avito.android.profile_vk_linking.common.deep_linking.di;

import com.avito.android.profile_vk_linking.common.deep_linking.ProfileVkLinkingGroupManagementLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ProfileVkLinkingDeeplinkModule_ProvideProfileVkGroupManagementMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.common.deep_linking.d f230977a;

    public c(com.avito.android.profile_vk_linking.common.deep_linking.d dVar) {
        this.f230977a = dVar;
    }

    public static C43834a a(com.avito.android.profile_vk_linking.common.deep_linking.d dVar) {
        b.f230976a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileVkLinkingGroupManagementLink.class, new ProfileVkLinkingGroupManagementLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ProfileVkLinkingGroupManagementLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f230977a);
    }
}
