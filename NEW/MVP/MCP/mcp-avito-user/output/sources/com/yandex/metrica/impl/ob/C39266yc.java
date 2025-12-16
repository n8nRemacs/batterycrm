package com.yandex.metrica.impl.ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.yc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39266yc {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private C38976mc f382237a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private V f382238b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private Location f382239c = null;

    /* renamed from: d, reason: collision with root package name */
    private long f382240d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private C39232x2 f382241e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private Sc f382242f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private Rb f382243g;

    public C39266yc(@j.P C38976mc c38976mc, @j.N V v12, @j.P Location location, long j12, @j.N C39232x2 c39232x2, @j.N Sc sc2, @j.N Rb rb2) {
        this.f382237a = c38976mc;
        this.f382238b = v12;
        this.f382240d = j12;
        this.f382241e = c39232x2;
        this.f382242f = sc2;
        this.f382243g = rb2;
    }

    private boolean b(@j.P Location location) {
        C38976mc c38976mc;
        if (location == null || (c38976mc = this.f382237a) == null) {
            return false;
        }
        if (this.f382239c != null) {
            boolean zA2 = this.f382241e.a(this.f382240d, c38976mc.f381037a, "isSavedLocationOutdated");
            boolean z12 = location.distanceTo(this.f382239c) > this.f382237a.f381038b;
            boolean z13 = this.f382239c == null || location.getTime() - this.f382239c.getTime() >= 0;
            if ((!zA2 && !z12) || !z13) {
                return false;
            }
        }
        return true;
    }

    public void a(@j.P Location location) {
        if (b(location)) {
            this.f382239c = location;
            this.f382240d = System.currentTimeMillis();
            this.f382238b.a(location);
            this.f382242f.a();
            this.f382243g.a();
        }
    }

    public void a(@j.P C38976mc c38976mc) {
        this.f382237a = c38976mc;
    }
}
