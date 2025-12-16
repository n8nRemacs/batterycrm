package com.avito.android.favorites;

import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import com.avito.android.cart_snippet_actions.utils.Change;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.favorites.adapter.advert.FavoriteAdvertItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import wn.C49654a;

/* compiled from: FavoritesListPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/avito/android/cart_snippet_actions/utils/Change;", "initialStocks", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.favorites.u0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30697u0 extends kotlin.jvm.internal.N implements Y41.l<Map<String, ? extends Change>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C30684r0 f157549l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30697u0(C30684r0 c30684r0) {
        super(1);
        this.f157549l = c30684r0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Map<String, ? extends Change> map) {
        Map<String, ? extends Change> map2 = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.P0.f(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), Integer.valueOf(((Change) entry.getValue()).f116277b));
        }
        C30684r0 c30684r0 = this.f157549l;
        List<? extends FavoriteListItem> list = c30684r0.f157456a0;
        if (list != null) {
            List<? extends FavoriteListItem> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            for (com.avito.conveyor_item.a aVarA : list2) {
                if (aVarA instanceof FavoriteAdvertItem) {
                    Integer num = (Integer) linkedHashMap.get(((FavoriteAdvertItem) aVarA).f156404b);
                    if (num != null) {
                        int iIntValue = num.intValue();
                        FavoriteAdvertItem favoriteAdvertItem = (FavoriteAdvertItem) aVarA;
                        Stepper stepper = favoriteAdvertItem.f156419q;
                        aVarA = FavoriteAdvertItem.a(favoriteAdvertItem, stepper != null ? Stepper.a(stepper, iIntValue, C49654a.a(iIntValue, stepper.f116272c), 22) : null, null, -32769);
                    } else {
                        aVarA = (FavoriteAdvertItem) aVarA;
                    }
                }
                arrayList.add(aVarA);
            }
            c30684r0.f157456a0 = arrayList;
            c30684r0.O();
        }
        return kotlin.G0.f406611a;
    }
}
