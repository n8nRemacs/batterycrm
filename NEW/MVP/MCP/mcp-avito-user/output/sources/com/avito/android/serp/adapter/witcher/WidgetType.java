package com.avito.android.serp.adapter.witcher;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Appearance.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/WidgetType;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WidgetType {

    /* renamed from: b, reason: collision with root package name */
    public static final WidgetType f273803b;

    /* renamed from: c, reason: collision with root package name */
    public static final WidgetType f273804c;

    /* renamed from: d, reason: collision with root package name */
    public static final WidgetType f273805d;

    /* renamed from: e, reason: collision with root package name */
    public static final WidgetType f273806e;

    /* renamed from: f, reason: collision with root package name */
    public static final WidgetType f273807f;

    /* renamed from: g, reason: collision with root package name */
    public static final WidgetType f273808g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ WidgetType[] f273809h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f273810i;

    static {
        WidgetType widgetType = new WidgetType("EXTERNAL_ROOT_CONTAINER", 0);
        f273803b = widgetType;
        WidgetType widgetType2 = new WidgetType("INNER_ROOT_CONTAINER", 1);
        f273804c = widgetType2;
        WidgetType widgetType3 = new WidgetType("TITLE", 2);
        f273805d = widgetType3;
        WidgetType widgetType4 = new WidgetType("SUBTITLE", 3);
        f273806e = widgetType4;
        WidgetType widgetType5 = new WidgetType("CONTENT_CONTAINER", 4);
        f273807f = widgetType5;
        WidgetType widgetType6 = new WidgetType("BUTTON", 5);
        f273808g = widgetType6;
        WidgetType[] widgetTypeArr = {widgetType, widgetType2, widgetType3, widgetType4, widgetType5, widgetType6};
        f273809h = widgetTypeArr;
        f273810i = kotlin.enums.c.a(widgetTypeArr);
    }

    public WidgetType() {
        throw null;
    }

    public static WidgetType valueOf(String str) {
        return (WidgetType) Enum.valueOf(WidgetType.class, str);
    }

    public static WidgetType[] values() {
        return (WidgetType[]) f273809h.clone();
    }
}
