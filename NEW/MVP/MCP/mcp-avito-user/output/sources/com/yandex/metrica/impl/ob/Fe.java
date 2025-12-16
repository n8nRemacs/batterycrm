package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Fe implements Ge {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Dm f378141a;

    public Fe() {
        this(new Dm());
    }

    @Override // com.yandex.metrica.impl.ob.Ge
    @j.N
    public byte[] a(@j.N C39077qe c39077qe, @j.N Lg lg2) {
        byte[] bArrA = new byte[0];
        try {
            bArrA = L0.a(c39077qe.f381470b);
        } catch (Throwable unused) {
        }
        byte[] bArrA2 = this.f378141a.a(c39077qe.f381486r).a(bArrA);
        return bArrA2 == null ? new byte[0] : bArrA2;
    }

    @j.k0
    public Fe(@j.N Dm dm2) {
        this.f378141a = dm2;
    }
}
