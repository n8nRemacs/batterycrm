package com.avito.android.favorites;

import com.avito.android.remote.model.FavoriteAdvertV1;
import com.avito.android.remote.model.FavoriteElement;
import com.avito.android.remote.model.FavoritesResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsListInteractorImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/FavoritesResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/FavoritesResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.t, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30694t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30700w f157543b;

    public C30694t(C30700w c30700w) {
        this.f157543b = c30700w;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C30700w c30700w = this.f157543b;
        com.avito.android.lib.beduin_v2.repository.domain.cart_items.h hVar = c30700w.f157574j;
        List<FavoriteElement> items = ((FavoritesResult) obj).getItems();
        ArrayList arrayList = new ArrayList();
        for (T t12 : items) {
            if (t12 instanceof FavoriteAdvertV1) {
                arrayList.add(t12);
            }
        }
        C30700w.l(c30700w, hVar, arrayList);
    }
}
