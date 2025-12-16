package com.avito.android.favorites;

import bj0.C25661a;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import com.avito.android.favorites.adapter.advert.RelatedProductsWithState;
import com.avito.android.remote.model.RelatedProducts;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.z0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final /* synthetic */ class C30707z0 extends C42801a implements Y41.p<C25661a, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(C25661a c25661a, Continuation<? super kotlin.G0> continuation) {
        C25661a c25661a2 = c25661a;
        C30684r0 c30684r0 = (C30684r0) this.receiver;
        c30684r0.getClass();
        long j12 = c25661a2.f57400a;
        List<? extends FavoriteListItem> list = c30684r0.f157456a0;
        ArrayList arrayList = null;
        if (list != null) {
            List<? extends FavoriteListItem> list2 = list;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            for (com.avito.conveyor_item.a aVarA : list2) {
                if ((aVarA instanceof FavoriteAdvertItem) && kotlin.jvm.internal.L.f(((FavoriteAdvertItem) aVarA).f156404b, String.valueOf(j12))) {
                    FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) aVarA;
                    RelatedProductsWithState relatedProductsWithState = favoriteAdvertItem.f156425w;
                    if ((relatedProductsWithState != null ? relatedProductsWithState.f156429b : null) instanceof RelatedProducts.ClassifiedItem) {
                        aVarA = FavoriteAdvertItem.a(favoriteAdvertItem, null, new RelatedProductsWithState(relatedProductsWithState.f156429b, c25661a2.f57401b), -2097153);
                    }
                }
                arrayList2.add(aVarA);
            }
            arrayList = arrayList2;
        }
        c30684r0.f157456a0 = arrayList;
        c30684r0.O();
        return kotlin.G0.f406611a;
    }
}
