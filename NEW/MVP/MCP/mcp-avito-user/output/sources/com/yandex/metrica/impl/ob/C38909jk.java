package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;

/* renamed from: com.yandex.metrica.impl.ob.jk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38909jk implements Cl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f380905a;

    public C38909jk(@j.N String str) {
        this.f380905a = str;
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    public boolean a(@j.N Object obj) {
        return ((String) obj).contains(this.f380905a);
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    @j.N
    public C39107rl.b a() {
        return C39107rl.b.CONTAINS;
    }
}
