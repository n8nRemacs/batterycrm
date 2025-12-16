package com.avito.android.beduin.common.component.input;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InputLayoutMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/input/InputLayoutMode;", "", "(Ljava/lang/String;I)V", "FILL_WIDTH", "BY_CONTENT_SIZE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InputLayoutMode {

    @com.google.gson.annotations.c("byContentSize")
    public static final InputLayoutMode BY_CONTENT_SIZE;

    @com.google.gson.annotations.c("fillWidth")
    public static final InputLayoutMode FILL_WIDTH;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ InputLayoutMode[] f101541b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f101542c;

    static {
        InputLayoutMode inputLayoutMode = new InputLayoutMode("FILL_WIDTH", 0);
        FILL_WIDTH = inputLayoutMode;
        InputLayoutMode inputLayoutMode2 = new InputLayoutMode("BY_CONTENT_SIZE", 1);
        BY_CONTENT_SIZE = inputLayoutMode2;
        InputLayoutMode[] inputLayoutModeArr = {inputLayoutMode, inputLayoutMode2};
        f101541b = inputLayoutModeArr;
        f101542c = kotlin.enums.c.a(inputLayoutModeArr);
    }

    private InputLayoutMode(String str, int i12) {
    }

    public static InputLayoutMode valueOf(String str) {
        return (InputLayoutMode) Enum.valueOf(InputLayoutMode.class, str);
    }

    public static InputLayoutMode[] values() {
        return (InputLayoutMode[]) f101541b.clone();
    }
}
