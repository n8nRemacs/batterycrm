package com.avito.android.short_term_rent.bookingform.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import aw0.C24185a;
import aw0.C24186b;
import aw0.C24188d;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemHint;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormInternalAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BonusesChanged", "CloseScreen", "ContentError", "ContentLoaded", "ContentLoading", "DateRangeChanged", "GuestsSelectionChanged", "HideKeyboard", "MoveToPage", "OpenDeepLink", "PaymentByUrl", "PaymentMethodChanged", "PerformBookingRedirect", "Progress", "PromoCodeChanged", "RefundToggleChanged", "ScrollToItem", "ShowErrorInSnackbar", "ShowRetroBadgeHint", "ShowSnackbar", "UpdateInputs", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$BonusesChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$CloseScreen;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ContentError;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ContentLoaded;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ContentLoading;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$DateRangeChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$GuestsSelectionChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$HideKeyboard;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$MoveToPage;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$OpenDeepLink;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$PaymentByUrl;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$PaymentMethodChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$PerformBookingRedirect;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$Progress;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$PromoCodeChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$RefundToggleChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ScrollToItem;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ShowErrorInSnackbar;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ShowRetroBadgeHint;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ShowSnackbar;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$UpdateInputs;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BookingFormInternalAction extends n {

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$BonusesChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BonusesChanged implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final C24185a f281792b;

        public BonusesChanged(@l C24185a c24185a) {
            this.f281792b = c24185a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BonusesChanged) && L.f(this.f281792b, ((BonusesChanged) obj).f281792b);
        }

        public final int hashCode() {
            C24185a c24185a = this.f281792b;
            if (c24185a == null) {
                return 0;
            }
            return c24185a.hashCode();
        }

        @k
        public final String toString() {
            return "BonusesChanged(data=" + this.f281792b + ')';
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$CloseScreen;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f281793b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1517681142;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ContentError;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentError implements BookingFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f281794b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f281795c;

        public ContentError(@k ApiError apiError) {
            this.f281794b = apiError;
            this.f281795c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF81612d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentError) && L.f(this.f281794b, ((ContentError) obj).f281794b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF81591c() {
            return this.f281795c;
        }

        public final int hashCode() {
            return this.f281794b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("ContentError(error="), this.f281794b, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ContentLoaded;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements BookingFormInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C24186b f281796b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f281797c;

        public ContentLoaded(@k C24186b c24186b, @k ArrayList arrayList) {
            this.f281796b = c24186b;
            this.f281797c = arrayList;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF81612d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentLoaded)) {
                return false;
            }
            ContentLoaded contentLoaded = (ContentLoaded) obj;
            return this.f281796b.equals(contentLoaded.f281796b) && this.f281797c.equals(contentLoaded.f281797c);
        }

        public final int hashCode() {
            return this.f281797c.hashCode() + (this.f281796b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentLoaded(formData=");
            sb2.append(this.f281796b);
            sb2.append(", pages=");
            return e.p(sb2, this.f281797c, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ContentLoading;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContentLoading extends TrackableLoadingStarted implements BookingFormInternalAction {
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$DateRangeChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DateRangeChanged implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f281798b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Date f281799c;

        public DateRangeChanged(@k Date date, @k Date date2) {
            this.f281798b = date;
            this.f281799c = date2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateRangeChanged)) {
                return false;
            }
            DateRangeChanged dateRangeChanged = (DateRangeChanged) obj;
            return L.f(this.f281798b, dateRangeChanged.f281798b) && L.f(this.f281799c, dateRangeChanged.f281799c);
        }

        public final int hashCode() {
            return this.f281799c.hashCode() + (this.f281798b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DateRangeChanged(checkInDate=");
            sb2.append(this.f281798b);
            sb2.append(", checkOutDate=");
            return f.n(sb2, this.f281799c, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$GuestsSelectionChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class GuestsSelectionChanged implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C24188d f281800b;

        public GuestsSelectionChanged(@k C24188d c24188d) {
            this.f281800b = c24188d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GuestsSelectionChanged) && L.f(this.f281800b, ((GuestsSelectionChanged) obj).f281800b);
        }

        public final int hashCode() {
            return this.f281800b.hashCode();
        }

        @k
        public final String toString() {
            return "GuestsSelectionChanged(guestsData=" + this.f281800b + ')';
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$HideKeyboard;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HideKeyboard implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final HideKeyboard f281801b = new HideKeyboard();

        private HideKeyboard() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof HideKeyboard);
        }

        public final int hashCode() {
            return 681193091;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$MoveToPage;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MoveToPage implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final long f281802b;

        public MoveToPage(long j12) {
            this.f281802b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MoveToPage) && this.f281802b == ((MoveToPage) obj).f281802b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f281802b);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("MoveToPage(newPageId="), this.f281802b, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$OpenDeepLink;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeepLink implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f281803b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f281804c;

        public OpenDeepLink(DeepLink deepLink, Bundle bundle, int i12, C42822w c42822w) {
            bundle = (i12 & 2) != 0 ? null : bundle;
            this.f281803b = deepLink;
            this.f281804c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenDeepLink)) {
                return false;
            }
            OpenDeepLink openDeepLink = (OpenDeepLink) obj;
            return L.f(this.f281803b, openDeepLink.f281803b) && L.f(this.f281804c, openDeepLink.f281804c);
        }

        public final int hashCode() {
            int iHashCode = this.f281803b.hashCode() * 31;
            Bundle bundle = this.f281804c;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f281803b);
            sb2.append(", bundle=");
            return H.m(sb2, this.f281804c, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$PaymentByUrl;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentByUrl implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f281805b;

        public PaymentByUrl(@l String str) {
            this.f281805b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentByUrl) && L.f(this.f281805b, ((PaymentByUrl) obj).f281805b);
        }

        public final int hashCode() {
            String str = this.f281805b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentByUrl(url="), this.f281805b, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$PaymentMethodChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentMethodChanged implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281806b;

        public PaymentMethodChanged(@k String str) {
            this.f281806b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentMethodChanged) && L.f(this.f281806b, ((PaymentMethodChanged) obj).f281806b);
        }

        public final int hashCode() {
            return this.f281806b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentMethodChanged(paymentType="), this.f281806b, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$PerformBookingRedirect;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PerformBookingRedirect implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f281807b;

        public PerformBookingRedirect(@k DeepLink deepLink) {
            this.f281807b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PerformBookingRedirect) && L.f(this.f281807b, ((PerformBookingRedirect) obj).f281807b);
        }

        public final int hashCode() {
            return this.f281807b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("PerformBookingRedirect(deepLink="), this.f281807b, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$Progress;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Hide", "Show", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$Progress$Hide;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$Progress$Show;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Progress extends BookingFormInternalAction {

        /* compiled from: BookingFormInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$Progress$Hide;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$Progress;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Hide implements Progress {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Hide f281808b = new Hide();

            private Hide() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Hide);
            }

            public final int hashCode() {
                return 1691592841;
            }

            @k
            public final String toString() {
                return "Hide";
            }
        }

        /* compiled from: BookingFormInternalAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$Progress$Show;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$Progress;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Show implements Progress {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Show f281809b = new Show();

            private Show() {
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Show);
            }

            public final int hashCode() {
                return 1691919940;
            }

            @k
            public final String toString() {
                return "Show";
            }
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$PromoCodeChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PromoCodeChanged implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281810b;

        public PromoCodeChanged(@k String str) {
            this.f281810b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromoCodeChanged) && L.f(this.f281810b, ((PromoCodeChanged) obj).f281810b);
        }

        public final int hashCode() {
            return this.f281810b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PromoCodeChanged(promoCode="), this.f281810b, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$RefundToggleChanged;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RefundToggleChanged implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f281811b;

        public RefundToggleChanged(boolean z12) {
            this.f281811b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RefundToggleChanged) && this.f281811b == ((RefundToggleChanged) obj).f281811b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f281811b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RefundToggleChanged(nonRefundableDiscountEnable="), this.f281811b, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ScrollToItem;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToItem implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f281812b;

        /* renamed from: c, reason: collision with root package name */
        public final int f281813c;

        public ScrollToItem(int i12, int i13) {
            this.f281812b = i12;
            this.f281813c = i13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScrollToItem)) {
                return false;
            }
            ScrollToItem scrollToItem = (ScrollToItem) obj;
            return this.f281812b == scrollToItem.f281812b && this.f281813c == scrollToItem.f281813c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f281813c) + (Integer.hashCode(this.f281812b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ScrollToItem(pageIndex=");
            sb2.append(this.f281812b);
            sb2.append(", itemPosition=");
            return r.t(sb2, this.f281813c, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ShowErrorInSnackbar;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorInSnackbar implements BookingFormInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f281814b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ApiError f281815c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final J.a f281816d;

        public ShowErrorInSnackbar(@k PrintableText printableText, @k ApiError apiError) {
            this.f281814b = printableText;
            this.f281815c = apiError;
            this.f281816d = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF81612d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF185111s() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowErrorInSnackbar)) {
                return false;
            }
            ShowErrorInSnackbar showErrorInSnackbar = (ShowErrorInSnackbar) obj;
            return L.f(this.f281814b, showErrorInSnackbar.f281814b) && L.f(this.f281815c, showErrorInSnackbar.f281815c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF81591c() {
            return this.f281816d;
        }

        public final int hashCode() {
            return this.f281815c.hashCode() + (this.f281814b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorInSnackbar(message=");
            sb2.append(this.f281814b);
            sb2.append(", error=");
            return c.n(sb2, this.f281815c, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ShowRetroBadgeHint;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowRetroBadgeHint implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RetroBadgeItemHint f281817b;

        public ShowRetroBadgeHint(@k RetroBadgeItemHint retroBadgeItemHint) {
            this.f281817b = retroBadgeItemHint;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowRetroBadgeHint) && L.f(this.f281817b, ((ShowRetroBadgeHint) obj).f281817b);
        }

        public final int hashCode() {
            return this.f281817b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowRetroBadgeHint(retroBadgeHint=" + this.f281817b + ')';
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$UpdateInputs;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateInputs implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Map<String, aw0.e> f281821b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<String, String> f281822c;

        public UpdateInputs(@k Map<String, aw0.e> map, @k Map<String, String> map2) {
            this.f281821b = map;
            this.f281822c = map2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateInputs)) {
                return false;
            }
            UpdateInputs updateInputs = (UpdateInputs) obj;
            return L.f(this.f281821b, updateInputs.f281821b) && L.f(this.f281822c, updateInputs.f281822c);
        }

        public final int hashCode() {
            return this.f281822c.hashCode() + (this.f281821b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateInputs(inputs=");
            sb2.append(this.f281821b);
            sb2.append(", inputsErrorMessages=");
            return r.w(sb2, this.f281822c, ')');
        }
    }

    /* compiled from: BookingFormInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction$ShowSnackbar;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowSnackbar implements BookingFormInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f281818b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final com.avito.android.component.toast.f f281819c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f281820d;

        public ShowSnackbar(@k PrintableText printableText, @k com.avito.android.component.toast.f fVar, boolean z12) {
            this.f281818b = printableText;
            this.f281819c = fVar;
            this.f281820d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowSnackbar)) {
                return false;
            }
            ShowSnackbar showSnackbar = (ShowSnackbar) obj;
            return L.f(this.f281818b, showSnackbar.f281818b) && L.f(this.f281819c, showSnackbar.f281819c) && this.f281820d == showSnackbar.f281820d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f281820d) + ((this.f281819c.hashCode() + (this.f281818b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowSnackbar(message=");
            sb2.append(this.f281818b);
            sb2.append(", type=");
            sb2.append(this.f281819c);
            sb2.append(", performHapticFeedback=");
            return r.x(sb2, this.f281820d, ')');
        }

        public /* synthetic */ ShowSnackbar(PrintableText printableText, com.avito.android.component.toast.f fVar, boolean z12, int i12, C42822w c42822w) {
            this(printableText, fVar, (i12 & 4) != 0 ? false : z12);
        }
    }
}
