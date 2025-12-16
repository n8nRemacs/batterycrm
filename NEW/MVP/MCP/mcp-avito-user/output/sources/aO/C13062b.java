package Ao;

import com.avito.android.cjm_pro.deeplink.CjmProDeepLink;
import com.avito.android.cjm_pro.deeplink.c;
import com.avito.android.cjm_pro.deeplink.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CjmProDeeplinkMappingsModule_ProvideCjmProDeepLinkMappingFactory.java */
@e
@y
@x
/* renamed from: Ao.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13062b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f624a;

    public C13062b(c cVar) {
        this.f624a = cVar;
    }

    public static C43834a a(c cVar) {
        C13061a.f623a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CjmProDeepLink.class, new d(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CjmProDeepLink.class), cVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f624a);
    }
}
