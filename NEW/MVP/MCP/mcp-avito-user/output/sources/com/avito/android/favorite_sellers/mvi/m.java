package com.avito.android.favorite_sellers.mvi;

import FC.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FavoriteSellersOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/favorite_sellers/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "LFC/b;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements t<FavoriteSellersInternalAction, FC.b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final FC.b b(FavoriteSellersInternalAction favoriteSellersInternalAction) {
        FavoriteSellersInternalAction favoriteSellersInternalAction2 = favoriteSellersInternalAction;
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowCommonErrorToastBar) {
            return new b.a(((FavoriteSellersInternalAction.ShowCommonErrorToastBar) favoriteSellersInternalAction2).f156019b);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.NextPageLoadingError) {
            return new b.a(((FavoriteSellersInternalAction.NextPageLoadingError) favoriteSellersInternalAction2).f156015d);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowNotificationsDialog) {
            return b.c.f4615a;
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowSnackbarWithUndo) {
            FavoriteSellersInternalAction.ShowSnackbarWithUndo showSnackbarWithUndo = (FavoriteSellersInternalAction.ShowSnackbarWithUndo) favoriteSellersInternalAction2;
            return new b.d(showSnackbarWithUndo.f156024b, showSnackbarWithUndo.f156025c);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowErrorDialog) {
            return new b.C0281b(((FavoriteSellersInternalAction.ShowErrorDialog) favoriteSellersInternalAction2).f156022b);
        }
        if (favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.LoadingError ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.DataLoading ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.DataRefreshing ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.DataLoaded ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ShowEmptyMessage ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.NextPageLoaded ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.NextPageLoadRetry ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ItemsUpdate ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.OnMarkedSellersAsRead ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.OpenSubscriptionSettings ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.SubscriptionSettingsDismissed ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.SubscriptionProgress ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.SubscriptionSuccess ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.DelayedResubscribe ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.OnUndoSnackbarDismissed ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.UnsubscriptionProgress ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.UnsubscriptionSuccess ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ChangeNotificationProgress ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ChangeNotificationSuccess ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.UpdateIsSellersViewed ? true : favoriteSellersInternalAction2 instanceof FavoriteSellersInternalAction.ChangeScreenVisibility) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
