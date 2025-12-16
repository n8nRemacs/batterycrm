package defpackage;

import android.database.Cursor;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class qv3 implements cub {
    public static final EnumSet o;
    public static final Set p;
    public static final xs q;
    public static final Set r;
    public static final Set s;
    public final kz4 e;
    public final tw0 f;
    public final z7c g;
    public final kz4 h;
    public final kz4 i;
    public final kz4 j;
    public final kz4 k;
    public final j0e l;
    public final deg m;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final Object c = new Object();
    public volatile boolean d = false;
    public l24 n = null;

    static {
        yv3 yv3Var = yv3.b;
        yv3 yv3Var2 = yv3.a;
        o = EnumSet.of(yv3Var, yv3Var2);
        p = Collections.singleton(yv3Var2);
        xv3 xv3Var = xv3.b;
        xv3 xv3Var2 = xv3.a;
        q = zri.a(null, xv3Var, xv3Var2);
        r = Collections.singleton(xv3Var2);
        s = Collections.singleton(xv3Var);
    }

    public qv3(kz4 kz4Var, tw0 tw0Var, z7c z7cVar, kz4 kz4Var2, kz4 kz4Var3, kz4 kz4Var4, kz4 kz4Var5, j0e j0eVar, deg degVar) {
        this.e = kz4Var;
        this.f = tw0Var;
        this.g = z7cVar;
        this.h = kz4Var2;
        this.i = kz4Var3;
        this.j = kz4Var4;
        this.k = kz4Var5;
        this.l = j0eVar;
        this.m = degVar;
    }

    @Override // defpackage.cub
    public final void a(ArrayList arrayList) {
        wqi.c("ContactController", "onPhonebookUpdated", new Object[0]);
        v(arrayList);
    }

    public final void b() {
        if (this.d) {
            return;
        }
        synchronized (this.c) {
            try {
                if (!this.d) {
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ku3 c(long j, gu3 gu3Var) {
        b();
        ku3 ku3VarI = i(j, false);
        if (ku3VarI == null) {
            ((y3b) ((yi5) this.h.get())).a(new IllegalStateException("contact is null"));
            return null;
        }
        aw3 aw3Var = ku3VarI.a;
        rv3 rv3VarB = aw3Var.b.b();
        try {
            gu3Var.accept(rv3VarB);
            zv3 zv3VarA = rv3VarB.a();
            ku3 ku3Var = new ku3(new aw3(aw3Var.a, zv3VarA), zv3VarA.a == this.g.a.s(), (f7b) this.i.get());
            p(j, ku3Var, false, true);
            ek8 ek8Var = new ek8(1);
            ek8Var.e(j, ku3Var);
            f(ek8Var);
            return ku3Var;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final void d(long j, String str, String str2) {
        z7c z7cVar = this.g;
        pe8 pe8Var = z7cVar.a;
        pe8Var.v.O(pe8Var, w4e.m0[11], null);
        long jS = z7cVar.a.s();
        c(jS, new pv3(str, str2, j, 0));
        this.f.c(new t24(jS));
    }

    public final void e() {
        if (this.d && !this.a.isEmpty()) {
            for (ku3 ku3Var : this.a.values()) {
                ku3Var.b = null;
                ku3Var.c = null;
                ku3Var.d = null;
            }
            this.f.c(new t24(this.a.keySet()));
        }
    }

    public final void f(ek8 ek8Var) {
        l24 l24Var = this.n;
        if (l24Var == null || ek8Var.g() == 0) {
            return;
        }
        int iG = ek8Var.g();
        for (int i = 0; i < iG; i++) {
            long jD = ek8Var.d(i);
            ku3 ku3Var = (ku3) ek8Var.h(i);
            if (jD > 0) {
                ((f9a) l24Var.f.computeIfAbsent(Long.valueOf(jD), new ni(10, new k03(l24Var, jD, 1)))).setValue(ku3Var);
            }
        }
    }

    public final boolean g(long j) {
        ku3 ku3VarI = i(j, false);
        return ku3VarI != null && ku3VarI.d();
    }

    public final ku3 h(long j, boolean z) {
        ku3 ku3Var = (ku3) this.a.get(Long.valueOf(j));
        if (ku3Var != null || !z) {
            return ku3Var;
        }
        ku3 ku3VarC = ku3.c(j, this.g.a.j(), (f7b) this.i.get());
        p(j, ku3VarC, true, true);
        return ku3VarC;
    }

    public final ku3 i(long j, boolean z) {
        ku3 ku3Var;
        if (j > 0 && ((ku3Var = (ku3) this.a.get(Long.valueOf(j))) == null || ku3Var.a.a == 0 || ku3Var.B())) {
            b();
        }
        return h(j, z);
    }

    public final List j(Set set, Set set2) {
        ku3 ku3VarI = i(this.g.a.s(), false);
        ArrayList arrayList = null;
        for (ku3 ku3Var : this.a.values()) {
            if (ku3VarI != null && ku3Var != ku3VarI && set.contains(ku3Var.a.b.k) && (set2 == null || set2.contains(ku3Var.a.b.i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ku3Var);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final List k() {
        return j(p, null);
    }

    public final void l() {
        b();
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        for (ku3 ku3Var : concurrentHashMap.values()) {
            f7b f7bVar = (f7b) this.i.get();
            boolean z = ku3Var.b != null;
            boolean z2 = ku3Var.c != null;
            boolean z3 = ku3Var.d != null;
            ku3Var.b = null;
            ku3Var.c = null;
            ku3Var.d = null;
            if (z) {
                ku3Var.b = f7bVar.j.b(0, ku3Var.e());
            }
            if (z2) {
                ku3Var.n(f7bVar);
            }
            if (z3) {
                ku3Var.o();
            }
        }
        this.f.c(new t24(concurrentHashMap.keySet()));
    }

    public final boolean m(long j) {
        b();
        if (j > 0 && j != -1) {
            z7c z7cVar = this.g;
            if (j != z7cVar.a.s()) {
                ku3 ku3VarH = h(j, false);
                if (u5j.h(ku3VarH)) {
                    return true;
                }
                if (!ku3VarH.d()) {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    l5c l5cVar = z7cVar.b;
                    l5cVar.getClass();
                    if (z7cVar.a.j() - timeUnit.toMillis(l5cVar.m(PmsKey.f115noncontactsynctime, TimeUnit.HOURS.toSeconds(24L))) >= ku3VarH.a.b.s) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        if (this.d) {
            return;
        }
        this.m.getClass();
        deg.a("ContactController.load()");
        wqi.c("ContactController", "contacts loading started", new Object[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.m.getClass();
        deg.a("ContactController.selectContacts()");
        ek8 ek8Var = new ek8(32);
        te8 te8Var = ((ie4) this.e.get()).d;
        m14 m14VarR = te8Var.r();
        m14VarR.getClass();
        dsd dsdVarC = dsd.c(0, "SELECT * FROM contacts ORDER BY presence ASC");
        lrd lrdVar = m14VarR.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "server_id");
            int iC3 = s7j.c(cursorN, "presence");
            int iC4 = s7j.c(cursorN, "presence_type");
            int iC5 = s7j.c(cursorN, "data");
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (true) {
                byte[] blob = null;
                if (!cursorN.moveToNext()) {
                    break;
                }
                long j = cursorN.getLong(iC);
                long j2 = cursorN.getLong(iC2);
                int i = cursorN.getInt(iC3);
                int i2 = cursorN.getInt(iC4);
                if (!cursorN.isNull(iC5)) {
                    blob = cursorN.getBlob(iC5);
                }
                arrayList.add(new uw3(j, j2, i, i2, a6j.a(blob)));
            }
            cursorN.close();
            dsdVarC.y();
            ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                uw3 uw3Var = (uw3) it.next();
                ConcurrentHashMap concurrentHashMap = ((ul6) ((bwf) te8Var.c).getValue()).a;
                long j3 = uw3Var.a;
                zv3 zv3Var = uw3Var.e;
                concurrentHashMap.put(Long.valueOf(j3), Integer.valueOf(zv3Var.f.hashCode()));
                arrayList2.add(new aw3(uw3Var.a, zv3Var, new b8c(uw3Var.d, uw3Var.c)));
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                aw3 aw3Var = (aw3) it2.next();
                long j4 = aw3Var.b.a;
                if (j4 != this.g.a.s()) {
                    z = false;
                }
                ku3 ku3Var = new ku3(aw3Var, z, (f7b) this.i.get());
                ek8Var.e(j4, ku3Var);
                p(ku3Var.p(), ku3Var, false, false);
                h8c h8cVar = (h8c) this.j.get();
                h8cVar.getClass();
                h8cVar.c().f(ku3Var.p(), ku3Var.a.c);
            }
            Trace.endSection();
            this.d = true;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "ContactController", "contacts loaded in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms", null);
                }
            }
            this.m.getClass();
            Trace.endSection();
            f(ek8Var);
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }

    public final void o(long j) {
        wqi.c("ContactController", "markAsNotFoundContact, id = " + j, new Object[0]);
        c(j, new df3(3));
        c04 c04Var = new c04(Collections.singletonList(Long.valueOf(j)));
        tw0 tw0Var = this.f;
        tw0Var.c(c04Var);
        tw0Var.c(new t24(j));
    }

    public final void p(long j, ku3 ku3Var, boolean z, boolean z2) {
        kz4 kz4Var = this.e;
        if (z && j != 0) {
            b();
        }
        this.a.put(Long.valueOf(j), ku3Var);
        boolean zC = l8g.c(ku3Var.a.b.p);
        ConcurrentHashMap concurrentHashMap = this.b;
        if (zC) {
            concurrentHashMap.remove(Long.valueOf(j));
        } else {
            concurrentHashMap.put(Long.valueOf(j), ku3Var);
        }
        if (!z2 || ku3Var.B()) {
            return;
        }
        try {
            ((ie4) kz4Var.get()).a();
            u(ku3Var.a.a, ku3Var);
            ((ie4) kz4Var.get()).c();
        } finally {
            ((ie4) kz4Var.get()).b();
        }
    }

    public final void q(long j, boolean z) {
        wqi.c("ContactController", "setShowBlockPanel, id = " + j + ", show = " + z, new Object[0]);
        c(j, new j21(z ^ true, 1));
    }

    public final void r(List list, long[] jArr) {
        List arrayList;
        kz4 kz4Var = this.i;
        kz4 kz4Var2 = this.e;
        if (jArr == null || jArr.length == 0) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            xs xsVar = new xs(jArr.length);
            for (long j : jArr) {
                xsVar.add(Long.valueOf(j));
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xsVar.remove(Long.valueOf(((gx3) it.next()).a));
            }
            arrayList = new ArrayList(xsVar);
        }
        List<Long> list2 = arrayList;
        if (!list2.isEmpty()) {
            long j2 = this.g.a.j();
            try {
                ((ie4) kz4Var2.get()).a();
                for (Long l : list2) {
                    ku3 ku3VarI = i(l.longValue(), false);
                    if (ku3VarI == null || ku3VarI.a.a == 0) {
                        zv3 zv3Var = ku3.a(l.longValue(), j2, (f7b) kz4Var.get()).a.b;
                        p(l.longValue(), new ku3(new aw3(((ie4) kz4Var2.get()).d.z(zv3Var), zv3Var), false, (f7b) kz4Var.get()), true, true);
                    } else {
                        c(l.longValue(), new t00(j2, 3));
                    }
                    ku3 ku3VarI2 = i(l.longValue(), false);
                    if (ku3VarI2 != null) {
                        ku3VarI2.b = null;
                        ku3VarI2.c = null;
                        ku3VarI2.d = null;
                    }
                }
                ((ie4) kz4Var2.get()).c();
                ((ie4) kz4Var2.get()).b();
                c04 c04Var = new c04(list2);
                tw0 tw0Var = this.f;
                tw0Var.c(c04Var);
                tw0Var.c(new t24(list2));
            } catch (Throwable th) {
                ((ie4) kz4Var2.get()).b();
                throw th;
            }
        }
        if (jArr == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            gx3 gx3Var = (gx3) it2.next();
            if (g(gx3Var.a)) {
                arrayList2.add(gx3Var);
            } else {
                arrayList3.add(gx3Var);
            }
        }
        s(arrayList2, yv3.a);
        s(arrayList3, yv3.b);
    }

    public final List s(List list, yv3 yv3Var) {
        ku3 ku3Var;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        b();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ContactController", "storeContactsFromServer, size = " + list.size() + ", type = " + yv3Var, null);
            }
        }
        long j = this.g.a.j();
        ((ie4) this.e.get()).a();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            l5c l5cVar = this.g.b;
            l5cVar.getClass();
            List<zv3> listD = w5j.d(list, new kv3(this), new kv3(this), yv3Var, timeUnit.toMillis(l5cVar.m(PmsKey.f115noncontactsynctime, TimeUnit.HOURS.toSeconds(24L))), j);
            ek8 ek8Var = new ek8(listD.size());
            ArrayList arrayList = new ArrayList(listD.size());
            for (zv3 zv3Var : listD) {
                ku3 ku3VarI = i(zv3Var.a, false);
                boolean z = zv3Var.a == this.g.a.s();
                if (ku3VarI != null) {
                    long j2 = ku3VarI.a.a;
                    ku3Var = j2 == 0 ? new ku3(new aw3(((ie4) this.e.get()).d.z(zv3Var), zv3Var), z, (f7b) this.i.get()) : new ku3(new aw3(j2, zv3Var), z, (f7b) this.i.get());
                }
                ku3 ku3Var2 = ku3Var;
                p(ku3Var2.p(), ku3Var2, true, true);
                ek8Var.e(ku3Var2.p(), ku3Var2);
                arrayList.add(Long.valueOf(zv3Var.a));
            }
            if (yv3Var == yv3.a) {
                t(list);
            }
            ((ie4) this.e.get()).c();
            f(ek8Var);
            ((ie4) this.e.get()).b();
            this.f.c(new t24(arrayList));
            return arrayList;
        } catch (Throwable th) {
            ((ie4) this.e.get()).b();
            throw th;
        }
    }

    public final void t(List list) {
        z7c z7cVar = this.g;
        long jM = z7cVar.a.m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jM = Math.max(jM, ((gx3) it.next()).b);
        }
        pe8 pe8Var = z7cVar.a;
        pe8Var.m.O(pe8Var, w4e.m0[1], Long.valueOf(jM));
    }

    public final void u(long j, ku3 ku3Var) {
        te8 te8Var = ((ie4) this.e.get()).d;
        zv3 zv3Var = ku3Var.a.b;
        m14 m14VarR = te8Var.r();
        long j2 = zv3Var.a;
        ConcurrentHashMap concurrentHashMap = ((ul6) ((bwf) te8Var.c).getValue()).a;
        m14VarR.getClass();
        if (zv3Var.a() && zv3Var.j == 0) {
            return;
        }
        lrd lrdVar = m14VarR.a;
        lrdVar.b();
        bi biVar = m14VarR.c;
        vk6 vk6VarA = biVar.a();
        vk6VarA.k(1, j2);
        vk6VarA.D(2, a6j.b(zv3Var));
        vk6VarA.k(3, j);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
                biVar.r(vk6VarA);
                m14VarR.c(zv3Var, concurrentHashMap);
            } finally {
                lrdVar.k();
            }
        } catch (Throwable th) {
            biVar.r(vk6VarA);
            throw th;
        }
    }

    public final Set v(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ContactController", "updateWithPhoneBookData = " + list.size(), null);
            }
        }
        List listJ = j(o, q);
        HashMap map = new HashMap();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ytb ytbVar = (ytb) it.next();
                Iterator it2 = listJ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ku3 ku3Var = (ku3) it2.next();
                        if (ku3Var.q() > 0 && ytbVar.o > 0 && ku3Var.q() == ytbVar.o) {
                            map.put(Long.valueOf(ku3Var.p()), ytbVar);
                            break;
                        }
                    }
                }
            }
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                c(((Long) entry.getKey()).longValue(), new i62(15, (ytb) entry.getValue()));
            }
            this.f.c(new t24(map.keySet()));
        }
        return map.keySet();
    }
}
