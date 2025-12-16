package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.InterfaceC38705bf;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Qe;
import com.yandex.metrica.impl.ob.Re;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;
import com.yandex.metrica.impl.ob.Wm;
import j.N;

/* loaded from: classes7.dex */
public final class NumberAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final Pe f382491a;

    public NumberAttribute(@N String str, @N Qe qe2, @N Re re2) {
        this.f382491a = new Pe(str, qe2, re2);
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValue(double d12) {
        return new UserProfileUpdate<>(new Te(this.f382491a.a(), d12, new Qe(), new Me(new Re(new Wm(100)))));
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValueIfUndefined(double d12) {
        return new UserProfileUpdate<>(new Te(this.f382491a.a(), d12, new Qe(), new We(new Re(new Wm(100)))));
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValueReset() {
        return new UserProfileUpdate<>(new Ve(1, this.f382491a.a(), new Qe(), new Re(new Wm(100))));
    }
}
