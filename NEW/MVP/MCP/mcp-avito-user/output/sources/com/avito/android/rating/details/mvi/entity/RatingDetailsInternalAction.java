package com.avito.android.rating.details.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.R;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating.details.mvi.entity.b;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.rating_details_mvi.RatingDetailsResult;
import com.avito.android.remote.model.rating_details_mvi.ReviewEntry;
import com.avito.android.remote.model.rating_details_mvi.SearchParametersEntry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingDetailsInternalAction.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:!\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"\u0082\u0001!#$%&'()*+,-./0123456789:;<=>?@ABC¨\u0006D"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AspectsTooltipShown", "Close", "CommentButtonVisibilityChanged", "FinishLoading", "HandleDeeplink", "InitLoadingError", "Loaded", "Loading", "LoadingError", "NextPageLoaded", "OpenAddAnswerScreen", "OpenDeleteBuyerReviewConfirmationDialog", "OpenDeleteReviewConfirmationDialog", "OpenGallery", "OpenInfoHintDialog", "OpenInfoScreen", "OpenModelReviewActionsDialog", "OpenRatingSummaryScreen", "OpenReviewActionsDialog", "OpenReviewGallery", "OpenSortDialog", "OpenTextSheet", "RefreshScreen", "ReviewDeleted", "ReviewDeletedExternal", "ReviewRevertSuccess", "ShowErrorToastBar", "ShowLoadingItem", "ShowToastBar", "SortTooltipShown", "SortingError", "StartLoading", "UpdateAnswerAndActions", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$AspectsTooltipShown;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$Close;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$CommentButtonVisibilityChanged;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$FinishLoading;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$HandleDeeplink;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$InitLoadingError;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$Loaded;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$Loading;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$LoadingError;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$NextPageLoaded;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenAddAnswerScreen;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenDeleteBuyerReviewConfirmationDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenDeleteReviewConfirmationDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenGallery;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenInfoHintDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenInfoScreen;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenModelReviewActionsDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenRatingSummaryScreen;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenReviewActionsDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenReviewGallery;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenSortDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenTextSheet;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$RefreshScreen;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ReviewDeleted;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ReviewDeletedExternal;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ReviewRevertSuccess;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ShowErrorToastBar;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ShowLoadingItem;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ShowToastBar;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$SortTooltipShown;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$SortingError;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$StartLoading;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$UpdateAnswerAndActions;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingDetailsInternalAction extends n {

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$AspectsTooltipShown;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AspectsTooltipShown implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final AspectsTooltipShown f247312b = new AspectsTooltipShown();

        private AspectsTooltipShown() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof AspectsTooltipShown);
        }

        public final int hashCode() {
            return 1120613320;
        }

        @k
        public final String toString() {
            return "AspectsTooltipShown";
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$Close;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f247313b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1502941815;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$CommentButtonVisibilityChanged;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CommentButtonVisibilityChanged implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f247314b;

        public CommentButtonVisibilityChanged(boolean z12) {
            this.f247314b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommentButtonVisibilityChanged) && this.f247314b == ((CommentButtonVisibilityChanged) obj).f247314b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f247314b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("CommentButtonVisibilityChanged(isVisible="), this.f247314b, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$FinishLoading;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FinishLoading implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final FinishLoading f247315b = new FinishLoading();

        private FinishLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof FinishLoading);
        }

        public final int hashCode() {
            return 191198888;
        }

        @k
        public final String toString() {
            return "FinishLoading";
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$InitLoadingError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitLoadingError implements TrackableError, RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f247319b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f247320c;

        public InitLoadingError(@k Throwable th2) {
            this.f247319b = th2;
            this.f247320c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitLoadingError) && L.f(this.f247319b, ((InitLoadingError) obj).f247319b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF202131c() {
            return this.f247320c;
        }

        public final int hashCode() {
            return this.f247319b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("InitLoadingError(error="), this.f247319b, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$Loaded;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loaded implements RatingDetailsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RatingDetailsResult f247321b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f247322c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f247323d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f247324e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f247325f;

        public Loaded(@k RatingDetailsResult ratingDetailsResult, boolean z12, boolean z13, boolean z14, boolean z15) {
            this.f247321b = ratingDetailsResult;
            this.f247322c = z12;
            this.f247323d = z13;
            this.f247324e = z14;
            this.f247325f = z15;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return L.f(this.f247321b, loaded.f247321b) && this.f247322c == loaded.f247322c && this.f247323d == loaded.f247323d && this.f247324e == loaded.f247324e && this.f247325f == loaded.f247325f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f247325f) + r.i(r.i(r.i(this.f247321b.hashCode() * 31, 31, this.f247322c), 31, this.f247323d), 31, this.f247324e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Loaded(result=");
            sb2.append(this.f247321b);
            sb2.append(", isSortApplied=");
            sb2.append(this.f247322c);
            sb2.append(", ratingLLMSummaryFeedbackWasSent=");
            sb2.append(this.f247323d);
            sb2.append(", aspectsTooltipWasShown=");
            sb2.append(this.f247324e);
            sb2.append(", sortTooltipWasShown=");
            return r.x(sb2, this.f247325f, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$Loading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends TrackableLoadingStarted implements RatingDetailsInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final b.e f247326d;

        public Loading(@k b.e eVar) {
            this.f247326d = eVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && L.f(this.f247326d, ((Loading) obj).f247326d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f247326d.hashCode();
        }

        @k
        public final String toString() {
            return "Loading(loadingProgressType=" + this.f247326d + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$NextPageLoaded;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NextPageLoaded implements RatingDetailsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RatingDetailsResult f247330b;

        public NextPageLoaded(@k RatingDetailsResult ratingDetailsResult) {
            this.f247330b = ratingDetailsResult;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NextPageLoaded) && L.f(this.f247330b, ((NextPageLoaded) obj).f247330b);
        }

        public final int hashCode() {
            return this.f247330b.hashCode();
        }

        @k
        public final String toString() {
            return "NextPageLoaded(result=" + this.f247330b + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenAddAnswerScreen;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAddAnswerScreen implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f247331b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation f247332c;

        public OpenAddAnswerScreen(@l Long l12, @l BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation) {
            this.f247331b = l12;
            this.f247332c = reviewActionAnswerLengthValidation;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAddAnswerScreen)) {
                return false;
            }
            OpenAddAnswerScreen openAddAnswerScreen = (OpenAddAnswerScreen) obj;
            return L.f(this.f247331b, openAddAnswerScreen.f247331b) && L.f(this.f247332c, openAddAnswerScreen.f247332c);
        }

        public final int hashCode() {
            Long l12 = this.f247331b;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            BaseRatingReviewItem.ReviewAction.ReviewActionValue.ReviewActionAnswerLengthValidation reviewActionAnswerLengthValidation = this.f247332c;
            return iHashCode + (reviewActionAnswerLengthValidation != null ? reviewActionAnswerLengthValidation.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenAddAnswerScreen(reviewId=" + this.f247331b + ", lengthValidation=" + this.f247332c + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenDeleteBuyerReviewConfirmationDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeleteBuyerReviewConfirmationDialog implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f247333b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final BaseRatingReviewItem.ReviewAction.ConfirmDialog f247334c;

        public OpenDeleteBuyerReviewConfirmationDialog(long j12, @k BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog) {
            this.f247333b = j12;
            this.f247334c = confirmDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeleteBuyerReviewConfirmationDialog)) {
                return false;
            }
            OpenDeleteBuyerReviewConfirmationDialog openDeleteBuyerReviewConfirmationDialog = (OpenDeleteBuyerReviewConfirmationDialog) obj;
            return this.f247333b == openDeleteBuyerReviewConfirmationDialog.f247333b && L.f(this.f247334c, openDeleteBuyerReviewConfirmationDialog.f247334c);
        }

        public final int hashCode() {
            return this.f247334c.hashCode() + (Long.hashCode(this.f247333b) * 31);
        }

        @k
        public final String toString() {
            return "OpenDeleteBuyerReviewConfirmationDialog(reviewId=" + this.f247333b + ", reviewConfirmation=" + this.f247334c + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenDeleteReviewConfirmationDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeleteReviewConfirmationDialog implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f247335b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final BaseRatingReviewItem.ReviewAction.ConfirmDialog f247336c;

        public OpenDeleteReviewConfirmationDialog(long j12, @k BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog) {
            this.f247335b = j12;
            this.f247336c = confirmDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeleteReviewConfirmationDialog)) {
                return false;
            }
            OpenDeleteReviewConfirmationDialog openDeleteReviewConfirmationDialog = (OpenDeleteReviewConfirmationDialog) obj;
            return this.f247335b == openDeleteReviewConfirmationDialog.f247335b && L.f(this.f247336c, openDeleteReviewConfirmationDialog.f247336c);
        }

        public final int hashCode() {
            return this.f247336c.hashCode() + (Long.hashCode(this.f247335b) * 31);
        }

        @k
        public final String toString() {
            return "OpenDeleteReviewConfirmationDialog(reviewId=" + this.f247335b + ", reviewConfirmation=" + this.f247336c + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenGallery;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenGallery implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Image> f247337b;

        /* renamed from: c, reason: collision with root package name */
        public final int f247338c;

        public OpenGallery(@k List<Image> list, int i12) {
            this.f247337b = list;
            this.f247338c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenGallery)) {
                return false;
            }
            OpenGallery openGallery = (OpenGallery) obj;
            return L.f(this.f247337b, openGallery.f247337b) && this.f247338c == openGallery.f247338c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f247338c) + (this.f247337b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGallery(images=");
            sb2.append(this.f247337b);
            sb2.append(", position=");
            return r.t(sb2, this.f247338c, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenInfoHintDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenInfoHintDialog implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RatingInfoWithHintItem.Hint f247339b;

        public OpenInfoHintDialog(@k RatingInfoWithHintItem.Hint hint) {
            this.f247339b = hint;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenInfoHintDialog) && L.f(this.f247339b, ((OpenInfoHintDialog) obj).f247339b);
        }

        public final int hashCode() {
            return this.f247339b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenInfoHintDialog(hint=" + this.f247339b + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenInfoScreen;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenInfoScreen implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f247340b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final BaseRatingReviewItem.ReviewAction.ReviewActionValue f247341c;

        public OpenInfoScreen(@l Long l12, @k BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue) {
            this.f247340b = l12;
            this.f247341c = reviewActionValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenInfoScreen)) {
                return false;
            }
            OpenInfoScreen openInfoScreen = (OpenInfoScreen) obj;
            return L.f(this.f247340b, openInfoScreen.f247340b) && L.f(this.f247341c, openInfoScreen.f247341c);
        }

        public final int hashCode() {
            Long l12 = this.f247340b;
            return this.f247341c.hashCode() + ((l12 == null ? 0 : l12.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "OpenInfoScreen(reviewId=" + this.f247340b + ", value=" + this.f247341c + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenModelReviewActionsDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenModelReviewActionsDialog implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.rating_ui.reviews.model_review.a f247342b;

        public OpenModelReviewActionsDialog(@k com.avito.android.rating_ui.reviews.model_review.a aVar) {
            this.f247342b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenModelReviewActionsDialog) && L.f(this.f247342b, ((OpenModelReviewActionsDialog) obj).f247342b);
        }

        public final int hashCode() {
            return this.f247342b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenModelReviewActionsDialog(modelReview=" + this.f247342b + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenRatingSummaryScreen;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenRatingSummaryScreen implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f247343b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f247344c;

        public OpenRatingSummaryScreen(@k String str, @k ArrayList arrayList) {
            this.f247343b = str;
            this.f247344c = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenRatingSummaryScreen)) {
                return false;
            }
            OpenRatingSummaryScreen openRatingSummaryScreen = (OpenRatingSummaryScreen) obj;
            return L.f(this.f247343b, openRatingSummaryScreen.f247343b) && this.f247344c.equals(openRatingSummaryScreen.f247344c);
        }

        public final int hashCode() {
            return this.f247344c.hashCode() + (this.f247343b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenRatingSummaryScreen(title=");
            sb2.append(this.f247343b);
            sb2.append(", summaryScoresData=");
            return e.p(sb2, this.f247344c, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenReviewActionsDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenReviewActionsDialog implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BaseRatingReviewItem f247345b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<BaseRatingReviewItem.ReviewAction> f247346c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f247347d;

        public OpenReviewActionsDialog(@k BaseRatingReviewItem baseRatingReviewItem, @k List<BaseRatingReviewItem.ReviewAction> list, @l String str) {
            this.f247345b = baseRatingReviewItem;
            this.f247346c = list;
            this.f247347d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenReviewActionsDialog)) {
                return false;
            }
            OpenReviewActionsDialog openReviewActionsDialog = (OpenReviewActionsDialog) obj;
            return L.f(this.f247345b, openReviewActionsDialog.f247345b) && L.f(this.f247346c, openReviewActionsDialog.f247346c) && L.f(this.f247347d, openReviewActionsDialog.f247347d);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f247345b.hashCode() * 31, 31, this.f247346c);
            String str = this.f247347d;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenReviewActionsDialog(review=");
            sb2.append(this.f247345b);
            sb2.append(", actions=");
            sb2.append(this.f247346c);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f247347d, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenReviewGallery;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenReviewGallery implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GalleryItem f247348b;

        /* renamed from: c, reason: collision with root package name */
        public final int f247349c;

        public OpenReviewGallery(@k GalleryItem galleryItem, int i12) {
            this.f247348b = galleryItem;
            this.f247349c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenReviewGallery)) {
                return false;
            }
            OpenReviewGallery openReviewGallery = (OpenReviewGallery) obj;
            return L.f(this.f247348b, openReviewGallery.f247348b) && this.f247349c == openReviewGallery.f247349c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f247349c) + (this.f247348b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenReviewGallery(galleryItem=");
            sb2.append(this.f247348b);
            sb2.append(", position=");
            return r.t(sb2, this.f247349c, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenSortDialog;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSortDialog implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f247350b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<SearchParametersEntry.SearchParametersBlock.Sort.SortOption> f247351c;

        public OpenSortDialog(@l String str, @k List<SearchParametersEntry.SearchParametersBlock.Sort.SortOption> list) {
            this.f247350b = str;
            this.f247351c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSortDialog)) {
                return false;
            }
            OpenSortDialog openSortDialog = (OpenSortDialog) obj;
            return L.f(this.f247350b, openSortDialog.f247350b) && L.f(this.f247351c, openSortDialog.f247351c);
        }

        public final int hashCode() {
            String str = this.f247350b;
            return this.f247351c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSortDialog(selectedOption=");
            sb2.append(this.f247350b);
            sb2.append(", options=");
            return H.p(sb2, this.f247351c, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$OpenTextSheet;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenTextSheet implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BaseRatingReviewItem.ReviewAction.ReviewActionValue f247352b;

        public OpenTextSheet(@k BaseRatingReviewItem.ReviewAction.ReviewActionValue reviewActionValue) {
            this.f247352b = reviewActionValue;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenTextSheet) && L.f(this.f247352b, ((OpenTextSheet) obj).f247352b);
        }

        public final int hashCode() {
            return this.f247352b.hashCode();
        }

        @k
        public final String toString() {
            return "OpenTextSheet(actionValue=" + this.f247352b + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$RefreshScreen;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefreshScreen implements RatingDetailsInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefreshScreen)) {
                return false;
            }
            ((RefreshScreen) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(true);
        }

        @k
        public final String toString() {
            return "RefreshScreen(withDelay=true)";
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ReviewDeleted;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewDeleted implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f247353b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Uri f247354c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final b.c f247355d;

        public ReviewDeleted(@k ArrayList arrayList, @l Uri uri, @l b.c cVar) {
            this.f247353b = arrayList;
            this.f247354c = uri;
            this.f247355d = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewDeleted)) {
                return false;
            }
            ReviewDeleted reviewDeleted = (ReviewDeleted) obj;
            return this.f247353b.equals(reviewDeleted.f247353b) && L.f(this.f247354c, reviewDeleted.f247354c) && L.f(this.f247355d, reviewDeleted.f247355d);
        }

        public final int hashCode() {
            int iHashCode = this.f247353b.hashCode() * 31;
            Uri uri = this.f247354c;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            b.c cVar = this.f247355d;
            return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ReviewDeleted(newItems=" + this.f247353b + ", newNextPage=" + this.f247354c + ", deletedReview=" + this.f247355d + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ReviewDeletedExternal;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewDeletedExternal implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f247356b;

        public ReviewDeletedExternal(long j12) {
            this.f247356b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReviewDeletedExternal) && this.f247356b == ((ReviewDeletedExternal) obj).f247356b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f247356b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("ReviewDeletedExternal(reviewId="), this.f247356b, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ReviewRevertSuccess;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReviewRevertSuccess implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ReviewRevertSuccess f247357b = new ReviewRevertSuccess();

        private ReviewRevertSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ReviewRevertSuccess);
        }

        public final int hashCode() {
            return 825726790;
        }

        @k
        public final String toString() {
            return "ReviewRevertSuccess";
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ShowErrorToastBar;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToastBar implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f247358b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f247359c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final PrintableText f247360d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final a f247361e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final a f247362f;

        /* renamed from: g, reason: collision with root package name */
        public final int f247363g;

        public ShowErrorToastBar(PrintableText printableText, Throwable th2, PrintableText printableText2, a aVar, a aVar2, int i12, int i13, C42822w c42822w) {
            th2 = (i13 & 2) != 0 ? null : th2;
            printableText2 = (i13 & 4) != 0 ? null : printableText2;
            aVar = (i13 & 8) != 0 ? null : aVar;
            aVar2 = (i13 & 16) != 0 ? null : aVar2;
            i12 = (i13 & 32) != 0 ? 2750 : i12;
            this.f247358b = printableText;
            this.f247359c = th2;
            this.f247360d = printableText2;
            this.f247361e = aVar;
            this.f247362f = aVar2;
            this.f247363g = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorToastBar)) {
                return false;
            }
            ShowErrorToastBar showErrorToastBar = (ShowErrorToastBar) obj;
            return L.f(this.f247358b, showErrorToastBar.f247358b) && L.f(this.f247359c, showErrorToastBar.f247359c) && L.f(this.f247360d, showErrorToastBar.f247360d) && L.f(this.f247361e, showErrorToastBar.f247361e) && L.f(this.f247362f, showErrorToastBar.f247362f) && this.f247363g == showErrorToastBar.f247363g;
        }

        public final int hashCode() {
            int iHashCode = this.f247358b.hashCode() * 31;
            Throwable th2 = this.f247359c;
            int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
            PrintableText printableText = this.f247360d;
            int iHashCode3 = (iHashCode2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
            a aVar = this.f247361e;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.f247362f;
            return Integer.hashCode(this.f247363g) + ((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToastBar(message=");
            sb2.append(this.f247358b);
            sb2.append(", error=");
            sb2.append(this.f247359c);
            sb2.append(", actionText=");
            sb2.append(this.f247360d);
            sb2.append(", action=");
            sb2.append(this.f247361e);
            sb2.append(", onDismissedAction=");
            sb2.append(this.f247362f);
            sb2.append(", duration=");
            return r.t(sb2, this.f247363g, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ShowLoadingItem;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoadingItem implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoadingItem f247364b = new ShowLoadingItem();

        private ShowLoadingItem() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLoadingItem);
        }

        public final int hashCode() {
            return 982757617;
        }

        @k
        public final String toString() {
            return "ShowLoadingItem";
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$SortTooltipShown;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SortTooltipShown implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SortTooltipShown f247369b = new SortTooltipShown();

        private SortTooltipShown() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SortTooltipShown);
        }

        public final int hashCode() {
            return 548958637;
        }

        @k
        public final String toString() {
            return "SortTooltipShown";
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$SortingError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SortingError implements TrackableError, RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f247370b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final a f247371c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f247372d;

        public SortingError(@k Throwable th2, @l a aVar) {
            this.f247370b = th2;
            this.f247371c = aVar;
            this.f247372d = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortingError)) {
                return false;
            }
            SortingError sortingError = (SortingError) obj;
            return L.f(this.f247370b, sortingError.f247370b) && L.f(this.f247371c, sortingError.f247371c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF202131c() {
            return this.f247372d;
        }

        public final int hashCode() {
            int iHashCode = this.f247370b.hashCode() * 31;
            a aVar = this.f247371c;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @k
        public final String toString() {
            return "SortingError(error=" + this.f247370b + ", toastBarAction=" + this.f247371c + ')';
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$StartLoading;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartLoading implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f247373b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f247374c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f247375d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f247376e;

        public StartLoading(@l String str, @l String str2, @l String str3, @l String str4) {
            this.f247373b = str;
            this.f247374c = str2;
            this.f247375d = str3;
            this.f247376e = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartLoading)) {
                return false;
            }
            StartLoading startLoading = (StartLoading) obj;
            return L.f(this.f247373b, startLoading.f247373b) && L.f(this.f247374c, startLoading.f247374c) && L.f(this.f247375d, startLoading.f247375d) && L.f(this.f247376e, startLoading.f247376e);
        }

        public final int hashCode() {
            String str = this.f247373b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f247374c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f247375d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f247376e;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StartLoading(selectedSearchParamName=");
            sb2.append(this.f247373b);
            sb2.append(", selectedSearchParamValue=");
            sb2.append(this.f247374c);
            sb2.append(", selectedAspectParamName=");
            sb2.append(this.f247375d);
            sb2.append(", selectedAspectParamValue=");
            return C22026a.c(sb2, this.f247376e, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$UpdateAnswerAndActions;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateAnswerAndActions implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f247377b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final BaseRatingReviewItem.ReviewAnswer f247378c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<ReviewEntry.Action> f247379d;

        public UpdateAnswerAndActions(long j12, @l BaseRatingReviewItem.ReviewAnswer reviewAnswer, @k List<ReviewEntry.Action> list) {
            this.f247377b = j12;
            this.f247378c = reviewAnswer;
            this.f247379d = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateAnswerAndActions)) {
                return false;
            }
            UpdateAnswerAndActions updateAnswerAndActions = (UpdateAnswerAndActions) obj;
            return this.f247377b == updateAnswerAndActions.f247377b && L.f(this.f247378c, updateAnswerAndActions.f247378c) && L.f(this.f247379d, updateAnswerAndActions.f247379d);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f247377b) * 31;
            BaseRatingReviewItem.ReviewAnswer reviewAnswer = this.f247378c;
            return this.f247379d.hashCode() + ((iHashCode + (reviewAnswer == null ? 0 : reviewAnswer.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateAnswerAndActions(reviewId=");
            sb2.append(this.f247377b);
            sb2.append(", answer=");
            sb2.append(this.f247378c);
            sb2.append(", actions=");
            return H.p(sb2, this.f247379d, ')');
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$HandleDeeplink;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleDeeplink implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f247316b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f247317c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Bundle f247318d;

        public HandleDeeplink(@l Bundle bundle, @k DeepLink deepLink, @l String str) {
            this.f247316b = deepLink;
            this.f247317c = str;
            this.f247318d = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleDeeplink)) {
                return false;
            }
            HandleDeeplink handleDeeplink = (HandleDeeplink) obj;
            return L.f(this.f247316b, handleDeeplink.f247316b) && L.f(this.f247317c, handleDeeplink.f247317c) && L.f(this.f247318d, handleDeeplink.f247318d);
        }

        public final int hashCode() {
            int iHashCode = this.f247316b.hashCode() * 31;
            String str = this.f247317c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Bundle bundle = this.f247318d;
            return iHashCode2 + (bundle != null ? bundle.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f247316b);
            sb2.append(", requestKey=");
            sb2.append(this.f247317c);
            sb2.append(", args=");
            return H.m(sb2, this.f247318d, ')');
        }

        public /* synthetic */ HandleDeeplink(DeepLink deepLink, String str, Bundle bundle, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? null : bundle, deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$LoadingError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements TrackableError, RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f247327b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f247328c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f247329d;

        public LoadingError(@k PrintableText printableText, @k Throwable th2) {
            this.f247327b = th2;
            this.f247328c = printableText;
            this.f247329d = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF202133d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingError)) {
                return false;
            }
            LoadingError loadingError = (LoadingError) obj;
            return L.f(this.f247327b, loadingError.f247327b) && L.f(this.f247328c, loadingError.f247328c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF202131c() {
            return this.f247329d;
        }

        public final int hashCode() {
            return this.f247328c.hashCode() + (this.f247327b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadingError(error=");
            sb2.append(this.f247327b);
            sb2.append(", message=");
            return c.m(sb2, this.f247328c, ')');
        }

        public /* synthetic */ LoadingError(Throwable th2, PrintableText printableText, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? com.avito.android.printable_text.b.c(R.string.rating_details_loading_error_try_again, new Serializable[0]) : printableText, th2);
        }
    }

    /* compiled from: RatingDetailsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction$ShowToastBar;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToastBar implements RatingDetailsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f247365b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f247366c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final a f247367d;

        /* renamed from: e, reason: collision with root package name */
        public final int f247368e;

        public ShowToastBar(@k String str, @l String str2, @l a aVar, int i12) {
            this.f247365b = str;
            this.f247366c = str2;
            this.f247367d = aVar;
            this.f247368e = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToastBar)) {
                return false;
            }
            ShowToastBar showToastBar = (ShowToastBar) obj;
            return L.f(this.f247365b, showToastBar.f247365b) && L.f(this.f247366c, showToastBar.f247366c) && L.f(this.f247367d, showToastBar.f247367d) && this.f247368e == showToastBar.f247368e;
        }

        public final int hashCode() {
            int iHashCode = this.f247365b.hashCode() * 31;
            String str = this.f247366c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            a aVar = this.f247367d;
            return Integer.hashCode(this.f247368e) + ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowToastBar(message=");
            sb2.append(this.f247365b);
            sb2.append(", actionText=");
            sb2.append(this.f247366c);
            sb2.append(", action=");
            sb2.append(this.f247367d);
            sb2.append(", duration=");
            return r.t(sb2, this.f247368e, ')');
        }

        public /* synthetic */ ShowToastBar(String str, String str2, a aVar, int i12, int i13, C42822w c42822w) {
            this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : aVar, (i13 & 8) != 0 ? 2750 : i12);
        }
    }
}
