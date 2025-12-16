package com.avito.android.advert_core.analytics.body_condition;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ClickCarBodyConditionLookAtSchemeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/analytics/body_condition/FromPage;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FromPage {

    /* renamed from: c, reason: collision with root package name */
    public static final FromPage f82800c;

    /* renamed from: d, reason: collision with root package name */
    public static final FromPage f82801d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f82802e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f82803f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f82804b;

    static {
        FromPage fromPage = new FromPage("ITEM", 0, "item");
        f82800c = fromPage;
        FromPage fromPage2 = new FromPage("ITEM_SX", 1, "item-sx");
        f82801d = fromPage2;
        FromPage[] fromPageArr = {fromPage, fromPage2};
        f82802e = fromPageArr;
        f82803f = c.a(fromPageArr);
    }

    public FromPage(String str, int i12, String str2) {
        this.f82804b = str2;
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f82802e.clone();
    }
}
