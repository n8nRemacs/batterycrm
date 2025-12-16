package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class mn3 extends im3 {
    public static final k09 u;
    public final ArrayList k;
    public final HashSet l;
    public Handler m;
    public final ArrayList n;
    public final IdentityHashMap o;
    public final HashMap p;
    public final HashSet q;
    public boolean r;
    public HashSet s;
    public hze t;

    static {
        a09 a09Var;
        oz8 oz8Var = new oz8();
        uz8 uz8Var = new uz8();
        List list = Collections.EMPTY_LIST;
        zjd zjdVar = zjd.o;
        wz8 wz8Var = new wz8();
        d09 d09Var = d09.d;
        Uri uri = Uri.EMPTY;
        hsi.g(uz8Var.b == null || uz8Var.a != null);
        vz8 vz8Var = null;
        if (uri != null) {
            if (uz8Var.a != null) {
                vz8Var = new vz8(uz8Var);
            }
            a09Var = new a09(uri, null, vz8Var, null, list, null, zjdVar, -9223372036854775807L);
        } else {
            a09Var = null;
        }
        u = new k09("", new sz8(oz8Var), a09Var, new yz8(wz8Var), w19.K, d09Var);
    }

    public mn3(ck0... ck0VarArr) {
        hze hzeVar = new hze();
        for (ck0 ck0Var : ck0VarArr) {
            ck0Var.getClass();
        }
        this.t = hzeVar.b.length > 0 ? hzeVar.a() : hzeVar;
        this.o = new IdentityHashMap();
        this.p = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.n = new ArrayList();
        this.s = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        List listAsList = Arrays.asList(ck0VarArr);
        synchronized (this) {
            B(arrayList.size(), listAsList, null);
        }
    }

    public final void A(int i, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hn3 hn3Var = (hn3) it.next();
            int i2 = i + 1;
            ArrayList arrayList = this.n;
            if (i > 0) {
                hn3 hn3Var2 = (hn3) arrayList.get(i - 1);
                int iO = hn3Var2.a.o.e.o() + hn3Var2.e;
                hn3Var.d = i;
                hn3Var.e = iO;
                hn3Var.f = false;
                hn3Var.c.clear();
            } else {
                hn3Var.d = i;
                hn3Var.e = 0;
                hn3Var.f = false;
                hn3Var.c.clear();
            }
            C(i, 1, hn3Var.a.o.e.o());
            arrayList.add(i, hn3Var);
            this.p.put(hn3Var.b, hn3Var);
            z(hn3Var, hn3Var.a);
            if (this.b.isEmpty() || !this.o.isEmpty()) {
                u(hn3Var);
            } else {
                this.q.add(hn3Var);
            }
            i = i2;
        }
    }

    public final void B(int i, List list, um5 um5Var) {
        hsi.b(true);
        Handler handler = this.m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ck0) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new hn3((ck0) it2.next()));
        }
        this.k.addAll(i, arrayList);
        if (handler == null || list.isEmpty()) {
            return;
        }
        handler.obtainMessage(1, new in3(i, arrayList, null)).sendToTarget();
    }

    public final void C(int i, int i2, int i3) {
        while (true) {
            ArrayList arrayList = this.n;
            if (i >= arrayList.size()) {
                return;
            }
            hn3 hn3Var = (hn3) arrayList.get(i);
            hn3Var.d += i2;
            hn3Var.e += i3;
            i++;
        }
    }

    public final void D() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            hn3 hn3Var = (hn3) it.next();
            if (hn3Var.c.isEmpty()) {
                u(hn3Var);
                it.remove();
            }
        }
    }

    public final synchronized void E(Set set) {
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((gn3) it.next()).getClass();
            throw null;
        }
        this.l.removeAll(set);
    }

    public final void F(gn3 gn3Var) {
        if (this.r) {
            return;
        }
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(5).sendToTarget();
        this.r = true;
    }

    public final void G() {
        this.r = false;
        HashSet hashSet = this.s;
        this.s = new HashSet();
        n(new en3(this.n, this.t));
        Handler handler = this.m;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // defpackage.ck0
    public final p29 c(d99 d99Var, ri4 ri4Var, long j) {
        Object obj = d99Var.a;
        int i = l0.g;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        d99 d99VarA = d99Var.a(pair.second);
        hn3 hn3Var = (hn3) this.p.get(obj2);
        if (hn3Var == null) {
            hn3Var = new hn3(new fn3());
            hn3Var.f = true;
            z(hn3Var, hn3Var.a);
        }
        this.q.add(hn3Var);
        gm3 gm3Var = (gm3) this.h.get(hn3Var);
        gm3Var.getClass();
        gm3Var.a.f(gm3Var.b);
        hn3Var.c.add(d99VarA);
        pp8 pp8VarE = hn3Var.a.c(d99VarA, ri4Var, j);
        this.o.put(pp8VarE, hn3Var);
        D();
        return pp8VarE;
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void e() {
        super.e();
        this.q.clear();
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void g() {
    }

    @Override // defpackage.ck0
    public final synchronized s9g h() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new en3(this.k, this.t.b.length != this.k.size() ? this.t.a().b(0, this.k.size()) : this.t);
    }

    @Override // defpackage.ck0
    public final k09 i() {
        return u;
    }

    @Override // defpackage.ck0
    public final synchronized void m(wgg wggVar) {
        try {
            this.j = wggVar;
            this.i = zxg.n(null);
            this.m = new Handler(new dn3(0, this));
            if (this.k.isEmpty()) {
                G();
            } else {
                this.t = this.t.b(0, this.k.size());
                A(0, this.k);
                F(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        IdentityHashMap identityHashMap = this.o;
        hn3 hn3Var = (hn3) identityHashMap.remove(p29Var);
        hn3Var.getClass();
        hn3Var.a.o(p29Var);
        ArrayList arrayList = hn3Var.c;
        arrayList.remove(((pp8) p29Var).a);
        if (!identityHashMap.isEmpty()) {
            D();
        }
        if (hn3Var.f && arrayList.isEmpty()) {
            this.q.remove(hn3Var);
            gm3 gm3Var = (gm3) this.h.remove(hn3Var);
            gm3Var.getClass();
            ck0 ck0Var = gm3Var.a;
            ck0Var.p(gm3Var.b);
            em3 em3Var = gm3Var.c;
            ck0Var.s(em3Var);
            ck0Var.r(em3Var);
        }
    }

    @Override // defpackage.im3, defpackage.ck0
    public final synchronized void q() {
        try {
            super.q();
            this.n.clear();
            this.q.clear();
            this.p.clear();
            this.t = this.t.a();
            Handler handler = this.m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.m = null;
            }
            this.r = false;
            this.s.clear();
            E(this.l);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.im3
    public final d99 v(Object obj, d99 d99Var) {
        hn3 hn3Var = (hn3) obj;
        for (int i = 0; i < hn3Var.c.size(); i++) {
            if (((d99) hn3Var.c.get(i)).d == d99Var.d) {
                Object obj2 = d99Var.a;
                Object obj3 = hn3Var.b;
                int i2 = l0.g;
                return d99Var.a(Pair.create(obj3, obj2));
            }
        }
        return null;
    }

    @Override // defpackage.im3
    public final int x(int i, Object obj) {
        return i + ((hn3) obj).e;
    }

    @Override // defpackage.im3
    public final void y(Object obj, ck0 ck0Var, s9g s9gVar) {
        hn3 hn3Var = (hn3) obj;
        int i = hn3Var.d + 1;
        ArrayList arrayList = this.n;
        if (i < arrayList.size()) {
            int iO = s9gVar.o() - (((hn3) arrayList.get(hn3Var.d + 1)).e - hn3Var.e);
            if (iO != 0) {
                C(hn3Var.d + 1, 0, iO);
            }
        }
        F(null);
    }
}
