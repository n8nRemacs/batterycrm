package com.avito.android.rating.publish.deep_linking;

import com.avito.android.deep_linking.RatingPublishLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: RatingPublishLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f247633a;

    public f(g gVar) {
        this.f247633a = gVar;
    }

    public static C43834a a(g gVar) {
        e.f247632a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RatingPublishLink.class, new h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(RatingPublishLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f247633a);
    }
}
