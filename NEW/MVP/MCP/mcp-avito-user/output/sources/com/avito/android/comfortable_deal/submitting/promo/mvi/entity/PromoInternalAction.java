package com.avito.android.comfortable_deal.submitting.promo.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rp.C47704g;

/* compiled from: PromoInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "Error", "Loading", "NavigateBack", "PhoneInputChanged", "ScrollToTop", "Success", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$ContentLoaded;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$Error;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$Loading;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$NavigateBack;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$PhoneInputChanged;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$ScrollToTop;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$Success;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PromoInternalAction extends n {

    /* compiled from: PromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$ContentLoaded;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements PromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47704g f123180b;

        public ContentLoaded(@k C47704g c47704g) {
            this.f123180b = c47704g;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f123180b, ((ContentLoaded) obj).f123180b);
        }

        public final int hashCode() {
            return this.f123180b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(content=" + this.f123180b + ')';
        }
    }

    /* compiled from: PromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$Error;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements PromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123181b;

        public Error(@k String str) {
            this.f123181b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f123181b, ((Error) obj).f123181b);
        }

        public final int hashCode() {
            return this.f123181b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(error="), this.f123181b, ')');
        }
    }

    /* compiled from: PromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$Loading;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading implements PromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f123182b = new Loading();

        private Loading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1369965924;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$NavigateBack;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements PromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f123183b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return -865034088;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: PromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$PhoneInputChanged;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneInputChanged implements PromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123184b;

        public PhoneInputChanged(@k String str) {
            this.f123184b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneInputChanged) && L.f(this.f123184b, ((PhoneInputChanged) obj).f123184b);
        }

        public final int hashCode() {
            return this.f123184b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneInputChanged(newValue="), this.f123184b, ')');
        }
    }

    /* compiled from: PromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$ScrollToTop;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToTop implements PromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ScrollToTop f123185b = new ScrollToTop();

        private ScrollToTop() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ScrollToTop);
        }

        public final int hashCode() {
            return -19255443;
        }

        @k
        public final String toString() {
            return "ScrollToTop";
        }
    }

    /* compiled from: PromoInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction$Success;", "Lcom/avito/android/comfortable_deal/submitting/promo/mvi/entity/PromoInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements PromoInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Success f123186b = new Success();

        private Success() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 721181027;
        }

        @k
        public final String toString() {
            return "Success";
        }
    }
}
