package com.avito.android.lib.util.darkTheme;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ThemeAppearance.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/darkTheme/ThemeAppearance;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ThemeAppearance {

    /* renamed from: b, reason: collision with root package name */
    public static final ThemeAppearance f181334b;

    /* renamed from: c, reason: collision with root package name */
    public static final ThemeAppearance f181335c;

    /* renamed from: d, reason: collision with root package name */
    public static final ThemeAppearance f181336d;

    /* renamed from: e, reason: collision with root package name */
    public static final ThemeAppearance f181337e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ThemeAppearance[] f181338f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181339g;

    static {
        ThemeAppearance themeAppearance = new ThemeAppearance("Dark", 0);
        f181334b = themeAppearance;
        ThemeAppearance themeAppearance2 = new ThemeAppearance("Light", 1);
        f181335c = themeAppearance2;
        ThemeAppearance themeAppearance3 = new ThemeAppearance("AlwaysDark", 2);
        f181336d = themeAppearance3;
        ThemeAppearance themeAppearance4 = new ThemeAppearance("AlwaysLight", 3);
        f181337e = themeAppearance4;
        ThemeAppearance[] themeAppearanceArr = {themeAppearance, themeAppearance2, themeAppearance3, themeAppearance4};
        f181338f = themeAppearanceArr;
        f181339g = kotlin.enums.c.a(themeAppearanceArr);
    }

    public ThemeAppearance() {
        throw null;
    }

    public static ThemeAppearance valueOf(String str) {
        return (ThemeAppearance) Enum.valueOf(ThemeAppearance.class, str);
    }

    public static ThemeAppearance[] values() {
        return (ThemeAppearance[]) f181338f.clone();
    }
}
