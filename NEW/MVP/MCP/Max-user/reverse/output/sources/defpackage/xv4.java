package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class xv4 {
    public static final String a = cei.m("DiagnosticsWrkr");

    public static final String a(i5i i5iVar, u5i u5iVar, ywf ywfVar, ArrayList arrayList) throws IOException {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r5i r5iVar = (r5i) it.next();
            v4i v4iVarD = nsi.d(r5iVar);
            String str = r5iVar.a;
            xwf xwfVarO = ywfVar.o(v4iVarD);
            Integer numValueOf = xwfVarO != null ? Integer.valueOf(xwfVarO.c) : null;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) i5iVar.a;
            dsd dsdVarC = dsd.c(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                dsdVarC.S(1);
            } else {
                dsdVarC.f(1, str);
            }
            workDatabase_Impl.b();
            Cursor cursorN = workDatabase_Impl.n(dsdVarC);
            try {
                ArrayList arrayList2 = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    arrayList2.add(cursorN.isNull(0) ? null : cursorN.getString(0));
                }
                cursorN.close();
                dsdVarC.y();
                String strN = ue3.N(arrayList2, ",", null, null, null, 62);
                String strN2 = ue3.N(u5iVar.i(str), ",", null, null, null, 62);
                StringBuilder sbN = az1.n("\n", str, "\t ");
                sbN.append(r5iVar.c);
                sbN.append("\t ");
                sbN.append(numValueOf);
                sbN.append("\t ");
                sbN.append(r5iVar.b.name());
                sbN.append("\t ");
                sbN.append(strN);
                sbN.append("\t ");
                sbN.append(strN2);
                sbN.append('\t');
                sb.append(sbN.toString());
            } catch (Throwable th) {
                cursorN.close();
                dsdVarC.y();
                throw th;
            }
        }
        return sb.toString();
    }
}
