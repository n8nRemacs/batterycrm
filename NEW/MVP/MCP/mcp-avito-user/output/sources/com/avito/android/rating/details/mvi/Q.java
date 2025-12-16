package com.avito.android.rating.details.mvi;

import Cg0.InterfaceC13303a;
import com.avito.android.R;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import com.avito.android.rating.details.mvi.entity.a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/Q;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "LCg0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class Q implements com.avito.android.arch.mvi.t<RatingDetailsInternalAction, InterfaceC13303a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f247263b;

    @Inject
    public Q(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f247263b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13303a b(RatingDetailsInternalAction ratingDetailsInternalAction) {
        RatingDetailsInternalAction ratingDetailsInternalAction2 = ratingDetailsInternalAction;
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenSortDialog) {
            RatingDetailsInternalAction.OpenSortDialog openSortDialog = (RatingDetailsInternalAction.OpenSortDialog) ratingDetailsInternalAction2;
            return new InterfaceC13303a.l(openSortDialog.f247350b, openSortDialog.f247351c);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.FinishLoading) {
            return InterfaceC13303a.n.f2605a;
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenReviewActionsDialog) {
            RatingDetailsInternalAction.OpenReviewActionsDialog openReviewActionsDialog = (RatingDetailsInternalAction.OpenReviewActionsDialog) ratingDetailsInternalAction2;
            return new InterfaceC13303a.j(openReviewActionsDialog.f247345b, openReviewActionsDialog.f247346c, openReviewActionsDialog.f247347d);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenModelReviewActionsDialog) {
            return new InterfaceC13303a.h(((RatingDetailsInternalAction.OpenModelReviewActionsDialog) ratingDetailsInternalAction2).f247342b);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenAddAnswerScreen) {
            RatingDetailsInternalAction.OpenAddAnswerScreen openAddAnswerScreen = (RatingDetailsInternalAction.OpenAddAnswerScreen) ratingDetailsInternalAction2;
            return new InterfaceC13303a.b(openAddAnswerScreen.f247331b, openAddAnswerScreen.f247332c);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenTextSheet) {
            return new InterfaceC13303a.m(((RatingDetailsInternalAction.OpenTextSheet) ratingDetailsInternalAction2).f247352b);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenDeleteReviewConfirmationDialog) {
            RatingDetailsInternalAction.OpenDeleteReviewConfirmationDialog openDeleteReviewConfirmationDialog = (RatingDetailsInternalAction.OpenDeleteReviewConfirmationDialog) ratingDetailsInternalAction2;
            return new InterfaceC13303a.d(openDeleteReviewConfirmationDialog.f247335b, openDeleteReviewConfirmationDialog.f247336c);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenDeleteBuyerReviewConfirmationDialog) {
            RatingDetailsInternalAction.OpenDeleteBuyerReviewConfirmationDialog openDeleteBuyerReviewConfirmationDialog = (RatingDetailsInternalAction.OpenDeleteBuyerReviewConfirmationDialog) ratingDetailsInternalAction2;
            return new InterfaceC13303a.c(openDeleteBuyerReviewConfirmationDialog.f247333b, openDeleteBuyerReviewConfirmationDialog.f247334c);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenGallery) {
            RatingDetailsInternalAction.OpenGallery openGallery = (RatingDetailsInternalAction.OpenGallery) ratingDetailsInternalAction2;
            return new InterfaceC13303a.e(openGallery.f247337b, openGallery.f247338c);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenReviewGallery) {
            RatingDetailsInternalAction.OpenReviewGallery openReviewGallery = (RatingDetailsInternalAction.OpenReviewGallery) ratingDetailsInternalAction2;
            return new InterfaceC13303a.k(openReviewGallery.f247348b, openReviewGallery.f247349c);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenInfoHintDialog) {
            return new InterfaceC13303a.f(((RatingDetailsInternalAction.OpenInfoHintDialog) ratingDetailsInternalAction2).f247339b);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenRatingSummaryScreen) {
            RatingDetailsInternalAction.OpenRatingSummaryScreen openRatingSummaryScreen = (RatingDetailsInternalAction.OpenRatingSummaryScreen) ratingDetailsInternalAction2;
            return new InterfaceC13303a.i(openRatingSummaryScreen.f247343b, openRatingSummaryScreen.f247344c);
        }
        if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.HandleDeeplink) {
            RatingDetailsInternalAction.HandleDeeplink handleDeeplink = (RatingDetailsInternalAction.HandleDeeplink) ratingDetailsInternalAction2;
            this.f247263b.r6(handleDeeplink.f247318d, handleDeeplink.f247316b, handleDeeplink.f247317c);
            G0 g02 = G0.f406611a;
        } else {
            if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.LoadingError) {
                RatingDetailsInternalAction.LoadingError loadingError = (RatingDetailsInternalAction.LoadingError) ratingDetailsInternalAction2;
                return new InterfaceC13303a.q(loadingError.f247328c, loadingError.f247327b, null, null, a.A.f247380a, 0, 44, null);
            }
            if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.SortingError) {
                RatingDetailsInternalAction.SortingError sortingError = (RatingDetailsInternalAction.SortingError) ratingDetailsInternalAction2;
                return new InterfaceC13303a.q(com.avito.android.printable_text.b.c(R.string.rating_details_sorting_error, new Serializable[0]), sortingError.f247370b, com.avito.android.printable_text.b.c(R.string.rating_details_sorting_error_button, new Serializable[0]), sortingError.f247371c, null, 0, 48, null);
            }
            if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.ShowToastBar) {
                RatingDetailsInternalAction.ShowToastBar showToastBar = (RatingDetailsInternalAction.ShowToastBar) ratingDetailsInternalAction2;
                return new InterfaceC13303a.r(showToastBar.f247365b, showToastBar.f247366c, showToastBar.f247367d, showToastBar.f247368e);
            }
            if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.ShowErrorToastBar) {
                RatingDetailsInternalAction.ShowErrorToastBar showErrorToastBar = (RatingDetailsInternalAction.ShowErrorToastBar) ratingDetailsInternalAction2;
                return new InterfaceC13303a.q(showErrorToastBar.f247358b, showErrorToastBar.f247359c, showErrorToastBar.f247360d, showErrorToastBar.f247361e, showErrorToastBar.f247362f, showErrorToastBar.f247363g);
            }
            if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.ReviewDeletedExternal) {
                return new InterfaceC13303a.p(((RatingDetailsInternalAction.ReviewDeletedExternal) ratingDetailsInternalAction2).f247356b);
            }
            if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.OpenInfoScreen) {
                RatingDetailsInternalAction.OpenInfoScreen openInfoScreen = (RatingDetailsInternalAction.OpenInfoScreen) ratingDetailsInternalAction2;
                return new InterfaceC13303a.g(openInfoScreen.f247340b, openInfoScreen.f247341c);
            }
            if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.Close) {
                return InterfaceC13303a.C0120a.f2582a;
            }
            if (ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.RefreshScreen) {
                ((RatingDetailsInternalAction.RefreshScreen) ratingDetailsInternalAction2).getClass();
                return new InterfaceC13303a.o();
            }
            if (!(ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.Loading ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.Loaded ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.NextPageLoaded ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.UpdateAnswerAndActions ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.ReviewDeleted ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.ReviewRevertSuccess ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.InitLoadingError ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.ShowLoadingItem ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.CommentButtonVisibilityChanged ? true : ratingDetailsInternalAction2 instanceof RatingDetailsInternalAction.StartLoading ? true : ratingDetailsInternalAction2.equals(RatingDetailsInternalAction.AspectsTooltipShown.f247312b) ? true : ratingDetailsInternalAction2.equals(RatingDetailsInternalAction.SortTooltipShown.f247369b))) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
