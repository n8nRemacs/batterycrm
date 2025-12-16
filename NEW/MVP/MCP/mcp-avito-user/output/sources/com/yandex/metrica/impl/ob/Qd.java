package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* loaded from: classes7.dex */
public class Qd extends Kd {

    /* renamed from: f, reason: collision with root package name */
    private Rd f379257f;

    public Qd(Context context, String str) {
        super(context, null);
        this.f379257f = new Rd("LOCATION_TRACKING_ENABLED");
    }

    @Override // com.yandex.metrica.impl.ob.Kd
    public String d() {
        return "_serviceproviderspreferences";
    }

    public boolean f() {
        return this.f378704b.getBoolean(this.f379257f.a(), false);
    }

    public void g() {
        a(this.f379257f.a()).b();
    }
}
