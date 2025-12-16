package com.avito.android.widget_filters.mvi.entity;

import NP0.q;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.widget_filters.analytics.LocationSelectMethod;
import com.avito.android.widget_filters.remote.model.WidgetFiltersResponse;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import tF.e;

/* compiled from: WidgetFiltersInternalAction.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ChangeExpandedWidgetPosition", "CloseScreen", "HandleApplyRedirect", "HandleClarifySearch", "ShowApplyError", "ShowContent", "ShowContentError", "ShowDefaultToast", "ShowOnboarding", "StartApplyLoading", "StartContentLoading", "ToggleKeyboard", "UpdateCategory", "UpdateDates", "UpdateGuests", "UpdateLocation", "UpdateOrientation", "UpdateParameters", "UpdateToolbarTitle", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ChangeExpandedWidgetPosition;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$CloseScreen;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$HandleApplyRedirect;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$HandleClarifySearch;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowApplyError;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowContent;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowContentError;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowDefaultToast;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowOnboarding;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$StartApplyLoading;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$StartContentLoading;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ToggleKeyboard;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateCategory;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateOrientation;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateParameters;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateToolbarTitle;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface WidgetFiltersInternalAction extends n {

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$CloseScreen;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f330015b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -345698298;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$HandleApplyRedirect;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleApplyRedirect implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f330016b;

        public HandleApplyRedirect(@l DeepLink deepLink) {
            this.f330016b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleApplyRedirect) && L.f(this.f330016b, ((HandleApplyRedirect) obj).f330016b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f330016b;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleApplyRedirect(deeplink="), this.f330016b, ')');
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$HandleClarifySearch;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleClarifySearch implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ItemsSearchLink f330017b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f330018c;

        public HandleClarifySearch(@k ItemsSearchLink itemsSearchLink, @l String str) {
            this.f330017b = itemsSearchLink;
            this.f330018c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandleClarifySearch)) {
                return false;
            }
            HandleClarifySearch handleClarifySearch = (HandleClarifySearch) obj;
            return this.f330017b.equals(handleClarifySearch.f330017b) && L.f(this.f330018c, handleClarifySearch.f330018c);
        }

        public final int hashCode() {
            int iHashCode = this.f330017b.hashCode() * 31;
            String str = this.f330018c;
            return Boolean.hashCode(true) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleClarifySearch(deeplink=");
            sb2.append(this.f330017b);
            sb2.append(", updatedLocationId=");
            return AK.c.s(sb2, this.f330018c, ", resetArea=true)");
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowApplyError;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowApplyError implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f330019b;

        public ShowApplyError(@k PrintableText printableText) {
            this.f330019b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowApplyError) && L.f(this.f330019b, ((ShowApplyError) obj).f330019b);
        }

        public final int hashCode() {
            return this.f330019b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowApplyError(text="), this.f330019b, ')');
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowContent;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements TrackableContent, WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final WidgetFiltersResponse f330020b;

        public ShowContent(@k WidgetFiltersResponse widgetFiltersResponse) {
            this.f330020b = widgetFiltersResponse;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            return (obj instanceof ShowContent) && L.f(this.f330020b, ((ShowContent) obj).f330020b);
        }

        public final int hashCode() {
            return this.f330020b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(response=" + this.f330020b + ')';
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowContentError;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContentError implements TrackableError, WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f330021b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f330022c;

        public ShowContentError(@k ApiError apiError) {
            this.f330021b = apiError;
            this.f330022c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF111994d() {
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
            return (obj instanceof ShowContentError) && L.f(this.f330021b, ((ShowContentError) obj).f330021b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF111986c() {
            return this.f330022c;
        }

        public final int hashCode() {
            return this.f330021b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowContentError(error="), this.f330021b, ')');
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowDefaultToast;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDefaultToast implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f330023b;

        public ShowDefaultToast(@k PrintableText printableText) {
            this.f330023b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowDefaultToast) && L.f(this.f330023b, ((ShowDefaultToast) obj).f330023b);
        }

        public final int hashCode() {
            return this.f330023b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowDefaultToast(message="), this.f330023b, ')');
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ShowOnboarding;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowOnboarding implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final q f330024b;

        public ShowOnboarding(@k q qVar) {
            this.f330024b = qVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowOnboarding) && L.f(this.f330024b, ((ShowOnboarding) obj).f330024b);
        }

        public final int hashCode() {
            return this.f330024b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowOnboarding(onboarding=" + this.f330024b + ')';
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$StartApplyLoading;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartApplyLoading implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartApplyLoading f330025b = new StartApplyLoading();

        private StartApplyLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartApplyLoading);
        }

        public final int hashCode() {
            return -166057614;
        }

        @k
        public final String toString() {
            return "StartApplyLoading";
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$StartContentLoading;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartContentLoading extends TrackableLoadingStarted implements WidgetFiltersInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final LoadingType f330026d;

        public StartContentLoading(@k LoadingType loadingType) {
            this.f330026d = loadingType;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted, com.avito.android.analytics.screens.mvi.s
        @k
        /* renamed from: d */
        public final String getF111994d() {
            return this.f330026d.name();
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StartContentLoading) && this.f330026d == ((StartContentLoading) obj).f330026d;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f330026d.hashCode();
        }

        @k
        public final String toString() {
            return "StartContentLoading(type=" + this.f330026d + ')';
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ToggleKeyboard;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleKeyboard implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f330027b;

        public ToggleKeyboard(boolean z12) {
            this.f330027b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleKeyboard) && this.f330027b == ((ToggleKeyboard) obj).f330027b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f330027b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleKeyboard(isKeyboardVisible="), this.f330027b, ')');
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateCategory;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "ChangeCategorySelection", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateCategory$ChangeCategorySelection;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface UpdateCategory extends WidgetFiltersInternalAction {

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateCategory$ChangeCategorySelection;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateCategory;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ChangeCategorySelection implements UpdateCategory {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final NP0.c f330028b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f330029c;

            public ChangeCategorySelection(@k NP0.c cVar, boolean z12) {
                this.f330028b = cVar;
                this.f330029c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ChangeCategorySelection)) {
                    return false;
                }
                ChangeCategorySelection changeCategorySelection = (ChangeCategorySelection) obj;
                return L.f(this.f330028b, changeCategorySelection.f330028b) && this.f330029c == changeCategorySelection.f330029c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f330029c) + (this.f330028b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ChangeCategorySelection(category=");
                sb2.append(this.f330028b);
                sb2.append(", isSelected=");
                return r.x(sb2, this.f330029c, ')');
            }
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "ResetDates", "SelectDate", "SelectFlexSearchOption", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates$ResetDates;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates$SelectDate;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates$SelectFlexSearchOption;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface UpdateDates extends WidgetFiltersInternalAction {

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates$ResetDates;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ResetDates implements UpdateDates {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ResetDates f330030b = new ResetDates();

            private ResetDates() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ResetDates);
            }

            public final int hashCode() {
                return 386439110;
            }

            @k
            public final String toString() {
                return "ResetDates";
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates$SelectDate;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectDate implements UpdateDates {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Date f330031b;

            public SelectDate(@k Date date) {
                this.f330031b = date;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectDate) && L.f(this.f330031b, ((SelectDate) obj).f330031b);
            }

            public final int hashCode() {
                return this.f330031b.hashCode();
            }

            @k
            public final String toString() {
                return f.n(new StringBuilder("SelectDate(date="), this.f330031b, ')');
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates$SelectFlexSearchOption;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateDates;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectFlexSearchOption implements UpdateDates {

            /* renamed from: b, reason: collision with root package name */
            public final int f330032b;

            public SelectFlexSearchOption(int i12) {
                this.f330032b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectFlexSearchOption) && this.f330032b == ((SelectFlexSearchOption) obj).f330032b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f330032b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("SelectFlexSearchOption(id="), this.f330032b, ')');
            }
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "AddChild", "ChangeAdultsValue", "ChangeAnimalsSelected", "RemoveChild", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests$AddChild;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests$ChangeAdultsValue;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests$ChangeAnimalsSelected;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests$RemoveChild;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface UpdateGuests extends WidgetFiltersInternalAction {

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests$AddChild;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AddChild implements UpdateGuests {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final NP0.f f330033b;

            public AddChild(@k NP0.f fVar) {
                this.f330033b = fVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddChild) && L.f(this.f330033b, ((AddChild) obj).f330033b);
            }

            public final int hashCode() {
                return this.f330033b.hashCode();
            }

            @k
            public final String toString() {
                return "AddChild(child=" + this.f330033b + ')';
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests$ChangeAdultsValue;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ChangeAdultsValue implements UpdateGuests {

            /* renamed from: b, reason: collision with root package name */
            public final int f330034b;

            public ChangeAdultsValue(int i12) {
                this.f330034b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAdultsValue) && this.f330034b == ((ChangeAdultsValue) obj).f330034b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f330034b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("ChangeAdultsValue(value="), this.f330034b, ')');
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests$ChangeAnimalsSelected;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ChangeAnimalsSelected implements UpdateGuests {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f330035b;

            public ChangeAnimalsSelected(boolean z12) {
                this.f330035b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeAnimalsSelected) && this.f330035b == ((ChangeAnimalsSelected) obj).f330035b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f330035b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("ChangeAnimalsSelected(isSelected="), this.f330035b, ')');
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests$RemoveChild;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateGuests;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RemoveChild implements UpdateGuests {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final NP0.f f330036b;

            public RemoveChild(@k NP0.f fVar) {
                this.f330036b = fVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveChild) && L.f(this.f330036b, ((RemoveChild) obj).f330036b);
            }

            public final int hashCode() {
                return this.f330036b.hashCode();
            }

            @k
            public final String toString() {
                return "RemoveChild(child=" + this.f330036b + ')';
            }
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "ChangeLocationInputFocus", "ChangeLocationInputText", "ClearSelectedLocation", "RequestLocationInputFocus", "SelectLocation", "SelectRecentSearch", "ShowSuggestedLocationsContent", "ShowSuggestedLocationsError", "StartSuggestedLocationsLoading", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ChangeLocationInputFocus;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ChangeLocationInputText;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ClearSelectedLocation;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$RequestLocationInputFocus;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$SelectLocation;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$SelectRecentSearch;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ShowSuggestedLocationsContent;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ShowSuggestedLocationsError;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$StartSuggestedLocationsLoading;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface UpdateLocation extends WidgetFiltersInternalAction {

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ChangeLocationInputFocus;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ChangeLocationInputFocus implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f330037b;

            public ChangeLocationInputFocus(boolean z12) {
                this.f330037b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeLocationInputFocus) && this.f330037b == ((ChangeLocationInputFocus) obj).f330037b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f330037b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("ChangeLocationInputFocus(hasFocus="), this.f330037b, ')');
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ChangeLocationInputText;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ChangeLocationInputText implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f330038b;

            public ChangeLocationInputText(@k String str) {
                this.f330038b = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeLocationInputText) && L.f(this.f330038b, ((ChangeLocationInputText) obj).f330038b);
            }

            public final int hashCode() {
                return this.f330038b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("ChangeLocationInputText(text="), this.f330038b, ')');
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ClearSelectedLocation;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ClearSelectedLocation implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final ClearSelectedLocation f330039b = new ClearSelectedLocation();

            private ClearSelectedLocation() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof ClearSelectedLocation);
            }

            public final int hashCode() {
                return -1621511125;
            }

            @k
            public final String toString() {
                return "ClearSelectedLocation";
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$RequestLocationInputFocus;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RequestLocationInputFocus implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final RequestLocationInputFocus f330040b = new RequestLocationInputFocus();

            private RequestLocationInputFocus() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof RequestLocationInputFocus);
            }

            public final int hashCode() {
                return 1252143872;
            }

            @k
            public final String toString() {
                return "RequestLocationInputFocus";
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$SelectLocation;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectLocation implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final NP0.l f330041b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final LocationSelectMethod f330042c;

            public SelectLocation(@k NP0.l lVar, @k LocationSelectMethod locationSelectMethod) {
                this.f330041b = lVar;
                this.f330042c = locationSelectMethod;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectLocation)) {
                    return false;
                }
                SelectLocation selectLocation = (SelectLocation) obj;
                return L.f(this.f330041b, selectLocation.f330041b) && this.f330042c == selectLocation.f330042c;
            }

            public final int hashCode() {
                return this.f330042c.hashCode() + (this.f330041b.hashCode() * 31);
            }

            @k
            public final String toString() {
                return "SelectLocation(location=" + this.f330041b + ", selectMethod=" + this.f330042c + ')';
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$SelectRecentSearch;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SelectRecentSearch implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f330043b;

            public SelectRecentSearch(boolean z12) {
                this.f330043b = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectRecentSearch) && this.f330043b == ((SelectRecentSearch) obj).f330043b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f330043b);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("SelectRecentSearch(isProcessing="), this.f330043b, ')');
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ShowSuggestedLocationsContent;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowSuggestedLocationsContent implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final e.c f330044b;

            public ShowSuggestedLocationsContent(@k e.c cVar) {
                this.f330044b = cVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSuggestedLocationsContent) && L.f(this.f330044b, ((ShowSuggestedLocationsContent) obj).f330044b);
            }

            public final int hashCode() {
                return this.f330044b.hashCode();
            }

            @k
            public final String toString() {
                return "ShowSuggestedLocationsContent(response=" + this.f330044b + ')';
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$ShowSuggestedLocationsError;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ShowSuggestedLocationsError implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final PrintableText f330045b;

            public ShowSuggestedLocationsError(@k PrintableText printableText) {
                this.f330045b = printableText;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSuggestedLocationsError) && L.f(this.f330045b, ((ShowSuggestedLocationsError) obj).f330045b);
            }

            public final int hashCode() {
                return this.f330045b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.m(new StringBuilder("ShowSuggestedLocationsError(text="), this.f330045b, ')');
            }
        }

        /* compiled from: WidgetFiltersInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation$StartSuggestedLocationsLoading;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateLocation;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class StartSuggestedLocationsLoading implements UpdateLocation {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final StartSuggestedLocationsLoading f330046b = new StartSuggestedLocationsLoading();

            private StartSuggestedLocationsLoading() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof StartSuggestedLocationsLoading);
            }

            public final int hashCode() {
                return -1548115343;
            }

            @k
            public final String toString() {
                return "StartSuggestedLocationsLoading";
            }
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateOrientation;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateOrientation implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f330047b;

        public UpdateOrientation(boolean z12) {
            this.f330047b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateOrientation) && this.f330047b == ((UpdateOrientation) obj).f330047b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f330047b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("UpdateOrientation(isLandscape="), this.f330047b, ')');
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateParameters;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateParameters implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, String> f330048b;

        public UpdateParameters(@k Map<String, String> map) {
            this.f330048b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateParameters) && L.f(this.f330048b, ((UpdateParameters) obj).f330048b);
        }

        public final int hashCode() {
            return this.f330048b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("UpdateParameters(parameters="), this.f330048b, ')');
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$UpdateToolbarTitle;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateToolbarTitle implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f330049b;

        public UpdateToolbarTitle(@k String str) {
            this.f330049b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateToolbarTitle) && L.f(this.f330049b, ((UpdateToolbarTitle) obj).f330049b);
        }

        public final int hashCode() {
            return this.f330049b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateToolbarTitle(title="), this.f330049b, ')');
        }
    }

    /* compiled from: WidgetFiltersInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction$ChangeExpandedWidgetPosition;", "Lcom/avito/android/widget_filters/mvi/entity/WidgetFiltersInternalAction;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeExpandedWidgetPosition implements WidgetFiltersInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f330012b;

        /* renamed from: c, reason: collision with root package name */
        public final int f330013c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f330014d;

        public ChangeExpandedWidgetPosition(int i12, int i13, boolean z12) {
            this.f330012b = i12;
            this.f330013c = i13;
            this.f330014d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChangeExpandedWidgetPosition)) {
                return false;
            }
            ChangeExpandedWidgetPosition changeExpandedWidgetPosition = (ChangeExpandedWidgetPosition) obj;
            return this.f330012b == changeExpandedWidgetPosition.f330012b && this.f330013c == changeExpandedWidgetPosition.f330013c && this.f330014d == changeExpandedWidgetPosition.f330014d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f330014d) + r.e(this.f330013c, Integer.hashCode(this.f330012b) * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeExpandedWidgetPosition(position=");
            sb2.append(this.f330012b);
            sb2.append(", scrollTargetPosition=");
            sb2.append(this.f330013c);
            sb2.append(", withValidationError=");
            return r.x(sb2, this.f330014d, ')');
        }

        public /* synthetic */ ChangeExpandedWidgetPosition(int i12, int i13, boolean z12, int i14, C42822w c42822w) {
            this(i12, i13, (i14 & 4) != 0 ? false : z12);
        }
    }
}
