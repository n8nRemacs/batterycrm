package iq;

import com.avito.android.comfortable_deal.deeplink.SubmittingSelectDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SubmittingDeeplinkHandlerModule_ProvideSelectDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.submitting.select.deeplink.b f405253a;

    public h(com.avito.android.comfortable_deal.submitting.select.deeplink.b bVar) {
        this.f405253a = bVar;
    }

    public static C43834a a(com.avito.android.comfortable_deal.submitting.select.deeplink.b bVar) {
        e.f405250a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SubmittingSelectDeeplink.class, new com.avito.android.comfortable_deal.submitting.select.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SubmittingSelectDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f405253a);
    }
}
