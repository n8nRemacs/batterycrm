package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;

/* loaded from: classes7.dex */
public class Oc {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final LocationManager f379040a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final H2 f379041b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Xj f379042c = F0.g().v();

    public Oc(@j.N Context context) {
        this.f379040a = (LocationManager) context.getSystemService("location");
        this.f379041b = H2.a(context);
    }

    @j.P
    public LocationManager a() {
        return this.f379040a;
    }

    @j.N
    public Xj b() {
        return this.f379042c;
    }

    @j.N
    public H2 c() {
        return this.f379041b;
    }
}
