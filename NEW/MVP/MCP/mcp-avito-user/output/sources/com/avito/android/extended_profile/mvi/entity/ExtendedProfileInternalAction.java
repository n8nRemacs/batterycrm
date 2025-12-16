package com.avito.android.extended_profile.mvi.entity;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile.data.b;
import com.avito.android.extended_profile.data.d;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile_adverts.n;
import com.avito.android.extended_profile_ui_components.search_input.suggest.SuggestItem;
import com.avito.android.extended_profile_widgets.adapter.about_v2.AboutV2Item;
import com.avito.android.extended_profile_widgets.adapter.carousel.CarouselItem;
import com.avito.android.extended_profile_widgets.adapter.categorizer.CategorizerItem;
import com.avito.android.extended_profile_widgets.adapter.gallery.GalleryItem;
import com.avito.android.extended_profile_widgets.adapter.info.TextItem;
import com.avito.android.extended_profile_widgets.adapter.job_company_carousel.JobCompanyCarouselItem;
import com.avito.android.extended_profile_widgets.adapter.premium_banner.PremiumBannerListItem;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTabType;
import com.avito.android.extended_profile_widgets.adapter.selections.SelectionsItem;
import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.TabsWithWidgetsItem;
import com.avito.android.extended_profile_widgets.adapter.universal.carousel.UniversalWidgetCarouselContainerItem;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ProfileCounter;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileInternalAction.kt */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:6\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01234567\u0082\u0001689:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklm¨\u0006n"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "DataLoaded", "DataLoading", "DismissSubscriptionSettings", "GotCommercialItem", "JobCarouselScrollPositionChanged", "LoadingError", "NotifyItemsChanged", "OnAboutV2GalleryScrollChanged", "OnAboutV2TextExpandClicked", "OnAdvertsTabSelected", "OnCarouselScrollChanged", "OnCategorizerScrollChanged", "OnGalleryScrollPositionChanged", "OnPhoneCallCanceled", "OnPremiumBannerScrollChanged", "OnProfileAdvertsUpdates", "OnSearchTabSelected", "OnSelectionsScrollStateAction", "OnShareMenuClick", "OnSubscribeChanged", "OnSubscribeNotificationChanged", "OnTabsWithWidgetsClicked", "OnTextItemExpandClicked", "OpenGallery", "OpenInProfileTab", "OpenInlineFilter", "OpenInlineFilterWithId", "OpenNotificationsSettings", "OpenSearchFilters", "OpenSubscriptionSettings", "PlaceholderLoaded", "RemoveCommercialItem", "SetSuggestsVisible", "ShowCommonErrorToastBar", "ShowCustomToastBar", "ShowEnableNotificationDialog", "ShowPhoneDialog", "ShowScreenByJson", "SubscriptionNotificationChangeProgress", "SubscriptionProgress", "SuggestLoaded", "SuggestLoadingError", "UniversalWidgetCarouselContainerScrollStateAction", "UpdateActiveAdvertsFiltersCount", "UpdateActiveAdvertsSearchState", "UpdateClosedAdvertsSearchState", "UpdateCommercialItem", "UpdateExtendedProfileLazyColumnComponent", "UpdateFloatingContactBar", "UpdateNotificationEnabledState", "UpdateShareMenuVisibility", "UpdateTargetSubscribe", "UpdateVisibleItems", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$DataLoaded;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$DataLoading;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$DismissSubscriptionSettings;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$GotCommercialItem;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$JobCarouselScrollPositionChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$LoadingError;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$NotifyItemsChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnAboutV2GalleryScrollChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnAboutV2TextExpandClicked;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnAdvertsTabSelected;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnCarouselScrollChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnCategorizerScrollChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnGalleryScrollPositionChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnPhoneCallCanceled;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnPremiumBannerScrollChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnProfileAdvertsUpdates;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnSearchTabSelected;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnSelectionsScrollStateAction;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnShareMenuClick;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnSubscribeChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnSubscribeNotificationChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnTabsWithWidgetsClicked;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnTextItemExpandClicked;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenGallery;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenInProfileTab;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenInlineFilter;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenInlineFilterWithId;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenNotificationsSettings;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenSearchFilters;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenSubscriptionSettings;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$PlaceholderLoaded;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$RemoveCommercialItem;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SetSuggestsVisible;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowCommonErrorToastBar;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowCustomToastBar;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowEnableNotificationDialog;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowPhoneDialog;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowScreenByJson;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SubscriptionNotificationChangeProgress;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SubscriptionProgress;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SuggestLoaded;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SuggestLoadingError;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UniversalWidgetCarouselContainerScrollStateAction;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateActiveAdvertsFiltersCount;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateActiveAdvertsSearchState;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateClosedAdvertsSearchState;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateCommercialItem;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateExtendedProfileLazyColumnComponent;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateFloatingContactBar;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateNotificationEnabledState;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateShareMenuVisibility;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateTargetSubscribe;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateVisibleItems;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ExtendedProfileInternalAction extends n {

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f150161b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$DataLoaded;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DataLoaded implements ExtendedProfileInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b f150162b;

        public DataLoaded(@k b bVar) {
            this.f150162b = bVar;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataLoaded) && L.f(this.f150162b, ((DataLoaded) obj).f150162b);
        }

        public final int hashCode() {
            return this.f150162b.hashCode();
        }

        @k
        public final String toString() {
            return "DataLoaded(data=" + this.f150162b + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$DataLoading;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DataLoading extends TrackableLoadingStarted implements ExtendedProfileInternalAction {
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$DismissSubscriptionSettings;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DismissSubscriptionSettings implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final DismissSubscriptionSettings f150163b = new DismissSubscriptionSettings();

        private DismissSubscriptionSettings() {
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$GotCommercialItem;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GotCommercialItem implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final GotCommercialItem f150164b = new GotCommercialItem();

        private GotCommercialItem() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof GotCommercialItem);
        }

        public final int hashCode() {
            return -1257886719;
        }

        @k
        public final String toString() {
            return "GotCommercialItem";
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$JobCarouselScrollPositionChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class JobCarouselScrollPositionChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCompanyCarouselItem f150165b;

        /* renamed from: c, reason: collision with root package name */
        public final int f150166c;

        public JobCarouselScrollPositionChanged(@k JobCompanyCarouselItem jobCompanyCarouselItem, int i12) {
            this.f150165b = jobCompanyCarouselItem;
            this.f150166c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JobCarouselScrollPositionChanged)) {
                return false;
            }
            JobCarouselScrollPositionChanged jobCarouselScrollPositionChanged = (JobCarouselScrollPositionChanged) obj;
            return L.f(this.f150165b, jobCarouselScrollPositionChanged.f150165b) && this.f150166c == jobCarouselScrollPositionChanged.f150166c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f150166c) + (this.f150165b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("JobCarouselScrollPositionChanged(item=");
            sb2.append(this.f150165b);
            sb2.append(", scrollPosition=");
            return r.t(sb2, this.f150166c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$LoadingError;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements ExtendedProfileInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f150167b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f150168c;

        public LoadingError(@k Throwable th2) {
            this.f150167b = th2;
            this.f150168c = new J.a(th2);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF316246d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && L.f(this.f150167b, ((LoadingError) obj).f150167b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF266239c() {
            return this.f150168c;
        }

        public final int hashCode() {
            return this.f150167b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("LoadingError(error="), this.f150167b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$NotifyItemsChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotifyItemsChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f150169b;

        public NotifyItemsChanged(@k ArrayList arrayList) {
            this.f150169b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotifyItemsChanged) && this.f150169b.equals(((NotifyItemsChanged) obj).f150169b);
        }

        public final int hashCode() {
            return this.f150169b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("NotifyItemsChanged(itemIds="), this.f150169b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnAboutV2GalleryScrollChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnAboutV2GalleryScrollChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AboutV2Item f150170b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Parcelable f150171c;

        public OnAboutV2GalleryScrollChanged(@k AboutV2Item aboutV2Item, @k Parcelable parcelable) {
            this.f150170b = aboutV2Item;
            this.f150171c = parcelable;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAboutV2GalleryScrollChanged)) {
                return false;
            }
            OnAboutV2GalleryScrollChanged onAboutV2GalleryScrollChanged = (OnAboutV2GalleryScrollChanged) obj;
            return L.f(this.f150170b, onAboutV2GalleryScrollChanged.f150170b) && L.f(this.f150171c, onAboutV2GalleryScrollChanged.f150171c);
        }

        public final int hashCode() {
            return this.f150171c.hashCode() + (this.f150170b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnAboutV2GalleryScrollChanged(item=");
            sb2.append(this.f150170b);
            sb2.append(", scrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f150171c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnAboutV2TextExpandClicked;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnAboutV2TextExpandClicked implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AboutV2Item f150172b;

        public OnAboutV2TextExpandClicked(@k AboutV2Item aboutV2Item) {
            this.f150172b = aboutV2Item;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAboutV2TextExpandClicked) && L.f(this.f150172b, ((OnAboutV2TextExpandClicked) obj).f150172b);
        }

        public final int hashCode() {
            return this.f150172b.hashCode();
        }

        @k
        public final String toString() {
            return "OnAboutV2TextExpandClicked(item=" + this.f150172b + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnAdvertsTabSelected;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnAdvertsTabSelected implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f150173b;

        public OnAdvertsTabSelected(int i12) {
            this.f150173b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAdvertsTabSelected) && this.f150173b == ((OnAdvertsTabSelected) obj).f150173b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f150173b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("OnAdvertsTabSelected(position="), this.f150173b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnCarouselScrollChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCarouselScrollChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CarouselItem f150174b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final LinearLayoutManager.SavedState f150175c;

        public OnCarouselScrollChanged(@k CarouselItem carouselItem, @l LinearLayoutManager.SavedState savedState) {
            this.f150174b = carouselItem;
            this.f150175c = savedState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCarouselScrollChanged)) {
                return false;
            }
            OnCarouselScrollChanged onCarouselScrollChanged = (OnCarouselScrollChanged) obj;
            return L.f(this.f150174b, onCarouselScrollChanged.f150174b) && this.f150175c.equals(onCarouselScrollChanged.f150175c);
        }

        public final int hashCode() {
            return this.f150175c.hashCode() + (this.f150174b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OnCarouselScrollChanged(item=" + this.f150174b + ", scrollState=" + this.f150175c + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnCategorizerScrollChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnCategorizerScrollChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CategorizerItem f150176b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Parcelable f150177c;

        public OnCategorizerScrollChanged(@k CategorizerItem categorizerItem, @l Parcelable parcelable) {
            this.f150176b = categorizerItem;
            this.f150177c = parcelable;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCategorizerScrollChanged)) {
                return false;
            }
            OnCategorizerScrollChanged onCategorizerScrollChanged = (OnCategorizerScrollChanged) obj;
            return L.f(this.f150176b, onCategorizerScrollChanged.f150176b) && L.f(this.f150177c, onCategorizerScrollChanged.f150177c);
        }

        public final int hashCode() {
            int iHashCode = this.f150176b.hashCode() * 31;
            Parcelable parcelable = this.f150177c;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnCategorizerScrollChanged(item=");
            sb2.append(this.f150176b);
            sb2.append(", scrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f150177c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnGalleryScrollPositionChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnGalleryScrollPositionChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final GalleryItem f150178b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Parcelable f150179c;

        public OnGalleryScrollPositionChanged(@k GalleryItem galleryItem, @k Parcelable parcelable) {
            this.f150178b = galleryItem;
            this.f150179c = parcelable;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGalleryScrollPositionChanged)) {
                return false;
            }
            OnGalleryScrollPositionChanged onGalleryScrollPositionChanged = (OnGalleryScrollPositionChanged) obj;
            return L.f(this.f150178b, onGalleryScrollPositionChanged.f150178b) && L.f(this.f150179c, onGalleryScrollPositionChanged.f150179c);
        }

        public final int hashCode() {
            return this.f150179c.hashCode() + (this.f150178b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnGalleryScrollPositionChanged(item=");
            sb2.append(this.f150178b);
            sb2.append(", scrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f150179c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnPhoneCallCanceled;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OnPhoneCallCanceled implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnPhoneCallCanceled f150180b = new OnPhoneCallCanceled();

        private OnPhoneCallCanceled() {
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnPremiumBannerScrollChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPremiumBannerScrollChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PremiumBannerListItem f150181b;

        /* renamed from: c, reason: collision with root package name */
        public final int f150182c;

        public OnPremiumBannerScrollChanged(@k PremiumBannerListItem premiumBannerListItem, int i12) {
            this.f150181b = premiumBannerListItem;
            this.f150182c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPremiumBannerScrollChanged)) {
                return false;
            }
            OnPremiumBannerScrollChanged onPremiumBannerScrollChanged = (OnPremiumBannerScrollChanged) obj;
            return L.f(this.f150181b, onPremiumBannerScrollChanged.f150181b) && this.f150182c == onPremiumBannerScrollChanged.f150182c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f150182c) + (this.f150181b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnPremiumBannerScrollChanged(item=");
            sb2.append(this.f150181b);
            sb2.append(", lastVisiblePosition=");
            return r.t(sb2, this.f150182c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnProfileAdvertsUpdates;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnProfileAdvertsUpdates implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final n.a f150183b;

        public OnProfileAdvertsUpdates(@k n.a aVar) {
            this.f150183b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProfileAdvertsUpdates) && L.f(this.f150183b, ((OnProfileAdvertsUpdates) obj).f150183b);
        }

        public final int hashCode() {
            return this.f150183b.hashCode();
        }

        @k
        public final String toString() {
            return "OnProfileAdvertsUpdates(updates=" + this.f150183b + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnSearchTabSelected;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSearchTabSelected implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ExtendedProfileSearchTabType f150184b;

        public OnSearchTabSelected(@k ExtendedProfileSearchTabType extendedProfileSearchTabType) {
            this.f150184b = extendedProfileSearchTabType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSearchTabSelected) && this.f150184b == ((OnSearchTabSelected) obj).f150184b;
        }

        public final int hashCode() {
            return this.f150184b.hashCode();
        }

        @k
        public final String toString() {
            return "OnSearchTabSelected(selectedTabType=" + this.f150184b + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnSelectionsScrollStateAction;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSelectionsScrollStateAction implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SelectionsItem f150185b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Parcelable f150186c;

        public OnSelectionsScrollStateAction(@k SelectionsItem selectionsItem, @l Parcelable parcelable) {
            this.f150185b = selectionsItem;
            this.f150186c = parcelable;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSelectionsScrollStateAction)) {
                return false;
            }
            OnSelectionsScrollStateAction onSelectionsScrollStateAction = (OnSelectionsScrollStateAction) obj;
            return L.f(this.f150185b, onSelectionsScrollStateAction.f150185b) && L.f(this.f150186c, onSelectionsScrollStateAction.f150186c);
        }

        public final int hashCode() {
            int iHashCode = this.f150185b.hashCode() * 31;
            Parcelable parcelable = this.f150186c;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSelectionsScrollStateAction(item=");
            sb2.append(this.f150185b);
            sb2.append(", scrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f150186c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnShareMenuClick;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnShareMenuClick implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f150187b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f150188c;

        public OnShareMenuClick(@k String str, @k String str2) {
            this.f150187b = str;
            this.f150188c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnShareMenuClick)) {
                return false;
            }
            OnShareMenuClick onShareMenuClick = (OnShareMenuClick) obj;
            return L.f(this.f150187b, onShareMenuClick.f150187b) && L.f(this.f150188c, onShareMenuClick.f150188c);
        }

        public final int hashCode() {
            return this.f150188c.hashCode() + (this.f150187b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnShareMenuClick(title=");
            sb2.append(this.f150187b);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f150188c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnSubscribeChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSubscribeChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150189b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f150190c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ProfileCounter f150191d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ProfileCounter f150192e;

        public OnSubscribeChanged(boolean z12, @l Boolean bool, @l ProfileCounter profileCounter, @l ProfileCounter profileCounter2) {
            this.f150189b = z12;
            this.f150190c = bool;
            this.f150191d = profileCounter;
            this.f150192e = profileCounter2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSubscribeChanged)) {
                return false;
            }
            OnSubscribeChanged onSubscribeChanged = (OnSubscribeChanged) obj;
            return this.f150189b == onSubscribeChanged.f150189b && L.f(this.f150190c, onSubscribeChanged.f150190c) && L.f(this.f150191d, onSubscribeChanged.f150191d) && L.f(this.f150192e, onSubscribeChanged.f150192e);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f150189b) * 31;
            Boolean bool = this.f150190c;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            ProfileCounter profileCounter = this.f150191d;
            int iHashCode3 = (iHashCode2 + (profileCounter == null ? 0 : profileCounter.hashCode())) * 31;
            ProfileCounter profileCounter2 = this.f150192e;
            return iHashCode3 + (profileCounter2 != null ? profileCounter2.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OnSubscribeChanged(isSubscribed=" + this.f150189b + ", isNotificationsActivated=" + this.f150190c + ", subscribers=" + this.f150191d + ", subscriptions=" + this.f150192e + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnSubscribeNotificationChanged;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSubscribeNotificationChanged implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150193b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f150194c;

        public OnSubscribeNotificationChanged(boolean z12, @l Boolean bool) {
            this.f150193b = z12;
            this.f150194c = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSubscribeNotificationChanged)) {
                return false;
            }
            OnSubscribeNotificationChanged onSubscribeNotificationChanged = (OnSubscribeNotificationChanged) obj;
            return this.f150193b == onSubscribeNotificationChanged.f150193b && L.f(this.f150194c, onSubscribeNotificationChanged.f150194c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f150193b) * 31;
            Boolean bool = this.f150194c;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnSubscribeNotificationChanged(isSubscribed=");
            sb2.append(this.f150193b);
            sb2.append(", isNotificationsActivated=");
            return C0.g(sb2, this.f150194c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnTabsWithWidgetsClicked;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTabsWithWidgetsClicked implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TabsWithWidgetsItem f150195b;

        /* renamed from: c, reason: collision with root package name */
        public final int f150196c;

        public OnTabsWithWidgetsClicked(@k TabsWithWidgetsItem tabsWithWidgetsItem, int i12) {
            this.f150195b = tabsWithWidgetsItem;
            this.f150196c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTabsWithWidgetsClicked)) {
                return false;
            }
            OnTabsWithWidgetsClicked onTabsWithWidgetsClicked = (OnTabsWithWidgetsClicked) obj;
            return L.f(this.f150195b, onTabsWithWidgetsClicked.f150195b) && this.f150196c == onTabsWithWidgetsClicked.f150196c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f150196c) + (this.f150195b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnTabsWithWidgetsClicked(item=");
            sb2.append(this.f150195b);
            sb2.append(", selectedIndex=");
            return r.t(sb2, this.f150196c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OnTextItemExpandClicked;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnTextItemExpandClicked implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TextItem f150197b;

        public OnTextItemExpandClicked(@k TextItem textItem) {
            this.f150197b = textItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTextItemExpandClicked) && L.f(this.f150197b, ((OnTextItemExpandClicked) obj).f150197b);
        }

        public final int hashCode() {
            return this.f150197b.hashCode();
        }

        @k
        public final String toString() {
            return "OnTextItemExpandClicked(item=" + this.f150197b + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenGallery;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenGallery implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Image> f150198b;

        /* renamed from: c, reason: collision with root package name */
        public final int f150199c;

        public OpenGallery(@k List<Image> list, int i12) {
            this.f150198b = list;
            this.f150199c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenGallery)) {
                return false;
            }
            OpenGallery openGallery = (OpenGallery) obj;
            return L.f(this.f150198b, openGallery.f150198b) && this.f150199c == openGallery.f150199c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f150199c) + (this.f150198b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenGallery(images=");
            sb2.append(this.f150198b);
            sb2.append(", position=");
            return r.t(sb2, this.f150199c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenInProfileTab;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenInProfileTab implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f150200b;

        public OpenInProfileTab(@k DeepLink deepLink) {
            this.f150200b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenInProfileTab) && L.f(this.f150200b, ((OpenInProfileTab) obj).f150200b);
        }

        public final int hashCode() {
            return this.f150200b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenInProfileTab(deepLink="), this.f150200b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenInlineFilter;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenInlineFilter implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InlineFilterNavigationItem f150201b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SearchParams f150202c;

        public OpenInlineFilter(@k InlineFilterNavigationItem inlineFilterNavigationItem, @k SearchParams searchParams) {
            this.f150201b = inlineFilterNavigationItem;
            this.f150202c = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenInlineFilter)) {
                return false;
            }
            OpenInlineFilter openInlineFilter = (OpenInlineFilter) obj;
            return L.f(this.f150201b, openInlineFilter.f150201b) && L.f(this.f150202c, openInlineFilter.f150202c);
        }

        public final int hashCode() {
            return this.f150202c.hashCode() + (this.f150201b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilter(item=");
            sb2.append(this.f150201b);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f150202c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenInlineFilterWithId;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenInlineFilterWithId implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f150203b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SearchParams f150204c;

        public OpenInlineFilterWithId(@k SearchParams searchParams, @k String str) {
            this.f150203b = str;
            this.f150204c = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenInlineFilterWithId)) {
                return false;
            }
            OpenInlineFilterWithId openInlineFilterWithId = (OpenInlineFilterWithId) obj;
            return L.f(this.f150203b, openInlineFilterWithId.f150203b) && L.f(this.f150204c, openInlineFilterWithId.f150204c);
        }

        public final int hashCode() {
            return this.f150204c.hashCode() + (this.f150203b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenInlineFilterWithId(filterId=");
            sb2.append(this.f150203b);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f150204c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenNotificationsSettings;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenNotificationsSettings implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenNotificationsSettings f150205b = new OpenNotificationsSettings();

        private OpenNotificationsSettings() {
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenSearchFilters;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSearchFilters implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f150206b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f150207c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final FilterAnalyticsData f150208d;

        public OpenSearchFilters(@k SearchParams searchParams, @l String str, @k FilterAnalyticsData filterAnalyticsData) {
            this.f150206b = searchParams;
            this.f150207c = str;
            this.f150208d = filterAnalyticsData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSearchFilters)) {
                return false;
            }
            OpenSearchFilters openSearchFilters = (OpenSearchFilters) obj;
            return L.f(this.f150206b, openSearchFilters.f150206b) && L.f(this.f150207c, openSearchFilters.f150207c) && L.f(this.f150208d, openSearchFilters.f150208d);
        }

        public final int hashCode() {
            int iHashCode = this.f150206b.hashCode() * 31;
            String str = this.f150207c;
            return this.f150208d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "OpenSearchFilters(searchParams=" + this.f150206b + ", infoModelForm=" + this.f150207c + ", analyticsParams=" + this.f150208d + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$OpenSubscriptionSettings;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OpenSubscriptionSettings implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenSubscriptionSettings f150209b = new OpenSubscriptionSettings();

        private OpenSubscriptionSettings() {
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$PlaceholderLoaded;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PlaceholderLoaded implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final d f150210b;

        public PlaceholderLoaded(@k d dVar) {
            this.f150210b = dVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlaceholderLoaded) && L.f(this.f150210b, ((PlaceholderLoaded) obj).f150210b);
        }

        public final int hashCode() {
            return this.f150210b.hashCode();
        }

        @k
        public final String toString() {
            return "PlaceholderLoaded(placeholder=" + this.f150210b + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$RemoveCommercialItem;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RemoveCommercialItem implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f150211b;

        public RemoveCommercialItem(@k String str) {
            this.f150211b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveCommercialItem) && L.f(this.f150211b, ((RemoveCommercialItem) obj).f150211b);
        }

        public final int hashCode() {
            return this.f150211b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RemoveCommercialItem(stringId="), this.f150211b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SetSuggestsVisible;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetSuggestsVisible implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150212b;

        public SetSuggestsVisible(boolean z12) {
            this.f150212b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetSuggestsVisible) && this.f150212b == ((SetSuggestsVisible) obj).f150212b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f150212b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SetSuggestsVisible(isVisible="), this.f150212b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowCommonErrorToastBar;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowCommonErrorToastBar implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f150213b;

        public ShowCommonErrorToastBar(@k Throwable th2) {
            this.f150213b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ShowCommonErrorToastBar) {
                return L.f(this.f150213b, ((ShowCommonErrorToastBar) obj).f150213b) && L.f(null, null);
            }
            return false;
        }

        public final int hashCode() {
            return this.f150213b.hashCode() * 31;
        }

        @k
        public final String toString() {
            return "ShowCommonErrorToastBar(throwable=" + this.f150213b + ", buttonAction=null)";
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowEnableNotificationDialog;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ShowEnableNotificationDialog implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowEnableNotificationDialog f150217b = new ShowEnableNotificationDialog();

        private ShowEnableNotificationDialog() {
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowPhoneDialog;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPhoneDialog implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.extended_profile_phone_dialog.f f150218b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f150219c;

        public ShowPhoneDialog(@k com.avito.android.extended_profile_phone_dialog.f fVar, @l String str) {
            this.f150218b = fVar;
            this.f150219c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPhoneDialog)) {
                return false;
            }
            ShowPhoneDialog showPhoneDialog = (ShowPhoneDialog) obj;
            return L.f(this.f150218b, showPhoneDialog.f150218b) && L.f(this.f150219c, showPhoneDialog.f150219c);
        }

        public final int hashCode() {
            int iHashCode = this.f150218b.hashCode() * 31;
            String str = this.f150219c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPhoneDialog(phoneInfo=");
            sb2.append(this.f150218b);
            sb2.append(", currentUserId=");
            return C22026a.c(sb2, this.f150219c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowScreenByJson;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowScreenByJson implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f150220b;

        public ShowScreenByJson(@k String str) {
            this.f150220b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowScreenByJson) && L.f(this.f150220b, ((ShowScreenByJson) obj).f150220b);
        }

        public final int hashCode() {
            return this.f150220b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowScreenByJson(beduinJson="), this.f150220b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SubscriptionNotificationChangeProgress;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscriptionNotificationChangeProgress implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150221b;

        public SubscriptionNotificationChangeProgress(boolean z12) {
            this.f150221b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubscriptionNotificationChangeProgress) && this.f150221b == ((SubscriptionNotificationChangeProgress) obj).f150221b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f150221b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SubscriptionNotificationChangeProgress(isInProgress="), this.f150221b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SubscriptionProgress;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubscriptionProgress implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150222b;

        public SubscriptionProgress(boolean z12) {
            this.f150222b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubscriptionProgress) && this.f150222b == ((SubscriptionProgress) obj).f150222b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f150222b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SubscriptionProgress(isInProgress="), this.f150222b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SuggestLoaded;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestLoaded implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f150223b;

        public SuggestLoaded(@k List<SuggestItem> list) {
            this.f150223b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestLoaded) && L.f(this.f150223b, ((SuggestLoaded) obj).f150223b);
        }

        public final int hashCode() {
            return this.f150223b.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("SuggestLoaded(suggests="), this.f150223b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$SuggestLoadingError;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestLoadingError implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f150224b;

        public SuggestLoadingError(@k Throwable th2) {
            this.f150224b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestLoadingError) && L.f(this.f150224b, ((SuggestLoadingError) obj).f150224b);
        }

        public final int hashCode() {
            return this.f150224b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SuggestLoadingError(throwable="), this.f150224b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UniversalWidgetCarouselContainerScrollStateAction;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetCarouselContainerScrollStateAction implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalWidgetCarouselContainerItem f150225b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Parcelable f150226c;

        public UniversalWidgetCarouselContainerScrollStateAction(@k UniversalWidgetCarouselContainerItem universalWidgetCarouselContainerItem, @l Parcelable parcelable) {
            this.f150225b = universalWidgetCarouselContainerItem;
            this.f150226c = parcelable;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalWidgetCarouselContainerScrollStateAction)) {
                return false;
            }
            UniversalWidgetCarouselContainerScrollStateAction universalWidgetCarouselContainerScrollStateAction = (UniversalWidgetCarouselContainerScrollStateAction) obj;
            return L.f(this.f150225b, universalWidgetCarouselContainerScrollStateAction.f150225b) && L.f(this.f150226c, universalWidgetCarouselContainerScrollStateAction.f150226c);
        }

        public final int hashCode() {
            int iHashCode = this.f150225b.hashCode() * 31;
            Parcelable parcelable = this.f150226c;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetCarouselContainerScrollStateAction(item=");
            sb2.append(this.f150225b);
            sb2.append(", scrollState=");
            return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f150226c, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateActiveAdvertsFiltersCount;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateActiveAdvertsFiltersCount implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f150227b;

        public UpdateActiveAdvertsFiltersCount(int i12) {
            this.f150227b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateActiveAdvertsFiltersCount) && this.f150227b == ((UpdateActiveAdvertsFiltersCount) obj).f150227b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f150227b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("UpdateActiveAdvertsFiltersCount(count="), this.f150227b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateClosedAdvertsSearchState;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateClosedAdvertsSearchState implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.b f150230b;

        public UpdateClosedAdvertsSearchState(@k a.b bVar) {
            this.f150230b = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateClosedAdvertsSearchState) && L.f(this.f150230b, ((UpdateClosedAdvertsSearchState) obj).f150230b);
        }

        public final int hashCode() {
            return this.f150230b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateClosedAdvertsSearchState(state=" + this.f150230b + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateCommercialItem;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateCommercialItem implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CommercialItem f150231b;

        public UpdateCommercialItem(@k CommercialItem commercialItem) {
            this.f150231b = commercialItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateCommercialItem) && L.f(this.f150231b, ((UpdateCommercialItem) obj).f150231b);
        }

        public final int hashCode() {
            return this.f150231b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateCommercialItem(loadedBanner=" + this.f150231b + ')';
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateExtendedProfileLazyColumnComponent;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateExtendedProfileLazyColumnComponent implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateExtendedProfileLazyColumnComponent f150232b = new UpdateExtendedProfileLazyColumnComponent();

        private UpdateExtendedProfileLazyColumnComponent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateExtendedProfileLazyColumnComponent);
        }

        public final int hashCode() {
            return -1637019468;
        }

        @k
        public final String toString() {
            return "UpdateExtendedProfileLazyColumnComponent";
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateFloatingContactBar;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateFloatingContactBar implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<QH.a> f150233b;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateFloatingContactBar(@k List<? extends QH.a> list) {
            this.f150233b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateFloatingContactBar) && L.f(this.f150233b, ((UpdateFloatingContactBar) obj).f150233b);
        }

        public final int hashCode() {
            return this.f150233b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("UpdateFloatingContactBar(items="), this.f150233b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateNotificationEnabledState;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateNotificationEnabledState implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateNotificationEnabledState f150234b = new UpdateNotificationEnabledState();

        private UpdateNotificationEnabledState() {
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateShareMenuVisibility;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateShareMenuVisibility implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150235b;

        public UpdateShareMenuVisibility(boolean z12) {
            this.f150235b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateShareMenuVisibility) && this.f150235b == ((UpdateShareMenuVisibility) obj).f150235b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f150235b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateShareMenuVisibility(isVisible="), this.f150235b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateTargetSubscribe;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateTargetSubscribe implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Boolean f150236b;

        public UpdateTargetSubscribe(@l Boolean bool) {
            this.f150236b = bool;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateTargetSubscribe) && L.f(this.f150236b, ((UpdateTargetSubscribe) obj).f150236b);
        }

        public final int hashCode() {
            Boolean bool = this.f150236b;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @k
        public final String toString() {
            return C0.g(new StringBuilder("UpdateTargetSubscribe(targetSubscribe="), this.f150236b, ')');
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateVisibleItems;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateVisibleItems implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateVisibleItems f150237b = new UpdateVisibleItems();

        private UpdateVisibleItems() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof UpdateVisibleItems);
        }

        public final int hashCode() {
            return -746307073;
        }

        @k
        public final String toString() {
            return "UpdateVisibleItems";
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$UpdateActiveAdvertsSearchState;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateActiveAdvertsSearchState implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a.C4397a f150228b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f150229c;

        public UpdateActiveAdvertsSearchState(@k a.C4397a c4397a, @l Integer num) {
            this.f150228b = c4397a;
            this.f150229c = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateActiveAdvertsSearchState)) {
                return false;
            }
            UpdateActiveAdvertsSearchState updateActiveAdvertsSearchState = (UpdateActiveAdvertsSearchState) obj;
            return L.f(this.f150228b, updateActiveAdvertsSearchState.f150228b) && L.f(this.f150229c, updateActiveAdvertsSearchState.f150229c);
        }

        public final int hashCode() {
            int iHashCode = this.f150228b.hashCode() * 31;
            Integer num = this.f150229c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateActiveAdvertsSearchState(state=");
            sb2.append(this.f150228b);
            sb2.append(", activeTabCount=");
            return s.j(sb2, this.f150229c, ')');
        }

        public /* synthetic */ UpdateActiveAdvertsSearchState(a.C4397a c4397a, Integer num, int i12, C42822w c42822w) {
            this(c4397a, (i12 & 2) != 0 ? null : num);
        }
    }

    /* compiled from: ExtendedProfileInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowCustomToastBar;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowCustomToastBar implements ExtendedProfileInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f150214b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ToastBarPosition f150215c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final com.avito.android.component.toast.f f150216d;

        public ShowCustomToastBar(@k com.avito.android.component.toast.f fVar, @k ToastBarPosition toastBarPosition, @k PrintableText printableText) {
            this.f150214b = printableText;
            this.f150215c = toastBarPosition;
            this.f150216d = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowCustomToastBar)) {
                return false;
            }
            ShowCustomToastBar showCustomToastBar = (ShowCustomToastBar) obj;
            return L.f(this.f150214b, showCustomToastBar.f150214b) && this.f150215c == showCustomToastBar.f150215c && L.f(this.f150216d, showCustomToastBar.f150216d);
        }

        public final int hashCode() {
            return this.f150216d.hashCode() + ((this.f150215c.hashCode() + (this.f150214b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "ShowCustomToastBar(message=" + this.f150214b + ", position=" + this.f150215c + ", type=" + this.f150216d + ')';
        }

        public /* synthetic */ ShowCustomToastBar(PrintableText printableText, ToastBarPosition toastBarPosition, com.avito.android.component.toast.f fVar, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? f.a.f125253a : fVar, (i12 & 2) != 0 ? ToastBarPosition.f181046d : toastBarPosition, printableText);
        }
    }
}
