package com.avito.android.gallery.deeplink;

import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: OpenGalleryModule_ProvideOpenGalleryLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final b f159223a;

    public j(b bVar) {
        this.f159223a = bVar;
    }

    public static C43834a a(b bVar) {
        i.f159222a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(OpenGalleryDeeplink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OpenGalleryDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f159223a);
    }
}
