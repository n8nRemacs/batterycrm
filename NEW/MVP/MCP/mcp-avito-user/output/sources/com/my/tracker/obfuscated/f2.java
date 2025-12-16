package com.my.tracker.obfuscated;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import com.my.tracker.config.AntiFraudConfig;
import java.net.URI;

/* loaded from: classes7.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    private final MyTrackerParams f365611a = new MyTrackerParams();

    /* renamed from: b, reason: collision with root package name */
    private String f365612b = "";

    /* renamed from: c, reason: collision with root package name */
    private AntiFraudConfig f365613c = AntiFraudConfig.newBuilder().build();

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f365614d = true;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f365615e = false;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f365616f = true;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f365617g = true;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f365618h = true;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f365619i = true;

    /* renamed from: j, reason: collision with root package name */
    private volatile int f365620j = 30;

    /* renamed from: k, reason: collision with root package name */
    private volatile int f365621k = 0;

    /* renamed from: l, reason: collision with root package name */
    private volatile int f365622l = 900;

    /* renamed from: m, reason: collision with root package name */
    private volatile String f365623m = null;

    /* renamed from: n, reason: collision with root package name */
    private volatile String f365624n = null;

    /* renamed from: o, reason: collision with root package name */
    private volatile MyTrackerConfig.InstalledPackagesProvider f365625o = null;

    /* renamed from: p, reason: collision with root package name */
    private volatile MyTrackerConfig.OkHttpClientProvider f365626p = null;

    /* renamed from: q, reason: collision with root package name */
    private volatile String f365627q = b(Constants.SCHEME, "tracker-api.my.com", null);

    /* renamed from: r, reason: collision with root package name */
    private volatile String f365628r = a(Constants.SCHEME, "ts.tracker-api.my.com/mobile", null);

    /* renamed from: s, reason: collision with root package name */
    private volatile MyTracker.AttributionListener f365629s = null;

    /* renamed from: t, reason: collision with root package name */
    private volatile Handler f365630t = null;

    private f2() {
    }

    public static f2 u() {
        return new f2();
    }

    public AntiFraudConfig a() {
        return this.f365613c;
    }

    public String b() {
        return this.f365623m;
    }

    public Handler c() {
        return this.f365630t;
    }

    public MyTracker.AttributionListener d() {
        return this.f365629s;
    }

    public int e() {
        return this.f365622l;
    }

    public int f() {
        return this.f365621k;
    }

    public String g() {
        return this.f365612b;
    }

    public MyTrackerConfig.InstalledPackagesProvider h() {
        return this.f365625o;
    }

    public int i() {
        return this.f365620j;
    }

    public MyTrackerParams j() {
        return this.f365611a;
    }

    public MyTrackerConfig.OkHttpClientProvider k() {
        return this.f365626p;
    }

    public String l() {
        return this.f365628r;
    }

    public String m() {
        return this.f365627q;
    }

    public String n() {
        return this.f365624n;
    }

    public boolean o() {
        return this.f365617g;
    }

    public boolean p() {
        return this.f365616f;
    }

    public boolean q() {
        return this.f365614d;
    }

    public boolean r() {
        return this.f365615e;
    }

    public boolean s() {
        return this.f365618h;
    }

    public boolean t() {
        return this.f365619i;
    }

    public void v() {
        this.f365624n = "com.my.games.vendorapp";
    }

    private static String a(String str, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        if (TextUtils.isEmpty(str)) {
            str = Constants.SCHEME;
        }
        Uri.Builder builderEncodedAuthority = builder.scheme(str).encodedAuthority(str2);
        if (!TextUtils.isEmpty(str3)) {
            builderEncodedAuthority = builderEncodedAuthority.encodedPath(str3);
        }
        return builderEncodedAuthority.appendEncodedPath("v1").toString();
    }

    private static String b(String str, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        if (TextUtils.isEmpty(str)) {
            str = Constants.SCHEME;
        }
        Uri.Builder builderEncodedAuthority = builder.scheme(str).encodedAuthority(str2);
        if (!TextUtils.isEmpty(str3)) {
            builderEncodedAuthority = builderEncodedAuthority.encodedPath(str3);
        }
        return builderEncodedAuthority.appendEncodedPath("v3/").toString();
    }

    public void c(int i12) {
        StringBuilder sb2;
        String str;
        int i13 = 7200;
        if (i12 <= 7200) {
            i13 = 30;
            if (i12 < 30) {
                sb2 = new StringBuilder("Invalid launchTimeout value ");
                sb2.append(i12);
                str = ", timeout set to min 30";
            }
            this.f365620j = i12;
        }
        sb2 = new StringBuilder("Invalid launchTimeout value ");
        sb2.append(i12);
        str = ", timeout set to max 7200";
        sb2.append(str);
        e2.a(sb2.toString());
        i12 = i13;
        this.f365620j = i12;
    }

    public void d(int i12) {
        c(i12 != 0 ? i12 != 1 ? null : "eu.tracker-api.my.com" : "ru.tracker-api.my.com");
    }

    public void e(boolean z12) {
        this.f365618h = z12;
    }

    public void f(boolean z12) {
        this.f365619i = z12;
    }

    public void a(int i12) {
        StringBuilder sb2;
        String str;
        int i13 = 86400;
        if (i12 <= 86400) {
            i13 = 1;
            if (i12 < 1) {
                sb2 = new StringBuilder("Invalid bufferingPeriod value ");
                sb2.append(i12);
                str = ", bufferingPeriod set to min 1";
            }
            this.f365622l = i12;
        }
        sb2 = new StringBuilder("Invalid bufferingPeriod value ");
        sb2.append(i12);
        str = ", bufferingPeriod set to max 86400";
        sb2.append(str);
        e2.a(sb2.toString());
        i12 = i13;
        this.f365622l = i12;
    }

    public void b(int i12) {
        if (i12 > 432000) {
            e2.a("Invalid forcingPeriod value " + i12 + ", forcingPeriod set to max 432000");
            this.f365621k = 432000;
            return;
        }
        if (i12 < 0) {
            e2.a("Invalid forcingPeriod value " + i12 + ", forcingPeriod set to min 0");
            i12 = 0;
        }
        this.f365621k = i12;
    }

    public void c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                this.f365627q = b(Constants.SCHEME, "tracker-api.my.com", null);
                this.f365628r = a(Constants.SCHEME, "ts.tracker-api.my.com/mobile", null);
                return;
            }
            URI uri = str.contains("://") ? new URI(str) : new URI("https://".concat(str));
            this.f365627q = b(uri.getScheme(), uri.getAuthority(), uri.getPath());
            this.f365628r = a(uri.getScheme(), uri.getAuthority(), uri.getPath());
            e2.a("set tracker url to " + this.f365627q);
        } catch (Throwable unused) {
            this.f365627q = b(Constants.SCHEME, "tracker-api.my.com", null);
            this.f365628r = a(Constants.SCHEME, "ts.tracker-api.my.com/mobile", null);
            e2.b("unable to set invalid url " + this.f365627q + ", using default");
        }
    }

    public void d(String str) {
        this.f365624n = str;
    }

    public void a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.f365629s = attributionListener;
        this.f365630t = handler;
    }

    public void b(String str) {
        this.f365612b = str;
    }

    public void c(boolean z12) {
        this.f365614d = z12;
    }

    public void d(boolean z12) {
        this.f365615e = z12;
    }

    public void a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.f365625o = installedPackagesProvider;
    }

    public void b(boolean z12) {
        this.f365616f = z12;
    }

    public void a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f365626p = okHttpClientProvider;
    }

    public void a(AntiFraudConfig antiFraudConfig) {
        this.f365613c = antiFraudConfig;
    }

    public void a(a1 a1Var) {
        a1Var.c(this.f365612b);
        this.f365611a.putDataToBuilder(a1Var);
        int i12 = this.f365620j;
        if (i12 != 30) {
            a1Var.c(i12);
        }
        int i13 = this.f365622l;
        if (i13 != 900) {
            a1Var.a(i13);
        }
        int i14 = this.f365621k;
        if (i14 != 0) {
            a1Var.b(i14);
        }
        if (!this.f365615e) {
            a1Var.l();
        }
        if (!this.f365614d) {
            a1Var.k();
        }
        if (!this.f365616f) {
            a1Var.j();
        }
        if (!this.f365617g) {
            a1Var.b();
        }
        if (!this.f365618h) {
            a1Var.f();
        }
        if (!this.f365619i) {
            a1Var.g();
        }
        if (!this.f365613c.useLightSensor) {
            a1Var.d();
        }
        if (!this.f365613c.useMagneticFieldSensor) {
            a1Var.e();
        }
        if (!this.f365613c.useGyroscope) {
            a1Var.c();
        }
        if (!this.f365613c.usePressureSensor) {
            a1Var.h();
        }
        if (this.f365613c.useProximitySensor) {
            return;
        }
        a1Var.i();
    }

    public void a(String str) {
        this.f365623m = str;
    }

    public void a(boolean z12) {
        this.f365617g = z12;
    }
}
