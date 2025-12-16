package com.avito.android.profile_vk_linking.common.deep_linking.di;

import com.avito.android.profile_vk_linking.common.deep_linking.ProfileVkRequestTokenLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ProfileVkLinkingDeeplinkModule_ProvideProfileVkRequestTokenMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.profile_vk_linking.common.deep_linking.h f230980a;

    public f(com.avito.android.profile_vk_linking.common.deep_linking.h hVar) {
        this.f230980a = hVar;
    }

    public static C43834a a(com.avito.android.profile_vk_linking.common.deep_linking.h hVar) {
        b.f230976a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileVkRequestTokenLink.class, new ProfileVkRequestTokenLink.b(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ProfileVkRequestTokenLink.class), hVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f230980a);
    }
}
