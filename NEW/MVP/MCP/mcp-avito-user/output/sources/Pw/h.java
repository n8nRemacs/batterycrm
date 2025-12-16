package PW;

import com.avito.android.loyalty.links.quality_service_gray.QualityServiceGrayLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: LoyaltyDeepLinkHandlerModule_ProvideQualityServiceGrayLinkSyncHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final XW.c f13100a;

    public h(XW.c cVar) {
        this.f13100a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        XW.c cVar = this.f13100a;
        a.f13093a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(QualityServiceGrayLink.class, new XW.a(), new C43834a.b.C11809b(cVar));
    }
}
