package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39197vf;

/* loaded from: classes7.dex */
public abstract class Se implements InterfaceC38705bf, Ie {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f379377a;

    /* renamed from: b, reason: collision with root package name */
    private final int f379378b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Kn<String> f379379c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Ke f379380d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private C38737cm f379381e = Ul.a();

    public Se(int i12, @j.N String str, @j.N Kn<String> kn2, @j.N Ke ke2) {
        this.f379378b = i12;
        this.f379377a = str;
        this.f379379c = kn2;
        this.f379380d = ke2;
    }

    @j.N
    public final C39197vf.a a() {
        C39197vf.a aVar = new C39197vf.a();
        aVar.f382071b = this.f379378b;
        aVar.f382070a = this.f379377a.getBytes();
        aVar.f382073d = new C39197vf.c();
        aVar.f382072c = new C39197vf.b();
        return aVar;
    }

    @j.N
    public Ke b() {
        return this.f379380d;
    }

    @j.N
    public String c() {
        return this.f379377a;
    }

    public int d() {
        return this.f379378b;
    }

    public boolean e() {
        In inA = this.f379379c.a(this.f379377a);
        if (inA.b()) {
            return true;
        }
        if (!this.f379381e.isEnabled()) {
            return false;
        }
        this.f379381e.w("Attribute " + this.f379377a + " of type " + Ze.a(this.f379378b) + " is skipped because " + inA.a());
        return false;
    }

    public void a(@j.N C38737cm c38737cm) {
        this.f379381e = c38737cm;
    }
}
