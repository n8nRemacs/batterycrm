package com.avito.android.beduin.common.container.equalwidth;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinEqualWidthContainerModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/container/equalwidth/LayoutMode;", "", "(Ljava/lang/String;I)V", "FILL_HEIGHT", "BY_CONTENT_SIZE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LayoutMode {

    @com.google.gson.annotations.c("byContentSize")
    public static final LayoutMode BY_CONTENT_SIZE;

    @com.google.gson.annotations.c("fillHeight")
    public static final LayoutMode FILL_HEIGHT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LayoutMode[] f103019b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103020c;

    static {
        LayoutMode layoutMode = new LayoutMode("FILL_HEIGHT", 0);
        FILL_HEIGHT = layoutMode;
        LayoutMode layoutMode2 = new LayoutMode("BY_CONTENT_SIZE", 1);
        BY_CONTENT_SIZE = layoutMode2;
        LayoutMode[] layoutModeArr = {layoutMode, layoutMode2};
        f103019b = layoutModeArr;
        f103020c = kotlin.enums.c.a(layoutModeArr);
    }

    private LayoutMode(String str, int i12) {
    }

    public static LayoutMode valueOf(String str) {
        return (LayoutMode) Enum.valueOf(LayoutMode.class, str);
    }

    public static LayoutMode[] values() {
        return (LayoutMode[]) f103019b.clone();
    }
}
