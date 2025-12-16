package com.avito.android.competitor_analytics.domain.model;

import Y61.k;
import com.avito.android.remote.model.category_parameters.SelectionType;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StateType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/model/StateType;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StateType {

    /* renamed from: c, reason: collision with root package name */
    public static final StateType f124336c;

    /* renamed from: d, reason: collision with root package name */
    public static final StateType f124337d;

    /* renamed from: e, reason: collision with root package name */
    public static final StateType f124338e;

    /* renamed from: f, reason: collision with root package name */
    public static final StateType f124339f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ StateType[] f124340g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f124341h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f124342b;

    static {
        StateType stateType = new StateType("DEFAULT", 0, "default");
        f124336c = stateType;
        StateType stateType2 = new StateType("DAY", 1, SelectionType.TYPE_DAY);
        f124337d = stateType2;
        StateType stateType3 = new StateType("WEEK", 2, "week");
        f124338e = stateType3;
        StateType stateType4 = new StateType("MONTH", 3, SelectionType.TYPE_MONTH);
        f124339f = stateType4;
        StateType[] stateTypeArr = {stateType, stateType2, stateType3, stateType4};
        f124340g = stateTypeArr;
        f124341h = c.a(stateTypeArr);
    }

    public StateType(String str, int i12, String str2) {
        this.f124342b = str2;
    }

    public static StateType valueOf(String str) {
        return (StateType) Enum.valueOf(StateType.class, str);
    }

    public static StateType[] values() {
        return (StateType[]) f124340g.clone();
    }
}
