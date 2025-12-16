package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.F3;
import com.yandex.metrica.impl.ob.F4;
import com.yandex.metrica.impl.ob.M4;

/* loaded from: classes7.dex */
public class N4<T extends M4, C extends F3> extends F4<T, C> {

    public class a implements F4.a<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38993n4 f378970a;

        public a(N4 n42, C38993n4 c38993n4) {
            this.f378970a = c38993n4;
        }

        @Override // com.yandex.metrica.impl.ob.F4.a
        public boolean a(Object obj, C38715c0 c38715c0) {
            return ((M4) obj).a(c38715c0, this.f378970a);
        }
    }

    public N4(@j.N K4<T> k42, @j.N C c12) {
        super(k42, c12);
    }

    public boolean a(@j.N C38715c0 c38715c0, @j.N C38993n4 c38993n4) {
        return a(c38715c0, new a(this, c38993n4));
    }
}
