package com.avito.android.position_in_search.stats.generated.api.api_search_position_period_v_1;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiSearchPositionPeriodV1Request.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/position_in_search/stats/generated/api/api_search_position_period_v_1/ActionType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Init", "PeriodChange", "QueriesPortion", "QueriesSorting", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActionType {

    @c("init")
    public static final ActionType Init;

    @c("period-change")
    public static final ActionType PeriodChange;

    @c("queries-portion")
    public static final ActionType QueriesPortion;

    @c("queries-sorting")
    public static final ActionType QueriesSorting;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ActionType[] f220339c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f220340d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f220341b;

    static {
        ActionType actionType = new ActionType("Init", 0, "init");
        Init = actionType;
        ActionType actionType2 = new ActionType("PeriodChange", 1, "period-change");
        PeriodChange = actionType2;
        ActionType actionType3 = new ActionType("QueriesPortion", 2, "queries-portion");
        QueriesPortion = actionType3;
        ActionType actionType4 = new ActionType("QueriesSorting", 3, "queries-sorting");
        QueriesSorting = actionType4;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4};
        f220339c = actionTypeArr;
        f220340d = kotlin.enums.c.a(actionTypeArr);
    }

    private ActionType(String str, int i12, String str2) {
        this.f220341b = str2;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) f220339c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f220341b.toString();
    }
}
