package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity;

import AK.c;
import Sz0.C15273b;
import Sz0.C15274c;
import Uz0.C15589a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersCalendarInternalAction.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001a\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddTooltipShowedItemId", "BannerLoaded", "ChangeOrientation", "CloseBanner", "CloseScreen", "FrameMonthChanged", "Init", "InitScreenOrientation", "LoadingError", "OpenDeeplink", "OpenMonthSelector", "OpenSellerCalendar", "OpenSellerCalendarWithSelectedDates", "RebuildItems", "RedesignLoadingComplete", "RedesignPaginationCompleted", "RotateScreen", "ScrollToHorizontalPosition", "ShowBookingsLoadingError", "StartLoading", "StartPagination", "ToggleFlatRecyclerCollapse", "ToggleShowDates", "UpdateItemDatesLoadingComplete", "UpdateSelectedDateRange", "UxInfoLoadingComplete", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$AddTooltipShowedItemId;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$BannerLoaded;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ChangeOrientation;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$CloseBanner;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$FrameMonthChanged;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$Init;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$InitScreenOrientation;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$LoadingError;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$OpenDeeplink;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$OpenMonthSelector;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$OpenSellerCalendar;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$OpenSellerCalendarWithSelectedDates;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$RebuildItems;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$RedesignLoadingComplete;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$RedesignPaginationCompleted;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$RotateScreen;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ScrollToHorizontalPosition;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ShowBookingsLoadingError;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$StartLoading;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$StartPagination;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ToggleFlatRecyclerCollapse;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ToggleShowDates;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$UpdateItemDatesLoadingComplete;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$UpdateSelectedDateRange;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$UxInfoLoadingComplete;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface StrOrdersCalendarInternalAction extends n {

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$AddTooltipShowedItemId;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddTooltipShowedItemId implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f291006b;

        public AddTooltipShowedItemId(@k String str) {
            this.f291006b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddTooltipShowedItemId) && L.f(this.f291006b, ((AddTooltipShowedItemId) obj).f291006b);
        }

        public final int hashCode() {
            return this.f291006b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddTooltipShowedItemId(itemId="), this.f291006b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$BannerLoaded;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BannerLoaded implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BF0.a f291007b;

        public BannerLoaded(@l BF0.a aVar) {
            this.f291007b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BannerLoaded) && L.f(this.f291007b, ((BannerLoaded) obj).f291007b);
        }

        public final int hashCode() {
            BF0.a aVar = this.f291007b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "BannerLoaded(banner=" + this.f291007b + ')';
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ChangeOrientation;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeOrientation implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f291008b;

        public ChangeOrientation(int i12) {
            this.f291008b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeOrientation) && this.f291008b == ((ChangeOrientation) obj).f291008b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f291008b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ChangeOrientation(newOrientation="), this.f291008b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$CloseBanner;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseBanner implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseBanner f291009b = new CloseBanner();

        private CloseBanner() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseBanner);
        }

        public final int hashCode() {
            return -1955113737;
        }

        @k
        public final String toString() {
            return "CloseBanner";
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f291010b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1466460617;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$FrameMonthChanged;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FrameMonthChanged implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f291011b;

        public FrameMonthChanged(@k Date date) {
            this.f291011b = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrameMonthChanged) && L.f(this.f291011b, ((FrameMonthChanged) obj).f291011b);
        }

        public final int hashCode() {
            return this.f291011b.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("FrameMonthChanged(newMonthDate="), this.f291011b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$Init;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f291012b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Date f291013c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Date f291014d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Date f291015e;

        public Init(@k Date date, @k Date date2, @k Date date3, @k Date date4) {
            this.f291012b = date;
            this.f291013c = date2;
            this.f291014d = date3;
            this.f291015e = date4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f291012b, init.f291012b) && L.f(this.f291013c, init.f291013c) && L.f(this.f291014d, init.f291014d) && L.f(this.f291015e, init.f291015e);
        }

        public final int hashCode() {
            return this.f291015e.hashCode() + m.f(this.f291014d, m.f(this.f291013c, this.f291012b.hashCode() * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(todayServerDate=");
            sb2.append(this.f291012b);
            sb2.append(", leftmostLoadedDate=");
            sb2.append(this.f291013c);
            sb2.append(", rightmostLoadedDate=");
            sb2.append(this.f291014d);
            sb2.append(", currentFrameDate=");
            return f.n(sb2, this.f291015e, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$InitScreenOrientation;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InitScreenOrientation implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f291016b;

        public InitScreenOrientation(int i12) {
            this.f291016b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitScreenOrientation) && this.f291016b == ((InitScreenOrientation) obj).f291016b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f291016b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("InitScreenOrientation(orientation="), this.f291016b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$LoadingError;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoadingError implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f291017b;

        public LoadingError(@k ApiError apiError) {
            this.f291017b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingError) && L.f(this.f291017b, ((LoadingError) obj).f291017b);
        }

        public final int hashCode() {
            return this.f291017b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LoadingError(error="), this.f291017b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$OpenDeeplink;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f291018b;

        public OpenDeeplink(@k DeepLink deepLink) {
            this.f291018b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f291018b, ((OpenDeeplink) obj).f291018b);
        }

        public final int hashCode() {
            return this.f291018b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f291018b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$OpenMonthSelector;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenMonthSelector implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f291019b;

        public OpenMonthSelector(@k String str) {
            this.f291019b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenMonthSelector) && L.f(this.f291019b, ((OpenMonthSelector) obj).f291019b);
        }

        public final int hashCode() {
            return this.f291019b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenMonthSelector(currentMonthId="), this.f291019b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$OpenSellerCalendar;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSellerCalendar implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f291020b;

        public OpenSellerCalendar(@k String str) {
            this.f291020b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSellerCalendar) && L.f(this.f291020b, ((OpenSellerCalendar) obj).f291020b);
        }

        public final int hashCode() {
            return this.f291020b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenSellerCalendar(itemId="), this.f291020b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$OpenSellerCalendarWithSelectedDates;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSellerCalendarWithSelectedDates implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f291021b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Date f291022c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f291023d;

        public OpenSellerCalendarWithSelectedDates(@k String str, @k Date date, @k Date date2) {
            this.f291021b = date;
            this.f291022c = date2;
            this.f291023d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenSellerCalendarWithSelectedDates)) {
                return false;
            }
            OpenSellerCalendarWithSelectedDates openSellerCalendarWithSelectedDates = (OpenSellerCalendarWithSelectedDates) obj;
            return L.f(this.f291021b, openSellerCalendarWithSelectedDates.f291021b) && L.f(this.f291022c, openSellerCalendarWithSelectedDates.f291022c) && L.f(this.f291023d, openSellerCalendarWithSelectedDates.f291023d);
        }

        public final int hashCode() {
            return this.f291023d.hashCode() + m.f(this.f291022c, this.f291021b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSellerCalendarWithSelectedDates(firstSelectedDate=");
            sb2.append(this.f291021b);
            sb2.append(", secondSelectedDate=");
            sb2.append(this.f291022c);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.f291023d, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$RebuildItems;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RebuildItems implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RebuildItems f291024b = new RebuildItems();

        private RebuildItems() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RebuildItems);
        }

        public final int hashCode() {
            return 1439400210;
        }

        @k
        public final String toString() {
            return "RebuildItems";
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$RedesignLoadingComplete;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RedesignLoadingComplete implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, C15274c> f291025b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, List<C15273b>> f291026c;

        /* JADX WARN: Multi-variable type inference failed */
        public RedesignLoadingComplete(@k Map<String, C15274c> map, @k Map<String, ? extends List<C15273b>> map2) {
            this.f291025b = map;
            this.f291026c = map2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedesignLoadingComplete)) {
                return false;
            }
            RedesignLoadingComplete redesignLoadingComplete = (RedesignLoadingComplete) obj;
            return L.f(this.f291025b, redesignLoadingComplete.f291025b) && L.f(this.f291026c, redesignLoadingComplete.f291026c);
        }

        public final int hashCode() {
            return this.f291026c.hashCode() + (this.f291025b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RedesignLoadingComplete(itemIdToItemInfoMap=");
            sb2.append(this.f291025b);
            sb2.append(", itemIdToCalendarRedesignDayInfosMap=");
            return r.w(sb2, this.f291026c, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$RedesignPaginationCompleted;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RedesignPaginationCompleted implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f291027b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Date f291028c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Map<String, List<C15273b>> f291029d;

        /* JADX WARN: Multi-variable type inference failed */
        public RedesignPaginationCompleted(@k Date date, @k Date date2, @k Map<String, ? extends List<C15273b>> map) {
            this.f291027b = date;
            this.f291028c = date2;
            this.f291029d = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedesignPaginationCompleted)) {
                return false;
            }
            RedesignPaginationCompleted redesignPaginationCompleted = (RedesignPaginationCompleted) obj;
            return L.f(this.f291027b, redesignPaginationCompleted.f291027b) && L.f(this.f291028c, redesignPaginationCompleted.f291028c) && L.f(this.f291029d, redesignPaginationCompleted.f291029d);
        }

        public final int hashCode() {
            return this.f291029d.hashCode() + m.f(this.f291028c, this.f291027b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RedesignPaginationCompleted(newLeftmostLoadedDate=");
            sb2.append(this.f291027b);
            sb2.append(", newRightmostLoadedDate=");
            sb2.append(this.f291028c);
            sb2.append(", newItemIdToCalendarRedesignDayInfosMap=");
            return r.w(sb2, this.f291029d, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$RotateScreen;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RotateScreen implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RotateScreen f291030b = new RotateScreen();

        private RotateScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof RotateScreen);
        }

        public final int hashCode() {
            return -1487394220;
        }

        @k
        public final String toString() {
            return "RotateScreen";
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ScrollToHorizontalPosition;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToHorizontalPosition implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f291031b;

        public ScrollToHorizontalPosition(int i12) {
            this.f291031b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToHorizontalPosition) && this.f291031b == ((ScrollToHorizontalPosition) obj).f291031b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f291031b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToHorizontalPosition(position="), this.f291031b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ShowBookingsLoadingError;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowBookingsLoadingError implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowBookingsLoadingError f291032b = new ShowBookingsLoadingError();

        private ShowBookingsLoadingError() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowBookingsLoadingError);
        }

        public final int hashCode() {
            return 1649023568;
        }

        @k
        public final String toString() {
            return "ShowBookingsLoadingError";
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$StartLoading;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartLoading implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartLoading f291033b = new StartLoading();

        private StartLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartLoading);
        }

        public final int hashCode() {
            return 1405268775;
        }

        @k
        public final String toString() {
            return "StartLoading";
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$StartPagination;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartPagination implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartPagination f291034b = new StartPagination();

        private StartPagination() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartPagination);
        }

        public final int hashCode() {
            return -2089510449;
        }

        @k
        public final String toString() {
            return "StartPagination";
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ToggleFlatRecyclerCollapse;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleFlatRecyclerCollapse implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f291035b;

        public ToggleFlatRecyclerCollapse(boolean z12) {
            this.f291035b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleFlatRecyclerCollapse) && this.f291035b == ((ToggleFlatRecyclerCollapse) obj).f291035b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f291035b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleFlatRecyclerCollapse(isCollapsed="), this.f291035b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$ToggleShowDates;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleShowDates implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ToggleShowDates f291036b = new ToggleShowDates();

        private ToggleShowDates() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ToggleShowDates);
        }

        public final int hashCode() {
            return -1332819769;
        }

        @k
        public final String toString() {
            return "ToggleShowDates";
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$UpdateItemDatesLoadingComplete;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateItemDatesLoadingComplete implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, List<C15273b>> f291037b;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateItemDatesLoadingComplete(@k Map<String, ? extends List<C15273b>> map) {
            this.f291037b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateItemDatesLoadingComplete) && L.f(this.f291037b, ((UpdateItemDatesLoadingComplete) obj).f291037b);
        }

        public final int hashCode() {
            return this.f291037b.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("UpdateItemDatesLoadingComplete(itemIdToCalendarRedesignDayInfosMap="), this.f291037b, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$UpdateSelectedDateRange;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateSelectedDateRange implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C15589a f291038b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f291039c;

        public UpdateSelectedDateRange(@l C15589a c15589a, boolean z12) {
            this.f291038b = c15589a;
            this.f291039c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateSelectedDateRange)) {
                return false;
            }
            UpdateSelectedDateRange updateSelectedDateRange = (UpdateSelectedDateRange) obj;
            return L.f(this.f291038b, updateSelectedDateRange.f291038b) && this.f291039c == updateSelectedDateRange.f291039c;
        }

        public final int hashCode() {
            C15589a c15589a = this.f291038b;
            return Boolean.hashCode(this.f291039c) + ((c15589a == null ? 0 : c15589a.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateSelectedDateRange(newSelectedDateRangeState=");
            sb2.append(this.f291038b);
            sb2.append(", needToClearSelection=");
            return r.x(sb2, this.f291039c, ')');
        }
    }

    /* compiled from: StrOrdersCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction$UxInfoLoadingComplete;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UxInfoLoadingComplete implements StrOrdersCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final SK0.f f291040b;

        public UxInfoLoadingComplete(@l SK0.f fVar) {
            this.f291040b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UxInfoLoadingComplete) && L.f(this.f291040b, ((UxInfoLoadingComplete) obj).f291040b);
        }

        public final int hashCode() {
            SK0.f fVar = this.f291040b;
            if (fVar == null) {
                return 0;
            }
            return fVar.f14906a.hashCode();
        }

        @k
        public final String toString() {
            return "UxInfoLoadingComplete(properties=" + this.f291040b + ')';
        }
    }
}
