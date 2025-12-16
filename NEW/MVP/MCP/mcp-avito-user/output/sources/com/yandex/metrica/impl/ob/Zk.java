package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;

/* loaded from: classes7.dex */
public class Zk implements Cl {

    /* renamed from: a, reason: collision with root package name */
    private final int f380017a;

    public Zk(int i12) {
        this.f380017a = i12;
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    public boolean a(@j.N Object obj) {
        return ((String) obj).length() > this.f380017a;
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    @j.N
    public C39107rl.b a() {
        return C39107rl.b.TEXT_TOO_LONG;
    }
}
