package com.avito.android.extended_profile.deep_linking;

import com.avito.android.deep_linking.links.PublicProfileLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: PublicProfileLinkMappingsModule_ProvideProfileSettingsLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f149517a;

    public e(c cVar) {
        this.f149517a = cVar;
    }

    public static C43834a a(c cVar) {
        d.f149516a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PublicProfileLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(PublicProfileLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f149517a);
    }
}
