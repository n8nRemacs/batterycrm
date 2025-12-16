package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class vi0 extends sm implements j1g, tsb {
    public final int d;

    public vi0(long j, int i) {
        super(j);
        this.d = i;
    }

    @Override // defpackage.tsb
    public final int c() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        a3g a3gVarE = tmVar.e();
        List listJ = ve3.j(usb.Q0, usb.S0, usb.T0, usb.R0);
        gsd gsdVar = ((ie4) a3gVarE.a.get()).f;
        lrd lrdVar = gsdVar.b().a;
        StringBuilder sbM = az1.m("SELECT * FROM tasks WHERE type in (");
        int size = listJ.size();
        lc4.a(sbM, size);
        sbM.append(")");
        dsd dsdVarC = dsd.c(size, sbM.toString());
        Iterator it = listJ.iterator();
        int i = 1;
        while (it.hasNext()) {
            dsdVarC.k(i, ((usb) it.next()).a);
            i++;
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
            List listC = gsdVar.c(arrayList);
            Iterator it2 = listC.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                long j = this.a;
                if (!zHasNext) {
                    return ((r2g) listC.get(0)).a != j ? 2 : 1;
                }
                r2g r2gVar = (r2g) it2.next();
                if (r2gVar.a == j && (r2gVar.f instanceof ju)) {
                    return 3;
                }
            }
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        if (tmVar.e().b(ve3.j(usb.Q0, usb.S0, usb.T0, usb.R0)) > 1) {
            tm tmVar2 = this.c;
            she.v((c6i) (tmVar2 != null ? tmVar2 : null).h.getValue());
        }
        s(l0gVar);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.b().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
        int i = this.d;
        int iV = az1.v(i);
        if (iV == 3) {
            tm tmVar = this.c;
            if (tmVar == null) {
                tmVar = null;
            }
            ((ps5) tmVar.r.getValue()).f();
        } else if (iV != 4) {
            wqi.q(getClass().getName(), "unsuspporeted type ".concat(az1.w(i)), new Object[0]);
        } else {
            tm tmVar2 = this.c;
            if (tmVar2 == null) {
                tmVar2 = null;
            }
            ((vr5) tmVar2.s.getValue()).g();
        }
        tm tmVar3 = this.c;
        (tmVar3 != null ? tmVar3 : null).e().d(this.a);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 10;
    }

    public abstract void s(l0g l0gVar);

    public final void t(long j) {
        int i = this.d;
        if (i == 4) {
            tm tmVar = this.c;
            ((ps5) (tmVar != null ? tmVar : null).r.getValue()).i(j);
        } else if (i == 5) {
            tm tmVar2 = this.c;
            ((vr5) (tmVar2 != null ? tmVar2 : null).s.getValue()).h(j);
        }
    }
}
