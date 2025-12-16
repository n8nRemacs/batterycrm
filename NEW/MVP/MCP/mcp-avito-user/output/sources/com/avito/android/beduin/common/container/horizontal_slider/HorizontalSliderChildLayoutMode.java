package com.avito.android.beduin.common.container.horizontal_slider;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinHorizontalSliderContainerModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/HorizontalSliderChildLayoutMode;", "", "(Ljava/lang/String;I)V", "FILL_WIDTH", "BY_CONTENT_SIZE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HorizontalSliderChildLayoutMode {

    @com.google.gson.annotations.c("byContentSize")
    public static final HorizontalSliderChildLayoutMode BY_CONTENT_SIZE;

    @com.google.gson.annotations.c("fillWidth")
    public static final HorizontalSliderChildLayoutMode FILL_WIDTH;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ HorizontalSliderChildLayoutMode[] f103092b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103093c;

    static {
        HorizontalSliderChildLayoutMode horizontalSliderChildLayoutMode = new HorizontalSliderChildLayoutMode("FILL_WIDTH", 0);
        FILL_WIDTH = horizontalSliderChildLayoutMode;
        HorizontalSliderChildLayoutMode horizontalSliderChildLayoutMode2 = new HorizontalSliderChildLayoutMode("BY_CONTENT_SIZE", 1);
        BY_CONTENT_SIZE = horizontalSliderChildLayoutMode2;
        HorizontalSliderChildLayoutMode[] horizontalSliderChildLayoutModeArr = {horizontalSliderChildLayoutMode, horizontalSliderChildLayoutMode2};
        f103092b = horizontalSliderChildLayoutModeArr;
        f103093c = kotlin.enums.c.a(horizontalSliderChildLayoutModeArr);
    }

    private HorizontalSliderChildLayoutMode(String str, int i12) {
    }

    public static HorizontalSliderChildLayoutMode valueOf(String str) {
        return (HorizontalSliderChildLayoutMode) Enum.valueOf(HorizontalSliderChildLayoutMode.class, str);
    }

    public static HorizontalSliderChildLayoutMode[] values() {
        return (HorizontalSliderChildLayoutMode[]) f103092b.clone();
    }
}
