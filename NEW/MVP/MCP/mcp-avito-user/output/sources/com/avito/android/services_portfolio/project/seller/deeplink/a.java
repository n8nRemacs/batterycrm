package com.avito.android.services_portfolio.project.seller.deeplink;

import Ju.AbstractC14250d;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv0.InterfaceC25722a;
import com.avito.android.B2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.services_portfolio.deeplink.ServicesPortfolioProjectSellerLink;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ServicesPortfolioProjectSellerLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/project/seller/deeplink/a;", "Lev/a;", "Lcom/avito/android/services_portfolio/deeplink/ServicesPortfolioProjectSellerLink;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC40161a<ServicesPortfolioProjectSellerLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f280202f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final B2 f280203g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f280204h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC25722a f280205i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public y f280206j;

    /* compiled from: ServicesPortfolioProjectSellerLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.services_portfolio.project.seller.deeplink.a$a, reason: collision with other inner class name */
    public static final class C8337a<T> implements r {
        public C8337a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: ServicesPortfolioProjectSellerLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = ((C47918a) obj).f437156b;
            a aVar = a.this;
            if (i12 == -1) {
                aVar.j(AbstractC14250d.c.f9171c);
            } else {
                aVar.j(AbstractC14250d.b.f9170c);
            }
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k B2 b22, @k a.b bVar, @k InterfaceC25722a interfaceC25722a) {
        this.f280202f = interfaceC4053a;
        this.f280203g = b22;
        this.f280204h = bVar;
        this.f280205i = interfaceC25722a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ServicesPortfolioProjectSellerLink servicesPortfolioProjectSellerLink = (ServicesPortfolioProjectSellerLink) deepLink;
        if (!this.f280203g.x().invoke().booleanValue()) {
            j(AbstractC14250d.b.f9170c);
            return;
        }
        this.f280202f.J(this.f280205i.a(new PortfolioProjectArguments.SellerArgs(servicesPortfolioProjectSellerLink.f279988c, servicesPortfolioProjectSellerLink.f279987b)), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f280206j = (y) this.f280204h.Q().N(new C8337a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f280206j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f280206j = null;
    }
}
