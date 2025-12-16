package com.avito.android.gig.payment_list.generated.api.get_gig_worker_payments;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.payment.PaymentMethodTypeKt;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import fG.C40286a;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetGigWorkerPaymentsResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0002\u001e\u001fBK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem;", "", "LfG/a;", "action", "Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Icon;", "icon", "", "logoUrl", "Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Status;", "status", "subtitle", "title", "trailingText", "<init>", "(LfG/a;Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Icon;Ljava/lang/String;Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LfG/a;", "a", "()LfG/a;", "Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Icon;", "b", "()Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Icon;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Status;", "d", "()Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Status;", "e", "f", "g", "Icon", "Status", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem {

    @c("action")
    @l
    private final C40286a action;

    @c("icon")
    @l
    private final Icon icon;

    @c("logoUrl")
    @l
    private final String logoUrl;

    @c("status")
    @l
    private final Status status;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("trailingText")
    @l
    private final String trailingText;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetGigWorkerPaymentsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Icon;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Sbp", "Card", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Icon {

        @c(PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD)
        public static final Icon Card;

        @c("sbp")
        public static final Icon Sbp;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Icon[] f159436b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159437c;

        static {
            Icon icon = new Icon("Sbp", 0, "sbp");
            Sbp = icon;
            Icon icon2 = new Icon("Card", 1, PaymentMethodTypeKt.PAYMENT_METHOD_TYPE_CARD);
            Card = icon2;
            Icon[] iconArr = {icon, icon2};
            f159436b = iconArr;
            f159437c = kotlin.enums.c.a(iconArr);
        }

        private Icon(String str, int i12, String str2) {
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) f159436b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetGigWorkerPaymentsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/gig/payment_list/generated/api/get_gig_worker_payments/GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Normal", "Failed", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c(PaymentStateKt.PAYMENT_STATE_FAILED)
        public static final Status Failed;

        @c(Constants.NORMAL)
        public static final Status Normal;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f159438b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f159439c;

        static {
            Status status = new Status("Normal", 0, Constants.NORMAL);
            Normal = status;
            Status status2 = new Status("Failed", 1, PaymentStateKt.PAYMENT_STATE_FAILED);
            Failed = status2;
            Status[] statusArr = {status, status2};
            f159438b = statusArr;
            f159439c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f159438b.clone();
        }
    }

    public GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem(@l C40286a c40286a, @l Icon icon, @l String str, @l Status status, @l String str2, @k String str3, @l String str4) {
        this.action = c40286a;
        this.icon = icon;
        this.logoUrl = str;
        this.status = status;
        this.subtitle = str2;
        this.title = str3;
        this.trailingText = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C40286a getAction() {
        return this.action;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getTrailingText() {
        return this.trailingText;
    }
}
