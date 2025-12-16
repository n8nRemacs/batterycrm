package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.InterfaceC38705bf;
import com.yandex.metrica.impl.ob.Je;
import com.yandex.metrica.impl.ob.Kn;
import com.yandex.metrica.impl.ob.Le;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;
import j.N;

/* loaded from: classes7.dex */
public class BooleanAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final Pe f382488a;

    public BooleanAttribute(@N String str, @N Kn<String> kn2, @N Je je2) {
        this.f382488a = new Pe(str, kn2, je2);
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValue(boolean z12) {
        Pe pe2 = this.f382488a;
        return new UserProfileUpdate<>(new Le(pe2.a(), z12, pe2.b(), new Me(pe2.c())));
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValueIfUndefined(boolean z12) {
        Pe pe2 = this.f382488a;
        return new UserProfileUpdate<>(new Le(pe2.a(), z12, pe2.b(), new We(pe2.c())));
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValueReset() {
        Pe pe2 = this.f382488a;
        return new UserProfileUpdate<>(new Ve(3, pe2.a(), pe2.b(), pe2.c()));
    }
}
