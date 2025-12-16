package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.pe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39053pe implements Ge {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Dm f381294a;

    public C39053pe() {
        this(new Dm());
    }

    @Override // com.yandex.metrica.impl.ob.Ge
    @j.N
    public byte[] a(@j.N C39077qe c39077qe, @j.N Lg lg2) {
        String str = c39077qe.f381470b;
        return this.f381294a.a(c39077qe.f381486r).a(str != null ? C38689b.b(str) : new byte[0]);
    }

    @j.k0
    public C39053pe(@j.N Dm dm2) {
        this.f381294a = dm2;
    }
}
