package com.avito.android.competitor_analytics.generated.api.api_2_competitor_analytics_general;

import Y61.k;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Api2CompetitorAnalyticsGeneralRequest.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/competitor_analytics/generated/api/api_2_competitor_analytics_general/State;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Default", "Day", "Week", "Month", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class State {

    @c(SelectionType.TYPE_DAY)
    public static final State Day;

    @c("default")
    public static final State Default;

    @c(SelectionType.TYPE_MONTH)
    public static final State Month;

    @c("week")
    public static final State Week;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ State[] f124385c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f124386d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f124387b;

    static {
        State state = new State("Default", 0, "default");
        Default = state;
        State state2 = new State("Day", 1, SelectionType.TYPE_DAY);
        Day = state2;
        State state3 = new State("Week", 2, "week");
        Week = state3;
        State state4 = new State("Month", 3, SelectionType.TYPE_MONTH);
        Month = state4;
        State[] stateArr = {state, state2, state3, state4};
        f124385c = stateArr;
        f124386d = kotlin.enums.c.a(stateArr);
    }

    private State(String str, int i12, String str2) {
        this.f124387b = str2;
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) f124385c.clone();
    }

    @Override // java.lang.Enum
    @k
    public final String toString() {
        return this.f124387b.toString();
    }
}
