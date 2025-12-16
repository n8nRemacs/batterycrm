package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class csd {
    public final q9b a;
    public final bwf b = new bwf(new prd(1, this));

    public csd(q9b q9bVar) {
        this.a = q9bVar;
    }

    public static ztb b(csd csdVar, ytb ytbVar) {
        csdVar.getClass();
        return new ztb(ytbVar.a, ytbVar.b, ytbVar.c, ytbVar.d, ytbVar.o, ytbVar.X, ytbVar.Y, ytbVar.Z, ytbVar.s0, ytbVar.t0);
    }

    public static ytb d(ztb ztbVar) {
        return new ytb(ztbVar.a, ztbVar.b, ztbVar.c, ztbVar.d, ztbVar.e, ztbVar.f, ztbVar.g, ztbVar.h, ztbVar.i, az1.v(ztbVar.j));
    }

    public final void a() {
        sub subVarC = c();
        lrd lrdVar = subVarC.a;
        lrdVar.b();
        hq9 hq9Var = subVarC.e;
        vk6 vk6VarA = hq9Var.a();
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            hq9Var.r(vk6VarA);
        }
    }

    public final sub c() {
        return (sub) this.b.getValue();
    }

    public final ArrayList e() {
        sub subVarC = c();
        subVarC.getClass();
        dsd dsdVarC = dsd.c(0, "SELECT * FROM phones");
        lrd lrdVar = subVarC.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "phonebook_id");
            int iC3 = s7j.c(cursorN, "contact_id");
            int iC4 = s7j.c(cursorN, "phone");
            int iC5 = s7j.c(cursorN, "server_phone");
            int iC6 = s7j.c(cursorN, "email");
            int iC7 = s7j.c(cursorN, "first_name");
            int iC8 = s7j.c(cursorN, "last_name");
            int iC9 = s7j.c(cursorN, "avatar_path");
            int iC10 = s7j.c(cursorN, "type");
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(new ztb(cursorN.getLong(iC), cursorN.getLong(iC2), cursorN.getInt(iC3), cursorN.isNull(iC4) ? null : cursorN.getString(iC4), cursorN.getLong(iC5), cursorN.isNull(iC6) ? null : cursorN.getString(iC6), cursorN.isNull(iC7) ? null : cursorN.getString(iC7), cursorN.isNull(iC8) ? null : cursorN.getString(iC8), cursorN.isNull(iC9) ? null : cursorN.getString(iC9), utb.b(cursorN.getInt(iC10))));
            }
            cursorN.close();
            dsdVarC.y();
            ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(d((ztb) it.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }

    public final ArrayList f(List list) {
        lrd lrdVar = c().a;
        StringBuilder sbM = az1.m("SELECT * FROM phones WHERE server_phone in (");
        int size = list.size();
        lc4.a(sbM, size);
        sbM.append(")");
        dsd dsdVarC = dsd.c(size, sbM.toString());
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                dsdVarC.S(i);
            } else {
                dsdVarC.k(i, l.longValue());
            }
            i++;
        }
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "phonebook_id");
            int iC3 = s7j.c(cursorN, "contact_id");
            int iC4 = s7j.c(cursorN, "phone");
            int iC5 = s7j.c(cursorN, "server_phone");
            int iC6 = s7j.c(cursorN, "email");
            int iC7 = s7j.c(cursorN, "first_name");
            int iC8 = s7j.c(cursorN, "last_name");
            int iC9 = s7j.c(cursorN, "avatar_path");
            int iC10 = s7j.c(cursorN, "type");
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(new ztb(cursorN.getLong(iC), cursorN.getLong(iC2), cursorN.getInt(iC3), cursorN.isNull(iC4) ? null : cursorN.getString(iC4), cursorN.getLong(iC5), cursorN.isNull(iC6) ? null : cursorN.getString(iC6), cursorN.isNull(iC7) ? null : cursorN.getString(iC7), cursorN.isNull(iC8) ? null : cursorN.getString(iC8), cursorN.isNull(iC9) ? null : cursorN.getString(iC9), utb.b(cursorN.getInt(iC10))));
            }
            cursorN.close();
            dsdVarC.y();
            ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((ztb) it2.next()));
            }
            return arrayList2;
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }
}
