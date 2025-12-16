package com.yandex.metrica.impl.ob;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class V5 {

    /* renamed from: a, reason: collision with root package name */
    private final L3 f379758a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC38746d6 f379759b;

    /* renamed from: c, reason: collision with root package name */
    private final X5 f379760c;

    /* renamed from: d, reason: collision with root package name */
    private long f379761d;

    /* renamed from: e, reason: collision with root package name */
    private long f379762e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicLong f379763f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f379764g;

    /* renamed from: h, reason: collision with root package name */
    private volatile a f379765h;

    /* renamed from: i, reason: collision with root package name */
    private long f379766i;

    /* renamed from: j, reason: collision with root package name */
    private long f379767j;

    /* renamed from: k, reason: collision with root package name */
    private com.yandex.metrica.coreutils.services.e f379768k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f379769a;

        /* renamed from: b, reason: collision with root package name */
        private final String f379770b;

        /* renamed from: c, reason: collision with root package name */
        private final String f379771c;

        /* renamed from: d, reason: collision with root package name */
        private final String f379772d;

        /* renamed from: e, reason: collision with root package name */
        private final String f379773e;

        /* renamed from: f, reason: collision with root package name */
        private final int f379774f;

        /* renamed from: g, reason: collision with root package name */
        private final int f379775g;

        public a(JSONObject jSONObject) {
            this.f379769a = jSONObject.optString("analyticsSdkVersionName", null);
            this.f379770b = jSONObject.optString("kitBuildNumber", null);
            this.f379771c = jSONObject.optString("appVer", null);
            this.f379772d = jSONObject.optString("appBuild", null);
            this.f379773e = jSONObject.optString("osVer", null);
            this.f379774f = jSONObject.optInt("osApiLev", -1);
            this.f379775g = jSONObject.optInt("attribution_id", 0);
        }

        public boolean a(Lg lg2) {
            lg2.getClass();
            return TextUtils.equals("5.3.0", this.f379769a) && TextUtils.equals("45003240", this.f379770b) && TextUtils.equals(lg2.f(), this.f379771c) && TextUtils.equals(lg2.b(), this.f379772d) && TextUtils.equals(lg2.o(), this.f379773e) && this.f379774f == lg2.n() && this.f379775g == lg2.C();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("SessionRequestParams{mKitVersionName='");
            sb2.append(this.f379769a);
            sb2.append("', mKitBuildNumber='");
            sb2.append(this.f379770b);
            sb2.append("', mAppVersion='");
            sb2.append(this.f379771c);
            sb2.append("', mAppBuild='");
            sb2.append(this.f379772d);
            sb2.append("', mOsVersion='");
            sb2.append(this.f379773e);
            sb2.append("', mApiLevel=");
            sb2.append(this.f379774f);
            sb2.append(", mAttributionId=");
            return androidx.appcompat.app.r.t(sb2, this.f379775g, '}');
        }
    }

    public V5(L3 l32, InterfaceC38746d6 interfaceC38746d6, X5 x52, com.yandex.metrica.coreutils.services.e eVar) {
        this.f379758a = l32;
        this.f379759b = interfaceC38746d6;
        this.f379760c = x52;
        this.f379768k = eVar;
        g();
    }

    private void g() {
        X5 x52 = this.f379760c;
        this.f379768k.getClass();
        this.f379762e = x52.a(SystemClock.elapsedRealtime());
        this.f379761d = this.f379760c.c(-1L);
        this.f379763f = new AtomicLong(this.f379760c.b(0L));
        this.f379764g = this.f379760c.a(true);
        long jE2 = this.f379760c.e(0L);
        this.f379766i = jE2;
        this.f379767j = this.f379760c.d(jE2 - this.f379762e);
    }

    public long a(long j12) {
        InterfaceC38746d6 interfaceC38746d6 = this.f379759b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j12 - this.f379762e);
        this.f379767j = seconds;
        ((C38771e6) interfaceC38746d6).b(seconds);
        return this.f379767j;
    }

    public long b() {
        return Math.max(this.f379766i - TimeUnit.MILLISECONDS.toSeconds(this.f379762e), this.f379767j);
    }

    public long c() {
        return this.f379761d;
    }

    public long d() {
        return this.f379767j;
    }

    public long e() {
        long andIncrement = this.f379763f.getAndIncrement();
        ((C38771e6) this.f379759b).c(this.f379763f.get()).b();
        return andIncrement;
    }

    public EnumC38796f6 f() {
        return this.f379760c.a();
    }

    public boolean h() {
        return this.f379764g && this.f379761d > 0;
    }

    public synchronized void i() {
        ((C38771e6) this.f379759b).a();
        this.f379765h = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Session{mId=");
        sb2.append(this.f379761d);
        sb2.append(", mInitTime=");
        sb2.append(this.f379762e);
        sb2.append(", mCurrentReportId=");
        sb2.append(this.f379763f);
        sb2.append(", mSessionRequestParams=");
        sb2.append(this.f379765h);
        sb2.append(", mSleepStartSeconds=");
        return androidx.appcompat.app.r.u(sb2, this.f379766i, '}');
    }

    public boolean b(long j12) {
        boolean z12 = this.f379761d >= 0;
        boolean zA2 = a();
        this.f379768k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = this.f379766i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return z12 && zA2 && !(((timeUnit.toSeconds(jElapsedRealtime) > j13 ? 1 : (timeUnit.toSeconds(jElapsedRealtime) == j13 ? 0 : -1)) < 0) || ((timeUnit.toSeconds(j12) - j13) > ((long) this.f379760c.a(this.f379758a.m().N())) ? 1 : ((timeUnit.toSeconds(j12) - j13) == ((long) this.f379760c.a(this.f379758a.m().N())) ? 0 : -1)) >= 0 || (timeUnit.toSeconds(j12 - this.f379762e) > Y5.f379952b ? 1 : (timeUnit.toSeconds(j12 - this.f379762e) == Y5.f379952b ? 0 : -1)) >= 0);
    }

    public void c(long j12) {
        InterfaceC38746d6 interfaceC38746d6 = this.f379759b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j12);
        this.f379766i = seconds;
        ((C38771e6) interfaceC38746d6).e(seconds).b();
    }

    public void a(boolean z12) {
        if (this.f379764g != z12) {
            this.f379764g = z12;
            ((C38771e6) this.f379759b).a(z12).b();
        }
    }

    private boolean a() {
        if (this.f379765h == null) {
            synchronized (this) {
                if (this.f379765h == null) {
                    try {
                        String asString = this.f379758a.i().a(this.f379761d, this.f379760c.a()).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            this.f379765h = new a(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        a aVar = this.f379765h;
        if (aVar != null) {
            return aVar.a(this.f379758a.m());
        }
        return false;
    }
}
