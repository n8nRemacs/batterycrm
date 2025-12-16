package com.avito.android.code_check_public.screen;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/AppbarNavigationIcon;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AppbarNavigationIcon {

    /* renamed from: b, reason: collision with root package name */
    public static final AppbarNavigationIcon f119297b;

    /* renamed from: c, reason: collision with root package name */
    public static final AppbarNavigationIcon f119298c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AppbarNavigationIcon[] f119299d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119300e;

    static {
        AppbarNavigationIcon appbarNavigationIcon = new AppbarNavigationIcon("BACK", 0);
        f119297b = appbarNavigationIcon;
        AppbarNavigationIcon appbarNavigationIcon2 = new AppbarNavigationIcon("FINISH", 1);
        f119298c = appbarNavigationIcon2;
        AppbarNavigationIcon[] appbarNavigationIconArr = {appbarNavigationIcon, appbarNavigationIcon2};
        f119299d = appbarNavigationIconArr;
        f119300e = kotlin.enums.c.a(appbarNavigationIconArr);
    }

    public AppbarNavigationIcon() {
        throw null;
    }

    public static AppbarNavigationIcon valueOf(String str) {
        return (AppbarNavigationIcon) Enum.valueOf(AppbarNavigationIcon.class, str);
    }

    public static AppbarNavigationIcon[] values() {
        return (AppbarNavigationIcon[]) f119299d.clone();
    }
}
