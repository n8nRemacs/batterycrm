package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* loaded from: classes7.dex */
public class Jd extends Kd {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f378577j = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Rd f378578f;

    /* renamed from: g, reason: collision with root package name */
    private final Rd f378579g;

    /* renamed from: h, reason: collision with root package name */
    private final Rd f378580h;

    /* renamed from: i, reason: collision with root package name */
    private final Rd f378581i;

    public Jd(Context context, String str) {
        super(context, str);
        this.f378578f = new Rd("init_event_pref_key", c());
        this.f378579g = new Rd("init_event_pref_key");
        this.f378580h = new Rd("first_event_pref_key", c());
        this.f378581i = new Rd("fitst_event_description_key", c());
    }

    private void a(Rd rd2) {
        this.f378704b.edit().remove(rd2.a()).apply();
    }

    @Deprecated
    public String b(String str) {
        return this.f378704b.getString(this.f378579g.a(), null);
    }

    public String c(String str) {
        return this.f378704b.getString(this.f378580h.a(), null);
    }

    @Override // com.yandex.metrica.impl.ob.Kd
    public String d() {
        return "_initpreferences";
    }

    @Deprecated
    public void f() {
        a(this.f378579g);
    }

    public void g() {
        a(this.f378581i);
    }

    public void h() {
        a(this.f378580h);
    }

    public void i() {
        a(this.f378578f);
    }

    public void j() {
        a(this.f378578f.a(), "DONE").b();
    }

    public String d(String str) {
        return this.f378704b.getString(this.f378578f.a(), null);
    }
}
