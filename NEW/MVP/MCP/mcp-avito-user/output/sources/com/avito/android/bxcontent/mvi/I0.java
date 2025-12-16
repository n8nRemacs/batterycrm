package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.RecsReloadingState;
import com.avito.android.bxcontent.mvi.entity.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: BxContentOneTimeEventProducer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bxcontent/mvi/I0;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/bxcontent/mvi/entity/g;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class I0 implements com.avito.android.arch.mvi.t<BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final I0 f111367b = new I0();

    @Override // com.avito.android.arch.mvi.t
    public final com.avito.android.bxcontent.mvi.entity.g b(BxContentInternalAction bxContentInternalAction) {
        com.avito.android.bxcontent.mvi.entity.g l12;
        BxContentInternalAction bxContentInternalAction2 = bxContentInternalAction;
        LinkedHashMap linkedHashMap = null;
        if (bxContentInternalAction2 instanceof BxContentInternalAction.BeduinNativeInternalAction) {
            BxContentInternalAction.BeduinNativeInternalAction beduinNativeInternalAction = (BxContentInternalAction.BeduinNativeInternalAction) bxContentInternalAction2;
            if (beduinNativeInternalAction instanceof BxContentInternalAction.BeduinNativeInternalAction.RenderBeduinContent) {
                return new g.D(((BxContentInternalAction.BeduinNativeInternalAction.RenderBeduinContent) bxContentInternalAction2).f111811b);
            }
            if (beduinNativeInternalAction instanceof BxContentInternalAction.BeduinNativeInternalAction.AddBlockIfNotExist ? true : beduinNativeInternalAction instanceof BxContentInternalAction.BeduinNativeInternalAction.UpdateBlock) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.Error) {
            BxContentInternalAction.Error error = (BxContentInternalAction.Error) bxContentInternalAction2;
            if (error instanceof BxContentInternalAction.Error.Content) {
                BxContentInternalAction.Error.Content content = (BxContentInternalAction.Error.Content) bxContentInternalAction2;
                l12 = new g.L(content.f111885d, content.f111884c, content.f111883b);
            } else if (error instanceof BxContentInternalAction.Error.Location) {
                BxContentInternalAction.Error.Location location = (BxContentInternalAction.Error.Location) bxContentInternalAction2;
                l12 = new g.L(location.f111891d, location.f111890c, location.f111889b);
            } else if (error instanceof BxContentInternalAction.Error.SavedSearch) {
                BxContentInternalAction.Error.SavedSearch savedSearch = (BxContentInternalAction.Error.SavedSearch) bxContentInternalAction2;
                l12 = new g.S(savedSearch.f111900d, savedSearch.f111902f, savedSearch.f111899c, savedSearch.f111898b, savedSearch.f111901e);
            } else {
                if (!(error instanceof BxContentInternalAction.Error.Other)) {
                    throw new NoWhenBranchMatchedException();
                }
                BxContentInternalAction.Error.Other other = (BxContentInternalAction.Error.Other) bxContentInternalAction2;
                l12 = new g.L(other.f111897d, other.f111896c, other.f111895b);
            }
            return l12;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.CloseVerticalFilter) {
            return g.C29174f.f112261a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ResetVerticalFilter) {
            return g.G.f112206a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenSearchBar) {
            BxContentInternalAction.OpenSearchBar openSearchBar = (BxContentInternalAction.OpenSearchBar) bxContentInternalAction2;
            return new g.C29189v(openSearchBar.f111940b, openSearchBar.f111941c, openSearchBar.f111942d);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.CloseSearchBar) {
            return g.C29173e.f112260a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.LeaveScreen) {
            return g.C29175h.f112263a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ExitSpace) {
            return g.C3303g.f112262a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ScrollToStart) {
            return new g.I(((BxContentInternalAction.ScrollToStart) bxContentInternalAction2).f111956b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenDealConfirmation) {
            return new g.C29184q(((BxContentInternalAction.OpenDealConfirmation) bxContentInternalAction2).f111929b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowToast) {
            BxContentInternalAction.ShowToast showToast = (BxContentInternalAction.ShowToast) bxContentInternalAction2;
            return new g.U(showToast.f111976b, showToast.f111977c);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenAvitoBlog) {
            return new g.C29181n(((BxContentInternalAction.OpenAvitoBlog) bxContentInternalAction2).f111926b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.NotificationLocationChanged) {
            BxContentInternalAction.NotificationLocationChanged notificationLocationChanged = (BxContentInternalAction.NotificationLocationChanged) bxContentInternalAction2;
            return new g.C29177j(notificationLocationChanged.f111918b, notificationLocationChanged.f111919c, notificationLocationChanged.f111920d);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.NotifyFeaturesSearchParamsChanged) {
            return g.C29179l.f112271a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenCategoriesScreen) {
            return new g.C29183p(((BxContentInternalAction.OpenCategoriesScreen) bxContentInternalAction2).f111928b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenServicesScreen) {
            return new g.C29190w(((BxContentInternalAction.OpenServicesScreen) bxContentInternalAction2).f111943b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.NotifyFeaturesAboutSubscriptionsState) {
            BxContentInternalAction.NotifyFeaturesAboutSubscriptionsState notifyFeaturesAboutSubscriptionsState = (BxContentInternalAction.NotifyFeaturesAboutSubscriptionsState) bxContentInternalAction2;
            return new g.C29178k(notifyFeaturesAboutSubscriptionsState.f111921b, notifyFeaturesAboutSubscriptionsState.f111922c, notifyFeaturesAboutSubscriptionsState.f111923d);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenMainScreenOnBackToAvoidAppLeaving) {
            return g.C29188u.f112286a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.RequestPrepareViewForOnboarding) {
            BxContentInternalAction.RequestPrepareViewForOnboarding requestPrepareViewForOnboarding = (BxContentInternalAction.RequestPrepareViewForOnboarding) bxContentInternalAction2;
            return new g.E(requestPrepareViewForOnboarding.f111952b, requestPrepareViewForOnboarding.f111953c);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenInlineFilterWithId) {
            BxContentInternalAction.OpenInlineFilterWithId openInlineFilterWithId = (BxContentInternalAction.OpenInlineFilterWithId) bxContentInternalAction2;
            return new g.C29187t(openInlineFilterWithId.f111937d, openInlineFilterWithId.f111936c, openInlineFilterWithId.f111935b, openInlineFilterWithId.f111938e);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenInlineFilter) {
            BxContentInternalAction.OpenInlineFilter openInlineFilter = (BxContentInternalAction.OpenInlineFilter) bxContentInternalAction2;
            return new g.C29186s(openInlineFilter.f111931b, openInlineFilter.f111932c, openInlineFilter.f111933d, openInlineFilter.f111934e);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.BottomSheetStateChanged) {
            BxContentInternalAction.BottomSheetStateChanged bottomSheetStateChanged = (BxContentInternalAction.BottomSheetStateChanged) bxContentInternalAction2;
            return new g.C29171c(bottomSheetStateChanged.f111813b, bottomSheetStateChanged.f111814c);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.UpdatePlaybackSnippets) {
            BxContentInternalAction.UpdatePlaybackSnippets updatePlaybackSnippets = (BxContentInternalAction.UpdatePlaybackSnippets) bxContentInternalAction2;
            ArrayList<BxContentInternalAction.UpdatePlaybackSnippets.b> arrayList = updatePlaybackSnippets.f112009b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (BxContentInternalAction.UpdatePlaybackSnippets.b bVar : arrayList) {
                arrayList2.add(new g.a0.b(bVar.f112015a, bVar.f112016b, bVar.f112017c));
            }
            HashMap map = updatePlaybackSnippets.f112010c;
            if (map != null) {
                linkedHashMap = new LinkedHashMap(kotlin.collections.P0.f(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    BxContentInternalAction.UpdatePlaybackSnippets.a aVar = (BxContentInternalAction.UpdatePlaybackSnippets.a) entry.getValue();
                    linkedHashMap.put(key, new g.a0.a(aVar.f112011a, aVar.f112012b, aVar.f112013c, aVar.f112014d));
                }
            }
            return new g.a0(arrayList2, linkedHashMap);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenBottomSheetOnboarding) {
            return new g.C29182o(((BxContentInternalAction.OpenBottomSheetOnboarding) bxContentInternalAction2).f111927b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.SkipBottomSheetOnboarding) {
            return new g.W(((BxContentInternalAction.SkipBottomSheetOnboarding) bxContentInternalAction2).f111980b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenDeeplink) {
            return new g.C29185r(((BxContentInternalAction.OpenDeeplink) bxContentInternalAction2).f111930b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowBusiness360Toast) {
            return new g.K(((BxContentInternalAction.ShowBusiness360Toast) bxContentInternalAction2).f111961b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowReplaceMainExitOnboarding) {
            return new g.R(((BxContentInternalAction.ShowReplaceMainExitOnboarding) bxContentInternalAction2).f111970b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.InlinesLoaded) {
            BxContentInternalAction.InlinesLoaded inlinesLoaded = (BxContentInternalAction.InlinesLoaded) bxContentInternalAction2;
            return new g.Y(inlinesLoaded.f111907b, inlinesLoaded.f111908c);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.UpdateInlineActions) {
            BxContentInternalAction.UpdateInlineActions updateInlineActions = (BxContentInternalAction.UpdateInlineActions) bxContentInternalAction2;
            return new g.X(updateInlineActions.f112006b, updateInlineActions.f112007c);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowOnboardings) {
            BxContentInternalAction.ShowOnboardings showOnboardings = (BxContentInternalAction.ShowOnboardings) bxContentInternalAction2;
            return new g.N(showOnboardings.f111963b, showOnboardings.f111964c, showOnboardings.f111965d);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.RestartFromLauncher) {
            return g.H.f112207a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowRemoteUxFeedbackByEvent) {
            BxContentInternalAction.ShowRemoteUxFeedbackByEvent showRemoteUxFeedbackByEvent = (BxContentInternalAction.ShowRemoteUxFeedbackByEvent) bxContentInternalAction2;
            return new g.Q(showRemoteUxFeedbackByEvent.f111968b, showRemoteUxFeedbackByEvent.f111969c);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowUxFeedbackWithConfig) {
            return new g.V(((BxContentInternalAction.ShowUxFeedbackWithConfig) bxContentInternalAction2).f111979b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.AnimateToolbar) {
            return new g.C29170b(((BxContentInternalAction.AnimateToolbar) bxContentInternalAction2).f111807b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.UpdateUdfToolbarColors) {
            return new g.d0(((BxContentInternalAction.UpdateUdfToolbarColors) bxContentInternalAction2).f112022b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.AnimatePromoHeaderToolbar) {
            BxContentInternalAction.AnimatePromoHeaderToolbar animatePromoHeaderToolbar = (BxContentInternalAction.AnimatePromoHeaderToolbar) bxContentInternalAction2;
            return new g.C29169a(animatePromoHeaderToolbar.f111805b, animatePromoHeaderToolbar.f111806c);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowPersonalFiltersChangeDialog) {
            return new g.O(((BxContentInternalAction.ShowPersonalFiltersChangeDialog) bxContentInternalAction2).f111966b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.UpdateSuggestionsParams) {
            return new g.c0(((BxContentInternalAction.UpdateSuggestionsParams) bxContentInternalAction2).f112021b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.OpenSharingDialog) {
            return new g.C29191x(((BxContentInternalAction.OpenSharingDialog) bxContentInternalAction2).f111944b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.MainStartOnboardingStepShow) {
            return new g.C29176i(((BxContentInternalAction.MainStartOnboardingStepShow) bxContentInternalAction2).f111916b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.BxOnboardingStepShow) {
            return new g.C29172d(((BxContentInternalAction.BxOnboardingStepShow) bxContentInternalAction2).f111815b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.UpdateRecsReloadState) {
            if (((BxContentInternalAction.UpdateRecsReloadState) bxContentInternalAction2).f112019b == RecsReloadingState.f112050c) {
                return g.C29193z.f112292a;
            }
            return null;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ProxyBeduinFeatureOneTimeEvent) {
            return new g.B(((BxContentInternalAction.ProxyBeduinFeatureOneTimeEvent) bxContentInternalAction2).f111945b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowProgressToast) {
            return new g.P(((BxContentInternalAction.ShowProgressToast) bxContentInternalAction2).f111967b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ContentLoading) {
            return g.F.f112205a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.UpdateScrollToTopButtonVisibility) {
            return new g.b0(((BxContentInternalAction.UpdateScrollToTopButtonVisibility) bxContentInternalAction2).f112020b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ContentLoaded) {
            return new g.Z(((BxContentInternalAction.ContentLoaded) bxContentInternalAction2).f111850N);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.PanelStateChanged) {
            ((BxContentInternalAction.PanelStateChanged) bxContentInternalAction2).getClass();
            return new g.C29192y();
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.SelectDatesButtonClicked) {
            return g.J.f112209a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.NotifyFeaturesSerpLoad) {
            return g.C29180m.f112272a;
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowLastSearchTooltip) {
            return new g.M(((BxContentInternalAction.ShowLastSearchTooltip) bxContentInternalAction2).f111962b);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ShowSerpAdvertScrollToast) {
            BxContentInternalAction.ShowSerpAdvertScrollToast showSerpAdvertScrollToast = (BxContentInternalAction.ShowSerpAdvertScrollToast) bxContentInternalAction2;
            return new g.T(showSerpAdvertScrollToast.f111971b, showSerpAdvertScrollToast.f111972c, showSerpAdvertScrollToast.f111973d, showSerpAdvertScrollToast.f111974e, showSerpAdvertScrollToast.f111975f);
        }
        if (bxContentInternalAction2 instanceof BxContentInternalAction.ApplyAdsBanner ? true : bxContentInternalAction2 instanceof BxContentInternalAction.AuthRequestedForChanged ? true : bxContentInternalAction2 instanceof BxContentInternalAction.CallInfoChanged ? true : bxContentInternalAction2 instanceof BxContentInternalAction.ChangeSearchPromoHeaderState ? true : bxContentInternalAction2 instanceof BxContentInternalAction.ChangeHeroBannerState ? true : bxContentInternalAction2.equals(BxContentInternalAction.ClearFeedCache.f111819b) ? true : bxContentInternalAction2.equals(BxContentInternalAction.CloseAddAddressSuggest.f111821b) ? true : bxContentInternalAction2.equals(BxContentInternalAction.CloseActionPromoBanner.f111820b) ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateCachedContent ? true : bxContentInternalAction2 instanceof BxContentInternalAction.ContentAppendLoaded ? true : bxContentInternalAction2 instanceof BxContentInternalAction.FloatingViewsReverseBehaviourEnable ? true : bxContentInternalAction2 instanceof BxContentInternalAction.FloatingViewsStateUpdate ? true : bxContentInternalAction2 instanceof BxContentInternalAction.HideItem ? true : bxContentInternalAction2 instanceof BxContentInternalAction.LocationLoaded ? true : bxContentInternalAction2 instanceof BxContentInternalAction.LocationLoading ? true : bxContentInternalAction2 instanceof BxContentInternalAction.MarkAdvertAsViewed ? true : bxContentInternalAction2 instanceof BxContentInternalAction.RecsReloadButtonVisibilityChanged ? true : bxContentInternalAction2 instanceof BxContentInternalAction.RemoveItem ? true : bxContentInternalAction2 instanceof BxContentInternalAction.SearchSubscriptionStateChanged ? true : bxContentInternalAction2.equals(BxContentInternalAction.Stub.f111981b) ? true : bxContentInternalAction2 instanceof BxContentInternalAction.SubscribeParamsChanged ? true : bxContentInternalAction2 instanceof BxContentInternalAction.ToggleSearchBarVisibility ? true : bxContentInternalAction2 instanceof BxContentInternalAction.TopSheetError ? true : bxContentInternalAction2 instanceof BxContentInternalAction.TopSheetLoaded ? true : bxContentInternalAction2 instanceof BxContentInternalAction.TopSheetLoading ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateChangeLocationCondition ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateCurrentFeed ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateFeaturedFeed ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateItem ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateHeaderToolbarItem ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdatePrivateState ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateVerticalFilterItem ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateVerticalSearchParams ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateCartIconState ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateFiltersPointVisibility ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateUdfToolbarStyle ? true : bxContentInternalAction2.equals(BxContentInternalAction.ShowUniversalButton.f111978b) ? true : bxContentInternalAction2 instanceof BxContentInternalAction.ActionHorizontalFilterUpdate ? true : bxContentInternalAction2 instanceof BxContentInternalAction.UpdateBottomSheetOffset) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
