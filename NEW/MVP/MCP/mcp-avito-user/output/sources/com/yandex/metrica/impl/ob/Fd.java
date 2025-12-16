package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class Fd implements InterfaceC39219wd {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private Set<String> f378140a;

    public Fd(@j.P List<Bd> list) {
        if (list == null) {
            this.f378140a = new HashSet();
            return;
        }
        this.f378140a = new HashSet(list.size());
        for (Bd bd2 : list) {
            if (bd2.f377846b) {
                this.f378140a.add(bd2.f377845a);
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39219wd
    public boolean a(@j.N String str) {
        return this.f378140a.contains(str);
    }

    public String toString() {
        return AK.c.u(new StringBuilder("StartupBasedPermissionStrategy{mEnabledPermissions="), this.f378140a, '}');
    }
}
