package PW;

import com.avito.android.loyalty.links.criteria_gray.CriteriaGrayLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LoyaltyDeepLinkHandlerModule_ProvideCriteriaGrayLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final VW.c f13097a;

    public e(VW.c cVar) {
        this.f13097a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        VW.c cVar = this.f13097a;
        a.f13093a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CriteriaGrayLink.class, new VW.a(), new C43834a.b.C11809b(cVar));
    }
}
