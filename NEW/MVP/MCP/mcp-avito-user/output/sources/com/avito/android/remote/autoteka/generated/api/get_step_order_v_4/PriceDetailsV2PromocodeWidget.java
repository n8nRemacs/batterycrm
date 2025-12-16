package com.avito.android.remote.autoteka.generated.api.get_step_order_v_4;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetStepOrderV4Response.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0001\u0014B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget;", "", "", "hint", ChannelContext.Item.PLACEHOLDER, "promocode", "Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget$Status;", "status", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget$Status;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget$Status;", "d", "()Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget$Status;", "e", "Status", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PriceDetailsV2PromocodeWidget {

    @c("hint")
    @l
    private final String hint;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("promocode")
    @l
    private final String promocode;

    @c("status")
    @k
    private final Status status;

    @c("title")
    @l
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetStepOrderV4Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/autoteka/generated/api/get_step_order_v_4/PriceDetailsV2PromocodeWidget$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Initial", "Success", "Error", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("error")
        public static final Status Error;

        @c("initial")
        public static final Status Initial;

        @c("success")
        public static final Status Success;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f253279b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f253280c;

        static {
            Status status = new Status("Initial", 0, "initial");
            Initial = status;
            Status status2 = new Status("Success", 1, "success");
            Success = status2;
            Status status3 = new Status("Error", 2, "error");
            Error = status3;
            Status[] statusArr = {status, status2, status3};
            f253279b = statusArr;
            f253280c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f253279b.clone();
        }
    }

    public PriceDetailsV2PromocodeWidget(@l String str, @l String str2, @l String str3, @k Status status, @l String str4) {
        this.hint = str;
        this.placeholder = str2;
        this.promocode = str3;
        this.status = status;
        this.title = str4;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPromocode() {
        return this.promocode;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
