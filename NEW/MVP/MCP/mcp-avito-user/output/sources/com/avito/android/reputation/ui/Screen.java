package com.avito.android.reputation.ui;

import Y61.k;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Screen.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/reputation/ui/Screen;", "", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Screen {

    /* renamed from: c, reason: collision with root package name */
    public static final Screen f254792c;

    /* renamed from: d, reason: collision with root package name */
    public static final Screen f254793d;

    /* renamed from: e, reason: collision with root package name */
    public static final Screen f254794e;

    /* renamed from: f, reason: collision with root package name */
    public static final Screen f254795f;

    /* renamed from: g, reason: collision with root package name */
    public static final Screen f254796g;

    /* renamed from: h, reason: collision with root package name */
    public static final Screen f254797h;

    /* renamed from: i, reason: collision with root package name */
    public static final Screen f254798i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ Screen[] f254799j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f254800k;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254801b;

    static {
        Screen screen = new Screen("MAIN", 0, "reputationMain");
        f254792c = screen;
        Screen screen2 = new Screen("CRITERIA", 1, "criteriaList");
        f254793d = screen2;
        Screen screen3 = new Screen("CRITERIA_DETAILS", 2, "criterionDetails");
        f254794e = screen3;
        Screen screen4 = new Screen("BENEFIT", 3, "benefit");
        f254795f = screen4;
        Screen screen5 = new Screen("RESTRICTION", 4, "restriction");
        f254796g = screen5;
        Screen screen6 = new Screen("GRAY_STATE", 5, "grayState");
        f254797h = screen6;
        Screen screen7 = new Screen("GRAY_STATE_CRITERIA", 6, "grayStateCriterion");
        f254798i = screen7;
        Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6, screen7};
        f254799j = screenArr;
        f254800k = kotlin.enums.c.a(screenArr);
    }

    public Screen(String str, int i12, String str2) {
        this.f254801b = str2;
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) f254799j.clone();
    }
}
