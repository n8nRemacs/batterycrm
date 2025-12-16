package mG0;

import com.avito.android.deep_linking.links.CreateRouteLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UniversalMapDeepLinkHandlerModule_ProvideCreateRouteDeeplinkHandlerFactory.java */
@e
@y
@x
/* renamed from: mG0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43960b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.universal_map.deeplink.b f414439a;

    public C43960b(com.avito.android.universal_map.deeplink.b bVar) {
        this.f414439a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.universal_map.deeplink.b bVar = this.f414439a;
        C43959a.f414438a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CreateRouteLink.class, new com.avito.android.universal_map.deeplink.c(), new C43834a.b.C11809b(bVar));
    }
}
