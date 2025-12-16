package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.zh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C39295zh {

    /* renamed from: a, reason: collision with root package name */
    private final String f382319a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39232x2 f382320b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f382321c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39247xh f382322d;

    public C39295zh(String str, @j.N C39223wh c39223wh) {
        this(str, new C39232x2(), new com.yandex.metrica.coreutils.services.e(), new C39247xh(c39223wh));
    }

    public void a(@j.N Gh gh2, int i12, @j.N C38758di c38758di) {
        this.f382322d.a(c38758di.f380409g);
        if (this.f382320b.b(this.f382322d.a(i12), c38758di.f380409g, "report " + this.f382319a)) {
            ((Jh) gh2).a(this.f382319a, Integer.valueOf(i12));
            this.f382322d.a(i12, this.f382321c.c());
        }
    }

    @j.k0
    public C39295zh(@j.N String str, @j.N C39232x2 c39232x2, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N C39247xh c39247xh) {
        this.f382319a = str;
        this.f382320b = c39232x2;
        this.f382321c = fVar;
        this.f382322d = c39247xh;
    }
}
