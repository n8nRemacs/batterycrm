package com.avito.android.stories.deeplink;

import com.avito.android.stories.StoriesLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: StoriesDeepLinkHandlerModule_ProvideMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f285091a;

    public c(d dVar) {
        this.f285091a = dVar;
    }

    public static C43834a a(d dVar) {
        b.f285090a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(StoriesLink.class, new e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(StoriesLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f285091a);
    }
}
