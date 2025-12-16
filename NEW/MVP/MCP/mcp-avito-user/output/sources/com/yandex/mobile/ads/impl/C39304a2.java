package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39304a2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final HashMap f383383a;

    public C39304a2(@j.N List<p60> list) {
        this.f383383a = a(list);
    }

    @j.N
    public final EnumC39384z1 a(@j.N p60 p60Var) {
        EnumC39384z1 enumC39384z1 = (EnumC39384z1) this.f383383a.get(p60Var);
        return enumC39384z1 != null ? enumC39384z1 : EnumC39384z1.f392143e;
    }

    public final void a(@j.N p60 p60Var, @j.N EnumC39384z1 enumC39384z1) {
        if (enumC39384z1 == EnumC39384z1.f392140b) {
            for (p60 p60Var2 : this.f383383a.keySet()) {
                EnumC39384z1 enumC39384z12 = (EnumC39384z1) this.f383383a.get(p60Var2);
                if (EnumC39384z1.f392140b.equals(enumC39384z12) || EnumC39384z1.f392141c.equals(enumC39384z12)) {
                    this.f383383a.put(p60Var2, EnumC39384z1.f392139a);
                }
            }
        }
        this.f383383a.put(p60Var, enumC39384z1);
    }

    public final boolean a() {
        for (EnumC39384z1 enumC39384z1 : this.f383383a.values()) {
            if (enumC39384z1 == EnumC39384z1.f392145g || enumC39384z1 == EnumC39384z1.f392146h) {
                return true;
            }
        }
        return false;
    }

    @j.N
    private static HashMap a(@j.N List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.put((p60) it.next(), EnumC39384z1.f392139a);
        }
        return map;
    }
}
