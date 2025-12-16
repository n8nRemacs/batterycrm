package com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerRecallInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "OpenUrl", "SelectReason", "SubmitSuccess", "UpdateComment", "UpdatePhone", "ValidationPhoneFailure", "ValidationReasonFailure", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$Close;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$OpenUrl;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$SelectReason;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$SubmitSuccess;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$UpdateComment;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$UpdatePhone;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$ValidationPhoneFailure;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$ValidationReasonFailure;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface SellerRecallInternalAction extends n {

    /* compiled from: SellerRecallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$Close;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements SellerRecallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f119988b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 6839728;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: SellerRecallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$OpenUrl;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements SellerRecallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f119989b;

        public OpenUrl(@k String str) {
            this.f119989b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && L.f(this.f119989b, ((OpenUrl) obj).f119989b);
        }

        public final int hashCode() {
            return this.f119989b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f119989b, ')');
        }
    }

    /* compiled from: SellerRecallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$SelectReason;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SelectReason implements SellerRecallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f119990b;

        public SelectReason(@k String str) {
            this.f119990b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectReason) && L.f(this.f119990b, ((SelectReason) obj).f119990b);
        }

        public final int hashCode() {
            return this.f119990b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectReason(reason="), this.f119990b, ')');
        }
    }

    /* compiled from: SellerRecallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$SubmitSuccess;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SubmitSuccess implements SellerRecallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SubmitSuccess f119991b = new SubmitSuccess();

        private SubmitSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SubmitSuccess);
        }

        public final int hashCode() {
            return 518591619;
        }

        @k
        public final String toString() {
            return "SubmitSuccess";
        }
    }

    /* compiled from: SellerRecallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$UpdateComment;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateComment implements SellerRecallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f119992b;

        public UpdateComment(@k String str) {
            this.f119992b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateComment) && L.f(this.f119992b, ((UpdateComment) obj).f119992b);
        }

        public final int hashCode() {
            return this.f119992b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateComment(text="), this.f119992b, ')');
        }
    }

    /* compiled from: SellerRecallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$UpdatePhone;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdatePhone implements SellerRecallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f119993b;

        public UpdatePhone(@k String str) {
            this.f119993b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdatePhone) && L.f(this.f119993b, ((UpdatePhone) obj).f119993b);
        }

        public final int hashCode() {
            return this.f119993b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePhone(text="), this.f119993b, ')');
        }
    }

    /* compiled from: SellerRecallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$ValidationPhoneFailure;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidationPhoneFailure implements SellerRecallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ValidationPhoneFailure f119994b = new ValidationPhoneFailure();

        private ValidationPhoneFailure() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ValidationPhoneFailure);
        }

        public final int hashCode() {
            return -1641624931;
        }

        @k
        public final String toString() {
            return "ValidationPhoneFailure";
        }
    }

    /* compiled from: SellerRecallInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction$ValidationReasonFailure;", "Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallInternalAction;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidationReasonFailure implements SellerRecallInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ValidationReasonFailure f119995b = new ValidationReasonFailure();

        private ValidationReasonFailure() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ValidationReasonFailure);
        }

        public final int hashCode() {
            return -246474651;
        }

        @k
        public final String toString() {
            return "ValidationReasonFailure";
        }
    }
}
