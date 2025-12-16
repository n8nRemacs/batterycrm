package com.avito.android.deep_linking.links;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetailsSheetLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/Theme;", "", "", "resName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "AVITO_LOOK_AND_FEEL", "AVITO_RE_23", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Theme {

    @com.google.gson.annotations.c("avitoLookAndFeel")
    public static final Theme AVITO_LOOK_AND_FEEL;

    @com.google.gson.annotations.c("avitoRe23")
    public static final Theme AVITO_RE_23;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Theme[] f133711c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f133712d;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133713b;

    static {
        Theme theme = new Theme("AVITO_LOOK_AND_FEEL", 0, "avitoLookAndFeel");
        AVITO_LOOK_AND_FEEL = theme;
        Theme theme2 = new Theme("AVITO_RE_23", 1, "avitoRe23");
        AVITO_RE_23 = theme2;
        Theme[] themeArr = {theme, theme2};
        f133711c = themeArr;
        f133712d = kotlin.enums.c.a(themeArr);
    }

    private Theme(String str, int i12, String str2) {
        this.f133713b = str2;
    }

    public static Theme valueOf(String str) {
        return (Theme) Enum.valueOf(Theme.class, str);
    }

    public static Theme[] values() {
        return (Theme[]) f133711c.clone();
    }
}
