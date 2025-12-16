package com.avito.android.beduin.common.component.bar_chart;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BeduinBarChartModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/VerticalAxisPosition;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerticalAxisPosition {

    @com.google.gson.annotations.c("left")
    public static final VerticalAxisPosition LEFT;

    @com.google.gson.annotations.c("right")
    public static final VerticalAxisPosition RIGHT;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ VerticalAxisPosition[] f100700b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f100701c;

    static {
        VerticalAxisPosition verticalAxisPosition = new VerticalAxisPosition("LEFT", 0);
        LEFT = verticalAxisPosition;
        VerticalAxisPosition verticalAxisPosition2 = new VerticalAxisPosition("RIGHT", 1);
        RIGHT = verticalAxisPosition2;
        VerticalAxisPosition[] verticalAxisPositionArr = {verticalAxisPosition, verticalAxisPosition2};
        f100700b = verticalAxisPositionArr;
        f100701c = kotlin.enums.c.a(verticalAxisPositionArr);
    }

    private VerticalAxisPosition(String str, int i12) {
    }

    public static VerticalAxisPosition valueOf(String str) {
        return (VerticalAxisPosition) Enum.valueOf(VerticalAxisPosition.class, str);
    }

    public static VerticalAxisPosition[] values() {
        return (VerticalAxisPosition[]) f100700b.clone();
    }
}
