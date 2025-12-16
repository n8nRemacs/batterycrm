package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.F4;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.S4;

/* loaded from: classes7.dex */
public class L4<T extends S4, C extends L3> extends F4<T, C> {

    public class a implements F4.a<T> {
        public a(L4 l42) {
        }

        @Override // com.yandex.metrica.impl.ob.F4.a
        public boolean a(Object obj, C38715c0 c38715c0) {
            return ((S4) obj).a(c38715c0);
        }
    }

    public L4(K4<T> k42, C c12) {
        super(k42, c12);
    }

    public boolean a(C38715c0 c38715c0) {
        return a(c38715c0, new a(this));
    }
}
