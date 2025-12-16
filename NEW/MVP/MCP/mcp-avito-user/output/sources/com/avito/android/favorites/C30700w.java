package com.avito.android.favorites;

import Hq0.C14020b;
import android.net.Uri;
import bD.InterfaceC25497b;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.favorite.AbstractC30569c;
import com.avito.android.favorite.InterfaceC30570d;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.favorites.adapter.loading.FavoriteLoadingItem;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItem;
import com.avito.android.lib.beduin_v2.repository.domain.cart_items.model.CartItemInfo;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.FavoriteAdvertV1;
import com.avito.android.remote.model.FavoriteItemsWidgets;
import com.avito.android.remote.model.FavoritesRemoveAdvertResponse;
import com.avito.android.remote.model.FavoritesResult;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.internal.operators.observable.C41964k1;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import rU.C47595a;

/* compiled from: FavoriteAdvertsListInteractorImpl.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/w;", "Lcom/avito/android/favorites/p0;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30700w implements InterfaceC30681p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final V f157565a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.W f157566b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ZC.c f157567c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.x f157568d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.D f157569e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30570d f157570f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f157571g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f157572h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30603b f157573i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.beduin_v2.repository.domain.cart_items.h f157574j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.preloading.j<kotlin.G0, FavoriteItemsWidgets> f157575k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final FavoritesSpace f157576l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25497b f157577m;

    @Inject
    public C30700w(@Y61.k V v12, @Y61.k com.avito.android.account.W w12, @Y61.k ZC.c cVar, @Y61.k com.avito.android.favorite.x xVar, @Y61.k com.avito.android.favorite.D d12, @Y61.k InterfaceC30570d interfaceC30570d, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC30603b interfaceC30603b, @Y61.k com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, @Y61.k com.avito.android.preloading.j<kotlin.G0, FavoriteItemsWidgets> jVar, @Y61.k FavoritesSpace favoritesSpace, @Y61.k InterfaceC25497b interfaceC25497b) {
        this.f157565a = v12;
        this.f157566b = w12;
        this.f157567c = cVar;
        this.f157568d = xVar;
        this.f157569e = d12;
        this.f157570f = interfaceC30570d;
        this.f157571g = fVar;
        this.f157572h = interfaceC35745a5;
        this.f157573i = interfaceC30603b;
        this.f157574j = hVar;
        this.f157575k = jVar;
        this.f157576l = favoritesSpace;
        this.f157577m = interfaceC25497b;
    }

    public static final P2.b k(C30700w c30700w, FavoritesResult favoritesResult) {
        List<String> listH = c30700w.f157568d.h();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListA = c30700w.f157573i.a(favoritesResult.getItems());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListA) {
            if (!listH.contains(((FavoriteListItem) obj).getF145164b())) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        String nextPage = favoritesResult.getNextPage();
        if (nextPage != null) {
            arrayList.add(new FavoriteLoadingItem(Uri.parse(nextPage)));
        }
        return new P2.b(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(C30700w c30700w, com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar, ArrayList arrayList) {
        c30700w.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FavoriteAdvertV1 favoriteAdvertV1 = (FavoriteAdvertV1) it.next();
            CartSnippetActionsStepper cartButton = favoriteAdvertV1.getCartButton();
            kotlin.Q q12 = cartButton != null ? new kotlin.Q(String.valueOf(favoriteAdvertV1.getId()), cartButton) : null;
            if (q12 != null) {
                arrayList2.add(q12);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            kotlin.Q q13 = (kotlin.Q) it2.next();
            String str = (String) q13.f406619b;
            CartSnippetActionsStepper cartSnippetActionsStepper = (CartSnippetActionsStepper) q13.f406620c;
            arrayList3.add(new CartItem(str, new CartItemInfo(cartSnippetActionsStepper.getValue(), cartSnippetActionsStepper.getMaxValue())));
        }
        hVar.c(new C47595a(arrayList3));
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    @Y61.k
    public final C41964k1 a() {
        return new C41964k1(new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.preloading.e(this.f157575k, kotlin.G0.f406611a)), null);
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L0 b(@Y61.k Uri uri) {
        return Y5.a(new io.reactivex.rxjava3.internal.operators.observable.F(new C14020b(9, this, uri))).K(new C30676n(this)).d0(new C30678o(this)).x0(this.f157572h.a()).m0(new C30680p(this));
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.H c(@Y61.k final String str, final boolean z12, @Y61.l final String str2, @Y61.l final AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l final Map map) {
        io.reactivex.rxjava3.internal.operators.completable.r rVar = new io.reactivex.rxjava3.internal.operators.completable.r(new Callable() { // from class: com.avito.android.favorites.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str3 = str2;
                String strB = C35800g5.b(new C35792f5(str3));
                C30700w c30700w = this;
                com.avito.android.favorite.x xVar = c30700w.f157568d;
                boolean z13 = z12;
                String str4 = str;
                Map map2 = map;
                if (z13) {
                    xVar.e(str4, strB, null);
                    c30700w.m(str3, Collections.singletonList(str4), map2);
                } else {
                    xVar.m(str4, strB);
                    c30700w.f157570f.a(new AbstractC30569c.a(str4, new AbstractC30567a.e(str3), advertisementVerticalAlias, null, null, null, null, null, null, map2, 496, null));
                }
                return kotlin.G0.f406611a;
            }
        });
        InterfaceC35745a5 interfaceC35745a5 = this.f157572h;
        return rVar.x(interfaceC35745a5.a()).q(interfaceC35745a5.e());
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    public final void d(boolean z12) {
        this.f157569e.a(this.f157566b.b(), z12);
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.S e() {
        io.reactivex.rxjava3.internal.operators.single.G g12 = new io.reactivex.rxjava3.internal.operators.single.G(new CallableC30668j(this, 0));
        InterfaceC35745a5 interfaceC35745a5 = this.f157572h;
        return g12.z(interfaceC35745a5.a()).s(interfaceC35745a5.e());
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.M f() {
        return new C41986s0(this.f157567c.d(this.f157576l.f156271d, null).K(new C30698v(this))).x(this.f157572h.a());
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L0 g(@Y61.k Map map, @Y61.k Map map2, @Y61.l Boolean bool, @Y61.l String str) {
        return io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(P2.c.f318721a), Y5.a(new io.reactivex.rxjava3.internal.operators.observable.F(new com.avito.android.advert_item_actions.actions.a(this, map, map2, bool, str)).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C30682q(this)).K(new r(this)).I(new C30692s(this))).K(new C30694t(this)).d0(new C30672l(this))).x0(this.f157572h.a()).m0(new C30674m(this));
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    public final boolean h(boolean z12) {
        return this.f157569e.b(this.f157566b.b(), z12);
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.M i() {
        io.reactivex.rxjava3.core.z<FavoritesRemoveAdvertResponse> zVarB = this.f157567c.b(this.f157576l.f156271d, null);
        C30696u c30696u = new C30696u(this);
        zVarB.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.Z(zVarB, c30696u).x(this.f157572h.a());
    }

    @Override // com.avito.android.favorites.InterfaceC30681p0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.B0 j() {
        return this.f157565a.a().d0(C30670k.f157376b);
    }

    public final void m(String str, List list, Map map) {
        this.f157570f.a(new AbstractC30569c.b(list, new AbstractC30567a.e(str), (String) null, (String) null, map, 12, (C42822w) null));
    }
}
