package iq;

import com.avito.android.comfortable_deal.deeplink.OrderCallDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SubmittingDeeplinkHandlerModule_ProvideOrderCallDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.submitting.ordercall.deeplink.b f405251a;

    public f(com.avito.android.comfortable_deal.submitting.ordercall.deeplink.b bVar) {
        this.f405251a = bVar;
    }

    public static C43834a a(com.avito.android.comfortable_deal.submitting.ordercall.deeplink.b bVar) {
        e.f405250a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(OrderCallDeeplink.class, new com.avito.android.comfortable_deal.submitting.ordercall.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(OrderCallDeeplink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f405251a);
    }
}
