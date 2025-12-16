package com.avito.android.extended_profile_serp.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_serp.C30558v;
import com.avito.android.extended_profile_serp.adapter.search_correction.SearchCorrectionItem;
import com.avito.android.extended_profile_ui_components.search_input.suggest.SuggestItem;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.serp.adapter.AdvertItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSerpInternalAction.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AdvertsLoaded", "AdvertsLoading", "AdvertsLoadingError", "ApplySuggest", "CloseScreen", "InlineFiltersLoaded", "InlineFiltersLoading", "OnPhoneCallCanceled", "OpenFiltersScreen", "OpenShare", "PageParamsLoaded", "PageParamsLoading", "ShowPhoneDialog", "SuggestLoaded", "SuggestLoadingError", "UpdateItems", "UpdateSearchInputText", "UserNotExistError", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$AdvertsLoaded;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$AdvertsLoading;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$AdvertsLoadingError;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$ApplySuggest;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$InlineFiltersLoaded;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$InlineFiltersLoading;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$OnPhoneCallCanceled;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$OpenFiltersScreen;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$OpenShare;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$PageParamsLoaded;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$PageParamsLoading;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$ShowPhoneDialog;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$SuggestLoaded;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$SuggestLoadingError;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$UpdateItems;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$UpdateSearchInputText;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$UserNotExistError;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ExtendedProfileSerpInternalAction extends n {

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$AdvertsLoading;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoading implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f152928b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SearchParams f152929c;

        public AdvertsLoading(boolean z12, @k SearchParams searchParams) {
            this.f152928b = z12;
            this.f152929c = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsLoading)) {
                return false;
            }
            AdvertsLoading advertsLoading = (AdvertsLoading) obj;
            return this.f152928b == advertsLoading.f152928b && L.f(this.f152929c, advertsLoading.f152929c);
        }

        public final int hashCode() {
            return this.f152929c.hashCode() + (Boolean.hashCode(this.f152928b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsLoading(isFirstPage=");
            sb2.append(this.f152928b);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f152929c, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$AdvertsLoadingError;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoadingError implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f152930b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f152931c;

        public AdvertsLoadingError(@k Throwable th2, boolean z12) {
            this.f152930b = th2;
            this.f152931c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsLoadingError)) {
                return false;
            }
            AdvertsLoadingError advertsLoadingError = (AdvertsLoadingError) obj;
            return L.f(this.f152930b, advertsLoadingError.f152930b) && this.f152931c == advertsLoadingError.f152931c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f152931c) + (this.f152930b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsLoadingError(throwable=");
            sb2.append(this.f152930b);
            sb2.append(", isFirstPage=");
            return r.x(sb2, this.f152931c, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$ApplySuggest;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplySuggest implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f152932b;

        public ApplySuggest(@k String str) {
            this.f152932b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplySuggest) && L.f(this.f152932b, ((ApplySuggest) obj).f152932b);
        }

        public final int hashCode() {
            return this.f152932b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApplySuggest(text="), this.f152932b, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$CloseScreen;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f152933b;

        public CloseScreen(@l DeepLink deepLink) {
            this.f152933b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CloseScreen) && L.f(this.f152933b, ((CloseScreen) obj).f152933b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f152933b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("CloseScreen(backLink="), this.f152933b, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$InlineFiltersLoaded;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "<init>", "()V", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFiltersLoaded implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InlineFiltersLoaded f152934b = new InlineFiltersLoaded();

        private InlineFiltersLoaded() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InlineFiltersLoaded);
        }

        public final int hashCode() {
            return -53690340;
        }

        @k
        public final String toString() {
            return "InlineFiltersLoaded";
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$InlineFiltersLoading;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "<init>", "()V", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InlineFiltersLoading implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final InlineFiltersLoading f152935b = new InlineFiltersLoading();

        private InlineFiltersLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof InlineFiltersLoading);
        }

        public final int hashCode() {
            return -1664396283;
        }

        @k
        public final String toString() {
            return "InlineFiltersLoading";
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$OnPhoneCallCanceled;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "<init>", "()V", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnPhoneCallCanceled implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OnPhoneCallCanceled f152936b = new OnPhoneCallCanceled();

        private OnPhoneCallCanceled() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OnPhoneCallCanceled);
        }

        public final int hashCode() {
            return -1755207717;
        }

        @k
        public final String toString() {
            return "OnPhoneCallCanceled";
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$OpenFiltersScreen;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFiltersScreen implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SearchParams f152937b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f152938c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final FilterAnalyticsData f152939d;

        public OpenFiltersScreen(@k SearchParams searchParams, @l String str, @k FilterAnalyticsData filterAnalyticsData) {
            this.f152937b = searchParams;
            this.f152938c = str;
            this.f152939d = filterAnalyticsData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenFiltersScreen)) {
                return false;
            }
            OpenFiltersScreen openFiltersScreen = (OpenFiltersScreen) obj;
            return L.f(this.f152937b, openFiltersScreen.f152937b) && L.f(this.f152938c, openFiltersScreen.f152938c) && L.f(this.f152939d, openFiltersScreen.f152939d);
        }

        public final int hashCode() {
            int iHashCode = this.f152937b.hashCode() * 31;
            String str = this.f152938c;
            return this.f152939d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            return "OpenFiltersScreen(searchParams=" + this.f152937b + ", infoModelForm=" + this.f152938c + ", analyticsParams=" + this.f152939d + ')';
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$OpenShare;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenShare implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f152940b;

        public OpenShare(@k String str) {
            this.f152940b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenShare) && L.f(this.f152940b, ((OpenShare) obj).f152940b);
        }

        public final int hashCode() {
            return this.f152940b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenShare(shareLink="), this.f152940b, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$PageParamsLoaded;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PageParamsLoaded implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C30558v f152941b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SearchParams f152942c;

        public PageParamsLoaded(@k C30558v c30558v, @k SearchParams searchParams) {
            this.f152941b = c30558v;
            this.f152942c = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageParamsLoaded)) {
                return false;
            }
            PageParamsLoaded pageParamsLoaded = (PageParamsLoaded) obj;
            return L.f(this.f152941b, pageParamsLoaded.f152941b) && L.f(this.f152942c, pageParamsLoaded.f152942c);
        }

        public final int hashCode() {
            return this.f152942c.hashCode() + (this.f152941b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PageParamsLoaded(pageParams=");
            sb2.append(this.f152941b);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f152942c, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$PageParamsLoading;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "()V", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PageParamsLoading implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final PageParamsLoading f152943b = new PageParamsLoading();

        private PageParamsLoading() {
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$ShowPhoneDialog;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowPhoneDialog implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.extended_profile_phone_dialog.f f152944b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f152945c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f152946d;

        public ShowPhoneDialog(@k com.avito.android.extended_profile_phone_dialog.f fVar, @l String str, @k String str2) {
            this.f152944b = fVar;
            this.f152945c = str;
            this.f152946d = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowPhoneDialog)) {
                return false;
            }
            ShowPhoneDialog showPhoneDialog = (ShowPhoneDialog) obj;
            return L.f(this.f152944b, showPhoneDialog.f152944b) && L.f(this.f152945c, showPhoneDialog.f152945c) && L.f(this.f152946d, showPhoneDialog.f152946d);
        }

        public final int hashCode() {
            int iHashCode = this.f152944b.hashCode() * 31;
            String str = this.f152945c;
            return this.f152946d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowPhoneDialog(phoneInfo=");
            sb2.append(this.f152944b);
            sb2.append(", currentUserId=");
            sb2.append(this.f152945c);
            sb2.append(", userKey=");
            return C22026a.c(sb2, this.f152946d, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$SuggestLoaded;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestLoaded implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f152947b;

        public SuggestLoaded(@k List<SuggestItem> list) {
            this.f152947b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestLoaded) && L.f(this.f152947b, ((SuggestLoaded) obj).f152947b);
        }

        public final int hashCode() {
            return this.f152947b.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("SuggestLoaded(suggests="), this.f152947b, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$SuggestLoadingError;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SuggestLoadingError implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f152948b;

        public SuggestLoadingError(@k Throwable th2) {
            this.f152948b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuggestLoadingError) && L.f(this.f152948b, ((SuggestLoadingError) obj).f152948b);
        }

        public final int hashCode() {
            return this.f152948b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("SuggestLoadingError(throwable="), this.f152948b, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$UpdateItems;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "()V", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UpdateItems implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final UpdateItems f152949b = new UpdateItems();

        private UpdateItems() {
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$UpdateSearchInputText;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSearchInputText implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f152950b;

        public UpdateSearchInputText(@k String str) {
            this.f152950b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSearchInputText) && L.f(this.f152950b, ((UpdateSearchInputText) obj).f152950b);
        }

        public final int hashCode() {
            return this.f152950b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateSearchInputText(text="), this.f152950b, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$UserNotExistError;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UserNotExistError implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f152951b;

        public UserNotExistError(@k String str) {
            this.f152951b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserNotExistError) && L.f(this.f152951b, ((UserNotExistError) obj).f152951b);
        }

        public final int hashCode() {
            return this.f152951b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UserNotExistError(errorMessage="), this.f152951b, ')');
        }
    }

    /* compiled from: ExtendedProfileSerpInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction$AdvertsLoaded;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertsLoaded implements ExtendedProfileSerpInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f152918b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<AdvertItem> f152919c;

        /* renamed from: d, reason: collision with root package name */
        public final int f152920d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f152921e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final SearchCorrectionItem f152922f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f152923g;

        /* renamed from: h, reason: collision with root package name */
        public final int f152924h;

        /* renamed from: i, reason: collision with root package name */
        public final int f152925i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f152926j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final SearchParams f152927k;

        public AdvertsLoaded(@l String str, @k List<AdvertItem> list, int i12, boolean z12, @l SearchCorrectionItem searchCorrectionItem, @l String str2, int i13, int i14, @l String str3, @k SearchParams searchParams) {
            this.f152918b = str;
            this.f152919c = list;
            this.f152920d = i12;
            this.f152921e = z12;
            this.f152922f = searchCorrectionItem;
            this.f152923g = str2;
            this.f152924h = i13;
            this.f152925i = i14;
            this.f152926j = str3;
            this.f152927k = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertsLoaded)) {
                return false;
            }
            AdvertsLoaded advertsLoaded = (AdvertsLoaded) obj;
            return L.f(this.f152918b, advertsLoaded.f152918b) && L.f(this.f152919c, advertsLoaded.f152919c) && this.f152920d == advertsLoaded.f152920d && this.f152921e == advertsLoaded.f152921e && L.f(this.f152922f, advertsLoaded.f152922f) && L.f(this.f152923g, advertsLoaded.f152923g) && this.f152924h == advertsLoaded.f152924h && this.f152925i == advertsLoaded.f152925i && L.f(this.f152926j, advertsLoaded.f152926j) && L.f(this.f152927k, advertsLoaded.f152927k);
        }

        public final int hashCode() {
            String str = this.f152918b;
            int i12 = r.i(r.e(this.f152920d, H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f152919c), 31), 31, this.f152921e);
            SearchCorrectionItem searchCorrectionItem = this.f152922f;
            int iHashCode = (i12 + (searchCorrectionItem == null ? 0 : searchCorrectionItem.hashCode())) * 31;
            String str2 = this.f152923g;
            int iE2 = r.e(this.f152925i, r.e(this.f152924h, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
            String str3 = this.f152926j;
            return this.f152927k.hashCode() + ((iE2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsLoaded(shareLink=");
            sb2.append(this.f152918b);
            sb2.append(", adverts=");
            sb2.append(this.f152919c);
            sb2.append(", pageNumber=");
            sb2.append(this.f152920d);
            sb2.append(", isFirstPage=");
            sb2.append(this.f152921e);
            sb2.append(", correctionItem=");
            sb2.append(this.f152922f);
            sb2.append(", searchHint=");
            sb2.append(this.f152923g);
            sb2.append(", totalCount=");
            sb2.append(this.f152924h);
            sb2.append(", foundCount=");
            sb2.append(this.f152925i);
            sb2.append(", emptySearchText=");
            sb2.append(this.f152926j);
            sb2.append(", searchParams=");
            return f.m(sb2, this.f152927k, ')');
        }

        public /* synthetic */ AdvertsLoaded(String str, List list, int i12, boolean z12, SearchCorrectionItem searchCorrectionItem, String str2, int i13, int i14, String str3, SearchParams searchParams, int i15, C42822w c42822w) {
            this((i15 & 1) != 0 ? null : str, list, i12, z12, searchCorrectionItem, str2, i13, i14, str3, searchParams);
        }
    }
}
