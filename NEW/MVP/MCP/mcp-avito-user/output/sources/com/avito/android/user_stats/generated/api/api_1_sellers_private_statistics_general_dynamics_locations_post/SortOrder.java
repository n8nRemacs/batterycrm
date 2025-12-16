package com.avito.android.user_stats.generated.api.api_1_sellers_private_statistics_general_dynamics_locations_post;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api1SellersPrivateStatisticsGeneralDynamicsLocationsPostRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_1_sellers_private_statistics_general_dynamics_locations_post/SortOrder;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Asc", "Desc", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SortOrder {

    @c("asc")
    public static final SortOrder Asc;

    @c("desc")
    public static final SortOrder Desc;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SortOrder[] f318278c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f318279d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318280b;

    static {
        SortOrder sortOrder = new SortOrder("Asc", 0, "asc");
        Asc = sortOrder;
        SortOrder sortOrder2 = new SortOrder("Desc", 1, "desc");
        Desc = sortOrder2;
        SortOrder[] sortOrderArr = {sortOrder, sortOrder2};
        f318278c = sortOrderArr;
        f318279d = kotlin.enums.c.a(sortOrderArr);
    }

    private SortOrder(String str, int i12, String str2) {
        this.f318280b = str2;
    }

    public static SortOrder valueOf(String str) {
        return (SortOrder) Enum.valueOf(SortOrder.class, str);
    }

    public static SortOrder[] values() {
        return (SortOrder[]) f318278c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f318280b.toString();
    }
}
