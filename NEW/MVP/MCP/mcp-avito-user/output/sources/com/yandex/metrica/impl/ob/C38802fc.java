package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.fc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38802fc extends Pb {

    /* renamed from: com.yandex.metrica.impl.ob.fc$a */
    public class a implements InterfaceC38827gc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38827gc
        public void a(long j12) {
            C38802fc.this.f379162a.h(j12);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38827gc
        public long getLastAttemptTimeSeconds() {
            return C38802fc.this.f379162a.c(0L);
        }
    }

    public C38802fc(@j.N Cc cc2, @j.N C38774e9 c38774e9) {
        this(cc2, c38774e9, new G1());
    }

    @Override // com.yandex.metrica.impl.ob.Pb
    @j.N
    public InterfaceC38827gc a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.ob.Pb
    @j.N
    public String b() {
        return "gps";
    }

    @Override // com.yandex.metrica.impl.ob.Pb
    @j.N
    public String c() {
        return "gps";
    }

    @j.k0
    public C38802fc(@j.N Cc cc2, @j.N C38774e9 c38774e9, @j.N G1 g12) {
        super(cc2, c38774e9, g12);
    }

    @Override // com.yandex.metrica.impl.ob.Pb
    @j.N
    public InterfaceC39291zd a(@j.N C39267yd c39267yd) {
        return this.f379164c.c(c39267yd);
    }
}
