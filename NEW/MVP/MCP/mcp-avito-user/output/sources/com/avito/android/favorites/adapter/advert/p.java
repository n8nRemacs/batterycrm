package com.avito.android.favorites.adapter.advert;

import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.favorites.adapter.advert.d;
import com.avito.android.remote.model.StocksQuantity;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import t3.InterfaceC48488t;

/* compiled from: FavoriteAdvertItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/p;", "Lcom/avito/android/favorites/adapter/advert/d;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public d.a f156460b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.h<SimpleTestGroup> f156461c;

    @Inject
    public p(@Y61.l d.a aVar, @InterfaceC48488t @Y61.k u3.h<SimpleTestGroup> hVar) {
        this.f156460b = aVar;
        this.f156461c = hVar;
    }

    public static void O(r rVar, StocksQuantity stocksQuantity, Stepper stepper) {
        if (stocksQuantity == null) {
            rVar.BW();
            return;
        }
        boolean z12 = false;
        if ((stepper == null || stepper.f116271b != 0 || stepper.f116272c != 0) && stepper != null) {
            z12 = true;
        }
        if (!z12) {
            int maxQuantity = stocksQuantity.getMaxQuantity();
            int quantity = stocksQuantity.getQuantity();
            if (1 <= quantity && quantity <= maxQuantity) {
                rVar.CX(stocksQuantity.getQuantity());
                return;
            }
        }
        if (stepper != null) {
            int i12 = stepper.f116272c;
            int i13 = stepper.f116271b;
            if (i13 != 0 || i12 != 0) {
                int maxQuantity2 = stocksQuantity.getMaxQuantity();
                if ((1 <= i12 && i12 <= maxQuantity2) || i12 < i13) {
                    rVar.CX(i12);
                    return;
                }
            }
        }
        rVar.BW();
    }

    @Override // com.avito.android.favorites.adapter.advert.d
    public final void H1(@Y61.l com.avito.android.advert_collection.t tVar) {
        this.f156460b = tVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((r) eVar, (FavoriteAdvertItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        r rVar = (r) eVar;
        FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof c : true) {
                obj = next;
            }
        }
        c cVar = (c) (obj instanceof c ? obj : null);
        if (cVar == null) {
            k(rVar, favoriteAdvertItem);
            return;
        }
        rVar.setFavorite(cVar.f156439a);
        StocksQuantity stocksQuantity = favoriteAdvertItem.f156418p;
        Stepper stepper = cVar.f156440b;
        O(rVar, stocksQuantity, stepper);
        rVar.Bh(n.f156456l);
        rVar.Jk(stepper);
        if (stepper != null) {
            rVar.Bh(new o(this, favoriteAdvertItem.f156404b, stepper));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@Y61.k com.avito.android.favorites.adapter.advert.r r10, @Y61.k com.avito.android.favorites.adapter.advert.FavoriteAdvertItem r11) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.adapter.advert.p.k(com.avito.android.favorites.adapter.advert.r, com.avito.android.favorites.adapter.advert.FavoriteAdvertItem):void");
    }
}
