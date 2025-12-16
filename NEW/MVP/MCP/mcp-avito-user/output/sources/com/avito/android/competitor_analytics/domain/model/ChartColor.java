package com.avito.android.competitor_analytics.domain.model;

import W2.l;
import W2.n;
import com.akita.compose.theme.re23.b;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChartColor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/domain/model/ChartColor;", "", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChartColor {

    /* renamed from: c, reason: collision with root package name */
    public static final ChartColor f124323c;

    /* renamed from: d, reason: collision with root package name */
    public static final ChartColor f124324d;

    /* renamed from: e, reason: collision with root package name */
    public static final ChartColor f124325e;

    /* renamed from: f, reason: collision with root package name */
    public static final ChartColor f124326f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ChartColor[] f124327g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f124328h;

    /* renamed from: b, reason: collision with root package name */
    public final long f124329b;

    static {
        b.f63983a.getClass();
        com.akita.compose.theme.re23.semantic.b bVar = b.f63987e;
        bVar.getClass();
        n nVar = com.akita.compose.theme.re23.semantic.b.f65955c;
        nVar.getClass();
        l lVar = n.f17714b;
        lVar.getClass();
        ChartColor chartColor = new ChartColor("GREEN", 0, l.f17656g.f17680c);
        f124323c = chartColor;
        bVar.getClass();
        nVar.getClass();
        lVar.getClass();
        ChartColor chartColor2 = new ChartColor("VIOLET", 1, l.f17654e.f17695c);
        f124324d = chartColor2;
        bVar.getClass();
        nVar.getClass();
        lVar.getClass();
        ChartColor chartColor3 = new ChartColor("BLUE", 2, l.f17653d.f17659b);
        f124325e = chartColor3;
        bVar.getClass();
        nVar.getClass();
        lVar.getClass();
        ChartColor chartColor4 = new ChartColor("ORANGE", 3, l.f17657h.f17684b);
        f124326f = chartColor4;
        ChartColor[] chartColorArr = {chartColor, chartColor2, chartColor3, chartColor4};
        f124327g = chartColorArr;
        f124328h = c.a(chartColorArr);
    }

    public ChartColor(String str, int i12, long j12) {
        this.f124329b = j12;
    }

    public static ChartColor valueOf(String str) {
        return (ChartColor) Enum.valueOf(ChartColor.class, str);
    }

    public static ChartColor[] values() {
        return (ChartColor[]) f124327g.clone();
    }
}
