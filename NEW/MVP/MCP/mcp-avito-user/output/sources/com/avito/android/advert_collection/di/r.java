package com.avito.android.advert_collection.di;

import com.avito.android.advert_collection.deeplink.AdvertCollectionDeepLink;
import lv.C43834a;

/* compiled from: AdvertCollectionLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class r implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final D7.c f81479a;

    public r(D7.c cVar) {
        this.f81479a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D7.c cVar = this.f81479a;
        q.f81478a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AdvertCollectionDeepLink.class, new D7.a(), new C43834a.b.C11809b(cVar));
    }
}
