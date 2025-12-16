package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;

/* renamed from: com.yandex.metrica.impl.ob.tk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39154tk implements Cl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f381895a;

    public C39154tk(@j.N String str) {
        this.f381895a = str;
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    public boolean a(@j.N Object obj) {
        return ((String) obj).equals(this.f381895a);
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    @j.N
    public C39107rl.b a() {
        return C39107rl.b.EQUALS;
    }
}
