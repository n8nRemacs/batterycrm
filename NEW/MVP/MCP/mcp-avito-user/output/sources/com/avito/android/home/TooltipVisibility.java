package com.avito.android.home;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/TooltipVisibility;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TooltipVisibility {

    /* renamed from: b, reason: collision with root package name */
    public static final TooltipVisibility f162192b;

    /* renamed from: c, reason: collision with root package name */
    public static final TooltipVisibility f162193c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TooltipVisibility[] f162194d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f162195e;

    static {
        TooltipVisibility tooltipVisibility = new TooltipVisibility("VISIBLE", 0);
        f162192b = tooltipVisibility;
        TooltipVisibility tooltipVisibility2 = new TooltipVisibility("GONE", 1);
        f162193c = tooltipVisibility2;
        TooltipVisibility[] tooltipVisibilityArr = {tooltipVisibility, tooltipVisibility2};
        f162194d = tooltipVisibilityArr;
        f162195e = kotlin.enums.c.a(tooltipVisibilityArr);
    }

    public TooltipVisibility() {
        throw null;
    }

    public static TooltipVisibility valueOf(String str) {
        return (TooltipVisibility) Enum.valueOf(TooltipVisibility.class, str);
    }

    public static TooltipVisibility[] values() {
        return (TooltipVisibility[]) f162194d.clone();
    }
}
