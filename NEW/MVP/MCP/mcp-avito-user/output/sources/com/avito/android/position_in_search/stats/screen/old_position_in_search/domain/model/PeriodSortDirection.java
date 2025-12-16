package com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model;

import com.avito.android.R;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PeriodSortDirection.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/domain/model/PeriodSortDirection;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PeriodSortDirection {

    /* renamed from: c, reason: collision with root package name */
    public static final PeriodSortDirection f220409c;

    /* renamed from: d, reason: collision with root package name */
    public static final PeriodSortDirection f220410d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PeriodSortDirection[] f220411e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f220412f;

    /* renamed from: b, reason: collision with root package name */
    public final int f220413b;

    static {
        PeriodSortDirection periodSortDirection = new PeriodSortDirection("ASC", 0, R.attr.textIconArrowUp);
        f220409c = periodSortDirection;
        PeriodSortDirection periodSortDirection2 = new PeriodSortDirection("DESC", 1, R.attr.textIconArrowDown);
        f220410d = periodSortDirection2;
        PeriodSortDirection[] periodSortDirectionArr = {periodSortDirection, periodSortDirection2};
        f220411e = periodSortDirectionArr;
        f220412f = c.a(periodSortDirectionArr);
    }

    public PeriodSortDirection(String str, int i12, int i13) {
        this.f220413b = i13;
    }

    public static PeriodSortDirection valueOf(String str) {
        return (PeriodSortDirection) Enum.valueOf(PeriodSortDirection.class, str);
    }

    public static PeriodSortDirection[] values() {
        return (PeriodSortDirection[]) f220411e.clone();
    }
}
