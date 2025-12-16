package com.avito.android.wallet.history.generated.api.get_wallet_history_v_2;

import EO0.d;
import EO0.e;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetWalletHistoryV2Response.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001:\u0002%&BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b!\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2;", "", "", DeliverySubsidiesSlotKt.AMOUNT, "date", "detailsDeeplink", "LEO0/d;", "events", "id", "LEO0/e;", "image", "Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Status;", "status", "text", "Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Type;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LEO0/d;Ljava/lang/String;LEO0/e;Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Status;Ljava/lang/String;Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "LEO0/d;", "d", "()LEO0/d;", "e", "LEO0/e;", "f", "()LEO0/e;", "Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Status;", "g", "()Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Status;", "h", "Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Type;", "i", "()Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Type;", "Status", "Type", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HistoryItemV2 {

    @c(DeliverySubsidiesSlotKt.AMOUNT)
    @l
    private final String amount;

    @c("date")
    @l
    private final String date;

    @c("details_deeplink")
    @l
    private final String detailsDeeplink;

    @c("events")
    @k
    private final d events;

    @c("id")
    @k
    private final String id;

    @c("image")
    @l
    private final e image;

    @c("status")
    @l
    private final Status status;

    @c("text")
    @k
    private final String text;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetWalletHistoryV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Success", "Failed", "Pending", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c(PaymentStateKt.PAYMENT_STATE_FAILED)
        public static final Status Failed;

        @c("pending")
        public static final Status Pending;

        @c("success")
        public static final Status Success;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f327530b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f327531c;

        static {
            Status status = new Status("Success", 0, "success");
            Success = status;
            Status status2 = new Status("Failed", 1, PaymentStateKt.PAYMENT_STATE_FAILED);
            Failed = status2;
            Status status3 = new Status("Pending", 2, "pending");
            Pending = status3;
            Status[] statusArr = {status, status2, status3};
            f327530b = statusArr;
            f327531c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f327530b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetWalletHistoryV2Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/wallet/history/generated/api/get_wallet_history_v_2/HistoryItemV2$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Operation", "Info", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c(RequestReviewResultKt.INFO_TYPE)
        public static final Type Info;

        @c("operation")
        public static final Type Operation;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f327532b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f327533c;

        static {
            Type type = new Type("Operation", 0, "operation");
            Operation = type;
            Type type2 = new Type("Info", 1, RequestReviewResultKt.INFO_TYPE);
            Info = type2;
            Type[] typeArr = {type, type2};
            f327532b = typeArr;
            f327533c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f327532b.clone();
        }
    }

    public HistoryItemV2(@l String str, @l String str2, @l String str3, @k d dVar, @k String str4, @l e eVar, @l Status status, @k String str5, @k Type type) {
        this.amount = str;
        this.date = str2;
        this.detailsDeeplink = str3;
        this.events = dVar;
        this.id = str4;
        this.image = eVar;
        this.status = status;
        this.text = str5;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDetailsDeeplink() {
        return this.detailsDeeplink;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final d getEvents() {
        return this.events;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final e getImage() {
        return this.image;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
