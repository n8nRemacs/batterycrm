package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.BxContentScreen;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.TrackablePreloadedContent;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.main_start_onboarding.MainStartOnboardingStep;
import com.avito.android.onboarding.model.BxOnboardingStep;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import com.avito.android.remote.model.BxContentBusiness360;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.ScreenContent;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.ToolbarShareButton;
import com.avito.android.remote.model.additional_buttons.SelectDatesAdditionalButton;
import com.avito.android.remote.model.additional_buttons.UniversalButton;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.remote.model.vertical_main.AvitoBlogArticle;
import com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import com.avito.android.search_ux_feedback.remote.SearchRemoteFeedbackEvent;
import com.avito.android.serp.CallInfo;
import com.avito.android.serp.adapter.LayoutType;
import com.avito.android.serp.adapter.floating_promo_widget.FloatingPromoWidgetItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.location_notification.LocationNotificationItem;
import com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem;
import com.avito.android.serp.adapter.snippet.SnippetItem;
import com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem;
import com.avito.android.services_transportation_widget.item.ServiceTransportationWidgetItem;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.ux.feedback.remote.UxFeedbackConfig;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: BxContentInternalAction.kt */
@Metadata(d1 = {"\u0000þ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:]\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^\u0082\u0001\u0097\u0001_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001«\u0001¬\u0001\u00ad\u0001®\u0001¯\u0001°\u0001±\u0001²\u0001³\u0001´\u0001µ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001¨\u0006»\u0001"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ActionHorizontalFilterUpdate", "AnimatePromoHeaderToolbar", "AnimateToolbar", "ApplyAdsBanner", "AuthRequestedForChanged", "BeduinNativeInternalAction", "BottomSheetStateChanged", "BxOnboardingStepShow", "CallInfoChanged", "ChangeHeroBannerState", "ChangeSearchPromoHeaderState", "ClearFeedCache", "CloseActionPromoBanner", "CloseAddAddressSuggest", "CloseSearchBar", "CloseVerticalFilter", "a", "ContentAppendLoaded", "ContentLoaded", "ContentLoading", "Error", "ExitSpace", "FloatingViewsReverseBehaviourEnable", "FloatingViewsStateUpdate", "HideItem", "InlinesLoaded", "LeaveScreen", "LocationLoaded", "LocationLoading", "MainStartOnboardingStepShow", "MarkAdvertAsViewed", "NotificationLocationChanged", "NotifyFeaturesAboutSubscriptionsState", "NotifyFeaturesSearchParamsChanged", "NotifyFeaturesSerpLoad", "OpenAvitoBlog", "OpenBottomSheetOnboarding", "OpenCategoriesScreen", "OpenDealConfirmation", "OpenDeeplink", "OpenInlineFilter", "OpenInlineFilterWithId", "OpenMainScreenOnBackToAvoidAppLeaving", "OpenSearchBar", "OpenServicesScreen", "OpenSharingDialog", "PanelStateChanged", "ProxyBeduinFeatureOneTimeEvent", "RecsReloadButtonVisibilityChanged", "RemoveItem", "RequestPrepareViewForOnboarding", "ResetVerticalFilter", "RestartFromLauncher", "ScrollToStart", "SearchSubscriptionStateChanged", "SelectDatesButtonClicked", "ShowBusiness360Toast", "ShowLastSearchTooltip", "ShowOnboardings", "ShowPersonalFiltersChangeDialog", "ShowProgressToast", "ShowRemoteUxFeedbackByEvent", "ShowReplaceMainExitOnboarding", "ShowSerpAdvertScrollToast", "ShowToast", "ShowUniversalButton", "ShowUxFeedbackWithConfig", "SkipBottomSheetOnboarding", "Stub", "SubscribeParamsChanged", "ToggleSearchBarVisibility", "TopSheetError", "TopSheetLoaded", "TopSheetLoading", "UpdateBottomSheetOffset", "UpdateCachedContent", "UpdateCartIconState", "UpdateChangeLocationCondition", "UpdateCurrentFeed", "UpdateFeaturedFeed", "UpdateFiltersPointVisibility", "UpdateHeaderToolbarItem", "UpdateInlineActions", "UpdateItem", "UpdatePlaybackSnippets", "UpdatePrivateState", "UpdateRecsReloadState", "UpdateScrollToTopButtonVisibility", "UpdateSuggestionsParams", "UpdateUdfToolbarColors", "UpdateUdfToolbarStyle", "UpdateVerticalFilterItem", "UpdateVerticalSearchParams", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ActionHorizontalFilterUpdate;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$AnimatePromoHeaderToolbar;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$AnimateToolbar;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ApplyAdsBanner;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$AuthRequestedForChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BottomSheetStateChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BxOnboardingStepShow;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CallInfoChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ChangeHeroBannerState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ChangeSearchPromoHeaderState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ClearFeedCache;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CloseActionPromoBanner;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CloseAddAddressSuggest;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CloseSearchBar;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CloseVerticalFilter;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ContentAppendLoaded;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ContentLoaded;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ContentLoading;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ExitSpace;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$FloatingViewsReverseBehaviourEnable;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$FloatingViewsStateUpdate;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$HideItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$InlinesLoaded;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$LeaveScreen;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$LocationLoaded;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$LocationLoading;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$MainStartOnboardingStepShow;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$MarkAdvertAsViewed;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$NotificationLocationChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$NotifyFeaturesAboutSubscriptionsState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$NotifyFeaturesSearchParamsChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$NotifyFeaturesSerpLoad;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenAvitoBlog;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenBottomSheetOnboarding;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenCategoriesScreen;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenDealConfirmation;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenDeeplink;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenInlineFilter;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenInlineFilterWithId;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenMainScreenOnBackToAvoidAppLeaving;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenSearchBar;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenServicesScreen;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenSharingDialog;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$PanelStateChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ProxyBeduinFeatureOneTimeEvent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RecsReloadButtonVisibilityChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RequestPrepareViewForOnboarding;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ResetVerticalFilter;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RestartFromLauncher;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ScrollToStart;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$SearchSubscriptionStateChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$SelectDatesButtonClicked;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowBusiness360Toast;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowLastSearchTooltip;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowOnboardings;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowPersonalFiltersChangeDialog;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowProgressToast;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowRemoteUxFeedbackByEvent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowReplaceMainExitOnboarding;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowSerpAdvertScrollToast;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowToast;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowUniversalButton;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowUxFeedbackWithConfig;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$SkipBottomSheetOnboarding;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Stub;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$SubscribeParamsChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ToggleSearchBarVisibility;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$TopSheetError;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$TopSheetLoaded;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$TopSheetLoading;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateBottomSheetOffset;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateCachedContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateCartIconState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateChangeLocationCondition;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateCurrentFeed;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateFeaturedFeed;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateFiltersPointVisibility;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateHeaderToolbarItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateInlineActions;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdatePlaybackSnippets;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdatePrivateState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateRecsReloadState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateScrollToTopButtonVisibility;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateSuggestionsParams;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateUdfToolbarColors;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateUdfToolbarStyle;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateVerticalFilterItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateVerticalSearchParams;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BxContentInternalAction extends com.avito.android.analytics.screens.mvi.n {

    /* renamed from: Q1, reason: collision with root package name */
    @Y61.k
    public static final a f111803Q1 = a.f112029a;

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ActionHorizontalFilterUpdate;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionHorizontalFilterUpdate implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Filter f111804b;

        public ActionHorizontalFilterUpdate(@Y61.l Filter filter) {
            this.f111804b = filter;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionHorizontalFilterUpdate) && L.f(this.f111804b, ((ActionHorizontalFilterUpdate) obj).f111804b);
        }

        public final int hashCode() {
            Filter filter = this.f111804b;
            if (filter == null) {
                return 0;
            }
            return filter.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ActionHorizontalFilterUpdate(filter=" + this.f111804b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$AnimatePromoHeaderToolbar;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnimatePromoHeaderToolbar implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f111805b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f111806c;

        public AnimatePromoHeaderToolbar(float f12, boolean z12) {
            this.f111805b = f12;
            this.f111806c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimatePromoHeaderToolbar)) {
                return false;
            }
            AnimatePromoHeaderToolbar animatePromoHeaderToolbar = (AnimatePromoHeaderToolbar) obj;
            return Float.compare(this.f111805b, animatePromoHeaderToolbar.f111805b) == 0 && this.f111806c == animatePromoHeaderToolbar.f111806c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f111806c) + (Float.hashCode(this.f111805b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AnimatePromoHeaderToolbar(offset=");
            sb2.append(this.f111805b);
            sb2.append(", isAnimateBackground=");
            return androidx.appcompat.app.r.x(sb2, this.f111806c, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$AnimateToolbar;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AnimateToolbar implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f111807b;

        public AnimateToolbar(float f12) {
            this.f111807b = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AnimateToolbar) && Float.compare(this.f111807b, ((AnimateToolbar) obj).f111807b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f111807b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f111807b, new StringBuilder("AnimateToolbar(offset="));
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ApplyAdsBanner;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplyAdsBanner implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final l1 f111808b;

        public ApplyAdsBanner(@Y61.k l1 l1Var) {
            this.f111808b = l1Var;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplyAdsBanner) && L.f(this.f111808b, ((ApplyAdsBanner) obj).f111808b);
        }

        public final int hashCode() {
            return this.f111808b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ApplyAdsBanner(ads=" + this.f111808b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$AuthRequestedForChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuthRequestedForChanged implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f111809b;

        public AuthRequestedForChanged(@Y61.l Integer num) {
            this.f111809b = num;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final Integer getF111809b() {
            return this.f111809b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthRequestedForChanged) && L.f(this.f111809b, ((AuthRequestedForChanged) obj).f111809b);
        }

        public final int hashCode() {
            Integer num = this.f111809b;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.akita.compose.component.accordion.s.j(new StringBuilder("AuthRequestedForChanged(authRequestedFor="), this.f111809b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "AddBlockIfNotExist", "RenderBeduinContent", "UpdateBlock", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction$AddBlockIfNotExist;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction$RenderBeduinContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction$UpdateBlock;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface BeduinNativeInternalAction extends BxContentInternalAction {

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction$AddBlockIfNotExist;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AddBlockIfNotExist implements BeduinNativeInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final C29126a.b f111810b;

            public AddBlockIfNotExist(@Y61.k C29126a.b bVar) {
                this.f111810b = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddBlockIfNotExist) && L.f(this.f111810b, ((AddBlockIfNotExist) obj).f111810b);
            }

            public final int hashCode() {
                return this.f111810b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "AddBlockIfNotExist(block=" + this.f111810b + ')';
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction$RenderBeduinContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RenderBeduinContent implements BeduinNativeInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f111811b;

            public RenderBeduinContent(@Y61.k String str) {
                this.f111811b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RenderBeduinContent) && L.f(this.f111811b, ((RenderBeduinContent) obj).f111811b);
            }

            public final int hashCode() {
                return this.f111811b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("RenderBeduinContent(json="), this.f111811b, ')');
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction$UpdateBlock;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BeduinNativeInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class UpdateBlock implements BeduinNativeInternalAction {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final C29126a.b f111812b;

            public UpdateBlock(@Y61.k C29126a.b bVar) {
                this.f111812b = bVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateBlock) && L.f(this.f111812b, ((UpdateBlock) obj).f111812b);
            }

            public final int hashCode() {
                return this.f111812b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "UpdateBlock(block=" + this.f111812b + ')';
            }
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BottomSheetStateChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BottomSheetStateChanged implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f111813b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f111814c;

        public BottomSheetStateChanged(int i12, boolean z12) {
            this.f111813b = i12;
            this.f111814c = z12;
        }

        /* renamed from: c, reason: from getter */
        public final int getF111813b() {
            return this.f111813b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BottomSheetStateChanged)) {
                return false;
            }
            BottomSheetStateChanged bottomSheetStateChanged = (BottomSheetStateChanged) obj;
            return this.f111813b == bottomSheetStateChanged.f111813b && this.f111814c == bottomSheetStateChanged.f111814c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f111814c) + (Integer.hashCode(this.f111813b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetStateChanged(newState=");
            sb2.append(this.f111813b);
            sb2.append(", isGesture=");
            return androidx.appcompat.app.r.x(sb2, this.f111814c, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$BxOnboardingStepShow;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BxOnboardingStepShow implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BxOnboardingStep.View f111815b;

        public BxOnboardingStepShow(@Y61.k BxOnboardingStep.View view) {
            this.f111815b = view;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BxOnboardingStepShow) && L.f(this.f111815b, ((BxOnboardingStepShow) obj).f111815b);
        }

        public final int hashCode() {
            return this.f111815b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "BxOnboardingStepShow(step=" + this.f111815b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CallInfoChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallInfoChanged implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final CallInfo f111816b;

        public CallInfoChanged(@Y61.l CallInfo callInfo) {
            this.f111816b = callInfo;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final CallInfo getF111816b() {
            return this.f111816b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CallInfoChanged) && L.f(this.f111816b, ((CallInfoChanged) obj).f111816b);
        }

        public final int hashCode() {
            CallInfo callInfo = this.f111816b;
            if (callInfo == null) {
                return 0;
            }
            return callInfo.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "CallInfoChanged(callInfo=" + this.f111816b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ChangeHeroBannerState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeHeroBannerState implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.hero_banner.widget.k f111817b;

        public ChangeHeroBannerState(@Y61.k com.avito.android.hero_banner.widget.k kVar) {
            this.f111817b = kVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeHeroBannerState) && L.f(this.f111817b, ((ChangeHeroBannerState) obj).f111817b);
        }

        public final int hashCode() {
            return this.f111817b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeHeroBannerState(newState=" + this.f111817b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ChangeSearchPromoHeaderState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeSearchPromoHeaderState implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.bxcontent.search_bar_promo_widget.h f111818b;

        public ChangeSearchPromoHeaderState(@Y61.k com.avito.android.bxcontent.search_bar_promo_widget.h hVar) {
            this.f111818b = hVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeSearchPromoHeaderState) && L.f(this.f111818b, ((ChangeSearchPromoHeaderState) obj).f111818b);
        }

        public final int hashCode() {
            return this.f111818b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChangeSearchPromoHeaderState(newState=" + this.f111818b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ClearFeedCache;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClearFeedCache implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ClearFeedCache f111819b = new ClearFeedCache();

        private ClearFeedCache() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof ClearFeedCache);
        }

        public final int hashCode() {
            return 1029884982;
        }

        @Y61.k
        public final String toString() {
            return "ClearFeedCache";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CloseActionPromoBanner;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseActionPromoBanner implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CloseActionPromoBanner f111820b = new CloseActionPromoBanner();

        private CloseActionPromoBanner() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof CloseActionPromoBanner);
        }

        public final int hashCode() {
            return -1277146516;
        }

        @Y61.k
        public final String toString() {
            return "CloseActionPromoBanner";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CloseAddAddressSuggest;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseAddAddressSuggest implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CloseAddAddressSuggest f111821b = new CloseAddAddressSuggest();

        private CloseAddAddressSuggest() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof CloseAddAddressSuggest);
        }

        public final int hashCode() {
            return -844498600;
        }

        @Y61.k
        public final String toString() {
            return "CloseAddAddressSuggest";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CloseSearchBar;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseSearchBar implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CloseSearchBar f111822b = new CloseSearchBar();

        private CloseSearchBar() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof CloseSearchBar);
        }

        public final int hashCode() {
            return 1748452786;
        }

        @Y61.k
        public final String toString() {
            return "CloseSearchBar";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$CloseVerticalFilter;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseVerticalFilter implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final CloseVerticalFilter f111823b = new CloseVerticalFilter();

        private CloseVerticalFilter() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof CloseVerticalFilter);
        }

        public final int hashCode() {
            return -873861497;
        }

        @Y61.k
        public final String toString() {
            return "CloseVerticalFilter";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ContentLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements TrackableContent, BxContentInternalAction {

        /* renamed from: A, reason: collision with root package name */
        public final boolean f111837A;

        /* renamed from: B, reason: collision with root package name */
        @Y61.l
        public final String f111838B;

        /* renamed from: C, reason: collision with root package name */
        @Y61.l
        public final r f111839C;

        /* renamed from: D, reason: collision with root package name */
        @Y61.l
        public final Long f111840D;

        /* renamed from: E, reason: collision with root package name */
        @Y61.l
        public final String f111841E;

        /* renamed from: F, reason: collision with root package name */
        @Y61.l
        public final UxFeedbackConfig f111842F;

        /* renamed from: G, reason: collision with root package name */
        @Y61.l
        public final List<UxFeedbackConfigOld> f111843G;

        /* renamed from: H, reason: collision with root package name */
        @Y61.l
        public final s f111844H;

        /* renamed from: I, reason: collision with root package name */
        @Y61.l
        public final String f111845I;

        /* renamed from: J, reason: collision with root package name */
        @Y61.l
        public final UniversalButton f111846J;

        /* renamed from: K, reason: collision with root package name */
        @Y61.l
        public final SelectDatesAdditionalButton f111847K;

        /* renamed from: L, reason: collision with root package name */
        @Y61.l
        public final z f111848L;

        /* renamed from: M, reason: collision with root package name */
        @Y61.l
        public final x f111849M;

        /* renamed from: N, reason: collision with root package name */
        @Y61.l
        public final String f111850N;

        /* renamed from: O, reason: collision with root package name */
        @Y61.l
        public final u f111851O;

        /* renamed from: P, reason: collision with root package name */
        @Y61.k
        public final String f111852P;

        /* renamed from: Q, reason: collision with root package name */
        @Y61.k
        public final String f111853Q;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<l1> f111854b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ScreenContent f111855c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final SerpDisplayType f111856d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f111857e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f111858f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final l1 f111859g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final FeedId f111860h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final FloatingPromoWidgetItem f111861i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.k
        public final PresentationType f111862j;

        /* renamed from: k, reason: collision with root package name */
        public final int f111863k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final LayoutType f111864l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f111865m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final Location f111866n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f111867o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f111868p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f111869q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f111870r;

        /* renamed from: s, reason: collision with root package name */
        @Y61.l
        public final ToolbarShareButton f111871s;

        /* renamed from: t, reason: collision with root package name */
        public final boolean f111872t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f111873u;

        /* renamed from: v, reason: collision with root package name */
        @Y61.l
        public final SerpResultCategoryDetails f111874v;

        /* renamed from: w, reason: collision with root package name */
        @Y61.l
        public final ToolbarConfig f111875w;

        /* renamed from: x, reason: collision with root package name */
        @Y61.l
        public final UdfToolbarColors f111876x;

        /* renamed from: y, reason: collision with root package name */
        @Y61.l
        public final NavigationBarStyle f111877y;

        /* renamed from: z, reason: collision with root package name */
        @Y61.l
        public final BxContentBusiness360.ReplaceMain f111878z;

        public ContentLoaded() {
            throw null;
        }

        public ContentLoaded(List list, ScreenContent screenContent, SerpDisplayType serpDisplayType, String str, String str2, l1 l1Var, FeedId feedId, FloatingPromoWidgetItem floatingPromoWidgetItem, PresentationType presentationType, int i12, LayoutType layoutType, boolean z12, Location location, boolean z13, boolean z14, boolean z15, boolean z16, ToolbarShareButton toolbarShareButton, boolean z17, boolean z18, SerpResultCategoryDetails serpResultCategoryDetails, ToolbarConfig toolbarConfig, UdfToolbarColors udfToolbarColors, NavigationBarStyle navigationBarStyle, BxContentBusiness360.ReplaceMain replaceMain, boolean z19, String str3, r rVar, Long l12, String str4, UxFeedbackConfig uxFeedbackConfig, List list2, s sVar, String str5, UniversalButton universalButton, SelectDatesAdditionalButton selectDatesAdditionalButton, z zVar, x xVar, String str6, u uVar, int i13, int i14, C42822w c42822w) {
            ScreenContent screenContent2 = (i13 & 2) != 0 ? null : screenContent;
            l1 l1Var2 = (i13 & 32) != 0 ? null : l1Var;
            FloatingPromoWidgetItem floatingPromoWidgetItem2 = (i13 & 128) != 0 ? null : floatingPromoWidgetItem;
            boolean z22 = (i13 & 2048) != 0 ? true : z12;
            Location location2 = (i13 & 4096) != 0 ? null : location;
            boolean z23 = (i13 & 8192) != 0 ? false : z13;
            boolean z24 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z14;
            boolean z25 = (32768 & i13) != 0 ? false : z15;
            boolean z26 = (65536 & i13) == 0 ? z16 : true;
            ToolbarShareButton toolbarShareButton2 = (131072 & i13) != 0 ? null : toolbarShareButton;
            boolean z27 = (262144 & i13) != 0 ? false : z17;
            boolean z28 = (524288 & i13) == 0 ? z18 : false;
            SerpResultCategoryDetails serpResultCategoryDetails2 = (1048576 & i13) != 0 ? null : serpResultCategoryDetails;
            ToolbarConfig toolbarConfig2 = (i13 & 2097152) != 0 ? null : toolbarConfig;
            UdfToolbarColors udfToolbarColors2 = (i13 & 4194304) != 0 ? null : udfToolbarColors;
            NavigationBarStyle navigationBarStyle2 = (i13 & 8388608) != 0 ? null : navigationBarStyle;
            BxContentBusiness360.ReplaceMain replaceMain2 = (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : replaceMain;
            r rVar2 = (i13 & 134217728) != 0 ? null : rVar;
            Long l13 = (i13 & 268435456) != 0 ? null : l12;
            String str7 = (i13 & 536870912) != 0 ? null : str4;
            UxFeedbackConfig uxFeedbackConfig2 = (i13 & 1073741824) != 0 ? null : uxFeedbackConfig;
            List list3 = (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : list2;
            s sVar2 = (i14 & 1) != 0 ? null : sVar;
            UniversalButton universalButton2 = (i14 & 4) != 0 ? null : universalButton;
            SelectDatesAdditionalButton selectDatesAdditionalButton2 = (i14 & 8) != 0 ? null : selectDatesAdditionalButton;
            z zVar2 = (i14 & 16) != 0 ? null : zVar;
            x xVar2 = (i14 & 32) != 0 ? null : xVar;
            String str8 = (i14 & 64) != 0 ? null : str6;
            this.f111854b = list;
            this.f111855c = screenContent2;
            this.f111856d = serpDisplayType;
            this.f111857e = str;
            this.f111858f = str2;
            this.f111859g = l1Var2;
            this.f111860h = feedId;
            this.f111861i = floatingPromoWidgetItem2;
            this.f111862j = presentationType;
            this.f111863k = i12;
            this.f111864l = layoutType;
            this.f111865m = z22;
            this.f111866n = location2;
            this.f111867o = z23;
            this.f111868p = z24;
            this.f111869q = z25;
            this.f111870r = z26;
            this.f111871s = toolbarShareButton2;
            this.f111872t = z27;
            this.f111873u = z28;
            this.f111874v = serpResultCategoryDetails2;
            this.f111875w = toolbarConfig2;
            this.f111876x = udfToolbarColors2;
            this.f111877y = navigationBarStyle2;
            this.f111878z = replaceMain2;
            this.f111837A = z19;
            this.f111838B = str3;
            this.f111839C = rVar2;
            this.f111840D = l13;
            this.f111841E = str7;
            this.f111842F = uxFeedbackConfig2;
            this.f111843G = list3;
            this.f111844H = sVar2;
            this.f111845I = str5;
            this.f111846J = universalButton2;
            this.f111847K = selectDatesAdditionalButton2;
            this.f111848L = zVar2;
            this.f111849M = xVar2;
            this.f111850N = str8;
            this.f111851O = uVar;
            BxContentScreen.f90305d.getClass();
            String str9 = BxContentScreen.f90306e;
            this.f111852P = str9;
            this.f111853Q = str9;
        }

        @Y61.l
        /* renamed from: A, reason: from getter */
        public final UdfToolbarColors getF111876x() {
            return this.f111876x;
        }

        @Y61.l
        /* renamed from: B, reason: from getter */
        public final UniversalButton getF111846J() {
            return this.f111846J;
        }

        @Y61.l
        public final List<UxFeedbackConfigOld> C() {
            return this.f111843G;
        }

        @Y61.l
        /* renamed from: D, reason: from getter */
        public final String getF111845I() {
            return this.f111845I;
        }

        /* renamed from: E, reason: from getter */
        public final boolean getF111872t() {
            return this.f111872t;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final ScreenContent getF111855c() {
            return this.f111855c;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF261547d() {
            return this.f111852P;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getF303160d() {
            return this.f111853Q;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return L.f(this.f111854b, contentLoaded.f111854b) && L.f(this.f111855c, contentLoaded.f111855c) && this.f111856d == contentLoaded.f111856d && L.f(this.f111857e, contentLoaded.f111857e) && L.f(this.f111858f, contentLoaded.f111858f) && L.f(this.f111859g, contentLoaded.f111859g) && L.f(this.f111860h, contentLoaded.f111860h) && L.f(this.f111861i, contentLoaded.f111861i) && this.f111862j == contentLoaded.f111862j && this.f111863k == contentLoaded.f111863k && this.f111864l == contentLoaded.f111864l && this.f111865m == contentLoaded.f111865m && L.f(this.f111866n, contentLoaded.f111866n) && this.f111867o == contentLoaded.f111867o && this.f111868p == contentLoaded.f111868p && this.f111869q == contentLoaded.f111869q && this.f111870r == contentLoaded.f111870r && L.f(this.f111871s, contentLoaded.f111871s) && this.f111872t == contentLoaded.f111872t && this.f111873u == contentLoaded.f111873u && L.f(this.f111874v, contentLoaded.f111874v) && L.f(this.f111875w, contentLoaded.f111875w) && L.f(this.f111876x, contentLoaded.f111876x) && L.f(this.f111877y, contentLoaded.f111877y) && L.f(this.f111878z, contentLoaded.f111878z) && this.f111837A == contentLoaded.f111837A && L.f(this.f111838B, contentLoaded.f111838B) && L.f(this.f111839C, contentLoaded.f111839C) && L.f(this.f111840D, contentLoaded.f111840D) && L.f(this.f111841E, contentLoaded.f111841E) && L.f(this.f111842F, contentLoaded.f111842F) && L.f(this.f111843G, contentLoaded.f111843G) && L.f(this.f111844H, contentLoaded.f111844H) && L.f(this.f111845I, contentLoaded.f111845I) && L.f(this.f111846J, contentLoaded.f111846J) && L.f(this.f111847K, contentLoaded.f111847K) && L.f(this.f111848L, contentLoaded.f111848L) && L.f(this.f111849M, contentLoaded.f111849M) && L.f(this.f111850N, contentLoaded.f111850N) && L.f(this.f111851O, contentLoaded.f111851O);
        }

        @Y61.l
        /* renamed from: h, reason: from getter */
        public final SerpDisplayType getF111856d() {
            return this.f111856d;
        }

        public final int hashCode() {
            int iHashCode = this.f111854b.hashCode() * 31;
            ScreenContent screenContent = this.f111855c;
            int iHashCode2 = (iHashCode + (screenContent == null ? 0 : screenContent.hashCode())) * 31;
            SerpDisplayType serpDisplayType = this.f111856d;
            int iHashCode3 = (iHashCode2 + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31;
            String str = this.f111857e;
            int iD2 = H.d((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f111858f);
            l1 l1Var = this.f111859g;
            int iHashCode4 = (this.f111860h.hashCode() + ((iD2 + (l1Var == null ? 0 : l1Var.hashCode())) * 31)) * 31;
            FloatingPromoWidgetItem floatingPromoWidgetItem = this.f111861i;
            int iE2 = androidx.appcompat.app.r.e(this.f111863k, (this.f111862j.hashCode() + ((iHashCode4 + (floatingPromoWidgetItem == null ? 0 : floatingPromoWidgetItem.hashCode())) * 31)) * 31, 31);
            LayoutType layoutType = this.f111864l;
            int i12 = androidx.appcompat.app.r.i((iE2 + (layoutType == null ? 0 : layoutType.hashCode())) * 31, 31, this.f111865m);
            Location location = this.f111866n;
            int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((i12 + (location == null ? 0 : location.hashCode())) * 31, 31, this.f111867o), 31, this.f111868p), 31, this.f111869q), 31, this.f111870r);
            ToolbarShareButton toolbarShareButton = this.f111871s;
            int i14 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((i13 + (toolbarShareButton == null ? 0 : toolbarShareButton.hashCode())) * 31, 31, this.f111872t), 31, this.f111873u);
            SerpResultCategoryDetails serpResultCategoryDetails = this.f111874v;
            int iHashCode5 = (i14 + (serpResultCategoryDetails == null ? 0 : serpResultCategoryDetails.hashCode())) * 31;
            ToolbarConfig toolbarConfig = this.f111875w;
            int iHashCode6 = (iHashCode5 + (toolbarConfig == null ? 0 : toolbarConfig.hashCode())) * 31;
            UdfToolbarColors udfToolbarColors = this.f111876x;
            int iHashCode7 = (iHashCode6 + (udfToolbarColors == null ? 0 : udfToolbarColors.hashCode())) * 31;
            NavigationBarStyle navigationBarStyle = this.f111877y;
            int iHashCode8 = (iHashCode7 + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode())) * 31;
            BxContentBusiness360.ReplaceMain replaceMain = this.f111878z;
            int i15 = androidx.appcompat.app.r.i((iHashCode8 + (replaceMain == null ? 0 : replaceMain.hashCode())) * 31, 31, this.f111837A);
            String str2 = this.f111838B;
            int iHashCode9 = (i15 + (str2 == null ? 0 : str2.hashCode())) * 31;
            r rVar = this.f111839C;
            int iHashCode10 = (iHashCode9 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            Long l12 = this.f111840D;
            int iHashCode11 = (iHashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str3 = this.f111841E;
            int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
            UxFeedbackConfig uxFeedbackConfig = this.f111842F;
            int iHashCode13 = (iHashCode12 + (uxFeedbackConfig == null ? 0 : uxFeedbackConfig.hashCode())) * 31;
            List<UxFeedbackConfigOld> list = this.f111843G;
            int iHashCode14 = (iHashCode13 + (list == null ? 0 : list.hashCode())) * 31;
            s sVar = this.f111844H;
            int iHashCode15 = (iHashCode14 + (sVar == null ? 0 : sVar.f112421a.hashCode())) * 31;
            String str4 = this.f111845I;
            int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
            UniversalButton universalButton = this.f111846J;
            int iHashCode17 = (iHashCode16 + (universalButton == null ? 0 : universalButton.hashCode())) * 31;
            SelectDatesAdditionalButton selectDatesAdditionalButton = this.f111847K;
            int iHashCode18 = (iHashCode17 + (selectDatesAdditionalButton == null ? 0 : selectDatesAdditionalButton.hashCode())) * 31;
            z zVar = this.f111848L;
            int iHashCode19 = (iHashCode18 + (zVar == null ? 0 : zVar.hashCode())) * 31;
            x xVar = this.f111849M;
            int iHashCode20 = (iHashCode19 + (xVar == null ? 0 : xVar.hashCode())) * 31;
            String str5 = this.f111850N;
            int iHashCode21 = (iHashCode20 + (str5 == null ? 0 : str5.hashCode())) * 31;
            u uVar = this.f111851O;
            return iHashCode21 + (uVar != null ? uVar.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final s getF111844H() {
            return this.f111844H;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final u getF111851O() {
            return this.f111851O;
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final FloatingPromoWidgetItem getF111861i() {
            return this.f111861i;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getF111873u() {
            return this.f111873u;
        }

        @Y61.l
        /* renamed from: m, reason: from getter */
        public final x getF111849M() {
            return this.f111849M;
        }

        @Y61.l
        /* renamed from: n, reason: from getter */
        public final LayoutType getF111864l() {
            return this.f111864l;
        }

        /* renamed from: o, reason: from getter */
        public final boolean getF111865m() {
            return this.f111865m;
        }

        @Y61.l
        /* renamed from: p, reason: from getter */
        public final String getF111850N() {
            return this.f111850N;
        }

        /* renamed from: q, reason: from getter */
        public final int getF111863k() {
            return this.f111863k;
        }

        @Y61.l
        /* renamed from: r, reason: from getter */
        public final String getF111841E() {
            return this.f111841E;
        }

        @Y61.l
        /* renamed from: s, reason: from getter */
        public final String getF111838B() {
            return this.f111838B;
        }

        @Y61.l
        /* renamed from: t, reason: from getter */
        public final z getF111848L() {
            return this.f111848L;
        }

        @Y61.k
        public final String toString() {
            return "ContentLoaded(items=" + this.f111854b + ", beduinScreenContent=" + this.f111855c + ", displayType=" + this.f111856d + ", searchHint=" + this.f111857e + ", searchQuery=" + this.f111858f + ", headerToolbarItem=" + this.f111859g + ", feedId=" + this.f111860h + ", floatingPromoWidget=" + this.f111861i + ", presentationType=" + this.f111862j + ", page=" + this.f111863k + ", layoutType=" + this.f111864l + ", needToChangeHint=" + this.f111865m + ", location=" + this.f111866n + ", updateFeed=" + this.f111867o + ", shouldShowSaveSearch=" + this.f111868p + ", shouldShowSaveSearchButtonOnMap=" + this.f111869q + ", shouldShowFiltersButton=" + this.f111870r + ", toolbarShareButton=" + this.f111871s + ", isVerticalMain=" + this.f111872t + ", hasNextPage=" + this.f111873u + ", categoryDetails=" + this.f111874v + ", toolbarConfig=" + this.f111875w + ", udfToolbarColors=" + this.f111876x + ", navigationBarStyle=" + this.f111877y + ", business360ReplaceMain=" + this.f111878z + ", isSubscribed=" + this.f111837A + ", savedSearchSubscriptionId=" + this.f111838B + ", carouselItemsState=" + this.f111839C + ", timestamp=" + this.f111840D + ", pageId=" + this.f111841E + ", uxFeedbackConfig=" + this.f111842F + ", uxFeedbackConfigs=" + this.f111843G + ", featuredWidgetState=" + this.f111844H + ", xHash=" + this.f111845I + ", universalButton=" + this.f111846J + ", selectDatesButton=" + this.f111847K + ", searchPromoHeaderState=" + this.f111848L + ", heroBannerState=" + this.f111849M + ", newSerpMapInteraction=" + this.f111850N + ", filterHintToast=" + this.f111851O + ')';
        }

        @Y61.l
        /* renamed from: u, reason: from getter */
        public final SelectDatesAdditionalButton getF111847K() {
            return this.f111847K;
        }

        /* renamed from: v, reason: from getter */
        public final boolean getF111870r() {
            return this.f111870r;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getF111869q() {
            return this.f111869q;
        }

        @Y61.l
        /* renamed from: x, reason: from getter */
        public final Long getF111840D() {
            return this.f111840D;
        }

        @Y61.l
        /* renamed from: y, reason: from getter */
        public final ToolbarConfig getF111875w() {
            return this.f111875w;
        }

        @Y61.l
        /* renamed from: z, reason: from getter */
        public final ToolbarShareButton getF111871s() {
            return this.f111871s;
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ContentLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoading extends TrackableLoadingStarted implements BxContentInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final FeedId f111879d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f111880e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f111881f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final ScreenPerformanceTracker.LoadingType f111882g;

        public ContentLoading(FeedId feedId, boolean z12, int i12, C42822w c42822w) {
            z12 = (i12 & 2) != 0 ? true : z12;
            this.f111879d = feedId;
            this.f111880e = z12;
            BxContentScreen.f90305d.getClass();
            this.f111881f = BxContentScreen.f90306e;
            this.f111882g = ScreenPerformanceTracker.LoadingType.f90785b;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f111881f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLoading)) {
                return false;
            }
            ContentLoading contentLoading = (ContentLoading) obj;
            return L.f(this.f111879d, contentLoading.f111879d) && this.f111880e == contentLoading.f111880e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @Y61.k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF315371e() {
            return this.f111882g;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            FeedId feedId = this.f111879d;
            return Boolean.hashCode(this.f111880e) + ((feedId == null ? 0 : feedId.hashCode()) * 31);
        }

        /* renamed from: i, reason: from getter */
        public final boolean getF111880e() {
            return this.f111880e;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoading(feedId=");
            sb2.append(this.f111879d);
            sb2.append(", clearItems=");
            return androidx.appcompat.app.r.x(sb2, this.f111880e, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ExitSpace;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExitSpace implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ExitSpace f111903b = new ExitSpace();

        private ExitSpace() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof ExitSpace);
        }

        public final int hashCode() {
            return 1842177961;
        }

        @Y61.k
        public final String toString() {
            return "ExitSpace";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$FloatingViewsReverseBehaviourEnable;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FloatingViewsReverseBehaviourEnable implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f111904b;

        public FloatingViewsReverseBehaviourEnable(boolean z12) {
            this.f111904b = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF111904b() {
            return this.f111904b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatingViewsReverseBehaviourEnable) && this.f111904b == ((FloatingViewsReverseBehaviourEnable) obj).f111904b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f111904b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("FloatingViewsReverseBehaviourEnable(isEnabled="), this.f111904b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$FloatingViewsStateUpdate;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FloatingViewsStateUpdate implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final FloatingViewsPresenter.Subscriber.b f111905b;

        public FloatingViewsStateUpdate(@Y61.k FloatingViewsPresenter.Subscriber.b bVar) {
            this.f111905b = bVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FloatingViewsStateUpdate) && L.f(this.f111905b, ((FloatingViewsStateUpdate) obj).f111905b);
        }

        public final int hashCode() {
            return this.f111905b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "FloatingViewsStateUpdate(state=" + this.f111905b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$HideItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideItem implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f111906b;

        public HideItem(@Y61.k String str) {
            this.f111906b = str;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getF111906b() {
            return this.f111906b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HideItem) && L.f(this.f111906b, ((HideItem) obj).f111906b);
        }

        public final int hashCode() {
            return this.f111906b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("HideItem(itemId="), this.f111906b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$InlinesLoaded;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlinesLoaded implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final InlineFilters f111907b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SearchParams f111908c;

        public InlinesLoaded(@Y61.l InlineFilters inlineFilters, @Y61.k SearchParams searchParams) {
            this.f111907b = inlineFilters;
            this.f111908c = searchParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlinesLoaded)) {
                return false;
            }
            InlinesLoaded inlinesLoaded = (InlinesLoaded) obj;
            return L.f(this.f111907b, inlinesLoaded.f111907b) && L.f(this.f111908c, inlinesLoaded.f111908c);
        }

        public final int hashCode() {
            InlineFilters inlineFilters = this.f111907b;
            return this.f111908c.hashCode() + ((inlineFilters == null ? 0 : inlineFilters.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InlinesLoaded(inlineFilters=");
            sb2.append(this.f111907b);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f111908c, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$LeaveScreen;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeaveScreen implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final LeaveScreen f111909b = new LeaveScreen();

        private LeaveScreen() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof LeaveScreen);
        }

        public final int hashCode() {
            return -715837724;
        }

        @Y61.k
        public final String toString() {
            return "LeaveScreen";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$LocationLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LocationLoaded implements TrackableContent, BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Location f111910b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f111911c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f111912d;

        public LocationLoaded(@Y61.k Location location) {
            this.f111910b = location;
            BxContentScreen bxContentScreen = BxContentScreen.f90305d;
            bxContentScreen.getClass();
            String str = BxContentScreen.f90308g;
            this.f111911c = str;
            bxContentScreen.getClass();
            this.f111912d = str;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final Location getF111910b() {
            return this.f111910b;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f111911c;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getF303160d() {
            return this.f111912d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationLoaded) && L.f(this.f111910b, ((LocationLoaded) obj).f111910b);
        }

        public final int hashCode() {
            return this.f111910b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LocationLoaded(location=" + this.f111910b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$LocationLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LocationLoading extends TrackableLoadingStarted implements BxContentInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final G0 f111913d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f111914e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final ScreenPerformanceTracker.LoadingType f111915f;

        public LocationLoading(@Y61.k G0 g02) {
            this.f111913d = g02;
            BxContentScreen.f90305d.getClass();
            this.f111914e = BxContentScreen.f90308g;
            this.f111915f = ScreenPerformanceTracker.LoadingType.f90786c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f111914e;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationLoading) && L.f(this.f111913d, ((LocationLoading) obj).f111913d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @Y61.k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF315371e() {
            return this.f111915f;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f111913d.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.v(new StringBuilder("LocationLoading(data="), this.f111913d, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$MainStartOnboardingStepShow;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MainStartOnboardingStepShow implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final MainStartOnboardingStep f111916b;

        public MainStartOnboardingStepShow(@Y61.k MainStartOnboardingStep mainStartOnboardingStep) {
            this.f111916b = mainStartOnboardingStep;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MainStartOnboardingStepShow) && L.f(this.f111916b, ((MainStartOnboardingStepShow) obj).f111916b);
        }

        public final int hashCode() {
            return this.f111916b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "MainStartOnboardingStepShow(step=" + this.f111916b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$MarkAdvertAsViewed;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MarkAdvertAsViewed implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f111917b;

        public MarkAdvertAsViewed(@Y61.k String str) {
            this.f111917b = str;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final String getF111917b() {
            return this.f111917b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MarkAdvertAsViewed) && L.f(this.f111917b, ((MarkAdvertAsViewed) obj).f111917b);
        }

        public final int hashCode() {
            return this.f111917b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("MarkAdvertAsViewed(itemId="), this.f111917b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$NotificationLocationChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotificationLocationChanged implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f111918b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f111919c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final PresentationType f111920d;

        public NotificationLocationChanged(@Y61.k String str, @Y61.l String str2, @Y61.k PresentationType presentationType) {
            this.f111918b = str;
            this.f111919c = str2;
            this.f111920d = presentationType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotificationLocationChanged)) {
                return false;
            }
            NotificationLocationChanged notificationLocationChanged = (NotificationLocationChanged) obj;
            return L.f(this.f111918b, notificationLocationChanged.f111918b) && L.f(this.f111919c, notificationLocationChanged.f111919c) && this.f111920d == notificationLocationChanged.f111920d;
        }

        public final int hashCode() {
            int iHashCode = this.f111918b.hashCode() * 31;
            String str = this.f111919c;
            return this.f111920d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            return "NotificationLocationChanged(locationId=" + this.f111918b + ", geoSessionId=" + this.f111919c + ", presentationType=" + this.f111920d + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$NotifyFeaturesAboutSubscriptionsState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotifyFeaturesAboutSubscriptionsState implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InlineAction.Predefined.State f111921b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f111922c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f111923d;

        public NotifyFeaturesAboutSubscriptionsState(@Y61.k InlineAction.Predefined.State state, @Y61.l String str, boolean z12) {
            this.f111921b = state;
            this.f111922c = str;
            this.f111923d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NotifyFeaturesAboutSubscriptionsState)) {
                return false;
            }
            NotifyFeaturesAboutSubscriptionsState notifyFeaturesAboutSubscriptionsState = (NotifyFeaturesAboutSubscriptionsState) obj;
            return this.f111921b == notifyFeaturesAboutSubscriptionsState.f111921b && L.f(this.f111922c, notifyFeaturesAboutSubscriptionsState.f111922c) && this.f111923d == notifyFeaturesAboutSubscriptionsState.f111923d;
        }

        public final int hashCode() {
            int iHashCode = this.f111921b.hashCode() * 31;
            String str = this.f111922c;
            return Boolean.hashCode(this.f111923d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyFeaturesAboutSubscriptionsState(state=");
            sb2.append(this.f111921b);
            sb2.append(", filterId=");
            sb2.append(this.f111922c);
            sb2.append(", isSubscribed=");
            return androidx.appcompat.app.r.x(sb2, this.f111923d, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$NotifyFeaturesSearchParamsChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotifyFeaturesSearchParamsChanged implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final NotifyFeaturesSearchParamsChanged f111924b = new NotifyFeaturesSearchParamsChanged();

        private NotifyFeaturesSearchParamsChanged() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof NotifyFeaturesSearchParamsChanged);
        }

        public final int hashCode() {
            return 777398049;
        }

        @Y61.k
        public final String toString() {
            return "NotifyFeaturesSearchParamsChanged";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$NotifyFeaturesSerpLoad;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotifyFeaturesSerpLoad implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final NotifyFeaturesSerpLoad f111925b = new NotifyFeaturesSerpLoad();

        private NotifyFeaturesSerpLoad() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof NotifyFeaturesSerpLoad);
        }

        public final int hashCode() {
            return -347642277;
        }

        @Y61.k
        public final String toString() {
            return "NotifyFeaturesSerpLoad";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenAvitoBlog;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenAvitoBlog implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AvitoBlogArticle f111926b;

        public OpenAvitoBlog(@Y61.k AvitoBlogArticle avitoBlogArticle) {
            this.f111926b = avitoBlogArticle;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAvitoBlog) && L.f(this.f111926b, ((OpenAvitoBlog) obj).f111926b);
        }

        public final int hashCode() {
            return this.f111926b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenAvitoBlog(avitoBlogArticle=" + this.f111926b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenBottomSheetOnboarding;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBottomSheetOnboarding implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final DeepLink f111927b;

        public OpenBottomSheetOnboarding(@Y61.l DeepLink deepLink) {
            this.f111927b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBottomSheetOnboarding) && L.f(this.f111927b, ((OpenBottomSheetOnboarding) obj).f111927b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f111927b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenBottomSheetOnboarding(link="), this.f111927b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenCategoriesScreen;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenCategoriesScreen implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final RubricatorRefinedItem.SerpRubricatorCategoryItem f111928b;

        public OpenCategoriesScreen(@Y61.k RubricatorRefinedItem.SerpRubricatorCategoryItem serpRubricatorCategoryItem) {
            this.f111928b = serpRubricatorCategoryItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenCategoriesScreen) && L.f(this.f111928b, ((OpenCategoriesScreen) obj).f111928b);
        }

        public final int hashCode() {
            return this.f111928b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenCategoriesScreen(rubricatorCategoryItem=" + this.f111928b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenDealConfirmation;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDealConfirmation implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DealConfirmationSheet f111929b;

        public OpenDealConfirmation(@Y61.k DealConfirmationSheet dealConfirmationSheet) {
            this.f111929b = dealConfirmationSheet;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDealConfirmation) && L.f(this.f111929b, ((OpenDealConfirmation) obj).f111929b);
        }

        public final int hashCode() {
            return this.f111929b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenDealConfirmation(sheetInfo=" + this.f111929b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenDeeplink;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f111930b;

        public OpenDeeplink(@Y61.k DeepLink deepLink) {
            this.f111930b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f111930b, ((OpenDeeplink) obj).f111930b);
        }

        public final int hashCode() {
            return this.f111930b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(link="), this.f111930b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenMainScreenOnBackToAvoidAppLeaving;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMainScreenOnBackToAvoidAppLeaving implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final OpenMainScreenOnBackToAvoidAppLeaving f111939b = new OpenMainScreenOnBackToAvoidAppLeaving();

        private OpenMainScreenOnBackToAvoidAppLeaving() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof OpenMainScreenOnBackToAvoidAppLeaving);
        }

        public final int hashCode() {
            return 716427289;
        }

        @Y61.k
        public final String toString() {
            return "OpenMainScreenOnBackToAvoidAppLeaving";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenSearchBar;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSearchBar implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final List<UxFeedbackConfigOld> f111940b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f111941c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final SearchSuggestInternalShowLink f111942d;

        public OpenSearchBar() {
            this(null, false, null, 7, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSearchBar)) {
                return false;
            }
            OpenSearchBar openSearchBar = (OpenSearchBar) obj;
            return L.f(this.f111940b, openSearchBar.f111940b) && this.f111941c == openSearchBar.f111941c && L.f(this.f111942d, openSearchBar.f111942d);
        }

        public final int hashCode() {
            List<UxFeedbackConfigOld> list = this.f111940b;
            int i12 = androidx.appcompat.app.r.i((list == null ? 0 : list.hashCode()) * 31, 31, this.f111941c);
            SearchSuggestInternalShowLink searchSuggestInternalShowLink = this.f111942d;
            return i12 + (searchSuggestInternalShowLink != null ? searchSuggestInternalShowLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "OpenSearchBar(uxFeedbackConfigs=" + this.f111940b + ", autoOpenSuggest=" + this.f111941c + ", searchSuggestLink=" + this.f111942d + ')';
        }

        public OpenSearchBar(List list, boolean z12, SearchSuggestInternalShowLink searchSuggestInternalShowLink, int i12, C42822w c42822w) {
            list = (i12 & 1) != 0 ? null : list;
            z12 = (i12 & 2) != 0 ? false : z12;
            searchSuggestInternalShowLink = (i12 & 4) != 0 ? null : searchSuggestInternalShowLink;
            this.f111940b = list;
            this.f111941c = z12;
            this.f111942d = searchSuggestInternalShowLink;
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenServicesScreen;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenServicesScreen implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final RubricatorRefinedItem.SerpRubricatorServiceItem f111943b;

        public OpenServicesScreen(@Y61.k RubricatorRefinedItem.SerpRubricatorServiceItem serpRubricatorServiceItem) {
            this.f111943b = serpRubricatorServiceItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenServicesScreen) && L.f(this.f111943b, ((OpenServicesScreen) obj).f111943b);
        }

        public final int hashCode() {
            return this.f111943b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenServicesScreen(rubricatorServiceItem=" + this.f111943b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenSharingDialog;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSharingDialog implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ToolbarShareButton f111944b;

        public OpenSharingDialog(@Y61.k ToolbarShareButton toolbarShareButton) {
            this.f111944b = toolbarShareButton;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSharingDialog) && L.f(this.f111944b, ((OpenSharingDialog) obj).f111944b);
        }

        public final int hashCode() {
            return this.f111944b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenSharingDialog(toolbarShareButton=" + this.f111944b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$PanelStateChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PanelStateChanged implements BxContentInternalAction {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PanelStateChanged)) {
                return false;
            }
            ((PanelStateChanged) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return -1217487446;
        }

        @Y61.k
        public final String toString() {
            return "PanelStateChanged(newState=hidden)";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ProxyBeduinFeatureOneTimeEvent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProxyBeduinFeatureOneTimeEvent implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BeduinOneTimeEvent f111945b;

        public ProxyBeduinFeatureOneTimeEvent(@Y61.k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f111945b = beduinOneTimeEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProxyBeduinFeatureOneTimeEvent) && L.f(this.f111945b, ((ProxyBeduinFeatureOneTimeEvent) obj).f111945b);
        }

        public final int hashCode() {
            return this.f111945b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ProxyBeduinFeatureOneTimeEvent(event=" + this.f111945b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RecsReloadButtonVisibilityChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RecsReloadButtonVisibilityChanged implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f111946b;

        public RecsReloadButtonVisibilityChanged(boolean z12) {
            this.f111946b = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF111946b() {
            return this.f111946b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RecsReloadButtonVisibilityChanged) && this.f111946b == ((RecsReloadButtonVisibilityChanged) obj).f111946b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f111946b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("RecsReloadButtonVisibilityChanged(shouldShowButton="), this.f111946b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "ById", "ByInstance", "ByStringId", "Laas", "RecentQuerySearch", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ById;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ByInstance;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ByStringId;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$Laas;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$RecentQuerySearch;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RemoveItem extends BxContentInternalAction {

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ById;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ById implements RemoveItem {

            /* renamed from: b, reason: collision with root package name */
            public final long f111947b;

            public ById(long j12) {
                this.f111947b = j12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ById) && this.f111947b == ((ById) obj).f111947b;
            }

            @Override // com.avito.android.bxcontent.mvi.entity.BxContentInternalAction.RemoveItem
            public final boolean f(@Y61.k l1 l1Var) {
                return l1Var.getF74860b() == this.f111947b;
            }

            public final int hashCode() {
                return Long.hashCode(this.f111947b);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.u(new StringBuilder("ById(id="), this.f111947b, ')');
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ByInstance;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ByInstance implements RemoveItem {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final SnippetItem f111948b;

            public ByInstance(@Y61.k SnippetItem snippetItem) {
                this.f111948b = snippetItem;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ByInstance) && L.f(this.f111948b, ((ByInstance) obj).f111948b);
            }

            @Override // com.avito.android.bxcontent.mvi.entity.BxContentInternalAction.RemoveItem
            public final boolean f(@Y61.k l1 l1Var) {
                return l1Var.equals(this.f111948b);
            }

            public final int hashCode() {
                return this.f111948b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ByInstance(targetItem=" + this.f111948b + ')';
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ByStringId;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ByStringId implements RemoveItem {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f111949b;

            public ByStringId(@Y61.k String str) {
                this.f111949b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ByStringId) && L.f(this.f111949b, ((ByStringId) obj).f111949b);
            }

            @Override // com.avito.android.bxcontent.mvi.entity.BxContentInternalAction.RemoveItem
            public final boolean f(@Y61.k l1 l1Var) {
                return L.f(l1Var.getF74861c(), this.f111949b);
            }

            public final int hashCode() {
                return this.f111949b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("ByStringId(stringId="), this.f111949b, ')');
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$Laas;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Laas implements RemoveItem {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Laas f111950b = new Laas();

            private Laas() {
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Laas);
            }

            @Override // com.avito.android.bxcontent.mvi.entity.BxContentInternalAction.RemoveItem
            public final boolean f(@Y61.k l1 l1Var) {
                return l1Var instanceof LocationNotificationItem;
            }

            public final int hashCode() {
                return -1502203201;
            }

            @Y61.k
            public final String toString() {
                return "Laas";
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$RecentQuerySearch;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RecentQuerySearch implements RemoveItem {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final RecentQuerySearch f111951b = new RecentQuerySearch();

            private RecentQuerySearch() {
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof RecentQuerySearch);
            }

            @Override // com.avito.android.bxcontent.mvi.entity.BxContentInternalAction.RemoveItem
            public final boolean f(@Y61.k l1 l1Var) {
                return l1Var instanceof RecentQuerySearchItem;
            }

            public final int hashCode() {
                return -1288893475;
            }

            @Y61.k
            public final String toString() {
                return "RecentQuerySearch";
            }
        }

        boolean f(@Y61.k l1 l1Var);
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RequestPrepareViewForOnboarding;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RequestPrepareViewForOnboarding implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f111952b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Onboarding f111953c;

        public RequestPrepareViewForOnboarding(int i12, @Y61.k Onboarding onboarding) {
            this.f111952b = i12;
            this.f111953c = onboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestPrepareViewForOnboarding)) {
                return false;
            }
            RequestPrepareViewForOnboarding requestPrepareViewForOnboarding = (RequestPrepareViewForOnboarding) obj;
            return this.f111952b == requestPrepareViewForOnboarding.f111952b && L.f(this.f111953c, requestPrepareViewForOnboarding.f111953c);
        }

        public final int hashCode() {
            return this.f111953c.hashCode() + (Integer.hashCode(this.f111952b) * 31);
        }

        @Y61.k
        public final String toString() {
            return "RequestPrepareViewForOnboarding(position=" + this.f111952b + ", onboarding=" + this.f111953c + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ResetVerticalFilter;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetVerticalFilter implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ResetVerticalFilter f111954b = new ResetVerticalFilter();

        private ResetVerticalFilter() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof ResetVerticalFilter);
        }

        public final int hashCode() {
            return -1452209762;
        }

        @Y61.k
        public final String toString() {
            return "ResetVerticalFilter";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RestartFromLauncher;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RestartFromLauncher implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final RestartFromLauncher f111955b = new RestartFromLauncher();

        private RestartFromLauncher() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof RestartFromLauncher);
        }

        public final int hashCode() {
            return 1892646138;
        }

        @Y61.k
        public final String toString() {
            return "RestartFromLauncher";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ScrollToStart;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToStart implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f111956b;

        public ScrollToStart(boolean z12) {
            this.f111956b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToStart) && this.f111956b == ((ScrollToStart) obj).f111956b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f111956b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ScrollToStart(onNextUpdate="), this.f111956b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$SearchSubscriptionStateChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchSubscriptionStateChanged implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InlineAction.Predefined.State f111957b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f111958c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f111959d;

        public SearchSubscriptionStateChanged(@Y61.k InlineAction.Predefined.State state, @Y61.l String str, boolean z12) {
            this.f111957b = state;
            this.f111958c = str;
            this.f111959d = z12;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getF111958c() {
            return this.f111958c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSubscriptionStateChanged)) {
                return false;
            }
            SearchSubscriptionStateChanged searchSubscriptionStateChanged = (SearchSubscriptionStateChanged) obj;
            return this.f111957b == searchSubscriptionStateChanged.f111957b && L.f(this.f111958c, searchSubscriptionStateChanged.f111958c) && this.f111959d == searchSubscriptionStateChanged.f111959d;
        }

        public final int hashCode() {
            int iHashCode = this.f111957b.hashCode() * 31;
            String str = this.f111958c;
            return Boolean.hashCode(this.f111959d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchSubscriptionStateChanged(state=");
            sb2.append(this.f111957b);
            sb2.append(", filterId=");
            sb2.append(this.f111958c);
            sb2.append(", isSubscribed=");
            return androidx.appcompat.app.r.x(sb2, this.f111959d, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$SelectDatesButtonClicked;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectDatesButtonClicked implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final SelectDatesButtonClicked f111960b = new SelectDatesButtonClicked();

        private SelectDatesButtonClicked() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof SelectDatesButtonClicked);
        }

        public final int hashCode() {
            return -274623253;
        }

        @Y61.k
        public final String toString() {
            return "SelectDatesButtonClicked";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowBusiness360Toast;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowBusiness360Toast implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final BxContentBusiness360.Toast f111961b;

        public ShowBusiness360Toast(@Y61.k BxContentBusiness360.Toast toast) {
            this.f111961b = toast;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowBusiness360Toast) && L.f(this.f111961b, ((ShowBusiness360Toast) obj).f111961b);
        }

        public final int hashCode() {
            return this.f111961b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowBusiness360Toast(toast=" + this.f111961b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowLastSearchTooltip;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLastSearchTooltip implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.bxcontent.last_search_tooltip.a f111962b;

        public ShowLastSearchTooltip(@Y61.k com.avito.android.bxcontent.last_search_tooltip.a aVar) {
            this.f111962b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLastSearchTooltip) && L.f(this.f111962b, ((ShowLastSearchTooltip) obj).f111962b);
        }

        public final int hashCode() {
            return this.f111962b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowLastSearchTooltip(tooltip=" + this.f111962b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowOnboardings;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowOnboardings implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final SearchParams f111963b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final NavigationBarStyle f111964c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final BxContentBusiness360.ReplaceMain f111965d;

        public ShowOnboardings(@Y61.l SearchParams searchParams, @Y61.l NavigationBarStyle navigationBarStyle, @Y61.l BxContentBusiness360.ReplaceMain replaceMain) {
            this.f111963b = searchParams;
            this.f111964c = navigationBarStyle;
            this.f111965d = replaceMain;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowOnboardings)) {
                return false;
            }
            ShowOnboardings showOnboardings = (ShowOnboardings) obj;
            return L.f(this.f111963b, showOnboardings.f111963b) && L.f(this.f111964c, showOnboardings.f111964c) && L.f(this.f111965d, showOnboardings.f111965d);
        }

        public final int hashCode() {
            SearchParams searchParams = this.f111963b;
            int iHashCode = (searchParams == null ? 0 : searchParams.hashCode()) * 31;
            NavigationBarStyle navigationBarStyle = this.f111964c;
            int iHashCode2 = (iHashCode + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode())) * 31;
            BxContentBusiness360.ReplaceMain replaceMain = this.f111965d;
            return iHashCode2 + (replaceMain != null ? replaceMain.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "ShowOnboardings(searchParams=" + this.f111963b + ", navigationBarStyle=" + this.f111964c + ", business360=" + this.f111965d + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowPersonalFiltersChangeDialog;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPersonalFiltersChangeDialog implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Filter.AutoShowPresetFiltersDialog f111966b;

        public ShowPersonalFiltersChangeDialog(@Y61.k Filter.AutoShowPresetFiltersDialog autoShowPresetFiltersDialog) {
            this.f111966b = autoShowPresetFiltersDialog;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowPersonalFiltersChangeDialog) && L.f(this.f111966b, ((ShowPersonalFiltersChangeDialog) obj).f111966b);
        }

        public final int hashCode() {
            return this.f111966b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowPersonalFiltersChangeDialog(dialog=" + this.f111966b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowProgressToast;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowProgressToast implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ProgressInfoToastBarData f111967b;

        public ShowProgressToast(@Y61.k ProgressInfoToastBarData progressInfoToastBarData) {
            this.f111967b = progressInfoToastBarData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowProgressToast) && L.f(this.f111967b, ((ShowProgressToast) obj).f111967b);
        }

        public final int hashCode() {
            return this.f111967b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowProgressToast(progressToastData=" + this.f111967b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowRemoteUxFeedbackByEvent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowRemoteUxFeedbackByEvent implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<UxFeedbackConfigOld> f111968b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SearchRemoteFeedbackEvent f111969c;

        public ShowRemoteUxFeedbackByEvent(@Y61.k List list, @Y61.k SearchRemoteFeedbackEvent searchRemoteFeedbackEvent) {
            this.f111968b = list;
            this.f111969c = searchRemoteFeedbackEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowRemoteUxFeedbackByEvent)) {
                return false;
            }
            ShowRemoteUxFeedbackByEvent showRemoteUxFeedbackByEvent = (ShowRemoteUxFeedbackByEvent) obj;
            return L.f(this.f111968b, showRemoteUxFeedbackByEvent.f111968b) && this.f111969c.equals(showRemoteUxFeedbackByEvent.f111969c);
        }

        public final int hashCode() {
            return this.f111969c.hashCode() + (this.f111968b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowRemoteUxFeedbackByEvent(uxFeedbackConfigs=" + this.f111968b + ", remoteFeedbackEvent=" + this.f111969c + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowReplaceMainExitOnboarding;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowReplaceMainExitOnboarding implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ReplaceMainExitOnboarding f111970b;

        public ShowReplaceMainExitOnboarding(@Y61.k ReplaceMainExitOnboarding replaceMainExitOnboarding) {
            this.f111970b = replaceMainExitOnboarding;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowReplaceMainExitOnboarding) && L.f(this.f111970b, ((ShowReplaceMainExitOnboarding) obj).f111970b);
        }

        public final int hashCode() {
            return this.f111970b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowReplaceMainExitOnboarding(onboarding=" + this.f111970b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowSerpAdvertScrollToast;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSerpAdvertScrollToast implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f111971b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f111972c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f111973d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f111974e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Y41.a<G0> f111975f;

        public ShowSerpAdvertScrollToast(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
            this.f111971b = str;
            this.f111972c = str2;
            this.f111973d = aVar;
            this.f111974e = aVar2;
            this.f111975f = aVar3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSerpAdvertScrollToast)) {
                return false;
            }
            ShowSerpAdvertScrollToast showSerpAdvertScrollToast = (ShowSerpAdvertScrollToast) obj;
            return L.f(this.f111971b, showSerpAdvertScrollToast.f111971b) && L.f(this.f111972c, showSerpAdvertScrollToast.f111972c) && L.f(this.f111973d, showSerpAdvertScrollToast.f111973d) && L.f(this.f111974e, showSerpAdvertScrollToast.f111974e) && L.f(this.f111975f, showSerpAdvertScrollToast.f111975f);
        }

        public final int hashCode() {
            return this.f111975f.hashCode() + androidx.appcompat.app.r.h(androidx.appcompat.app.r.h(H.d(this.f111971b.hashCode() * 31, 31, this.f111972c), 31, this.f111973d), 31, this.f111974e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSerpAdvertScrollToast(title=");
            sb2.append(this.f111971b);
            sb2.append(", subtitle=");
            sb2.append(this.f111972c);
            sb2.append(", onDismiss=");
            sb2.append(this.f111973d);
            sb2.append(", onShow=");
            sb2.append(this.f111974e);
            sb2.append(", onClose=");
            return androidx.appcompat.app.r.v(sb2, this.f111975f, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowToast;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PrintableText f111976b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f111977c;

        public ShowToast(@Y61.k PrintableText printableText, @Y61.k com.avito.android.component.toast.f fVar) {
            this.f111976b = printableText;
            this.f111977c = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowToast)) {
                return false;
            }
            ShowToast showToast = (ShowToast) obj;
            return L.f(this.f111976b, showToast.f111976b) && L.f(this.f111977c, showToast.f111977c);
        }

        public final int hashCode() {
            return this.f111977c.hashCode() + (this.f111976b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowToast(message=" + this.f111976b + ", type=" + this.f111977c + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowUniversalButton;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUniversalButton implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final ShowUniversalButton f111978b = new ShowUniversalButton();

        private ShowUniversalButton() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof ShowUniversalButton);
        }

        public final int hashCode() {
            return -1647986559;
        }

        @Y61.k
        public final String toString() {
            return "ShowUniversalButton";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ShowUxFeedbackWithConfig;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUxFeedbackWithConfig implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UxFeedbackConfig f111979b;

        public ShowUxFeedbackWithConfig(@Y61.k UxFeedbackConfig uxFeedbackConfig) {
            this.f111979b = uxFeedbackConfig;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowUxFeedbackWithConfig) && L.f(this.f111979b, ((ShowUxFeedbackWithConfig) obj).f111979b);
        }

        public final int hashCode() {
            return this.f111979b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowUxFeedbackWithConfig(uxFeedbackConfig=" + this.f111979b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$SkipBottomSheetOnboarding;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SkipBottomSheetOnboarding implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SearchParams f111980b;

        public SkipBottomSheetOnboarding(@Y61.k SearchParams searchParams) {
            this.f111980b = searchParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SkipBottomSheetOnboarding) && L.f(this.f111980b, ((SkipBottomSheetOnboarding) obj).f111980b);
        }

        public final int hashCode() {
            return this.f111980b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return f.m(new StringBuilder("SkipBottomSheetOnboarding(searchParams="), this.f111980b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Stub;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stub implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Stub f111981b = new Stub();

        private Stub() {
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Stub);
        }

        public final int hashCode() {
            return -1496024339;
        }

        @Y61.k
        public final String toString() {
            return "Stub";
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ToggleSearchBarVisibility;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleSearchBarVisibility implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f111984b;

        public ToggleSearchBarVisibility(boolean z12) {
            this.f111984b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSearchBarVisibility) && this.f111984b == ((ToggleSearchBarVisibility) obj).f111984b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f111984b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ToggleSearchBarVisibility(isOpened="), this.f111984b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$TopSheetError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TopSheetError implements TrackableError, BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Throwable f111985b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final J.a f111986c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f111987d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f111988e;

        public TopSheetError(@Y61.k Throwable th2) {
            this.f111985b = th2;
            this.f111986c = new J.a(th2);
            BxContentScreen bxContentScreen = BxContentScreen.f90305d;
            bxContentScreen.getClass();
            String str = BxContentScreen.f90307f;
            this.f111987d = str;
            bxContentScreen.getClass();
            this.f111988e = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f111987d;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getF303160d() {
            return this.f111988e;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TopSheetError) && L.f(this.f111985b, ((TopSheetError) obj).f111985b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @Y61.k
        /* renamed from: g, reason: from getter */
        public final J.a getF127884c() {
            return this.f111986c;
        }

        public final int hashCode() {
            return this.f111985b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("TopSheetError(throwable="), this.f111985b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$TopSheetLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TopSheetLoaded implements TrackableContent, BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final MiniMenuBlockItem f111989b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ArrayList f111990c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final VisualRubricatorWidgetItem f111991d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f111992e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final String f111993f;

        public TopSheetLoaded(@Y61.l MiniMenuBlockItem miniMenuBlockItem, @Y61.l ArrayList arrayList, @Y61.l VisualRubricatorWidgetItem visualRubricatorWidgetItem) {
            this.f111989b = miniMenuBlockItem;
            this.f111990c = arrayList;
            this.f111991d = visualRubricatorWidgetItem;
            BxContentScreen.f90305d.getClass();
            String str = BxContentScreen.f90307f;
            this.f111992e = str;
            this.f111993f = str;
        }

        @Y61.l
        public final List<ShortcutNavigationItem> c() {
            return this.f111990c;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f111992e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getF303160d() {
            return this.f111993f;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TopSheetLoaded)) {
                return false;
            }
            TopSheetLoaded topSheetLoaded = (TopSheetLoaded) obj;
            return L.f(this.f111989b, topSheetLoaded.f111989b) && L.f(this.f111990c, topSheetLoaded.f111990c) && L.f(this.f111991d, topSheetLoaded.f111991d);
        }

        public final int hashCode() {
            MiniMenuBlockItem miniMenuBlockItem = this.f111989b;
            int iHashCode = (miniMenuBlockItem == null ? 0 : miniMenuBlockItem.hashCode()) * 31;
            ArrayList arrayList = this.f111990c;
            int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            VisualRubricatorWidgetItem visualRubricatorWidgetItem = this.f111991d;
            return iHashCode2 + (visualRubricatorWidgetItem != null ? visualRubricatorWidgetItem.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "TopSheetLoaded(miniMenu=" + this.f111989b + ", shortcuts=" + this.f111990c + ", newRubricator=" + this.f111991d + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$TopSheetLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TopSheetLoading extends TrackableLoadingStarted implements BxContentInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f111994d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ScreenPerformanceTracker.LoadingType f111995e;

        public TopSheetLoading() {
            BxContentScreen.f90305d.getClass();
            this.f111994d = BxContentScreen.f90307f;
            this.f111995e = ScreenPerformanceTracker.LoadingType.f90785b;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f111994d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TopSheetLoading) && super.equals(obj);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        @Y61.k
        /* renamed from: h, reason: from getter */
        public final ScreenPerformanceTracker.LoadingType getF315371e() {
            return this.f111995e;
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateBottomSheetOffset;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateBottomSheetOffset implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final float f111996b;

        public UpdateBottomSheetOffset(float f12) {
            this.f111996b = f12;
        }

        /* renamed from: c, reason: from getter */
        public final float getF111996b() {
            return this.f111996b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateBottomSheetOffset) && Float.compare(this.f111996b, ((UpdateBottomSheetOffset) obj).f111996b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f111996b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.k(')', this.f111996b, new StringBuilder("UpdateBottomSheetOffset(offset="));
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateCachedContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCachedContent implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final FeedId f111997b;

        public UpdateCachedContent(@Y61.k FeedId feedId) {
            this.f111997b = feedId;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final FeedId getF111997b() {
            return this.f111997b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCachedContent) && L.f(this.f111997b, ((UpdateCachedContent) obj).f111997b);
        }

        public final int hashCode() {
            return this.f111997b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateCachedContent(feedId=" + this.f111997b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateCartIconState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCartIconState implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC31171n f111998b;

        public UpdateCartIconState(@Y61.k InterfaceC31171n interfaceC31171n) {
            this.f111998b = interfaceC31171n;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final InterfaceC31171n getF111998b() {
            return this.f111998b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCartIconState) && L.f(this.f111998b, ((UpdateCartIconState) obj).f111998b);
        }

        public final int hashCode() {
            return this.f111998b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateCartIconState(state=" + this.f111998b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateChangeLocationCondition;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateChangeLocationCondition implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f111999b;

        public UpdateChangeLocationCondition(boolean z12) {
            this.f111999b = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getF111999b() {
            return this.f111999b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateChangeLocationCondition) && this.f111999b == ((UpdateChangeLocationCondition) obj).f111999b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f111999b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateChangeLocationCondition(changeMainPageLocation="), this.f111999b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateCurrentFeed;", "Lcom/avito/android/analytics/screens/mvi/TrackablePreloadedContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCurrentFeed implements TrackablePreloadedContent, BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final FeedId f112000b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f112001c;

        public UpdateCurrentFeed(@Y61.k FeedId feedId) {
            this.f112000b = feedId;
            BxContentScreen.f90305d.getClass();
            this.f112001c = BxContentScreen.f90306e;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getF303160d() {
            return this.f112001c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCurrentFeed) && L.f(this.f112000b, ((UpdateCurrentFeed) obj).f112000b);
        }

        public final int hashCode() {
            return this.f112000b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateCurrentFeed(feedId=" + this.f112000b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateFeaturedFeed;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateFeaturedFeed implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f112002b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<l1> f112003c;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateFeaturedFeed(@Y61.k String str, @Y61.k List<? extends l1> list) {
            this.f112002b = str;
            this.f112003c = list;
        }

        @Y61.k
        public final List<l1> c() {
            return this.f112003c;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF112002b() {
            return this.f112002b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateFeaturedFeed)) {
                return false;
            }
            UpdateFeaturedFeed updateFeaturedFeed = (UpdateFeaturedFeed) obj;
            return L.f(this.f112002b, updateFeaturedFeed.f112002b) && L.f(this.f112003c, updateFeaturedFeed.f112003c);
        }

        public final int hashCode() {
            return this.f112003c.hashCode() + (this.f112002b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateFeaturedFeed(selectedTabName=");
            sb2.append(this.f112002b);
            sb2.append(", items=");
            return H.p(sb2, this.f112003c, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateFiltersPointVisibility;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateFiltersPointVisibility implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f112004b;

        public UpdateFiltersPointVisibility(int i12) {
            this.f112004b = i12;
        }

        /* renamed from: c, reason: from getter */
        public final int getF112004b() {
            return this.f112004b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateFiltersPointVisibility) && this.f112004b == ((UpdateFiltersPointVisibility) obj).f112004b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f112004b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("UpdateFiltersPointVisibility(count="), this.f112004b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateHeaderToolbarItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateHeaderToolbarItem implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ServiceTransportationWidgetItem f112005b;

        public UpdateHeaderToolbarItem(@Y61.k ServiceTransportationWidgetItem serviceTransportationWidgetItem) {
            this.f112005b = serviceTransportationWidgetItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateHeaderToolbarItem) && L.f(this.f112005b, ((UpdateHeaderToolbarItem) obj).f112005b);
        }

        public final int hashCode() {
            return this.f112005b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateHeaderToolbarItem(item=" + this.f112005b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItem implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final l1 f112008b;

        public UpdateItem(@Y61.k l1 l1Var) {
            this.f112008b = l1Var;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateItem) && L.f(this.f112008b, ((UpdateItem) obj).f112008b);
        }

        public final int hashCode() {
            return this.f112008b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateItem(item=" + this.f112008b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdatePlaybackSnippets;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "a", "b", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePlaybackSnippets implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f112009b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final HashMap f112010c;

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdatePlaybackSnippets$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f112011a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Long f112012b;

            /* renamed from: c, reason: collision with root package name */
            public final float f112013c;

            /* renamed from: d, reason: collision with root package name */
            public final int f112014d;

            public a() {
                this(false, null, 0.0f, 0, 15, null);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f112011a == aVar.f112011a && L.f(this.f112012b, aVar.f112012b) && Float.compare(this.f112013c, aVar.f112013c) == 0 && this.f112014d == aVar.f112014d;
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f112011a) * 31;
                Long l12 = this.f112012b;
                return Integer.hashCode(this.f112014d) + androidx.appcompat.app.r.d(this.f112013c, (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("PlaybackSettings(isCommercial=");
                sb2.append(this.f112011a);
                sb2.append(", videoPositionMs=");
                sb2.append(this.f112012b);
                sb2.append(", videoVolume=");
                sb2.append(this.f112013c);
                sb2.append(", videoRepeatMode=");
                return androidx.appcompat.app.r.t(sb2, this.f112014d, ')');
            }

            public a(boolean z12, @Y61.l Long l12, float f12, int i12) {
                this.f112011a = z12;
                this.f112012b = l12;
                this.f112013c = f12;
                this.f112014d = i12;
            }

            public /* synthetic */ a(boolean z12, Long l12, float f12, int i12, int i13, C42822w c42822w) {
                this((i13 & 1) != 0 ? false : z12, (i13 & 2) != 0 ? 0L : l12, (i13 & 4) != 0 ? 0.0f : f12, (i13 & 8) != 0 ? 0 : i12);
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdatePlaybackSnippets$b;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f112015a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f112016b;

            /* renamed from: c, reason: collision with root package name */
            public final int f112017c;

            public b(@Y61.k String str, @Y61.k String str2, int i12) {
                this.f112015a = str;
                this.f112016b = str2;
                this.f112017c = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f112015a, bVar.f112015a) && L.f(this.f112016b, bVar.f112016b) && this.f112017c == bVar.f112017c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f112017c) + H.d(this.f112015a.hashCode() * 31, 31, this.f112016b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VideoItemData(itemId=");
                sb2.append(this.f112015a);
                sb2.append(", videoUrl=");
                sb2.append(this.f112016b);
                sb2.append(", position=");
                return androidx.appcompat.app.r.t(sb2, this.f112017c, ')');
            }
        }

        public UpdatePlaybackSnippets(@Y61.k ArrayList arrayList, @Y61.l HashMap map) {
            this.f112009b = arrayList;
            this.f112010c = map;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatePlaybackSnippets)) {
                return false;
            }
            UpdatePlaybackSnippets updatePlaybackSnippets = (UpdatePlaybackSnippets) obj;
            return this.f112009b.equals(updatePlaybackSnippets.f112009b) && L.f(this.f112010c, updatePlaybackSnippets.f112010c);
        }

        public final int hashCode() {
            int iHashCode = this.f112009b.hashCode() * 31;
            HashMap map = this.f112010c;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "UpdatePlaybackSnippets(idsRange=" + this.f112009b + ", playbackSettings=" + this.f112010c + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdatePrivateState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePrivateState implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final i f112018b;

        public UpdatePrivateState(@Y61.k i iVar) {
            this.f112018b = iVar;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final i getF112018b() {
            return this.f112018b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePrivateState) && L.f(this.f112018b, ((UpdatePrivateState) obj).f112018b);
        }

        public final int hashCode() {
            return this.f112018b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdatePrivateState(state=" + this.f112018b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateRecsReloadState;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateRecsReloadState implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final RecsReloadingState f112019b;

        public UpdateRecsReloadState(@Y61.k RecsReloadingState recsReloadingState) {
            this.f112019b = recsReloadingState;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final RecsReloadingState getF112019b() {
            return this.f112019b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateRecsReloadState) && this.f112019b == ((UpdateRecsReloadState) obj).f112019b;
        }

        public final int hashCode() {
            return this.f112019b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateRecsReloadState(state=" + this.f112019b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateScrollToTopButtonVisibility;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateScrollToTopButtonVisibility implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112020b;

        public UpdateScrollToTopButtonVisibility(boolean z12) {
            this.f112020b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateScrollToTopButtonVisibility) && this.f112020b == ((UpdateScrollToTopButtonVisibility) obj).f112020b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112020b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("UpdateScrollToTopButtonVisibility(isVisible="), this.f112020b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateSuggestionsParams;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSuggestionsParams implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.search.p f112021b;

        public UpdateSuggestionsParams(@Y61.k com.avito.android.search.p pVar) {
            this.f112021b = pVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSuggestionsParams) && L.f(this.f112021b, ((UpdateSuggestionsParams) obj).f112021b);
        }

        public final int hashCode() {
            return this.f112021b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateSuggestionsParams(suggestionsRemoteParams=" + this.f112021b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateUdfToolbarColors;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateUdfToolbarColors implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarColors f112022b;

        public UpdateUdfToolbarColors(@Y61.k UdfToolbarColors udfToolbarColors) {
            this.f112022b = udfToolbarColors;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateUdfToolbarColors) && L.f(this.f112022b, ((UpdateUdfToolbarColors) obj).f112022b);
        }

        public final int hashCode() {
            return this.f112022b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateUdfToolbarColors(colors=" + this.f112022b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateUdfToolbarStyle;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateUdfToolbarStyle implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarStyle.SearchInputHeightType f112023b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarStyle.SearchInputRightMargin f112024c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final UdfToolbarStyle.CartIconRightMargin f112025d;

        /* renamed from: e, reason: collision with root package name */
        public final float f112026e;

        public UpdateUdfToolbarStyle(@Y61.k UdfToolbarStyle.SearchInputHeightType searchInputHeightType, @Y61.k UdfToolbarStyle.SearchInputRightMargin searchInputRightMargin, @Y61.k UdfToolbarStyle.CartIconRightMargin cartIconRightMargin, float f12) {
            this.f112023b = searchInputHeightType;
            this.f112024c = searchInputRightMargin;
            this.f112025d = cartIconRightMargin;
            this.f112026e = f12;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final UdfToolbarStyle.CartIconRightMargin getF112025d() {
            return this.f112025d;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public final UdfToolbarStyle.SearchInputHeightType getF112023b() {
            return this.f112023b;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public final UdfToolbarStyle.SearchInputRightMargin getF112024c() {
            return this.f112024c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateUdfToolbarStyle)) {
                return false;
            }
            UpdateUdfToolbarStyle updateUdfToolbarStyle = (UpdateUdfToolbarStyle) obj;
            return this.f112023b == updateUdfToolbarStyle.f112023b && this.f112024c == updateUdfToolbarStyle.f112024c && this.f112025d == updateUdfToolbarStyle.f112025d && Float.compare(this.f112026e, updateUdfToolbarStyle.f112026e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f112026e) + ((this.f112025d.hashCode() + ((this.f112024c.hashCode() + (this.f112023b.hashCode() * 31)) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateUdfToolbarStyle(searchInputHeight=");
            sb2.append(this.f112023b);
            sb2.append(", searchInputRightMargin=");
            sb2.append(this.f112024c);
            sb2.append(", cartIconRightMargin=");
            sb2.append(this.f112025d);
            sb2.append(", containersAlpha=");
            return androidx.appcompat.app.r.k(')', this.f112026e, sb2);
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateVerticalFilterItem;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateVerticalFilterItem implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final VerticalPromoBlockItem.VerticalFilterItem f112027b;

        public UpdateVerticalFilterItem(@Y61.k VerticalPromoBlockItem.VerticalFilterItem verticalFilterItem) {
            this.f112027b = verticalFilterItem;
        }

        @Y61.k
        /* renamed from: c, reason: from getter */
        public final VerticalPromoBlockItem.VerticalFilterItem getF112027b() {
            return this.f112027b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateVerticalFilterItem) && L.f(this.f112027b, ((UpdateVerticalFilterItem) obj).f112027b);
        }

        public final int hashCode() {
            return this.f112027b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateVerticalFilterItem(item=" + this.f112027b + ')';
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateVerticalSearchParams;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateVerticalSearchParams implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final SearchParams f112028b;

        public UpdateVerticalSearchParams(@Y61.l SearchParams searchParams) {
            this.f112028b = searchParams;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final SearchParams getF112028b() {
            return this.f112028b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateVerticalSearchParams) && L.f(this.f112028b, ((UpdateVerticalSearchParams) obj).f112028b);
        }

        public final int hashCode() {
            SearchParams searchParams = this.f112028b;
            if (searchParams == null) {
                return 0;
            }
            return searchParams.hashCode();
        }

        @Y61.k
        public final String toString() {
            return f.m(new StringBuilder("UpdateVerticalSearchParams(verticalSearchParams="), this.f112028b, ')');
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f112029a = new a();

        @Y61.k
        public static InterfaceC43160i[] a() {
            return new InterfaceC43160i[]{new C43210w(new TopSheetLoading()), new C43210w(new ContentLoading(null, false, 2, null)), new C43210w(ClearFeedCache.f111819b)};
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Content", "Location", "Other", "SavedSearch", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error$Content;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error$Location;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error$Other;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error$SavedSearch;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Error extends BxContentInternalAction {

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error$Content;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Content implements TrackableError, Error {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f111883b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f111884c;

            /* renamed from: d, reason: collision with root package name */
            public final int f111885d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final J.a f111886e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final String f111887f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final String f111888g;

            public Content(Throwable th2, String str, int i12, int i13, C42822w c42822w) {
                str = (i13 & 2) != 0 ? null : str;
                this.f111883b = th2;
                this.f111884c = str;
                this.f111885d = i12;
                this.f111886e = new J.a(th2);
                BxContentScreen.f90305d.getClass();
                String str2 = BxContentScreen.f90306e;
                this.f111887f = str2;
                this.f111888g = str2;
            }

            /* renamed from: c, reason: from getter */
            public final int getF111885d() {
                return this.f111885d;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @Y61.k
            /* renamed from: d, reason: from getter */
            public final String getF115373d() {
                return this.f111887f;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @Y61.k
            /* renamed from: e, reason: from getter */
            public final String getF303160d() {
                return this.f111888g;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return L.f(this.f111883b, content.f111883b) && L.f(this.f111884c, content.f111884c) && this.f111885d == content.f111885d;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @Y61.k
            /* renamed from: g, reason: from getter */
            public final J.a getF127884c() {
                return this.f111886e;
            }

            public final int hashCode() {
                int iHashCode = this.f111883b.hashCode() * 31;
                String str = this.f111884c;
                return Integer.hashCode(this.f111885d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Content(throwable=");
                sb2.append(this.f111883b);
                sb2.append(", message=");
                sb2.append(this.f111884c);
                sb2.append(", page=");
                return androidx.appcompat.app.r.t(sb2, this.f111885d, ')');
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error$Location;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Location implements TrackableError, Error {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f111889b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f111890c;

            /* renamed from: d, reason: collision with root package name */
            public final int f111891d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final J.a f111892e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final String f111893f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final String f111894g;

            public Location(Throwable th2, String str, int i12, int i13, C42822w c42822w) {
                str = (i13 & 2) != 0 ? null : str;
                this.f111889b = th2;
                this.f111890c = str;
                this.f111891d = i12;
                this.f111892e = new J.a(th2);
                BxContentScreen.f90305d.getClass();
                String str2 = BxContentScreen.f90308g;
                this.f111893f = str2;
                this.f111894g = str2;
            }

            /* renamed from: c, reason: from getter */
            public final int getF111891d() {
                return this.f111891d;
            }

            @Override // com.avito.android.analytics.screens.mvi.s
            @Y61.k
            /* renamed from: d, reason: from getter */
            public final String getF115373d() {
                return this.f111893f;
            }

            @Override // com.avito.android.analytics.screens.mvi.t
            @Y61.k
            /* renamed from: e, reason: from getter */
            public final String getF303160d() {
                return this.f111894g;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Location)) {
                    return false;
                }
                Location location = (Location) obj;
                return L.f(this.f111889b, location.f111889b) && L.f(this.f111890c, location.f111890c) && this.f111891d == location.f111891d;
            }

            @Override // com.avito.android.analytics.screens.mvi.TrackableError
            @Y61.k
            /* renamed from: g, reason: from getter */
            public final J.a getF127884c() {
                return this.f111892e;
            }

            public final int hashCode() {
                int iHashCode = this.f111889b.hashCode() * 31;
                String str = this.f111890c;
                return Integer.hashCode(this.f111891d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Location(throwable=");
                sb2.append(this.f111889b);
                sb2.append(", message=");
                sb2.append(this.f111890c);
                sb2.append(", page=");
                return androidx.appcompat.app.r.t(sb2, this.f111891d, ')');
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error$Other;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Other implements Error {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Throwable f111895b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f111896c;

            /* renamed from: d, reason: collision with root package name */
            public final int f111897d;

            public Other(int i12, @Y61.l String str, @Y61.l Throwable th2) {
                this.f111895b = th2;
                this.f111896c = str;
                this.f111897d = i12;
            }

            /* renamed from: c, reason: from getter */
            public final int getF111897d() {
                return this.f111897d;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Other)) {
                    return false;
                }
                Other other = (Other) obj;
                return L.f(this.f111895b, other.f111895b) && L.f(this.f111896c, other.f111896c) && this.f111897d == other.f111897d;
            }

            public final int hashCode() {
                Throwable th2 = this.f111895b;
                int iHashCode = (th2 == null ? 0 : th2.hashCode()) * 31;
                String str = this.f111896c;
                return Integer.hashCode(this.f111897d) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Other(throwable=");
                sb2.append(this.f111895b);
                sb2.append(", message=");
                sb2.append(this.f111896c);
                sb2.append(", page=");
                return androidx.appcompat.app.r.t(sb2, this.f111897d, ')');
            }

            public /* synthetic */ Other(Throwable th2, String str, int i12, int i13, C42822w c42822w) {
                this(i12, (i13 & 2) != 0 ? null : str, (i13 & 1) != 0 ? null : th2);
            }
        }

        /* compiled from: BxContentInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error$SavedSearch;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$Error;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SavedSearch implements Error {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Throwable f111898b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f111899c;

            /* renamed from: d, reason: collision with root package name */
            public final int f111900d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f111901e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final PresentationType f111902f;

            public SavedSearch(int i12, @Y61.k PresentationType presentationType, @Y61.l String str, @Y61.l Throwable th2, boolean z12) {
                this.f111898b = th2;
                this.f111899c = str;
                this.f111900d = i12;
                this.f111901e = z12;
                this.f111902f = presentationType;
            }

            /* renamed from: c, reason: from getter */
            public final int getF111900d() {
                return this.f111900d;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SavedSearch)) {
                    return false;
                }
                SavedSearch savedSearch = (SavedSearch) obj;
                return L.f(this.f111898b, savedSearch.f111898b) && L.f(this.f111899c, savedSearch.f111899c) && this.f111900d == savedSearch.f111900d && this.f111901e == savedSearch.f111901e && this.f111902f == savedSearch.f111902f;
            }

            public final int hashCode() {
                Throwable th2 = this.f111898b;
                int iHashCode = (th2 == null ? 0 : th2.hashCode()) * 31;
                String str = this.f111899c;
                return this.f111902f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f111900d, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31), 31, this.f111901e);
            }

            @Y61.k
            public final String toString() {
                return "SavedSearch(throwable=" + this.f111898b + ", message=" + this.f111899c + ", page=" + this.f111900d + ", isNewSerpMapInteraction=" + this.f111901e + ", presentationType=" + this.f111902f + ')';
            }

            public /* synthetic */ SavedSearch(Throwable th2, String str, int i12, boolean z12, PresentationType presentationType, int i13, C42822w c42822w) {
                this(i12, presentationType, (i13 & 2) != 0 ? null : str, (i13 & 1) != 0 ? null : th2, z12);
            }
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$SubscribeParamsChanged;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscribeParamsChanged implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f111982b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f111983c;

        public SubscribeParamsChanged(@Y61.l String str, boolean z12) {
            this.f111982b = str;
            this.f111983c = z12;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final String getF111982b() {
            return this.f111982b;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getF111983c() {
            return this.f111983c;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubscribeParamsChanged)) {
                return false;
            }
            SubscribeParamsChanged subscribeParamsChanged = (SubscribeParamsChanged) obj;
            return L.f(this.f111982b, subscribeParamsChanged.f111982b) && this.f111983c == subscribeParamsChanged.f111983c;
        }

        public final int hashCode() {
            String str = this.f111982b;
            return Boolean.hashCode(this.f111983c) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SubscribeParamsChanged(subscriptionId=");
            sb2.append(this.f111982b);
            sb2.append(", isSubscribed=");
            return androidx.appcompat.app.r.x(sb2, this.f111983c, ')');
        }

        public /* synthetic */ SubscribeParamsChanged(String str, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, z12);
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$UpdateInlineActions;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateInlineActions implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f112006b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f112007c;

        public UpdateInlineActions(boolean z12, boolean z13) {
            this.f112006b = z12;
            this.f112007c = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateInlineActions)) {
                return false;
            }
            UpdateInlineActions updateInlineActions = (UpdateInlineActions) obj;
            return this.f112006b == updateInlineActions.f112006b && this.f112007c == updateInlineActions.f112007c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f112007c) + (Boolean.hashCode(this.f112006b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInlineActions(isVisible=");
            sb2.append(this.f112006b);
            sb2.append(", shouldInvalidate=");
            return androidx.appcompat.app.r.x(sb2, this.f112007c, ')');
        }

        public /* synthetic */ UpdateInlineActions(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? false : z13);
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenInlineFilter;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenInlineFilter implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Filter f111931b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SearchParams f111932c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final PresentationType f111933d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f111934e;

        public OpenInlineFilter(@Y61.l Filter filter, @Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str) {
            this.f111931b = filter;
            this.f111932c = searchParams;
            this.f111933d = presentationType;
            this.f111934e = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenInlineFilter)) {
                return false;
            }
            OpenInlineFilter openInlineFilter = (OpenInlineFilter) obj;
            return L.f(this.f111931b, openInlineFilter.f111931b) && L.f(this.f111932c, openInlineFilter.f111932c) && this.f111933d == openInlineFilter.f111933d && L.f(this.f111934e, openInlineFilter.f111934e);
        }

        public final int hashCode() {
            Filter filter = this.f111931b;
            int iHashCode = (this.f111932c.hashCode() + ((filter == null ? 0 : filter.hashCode()) * 31)) * 31;
            PresentationType presentationType = this.f111933d;
            int iHashCode2 = (iHashCode + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
            String str = this.f111934e;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilter(filter=");
            sb2.append(this.f111931b);
            sb2.append(", searchParams=");
            sb2.append(this.f111932c);
            sb2.append(", presentationType=");
            sb2.append(this.f111933d);
            sb2.append(", context=");
            return C22026a.c(sb2, this.f111934e, ')');
        }

        public /* synthetic */ OpenInlineFilter(Filter filter, SearchParams searchParams, PresentationType presentationType, String str, int i12, C42822w c42822w) {
            this(filter, searchParams, (i12 & 4) != 0 ? null : presentationType, (i12 & 8) != 0 ? null : str);
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$OpenInlineFilterWithId;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenInlineFilterWithId implements BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f111935b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SearchParams f111936c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final PresentationType f111937d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f111938e;

        public OpenInlineFilterWithId(@Y61.l PresentationType presentationType, @Y61.k SearchParams searchParams, @Y61.k String str, @Y61.l String str2) {
            this.f111935b = str;
            this.f111936c = searchParams;
            this.f111937d = presentationType;
            this.f111938e = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenInlineFilterWithId)) {
                return false;
            }
            OpenInlineFilterWithId openInlineFilterWithId = (OpenInlineFilterWithId) obj;
            return L.f(this.f111935b, openInlineFilterWithId.f111935b) && L.f(this.f111936c, openInlineFilterWithId.f111936c) && this.f111937d == openInlineFilterWithId.f111937d && L.f(this.f111938e, openInlineFilterWithId.f111938e);
        }

        public final int hashCode() {
            int iHashCode = (this.f111936c.hashCode() + (this.f111935b.hashCode() * 31)) * 31;
            PresentationType presentationType = this.f111937d;
            int iHashCode2 = (iHashCode + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
            String str = this.f111938e;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilterWithId(filterId=");
            sb2.append(this.f111935b);
            sb2.append(", searchParams=");
            sb2.append(this.f111936c);
            sb2.append(", presentationType=");
            sb2.append(this.f111937d);
            sb2.append(", context=");
            return C22026a.c(sb2, this.f111938e, ')');
        }

        public /* synthetic */ OpenInlineFilterWithId(String str, SearchParams searchParams, PresentationType presentationType, String str2, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? null : presentationType, searchParams, str, (i12 & 8) != 0 ? null : str2);
        }
    }

    /* compiled from: BxContentInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$ContentAppendLoaded;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentAppendLoaded implements TrackableContent, BxContentInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<l1> f111824b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final FeedId f111825c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final SerpDisplayType f111826d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final PresentationType f111827e;

        /* renamed from: f, reason: collision with root package name */
        public final int f111828f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Long f111829g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f111830h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final String f111831i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final UniversalButton f111832j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public final SelectDatesAdditionalButton f111833k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final UxFeedbackConfig f111834l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.k
        public final String f111835m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final String f111836n;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentAppendLoaded(@Y61.k List<? extends l1> list, @Y61.k FeedId feedId, @Y61.l SerpDisplayType serpDisplayType, @Y61.k PresentationType presentationType, int i12, @Y61.l Long l12, @Y61.l String str, @Y61.l String str2, @Y61.l UniversalButton universalButton, @Y61.l SelectDatesAdditionalButton selectDatesAdditionalButton, @Y61.l UxFeedbackConfig uxFeedbackConfig) {
            this.f111824b = list;
            this.f111825c = feedId;
            this.f111826d = serpDisplayType;
            this.f111827e = presentationType;
            this.f111828f = i12;
            this.f111829g = l12;
            this.f111830h = str;
            this.f111831i = str2;
            this.f111832j = universalButton;
            this.f111833k = selectDatesAdditionalButton;
            this.f111834l = uxFeedbackConfig;
            BxContentScreen bxContentScreen = BxContentScreen.f90305d;
            bxContentScreen.getClass();
            String str3 = BxContentScreen.f90306e;
            this.f111835m = str3;
            bxContentScreen.getClass();
            this.f111836n = str3;
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final SerpDisplayType getF111826d() {
            return this.f111826d;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF115373d() {
            return this.f111835m;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @Y61.k
        /* renamed from: e, reason: from getter */
        public final String getF303160d() {
            return this.f111836n;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentAppendLoaded)) {
                return false;
            }
            ContentAppendLoaded contentAppendLoaded = (ContentAppendLoaded) obj;
            return L.f(this.f111824b, contentAppendLoaded.f111824b) && L.f(this.f111825c, contentAppendLoaded.f111825c) && this.f111826d == contentAppendLoaded.f111826d && this.f111827e == contentAppendLoaded.f111827e && this.f111828f == contentAppendLoaded.f111828f && L.f(this.f111829g, contentAppendLoaded.f111829g) && L.f(this.f111830h, contentAppendLoaded.f111830h) && L.f(this.f111831i, contentAppendLoaded.f111831i) && L.f(this.f111832j, contentAppendLoaded.f111832j) && L.f(this.f111833k, contentAppendLoaded.f111833k) && L.f(this.f111834l, contentAppendLoaded.f111834l);
        }

        /* renamed from: h, reason: from getter */
        public final int getF111828f() {
            return this.f111828f;
        }

        public final int hashCode() {
            int iHashCode = (this.f111825c.hashCode() + (this.f111824b.hashCode() * 31)) * 31;
            SerpDisplayType serpDisplayType = this.f111826d;
            int iE2 = androidx.appcompat.app.r.e(this.f111828f, (this.f111827e.hashCode() + ((iHashCode + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31)) * 31, 31);
            Long l12 = this.f111829g;
            int iHashCode2 = (iE2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f111830h;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f111831i;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniversalButton universalButton = this.f111832j;
            int iHashCode5 = (iHashCode4 + (universalButton == null ? 0 : universalButton.hashCode())) * 31;
            SelectDatesAdditionalButton selectDatesAdditionalButton = this.f111833k;
            int iHashCode6 = (iHashCode5 + (selectDatesAdditionalButton == null ? 0 : selectDatesAdditionalButton.hashCode())) * 31;
            UxFeedbackConfig uxFeedbackConfig = this.f111834l;
            return iHashCode6 + (uxFeedbackConfig != null ? uxFeedbackConfig.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final String getF111830h() {
            return this.f111830h;
        }

        @Y61.l
        /* renamed from: j, reason: from getter */
        public final SelectDatesAdditionalButton getF111833k() {
            return this.f111833k;
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final Long getF111829g() {
            return this.f111829g;
        }

        @Y61.l
        /* renamed from: l, reason: from getter */
        public final UniversalButton getF111832j() {
            return this.f111832j;
        }

        @Y61.l
        /* renamed from: m, reason: from getter */
        public final String getF111831i() {
            return this.f111831i;
        }

        @Y61.k
        public final String toString() {
            return "ContentAppendLoaded(items=" + this.f111824b + ", feedId=" + this.f111825c + ", displayType=" + this.f111826d + ", presentationType=" + this.f111827e + ", page=" + this.f111828f + ", timestamp=" + this.f111829g + ", pageId=" + this.f111830h + ", xHash=" + this.f111831i + ", universalButton=" + this.f111832j + ", selectDatesButton=" + this.f111833k + ", uxFeedbackConfig=" + this.f111834l + ')';
        }

        public /* synthetic */ ContentAppendLoaded(List list, FeedId feedId, SerpDisplayType serpDisplayType, PresentationType presentationType, int i12, Long l12, String str, String str2, UniversalButton universalButton, SelectDatesAdditionalButton selectDatesAdditionalButton, UxFeedbackConfig uxFeedbackConfig, int i13, C42822w c42822w) {
            this(list, feedId, serpDisplayType, presentationType, i12, (i13 & 32) != 0 ? null : l12, (i13 & 64) != 0 ? null : str, str2, (i13 & 256) != 0 ? null : universalButton, (i13 & 512) != 0 ? null : selectDatesAdditionalButton, (i13 & 1024) != 0 ? null : uxFeedbackConfig);
        }
    }
}
