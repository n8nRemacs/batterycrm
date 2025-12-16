package com.yandex.metrica.impl.ob;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.a9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38674a9 extends AbstractC38749d9 {

    /* renamed from: c, reason: collision with root package name */
    private final Rd f380112c;

    /* renamed from: d, reason: collision with root package name */
    private final Rd f380113d;

    public C38674a9(S7 s72) {
        super(s72);
        this.f380112c = new Rd("init_event_pref_key");
        this.f380113d = new Rd("first_event_pref_key");
    }

    @Deprecated
    public boolean f() {
        return a(this.f380113d.a(), (String) null) != null;
    }

    @Deprecated
    public String g(String str) {
        return a(this.f380112c.a(), (String) null);
    }

    @j.N
    @Deprecated
    public C38674a9 h() {
        return (C38674a9) f(this.f380113d.a());
    }

    @j.N
    @Deprecated
    public C38674a9 i() {
        return (C38674a9) f(this.f380112c.a());
    }

    @Deprecated
    public void j() {
        b(this.f380113d.a(), "DONE").d();
    }

    @Deprecated
    public void k() {
        b(this.f380112c.a(), "DONE").d();
    }

    @Deprecated
    public boolean g() {
        return a(this.f380112c.a(), (String) null) != null;
    }
}
