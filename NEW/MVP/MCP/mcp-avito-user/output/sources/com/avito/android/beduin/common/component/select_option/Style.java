package com.avito.android.beduin.common.component.select_option;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinSelectOptionModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/Style;", "", "(Ljava/lang/String;I)V", "NO_BACKGROUND", "WITH_BACKGROUND", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Style {

    @com.google.gson.annotations.c("no_background")
    public static final Style NO_BACKGROUND;

    @com.google.gson.annotations.c("with_background")
    public static final Style WITH_BACKGROUND;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Style[] f102466b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102467c;

    static {
        Style style = new Style("NO_BACKGROUND", 0);
        NO_BACKGROUND = style;
        Style style2 = new Style("WITH_BACKGROUND", 1);
        WITH_BACKGROUND = style2;
        Style[] styleArr = {style, style2};
        f102466b = styleArr;
        f102467c = kotlin.enums.c.a(styleArr);
    }

    private Style(String str, int i12) {
    }

    public static Style valueOf(String str) {
        return (Style) Enum.valueOf(Style.class, str);
    }

    public static Style[] values() {
        return (Style[]) f102466b.clone();
    }
}
