package com.akita.compose.component.segmented_control;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SegmentedControl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/segmented_control/y;", "", "segmented-control_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final y f62604b;

    /* renamed from: c, reason: collision with root package name */
    public static final y f62605c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y[] f62606d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f62607e;

    static {
        y yVar = new y("Segments", 0);
        f62604b = yVar;
        y yVar2 = new y("Indicator", 1);
        f62605c = yVar2;
        y[] yVarArr = {yVar, yVar2};
        f62606d = yVarArr;
        f62607e = kotlin.enums.c.a(yVarArr);
    }

    public y() {
        throw null;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f62606d.clone();
    }
}
