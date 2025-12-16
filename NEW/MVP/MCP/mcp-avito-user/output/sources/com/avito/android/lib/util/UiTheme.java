package com.avito.android.lib.util;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/util/UiTheme;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UiTheme {

    /* renamed from: b, reason: collision with root package name */
    public static final UiTheme f181325b;

    /* renamed from: c, reason: collision with root package name */
    public static final UiTheme f181326c;

    /* renamed from: d, reason: collision with root package name */
    public static final UiTheme f181327d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ UiTheme[] f181328e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f181329f;

    static {
        UiTheme uiTheme = new UiTheme("AVITO", 0);
        f181325b = uiTheme;
        UiTheme uiTheme2 = new UiTheme("AVITO_LOOK_AND_FEEL", 1);
        f181326c = uiTheme2;
        UiTheme uiTheme3 = new UiTheme("RE_23", 2);
        f181327d = uiTheme3;
        UiTheme[] uiThemeArr = {uiTheme, uiTheme2, uiTheme3};
        f181328e = uiThemeArr;
        f181329f = kotlin.enums.c.a(uiThemeArr);
    }

    public UiTheme() {
        throw null;
    }

    public static UiTheme valueOf(String str) {
        return (UiTheme) Enum.valueOf(UiTheme.class, str);
    }

    public static UiTheme[] values() {
        return (UiTheme[]) f181328e.clone();
    }
}
