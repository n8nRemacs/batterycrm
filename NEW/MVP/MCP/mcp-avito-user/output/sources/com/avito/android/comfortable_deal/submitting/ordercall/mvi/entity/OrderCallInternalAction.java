package com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rp.C47702e;

/* compiled from: OrderCallInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ContentLoaded", "NavigateBack", "PhoneInputCorrect", "PhoneInputError", "SendPhoneFailed", "SendPhoneLoading", "SendPhoneSuccess", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$ContentLoaded;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$NavigateBack;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$PhoneInputCorrect;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$PhoneInputError;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$SendPhoneFailed;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$SendPhoneLoading;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$SendPhoneSuccess;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface OrderCallInternalAction extends n {

    /* compiled from: OrderCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$ContentLoaded;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentLoaded implements OrderCallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C47702e f123065b;

        public ContentLoaded(@k C47702e c47702e) {
            this.f123065b = c47702e;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContentLoaded) && L.f(this.f123065b, ((ContentLoaded) obj).f123065b);
        }

        public final int hashCode() {
            return this.f123065b.hashCode();
        }

        @k
        public final String toString() {
            return "ContentLoaded(orderCallBody=" + this.f123065b + ')';
        }
    }

    /* compiled from: OrderCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$NavigateBack;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements OrderCallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NavigateBack f123066b = new NavigateBack();

        private NavigateBack() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NavigateBack);
        }

        public final int hashCode() {
            return 1440430936;
        }

        @k
        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: OrderCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$PhoneInputCorrect;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneInputCorrect implements OrderCallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123067b;

        public PhoneInputCorrect(@k String str) {
            this.f123067b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneInputCorrect) && L.f(this.f123067b, ((PhoneInputCorrect) obj).f123067b);
        }

        public final int hashCode() {
            return this.f123067b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneInputCorrect(newValue="), this.f123067b, ')');
        }
    }

    /* compiled from: OrderCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$PhoneInputError;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneInputError implements OrderCallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123068b;

        public PhoneInputError(@k String str) {
            this.f123068b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneInputError) && L.f(this.f123068b, ((PhoneInputError) obj).f123068b);
        }

        public final int hashCode() {
            return this.f123068b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneInputError(newValue="), this.f123068b, ')');
        }
    }

    /* compiled from: OrderCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$SendPhoneFailed;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendPhoneFailed implements OrderCallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f123069b;

        public SendPhoneFailed(@k String str) {
            this.f123069b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendPhoneFailed) && L.f(this.f123069b, ((SendPhoneFailed) obj).f123069b);
        }

        public final int hashCode() {
            return this.f123069b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SendPhoneFailed(error="), this.f123069b, ')');
        }
    }

    /* compiled from: OrderCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$SendPhoneLoading;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendPhoneLoading implements OrderCallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SendPhoneLoading f123070b = new SendPhoneLoading();

        private SendPhoneLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SendPhoneLoading);
        }

        public final int hashCode() {
            return 263039222;
        }

        @k
        public final String toString() {
            return "SendPhoneLoading";
        }
    }

    /* compiled from: OrderCallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction$SendPhoneSuccess;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendPhoneSuccess implements OrderCallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SendPhoneSuccess f123071b = new SendPhoneSuccess();

        private SendPhoneSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SendPhoneSuccess);
        }

        public final int hashCode() {
            return -1940781123;
        }

        @k
        public final String toString() {
            return "SendPhoneSuccess";
        }
    }
}
