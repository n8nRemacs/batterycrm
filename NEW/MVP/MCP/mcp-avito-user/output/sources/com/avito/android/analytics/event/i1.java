package com.avito.android.analytics.event;

import android.annotation.SuppressLint;
import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: WriteToSellerTreeEvent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/event/i1;", "Lcom/avito/android/analytics/provider/clickstream/c;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i1 extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final a f90069v = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f90070f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f90071g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f90072h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f90073i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Boolean f90074j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f90075k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f90076l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f90077m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f90078n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f90079o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f90080p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f90081q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final Boolean f90082r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f90083s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final String f90084t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final String f90085u;

    /* compiled from: WriteToSellerTreeEvent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/avito/android/analytics/event/i1$a;", "", "<init>", "()V", "", "FROM_BLOCK_IAC_FALLBACK", "I", "FROM_BLOCK_PORTFOLIO", "", "FROM_PAGE_SAFE_DEAL_CHECKOUT", "Ljava/lang/String;", "SOURCE_ADVERT_SCREEN", "SOURCE_ADVERT_SNIPPET", "SOURCE_AVITO_BLACK", "SOURCE_AVITO_FOR_BUSINESS", "SOURCE_AVITO_MALL", "SOURCE_CHAT_HISTORY", "SOURCE_DISCOUNTS_DIALOG", "SOURCE_FAVORITES", "SOURCE_IN_APP_CALLS_FALLBACK", "SOURCE_JOB_APPLIES", "SOURCE_PORTFOLIO_GALLERY", "SOURCE_PORTFOLIO_PROJECT", "SOURCE_SAFE_SHOW_DIALOG", "SOURCE_XL_ADVERT_SNIPPET", "VERSION", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ i1(C29640d c29640d, InterfaceC28373a interfaceC28373a, long j12, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, C42822w c42822w) {
        this(c29640d, interfaceC28373a, j12, str, str2, str3, num, str4, str5, str6, str7);
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "iid", this.f90072h);
        String str = this.f90073i;
        if (str != null) {
            j(linkedHashMap, "cid", str);
        }
        Boolean bool = this.f90074j;
        if (bool != null) {
            j(linkedHashMap, "oc", bool);
        }
        String str2 = this.f90075k;
        if (str2 != null) {
            j(linkedHashMap, "mid", str2);
        }
        String str3 = this.f90076l;
        if (str3 != null) {
            j(linkedHashMap, "lid", str3);
        }
        String str4 = this.f90077m;
        if (str4 != null) {
            j(linkedHashMap, "sid", str4);
        }
        String str5 = this.f90078n;
        if (str5 != null) {
            j(linkedHashMap, "from_page", str5);
        }
        String str6 = this.f90081q;
        if (str6 != null) {
            j(linkedHashMap, "x", str6);
        }
        String str7 = this.f90070f;
        if (str7 != null) {
            j(linkedHashMap, "wsrc", str7);
        }
        Integer num = this.f90071g;
        if (num != null) {
            j(linkedHashMap, "from_block", num);
        }
        String str8 = this.f90079o;
        if (str8 != null) {
            j(linkedHashMap, "user_key", str8);
        }
        String str9 = this.f90080p;
        if (str9 != null) {
            j(linkedHashMap, "buyer_profile_session", str9);
        }
        Boolean bool2 = this.f90082r;
        if (bool2 != null) {
            j(linkedHashMap, "is_multiitems_variation", bool2);
        }
        String str10 = this.f90083s;
        if (str10 != null) {
            j(linkedHashMap, "multiitem_source", str10);
        }
        String str11 = this.f90084t;
        if (str11 != null) {
            j(linkedHashMap, "multiitem_click_param_name", str11);
        }
        String str12 = this.f90085u;
        if (str12 != null) {
            j(linkedHashMap, "from_space", str12);
        }
        j(linkedHashMap, "business_platform", 3);
        return linkedHashMap;
    }

    public /* synthetic */ i1(C29640d c29640d, InterfaceC28373a interfaceC28373a, long j12, TreeClickStreamParent treeClickStreamParent, String str, String str2, boolean z12, String str3, String str4, String str5, String str6, int i12, String str7, String str8, Boolean bool, String str9, String str10, String str11, int i13, C42822w c42822w) {
        this(c29640d, interfaceC28373a, j12, treeClickStreamParent, str, str2, z12, str3, str4, str5, str6, i12, str7, (i13 & 8192) != 0 ? null : str8, bool, str9, str10, str11);
    }

    @SuppressLint({"VisibleForTests"})
    public i1(@Y61.k C29640d c29640d, @Y61.k InterfaceC28373a interfaceC28373a, long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k String str, @Y61.l String str2, boolean z12, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k String str6, int i12, @Y61.l String str7, @Y61.l String str8, @Y61.l Boolean bool, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11) {
        super(j12, treeClickStreamParent, 2654, 24);
        this.f90070f = str6;
        this.f90071g = Integer.valueOf(i12);
        this.f90072h = str;
        this.f90073i = str2;
        this.f90074j = Boolean.valueOf(z12);
        this.f90075k = str3;
        this.f90076l = str4;
        this.f90077m = str5;
        this.f90078n = str8;
        String strB = C35800g5.b(new C35792f5(str7));
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[30];
        if (((Boolean) c29640d.f132179D.a().invoke()).booleanValue() && (strB == null || !(!C43066x.K(strB)))) {
            interfaceC28373a.c(new NonFatalErrorEvent(j1.a(str, str7), null, null, null, 14, null));
        }
        this.f90081q = strB;
        this.f90082r = bool;
        this.f90083s = str9;
        this.f90084t = str10;
        this.f90085u = str11;
    }

    public /* synthetic */ i1(C29640d c29640d, InterfaceC28373a interfaceC28373a, long j12, TreeClickStreamParent treeClickStreamParent, String str, String str2, Integer num, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this(c29640d, interfaceC28373a, j12, treeClickStreamParent, str, str2, num, str3, str4, (i12 & 512) != 0 ? null : str5);
    }

    @SuppressLint({"VisibleForTests"})
    public i1(@Y61.k C29640d c29640d, @Y61.k InterfaceC28373a interfaceC28373a, long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k String str, @Y61.k String str2, @Y61.l Integer num, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        super(j12, treeClickStreamParent, 2654, 24);
        this.f90070f = str2;
        this.f90071g = num;
        this.f90072h = str;
        this.f90078n = str3;
        this.f90073i = str5;
        String strB = C35800g5.b(new C35792f5(str4));
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[30];
        if (((Boolean) c29640d.f132179D.a().invoke()).booleanValue() && (strB == null || !(!C43066x.K(strB)))) {
            interfaceC28373a.c(new NonFatalErrorEvent(j1.a(str, str4), null, null, null, 14, null));
        }
        this.f90081q = strB;
    }

    public /* synthetic */ i1(C29640d c29640d, InterfaceC28373a interfaceC28373a, long j12, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this(c29640d, interfaceC28373a, j12, str, str2, str3, num, str4, str5, str6, (i12 & 1024) != 0 ? null : str7);
    }

    public i1(C29640d c29640d, InterfaceC28373a interfaceC28373a, long j12, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7) {
        super(j12, null, 2654, 24);
        this.f90078n = str;
        this.f90079o = str2;
        this.f90080p = str3;
        this.f90071g = num;
        String strB = C35800g5.b(new C35792f5(str4));
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[30];
        if (((Boolean) c29640d.f132179D.a().invoke()).booleanValue() && (strB == null || !(!C43066x.K(strB)))) {
            interfaceC28373a.c(new NonFatalErrorEvent(j1.a(str6, str4), null, null, null, 14, null));
        }
        this.f90081q = strB;
        this.f90085u = str5;
        this.f90072h = str6;
        this.f90073i = str7;
    }
}
