package com.avito.android.profile.deep_linking;

import com.avito.android.deep_linking.links.EditProfileLink;
import lv.C43834a;

/* compiled from: ProfileLinkHandlerModule_ProvideEditProfileLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f221923a;

    public p(e eVar) {
        this.f221923a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f221923a;
        n.f221921a.getClass();
        return new C43834a(EditProfileLink.class, null, new C43834a.b.C11809b(eVar));
    }
}
