package defpackage;

import android.database.Cursor;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class a3g {
    public static final List d = Arrays.asList(c3g.c, c3g.b);
    public final kz4 a;
    public final yi5 b;
    public final lqc c = new lqc();

    public a3g(kz4 kz4Var, yi5 yi5Var) {
        this.a = kz4Var;
        this.b = yi5Var;
    }

    public final uk3 a(List list) {
        wqi.c("a3g", "awaitNoTasksByTypes: types=%s", list);
        return new ik3(new k2f(new wk3(5, new u64(this, 9, list)), new oh2(26, list), 1).h(new vef(23)), 2, new z2g(this, list)).d(new mr5(8, list));
    }

    public final long b(List list) {
        lrd lrdVar = ((ie4) this.a.get()).f.b().a;
        StringBuilder sbM = az1.m("SELECT COUNT(*) FROM tasks where type in (");
        int size = list.size();
        lc4.a(sbM, size);
        sbM.append(")");
        dsd dsdVarC = dsd.c(size, sbM.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            dsdVarC.k(i, ((usb) it.next()).a);
            i++;
        }
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            return cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public final void c(long j) {
        d3g d3gVarB = ((ie4) this.a.get()).f.b();
        lrd lrdVar = d3gVarB.a;
        lrdVar.c();
        try {
            d3g.a(d3gVarB, j);
            lrdVar.q();
        } finally {
            lrdVar.k();
        }
    }

    public final void d(long j) {
        wy1.q(j, "remove task = ", "a3g");
        ((ie4) this.a.get()).f.a(j);
        this.c.f(Boolean.TRUE);
    }

    public final void e(AbstractCollection abstractCollection) {
        wqi.c("a3g", "remove tasks %d", Integer.valueOf(abstractCollection.size()));
        if (jqi.f(abstractCollection)) {
            return;
        }
        lrd lrdVar = ((ie4) this.a.get()).f.b().a;
        lrdVar.b();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM tasks WHERE id in (");
        lc4.a(sb, abstractCollection.size());
        sb.append(")");
        vk6 vk6VarD = lrdVar.d(sb.toString());
        Iterator it = abstractCollection.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                vk6VarD.S(i);
            } else {
                vk6VarD.k(i, l.longValue());
            }
            i++;
        }
        lrdVar.c();
        try {
            vk6VarD.w();
            lrdVar.q();
            lrdVar.k();
            this.c.f(Boolean.TRUE);
        } catch (Throwable th) {
            lrdVar.k();
            throw th;
        }
    }

    public final void f() {
        wqi.c("a3g", "remove tasks by type = %d", usb.w0);
        d3g d3gVarB = ((ie4) this.a.get()).f.b();
        lrd lrdVar = d3gVarB.a;
        lrdVar.b();
        crd crdVar = d3gVarB.i;
        vk6 vk6VarA = crdVar.a();
        vk6VarA.k(1, 12);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
                crdVar.r(vk6VarA);
                this.c.f(Boolean.TRUE);
            } finally {
                lrdVar.k();
            }
        } catch (Throwable th) {
            crdVar.r(vk6VarA);
            throw th;
        }
    }

    public final void g(tsb tsbVar, long j, int i) {
        wqi.c("a3g", "save task = " + tsbVar, new Object[0]);
        d3g d3gVarB = ((ie4) this.a.get()).f.b();
        s2g s2gVar = new s2g(tsbVar.getId(), tsbVar.getType(), c3g.b, 0, j, i, tsbVar.g(), System.currentTimeMillis());
        lrd lrdVar = d3gVarB.a;
        lrdVar.b();
        lrdVar.c();
        try {
            d3gVarB.b.C(s2gVar);
            lrdVar.q();
        } finally {
            lrdVar.k();
        }
    }

    public final List h(long j, usb usbVar) {
        gsd gsdVar = ((ie4) this.a.get()).f;
        d3g d3gVarB = gsdVar.b();
        d3gVarB.getClass();
        dsd dsdVarC = dsd.c(2, "SELECT * FROM tasks WHERE id > ? AND type = ?");
        dsdVarC.k(1, j);
        dsdVarC.k(2, usbVar.a);
        lrd lrdVar = d3gVarB.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "type");
            int iC3 = s7j.c(cursorN, "status");
            int iC4 = s7j.c(cursorN, "fails_count");
            int iC5 = s7j.c(cursorN, "depends_request_id");
            int iC6 = s7j.c(cursorN, "dependency_type");
            int iC7 = s7j.c(cursorN, "data");
            int iC8 = s7j.c(cursorN, "created_time");
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(new s2g(cursorN.getLong(iC), slf.e(cursorN.getInt(iC2)), slf.c(cursorN.getInt(iC3)), cursorN.getInt(iC4), cursorN.getLong(iC5), cursorN.getInt(iC6), cursorN.isNull(iC7) ? null : cursorN.getBlob(iC7), cursorN.getLong(iC8)));
            }
            cursorN.close();
            dsdVarC.y();
            return gsdVar.c(arrayList);
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }

    public final List i(Collection collection) {
        gsd gsdVar = ((ie4) this.a.get()).f;
        lrd lrdVar = gsdVar.b().a;
        StringBuilder sbM = az1.m("SELECT * FROM tasks WHERE type in (");
        int size = collection.size();
        lc4.a(sbM, size);
        sbM.append(") AND status in (");
        List list = d;
        int size2 = list.size();
        lc4.a(sbM, size2);
        sbM.append(")");
        dsd dsdVarC = dsd.c(size2 + size, sbM.toString());
        Iterator it = collection.iterator();
        int i = 1;
        while (it.hasNext()) {
            dsdVarC.k(i, ((usb) it.next()).a);
            i++;
        }
        int i2 = size + 1;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dsdVarC.k(i2, ((c3g) it2.next()).a);
            i2++;
        }
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "type");
            int iC3 = s7j.c(cursorN, "status");
            int iC4 = s7j.c(cursorN, "fails_count");
            int iC5 = s7j.c(cursorN, "depends_request_id");
            int iC6 = s7j.c(cursorN, "dependency_type");
            int iC7 = s7j.c(cursorN, "data");
            int iC8 = s7j.c(cursorN, "created_time");
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(new s2g(cursorN.getLong(iC), slf.e(cursorN.getInt(iC2)), slf.c(cursorN.getInt(iC3)), cursorN.getInt(iC4), cursorN.getLong(iC5), cursorN.getInt(iC6), cursorN.isNull(iC7) ? null : cursorN.getBlob(iC7), cursorN.getLong(iC8)));
            }
            cursorN.close();
            dsdVarC.y();
            return gsdVar.c(arrayList);
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }

    public final r2g j(long j) {
        kz4 kz4Var = this.a;
        try {
            return ((ie4) kz4Var.get()).f.e(j);
        } catch (Exception e) {
            d3g d3gVarB = ((ie4) kz4Var.get()).f.b();
            d3gVarB.getClass();
            dsd dsdVarC = dsd.c(1, "SELECT type FROM tasks WHERE id = ?");
            dsdVarC.k(1, j);
            lrd lrdVar = d3gVarB.a;
            lrdVar.b();
            Cursor cursorN = lrdVar.n(dsdVarC);
            try {
                usb usbVarE = cursorN.moveToFirst() ? slf.e(cursorN.getInt(0)) : null;
                cursorN.close();
                dsdVarC.y();
                wqi.o("a3g", null, "selectTask: id=%d; type=%d; exception=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), usbVarE, e.getMessage()}, 3));
                ((y3b) this.b).a(new IllegalStateException("Can't select task with type=" + usbVarE, e));
                return null;
            } catch (Throwable th) {
                cursorN.close();
                dsdVarC.y();
                throw th;
            }
        }
    }

    public final int k() {
        d3g d3gVarB = ((ie4) this.a.get()).f.b();
        List listJ = ve3.j(c3g.b, c3g.d);
        lrd lrdVar = d3gVarB.a;
        StringBuilder sbM = az1.m("SELECT COUNT(*) FROM tasks WHERE status in (");
        int size = listJ.size();
        lc4.a(sbM, size);
        sbM.append(")");
        dsd dsdVarC = dsd.c(size, sbM.toString());
        Iterator it = listJ.iterator();
        int i = 1;
        while (it.hasNext()) {
            dsdVarC.k(i, ((c3g) it.next()).a);
            i++;
        }
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            return cursorN.moveToFirst() ? cursorN.getInt(0) : 0;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public final ArrayList l() {
        return ((ie4) this.a.get()).f.b().b(Integer.MAX_VALUE, ve3.j(c3g.b, c3g.d));
    }

    public final ArrayList m() {
        d3g d3gVarB = ((ie4) this.a.get()).f.b();
        List listJ = ve3.j(c3g.b, c3g.d);
        lrd lrdVar = d3gVarB.a;
        StringBuilder sbM = az1.m("SELECT type, COUNT(*) as count FROM tasks WHERE status in (");
        int size = listJ.size();
        lc4.a(sbM, size);
        sbM.append(") GROUP BY type");
        dsd dsdVarC = dsd.c(size, sbM.toString());
        Iterator it = listJ.iterator();
        int i = 1;
        while (it.hasNext()) {
            dsdVarC.k(i, ((c3g) it.next()).a);
            i++;
        }
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(new q2g(slf.e(cursorN.getInt(0)), cursorN.getInt(1)));
            }
            return arrayList;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public final void n(long j, c3g c3gVar) {
        ((ie4) this.a.get()).f.b().c(j, c3gVar);
    }
}
