package com.avito.android.profile.deep_linking;

import com.avito.android.deep_linking.RemoveProfileLink;
import lv.C43834a;

/* compiled from: ProfileLinkHandlerModule_ProvideRemoveProfileLinkMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f221926a;

    public s(A a12) {
        this.f221926a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        A a12 = this.f221926a;
        n.f221921a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RemoveProfileLink.class, new y(), new C43834a.b.C11809b(a12));
    }
}
