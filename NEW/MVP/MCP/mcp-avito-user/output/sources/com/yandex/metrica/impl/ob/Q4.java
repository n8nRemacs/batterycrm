package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.D3;

/* loaded from: classes7.dex */
public class Q4 extends M4 {

    /* renamed from: b, reason: collision with root package name */
    private final C39112s2 f379245b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Vc f379246c;

    public Q4(@j.N F3 f32, @j.N C39112s2 c39112s2, @j.N Vc vc2) {
        super(f32);
        this.f379245b = c39112s2;
        this.f379246c = vc2;
    }

    @Override // com.yandex.metrica.impl.ob.M4
    public boolean a(@j.N C38715c0 c38715c0, @j.N C38993n4 c38993n4) {
        D3.a aVarA = c38993n4.b().a();
        this.f379245b.a(aVarA.f377943l);
        Boolean bool = aVarA.f377936e;
        Boolean bool2 = aVarA.f377947p;
        Boolean bool3 = Boolean.TRUE;
        if (bool3.equals(bool) || (bool == null && bool3.equals(bool2))) {
            this.f379246c.a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            this.f379246c.a(false);
        }
        return false;
    }
}
