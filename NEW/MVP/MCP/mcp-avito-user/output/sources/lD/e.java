package Ld;

import com.avito.android.deep_linking.links.AuctionOfferLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: AuctionDeepLinkHandlerModule_ProvideAuctionOfferDeepLinkHandlerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.auction.offer.deeplink.b f10022a;

    public e(com.avito.android.auction.offer.deeplink.b bVar) {
        this.f10022a = bVar;
    }

    public static C43834a a(com.avito.android.auction.offer.deeplink.b bVar) {
        C14379a.f10018a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(AuctionOfferLink.class, new com.avito.android.auction.offer.deeplink.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(AuctionOfferLink.class), bVar));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return a(this.f10022a);
    }
}
