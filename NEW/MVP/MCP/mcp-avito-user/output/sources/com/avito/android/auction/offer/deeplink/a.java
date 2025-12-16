package com.avito.android.auction.offer.deeplink;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.auction.offer.AuctionOfferActivity;
import com.avito.android.auction.offer.AuctionOfferParams;
import com.avito.android.deep_linking.links.AuctionOfferLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.publish.EditAdvertResult;
import com.avito.android.util.C35961v3;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AuctionOfferDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/offer/deeplink/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AuctionOfferLink;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40161a<AuctionOfferLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f92457f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f92458g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f92459h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f92460i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public y f92461j;

    /* compiled from: AuctionOfferDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.auction.offer.deeplink.a$a, reason: collision with other inner class name */
    public static final class C2732a<T> implements r {
        public C2732a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: AuctionOfferDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = ((C47918a) obj).f437156b;
            a aVar = a.this;
            if (i12 == -1) {
                aVar.j(AuctionOfferLink.a.C3986a.f133025b);
                return;
            }
            AuctionOfferLink auctionOfferLinkC = aVar.c();
            DeepLink deepLink = auctionOfferLinkC != null ? auctionOfferLinkC.f133022c : null;
            AuctionOfferLink.b bVar = AuctionOfferLink.f133020f;
            Bundle bundleB = aVar.b();
            bVar.getClass();
            EditAdvertResult.Ok ok2 = bundleB != null ? (EditAdvertResult.Ok) bundleB.getParcelable("previous_response_key") : null;
            Bundle bundleB2 = aVar.b();
            String string = bundleB2 != null ? bundleB2.getString("item_id_key") : null;
            if (ok2 != null && string != null) {
                aVar.j(new AuctionOfferLink.a.c(ok2, string));
            } else if (deepLink != null) {
                aVar.i(AuctionOfferLink.a.b.f133026b, aVar.f92460i, deepLink);
            } else {
                aVar.j(AuctionOfferLink.a.C3986a.f133025b);
            }
        }
    }

    @Inject
    public a(@k Context context, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f92457f = context;
        this.f92458g = interfaceC4053a;
        this.f92459h = bVar;
        this.f92460i = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AuctionOfferLink auctionOfferLink = (AuctionOfferLink) deepLink;
        AuctionOfferActivity.a aVar = AuctionOfferActivity.f92423n;
        AuctionOfferParams auctionOfferParams = new AuctionOfferParams(auctionOfferLink.f133021b, auctionOfferLink.f133023d, auctionOfferLink.f133024e);
        aVar.getClass();
        Intent intent = new Intent(this.f92457f, (Class<?>) AuctionOfferActivity.class);
        C35961v3.b(intent, auctionOfferParams);
        this.f92458g.J(intent, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f92461j = (y) this.f92459h.Q().N(new C2732a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f92461j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
