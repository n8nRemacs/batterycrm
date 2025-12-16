package hv0;

import com.avito.android.services_portfolio.deeplink.ServicesPortfolioProjectBuyerLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: ServicesPortfolioProjectBuyerLinkHandlerModule_ProvidePortfolioProjectBuyerLinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: hv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41173c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C41174d f398300a;

    public C41173c(C41174d c41174d) {
        this.f398300a = c41174d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C41174d c41174d = this.f398300a;
        C41172b.f398299a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(ServicesPortfolioProjectBuyerLink.class, new C41175e(), new C43834a.b.C11809b(c41174d));
    }
}
