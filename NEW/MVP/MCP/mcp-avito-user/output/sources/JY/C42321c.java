package jY;

import com.avito.android.marketplace.deeplink.FinanceMarketplaceLink;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: FinanceMarketplaceLinkHandlerModule_ProvideWalletHistoryLinkMapperFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: jY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C42321c implements dagger.internal.h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C42322d f405634a;

    public C42321c(C42322d c42322d) {
        this.f405634a = c42322d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C42322d c42322d = this.f405634a;
        C42320b.f405633a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(FinanceMarketplaceLink.class, new h(), new C43834a.b.C11809b(c42322d));
    }
}
