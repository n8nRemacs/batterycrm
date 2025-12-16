package com.akita.compose.component.tooltip;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipPosition.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/tooltip/TooltipTailPosition;", "", "tooltip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TooltipTailPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final TooltipTailPosition f63452b;

    /* renamed from: c, reason: collision with root package name */
    public static final TooltipTailPosition f63453c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TooltipTailPosition[] f63454d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f63455e;

    static {
        TooltipTailPosition tooltipTailPosition = new TooltipTailPosition("START", 0);
        TooltipTailPosition tooltipTailPosition2 = new TooltipTailPosition("CENTER", 1);
        f63452b = tooltipTailPosition2;
        TooltipTailPosition tooltipTailPosition3 = new TooltipTailPosition("END", 2);
        f63453c = tooltipTailPosition3;
        TooltipTailPosition[] tooltipTailPositionArr = {tooltipTailPosition, tooltipTailPosition2, tooltipTailPosition3};
        f63454d = tooltipTailPositionArr;
        f63455e = kotlin.enums.c.a(tooltipTailPositionArr);
    }

    public TooltipTailPosition() {
        throw null;
    }

    public static TooltipTailPosition valueOf(String str) {
        return (TooltipTailPosition) Enum.valueOf(TooltipTailPosition.class, str);
    }

    public static TooltipTailPosition[] values() {
        return (TooltipTailPosition[]) f63454d.clone();
    }
}
