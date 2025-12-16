package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* loaded from: classes7.dex */
public class Nd extends Kd {

    /* renamed from: h, reason: collision with root package name */
    private static final Rd f378996h = new Rd("SERVICE_API_LEVEL", null);

    /* renamed from: i, reason: collision with root package name */
    private static final Rd f378997i = new Rd("CLIENT_API_LEVEL", null);

    /* renamed from: f, reason: collision with root package name */
    private Rd f378998f;

    /* renamed from: g, reason: collision with root package name */
    private Rd f378999g;

    public Nd(Context context) {
        super(context, null);
        this.f378998f = new Rd(f378996h.b());
        this.f378999g = new Rd(f378997i.b());
    }

    @Override // com.yandex.metrica.impl.ob.Kd
    public String d() {
        return "_migrationpreferences";
    }

    public int f() {
        return this.f378704b.getInt(this.f378998f.a(), -1);
    }

    public Nd g() {
        a(this.f378999g.a());
        return this;
    }

    @Deprecated
    public Nd h() {
        a(this.f378998f.a());
        return this;
    }
}
