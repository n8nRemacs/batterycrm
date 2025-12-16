package com.avito.android.advertising.splitter;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommercialFeatures.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/splitter/YandexBadgeStyle;", "", "_avito_advertising_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexBadgeStyle {

    /* renamed from: b, reason: collision with root package name */
    public static final YandexBadgeStyle f88521b;

    /* renamed from: c, reason: collision with root package name */
    public static final YandexBadgeStyle f88522c;

    /* renamed from: d, reason: collision with root package name */
    public static final YandexBadgeStyle f88523d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ YandexBadgeStyle[] f88524e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f88525f;

    static {
        YandexBadgeStyle yandexBadgeStyle = new YandexBadgeStyle("SDK", 0);
        f88521b = yandexBadgeStyle;
        YandexBadgeStyle yandexBadgeStyle2 = new YandexBadgeStyle("SDKWithCustomStyle", 1);
        f88522c = yandexBadgeStyle2;
        YandexBadgeStyle yandexBadgeStyle3 = new YandexBadgeStyle("CombinedWithSponsored", 2);
        f88523d = yandexBadgeStyle3;
        YandexBadgeStyle[] yandexBadgeStyleArr = {yandexBadgeStyle, yandexBadgeStyle2, yandexBadgeStyle3};
        f88524e = yandexBadgeStyleArr;
        f88525f = c.a(yandexBadgeStyleArr);
    }

    public YandexBadgeStyle() {
        throw null;
    }

    public static YandexBadgeStyle valueOf(String str) {
        return (YandexBadgeStyle) Enum.valueOf(YandexBadgeStyle.class, str);
    }

    public static YandexBadgeStyle[] values() {
        return (YandexBadgeStyle[]) f88524e.clone();
    }
}
