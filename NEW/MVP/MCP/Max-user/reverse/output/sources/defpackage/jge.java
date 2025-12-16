package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jge extends hge {
    public final String b = jge.class.getName();

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.hge
    public final void u() {
        gsd gsdVar = ((ie4) q().a.get()).f;
        d3g d3gVarB = gsdVar.b();
        d3gVarB.getClass();
        dsd dsdVarC = dsd.c(1, "SELECT * FROM tasks WHERE status = ?");
        dsdVarC.k(1, 10);
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
            for (r2g r2gVar : gsdVar.c(arrayList)) {
                wqi.c(this.b, "mark processing task: " + r2gVar + " as failed", new Object[0]);
                q().c(r2gVar.a);
            }
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }
}
