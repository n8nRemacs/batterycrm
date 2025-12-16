package com.akita.compose.component.tooltip;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipPosition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/tooltip/TooltipTailToAnchorPosition;", "", "tooltip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TooltipTailToAnchorPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final TooltipTailToAnchorPosition f63456b;

    /* renamed from: c, reason: collision with root package name */
    public static final TooltipTailToAnchorPosition f63457c;

    /* renamed from: d, reason: collision with root package name */
    public static final TooltipTailToAnchorPosition f63458d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TooltipTailToAnchorPosition[] f63459e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63460f;

    static {
        TooltipTailToAnchorPosition tooltipTailToAnchorPosition = new TooltipTailToAnchorPosition("START", 0);
        f63456b = tooltipTailToAnchorPosition;
        TooltipTailToAnchorPosition tooltipTailToAnchorPosition2 = new TooltipTailToAnchorPosition("CENTER", 1);
        f63457c = tooltipTailToAnchorPosition2;
        TooltipTailToAnchorPosition tooltipTailToAnchorPosition3 = new TooltipTailToAnchorPosition("END", 2);
        f63458d = tooltipTailToAnchorPosition3;
        TooltipTailToAnchorPosition[] tooltipTailToAnchorPositionArr = {tooltipTailToAnchorPosition, tooltipTailToAnchorPosition2, tooltipTailToAnchorPosition3};
        f63459e = tooltipTailToAnchorPositionArr;
        f63460f = kotlin.enums.c.a(tooltipTailToAnchorPositionArr);
    }

    public TooltipTailToAnchorPosition() {
        throw null;
    }

    public static TooltipTailToAnchorPosition valueOf(String str) {
        return (TooltipTailToAnchorPosition) Enum.valueOf(TooltipTailToAnchorPosition.class, str);
    }

    public static TooltipTailToAnchorPosition[] values() {
        return (TooltipTailToAnchorPosition[]) f63459e.clone();
    }
}
