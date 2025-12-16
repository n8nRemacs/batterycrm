package com.avito.android.version_conflict.analytics;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C35793f6;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ForceUpdateShowCloseAnalytics.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/version_conflict/analytics/ForceUpdateShowCloseAnalytics;", "", "FromPage", "HowClosed", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ForceUpdateShowCloseAnalytics {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f325865a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C35793f6 f325866b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f325867c = C42727D.c(new a());

    /* renamed from: d, reason: collision with root package name */
    public boolean f325868d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f325869e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ForceUpdateShowCloseAnalytics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/analytics/ForceUpdateShowCloseAnalytics$FromPage;", "", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FromPage {

        /* renamed from: b, reason: collision with root package name */
        public static final FromPage f325870b;

        /* renamed from: c, reason: collision with root package name */
        public static final FromPage f325871c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ FromPage[] f325872d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f325873e;

        static {
            FromPage fromPage = new FromPage("Dialog", 0);
            f325870b = fromPage;
            FromPage fromPage2 = new FromPage("Banner", 1);
            FromPage fromPage3 = new FromPage("Blocking", 2);
            f325871c = fromPage3;
            FromPage[] fromPageArr = {fromPage, fromPage2, fromPage3};
            f325872d = fromPageArr;
            f325873e = kotlin.enums.c.a(fromPageArr);
        }

        public FromPage() {
            throw null;
        }

        public static FromPage valueOf(String str) {
            return (FromPage) Enum.valueOf(FromPage.class, str);
        }

        public static FromPage[] values() {
            return (FromPage[]) f325872d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ForceUpdateShowCloseAnalytics.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/version_conflict/analytics/ForceUpdateShowCloseAnalytics$HowClosed;", "", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HowClosed {

        /* renamed from: b, reason: collision with root package name */
        public static final HowClosed f325874b;

        /* renamed from: c, reason: collision with root package name */
        public static final HowClosed f325875c;

        /* renamed from: d, reason: collision with root package name */
        public static final HowClosed f325876d;

        /* renamed from: e, reason: collision with root package name */
        public static final HowClosed f325877e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ HowClosed[] f325878f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f325879g;

        static {
            HowClosed howClosed = new HowClosed("Update", 0);
            f325874b = howClosed;
            HowClosed howClosed2 = new HowClosed("Refuse", 1);
            f325875c = howClosed2;
            HowClosed howClosed3 = new HowClosed("X", 2);
            HowClosed howClosed4 = new HowClosed("GoToMav", 3);
            f325876d = howClosed4;
            HowClosed howClosed5 = new HowClosed("NoPermission", 4);
            f325877e = howClosed5;
            HowClosed[] howClosedArr = {howClosed, howClosed2, howClosed3, howClosed4, howClosed5};
            f325878f = howClosedArr;
            f325879g = kotlin.enums.c.a(howClosedArr);
        }

        public HowClosed() {
            throw null;
        }

        public static HowClosed valueOf(String str) {
            return (HowClosed) Enum.valueOf(HowClosed.class, str);
        }

        public static HowClosed[] values() {
            return (HowClosed[]) f325878f.clone();
        }
    }

    /* compiled from: ForceUpdateShowCloseAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return ForceUpdateShowCloseAnalytics.this.f325866b.a();
        }
    }

    @Inject
    public ForceUpdateShowCloseAnalytics(@k InterfaceC28373a interfaceC28373a, @k C35793f6 c35793f6) {
        this.f325865a = interfaceC28373a;
        this.f325866b = c35793f6;
    }

    public final void a(@k HowClosed howClosed) {
        if (!this.f325868d || this.f325869e) {
            return;
        }
        this.f325869e = true;
        this.f325865a.c(new com.avito.android.version_conflict.analytics.a(howClosed, (String) this.f325867c.getValue()));
    }
}
