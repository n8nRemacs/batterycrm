package com.avito.android.version_conflict.analytics;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.H;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ForceUpdateWebViewAnalytics.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/version_conflict/analytics/ForceUpdateWebViewAnalytics;", "", "FromPage", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ForceUpdateWebViewAnalytics {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f325881a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H f325882b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ForceUpdateWebViewAnalytics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/analytics/ForceUpdateWebViewAnalytics$FromPage;", "", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: b, reason: collision with root package name */
        public static final FromPage f325883b;

        /* renamed from: c, reason: collision with root package name */
        public static final FromPage f325884c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f325885d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f325886e;

        static {
            FromPage fromPage = new FromPage("Manual", 0);
            f325883b = fromPage;
            FromPage fromPage2 = new FromPage("ForceRedirect", 1);
            f325884c = fromPage2;
            FromPage[] fromPageArr = {fromPage, fromPage2};
            f325885d = fromPageArr;
            f325886e = kotlin.enums.c.a(fromPageArr);
        }

        public FromPage() {
            throw null;
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f325885d.clone();
        }
    }

    @Inject
    public ForceUpdateWebViewAnalytics(@k InterfaceC28373a interfaceC28373a, @k H h12) {
        this.f325881a = interfaceC28373a;
        this.f325882b = h12;
    }
}
