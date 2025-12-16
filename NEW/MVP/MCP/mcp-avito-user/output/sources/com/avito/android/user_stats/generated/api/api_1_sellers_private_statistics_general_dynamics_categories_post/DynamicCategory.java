package com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_categories_post;

import WJ0.b;
import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsCategoriesPostResponse.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001 BG\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/DynamicCategory;", "", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "LWJ0/c;", "event", "", "id", "LWJ0/b;", "metrics", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/DynamicCategory$Status;", "status", "", "title", "<init>", "(Ljava/util/List;LWJ0/c;JLjava/util/List;Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/DynamicCategory$Status;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "LWJ0/c;", "getEvent", "()LWJ0/c;", "J", "b", "()J", "c", "Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/DynamicCategory$Status;", "getStatus", "()Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/DynamicCategory$Status;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Status", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DynamicCategory {

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<DynamicCategory> children;

    @c("event")
    @k
    private final WJ0.c event;

    @c("id")
    private final long id;

    @c("metrics")
    @k
    private final List<b> metrics;

    @c("status")
    @l
    private final Status status;

    @c("title")
    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsCategoriesPostResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_categories_post/DynamicCategory$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Normal", "Deleted", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        @c("deleted")
        public static final Status Deleted;

        @c(Constants.NORMAL)
        public static final Status Normal;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f318269b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f318270c;

        static {
            Status status = new Status("Normal", 0, Constants.NORMAL);
            Normal = status;
            Status status2 = new Status("Deleted", 1, "deleted");
            Deleted = status2;
            Status[] statusArr = {status, status2};
            f318269b = statusArr;
            f318270c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f318269b.clone();
        }
    }

    public DynamicCategory(@l List<DynamicCategory> list, @k WJ0.c cVar, long j12, @k List<b> list2, @l Status status, @k String str) {
        this.children = list;
        this.event = cVar;
        this.id = j12;
        this.metrics = list2;
        this.status = status;
        this.title = str;
    }

    @l
    public final List<DynamicCategory> a() {
        return this.children;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    public final List<b> c() {
        return this.metrics;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
