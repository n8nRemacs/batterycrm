package com.yandex.metrica.impl.ob;

import android.util.Base64;

/* renamed from: com.yandex.metrica.impl.ob.je, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38903je implements Ge {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Dm f380897a;

    public C38903je() {
        this(new Dm());
    }

    @Override // com.yandex.metrica.impl.ob.Ge
    @j.N
    public byte[] a(@j.N C39077qe c39077qe, @j.N Lg lg2) {
        byte[] bArrDecode = new byte[0];
        String str = c39077qe.f381470b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return this.f380897a.a(c39077qe.f381486r).a(bArrDecode);
    }

    @j.k0
    public C38903je(@j.N Dm dm2) {
        this.f380897a = dm2;
    }
}
