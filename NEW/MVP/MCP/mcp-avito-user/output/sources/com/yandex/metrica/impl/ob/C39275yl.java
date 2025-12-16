package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.yl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39275yl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final M0 f382268a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39227wl f382269b;

    /* renamed from: com.yandex.metrica.impl.ob.yl$a */
    public static class a {
    }

    @j.k0
    public C39275yl(@j.N C39227wl c39227wl, @j.N M0 m02) {
        this.f382269b = c39227wl;
        this.f382268a = m02;
    }

    public void a(@j.N String str, @j.P Throwable th2) {
        if (this.f382269b.f382149f) {
            this.f382268a.reportError(str, th2);
        }
    }
}
