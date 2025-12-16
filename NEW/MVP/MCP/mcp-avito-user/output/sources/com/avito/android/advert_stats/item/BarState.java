package com.avito.android.advert_stats.item;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BarState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/BarState;", "", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BarState {

    /* renamed from: b, reason: collision with root package name */
    public static final BarState f86678b;

    /* renamed from: c, reason: collision with root package name */
    public static final BarState f86679c;

    /* renamed from: d, reason: collision with root package name */
    public static final BarState f86680d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ BarState[] f86681e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86682f;

    static {
        BarState barState = new BarState("DEFAULT", 0);
        f86678b = barState;
        BarState barState2 = new BarState("SELECTED", 1);
        f86679c = barState2;
        BarState barState3 = new BarState("UNSELECTED", 2);
        f86680d = barState3;
        BarState[] barStateArr = {barState, barState2, barState3};
        f86681e = barStateArr;
        f86682f = kotlin.enums.c.a(barStateArr);
    }

    public BarState() {
        throw null;
    }

    public static BarState valueOf(String str) {
        return (BarState) Enum.valueOf(BarState.class, str);
    }

    public static BarState[] values() {
        return (BarState[]) f86681e.clone();
    }
}
