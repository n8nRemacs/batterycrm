package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.InterfaceC38705bf;
import com.yandex.metrica.impl.ob.Oe;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Qe;
import com.yandex.metrica.impl.ob.Re;
import j.N;

/* loaded from: classes7.dex */
public final class CounterAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final Pe f382489a;

    public CounterAttribute(@N String str, @N Qe qe2, @N Re re2) {
        this.f382489a = new Pe(str, qe2, re2);
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withDelta(double d12) {
        return new UserProfileUpdate<>(new Oe(this.f382489a.a(), d12));
    }
}
