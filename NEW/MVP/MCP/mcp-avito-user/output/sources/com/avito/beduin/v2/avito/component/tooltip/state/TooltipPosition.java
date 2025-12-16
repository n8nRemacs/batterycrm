package com.avito.beduin.v2.avito.component.tooltip.state;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AvitoTooltipState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tooltip/state/TooltipPosition;", "", "a", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TooltipPosition {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f335423c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TooltipPosition[] f335424d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f335425e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f335426b;

    /* compiled from: AvitoTooltipState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/avito/component/tooltip/state/TooltipPosition$a;", "", "<init>", "()V", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        TooltipPosition[] tooltipPositionArr = {new TooltipPosition("Left", 0, "left"), new TooltipPosition("Top", 1, "top"), new TooltipPosition("Right", 2, "right"), new TooltipPosition("Bottom", 3, "bottom")};
        f335424d = tooltipPositionArr;
        f335425e = kotlin.enums.c.a(tooltipPositionArr);
        f335423c = new a(null);
    }

    public TooltipPosition(String str, int i12, String str2) {
        this.f335426b = str2;
    }

    public static TooltipPosition valueOf(String str) {
        return (TooltipPosition) Enum.valueOf(TooltipPosition.class, str);
    }

    public static TooltipPosition[] values() {
        return (TooltipPosition[]) f335424d.clone();
    }
}
