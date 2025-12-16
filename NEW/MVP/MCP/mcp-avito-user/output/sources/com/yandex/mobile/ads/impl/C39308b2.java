package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.b2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39308b2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a50 f383758a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final tt0 f383759b = new tt0();

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private C39304a2 f383760c;

    public C39308b2(@j.N a50 a50Var) {
        this.f383758a = a50Var;
    }

    @j.N
    public final C39304a2 a() {
        if (this.f383760c == null) {
            y40 y40VarA = this.f383758a.a();
            this.f383759b.getClass();
            ArrayList arrayList = new ArrayList();
            p60 p60VarC = y40VarA.c();
            if (p60VarC != null) {
                arrayList.add(p60VarC);
            }
            Iterator<ut0> it = y40VarA.a().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            p60 p60VarB = y40VarA.b();
            if (p60VarB != null) {
                arrayList.add(p60VarB);
            }
            this.f383760c = new C39304a2(arrayList);
        }
        return this.f383760c;
    }
}
