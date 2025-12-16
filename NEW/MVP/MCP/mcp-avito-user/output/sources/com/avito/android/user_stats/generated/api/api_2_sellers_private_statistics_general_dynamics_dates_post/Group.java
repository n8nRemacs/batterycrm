package com.avito.android.user_stats.generated.api.api_2_sellers_private_statistics_general_dynamics_dates_post;

import Y61.k;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api2SellersPrivateStatisticsGeneralDynamicsDatesPostRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_stats/generated/api/api_2_sellers_private_statistics_general_dynamics_dates_post/Group;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Day", "Week", "Month", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Group {

    @c(SelectionType.TYPE_DAY)
    public static final Group Day;

    @c(SelectionType.TYPE_MONTH)
    public static final Group Month;

    @c("week")
    public static final Group Week;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Group[] f318290c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f318291d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f318292b;

    static {
        Group group = new Group("Day", 0, SelectionType.TYPE_DAY);
        Day = group;
        Group group2 = new Group("Week", 1, "week");
        Week = group2;
        Group group3 = new Group("Month", 2, SelectionType.TYPE_MONTH);
        Month = group3;
        Group[] groupArr = {group, group2, group3};
        f318290c = groupArr;
        f318291d = kotlin.enums.c.a(groupArr);
    }

    private Group(String str, int i12, String str2) {
        this.f318292b = str2;
    }

    public static Group valueOf(String str) {
        return (Group) Enum.valueOf(Group.class, str);
    }

    public static Group[] values() {
        return (Group[]) f318290c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f318292b.toString();
    }
}
