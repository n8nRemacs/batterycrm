package com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiGetAutoDispatchesV1Response.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001:\u0001!B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b \u0010\u0017¨\u0006\""}, d2 = {"Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchItemOut;", "", "", "budgetSpent", "chatsOpened", "", "img", "itemId", "messagesSent", "name", "price", "Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchItemOut$Status;", "status", "stopReason", "stopReasonText", "<init>", "(JJLjava/lang/String;JJLjava/lang/String;JLcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchItemOut$Status;Ljava/lang/String;Ljava/lang/String;)V", "J", "getBudgetSpent", "()J", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchItemOut$Status;", "g", "()Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchItemOut$Status;", "getStopReason", "getStopReasonText", "Status", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoDispatchItemOut {

    @c("budgetSpent")
    private final long budgetSpent;

    @c("chatsOpened")
    private final long chatsOpened;

    @c("img")
    @k
    private final String img;

    @c("itemId")
    private final long itemId;

    @c("messagesSent")
    private final long messagesSent;

    @c("name")
    @k
    private final String name;

    @c("price")
    private final long price;

    @c("status")
    @k
    private final Status status;

    @c("stopReason")
    @l
    private final String stopReason;

    @c("stopReasonText")
    @l
    private final String stopReasonText;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiGetAutoDispatchesV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchItemOut$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Created", "Active", "Inactive", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("active")
        public static final Status Active;

        @c("created")
        public static final Status Created;

        @c("inactive")
        public static final Status Inactive;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f260173b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f260174c;

        static {
            Status status = new Status("Created", 0, "created");
            Created = status;
            Status status2 = new Status("Active", 1, "active");
            Active = status2;
            Status status3 = new Status("Inactive", 2, "inactive");
            Inactive = status3;
            Status[] statusArr = {status, status2, status3};
            f260173b = statusArr;
            f260174c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f260173b.clone();
        }
    }

    public AutoDispatchItemOut(long j12, long j13, @k String str, long j14, long j15, @k String str2, long j16, @k Status status, @l String str3, @l String str4) {
        this.budgetSpent = j12;
        this.chatsOpened = j13;
        this.img = str;
        this.itemId = j14;
        this.messagesSent = j15;
        this.name = str2;
        this.price = j16;
        this.status = status;
        this.stopReason = str3;
        this.stopReasonText = str4;
    }

    /* renamed from: a, reason: from getter */
    public final long getChatsOpened() {
        return this.chatsOpened;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    /* renamed from: c, reason: from getter */
    public final long getItemId() {
        return this.itemId;
    }

    /* renamed from: d, reason: from getter */
    public final long getMessagesSent() {
        return this.messagesSent;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: f, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }
}
