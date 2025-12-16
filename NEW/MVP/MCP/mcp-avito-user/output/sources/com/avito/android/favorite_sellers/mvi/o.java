package com.avito.android.favorite_sellers.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.favorite_sellers.FavoriteSellersItem;
import com.avito.android.favorite_sellers.InterfaceC30588l;
import com.avito.android.favorite_sellers.SubscribableItem;
import com.avito.android.favorite_sellers.adapter.error.ErrorItem;
import com.avito.android.favorite_sellers.adapter.info.InfoItem;
import com.avito.android.favorite_sellers.adapter.loading.LoadingItem;
import com.avito.android.favorite_sellers.adapter.seller.SellerItem;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FavoriteSellersReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersState;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements u<FavoriteSellersInternalAction, FavoriteSellersState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I30.d f156080b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30588l f156081c;

    @Inject
    public o(@Y61.k I30.d dVar, @Y61.k InterfaceC30588l interfaceC30588l) {
        this.f156080b = dVar;
        this.f156081c = interfaceC30588l;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((FavoriteSellersItem) obj) instanceof LoadingItem)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v27, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r4v28 */
    @Override // com.avito.android.arch.mvi.u
    public final FavoriteSellersState a(FavoriteSellersInternalAction favoriteSellersInternalAction, FavoriteSellersState favoriteSellersState) {
        SellerItem sellerItem;
        SellerItem sellerItem2;
        FavoriteSellersState.SubscriptionMenuState subscriptionMenuStateA;
        SellerItem sellerItem3;
        SellerItem sellerItem4;
        FavoriteSellersInternalAction favoriteSellersInternalAction2 = favoriteSellersInternalAction;
        FavoriteSellersState favoriteSellersState2 = favoriteSellersState;
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.DataLoading) {
            return FavoriteSellersState.a(favoriteSellersState2, null, null, true, false, null, null, null, null, false, null, 0, false, false, false, 49147);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.DataRefreshing) {
            return FavoriteSellersState.a(favoriteSellersState2, null, null, false, true, null, C42784z0.f406748b, null, null, false, null, 0, false, false, false, 65463);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.DataLoaded) {
            FavoriteSellersInternalAction.DataLoaded dataLoaded = (FavoriteSellersInternalAction.DataLoaded) favoriteSellersInternalAction2;
            return FavoriteSellersState.a(favoriteSellersState2, dataLoaded.f156005c, dataLoaded.f156004b, false, false, null, null, null, null, false, null, 0, false, false, false, 41952);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowEmptyMessage) {
            return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, C42784z0.f406748b, null, null, false, null, 0, false, false, false, 48033);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.LoadingError) {
            return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, ((FavoriteSellersInternalAction.LoadingError) favoriteSellersInternalAction2).f156009b, C42784z0.f406748b, null, null, false, null, 0, false, false, false, 48033);
        }
        boolean z12 = favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.NextPageLoadRetry;
        List list = favoriteSellersState2.f156038c;
        if (z12) {
            if (list == null) {
                list = C42784z0.f406748b;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((FavoriteSellersItem) obj) instanceof ErrorItem)) {
                    arrayList.add(obj);
                }
            }
            return FavoriteSellersState.a(favoriteSellersState2, null, C42745f0.i0(new LoadingItem(((FavoriteSellersInternalAction.NextPageLoadRetry) favoriteSellersInternalAction2).f156011b), arrayList), false, false, null, null, null, null, false, null, 0, false, false, false, 65529);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.NextPageLoaded) {
            if (list == null) {
                list = C42784z0.f406748b;
            }
            return FavoriteSellersState.a(favoriteSellersState2, null, C42745f0.h0(((FavoriteSellersInternalAction.NextPageLoaded) favoriteSellersInternalAction2).f156012b, b(list)), false, false, null, null, null, null, false, null, 0, false, false, false, 65529);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.NextPageLoadingError) {
            if (list == null) {
                list = C42784z0.f406748b;
            }
            return FavoriteSellersState.a(favoriteSellersState2, null, C42745f0.i0(((FavoriteSellersInternalAction.NextPageLoadingError) favoriteSellersInternalAction2).f156013b, b(list)), false, false, null, null, null, null, false, null, 0, false, false, false, 65529);
        }
        boolean z13 = favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ChangeNotificationProgress;
        String str = null;
        FavoriteSellersState.SubscriptionMenuState subscriptionMenuState = favoriteSellersState2.f156044i;
        if (z13) {
            if (subscriptionMenuState != null && (sellerItem4 = subscriptionMenuState.f156053b) != null) {
                str = sellerItem4.f155720c;
            }
            FavoriteSellersInternalAction.ChangeNotificationProgress changeNotificationProgress = (FavoriteSellersInternalAction.ChangeNotificationProgress) favoriteSellersInternalAction2;
            return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, L.f(str, changeNotificationProgress.f155999b.getF294217b()) ? FavoriteSellersState.SubscriptionMenuState.a(subscriptionMenuState, false, false, changeNotificationProgress.f156000c, 31) : subscriptionMenuState, null, false, null, 0, false, false, false, 65407);
        }
        boolean z14 = favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ChangeNotificationSuccess;
        InterfaceC30588l interfaceC30588l = this.f156081c;
        if (z14) {
            String str2 = (subscriptionMenuState == null || (sellerItem3 = subscriptionMenuState.f156053b) == null) ? null : sellerItem3.f155720c;
            FavoriteSellersInternalAction.ChangeNotificationSuccess changeNotificationSuccess = (FavoriteSellersInternalAction.ChangeNotificationSuccess) favoriteSellersInternalAction2;
            SubscribableItem subscribableItem = changeNotificationSuccess.f156001b;
            if (L.f(str2, subscribableItem.getF294217b())) {
                Boolean f294219d = subscribableItem.getF294219d();
                subscriptionMenuStateA = FavoriteSellersState.SubscriptionMenuState.a(subscriptionMenuState, f294219d != null ? f294219d.booleanValue() : false, false, false, 23);
            } else {
                subscriptionMenuStateA = subscriptionMenuState;
            }
            if (list == null) {
                list = C42784z0.f406748b;
            }
            return FavoriteSellersState.a(favoriteSellersState2, null, interfaceC30588l.i(subscribableItem.getF294217b(), null, Boolean.valueOf(changeNotificationSuccess.f156002c), list), false, false, null, null, subscriptionMenuStateA, null, false, null, 0, false, false, false, 65405);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.SubscriptionProgress) {
            return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, null, null, ((FavoriteSellersInternalAction.SubscriptionProgress) favoriteSellersInternalAction2).f156026b, null, 0, false, false, false, 64767);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.SubscriptionSuccess) {
            if (list == null) {
                list = C42784z0.f406748b;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (!(((FavoriteSellersItem) obj2) instanceof InfoItem)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Iterator it = favoriteSellersState2.f156043h.iterator();
            while (it.hasNext()) {
                Q q12 = (Q) it.next();
                arrayList3.add(((Number) q12.f406619b).intValue(), q12.f406620c);
            }
            FavoriteSellersInternalAction.SubscriptionSuccess subscriptionSuccess = (FavoriteSellersInternalAction.SubscriptionSuccess) favoriteSellersInternalAction2;
            return FavoriteSellersState.a(favoriteSellersState2, null, interfaceC30588l.i(subscriptionSuccess.f156028b, Boolean.valueOf(subscriptionSuccess.f156029c), subscriptionSuccess.f156030d, arrayList3), false, false, null, C42784z0.f406748b, null, null, false, null, 0, false, false, false, 64445);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.UnsubscriptionProgress) {
            if (subscriptionMenuState != null && (sellerItem2 = subscriptionMenuState.f156053b) != null) {
                str = sellerItem2.f155720c;
            }
            FavoriteSellersInternalAction.UnsubscriptionProgress unsubscriptionProgress = (FavoriteSellersInternalAction.UnsubscriptionProgress) favoriteSellersInternalAction2;
            return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, L.f(str, unsubscriptionProgress.f156031b.getF294217b()) ? FavoriteSellersState.SubscriptionMenuState.a(subscriptionMenuState, false, unsubscriptionProgress.f156032c, false, 47) : subscriptionMenuState, null, false, null, 0, false, false, false, 65407);
        }
        boolean z15 = favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.UnsubscriptionSuccess;
        int i12 = favoriteSellersState2.f156049n;
        if (!z15) {
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.OpenSubscriptionSettings) {
                SellerItem sellerItem5 = ((FavoriteSellersInternalAction.OpenSubscriptionSettings) favoriteSellersInternalAction2).f156018b;
                boolean z16 = sellerItem5.f155728k;
                boolean z17 = !sellerItem5.f155726i;
                Boolean bool = sellerItem5.f155730m;
                return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, new FavoriteSellersState.SubscriptionMenuState(sellerItem5, z16, z17, (bool != null ? bool.booleanValue() : false) && this.f156080b.b(), sellerItem5.f155729l, sellerItem5.f155731n), null, false, null, 0, false, false, false, 65407);
            }
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.SubscriptionSettingsDismissed) {
                return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, null, null, false, null, 0, false, false, false, 65407);
            }
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.DelayedResubscribe) {
                return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, null, null, false, ((FavoriteSellersInternalAction.DelayedResubscribe) favoriteSellersInternalAction2).f156007b, 0, false, false, false, 64511);
            }
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ItemsUpdate) {
                FavoriteSellersInternalAction.ItemsUpdate itemsUpdate = (FavoriteSellersInternalAction.ItemsUpdate) favoriteSellersInternalAction2;
                return FavoriteSellersState.a(favoriteSellersState2, null, itemsUpdate.f156008b, false, false, null, null, null, null, false, null, Math.max(i12 - ((list != null ? list.size() : 0) - itemsUpdate.f156008b.size()), 0), false, false, false, 61437);
            }
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.OnUndoSnackbarDismissed) {
                return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, null, null, false, null, 0, false, false, false, 65279);
            }
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.OnMarkedSellersAsRead) {
                return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, null, null, false, null, ((FavoriteSellersInternalAction.OnMarkedSellersAsRead) favoriteSellersInternalAction2).f156016b, false, false, false, 61439);
            }
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ChangeScreenVisibility) {
                return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, null, null, false, null, 0, false, false, ((FavoriteSellersInternalAction.ChangeScreenVisibility) favoriteSellersInternalAction2).f156003b, 32767);
            }
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.UpdateIsSellersViewed) {
                return FavoriteSellersState.a(favoriteSellersState2, null, null, false, false, null, null, null, null, false, null, 0, ((FavoriteSellersInternalAction.UpdateIsSellersViewed) favoriteSellersInternalAction2).f156034b, false, false, 57343);
            }
            if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowCommonErrorToastBar ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowSnackbarWithUndo ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowErrorDialog ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowNotificationsDialog) {
                return favoriteSellersState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList4 = new ArrayList();
        ?? arrayList5 = new ArrayList();
        if (list != null) {
            int i13 = 0;
            int i14 = i12;
            for (Object obj3 : list) {
                int i15 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                FavoriteSellersItem favoriteSellersItem = (FavoriteSellersItem) obj3;
                SubscribableItem subscribableItem2 = favoriteSellersItem instanceof SubscribableItem ? (SubscribableItem) favoriteSellersItem : null;
                if (L.f(subscribableItem2 != null ? subscribableItem2.getF294217b() : null, ((FavoriteSellersInternalAction.UnsubscriptionSuccess) favoriteSellersInternalAction2).f156033b.getF294217b())) {
                    arrayList5.add(new Q(Integer.valueOf(i13), favoriteSellersItem));
                    if (i13 <= i12) {
                        i14--;
                    }
                } else {
                    arrayList4.add(favoriteSellersItem);
                }
                i13 = i15;
            }
            G0 g02 = G0.f406611a;
            i12 = i14;
        }
        ArrayList arrayList6 = new ArrayList(C42745f0.q(arrayList5, 10));
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayList6.add((FavoriteSellersItem) ((Q) it2.next()).f406620c);
        }
        Object objG = C42745f0.G(arrayList6);
        SellerItem sellerItem6 = objG instanceof SellerItem ? (SellerItem) objG : null;
        boolean z18 = (sellerItem6 == null || sellerItem6.f155726i) ? false : true;
        if (!z18) {
            arrayList5 = C42784z0.f406748b;
        }
        List list2 = arrayList5;
        String str3 = (subscriptionMenuState == null || (sellerItem = subscriptionMenuState.f156053b) == null) ? null : sellerItem.f155720c;
        SubscribableItem subscribableItem3 = ((FavoriteSellersInternalAction.UnsubscriptionSuccess) favoriteSellersInternalAction2).f156033b;
        return FavoriteSellersState.a(favoriteSellersState2, null, arrayList4, false, false, null, list2, L.f(str3, subscribableItem3.getF294217b()) ? null : subscriptionMenuState, z18 ? new FavoriteSellersState.UndoSnackbar(subscribableItem3) : null, false, null, Math.max(i12, 0), false, arrayList4.isEmpty(), false, 43581);
    }
}
