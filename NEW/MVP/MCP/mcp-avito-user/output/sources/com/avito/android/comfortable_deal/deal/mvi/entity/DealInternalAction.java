package com.avito.android.comfortable_deal.deal.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.comfortable_deal.api.model.ActionTransition;
import com.avito.android.comfortable_deal.api.model.AgentRoomDealResponse;
import com.avito.android.comfortable_deal.api.model.TeamMemberPhone;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.comfortable_deal.end_deal.model.EndDealSavedState;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import cq.C39396a;
import dp.f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealInternalAction.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001: \u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\u0082\u0001 \"#$%&'()*+,-./0123456789:;<=>?@A¨\u0006B"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CallLoaded", "Close", "HideMortgageBanner", "LoadingCommentsError", "LoadingCommentsStarted", "LoadingCommentsSuccess", "LoadingError", "OpenAddCommentDialog", "OpenAgentItem", "OpenDeepLink", "OpenRecallRequestDialogClicked", "OpenSellerItem", "OpenSoldTransitionDialog", "OpenTransitionDialog", "PhoneCall", "PlaybackError", "RecallRequestSubmitResult", "RecallRequestSubmitStarted", "ReloadVdrList", "ScreenDataLoaded", "SelectAgent", "ShowSaveCommentDialog", "ShowSaveEndDealDataDialog", "ShowSaveTransitionDataDialog", "SpeedChangeDialog", "StartLoading", "UpdateComment", "UpdateCommentsFilter", "UpdateEndDealData", "UpdateSpeed", "UpdateTransitionData", "WrongPhoneError", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$CallLoaded;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$Close;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$HideMortgageBanner;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$LoadingCommentsError;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$LoadingCommentsStarted;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$LoadingCommentsSuccess;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$LoadingError;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenAddCommentDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenAgentItem;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenDeepLink;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenRecallRequestDialogClicked;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenSellerItem;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenSoldTransitionDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenTransitionDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$PhoneCall;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$PlaybackError;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$RecallRequestSubmitResult;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$RecallRequestSubmitStarted;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ReloadVdrList;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ScreenDataLoaded;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$SelectAgent;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ShowSaveCommentDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ShowSaveEndDealDataDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ShowSaveTransitionDataDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$SpeedChangeDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$StartLoading;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateComment;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateCommentsFilter;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateEndDealData;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateSpeed;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateTransitionData;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$WrongPhoneError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DealInternalAction extends n {

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$CallLoaded;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallLoaded implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f121603b;

        public CallLoaded(@k Uri uri) {
            this.f121603b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallLoaded) && L.f(this.f121603b, ((CallLoaded) obj).f121603b);
        }

        public final int hashCode() {
            return this.f121603b.hashCode();
        }

        @k
        public final String toString() {
            return a.t(new StringBuilder("CallLoaded(uri="), this.f121603b, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$Close;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f121604b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1351145250;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$HideMortgageBanner;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideMortgageBanner implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideMortgageBanner f121605b = new HideMortgageBanner();

        private HideMortgageBanner() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideMortgageBanner);
        }

        public final int hashCode() {
            return 346932192;
        }

        @k
        public final String toString() {
            return "HideMortgageBanner";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$LoadingCommentsError;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingCommentsError implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f121606b;

        public LoadingCommentsError(@k ApiError apiError) {
            this.f121606b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingCommentsError) && L.f(this.f121606b, ((LoadingCommentsError) obj).f121606b);
        }

        public final int hashCode() {
            return this.f121606b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingCommentsError(error="), this.f121606b, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$LoadingCommentsStarted;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingCommentsStarted implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LoadingCommentsStarted f121607b = new LoadingCommentsStarted();

        private LoadingCommentsStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LoadingCommentsStarted);
        }

        public final int hashCode() {
            return -545712345;
        }

        @k
        public final String toString() {
            return "LoadingCommentsStarted";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$LoadingCommentsSuccess;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingCommentsSuccess implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<f> f121608b;

        public LoadingCommentsSuccess(@k List<f> list) {
            this.f121608b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingCommentsSuccess) && L.f(this.f121608b, ((LoadingCommentsSuccess) obj).f121608b);
        }

        public final int hashCode() {
            return this.f121608b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("LoadingCommentsSuccess(comments="), this.f121608b, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$LoadingError;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements DealInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f121609b;

        public LoadingError(@k ApiError apiError) {
            this.f121609b = apiError;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && L.f(this.f121609b, ((LoadingError) obj).f121609b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF314423d() {
            return new J.a(this.f121609b);
        }

        public final int hashCode() {
            return this.f121609b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f121609b, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenAddCommentDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAddCommentDialog implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f121610b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f121611c;

        public OpenAddCommentDialog(@l String str, @k String str2) {
            this.f121610b = str;
            this.f121611c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenAddCommentDialog)) {
                return false;
            }
            OpenAddCommentDialog openAddCommentDialog = (OpenAddCommentDialog) obj;
            return L.f(this.f121610b, openAddCommentDialog.f121610b) && L.f(this.f121611c, openAddCommentDialog.f121611c);
        }

        public final int hashCode() {
            String str = this.f121610b;
            return this.f121611c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenAddCommentDialog(comment=");
            sb2.append(this.f121610b);
            sb2.append(", dealId=");
            return C22026a.c(sb2, this.f121611c, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenAgentItem;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAgentItem implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f121612b;

        public OpenAgentItem(@k DeepLink deepLink) {
            this.f121612b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAgentItem) && L.f(this.f121612b, ((OpenAgentItem) obj).f121612b);
        }

        public final int hashCode() {
            return this.f121612b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenAgentItem(deepLink="), this.f121612b, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenDeepLink;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f121613b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f121614c;

        public OpenDeepLink(@k DeepLink deepLink, @l Bundle bundle) {
            this.f121613b = deepLink;
            this.f121614c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeepLink)) {
                return false;
            }
            OpenDeepLink openDeepLink = (OpenDeepLink) obj;
            return L.f(this.f121613b, openDeepLink.f121613b) && L.f(this.f121614c, openDeepLink.f121614c);
        }

        public final int hashCode() {
            int iHashCode = this.f121613b.hashCode() * 31;
            Bundle bundle = this.f121614c;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f121613b);
            sb2.append(", args=");
            return H.m(sb2, this.f121614c, ')');
        }

        public /* synthetic */ OpenDeepLink(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenRecallRequestDialogClicked;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenRecallRequestDialogClicked implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f121615b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f121616c;

        public OpenRecallRequestDialogClicked(String str, String str2, int i12, C42822w c42822w) {
            this.f121615b = (i12 & 1) != 0 ? null : str;
            this.f121616c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenRecallRequestDialogClicked)) {
                return false;
            }
            OpenRecallRequestDialogClicked openRecallRequestDialogClicked = (OpenRecallRequestDialogClicked) obj;
            return L.f(this.f121615b, openRecallRequestDialogClicked.f121615b) && L.f(this.f121616c, openRecallRequestDialogClicked.f121616c);
        }

        public final int hashCode() {
            String str = this.f121615b;
            return this.f121616c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenRecallRequestDialogClicked(phone=");
            sb2.append(this.f121615b);
            sb2.append(", requestId=");
            return C22026a.c(sb2, this.f121616c, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenSellerItem;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSellerItem implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f121617b;

        public OpenSellerItem(@k DeepLink deepLink) {
            this.f121617b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSellerItem) && L.f(this.f121617b, ((OpenSellerItem) obj).f121617b);
        }

        public final int hashCode() {
            return this.f121617b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OpenSellerItem(deepLink="), this.f121617b, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenSoldTransitionDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSoldTransitionDialog implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f121618b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f121619c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f121620d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f121621e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final ActionTransition f121622f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final EndDealSavedState f121623g;

        public OpenSoldTransitionDialog(@k String str, @l String str2, @l String str3, @l String str4, @k ActionTransition actionTransition, @l EndDealSavedState endDealSavedState) {
            this.f121618b = str;
            this.f121619c = str2;
            this.f121620d = str3;
            this.f121621e = str4;
            this.f121622f = actionTransition;
            this.f121623g = endDealSavedState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSoldTransitionDialog)) {
                return false;
            }
            OpenSoldTransitionDialog openSoldTransitionDialog = (OpenSoldTransitionDialog) obj;
            return L.f(this.f121618b, openSoldTransitionDialog.f121618b) && L.f(this.f121619c, openSoldTransitionDialog.f121619c) && L.f(this.f121620d, openSoldTransitionDialog.f121620d) && L.f(this.f121621e, openSoldTransitionDialog.f121621e) && this.f121622f == openSoldTransitionDialog.f121622f && L.f(this.f121623g, openSoldTransitionDialog.f121623g);
        }

        public final int hashCode() {
            int iHashCode = this.f121618b.hashCode() * 31;
            String str = this.f121619c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f121620d;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f121621e;
            int iHashCode4 = (this.f121622f.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            EndDealSavedState endDealSavedState = this.f121623g;
            return iHashCode4 + (endDealSavedState != null ? endDealSavedState.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenSoldTransitionDialog(dealId=" + this.f121618b + ", itemId=" + this.f121619c + ", agencyId=" + this.f121620d + ", agentId=" + this.f121621e + ", transition=" + this.f121622f + ", savedState=" + this.f121623g + ')';
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$OpenTransitionDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenTransitionDialog implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f121624b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ActionTransition f121625c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Map<String, StageTransitionField> f121626d;

        /* JADX WARN: Multi-variable type inference failed */
        public OpenTransitionDialog(@k String str, @k ActionTransition actionTransition, @k Map<String, ? extends StageTransitionField> map) {
            this.f121624b = str;
            this.f121625c = actionTransition;
            this.f121626d = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenTransitionDialog)) {
                return false;
            }
            OpenTransitionDialog openTransitionDialog = (OpenTransitionDialog) obj;
            return L.f(this.f121624b, openTransitionDialog.f121624b) && this.f121625c == openTransitionDialog.f121625c && L.f(this.f121626d, openTransitionDialog.f121626d);
        }

        public final int hashCode() {
            return this.f121626d.hashCode() + ((this.f121625c.hashCode() + (this.f121624b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenTransitionDialog(dealId=");
            sb2.append(this.f121624b);
            sb2.append(", transition=");
            sb2.append(this.f121625c);
            sb2.append(", fields=");
            return r.w(sb2, this.f121626d, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$PhoneCall;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneCall implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f121627b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f121628c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final TeamMemberPhone f121629d;

        public PhoneCall(@k String str, @k String str2, @k TeamMemberPhone teamMemberPhone) {
            this.f121627b = str;
            this.f121628c = str2;
            this.f121629d = teamMemberPhone;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneCall)) {
                return false;
            }
            PhoneCall phoneCall = (PhoneCall) obj;
            return L.f(this.f121627b, phoneCall.f121627b) && L.f(this.f121628c, phoneCall.f121628c) && L.f(this.f121629d, phoneCall.f121629d);
        }

        public final int hashCode() {
            return this.f121629d.hashCode() + H.d(this.f121627b.hashCode() * 31, 31, this.f121628c);
        }

        @k
        public final String toString() {
            return "PhoneCall(clientId=" + this.f121627b + ", dealId=" + this.f121628c + ", phone=" + this.f121629d + ')';
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$PlaybackError;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PlaybackError implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PlaybackError f121630b = new PlaybackError();

        private PlaybackError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof PlaybackError);
        }

        public final int hashCode() {
            return -203631657;
        }

        @k
        public final String toString() {
            return "PlaybackError";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$RecallRequestSubmitResult;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecallRequestSubmitResult implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C39396a f121631b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f121632c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f121633d;

        public RecallRequestSubmitResult(@k C39396a c39396a, @k String str, boolean z12) {
            this.f121631b = c39396a;
            this.f121632c = str;
            this.f121633d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecallRequestSubmitResult)) {
                return false;
            }
            RecallRequestSubmitResult recallRequestSubmitResult = (RecallRequestSubmitResult) obj;
            return L.f(this.f121631b, recallRequestSubmitResult.f121631b) && L.f(this.f121632c, recallRequestSubmitResult.f121632c) && this.f121633d == recallRequestSubmitResult.f121633d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f121633d) + H.d(this.f121631b.hashCode() * 31, 31, this.f121632c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RecallRequestSubmitResult(result=");
            sb2.append(this.f121631b);
            sb2.append(", phone=");
            sb2.append(this.f121632c);
            sb2.append(", isBigBanner=");
            return r.x(sb2, this.f121633d, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$RecallRequestSubmitStarted;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecallRequestSubmitStarted implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RecallRequestSubmitStarted f121634b = new RecallRequestSubmitStarted();

        private RecallRequestSubmitStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RecallRequestSubmitStarted);
        }

        public final int hashCode() {
            return -747738943;
        }

        @k
        public final String toString() {
            return "RecallRequestSubmitStarted";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ReloadVdrList;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ReloadVdrList implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ReloadVdrList f121635b = new ReloadVdrList();

        private ReloadVdrList() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ReloadVdrList);
        }

        public final int hashCode() {
            return 1612808595;
        }

        @k
        public final String toString() {
            return "ReloadVdrList";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ScreenDataLoaded;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScreenDataLoaded implements DealInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AgentRoomDealResponse f121636b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final List<f> f121637c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f121638d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f121639e;

        public ScreenDataLoaded(@k AgentRoomDealResponse agentRoomDealResponse, @l List<f> list, @l DeepLink deepLink, boolean z12) {
            this.f121636b = agentRoomDealResponse;
            this.f121637c = list;
            this.f121638d = deepLink;
            this.f121639e = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenDataLoaded)) {
                return false;
            }
            ScreenDataLoaded screenDataLoaded = (ScreenDataLoaded) obj;
            return L.f(this.f121636b, screenDataLoaded.f121636b) && L.f(this.f121637c, screenDataLoaded.f121637c) && L.f(this.f121638d, screenDataLoaded.f121638d) && this.f121639e == screenDataLoaded.f121639e;
        }

        public final int hashCode() {
            int iHashCode = this.f121636b.hashCode() * 31;
            List<f> list = this.f121637c;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            DeepLink deepLink = this.f121638d;
            return Boolean.hashCode(this.f121639e) + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScreenDataLoaded(response=");
            sb2.append(this.f121636b);
            sb2.append(", comments=");
            sb2.append(this.f121637c);
            sb2.append(", mortgageLink=");
            sb2.append(this.f121638d);
            sb2.append(", withAnalyticEntryPoint=");
            return r.x(sb2, this.f121639e, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$SelectAgent;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectAgent implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f121640b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f121641c;

        public SelectAgent(@k String str, @l String str2) {
            this.f121640b = str;
            this.f121641c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectAgent)) {
                return false;
            }
            SelectAgent selectAgent = (SelectAgent) obj;
            return L.f(this.f121640b, selectAgent.f121640b) && L.f(this.f121641c, selectAgent.f121641c);
        }

        public final int hashCode() {
            int iHashCode = this.f121640b.hashCode() * 31;
            String str = this.f121641c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectAgent(dealId=");
            sb2.append(this.f121640b);
            sb2.append(", selectedAgentId=");
            return C22026a.c(sb2, this.f121641c, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ShowSaveCommentDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSaveCommentDialog implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSaveCommentDialog f121642b = new ShowSaveCommentDialog();

        private ShowSaveCommentDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSaveCommentDialog);
        }

        public final int hashCode() {
            return -254125641;
        }

        @k
        public final String toString() {
            return "ShowSaveCommentDialog";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ShowSaveEndDealDataDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSaveEndDealDataDialog implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSaveEndDealDataDialog f121643b = new ShowSaveEndDealDataDialog();

        private ShowSaveEndDealDataDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSaveEndDealDataDialog);
        }

        public final int hashCode() {
            return -938780151;
        }

        @k
        public final String toString() {
            return "ShowSaveEndDealDataDialog";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$ShowSaveTransitionDataDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSaveTransitionDataDialog implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowSaveTransitionDataDialog f121644b = new ShowSaveTransitionDataDialog();

        private ShowSaveTransitionDataDialog() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowSaveTransitionDataDialog);
        }

        public final int hashCode() {
            return 81992087;
        }

        @k
        public final String toString() {
            return "ShowSaveTransitionDataDialog";
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$SpeedChangeDialog;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SpeedChangeDialog implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PlaySpeed f121645b;

        public SpeedChangeDialog(@k PlaySpeed playSpeed) {
            this.f121645b = playSpeed;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SpeedChangeDialog) && this.f121645b == ((SpeedChangeDialog) obj).f121645b;
        }

        public final int hashCode() {
            return this.f121645b.hashCode();
        }

        @k
        public final String toString() {
            return "SpeedChangeDialog(selectedSpeed=" + this.f121645b + ')';
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$StartLoading;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements DealInternalAction {
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateComment;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateComment implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f121646b;

        public UpdateComment(@l String str) {
            this.f121646b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateComment) && L.f(this.f121646b, ((UpdateComment) obj).f121646b);
        }

        public final int hashCode() {
            String str = this.f121646b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateComment(comment="), this.f121646b, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateCommentsFilter;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCommentsFilter implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CommentsFilter f121647b;

        public UpdateCommentsFilter(@k CommentsFilter commentsFilter) {
            this.f121647b = commentsFilter;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCommentsFilter) && this.f121647b == ((UpdateCommentsFilter) obj).f121647b;
        }

        public final int hashCode() {
            return this.f121647b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCommentsFilter(filter=" + this.f121647b + ')';
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateEndDealData;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateEndDealData implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ActionTransition f121648b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final EndDealSavedState f121649c;

        public UpdateEndDealData(@l ActionTransition actionTransition, @l EndDealSavedState endDealSavedState) {
            this.f121648b = actionTransition;
            this.f121649c = endDealSavedState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateEndDealData)) {
                return false;
            }
            UpdateEndDealData updateEndDealData = (UpdateEndDealData) obj;
            return this.f121648b == updateEndDealData.f121648b && L.f(this.f121649c, updateEndDealData.f121649c);
        }

        public final int hashCode() {
            ActionTransition actionTransition = this.f121648b;
            int iHashCode = (actionTransition == null ? 0 : actionTransition.hashCode()) * 31;
            EndDealSavedState endDealSavedState = this.f121649c;
            return iHashCode + (endDealSavedState != null ? endDealSavedState.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "UpdateEndDealData(transition=" + this.f121648b + ", savedState=" + this.f121649c + ')';
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateSpeed;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSpeed implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PlaySpeed f121650b;

        public UpdateSpeed(@k PlaySpeed playSpeed) {
            this.f121650b = playSpeed;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSpeed) && this.f121650b == ((UpdateSpeed) obj).f121650b;
        }

        public final int hashCode() {
            return this.f121650b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateSpeed(selectedSpeed=" + this.f121650b + ')';
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$UpdateTransitionData;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateTransitionData implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ActionTransition f121651b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, StageTransitionField> f121652c;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateTransitionData(@l ActionTransition actionTransition, @k Map<String, ? extends StageTransitionField> map) {
            this.f121651b = actionTransition;
            this.f121652c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateTransitionData)) {
                return false;
            }
            UpdateTransitionData updateTransitionData = (UpdateTransitionData) obj;
            return this.f121651b == updateTransitionData.f121651b && L.f(this.f121652c, updateTransitionData.f121652c);
        }

        public final int hashCode() {
            ActionTransition actionTransition = this.f121651b;
            return this.f121652c.hashCode() + ((actionTransition == null ? 0 : actionTransition.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateTransitionData(transition=");
            sb2.append(this.f121651b);
            sb2.append(", fields=");
            return r.w(sb2, this.f121652c, ')');
        }
    }

    /* compiled from: DealInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction$WrongPhoneError;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WrongPhoneError implements DealInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final WrongPhoneError f121653b = new WrongPhoneError();

        private WrongPhoneError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof WrongPhoneError);
        }

        public final int hashCode() {
            return 2069609329;
        }

        @k
        public final String toString() {
            return "WrongPhoneError";
        }
    }
}
