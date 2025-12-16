package com.avito.android.serp.adapter.vertical_main.analytics;

import Y61.l;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WidgetPageSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/analytics/WidgetPageSource;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetPageSource {

    /* renamed from: c, reason: collision with root package name */
    public static final WidgetPageSource f272574c;

    /* renamed from: d, reason: collision with root package name */
    public static final WidgetPageSource f272575d;

    /* renamed from: e, reason: collision with root package name */
    public static final WidgetPageSource f272576e;

    /* renamed from: f, reason: collision with root package name */
    public static final WidgetPageSource f272577f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ WidgetPageSource[] f272578g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f272579h;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f272580b;

    static {
        WidgetPageSource widgetPageSource = new WidgetPageSource("NONE", 0, null);
        f272574c = widgetPageSource;
        WidgetPageSource widgetPageSource2 = new WidgetPageSource("PAGE_MAIN", 1, "main");
        f272575d = widgetPageSource2;
        WidgetPageSource widgetPageSource3 = new WidgetPageSource("PAGE_SERP", 2, "serp");
        f272576e = widgetPageSource3;
        WidgetPageSource widgetPageSource4 = new WidgetPageSource("PAGE_VERTICAL_MAIN", 3, "vertical");
        f272577f = widgetPageSource4;
        WidgetPageSource[] widgetPageSourceArr = {widgetPageSource, widgetPageSource2, widgetPageSource3, widgetPageSource4, new WidgetPageSource("PAGE_MAP", 4, "map")};
        f272578g = widgetPageSourceArr;
        f272579h = c.a(widgetPageSourceArr);
    }

    public WidgetPageSource(String str, int i12, String str2) {
        this.f272580b = str2;
    }

    public static WidgetPageSource valueOf(String str) {
        return (WidgetPageSource) Enum.valueOf(WidgetPageSource.class, str);
    }

    public static WidgetPageSource[] values() {
        return (WidgetPageSource[]) f272578g.clone();
    }
}
