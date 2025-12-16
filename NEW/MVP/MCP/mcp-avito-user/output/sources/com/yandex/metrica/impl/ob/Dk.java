package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
class Dk implements Yk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39009nk f377983a;

    public Dk() {
        this(new C39009nk());
    }

    @Override // com.yandex.metrica.impl.ob.Yk
    public boolean a(@j.P String str, @j.N C39227wl c39227wl) {
        if (!c39227wl.f382150g) {
            return !A2.a("allow-parsing", str);
        }
        this.f377983a.getClass();
        return A2.a("do-not-parse", str);
    }

    @j.k0
    public Dk(@j.N C39009nk c39009nk) {
        this.f377983a = c39009nk;
    }
}
