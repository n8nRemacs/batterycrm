package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes8.dex */
public final class nu {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<mu> f388378a;

    public nu(@j.N af1 af1Var) {
        this.f388378a = af1Var.a();
    }

    public final boolean a() {
        for (mu muVar : this.f388378a) {
            if (muVar.a().equals("ad_system") && muVar.b().equals("adfox")) {
                return true;
            }
        }
        return false;
    }
}
