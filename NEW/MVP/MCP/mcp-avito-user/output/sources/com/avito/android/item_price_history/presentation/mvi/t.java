package com.avito.android.item_price_history.presentation.mvi;

import com.avito.android.item_price_history.presentation.ItemPriceHistoryInitialData;
import com.avito.android.item_price_history.presentation.items.appending.ItemPriceHistoryAppendingItem;
import com.avito.android.item_price_history.presentation.items.error.ItemPriceHistoryErrorItem;
import com.avito.android.item_price_history.presentation.items.item.ItemPriceHistoryItemItem;
import com.avito.android.item_price_history.presentation.items.skeleton.ItemPriceHistorySkeletonItem;
import com.avito.android.item_price_history.presentation.mvi.entity.ScreenState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ItemPriceHistoryViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/mvi/t;", "Lcom/avito/android/item_price_history/presentation/mvi/s;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ItemPriceHistoryInitialData f173851a;

    /* compiled from: ItemPriceHistoryViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ScreenState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScreenState screenState = ScreenState.f173810b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ScreenState screenState2 = ScreenState.f173810b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ScreenState screenState3 = ScreenState.f173810b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ScreenState screenState4 = ScreenState.f173810b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public t(@Y61.k ItemPriceHistoryInitialData itemPriceHistoryInitialData) {
        this.f173851a = itemPriceHistoryInitialData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // com.avito.android.item_price_history.presentation.mvi.s
    @Y61.k
    public final EO.c a(@Y61.k EO.c cVar, @Y61.k EO.c cVar2) {
        ?? arrayList;
        ArrayList arrayList2;
        int iOrdinal = cVar.f4005d.ordinal();
        if (iOrdinal == 0) {
            arrayList = C42784z0.f406748b;
        } else if (iOrdinal != 1) {
            EO.d dVar = cVar2.f4004c;
            if (iOrdinal == 2) {
                arrayList2 = new ArrayList(dVar.f4007a);
                arrayList2.add(new ItemPriceHistoryAppendingItem("id.appending"));
            } else if (iOrdinal == 3) {
                ScreenState screenState = ScreenState.f173811c;
                ScreenState screenState2 = cVar2.f4005d;
                BO.a aVar = cVar.f4003b;
                if (screenState2 == screenState) {
                    List<BO.b> list = aVar.f1373a;
                    arrayList2 = new ArrayList(C42745f0.q(list, 10));
                    int i12 = 0;
                    for (Object obj : list) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        BO.b bVar = (BO.b) obj;
                        arrayList2.add(new ItemPriceHistoryItemItem(AK.c.g(i12, "id.content_"), bVar.f1375a, bVar.f1376b, bVar.f1377c, bVar.f1378d));
                        i12 = i13;
                    }
                } else {
                    List<com.avito.conveyor_item.a> listSubList = dVar.f4007a;
                    List<BO.b> listSubList2 = aVar.f1373a.subList(C42745f0.J(listSubList), aVar.f1373a.size());
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(listSubList2, 10));
                    int i14 = 0;
                    for (Object obj2 : listSubList2) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        BO.b bVar2 = (BO.b) obj2;
                        arrayList3.add(new ItemPriceHistoryItemItem(AK.c.g(i14, "id.content_"), bVar2.f1375a, bVar2.f1376b, bVar2.f1377c, bVar2.f1378d));
                        i14 = i15;
                    }
                    if (androidx.media3.exoplayer.analytics.m.h(1, listSubList) instanceof ItemPriceHistoryAppendingItem) {
                        listSubList = listSubList.subList(0, listSubList.size() - 2);
                    }
                    arrayList = C42745f0.h0(arrayList3, listSubList);
                }
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList = Collections.singletonList(new ItemPriceHistoryErrorItem("id.error"));
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList();
            int i16 = this.f173851a.f173716e;
            for (int i17 = 0; i17 < i16; i17++) {
                arrayList.add(new ItemPriceHistorySkeletonItem(AK.c.g(i17, "id.loading_")));
            }
        }
        return EO.c.a(cVar, null, new EO.d(arrayList), null, false, 13);
    }
}
