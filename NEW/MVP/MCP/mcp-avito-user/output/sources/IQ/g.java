package iq;

import com.avito.android.comfortable_deal.deeplink.PromoDeeplink;
import dagger.internal.x;
import dagger.internal.y;
import lq.C43817b;
import lq.C43818c;
import lv.C43834a;

/* compiled from: SubmittingDeeplinkHandlerModule_ProvidePromoDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C43817b f405252a;

    public g(C43817b c43817b) {
        this.f405252a = c43817b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C43817b c43817b = this.f405252a;
        e.f405250a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(PromoDeeplink.class, new C43818c(), new C43834a.b.C11809b(c43817b));
    }
}
