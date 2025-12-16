package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes7.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final W0 f378715a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final W0 f378716b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final W0 f378717c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final W0 f378718d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final W0 f378719e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final W0 f378720f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final W0 f378721g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final W0 f378722h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final W0 f378723i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final W0 f378724j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final W0 f378725k;

    /* renamed from: l, reason: collision with root package name */
    private final long f378726l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private final C38811fl f378727m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final C39096ra f378728n;

    /* renamed from: o, reason: collision with root package name */
    private final long f378729o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final Xh f378730p;

    public L(@j.N C39057pi c39057pi, @j.N C39289zb c39289zb, @j.P Map<String, String> map) {
        this(a(c39057pi.V()), a(c39057pi.i()), a(c39057pi.j()), a(c39057pi.G()), a(c39057pi.p()), a(Tl.a(Tl.a(c39057pi.n()))), a(Tl.a(map)), new W0(c39289zb.a().f381928a == null ? null : c39289zb.a().f381928a.f381872b, c39289zb.a().f381929b, c39289zb.a().f381930c), new W0(c39289zb.b().f381928a == null ? null : c39289zb.b().f381928a.f381872b, c39289zb.b().f381929b, c39289zb.b().f381930c), new W0(c39289zb.c().f381928a != null ? c39289zb.c().f381928a.f381872b : null, c39289zb.c().f381929b, c39289zb.c().f381930c), a(Tl.b(c39057pi.h())), new C38811fl(c39057pi), c39057pi.l(), C38689b.a(), c39057pi.C() + c39057pi.O().a(), a(c39057pi.f().f379415x));
    }

    @j.N
    public W0 a() {
        return this.f378721g;
    }

    @j.N
    public W0 b() {
        return this.f378725k;
    }

    @j.N
    public W0 c() {
        return this.f378716b;
    }

    @j.N
    public W0 d() {
        return this.f378717c;
    }

    @j.N
    public C39096ra e() {
        return this.f378728n;
    }

    @j.N
    public Xh f() {
        return this.f378730p;
    }

    @j.N
    public W0 g() {
        return this.f378722h;
    }

    @j.N
    public W0 h() {
        return this.f378719e;
    }

    @j.N
    public W0 i() {
        return this.f378723i;
    }

    public long j() {
        return this.f378729o;
    }

    @j.N
    public W0 k() {
        return this.f378718d;
    }

    @j.N
    public W0 l() {
        return this.f378720f;
    }

    public long m() {
        return this.f378726l;
    }

    @j.P
    public C38811fl n() {
        return this.f378727m;
    }

    @j.N
    public W0 o() {
        return this.f378715a;
    }

    @j.N
    public W0 p() {
        return this.f378724j;
    }

    public String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f378715a + ", mDeviceIdData=" + this.f378716b + ", mDeviceIdHashData=" + this.f378717c + ", mReportAdUrlData=" + this.f378718d + ", mGetAdUrlData=" + this.f378719e + ", mResponseClidsData=" + this.f378720f + ", mClientClidsForRequestData=" + this.f378721g + ", mGaidData=" + this.f378722h + ", mHoaidData=" + this.f378723i + ", yandexAdvIdData=" + this.f378724j + ", customSdkHostsData=" + this.f378725k + ", customSdkHosts=" + this.f378725k + ", mServerTimeOffset=" + this.f378726l + ", mUiAccessConfig=" + this.f378727m + ", diagnosticsConfigsHolder=" + this.f378728n + ", nextStartupTime=" + this.f378729o + ", features=" + this.f378730p + '}';
    }

    @j.N
    private static Bundle a(@j.N Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("value", parcelable);
        return bundle;
    }

    @j.P
    private static C38811fl b(@j.N Bundle bundle) {
        return (C38811fl) a(bundle.getBundle("UiAccessConfig"), C38811fl.class.getClassLoader());
    }

    public void c(@j.N Bundle bundle) {
        bundle.putBundle("Uuid", a(this.f378715a));
        bundle.putBundle("DeviceId", a(this.f378716b));
        bundle.putBundle("DeviceIdHash", a(this.f378717c));
        bundle.putBundle("AdUrlReport", a(this.f378718d));
        bundle.putBundle("AdUrlGet", a(this.f378719e));
        bundle.putBundle("Clids", a(this.f378720f));
        bundle.putBundle("RequestClids", a(this.f378721g));
        bundle.putBundle("GAID", a(this.f378722h));
        bundle.putBundle("HOAID", a(this.f378723i));
        bundle.putBundle("YANDEX_ADV_ID", a(this.f378724j));
        bundle.putBundle("CUSTOM_SDK_HOSTS", a(this.f378725k));
        bundle.putBundle("UiAccessConfig", a(this.f378727m));
        bundle.putBundle("DiagnosticsConfigsHolder", a(this.f378728n));
        bundle.putLong("ServerTimeOffset", this.f378726l);
        bundle.putLong("NextStartupTime", this.f378729o);
        bundle.putBundle("features", a(this.f378730p));
    }

    @j.P
    private static Parcelable a(@j.P Bundle bundle, @j.P ClassLoader classLoader) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return bundle.getParcelable("value");
    }

    @j.N
    private static W0 b(@j.N Bundle bundle, @j.N String str) {
        W0 w02 = (W0) a(bundle.getBundle(str), W0.class.getClassLoader());
        return w02 == null ? new W0(null, U0.UNKNOWN, "bundle serialization error") : w02;
    }

    @j.N
    private static C39096ra a(@j.N Bundle bundle) {
        C39096ra c39096ra = (C39096ra) a(bundle.getBundle("DiagnosticsConfigsHolder"), C39096ra.class.getClassLoader());
        return c39096ra == null ? new C39096ra() : c39096ra;
    }

    @j.N
    private static Xh a(@j.N Bundle bundle, @j.N String str) {
        Xh xh2 = (Xh) a(bundle.getBundle(str), Xh.class.getClassLoader());
        return xh2 == null ? new Xh(null, U0.UNKNOWN, "bundle serialization error") : xh2;
    }

    @j.N
    private static W0 a(@j.P String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new W0(str, zIsEmpty ? U0.UNKNOWN : U0.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    @j.N
    private static Xh a(@j.P Boolean bool) {
        boolean z12 = bool != null;
        return new Xh(bool, z12 ? U0.OK : U0.UNKNOWN, z12 ? null : "no identifier in startup state");
    }

    public L(@j.N Bundle bundle) {
        this(b(bundle, "Uuid"), b(bundle, "DeviceId"), b(bundle, "DeviceIdHash"), b(bundle, "AdUrlReport"), b(bundle, "AdUrlGet"), b(bundle, "Clids"), b(bundle, "RequestClids"), b(bundle, "GAID"), b(bundle, "HOAID"), b(bundle, "YANDEX_ADV_ID"), b(bundle, "CUSTOM_SDK_HOSTS"), b(bundle), a(bundle), bundle.getLong("ServerTimeOffset"), bundle.getLong("NextStartupTime"), a(bundle, "features"));
    }

    public L(@j.N W0 w02, @j.N W0 w03, @j.N W0 w04, @j.N W0 w05, @j.N W0 w06, @j.N W0 w07, @j.N W0 w08, @j.N W0 w09, @j.N W0 w010, @j.N W0 w011, @j.N W0 w012, @j.P C38811fl c38811fl, @j.N C39096ra c39096ra, long j12, long j13, @j.N Xh xh2) {
        this.f378715a = w02;
        this.f378716b = w03;
        this.f378717c = w04;
        this.f378718d = w05;
        this.f378719e = w06;
        this.f378720f = w07;
        this.f378721g = w08;
        this.f378722h = w09;
        this.f378723i = w010;
        this.f378724j = w011;
        this.f378725k = w012;
        this.f378727m = c38811fl;
        this.f378728n = c39096ra;
        this.f378726l = j12;
        this.f378729o = j13;
        this.f378730p = xh2;
    }
}
