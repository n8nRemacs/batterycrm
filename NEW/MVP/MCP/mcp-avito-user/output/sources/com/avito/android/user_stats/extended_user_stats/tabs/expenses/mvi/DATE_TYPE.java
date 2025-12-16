package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatsChartItemLegendHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/DATE_TYPE;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DATE_TYPE {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DATE_TYPE[] f317801b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f317802c;

    static {
        DATE_TYPE[] date_typeArr = {new DATE_TYPE("DAY", 0), new DATE_TYPE("WEEK", 1), new DATE_TYPE("MONTH", 2)};
        f317801b = date_typeArr;
        f317802c = kotlin.enums.c.a(date_typeArr);
    }

    public static DATE_TYPE valueOf(String str) {
        return (DATE_TYPE) Enum.valueOf(DATE_TYPE.class, str);
    }

    public static DATE_TYPE[] values() {
        return (DATE_TYPE[]) f317801b.clone();
    }
}
