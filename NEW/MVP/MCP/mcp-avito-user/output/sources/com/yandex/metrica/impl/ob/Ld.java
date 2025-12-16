package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Map;

@Deprecated
/* loaded from: classes7.dex */
public class Ld extends Kd {

    /* renamed from: l, reason: collision with root package name */
    private static final Rd f378790l = new Rd("UUID", null);

    /* renamed from: m, reason: collision with root package name */
    private static final Rd f378791m = new Rd("DEVICEID_3", null);

    /* renamed from: n, reason: collision with root package name */
    private static final Rd f378792n = new Rd("AD_URL_GET", null);

    /* renamed from: o, reason: collision with root package name */
    private static final Rd f378793o = new Rd("AD_URL_REPORT", null);

    /* renamed from: p, reason: collision with root package name */
    private static final Rd f378794p = new Rd("HOST_URL", null);

    /* renamed from: q, reason: collision with root package name */
    private static final Rd f378795q = new Rd("SERVER_TIME_OFFSET", null);

    /* renamed from: r, reason: collision with root package name */
    private static final Rd f378796r = new Rd("CLIDS", null);

    /* renamed from: f, reason: collision with root package name */
    private Rd f378797f;

    /* renamed from: g, reason: collision with root package name */
    private Rd f378798g;

    /* renamed from: h, reason: collision with root package name */
    private Rd f378799h;

    /* renamed from: i, reason: collision with root package name */
    private Rd f378800i;

    /* renamed from: j, reason: collision with root package name */
    private Rd f378801j;

    /* renamed from: k, reason: collision with root package name */
    private Rd f378802k;

    public Ld(Context context) {
        super(context, null);
        this.f378797f = new Rd(f378790l.b());
        this.f378798g = new Rd(f378791m.b());
        this.f378799h = new Rd(f378792n.b());
        this.f378800i = new Rd(f378793o.b());
        new Rd(f378794p.b());
        this.f378801j = new Rd(f378795q.b());
        this.f378802k = new Rd(f378796r.b());
    }

    public long a(long j12) {
        return this.f378704b.getLong(this.f378801j.b(), j12);
    }

    public String b(String str) {
        return this.f378704b.getString(this.f378799h.a(), null);
    }

    public String c(String str) {
        return this.f378704b.getString(this.f378800i.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.Kd
    public String d() {
        return "_startupinfopreferences";
    }

    public String e(String str) {
        return this.f378704b.getString(this.f378798g.a(), null);
    }

    public String f(String str) {
        return this.f378704b.getString(this.f378797f.a(), null);
    }

    public Map<String, ?> g() {
        return this.f378704b.getAll();
    }

    public String d(String str) {
        return this.f378704b.getString(this.f378802k.a(), null);
    }

    public Ld f() {
        return (Ld) e();
    }
}
