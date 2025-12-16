package mG0;

import com.avito.android.deep_linking.links.UniversalMapLink;
import com.avito.android.universal_map.deeplink.f;
import com.avito.android.universal_map.deeplink.j;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: UniversalMapDeepLinkHandlerModule_ProvideUniversalMapsDeeplinkHandlerFactory.java */
@e
@y
@x
/* renamed from: mG0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43961c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f414440a;

    public C43961c(f fVar) {
        this.f414440a = fVar;
    }

    public static C43834a a(f fVar) {
        C43959a.f414438a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(UniversalMapLink.class, new j(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(UniversalMapLink.class), fVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f414440a);
    }
}
