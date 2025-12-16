package com.yandex.metrica.impl.ob;

import org.json.JSONException;

/* loaded from: classes7.dex */
public class O3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Y8 f379028a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38698b8 f379029b;

    public O3(@j.N C38698b8 c38698b8) {
        this(c38698b8, new Y8(c38698b8));
    }

    public int a() {
        int iB2 = this.f379029b.b();
        this.f379029b.a(iB2 + 1);
        return iB2;
    }

    @j.k0
    public O3(@j.N C38698b8 c38698b8, @j.N Y8 y82) {
        this.f379029b = c38698b8;
        this.f379028a = y82;
    }

    public int a(int i12) throws JSONException {
        int iA2 = this.f379028a.a(i12);
        this.f379028a.a(i12, iA2 + 1);
        return iA2;
    }
}
