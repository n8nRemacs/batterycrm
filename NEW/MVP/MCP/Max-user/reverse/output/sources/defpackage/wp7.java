package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes2.dex */
public final class wp7 extends nl0 {
    public final lr3 a;
    public final d1g b;
    public final m0g c;
    public final tw0 d;
    public final hwa e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public volatile long j;
    public final rx k = new rx();
    public final AtomicBoolean l = new AtomicBoolean(false);

    public wp7(lr3 lr3Var, d1g d1gVar, m0g m0gVar, tw0 tw0Var, hwa hwaVar, long j, long j2, long j3, String str) {
        this.a = lr3Var;
        this.b = d1gVar;
        this.c = m0gVar;
        this.d = tw0Var;
        this.e = hwaVar;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = str;
    }

    @Override // defpackage.nl0
    public final e2f a() {
        rx rxVar = this.k;
        Object obj = rxVar.a.get();
        Object obj2 = rx.o;
        if (obj == obj2 && rxVar.c != null) {
            rx rxVar2 = this.k;
            return e2f.g(rxVar2.a.get() == obj2 ? rxVar2.c : null);
        }
        rx rxVar3 = this.k;
        y6i y6iVar = new y6i(20, this);
        rxVar3.getClass();
        sra sraVar = new sra(rxVar3, new y6i(18, y6iVar), new x6i(17, y6iVar), new mn6(y6iVar));
        d1g d1gVar = this.b;
        d1gVar.getClass();
        wk3 wk3Var = new wk3(1, new ora(sraVar, new b1g(d1gVar, 1, 2), 7));
        if (this.l.get()) {
            return wk3Var;
        }
        if (!this.a.e()) {
            return e2f.f(new FetcherException(2, "No internet connection"));
        }
        this.d.d(this);
        this.l.compareAndSet(false, true);
        this.j = this.e.H(false, this.f, this.g, this.h, 0L, "", false, this.i);
        return wk3Var;
    }

    @vnf
    public final void onEvent(yah yahVar) {
        if (yahVar.a != this.j) {
            return;
        }
        rx rxVar = this.k;
        if (rxVar.a.get() == rx.o && rxVar.b == null) {
            return;
        }
        ((n0g) this.c).a().b(new qz5(yahVar, 15, this));
    }

    @vnf
    public final void onEvent(rj0 rj0Var) {
        if (rj0Var.a != this.j) {
            return;
        }
        rx rxVar = this.k;
        if (rxVar.a.get() == rx.o && rxVar.b == null) {
            return;
        }
        ((n0g) this.c).a().b(new qz5(rj0Var, 14, this));
    }
}
