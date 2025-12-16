package com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ApiGetAutoDispatchesV1Response.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0001!BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchOut;", "", "", "budgetLeft", "budgetTotal", "createdAt", "expiresAt", "id", "", "Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchItemOut;", "items", "", "offer", "Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchOut$Status;", "status", "<init>", "(JJJJJLjava/util/List;Ljava/lang/String;Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchOut$Status;)V", "J", "a", "()J", "b", "c", "d", "e", "Ljava/util/List;", "f", "()Ljava/util/List;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchOut$Status;", "h", "()Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchOut$Status;", "Status", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoDispatchOut {

    @c("budgetLeft")
    private final long budgetLeft;

    @c("budgetTotal")
    private final long budgetTotal;

    @c("createdAt")
    private final long createdAt;

    @c("expiresAt")
    private final long expiresAt;

    @c("id")
    private final long id;

    @c("items")
    @k
    private final List<AutoDispatchItemOut> items;

    @c("offer")
    @k
    private final String offer;

    @c("status")
    @k
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ApiGetAutoDispatchesV1Response.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/sbc/generated/api/api_get_auto_dispatches_v_1/AutoDispatchOut$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Created", "Active", "Inactive", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("active")
        public static final Status Active;

        @c("created")
        public static final Status Created;

        @c("inactive")
        public static final Status Inactive;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Status[] f260176c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f260177d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f260178b;

        static {
            Status status = new Status("Created", 0, "created");
            Created = status;
            Status status2 = new Status("Active", 1, "active");
            Active = status2;
            Status status3 = new Status("Inactive", 2, "inactive");
            Inactive = status3;
            Status[] statusArr = {status, status2, status3};
            f260176c = statusArr;
            f260177d = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
            this.f260178b = str2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f260176c.clone();
        }
    }

    public AutoDispatchOut(long j12, long j13, long j14, long j15, long j16, @k List<AutoDispatchItemOut> list, @k String str, @k Status status) {
        this.budgetLeft = j12;
        this.budgetTotal = j13;
        this.createdAt = j14;
        this.expiresAt = j15;
        this.id = j16;
        this.items = list;
        this.offer = str;
        this.status = status;
    }

    /* renamed from: a, reason: from getter */
    public final long getBudgetLeft() {
        return this.budgetLeft;
    }

    /* renamed from: b, reason: from getter */
    public final long getBudgetTotal() {
        return this.budgetTotal;
    }

    /* renamed from: c, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: d, reason: from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    public final List<AutoDispatchItemOut> f() {
        return this.items;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getOffer() {
        return this.offer;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }
}
