package com.avito.android.analytics.publish;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublishAnalyticsDataProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/publish/FromPage;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FromPage {

    /* renamed from: b, reason: collision with root package name */
    public static final FromPage f90272b;

    /* renamed from: c, reason: collision with root package name */
    public static final FromPage f90273c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ FromPage[] f90274d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f90275e;

    static {
        FromPage fromPage = new FromPage("ITEM_ADD", 0);
        f90272b = fromPage;
        FromPage fromPage2 = new FromPage("ITEM_EDIT", 1);
        f90273c = fromPage2;
        FromPage[] fromPageArr = {fromPage, fromPage2};
        f90274d = fromPageArr;
        f90275e = c.a(fromPageArr);
    }

    public FromPage() {
        throw null;
    }

    public static FromPage valueOf(String str) {
        return (FromPage) Enum.valueOf(FromPage.class, str);
    }

    public static FromPage[] values() {
        return (FromPage[]) f90274d.clone();
    }
}
