package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExpensesTabState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/DataStatus;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DataStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final DataStatus f317808b;

    /* renamed from: c, reason: collision with root package name */
    public static final DataStatus f317809c;

    /* renamed from: d, reason: collision with root package name */
    public static final DataStatus f317810d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ DataStatus[] f317811e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f317812f;

    static {
        DataStatus dataStatus = new DataStatus("DATA", 0);
        f317808b = dataStatus;
        DataStatus dataStatus2 = new DataStatus("LOADING", 1);
        f317809c = dataStatus2;
        DataStatus dataStatus3 = new DataStatus("ERROR", 2);
        f317810d = dataStatus3;
        DataStatus[] dataStatusArr = {dataStatus, dataStatus2, dataStatus3};
        f317811e = dataStatusArr;
        f317812f = c.a(dataStatusArr);
    }

    public DataStatus() {
        throw null;
    }

    public static DataStatus valueOf(String str) {
        return (DataStatus) Enum.valueOf(DataStatus.class, str);
    }

    public static DataStatus[] values() {
        return (DataStatus[]) f317811e.clone();
    }
}
