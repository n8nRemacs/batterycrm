package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.b5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38695b5 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final M5 f380149b;

    public C38695b5(@j.N L3 l32) {
        this(l32, l32.j());
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        if (TextUtils.isEmpty(c38715c0.g())) {
            return false;
        }
        c38715c0.a(this.f380149b.a(c38715c0.g()));
        return false;
    }

    @j.k0
    public C38695b5(@j.N L3 l32, @j.N M5 m52) {
        super(l32);
        this.f380149b = m52;
    }
}
