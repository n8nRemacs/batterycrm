package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class im3 extends ck0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public wgg j;

    @Override // defpackage.ck0
    public void e() {
        for (gm3 gm3Var : this.h.values()) {
            gm3Var.a.d(gm3Var.b);
        }
    }

    @Override // defpackage.ck0
    public void g() {
        for (gm3 gm3Var : this.h.values()) {
            gm3Var.a.f(gm3Var.b);
        }
    }

    @Override // defpackage.ck0
    public void k() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((gm3) it.next()).a.k();
        }
    }

    @Override // defpackage.ck0
    public void q() {
        HashMap map = this.h;
        for (gm3 gm3Var : map.values()) {
            ck0 ck0Var = gm3Var.a;
            em3 em3Var = gm3Var.c;
            ck0Var.p(gm3Var.b);
            ck0Var.s(em3Var);
            ck0Var.r(em3Var);
        }
        map.clear();
    }

    public final void u(Object obj) {
        gm3 gm3Var = (gm3) this.h.get(obj);
        gm3Var.getClass();
        gm3Var.a.d(gm3Var.b);
    }

    public abstract d99 v(Object obj, d99 d99Var);

    public long w(Object obj, long j, d99 d99Var) {
        return j;
    }

    public int x(int i, Object obj) {
        return i;
    }

    public abstract void y(Object obj, ck0 ck0Var, s9g s9gVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [dm3, f99] */
    public final void z(final Object obj, ck0 ck0Var) {
        HashMap map = this.h;
        hsi.b(!map.containsKey(obj));
        ?? r1 = new f99() { // from class: dm3
            @Override // defpackage.f99
            public final void a(ck0 ck0Var2, s9g s9gVar) {
                this.a.y(obj, ck0Var2, s9gVar);
            }
        };
        em3 em3Var = new em3(this, obj);
        map.put(obj, new gm3(ck0Var, r1, em3Var));
        Handler handler = this.i;
        handler.getClass();
        ck0Var.getClass();
        lk6 lk6Var = ck0Var.c;
        lk6Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) lk6Var.d;
        l99 l99Var = new l99();
        l99Var.a = handler;
        l99Var.b = em3Var;
        copyOnWriteArrayList.add(l99Var);
        Handler handler2 = this.i;
        handler2.getClass();
        d55 d55Var = ck0Var.d;
        d55Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = d55Var.c;
        c55 c55Var = new c55();
        c55Var.a = handler2;
        c55Var.b = em3Var;
        copyOnWriteArrayList2.add(c55Var);
        wgg wggVar = this.j;
        n4c n4cVar = this.g;
        hsi.h(n4cVar);
        ck0Var.l(r1, wggVar, n4cVar);
        if (this.b.isEmpty()) {
            ck0Var.d(r1);
        }
    }
}
