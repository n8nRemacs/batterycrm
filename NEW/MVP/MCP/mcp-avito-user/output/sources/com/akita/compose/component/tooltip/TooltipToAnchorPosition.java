package com.akita.compose.component.tooltip;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipPosition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/tooltip/TooltipToAnchorPosition;", "", "tooltip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TooltipToAnchorPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final TooltipToAnchorPosition f63461b;

    /* renamed from: c, reason: collision with root package name */
    public static final TooltipToAnchorPosition f63462c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TooltipToAnchorPosition[] f63463d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63464e;

    static {
        TooltipToAnchorPosition tooltipToAnchorPosition = new TooltipToAnchorPosition("LEFT", 0);
        TooltipToAnchorPosition tooltipToAnchorPosition2 = new TooltipToAnchorPosition("TOP", 1);
        f63461b = tooltipToAnchorPosition2;
        TooltipToAnchorPosition tooltipToAnchorPosition3 = new TooltipToAnchorPosition("RIGHT", 2);
        TooltipToAnchorPosition tooltipToAnchorPosition4 = new TooltipToAnchorPosition("BOTTOM", 3);
        f63462c = tooltipToAnchorPosition4;
        TooltipToAnchorPosition[] tooltipToAnchorPositionArr = {tooltipToAnchorPosition, tooltipToAnchorPosition2, tooltipToAnchorPosition3, tooltipToAnchorPosition4};
        f63463d = tooltipToAnchorPositionArr;
        f63464e = kotlin.enums.c.a(tooltipToAnchorPositionArr);
    }

    public TooltipToAnchorPosition() {
        throw null;
    }

    public static TooltipToAnchorPosition valueOf(String str) {
        return (TooltipToAnchorPosition) Enum.valueOf(TooltipToAnchorPosition.class, str);
    }

    public static TooltipToAnchorPosition[] values() {
        return (TooltipToAnchorPosition[]) f63463d.clone();
    }
}
