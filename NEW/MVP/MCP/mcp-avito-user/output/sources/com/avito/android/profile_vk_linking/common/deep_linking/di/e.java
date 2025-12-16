package com.avito.android.profile_vk_linking.common.deep_linking.di;

import com.avito.android.profile_vk_linking.common.deep_linking.ProfileVkLinkingStartLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ProfileVkLinkingDeeplinkModule_ProvideProfileVkLinkingStartMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.common.deep_linking.f f230979a;

    public e(com.avito.android.profile_vk_linking.common.deep_linking.f fVar) {
        this.f230979a = fVar;
    }

    public static C43834a a(com.avito.android.profile_vk_linking.common.deep_linking.f fVar) {
        b.f230976a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileVkLinkingStartLink.class, new ProfileVkLinkingStartLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ProfileVkLinkingStartLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f230979a);
    }
}
