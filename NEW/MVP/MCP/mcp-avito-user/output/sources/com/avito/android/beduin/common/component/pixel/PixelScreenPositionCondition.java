package com.avito.android.beduin.common.component.pixel;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinPixelModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/pixel/PixelScreenPositionCondition;", "", "(Ljava/lang/String;I)V", "MORE", "LESS", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PixelScreenPositionCondition {

    @com.google.gson.annotations.c("less")
    public static final PixelScreenPositionCondition LESS;

    @com.google.gson.annotations.c("more")
    public static final PixelScreenPositionCondition MORE;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PixelScreenPositionCondition[] f102096b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f102097c;

    static {
        PixelScreenPositionCondition pixelScreenPositionCondition = new PixelScreenPositionCondition("MORE", 0);
        MORE = pixelScreenPositionCondition;
        PixelScreenPositionCondition pixelScreenPositionCondition2 = new PixelScreenPositionCondition("LESS", 1);
        LESS = pixelScreenPositionCondition2;
        PixelScreenPositionCondition[] pixelScreenPositionConditionArr = {pixelScreenPositionCondition, pixelScreenPositionCondition2};
        f102096b = pixelScreenPositionConditionArr;
        f102097c = kotlin.enums.c.a(pixelScreenPositionConditionArr);
    }

    private PixelScreenPositionCondition(String str, int i12) {
    }

    public static PixelScreenPositionCondition valueOf(String str) {
        return (PixelScreenPositionCondition) Enum.valueOf(PixelScreenPositionCondition.class, str);
    }

    public static PixelScreenPositionCondition[] values() {
        return (PixelScreenPositionCondition[]) f102096b.clone();
    }
}
