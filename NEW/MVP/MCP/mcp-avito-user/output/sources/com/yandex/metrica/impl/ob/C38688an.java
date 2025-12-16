package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.an, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38688an {

    /* renamed from: a, reason: collision with root package name */
    private final C38763dn f380135a;

    /* renamed from: b, reason: collision with root package name */
    private final C38763dn f380136b;

    /* renamed from: c, reason: collision with root package name */
    private final Wm f380137c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38737cm f380138d;

    /* renamed from: e, reason: collision with root package name */
    private final String f380139e;

    public C38688an(int i12, int i13, int i14, @j.N String str, @j.N C38737cm c38737cm) {
        this(new Wm(i12), new C38763dn(i13, androidx.appcompat.app.r.q(str, "map key"), c38737cm), new C38763dn(i14, androidx.appcompat.app.r.q(str, "map value"), c38737cm), str, c38737cm);
    }

    public Wm a() {
        return this.f380137c;
    }

    public C38763dn b() {
        return this.f380135a;
    }

    public C38763dn c() {
        return this.f380136b;
    }

    public void a(@j.N String str) {
        if (this.f380138d.isEnabled()) {
            this.f380138d.fw("The %s has reached the limit of %d items. Item with key %s will be ignored", this.f380139e, Integer.valueOf(this.f380137c.a()), str);
        }
    }

    @j.k0
    public C38688an(@j.N Wm wm2, @j.N C38763dn c38763dn, @j.N C38763dn c38763dn2, @j.N String str, @j.N C38737cm c38737cm) {
        this.f380137c = wm2;
        this.f380135a = c38763dn;
        this.f380136b = c38763dn2;
        this.f380139e = str;
        this.f380138d = c38737cm;
    }
}
