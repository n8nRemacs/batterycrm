package PW;

import com.avito.android.loyalty.links.criteria.CriteriaLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LoyaltyDeepLinkHandlerModule_ProvideCriteriaLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final UW.c f13098a;

    public f(UW.c cVar) {
        this.f13098a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        UW.c cVar = this.f13098a;
        a.f13093a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CriteriaLink.class, new UW.a(), new C43834a.b.C11809b(cVar));
    }
}
