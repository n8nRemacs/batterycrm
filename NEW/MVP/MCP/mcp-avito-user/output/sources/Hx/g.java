package hx;

import com.avito.android.deep_linking.links.DevelopersCatalogPhoneLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: DevelopmentsCatalogLinkHandlerModule_ProvideDevelopersCatalogPhoneLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.developments_catalog.deeplink.d f398306a;

    public g(com.avito.android.developments_catalog.deeplink.d dVar) {
        this.f398306a = dVar;
    }

    public static C43834a a(com.avito.android.developments_catalog.deeplink.d dVar) {
        f.f398305a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(DevelopersCatalogPhoneLink.class, new com.avito.android.developments_catalog.deeplink.e(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(DevelopersCatalogPhoneLink.class), dVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f398306a);
    }
}
