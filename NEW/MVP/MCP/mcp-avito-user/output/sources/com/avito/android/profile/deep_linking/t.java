package com.avito.android.profile.deep_linking;

import com.avito.android.deep_linking.links.auth.SessionsListLink;
import lv.C43834a;

/* compiled from: ProfileLinkHandlerModule_ProvideSessionsListLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C f221927a;

    public t(C c12) {
        this.f221927a = c12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f221927a;
        n.f221921a.getClass();
        return new C43834a(SessionsListLink.class, null, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SessionsListLink.class), c12));
    }
}
