package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39197vf;

/* loaded from: classes7.dex */
public abstract class Ne<T> extends Se {

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final T f379000f;

    public Ne(int i12, @j.N String str, @j.N T t12, @j.N Kn<String> kn2, @j.N Ke ke2) {
        super(i12, str, kn2, ke2);
        this.f379000f = t12;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38705bf
    public void a(@j.N C38680af c38680af) {
        C39197vf.a aVarA;
        if (!e() || (aVarA = b().a(c38680af, c38680af.a(d(), c()), this)) == null) {
            return;
        }
        a(aVarA);
    }

    public abstract void a(@j.N C39197vf.a aVar);

    @j.N
    public T f() {
        return this.f379000f;
    }
}
