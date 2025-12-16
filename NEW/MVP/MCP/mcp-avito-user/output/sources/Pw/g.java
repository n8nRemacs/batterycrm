package PW;

import com.avito.android.loyalty.links.quality_service.QualityServiceLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LoyaltyDeepLinkHandlerModule_ProvideQualityServiceDetailsLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final WW.c f13099a;

    public g(WW.c cVar) {
        this.f13099a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        WW.c cVar = this.f13099a;
        a.f13093a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(QualityServiceLink.class, new WW.a(), new C43834a.b.C11809b(cVar));
    }
}
