package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class hm3 extends bk0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public vgg j;

    @Override // defpackage.bk0
    public final void c() {
        for (fm3 fm3Var : this.h.values()) {
            fm3Var.a.b(fm3Var.b);
        }
    }

    @Override // defpackage.bk0
    public final void e() {
        for (fm3 fm3Var : this.h.values()) {
            fm3Var.a.d(fm3Var.b);
        }
    }

    @Override // defpackage.bk0
    public void g() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((fm3) it.next()).a.g();
        }
    }

    @Override // defpackage.bk0
    public void m() {
        HashMap map = this.h;
        for (fm3 fm3Var : map.values()) {
            bk0 bk0Var = fm3Var.a;
            zva zvaVar = fm3Var.c;
            bk0Var.l(fm3Var.b);
            bk0Var.o(zvaVar);
            bk0Var.n(zvaVar);
        }
        map.clear();
    }

    public c99 p(Object obj, c99 c99Var) {
        return c99Var;
    }

    public abstract void q(Object obj, bk0 bk0Var, r9g r9gVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [cm3, e99] */
    public final void r(final Integer num, bk0 bk0Var) {
        HashMap map = this.h;
        fsi.b(!map.containsKey(num));
        ?? r1 = new e99() { // from class: cm3
            @Override // defpackage.e99
            public final void a(bk0 bk0Var2, r9g r9gVar) {
                this.a.q(num, bk0Var2, r9gVar);
            }
        };
        zva zvaVar = new zva(this, num);
        map.put(num, new fm3(bk0Var, r1, zvaVar));
        Handler handler = this.i;
        handler.getClass();
        bk0Var.getClass();
        qr4 qr4Var = bk0Var.c;
        qr4Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) qr4Var.d;
        k99 k99Var = new k99();
        k99Var.a = handler;
        k99Var.b = zvaVar;
        copyOnWriteArrayList.add(k99Var);
        this.i.getClass();
        lk6 lk6Var = bk0Var.d;
        lk6Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) lk6Var.d;
        b55 b55Var = new b55();
        b55Var.a = zvaVar;
        copyOnWriteArrayList2.add(b55Var);
        vgg vggVar = this.j;
        m4c m4cVar = this.g;
        fsi.e(m4cVar);
        bk0Var.h(r1, vggVar, m4cVar);
        if (this.b.isEmpty()) {
            bk0Var.b(r1);
        }
    }
}
