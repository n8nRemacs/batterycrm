package com.yandex.metrica.impl.ob;

import okhttp3.internal.connection.RealConnection;

/* renamed from: com.yandex.metrica.impl.ob.b6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38696b6 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final L3 f380150a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38671a6 f380151b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final a f380152c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final A0 f380153d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final U5<W5> f380154e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final U5<W5> f380155f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private V5 f380156g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private b f380157h;

    /* renamed from: com.yandex.metrica.impl.ob.b6$a */
    public interface a {
        void a(@j.N C38715c0 c38715c0, @j.N C38721c6 c38721c6);
    }

    /* renamed from: com.yandex.metrica.impl.ob.b6$b */
    public enum b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C38696b6(@j.N L3 l32, @j.N C38671a6 c38671a6, @j.N a aVar) {
        this(l32, c38671a6, aVar, new T5(l32, c38671a6), new S5(l32, c38671a6), new A0(l32.g()));
    }

    private void e(@j.N C38715c0 c38715c0) {
        if (this.f380157h == null) {
            V5 v5B = ((R5) this.f380154e).b();
            if (a(v5B, c38715c0)) {
                this.f380156g = v5B;
                this.f380157h = b.FOREGROUND;
                return;
            }
            V5 v5B2 = ((R5) this.f380155f).b();
            if (a(v5B2, c38715c0)) {
                this.f380156g = v5B2;
                this.f380157h = b.BACKGROUND;
            } else {
                this.f380156g = null;
                this.f380157h = b.EMPTY;
            }
        }
    }

    public synchronized long a() {
        V5 v52;
        v52 = this.f380156g;
        return v52 == null ? RealConnection.IDLE_CONNECTION_HEALTHY_NS : v52.c() - 1;
    }

    @j.N
    public C38721c6 b(@j.N C38715c0 c38715c0) {
        return a(c(c38715c0), c38715c0.e());
    }

    @j.N
    public synchronized V5 c(@j.N C38715c0 c38715c0) {
        try {
            e(c38715c0);
            b bVar = this.f380157h;
            b bVar2 = b.EMPTY;
            if (bVar != bVar2 && !a(this.f380156g, c38715c0)) {
                this.f380157h = bVar2;
                this.f380156g = null;
            }
            int iOrdinal = this.f380157h.ordinal();
            if (iOrdinal == 1) {
                this.f380156g.c(c38715c0.e());
                return this.f380156g;
            }
            if (iOrdinal == 2) {
                return this.f380156g;
            }
            this.f380157h = b.BACKGROUND;
            long jE2 = c38715c0.e();
            V5 v5A = ((R5) this.f380155f).a(new W5(jE2, c38715c0.f()));
            if (this.f380150a.x().k()) {
                this.f380152c.a(C38715c0.a(c38715c0, this.f380153d), a(v5A, c38715c0.e()));
            } else if (c38715c0.o() == EnumC38666a1.EVENT_TYPE_FIRST_ACTIVATION.b()) {
                this.f380152c.a(c38715c0, a(v5A, jE2));
                this.f380152c.a(C38715c0.a(c38715c0, this.f380153d), a(v5A, jE2));
            }
            this.f380156g = v5A;
            return v5A;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d(@j.N C38715c0 c38715c0) {
        try {
            e(c38715c0);
            int iOrdinal = this.f380157h.ordinal();
            if (iOrdinal == 0) {
                this.f380156g = a(c38715c0);
            } else if (iOrdinal == 1) {
                b(this.f380156g, c38715c0);
                this.f380156g = a(c38715c0);
            } else if (iOrdinal == 2) {
                if (a(this.f380156g, c38715c0)) {
                    this.f380156g.c(c38715c0.e());
                } else {
                    this.f380156g = a(c38715c0);
                }
            }
        } finally {
        }
    }

    @j.N
    public C38721c6 f(@j.N C38715c0 c38715c0) {
        V5 v5B;
        if (this.f380157h == null) {
            v5B = ((R5) this.f380154e).b();
            if (v5B == null ? false : v5B.b(c38715c0.e())) {
                v5B = ((R5) this.f380155f).b();
                if (v5B != null ? v5B.b(c38715c0.e()) : false) {
                    v5B = null;
                }
            }
        } else {
            v5B = this.f380156g;
        }
        if (v5B != null) {
            return new C38721c6().c(v5B.c()).a(v5B.e()).b(v5B.d()).a(v5B.f());
        }
        long jF2 = c38715c0.f();
        long jA2 = this.f380151b.a();
        L7 l7I = this.f380150a.i();
        EnumC38796f6 enumC38796f6 = EnumC38796f6.BACKGROUND;
        l7I.a(jA2, enumC38796f6, jF2);
        return new C38721c6().c(jA2).a(enumC38796f6).a(0L).b(0L);
    }

    public synchronized void g(@j.N C38715c0 c38715c0) {
        try {
            c(c38715c0).a(false);
            b bVar = this.f380157h;
            b bVar2 = b.EMPTY;
            if (bVar != bVar2) {
                b(this.f380156g, c38715c0);
            }
            this.f380157h = bVar2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.N
    private V5 a(@j.N C38715c0 c38715c0) {
        long jE2 = c38715c0.e();
        V5 v5A = ((R5) this.f380154e).a(new W5(jE2, c38715c0.f()));
        this.f380157h = b.FOREGROUND;
        this.f380150a.l().c();
        this.f380152c.a(C38715c0.a(c38715c0, this.f380153d), a(v5A, jE2));
        return v5A;
    }

    private void b(@j.N V5 v52, @j.P C38715c0 c38715c0) {
        if (v52.h()) {
            this.f380152c.a(C38715c0.a(c38715c0), new C38721c6().c(v52.c()).a(v52.f()).a(v52.e()).b(v52.b()));
            v52.a(false);
        }
        v52.i();
    }

    @j.k0
    public C38696b6(@j.N L3 l32, @j.N C38671a6 c38671a6, @j.N a aVar, @j.N U5<W5> u52, @j.N U5<W5> u53, @j.N A0 a02) {
        this.f380157h = null;
        this.f380150a = l32;
        this.f380152c = aVar;
        this.f380154e = u52;
        this.f380155f = u53;
        this.f380151b = c38671a6;
        this.f380153d = a02;
    }

    private boolean a(@j.P V5 v52, @j.N C38715c0 c38715c0) {
        if (v52 == null) {
            return false;
        }
        if (v52.b(c38715c0.e())) {
            return true;
        }
        b(v52, c38715c0);
        return false;
    }

    @j.N
    private C38721c6 a(@j.N V5 v52, long j12) {
        return new C38721c6().c(v52.c()).a(v52.e()).b(v52.a(j12)).a(v52.f());
    }
}
