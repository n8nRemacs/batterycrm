package com.avito.android.seller_promotions.deep_link;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PromotionsSellerLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.seller_promotions.j;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: SellerPromotionsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_promotions/deep_link/g;", "Lev/a;", "Lcom/avito/android/deep_linking/links/PromotionsSellerLink;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends AbstractC40161a<PromotionsSellerLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final j f267676f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f267677g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f267678h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f267679i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f267680j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SellerPromotionsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(g.this);
        }
    }

    /* compiled from: SellerPromotionsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.j(PromotionsSellerLink.b.a.f133621b);
        }
    }

    @Inject
    public g(@k j jVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k C25719a c25719a) {
        this.f267676f = jVar;
        this.f267677g = interfaceC4053a;
        this.f267678h = bVar;
        this.f267679i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PromotionsSellerLink promotionsSellerLink = (PromotionsSellerLink) deepLink;
        this.f267679i.a(promotionsSellerLink, this, AuthSource.f92666A, new f(this, promotionsSellerLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f267680j.b(this.f267678h.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f267680j.e();
    }
}
