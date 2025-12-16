package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ik, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38884ik {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<Object> f380793a;

    public C38884ik(@j.N List<Object> list) {
        this.f380793a = list;
    }

    @j.P
    public C39107rl.b a(@j.N String str) {
        Iterator<Object> it = this.f380793a.iterator();
        while (it.hasNext()) {
            Cl cl2 = (Cl) it.next();
            if (cl2.a(str)) {
                return cl2.a();
            }
        }
        return null;
    }
}
