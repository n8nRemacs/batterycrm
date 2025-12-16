package com.avito.android.analytics.screens.tracker.fps;

import Y61.k;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScreenFpsContext.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/fps/ScreenFpsContext;", "", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScreenFpsContext {

    /* renamed from: c, reason: collision with root package name */
    public static final ScreenFpsContext f90847c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScreenFpsContext f90848d;

    /* renamed from: e, reason: collision with root package name */
    public static final ScreenFpsContext f90849e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ScreenFpsContext[] f90850f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f90851g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f90852b;

    static {
        ScreenFpsContext screenFpsContext = new ScreenFpsContext("UI_FORMATION", 0, "ui_formation");
        f90847c = screenFpsContext;
        ScreenFpsContext screenFpsContext2 = new ScreenFpsContext("SCROLL", 1, "scroll");
        f90848d = screenFpsContext2;
        ScreenFpsContext screenFpsContext3 = new ScreenFpsContext("OTHER", 2, PluralsKeys.OTHER);
        f90849e = screenFpsContext3;
        ScreenFpsContext[] screenFpsContextArr = {screenFpsContext, screenFpsContext2, screenFpsContext3};
        f90850f = screenFpsContextArr;
        f90851g = kotlin.enums.c.a(screenFpsContextArr);
    }

    public ScreenFpsContext(String str, int i12, String str2) {
        this.f90852b = str2;
    }

    public static ScreenFpsContext valueOf(String str) {
        return (ScreenFpsContext) Enum.valueOf(ScreenFpsContext.class, str);
    }

    public static ScreenFpsContext[] values() {
        return (ScreenFpsContext[]) f90850f.clone();
    }
}
