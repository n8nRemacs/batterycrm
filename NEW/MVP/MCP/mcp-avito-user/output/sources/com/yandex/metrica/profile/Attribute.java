package com.yandex.metrica.profile;

import AK.c;
import com.yandex.metrica.impl.ob.C38737cm;
import com.yandex.metrica.impl.ob.C38763dn;
import com.yandex.metrica.impl.ob.Qe;
import com.yandex.metrica.impl.ob.Re;
import com.yandex.metrica.impl.ob.Wm;
import j.N;

/* loaded from: classes7.dex */
public class Attribute {
    @N
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @N
    public static BooleanAttribute customBoolean(@N String str) {
        return new BooleanAttribute(str, new Qe(), new Re(new Wm(100)));
    }

    @N
    public static CounterAttribute customCounter(@N String str) {
        return new CounterAttribute(str, new Qe(), new Re(new Wm(100)));
    }

    @N
    public static NumberAttribute customNumber(@N String str) {
        return new NumberAttribute(str, new Qe(), new Re(new Wm(100)));
    }

    @N
    public static StringAttribute customString(@N String str) {
        return new StringAttribute(str, new C38763dn(200, c.k("String attribute \"", str, "\""), C38737cm.a()), new Qe(), new Re(new Wm(100)));
    }

    @N
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @N
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @N
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}
