package com.avito.android.sx_address.list.analytics;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SxAddressListAnalyticsDataProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/analytics/FromPage;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FromPage {

    /* renamed from: b, reason: collision with root package name */
    public static final FromPage f293046b;

    /* renamed from: c, reason: collision with root package name */
    public static final FromPage f293047c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f293048d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f293049e;

    static {
        FromPage fromPage = new FromPage("OSP", 0);
        f293046b = fromPage;
        FromPage fromPage2 = new FromPage("ITEM_ADD", 1);
        f293047c = fromPage2;
        FromPage[] fromPageArr = {fromPage, fromPage2};
        f293048d = fromPageArr;
        f293049e = kotlin.enums.c.a(fromPageArr);
    }

    public FromPage() {
        throw null;
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f293048d.clone();
    }
}
