package com.avito.android.hotel_booking.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.hotel.model.HotelBookingFormItem;
import com.avito.android.hotel.model.HotelBookingFormResponse;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.ButtonAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BookingCreated", "BookingErrors", "BookingUnavailable", "ChangeKeyboardVisibility", "ClickBookingDescription", "ClickDeeplink", "CloseScreen", "ContentError", "ContentLoaded", "ContentLoading", "Init", "ShowInfoToast", "UpdateFormItems", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$BookingCreated;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$BookingErrors;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$BookingUnavailable;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ChangeKeyboardVisibility;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ClickBookingDescription;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ClickDeeplink;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$CloseScreen;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ContentError;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ContentLoaded;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ContentLoading;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$Init;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ShowInfoToast;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$UpdateFormItems;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HotelBookingInternalAction extends n {

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$BookingCreated;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BookingCreated implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f163841b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Bundle f163842c;

        public BookingCreated(@k DeepLink deepLink, @k Bundle bundle) {
            this.f163841b = deepLink;
            this.f163842c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookingCreated)) {
                return false;
            }
            BookingCreated bookingCreated = (BookingCreated) obj;
            return L.f(this.f163841b, bookingCreated.f163841b) && L.f(this.f163842c, bookingCreated.f163842c);
        }

        public final int hashCode() {
            return this.f163842c.hashCode() + (this.f163841b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BookingCreated(redirect=");
            sb2.append(this.f163841b);
            sb2.append(", bundle=");
            return H.m(sb2, this.f163842c, ')');
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$BookingErrors;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BookingErrors implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<HotelBookingFormItem> f163843b;

        /* renamed from: c, reason: collision with root package name */
        public final int f163844c;

        /* JADX WARN: Multi-variable type inference failed */
        public BookingErrors(@l List<? extends HotelBookingFormItem> list, int i12) {
            this.f163843b = list;
            this.f163844c = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookingErrors)) {
                return false;
            }
            BookingErrors bookingErrors = (BookingErrors) obj;
            return L.f(this.f163843b, bookingErrors.f163843b) && this.f163844c == bookingErrors.f163844c;
        }

        public final int hashCode() {
            List<HotelBookingFormItem> list = this.f163843b;
            return Integer.hashCode(this.f163844c) + ((list == null ? 0 : list.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BookingErrors(newFormItems=");
            sb2.append(this.f163843b);
            sb2.append(", firstErrorItemPosition=");
            return r.t(sb2, this.f163844c, ')');
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$BookingUnavailable;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BookingUnavailable implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f163845b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f163846c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ButtonAction f163847d;

        public BookingUnavailable(@l String str, @l String str2, @l ButtonAction buttonAction) {
            this.f163845b = str;
            this.f163846c = str2;
            this.f163847d = buttonAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BookingUnavailable)) {
                return false;
            }
            BookingUnavailable bookingUnavailable = (BookingUnavailable) obj;
            return L.f(this.f163845b, bookingUnavailable.f163845b) && L.f(this.f163846c, bookingUnavailable.f163846c) && L.f(this.f163847d, bookingUnavailable.f163847d);
        }

        public final int hashCode() {
            String str = this.f163845b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f163846c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ButtonAction buttonAction = this.f163847d;
            return iHashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BookingUnavailable(title=");
            sb2.append(this.f163845b);
            sb2.append(", subtitle=");
            sb2.append(this.f163846c);
            sb2.append(", button=");
            return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.f163847d, ')');
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ChangeKeyboardVisibility;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChangeKeyboardVisibility implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f163848b;

        public ChangeKeyboardVisibility(boolean z12) {
            this.f163848b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChangeKeyboardVisibility) && this.f163848b == ((ChangeKeyboardVisibility) obj).f163848b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f163848b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeKeyboardVisibility(isVisible="), this.f163848b, ')');
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ClickBookingDescription;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickBookingDescription implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f163849b;

        public ClickBookingDescription(int i12) {
            this.f163849b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClickBookingDescription) && this.f163849b == ((ClickBookingDescription) obj).f163849b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f163849b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ClickBookingDescription(position="), this.f163849b, ')');
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ClickDeeplink;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ClickDeeplink implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f163850b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f163851c;

        public ClickDeeplink(@k DeepLink deepLink, @l Bundle bundle) {
            this.f163850b = deepLink;
            this.f163851c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickDeeplink)) {
                return false;
            }
            ClickDeeplink clickDeeplink = (ClickDeeplink) obj;
            return L.f(this.f163850b, clickDeeplink.f163850b) && L.f(this.f163851c, clickDeeplink.f163851c);
        }

        public final int hashCode() {
            int iHashCode = this.f163850b.hashCode() * 31;
            Bundle bundle = this.f163851c;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickDeeplink(deeplink=");
            sb2.append(this.f163850b);
            sb2.append(", bundle=");
            return H.m(sb2, this.f163851c, ')');
        }

        public /* synthetic */ ClickDeeplink(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : bundle);
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$CloseScreen;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f163852b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -236197824;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ContentError;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements HotelBookingInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f163853b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f163854c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f163855d;

        public ContentError(@k ApiError apiError, boolean z12) {
            this.f163853b = apiError;
            this.f163854c = z12;
            this.f163855d = new J.a(apiError);
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
            if (!(obj instanceof ContentError)) {
                return false;
            }
            ContentError contentError = (ContentError) obj;
            return L.f(this.f163853b, contentError.f163853b) && this.f163854c == contentError.f163854c;
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF266239c() {
            return this.f163855d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f163854c) + (this.f163853b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentError(error=");
            sb2.append(this.f163853b);
            sb2.append(", hasForm=");
            return r.x(sb2, this.f163854c, ')');
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ContentLoaded;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements HotelBookingInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final HotelBookingFormResponse f163856b;

        public ContentLoaded(@k HotelBookingFormResponse hotelBookingFormResponse) {
            this.f163856b = hotelBookingFormResponse;
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
            return (obj instanceof ContentLoaded) && L.f(this.f163856b, ((ContentLoaded) obj).f163856b);
        }

        public final int hashCode() {
            return this.f163856b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(formResponse=" + this.f163856b + ')';
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ContentLoading;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements HotelBookingInternalAction {
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$Init;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f163857b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f163858c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ArrayList f163859d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f163860e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f163861f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f163862g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f163863h;

        public Init(@k String str, @l Integer num, @l ArrayList arrayList, @l String str2, @l String str3, @l String str4, @l String str5) {
            this.f163857b = str;
            this.f163858c = num;
            this.f163859d = arrayList;
            this.f163860e = str2;
            this.f163861f = str3;
            this.f163862g = str4;
            this.f163863h = str5;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f163857b, init.f163857b) && L.f(this.f163858c, init.f163858c) && L.f(this.f163859d, init.f163859d) && L.f(this.f163860e, init.f163860e) && L.f(this.f163861f, init.f163861f) && L.f(this.f163862g, init.f163862g) && L.f(this.f163863h, init.f163863h);
        }

        public final int hashCode() {
            int iHashCode = this.f163857b.hashCode() * 31;
            Integer num = this.f163858c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            ArrayList arrayList = this.f163859d;
            int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            String str = this.f163860e;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f163861f;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f163862g;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f163863h;
            return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(offerCode=");
            sb2.append(this.f163857b);
            sb2.append(", adultGuests=");
            sb2.append(this.f163858c);
            sb2.append(", childAges=");
            sb2.append(this.f163859d);
            sb2.append(", itemId=");
            sb2.append(this.f163860e);
            sb2.append(", roomId=");
            sb2.append(this.f163861f);
            sb2.append(", checkIn=");
            sb2.append(this.f163862g);
            sb2.append(", checkOut=");
            return C22026a.c(sb2, this.f163863h, ')');
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$ShowInfoToast;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowInfoToast implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f163864b;

        public ShowInfoToast(@k PrintableText printableText) {
            this.f163864b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowInfoToast) && L.f(this.f163864b, ((ShowInfoToast) obj).f163864b);
        }

        public final int hashCode() {
            return this.f163864b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowInfoToast(message="), this.f163864b, ')');
        }
    }

    /* compiled from: HotelBookingInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction$UpdateFormItems;", "Lcom/avito/android/hotel_booking/mvi/entity/HotelBookingInternalAction;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateFormItems implements HotelBookingInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final List<HotelBookingFormItem> f163865b;

        /* JADX WARN: Multi-variable type inference failed */
        public UpdateFormItems(@l List<? extends HotelBookingFormItem> list) {
            this.f163865b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateFormItems) && L.f(this.f163865b, ((UpdateFormItems) obj).f163865b);
        }

        public final int hashCode() {
            List<HotelBookingFormItem> list = this.f163865b;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("UpdateFormItems(newFormItems="), this.f163865b, ')');
        }
    }
}
