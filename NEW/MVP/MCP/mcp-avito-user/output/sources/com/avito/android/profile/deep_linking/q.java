package com.avito.android.profile.deep_linking;

import com.avito.android.deep_linking.links.ProfileLink;
import lv.C43834a;

/* compiled from: ProfileLinkHandlerModule_ProvideProfileLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class q implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final v f221924a;

    public q(v vVar) {
        this.f221924a = vVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        v vVar = this.f221924a;
        n.f221921a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ProfileLink.class, new ProfileLink.b(), new C43834a.b.C11809b(vVar));
    }
}
