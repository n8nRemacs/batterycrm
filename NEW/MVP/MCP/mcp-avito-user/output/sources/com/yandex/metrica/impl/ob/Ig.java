package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Tl;

/* loaded from: classes7.dex */
public class Ig {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f378487a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f378488b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    @Deprecated
    public final String f378489c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final String f378490d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final String f378491e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final String f378492f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final String f378493g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final String f378494h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public final String f378495i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final String f378496j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public final String f378497k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public final String f378498l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public final String f378499m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public final String f378500n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public final String f378501o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public final String f378502p;

    public Ig(@j.N Tl.a aVar) {
        this.f378487a = aVar.c("dId");
        this.f378488b = aVar.c("uId");
        this.f378489c = aVar.b("kitVer");
        this.f378490d = aVar.c("analyticsSdkVersionName");
        this.f378491e = aVar.c("kitBuildNumber");
        this.f378492f = aVar.c("kitBuildType");
        this.f378493g = aVar.c("appVer");
        this.f378494h = aVar.optString("app_debuggable", "0");
        this.f378495i = aVar.c("appBuild");
        this.f378496j = aVar.c("osVer");
        this.f378498l = aVar.c("lang");
        this.f378499m = aVar.c("root");
        this.f378502p = aVar.c("commit_hash");
        this.f378500n = aVar.optString("app_framework", C38842h2.a());
        int iOptInt = aVar.optInt("osApiLev", -1);
        this.f378497k = iOptInt == -1 ? null : String.valueOf(iOptInt);
        int iOptInt2 = aVar.optInt("attribution_id", 0);
        this.f378501o = iOptInt2 > 0 ? String.valueOf(iOptInt2) : null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb2.append(this.f378487a);
        sb2.append("', uuid='");
        sb2.append(this.f378488b);
        sb2.append("', kitVersion='");
        sb2.append(this.f378489c);
        sb2.append("', analyticsSdkVersionName='");
        sb2.append(this.f378490d);
        sb2.append("', kitBuildNumber='");
        sb2.append(this.f378491e);
        sb2.append("', kitBuildType='");
        sb2.append(this.f378492f);
        sb2.append("', appVersion='");
        sb2.append(this.f378493g);
        sb2.append("', appDebuggable='");
        sb2.append(this.f378494h);
        sb2.append("', appBuildNumber='");
        sb2.append(this.f378495i);
        sb2.append("', osVersion='");
        sb2.append(this.f378496j);
        sb2.append("', osApiLevel='");
        sb2.append(this.f378497k);
        sb2.append("', locale='");
        sb2.append(this.f378498l);
        sb2.append("', deviceRootStatus='");
        sb2.append(this.f378499m);
        sb2.append("', appFramework='");
        sb2.append(this.f378500n);
        sb2.append("', attributionId='");
        sb2.append(this.f378501o);
        sb2.append("', commitHash='");
        return AK.c.s(sb2, this.f378502p, "'}");
    }

    public Ig() {
        this.f378487a = null;
        this.f378488b = null;
        this.f378489c = null;
        this.f378490d = null;
        this.f378491e = null;
        this.f378492f = null;
        this.f378493g = null;
        this.f378494h = null;
        this.f378495i = null;
        this.f378496j = null;
        this.f378497k = null;
        this.f378498l = null;
        this.f378499m = null;
        this.f378500n = null;
        this.f378501o = null;
        this.f378502p = null;
    }
}
