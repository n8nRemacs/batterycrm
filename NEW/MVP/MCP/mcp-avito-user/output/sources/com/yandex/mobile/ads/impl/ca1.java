package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jd0;
import j.InterfaceC42153i;

/* loaded from: classes8.dex */
public abstract class ca1 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private a f384228a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private pd f384229b;

    public interface a {
        void a();
    }

    public abstract da1 a(vx0[] vx0VarArr, w91 w91Var, jd0.b bVar, i91 i91Var);

    public void a(jc jcVar) {
    }

    public abstract void a(@j.P Object obj);

    public final void b() {
        a aVar = this.f384228a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public boolean c() {
        return this instanceof lp;
    }

    @InterfaceC42153i
    public void d() {
        this.f384228a = null;
        this.f384229b = null;
    }

    @InterfaceC42153i
    public final void a(a aVar, pd pdVar) {
        this.f384228a = aVar;
        this.f384229b = pdVar;
    }

    public final pd a() {
        return (pd) db.b(this.f384229b);
    }
}
