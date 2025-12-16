package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PositionInfoPeriodAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PositionInfoPeriodAction;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PositionInfoPeriodAction {

    /* renamed from: b, reason: collision with root package name */
    public static final PositionInfoPeriodAction f220478b;

    /* renamed from: c, reason: collision with root package name */
    public static final PositionInfoPeriodAction f220479c;

    /* renamed from: d, reason: collision with root package name */
    public static final PositionInfoPeriodAction f220480d;

    /* renamed from: e, reason: collision with root package name */
    public static final PositionInfoPeriodAction f220481e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ PositionInfoPeriodAction[] f220482f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f220483g;

    static {
        PositionInfoPeriodAction positionInfoPeriodAction = new PositionInfoPeriodAction("INIT", 0);
        f220478b = positionInfoPeriodAction;
        PositionInfoPeriodAction positionInfoPeriodAction2 = new PositionInfoPeriodAction("PERIOD_CHANGE", 1);
        f220479c = positionInfoPeriodAction2;
        PositionInfoPeriodAction positionInfoPeriodAction3 = new PositionInfoPeriodAction("QUERIES_PORTION", 2);
        f220480d = positionInfoPeriodAction3;
        PositionInfoPeriodAction positionInfoPeriodAction4 = new PositionInfoPeriodAction("QUERIES_SORTING", 3);
        f220481e = positionInfoPeriodAction4;
        PositionInfoPeriodAction[] positionInfoPeriodActionArr = {positionInfoPeriodAction, positionInfoPeriodAction2, positionInfoPeriodAction3, positionInfoPeriodAction4};
        f220482f = positionInfoPeriodActionArr;
        f220483g = c.a(positionInfoPeriodActionArr);
    }

    public PositionInfoPeriodAction() {
        throw null;
    }

    public static PositionInfoPeriodAction valueOf(String str) {
        return (PositionInfoPeriodAction) Enum.valueOf(PositionInfoPeriodAction.class, str);
    }

    public static PositionInfoPeriodAction[] values() {
        return (PositionInfoPeriodAction[]) f220482f.clone();
    }
}
