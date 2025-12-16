package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ec, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38777ec {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38774e9 f380470a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Cc f380471b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC38827gc f380472c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38702bc f380473d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Zb f380474e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C38752dc f380475f;

    /* renamed from: com.yandex.metrica.impl.ob.ec$a */
    public class a implements InterfaceC38827gc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38827gc
        public void a(long j12) {
            C38777ec.this.f380470a.g(j12);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38827gc
        public long getLastAttemptTimeSeconds() {
            return C38777ec.this.f380470a.b(0L);
        }
    }

    public C38777ec(@j.N Cc cc2, @j.N C38774e9 c38774e9, @j.N Pc pc2) {
        this.f380471b = cc2;
        this.f380470a = c38774e9;
        InterfaceC38827gc interfaceC38827gcB = b();
        this.f380472c = interfaceC38827gcB;
        this.f380474e = a(interfaceC38827gcB);
        this.f380473d = a();
        this.f380475f = a(pc2);
    }

    @j.N
    private InterfaceC38827gc b() {
        return new a();
    }

    @j.N
    private C38702bc a() {
        return new C38702bc(this.f380471b.f377899a.f379362b);
    }

    @j.N
    private Zb a(@j.N InterfaceC38827gc interfaceC38827gc) {
        return new Zb(interfaceC38827gc, new C39232x2());
    }

    @j.N
    private C38752dc a(@j.N Pc pc2) {
        Sb sb2 = this.f380471b.f377899a;
        return new C38752dc(sb2.f379361a, pc2, sb2.f379362b, sb2.f379363c);
    }

    @j.N
    public Ec<C38727cc> a(@j.P C38727cc c38727cc) {
        return new Ec<>(this.f380475f, this.f380474e, new Ob(this.f380472c, new com.yandex.metrica.coreutils.services.e()), this.f380473d, c38727cc);
    }
}
