package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class w14 {
    public final tw0 a;
    public final j0e b;
    public final qv3 c;
    public final v04 d;
    public final o7e e;
    public volatile List f;
    public volatile List g;
    public final j0e h;
    public final lqc i;
    public final HashSet j;
    public volatile String k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;

    public w14(yi5 yi5Var, tw0 tw0Var, j0e j0eVar, j0e j0eVar2, qv3 qv3Var, v04 v04Var, o7e o7eVar) {
        List list = Collections.EMPTY_LIST;
        this.f = list;
        this.g = list;
        this.j = new HashSet();
        this.k = "";
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(true);
        this.a = tw0Var;
        this.b = j0eVar;
        this.c = qv3Var;
        this.d = v04Var;
        this.e = o7eVar;
        this.h = j0eVar2;
        lqc lqcVar = new lqc();
        this.i = lqcVar;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j0e j0eVarA = u0e.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        new jta(lqcVar, 1L, timeUnit, j0eVarA).l(j0eVar2).a(new v08(new i62(19, this), new i62(20, yi5Var), pdf.d));
        a();
    }

    public final void a() {
        if (this.l.get()) {
            this.i.f(0);
            return;
        }
        String str = this.k;
        if (!l8g.a(this.k, str)) {
            this.n.set(true);
        }
        this.k = str;
        bwd.a(new gk0(2, this), new df3(7), this.h);
        this.l.set(true);
    }

    public final void b() {
        wqi.c("w14", "updateDataWorker: start", new Object[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.c.b();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        List listK = this.c.k();
        long jCurrentTimeMillis4 = System.currentTimeMillis();
        if (l8g.c(this.k)) {
            v04 v04Var = this.d;
            v04Var.getClass();
            Collections.sort(listK, new dj3(3, v04Var));
            wqi.c("w14", "updateDataWorker: update %d contacts. fetchTime=%dms, sortTime=%dms", Integer.valueOf(listK.size()), Long.valueOf(jCurrentTimeMillis4 - jCurrentTimeMillis3), Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis4));
            this.f = listK;
        } else if (this.n.compareAndSet(true, false)) {
            String str = this.k;
            o7e o7eVar = this.e;
            if (!l8g.c(str)) {
                if (listK == null || !listK.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listK) {
                        try {
                            if (o7eVar.h((ku3) obj, str)) {
                                arrayList.add(obj);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    listK = arrayList;
                } else {
                    listK = Collections.EMPTY_LIST;
                }
            }
            this.d.b(listK);
            this.g = listK;
        }
        long jCurrentTimeMillis5 = System.currentTimeMillis();
        wqi.c("w14", "updateDataWorker: done. awaitLoading=%dms, update=%dms, total=%dms", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis2), Long.valueOf(jCurrentTimeMillis5 - jCurrentTimeMillis));
        this.m.set(true);
        this.b.b(new vy1(24, this));
    }

    @vnf
    public void onEvent(ph8 ph8Var) {
        a();
    }

    @vnf
    public void onEvent(t24 t24Var) {
        this.n.set(true);
        a();
    }

    @vnf
    public void onEvent(xsg xsgVar) {
        a();
    }
}
