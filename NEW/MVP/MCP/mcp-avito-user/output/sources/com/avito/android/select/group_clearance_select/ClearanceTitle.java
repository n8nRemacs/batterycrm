package com.avito.android.select.group_clearance_select;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GroupClearanceParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/ClearanceTitle;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClearanceTitle {

    /* renamed from: c, reason: collision with root package name */
    public static final ClearanceTitle f265409c;

    /* renamed from: d, reason: collision with root package name */
    public static final ClearanceTitle f265410d;

    /* renamed from: e, reason: collision with root package name */
    public static final ClearanceTitle f265411e;

    /* renamed from: f, reason: collision with root package name */
    public static final ClearanceTitle f265412f;

    /* renamed from: g, reason: collision with root package name */
    public static final ClearanceTitle f265413g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ClearanceTitle[] f265414h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f265415i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f265416b;

    static {
        ClearanceTitle clearanceTitle = new ClearanceTitle("SPORT", 0, "Спортивный");
        f265409c = clearanceTitle;
        ClearanceTitle clearanceTitle2 = new ClearanceTitle("LOW", 1, "Низкий");
        f265410d = clearanceTitle2;
        ClearanceTitle clearanceTitle3 = new ClearanceTitle("MEDIUM", 2, "Средний");
        f265411e = clearanceTitle3;
        ClearanceTitle clearanceTitle4 = new ClearanceTitle("HIGH", 3, "Высокий");
        f265412f = clearanceTitle4;
        ClearanceTitle clearanceTitle5 = new ClearanceTitle("OFF_ROAD", 4, "Офф-роуд");
        f265413g = clearanceTitle5;
        ClearanceTitle[] clearanceTitleArr = {clearanceTitle, clearanceTitle2, clearanceTitle3, clearanceTitle4, clearanceTitle5};
        f265414h = clearanceTitleArr;
        f265415i = kotlin.enums.c.a(clearanceTitleArr);
    }

    public ClearanceTitle(String str, int i12, String str2) {
        this.f265416b = str2;
    }

    public static ClearanceTitle valueOf(String str) {
        return (ClearanceTitle) Enum.valueOf(ClearanceTitle.class, str);
    }

    public static ClearanceTitle[] values() {
        return (ClearanceTitle[]) f265414h.clone();
    }
}
