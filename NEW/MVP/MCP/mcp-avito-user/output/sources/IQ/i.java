package iq;

import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: SubmittingDeeplinkHandlerModule_ProvideSuccessDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class i implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.comfortable_deal.submitting.success.deeplink.b f405254a;

    public i(com.avito.android.comfortable_deal.submitting.success.deeplink.b bVar) {
        this.f405254a = bVar;
    }

    public static C43834a a(com.avito.android.comfortable_deal.submitting.success.deeplink.b bVar) {
        e.f405250a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(SubmittingSuccessLink.class, new com.avito.android.comfortable_deal.submitting.success.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(SubmittingSuccessLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f405254a);
    }
}
