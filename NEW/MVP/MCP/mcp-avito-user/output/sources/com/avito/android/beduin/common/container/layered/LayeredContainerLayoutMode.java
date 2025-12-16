package com.avito.android.beduin.common.container.layered;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinLayeredContainerModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/container/layered/LayeredContainerLayoutMode;", "", "(Ljava/lang/String;I)V", "FILL_ALL", "FILL_WIDTH", "FILL_HEIGHT", "BY_CONTENT_SIZE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LayeredContainerLayoutMode {

    @com.google.gson.annotations.c("byContentSize")
    public static final LayeredContainerLayoutMode BY_CONTENT_SIZE;

    @com.google.gson.annotations.c("fillAll")
    public static final LayeredContainerLayoutMode FILL_ALL;

    @com.google.gson.annotations.c("fillHeight")
    public static final LayeredContainerLayoutMode FILL_HEIGHT;

    @com.google.gson.annotations.c("fillWidth")
    public static final LayeredContainerLayoutMode FILL_WIDTH;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ LayeredContainerLayoutMode[] f103129b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f103130c;

    static {
        LayeredContainerLayoutMode layeredContainerLayoutMode = new LayeredContainerLayoutMode("FILL_ALL", 0);
        FILL_ALL = layeredContainerLayoutMode;
        LayeredContainerLayoutMode layeredContainerLayoutMode2 = new LayeredContainerLayoutMode("FILL_WIDTH", 1);
        FILL_WIDTH = layeredContainerLayoutMode2;
        LayeredContainerLayoutMode layeredContainerLayoutMode3 = new LayeredContainerLayoutMode("FILL_HEIGHT", 2);
        FILL_HEIGHT = layeredContainerLayoutMode3;
        LayeredContainerLayoutMode layeredContainerLayoutMode4 = new LayeredContainerLayoutMode("BY_CONTENT_SIZE", 3);
        BY_CONTENT_SIZE = layeredContainerLayoutMode4;
        LayeredContainerLayoutMode[] layeredContainerLayoutModeArr = {layeredContainerLayoutMode, layeredContainerLayoutMode2, layeredContainerLayoutMode3, layeredContainerLayoutMode4};
        f103129b = layeredContainerLayoutModeArr;
        f103130c = kotlin.enums.c.a(layeredContainerLayoutModeArr);
    }

    private LayeredContainerLayoutMode(String str, int i12) {
    }

    public static LayeredContainerLayoutMode valueOf(String str) {
        return (LayeredContainerLayoutMode) Enum.valueOf(LayeredContainerLayoutMode.class, str);
    }

    public static LayeredContainerLayoutMode[] values() {
        return (LayeredContainerLayoutMode[]) f103129b.clone();
    }
}
