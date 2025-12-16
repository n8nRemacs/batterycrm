package com.yandex.metrica.impl.ob;

import android.content.Context;

@Deprecated
/* loaded from: classes7.dex */
public class Od extends Kd {

    /* renamed from: g, reason: collision with root package name */
    private static final Rd f379043g = new Rd("PREF_KEY_OFFSET", null);

    /* renamed from: f, reason: collision with root package name */
    private Rd f379044f;

    public Od(Context context, String str) {
        super(context, str);
        this.f379044f = new Rd(f379043g.b(), null);
    }

    public long a(int i12) {
        return this.f378704b.getLong(this.f379044f.a(), i12);
    }

    @Override // com.yandex.metrica.impl.ob.Kd
    public String d() {
        return "_servertimeoffset";
    }

    public void f() {
        a(this.f379044f.a()).b();
    }
}
