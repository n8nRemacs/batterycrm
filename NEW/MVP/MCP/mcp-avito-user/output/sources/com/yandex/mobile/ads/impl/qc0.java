package com.yandex.mobile.ads.impl;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class qc0 {

    /* renamed from: a, reason: collision with root package name */
    private final to1 f389142a;

    private qc0(to1 to1Var) {
        this.f389142a = to1Var;
    }

    public final void a() throws JSONException {
        l70 l70Var = l70.f387403b;
        xp1.a(this.f389142a);
        JSONObject jSONObject = new JSONObject();
        gp1.a(jSONObject, "interactionType", l70Var);
        wp1.a(this.f389142a.i().e(), "adUserInteraction", jSONObject);
    }

    public final void b() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("bufferFinish");
    }

    public final void c() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("bufferStart");
    }

    public final void d() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("complete");
    }

    public final void e() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("firstQuartile");
    }

    public final void f() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("midpoint");
    }

    public final void g() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("pause");
    }

    public final void h() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("resume");
    }

    public final void i() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("skipped");
    }

    public final void j() {
        xp1.a(this.f389142a);
        this.f389142a.i().a("thirdQuartile");
    }

    public final void b(float f12) throws JSONException {
        if (f12 < 0.0f || f12 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        xp1.a(this.f389142a);
        JSONObject jSONObject = new JSONObject();
        gp1.a(jSONObject, "mediaPlayerVolume", Float.valueOf(f12));
        gp1.a(jSONObject, "deviceVolume", Float.valueOf(cq1.a().d()));
        wp1.a(this.f389142a.i().e(), "volumeChange", jSONObject);
    }

    public static qc0 a(to1 to1Var) {
        if (to1Var.l()) {
            if (!to1Var.g()) {
                if (!to1Var.j()) {
                    if (to1Var.i().d() == null) {
                        qc0 qc0Var = new qc0(to1Var);
                        to1Var.i().a(qc0Var);
                        return qc0Var;
                    }
                    throw new IllegalStateException("MediaEvents already exists for AdSession");
                }
                throw new IllegalStateException("AdSession is finished");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    public final void a(float f12) throws JSONException {
        if (f12 > 0.0f) {
            xp1.a(this.f389142a);
            JSONObject jSONObject = new JSONObject();
            gp1.a(jSONObject, "duration", Float.valueOf(f12));
            gp1.a(jSONObject, "mediaPlayerVolume", Float.valueOf(0.0f));
            gp1.a(jSONObject, "deviceVolume", Float.valueOf(cq1.a().d()));
            wp1.a(this.f389142a.i().e(), "start", jSONObject);
            return;
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }
}
