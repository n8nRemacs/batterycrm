package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39197vf;

/* loaded from: classes7.dex */
public class Ye extends Ne<String> {

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC38813fn<String> f379965g;

    public Ye(@j.N String str, @j.N String str2, @j.N InterfaceC38813fn<String> interfaceC38813fn, @j.N Kn<String> kn2, @j.N Ke ke2) {
        super(0, str, str2, kn2, ke2);
        this.f379965g = interfaceC38813fn;
    }

    @Override // com.yandex.metrica.impl.ob.Ne
    public void a(@j.N C39197vf.a aVar) {
        String strA = this.f379965g.a(f());
        aVar.f382073d.f382076a = strA == null ? new byte[0] : strA.getBytes();
    }
}
