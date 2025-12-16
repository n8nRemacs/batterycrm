package com.avito.android.advert_collection_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert_collection_list.adapter.advert_collection.AdvertCollectionItem;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListState;
import com.avito.android.arch.mvi.u;
import com.avito.conveyor_item.ParcelableItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionListReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_collection_list/mvi/s;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListState;", "<init>", "()V", "_avito_advert-collection-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class s implements u<AdvertCollectionListInternalAction, AdvertCollectionListState> {
    @Inject
    public s() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final AdvertCollectionListState a(AdvertCollectionListInternalAction advertCollectionListInternalAction, AdvertCollectionListState advertCollectionListState) {
        AdvertCollectionListInternalAction advertCollectionListInternalAction2 = advertCollectionListInternalAction;
        AdvertCollectionListState advertCollectionListState2 = advertCollectionListState;
        if (advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.CollectionListLoaded) {
            AdvertCollectionListInternalAction.CollectionListLoaded collectionListLoaded = (AdvertCollectionListInternalAction.CollectionListLoaded) advertCollectionListInternalAction2;
            return AdvertCollectionListState.a(advertCollectionListState2, collectionListLoaded.f82200b, false, collectionListLoaded.f82201c, 2);
        }
        boolean z12 = advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.CollectionDeleted;
        List<ParcelableItem> list = advertCollectionListState2.f82219b;
        if (!z12) {
            if (!(advertCollectionListInternalAction2 instanceof AdvertCollectionListInternalAction.CollectionCreated)) {
                return advertCollectionListInternalAction2.equals(AdvertCollectionListInternalAction.ShowSwipeToRefreshView.f82216b) ? AdvertCollectionListState.a(advertCollectionListState2, null, true, null, 5) : advertCollectionListInternalAction2.equals(AdvertCollectionListInternalAction.HideSwipeToRefreshView.f82204b) ? AdvertCollectionListState.a(advertCollectionListState2, null, false, null, 5) : advertCollectionListState2;
            }
            AdvertCollectionListInternalAction.CollectionCreated collectionCreated = (AdvertCollectionListInternalAction.CollectionCreated) advertCollectionListInternalAction2;
            return AdvertCollectionListState.a(advertCollectionListState2, C42745f0.h0(list, Collections.singletonList(new AdvertCollectionItem(collectionCreated.f82193b, collectionCreated.f82194c, collectionCreated.f82195d, 0, collectionCreated.f82197f, collectionCreated.f82196e, null, null, new AdvertCollectionItem.Actions(true, true, null, false, false)))), false, null, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!L.f(((ParcelableItem) obj).getF78358l(), ((AdvertCollectionListInternalAction.CollectionDeleted) advertCollectionListInternalAction2).f82198b)) {
                arrayList.add(obj);
            }
        }
        return AdvertCollectionListState.a(advertCollectionListState2, arrayList, false, null, 6);
    }
}
