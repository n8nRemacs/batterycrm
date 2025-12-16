package com.avito.android.profile.deep_linking;

import com.avito.android.deep_linking.links.auth.ProfileTfaSettingsLink;
import lv.C43834a;

/* compiled from: ProfileLinkHandlerModule_ProvideProfileTfaSettingsLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final x f221925a;

    public r(x xVar) {
        this.f221925a = xVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        x xVar = this.f221925a;
        n.f221921a.getClass();
        return new C43834a(ProfileTfaSettingsLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ProfileTfaSettingsLink.class), xVar));
    }
}
