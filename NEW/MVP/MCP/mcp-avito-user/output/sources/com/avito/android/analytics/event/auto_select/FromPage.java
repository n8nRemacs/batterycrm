package com.avito.android.analytics.event.auto_select;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/auto_select/FromPage;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FromPage {

    /* renamed from: c, reason: collision with root package name */
    public static final FromPage f90013c;

    /* renamed from: d, reason: collision with root package name */
    public static final FromPage f90014d;

    /* renamed from: e, reason: collision with root package name */
    public static final FromPage f90015e;

    /* renamed from: f, reason: collision with root package name */
    public static final FromPage f90016f;

    /* renamed from: g, reason: collision with root package name */
    public static final FromPage f90017g;

    /* renamed from: h, reason: collision with root package name */
    public static final FromPage f90018h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f90019i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f90020j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f90021b;

    static {
        FromPage fromPage = new FromPage("ITEM", 0, "item");
        f90013c = fromPage;
        FromPage fromPage2 = new FromPage("BX_CARD", 1, "bx_card");
        f90014d = fromPage2;
        FromPage fromPage3 = new FromPage("SERP", 2, "serp");
        f90015e = fromPage3;
        FromPage fromPage4 = new FromPage("FAVORITES", 3, "favorites");
        f90016f = fromPage4;
        FromPage fromPage5 = new FromPage("BOTTOMSHEET_MONOLITH", 4, "bottomsheet_monolith");
        f90017g = fromPage5;
        FromPage fromPage6 = new FromPage("BOTTOMSHEET_MONOLITH_CASHBACK", 5, "bottomsheet_monolith_cashback");
        f90018h = fromPage6;
        FromPage[] fromPageArr = {fromPage, fromPage2, fromPage3, fromPage4, fromPage5, fromPage6};
        f90019i = fromPageArr;
        f90020j = c.a(fromPageArr);
    }

    public FromPage(String str, int i12, String str2) {
        this.f90021b = str2;
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f90019i.clone();
    }
}
