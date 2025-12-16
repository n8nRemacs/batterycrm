package com.avito.android.favorite_sellers.adapter.recommendation;

import android.os.Parcelable;
import com.avito.android.InterfaceC34162r0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.favorite.SubscriptionSource;
import com.avito.android.component.toast.util.c;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.favorite_sellers.RecommendationItem;
import com.avito.android.favorite_sellers.SellerCarouselItem;
import com.avito.android.favorite_sellers.adapter.recommendation.h;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: RecommendationItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/i;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/h;", "a", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements h {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f155650t = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30576b f155651b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34162r0 f155652c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y1<vC.b> f155653d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final I30.d f155654e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f155655f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f155656g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SubscriptionSource f155657h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.component.toast.util.c f155658i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f155659j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, A> f155660k = new HashMap<>();

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final HashMap<String, RecommendationItem> f155661l = new HashMap<>();

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public com.avito.android.subscriptions_settings.d f155662m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public h.a f155663n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public SellerCarouselItem f155664o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public SellerCarouselItem f155665p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C43238h f155666q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C43238h f155667r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C43238h f155668s;

    /* compiled from: RecommendationItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/i$a;", "", "<init>", "()V", "", "KEY_CURRENT_CONFIGURING_SELLER", "Ljava/lang/String;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i(@Y61.k InterfaceC30576b interfaceC30576b, @Y61.k InterfaceC34162r0 interfaceC34162r0, @Y61.k Y1<vC.b> y12, @Y61.k I30.d dVar, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k SubscriptionSource subscriptionSource, @Y61.k com.avito.android.component.toast.util.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02, @Y61.l @InterfaceC30575a Kundle kundle) {
        this.f155651b = interfaceC30576b;
        this.f155652c = interfaceC34162r0;
        this.f155653d = y12;
        this.f155654e = dVar;
        this.f155655f = interfaceC35741a1;
        this.f155656g = interfaceC28373a;
        this.f155657h = subscriptionSource;
        this.f155658i = cVar;
        this.f155659j = aVar;
        this.f155664o = kundle != null ? (SellerCarouselItem) kundle.d("current_configuring_seller") : null;
        this.f155666q = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f155667r = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        this.f155668s = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    public static final void O(i iVar, SellerCarouselItem sellerCarouselItem) {
        iVar.getClass();
        String str = sellerCarouselItem.f155466d;
        iVar.f155652c.j(Boolean.valueOf(sellerCarouselItem.f155473k), sellerCarouselItem.f155475m, str);
    }

    public static final void k(i iVar, Throwable th2, SellerCarouselItem sellerCarouselItem) {
        iVar.getClass();
        ApiError apiError = ((ApiException) th2).f318522b;
        if (apiError instanceof ApiError.ErrorDialog) {
            com.avito.android.subscriptions_settings.d dVar = iVar.f155662m;
            if (dVar != null) {
                dVar.g((ApiError.ErrorDialog) apiError, new u(apiError, iVar, sellerCarouselItem));
                return;
            }
            return;
        }
        if (!(apiError instanceof ApiError.ErrorAction)) {
            c.a.a(iVar.f155658i, InterfaceC35741a1.a.a(iVar.f155655f, th2, null, null, 6), 0, null, null, null, null, 254);
        } else {
            iVar.f155665p = sellerCarouselItem;
            b.a.a(iVar.f155659j, ((ApiError.ErrorAction) apiError).getAction(), "req_key_recommendation_presenter", null, 4);
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        A a12 = (A) eVar;
        RecommendationItem recommendationItem = (RecommendationItem) aVar;
        HashMap<String, A> map = this.f155660k;
        String str = recommendationItem.f155459b;
        map.put(str, a12);
        this.f155661l.put(str, recommendationItem);
        a12.setTitle(recommendationItem.f155461d);
        a12.Nz(new UV0.c(recommendationItem.f155460c));
        Parcelable parcelable = recommendationItem.f155463f;
        if (parcelable != null) {
            a12.T7(parcelable);
        }
        a12.d(new q((io.reactivex.rxjava3.internal.observers.y) a12.getF155589h().t0(new r(recommendationItem)), this, recommendationItem, a12));
    }

    public final void V(SellerCarouselItem sellerCarouselItem) {
        RecommendationItem recommendationItem;
        A a12 = this.f155660k.get(sellerCarouselItem.f155465c);
        if (a12 == null || (recommendationItem = this.f155661l.get(sellerCarouselItem.f155465c)) == null) {
            return;
        }
        a12.EB(recommendationItem.f155460c.indexOf(sellerCarouselItem));
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.h
    public final void b5(@Y61.k h.a aVar) {
        this.f155663n = aVar;
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.h
    public final void c0() {
        Q0.d(this.f155667r.f411905b);
        this.f155663n = null;
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.h
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f155664o, "current_configuring_seller");
        return kundle;
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.h
    public final void e0() {
        Q0.d(this.f155666q.f411905b);
        this.f155660k.clear();
        this.f155661l.clear();
        f3();
        this.f155662m = null;
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.h
    public final void f3() {
        Q0.d(this.f155668s.f411905b);
    }

    @Override // com.avito.android.favorite_sellers.adapter.recommendation.h
    public final void y7(@Y61.k com.avito.android.subscriptions_settings.d dVar) {
        this.f155662m = dVar;
        C43197r1 c43197r1 = new C43197r1(new k(this, null), dVar.f291516r);
        C43238h c43238h = this.f155666q;
        C43175k.K(c43197r1, c43238h);
        C43175k.K(new C43197r1(new l(this, null), dVar.f291517s), c43238h);
        C43175k.K(new C43197r1(new m(this, null), dVar.f291518t), c43238h);
        C43175k.K(new C43197r1(new n(this, null), this.f155653d), c43238h);
        C43175k.K(new C43197r1(new o(this, null), this.f155652c.f()), c43238h);
        C43175k.K(new C43197r1(new p(this, null), new j(kotlinx.coroutines.rx3.y.a(this.f155659j.d9()))), c43238h);
        SellerCarouselItem sellerCarouselItem = this.f155664o;
        if (sellerCarouselItem != null) {
            this.f155664o = sellerCarouselItem;
            com.avito.android.subscriptions_settings.d dVar2 = this.f155662m;
            if (dVar2 != null) {
                Boolean bool = sellerCarouselItem.f155475m;
                dVar2.d(bool != null ? bool.booleanValue() : false);
                dVar2.c();
            }
        }
    }
}
