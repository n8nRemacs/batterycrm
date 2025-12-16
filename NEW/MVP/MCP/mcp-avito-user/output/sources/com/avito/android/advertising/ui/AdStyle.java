package com.avito.android.advertising.ui;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/ui/AdStyle;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final AdStyle f88537b;

    /* renamed from: c, reason: collision with root package name */
    public static final AdStyle f88538c;

    /* renamed from: d, reason: collision with root package name */
    public static final AdStyle f88539d;

    /* renamed from: e, reason: collision with root package name */
    public static final AdStyle f88540e;

    /* renamed from: f, reason: collision with root package name */
    public static final AdStyle f88541f;

    /* renamed from: g, reason: collision with root package name */
    public static final AdStyle f88542g;

    /* renamed from: h, reason: collision with root package name */
    public static final AdStyle f88543h;

    /* renamed from: i, reason: collision with root package name */
    public static final AdStyle f88544i;

    /* renamed from: j, reason: collision with root package name */
    public static final AdStyle f88545j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AdStyle[] f88546k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f88547l;

    static {
        AdStyle adStyle = new AdStyle("BIG", 0);
        f88537b = adStyle;
        AdStyle adStyle2 = new AdStyle("BIG_BORDERLESS", 1);
        f88538c = adStyle2;
        AdStyle adStyle3 = new AdStyle("GRID", 2);
        f88539d = adStyle3;
        AdStyle adStyle4 = new AdStyle("GRID_BORDERLESS", 3);
        f88540e = adStyle4;
        AdStyle adStyle5 = new AdStyle("LIST", 4);
        f88541f = adStyle5;
        AdStyle adStyle6 = new AdStyle("RICH", 5);
        f88542g = adStyle6;
        AdStyle adStyle7 = new AdStyle("AVL", 6);
        f88543h = adStyle7;
        AdStyle adStyle8 = new AdStyle("VIDEO", 7);
        f88544i = adStyle8;
        AdStyle adStyle9 = new AdStyle("FULLWIDTH", 8);
        f88545j = adStyle9;
        AdStyle[] adStyleArr = {adStyle, adStyle2, adStyle3, adStyle4, adStyle5, adStyle6, adStyle7, adStyle8, adStyle9};
        f88546k = adStyleArr;
        f88547l = kotlin.enums.c.a(adStyleArr);
    }

    public AdStyle() {
        throw null;
    }

    public static AdStyle valueOf(String str) {
        return (AdStyle) Enum.valueOf(AdStyle.class, str);
    }

    public static AdStyle[] values() {
        return (AdStyle[]) f88546k.clone();
    }

    public final boolean a() {
        return this == f88537b || this == f88539d || this == f88541f;
    }

    public final boolean b() {
        return this == f88542g;
    }
}
