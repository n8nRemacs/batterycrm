package com.avito.android.competitor_analytics.domain.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChartType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/model/ChartType;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChartType {

    /* renamed from: b, reason: collision with root package name */
    public static final ChartType f124330b;

    /* renamed from: c, reason: collision with root package name */
    public static final ChartType f124331c;

    /* renamed from: d, reason: collision with root package name */
    public static final ChartType f124332d;

    /* renamed from: e, reason: collision with root package name */
    public static final ChartType f124333e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ChartType[] f124334f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f124335g;

    static {
        ChartType chartType = new ChartType("MONEY", 0);
        f124330b = chartType;
        ChartType chartType2 = new ChartType("CONVERSION", 1);
        f124331c = chartType2;
        ChartType chartType3 = new ChartType("BONUS", 2);
        f124332d = chartType3;
        ChartType chartType4 = new ChartType("REGULAR", 3);
        f124333e = chartType4;
        ChartType[] chartTypeArr = {chartType, chartType2, chartType3, chartType4};
        f124334f = chartTypeArr;
        f124335g = c.a(chartTypeArr);
    }

    public ChartType() {
        throw null;
    }

    public static ChartType valueOf(String str) {
        return (ChartType) Enum.valueOf(ChartType.class, str);
    }

    public static ChartType[] values() {
        return (ChartType[]) f124334f.clone();
    }
}
