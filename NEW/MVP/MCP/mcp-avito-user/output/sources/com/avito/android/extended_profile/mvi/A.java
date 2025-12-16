package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import fA.InterfaceC40270c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile/mvi/A;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "LfA/c;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A implements com.avito.android.arch.mvi.t<ExtendedProfileInternalAction, InterfaceC40270c> {
    @Inject
    public A() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40270c b(ExtendedProfileInternalAction extendedProfileInternalAction) {
        ExtendedProfileInternalAction extendedProfileInternalAction2 = extendedProfileInternalAction;
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.NotifyItemsChanged) {
            return new InterfaceC40270c.b(((ExtendedProfileInternalAction.NotifyItemsChanged) extendedProfileInternalAction2).f150169b);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenGallery) {
            ExtendedProfileInternalAction.OpenGallery openGallery = (ExtendedProfileInternalAction.OpenGallery) extendedProfileInternalAction2;
            return new InterfaceC40270c.C11132c(openGallery.f150198b, openGallery.f150199c);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenSearchFilters) {
            ExtendedProfileInternalAction.OpenSearchFilters openSearchFilters = (ExtendedProfileInternalAction.OpenSearchFilters) extendedProfileInternalAction2;
            return new InterfaceC40270c.h(openSearchFilters.f150206b, openSearchFilters.f150207c, openSearchFilters.f150208d);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnShareMenuClick) {
            ExtendedProfileInternalAction.OnShareMenuClick onShareMenuClick = (ExtendedProfileInternalAction.OnShareMenuClick) extendedProfileInternalAction2;
            return new InterfaceC40270c.i(onShareMenuClick.f150187b, onShareMenuClick.f150188c);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateShareMenuVisibility) {
            return new InterfaceC40270c.p(((ExtendedProfileInternalAction.UpdateShareMenuVisibility) extendedProfileInternalAction2).f150235b);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowCustomToastBar) {
            ExtendedProfileInternalAction.ShowCustomToastBar showCustomToastBar = (ExtendedProfileInternalAction.ShowCustomToastBar) extendedProfileInternalAction2;
            return new InterfaceC40270c.k(showCustomToastBar.f150216d, showCustomToastBar.f150215c, showCustomToastBar.f150214b);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowCommonErrorToastBar) {
            return new InterfaceC40270c.j(((ExtendedProfileInternalAction.ShowCommonErrorToastBar) extendedProfileInternalAction2).f150213b);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.CloseScreen) {
            return InterfaceC40270c.a.f395744a;
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenNotificationsSettings) {
            return InterfaceC40270c.g.f395753a;
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenInlineFilter) {
            ExtendedProfileInternalAction.OpenInlineFilter openInlineFilter = (ExtendedProfileInternalAction.OpenInlineFilter) extendedProfileInternalAction2;
            return new InterfaceC40270c.e(openInlineFilter.f150201b, openInlineFilter.f150202c);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenInlineFilterWithId) {
            ExtendedProfileInternalAction.OpenInlineFilterWithId openInlineFilterWithId = (ExtendedProfileInternalAction.OpenInlineFilterWithId) extendedProfileInternalAction2;
            return new InterfaceC40270c.f(openInlineFilterWithId.f150204c, openInlineFilterWithId.f150203b);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateFloatingContactBar) {
            return new InterfaceC40270c.o(((ExtendedProfileInternalAction.UpdateFloatingContactBar) extendedProfileInternalAction2).f150233b);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowEnableNotificationDialog) {
            return InterfaceC40270c.l.f395763a;
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowScreenByJson) {
            return new InterfaceC40270c.m(((ExtendedProfileInternalAction.ShowScreenByJson) extendedProfileInternalAction2).f150220b);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateExtendedProfileLazyColumnComponent) {
            return InterfaceC40270c.n.f395765a;
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenInProfileTab) {
            return new InterfaceC40270c.d(((ExtendedProfileInternalAction.OpenInProfileTab) extendedProfileInternalAction2).f150200b);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.DataLoaded ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.DataLoading ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.LoadingError ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnAboutV2GalleryScrollChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnAboutV2TextExpandClicked ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnGalleryScrollPositionChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnSubscribeChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnTextItemExpandClicked ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnPremiumBannerScrollChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnCarouselScrollChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.PlaceholderLoaded ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnPhoneCallCanceled ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowPhoneDialog ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnCategorizerScrollChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnAdvertsTabSelected ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnProfileAdvertsUpdates ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnTabsWithWidgetsClicked ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateActiveAdvertsSearchState ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateActiveAdvertsFiltersCount ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateClosedAdvertsSearchState ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnSearchTabSelected ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenSubscriptionSettings ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SubscriptionProgress ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SubscriptionNotificationChangeProgress ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.DismissSubscriptionSettings ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnSubscribeNotificationChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateNotificationEnabledState ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnSelectionsScrollStateAction ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UniversalWidgetCarouselContainerScrollStateAction ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateTargetSubscribe ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateVisibleItems ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SuggestLoaded ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SuggestLoadingError ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SetSuggestsVisible ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.JobCarouselScrollPositionChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateCommercialItem ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.RemoveCommercialItem ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.GotCommercialItem) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
