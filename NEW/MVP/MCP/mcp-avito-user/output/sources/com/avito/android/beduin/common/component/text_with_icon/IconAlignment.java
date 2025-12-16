package com.avito.android.beduin.common.component.text_with_icon;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinTextWithIconModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/text_with_icon/IconAlignment;", "", "(Ljava/lang/String;I)V", "TOP", "CENTER", "BOTTOM", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IconAlignment {

    @com.google.gson.annotations.c("bottom")
    public static final IconAlignment BOTTOM;

    @com.google.gson.annotations.c("center")
    public static final IconAlignment CENTER;

    @com.google.gson.annotations.c("top")
    public static final IconAlignment TOP;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ IconAlignment[] f102782b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102783c;

    static {
        IconAlignment iconAlignment = new IconAlignment("TOP", 0);
        TOP = iconAlignment;
        IconAlignment iconAlignment2 = new IconAlignment("CENTER", 1);
        CENTER = iconAlignment2;
        IconAlignment iconAlignment3 = new IconAlignment("BOTTOM", 2);
        BOTTOM = iconAlignment3;
        IconAlignment[] iconAlignmentArr = {iconAlignment, iconAlignment2, iconAlignment3};
        f102782b = iconAlignmentArr;
        f102783c = kotlin.enums.c.a(iconAlignmentArr);
    }

    private IconAlignment(String str, int i12) {
    }

    public static IconAlignment valueOf(String str) {
        return (IconAlignment) Enum.valueOf(IconAlignment.class, str);
    }

    public static IconAlignment[] values() {
        return (IconAlignment[]) f102782b.clone();
    }
}
