package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Mb extends Uc<Xb> {

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final String f378890c;

    public Mb(@j.N InterfaceC38827gc interfaceC38827gc, @j.N String str) {
        this(interfaceC38827gc, str, new C39232x2());
    }

    @Override // com.yandex.metrica.impl.ob.Lb
    public boolean a(@j.N Object obj) {
        Wb wb2 = ((Xb) obj).f379902b;
        return wb2 != null && a(wb2.f379816b);
    }

    @Override // com.yandex.metrica.impl.ob.Lb
    public boolean b(@j.N Object obj) {
        return ((Xb) obj).f379901a.f379255a;
    }

    @j.k0
    public Mb(@j.N InterfaceC38827gc interfaceC38827gc, @j.N String str, @j.N C39232x2 c39232x2) {
        super(interfaceC38827gc, c39232x2);
        this.f378890c = str;
    }

    @Override // com.yandex.metrica.impl.ob.Uc
    @j.N
    public String a() {
        return this.f378890c;
    }
}
