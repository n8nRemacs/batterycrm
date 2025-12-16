package hx;

import com.avito.android.deep_linking.links.DevelopmentsCatalogLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsCatalogLinkHandlerModule_ProvideDevelopmentsCatalogLinkModuleFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.developments_catalog.deeplink.g f398307a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f398308b;

    public h(com.avito.android.developments_catalog.deeplink.g gVar, dagger.internal.f fVar) {
        this.f398307a = gVar;
        this.f398308b = fVar;
    }

    public static C43834a a(com.avito.android.developments_catalog.deeplink.g gVar) {
        f.f398305a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DevelopmentsCatalogLink.class, new com.avito.android.developments_catalog.deeplink.h(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DevelopmentsCatalogLink.class), gVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f398307a);
    }
}
