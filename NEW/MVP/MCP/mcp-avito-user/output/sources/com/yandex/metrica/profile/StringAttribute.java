package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.C38763dn;
import com.yandex.metrica.impl.ob.InterfaceC38705bf;
import com.yandex.metrica.impl.ob.Je;
import com.yandex.metrica.impl.ob.Kn;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;
import com.yandex.metrica.impl.ob.Ye;
import j.N;

/* loaded from: classes7.dex */
public class StringAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final C38763dn f382492a;

    /* renamed from: b, reason: collision with root package name */
    public final Pe f382493b;

    public StringAttribute(@N String str, @N C38763dn c38763dn, @N Kn kn2, @N Je je2) {
        this.f382493b = new Pe(str, kn2, je2);
        this.f382492a = c38763dn;
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValue(@N String str) {
        Pe pe2 = this.f382493b;
        return new UserProfileUpdate<>(new Ye(pe2.a(), str, this.f382492a, pe2.b(), new Me(pe2.c())));
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValueIfUndefined(@N String str) {
        Pe pe2 = this.f382493b;
        return new UserProfileUpdate<>(new Ye(pe2.a(), str, this.f382492a, pe2.b(), new We(pe2.c())));
    }

    @N
    public UserProfileUpdate<? extends InterfaceC38705bf> withValueReset() {
        Pe pe2 = this.f382493b;
        return new UserProfileUpdate<>(new Ve(0, pe2.a(), pe2.b(), pe2.c()));
    }
}
