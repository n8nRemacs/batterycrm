package com.akita.compose.component.chips;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChipsDisplayType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/chips/ChipsDisplayType;", "", "chips_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChipsDisplayType {

    /* renamed from: b, reason: collision with root package name */
    public static final ChipsDisplayType f60861b;

    /* renamed from: c, reason: collision with root package name */
    public static final ChipsDisplayType f60862c;

    /* renamed from: d, reason: collision with root package name */
    public static final ChipsDisplayType f60863d;

    /* renamed from: e, reason: collision with root package name */
    public static final ChipsDisplayType f60864e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ChipsDisplayType[] f60865f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f60866g;

    static {
        ChipsDisplayType chipsDisplayType = new ChipsDisplayType("SINGLE_LINE_FIXED", 0);
        f60861b = chipsDisplayType;
        ChipsDisplayType chipsDisplayType2 = new ChipsDisplayType("SINGLE_LINE_STRETCHED", 1);
        f60862c = chipsDisplayType2;
        ChipsDisplayType chipsDisplayType3 = new ChipsDisplayType("SINGLE_LINE_SCROLLABLE", 2);
        f60863d = chipsDisplayType3;
        ChipsDisplayType chipsDisplayType4 = new ChipsDisplayType("MULTI_LINE", 3);
        f60864e = chipsDisplayType4;
        ChipsDisplayType[] chipsDisplayTypeArr = {chipsDisplayType, chipsDisplayType2, chipsDisplayType3, chipsDisplayType4};
        f60865f = chipsDisplayTypeArr;
        f60866g = kotlin.enums.c.a(chipsDisplayTypeArr);
    }

    public ChipsDisplayType() {
        throw null;
    }

    public static ChipsDisplayType valueOf(String str) {
        return (ChipsDisplayType) Enum.valueOf(ChipsDisplayType.class, str);
    }

    public static ChipsDisplayType[] values() {
        return (ChipsDisplayType[]) f60865f.clone();
    }
}
