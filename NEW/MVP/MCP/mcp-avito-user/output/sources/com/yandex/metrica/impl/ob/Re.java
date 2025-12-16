package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39197vf;

/* loaded from: classes7.dex */
public class Re implements Je {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Wm f379302a;

    public Re(@j.N Wm wm2) {
        this.f379302a = wm2;
    }

    @Override // com.yandex.metrica.impl.ob.Je
    @j.P
    public C39197vf.a a(@j.N C38680af c38680af, @j.N C39197vf.a aVar) {
        if (c38680af.a() == this.f379302a.a()) {
            if (c38680af.a(aVar.f382071b, new String(aVar.f382070a)) != null) {
                c38680af.a(aVar);
            }
        } else if (c38680af.a() < this.f379302a.a()) {
            c38680af.a(aVar);
            c38680af.b();
        }
        return aVar;
    }
}
