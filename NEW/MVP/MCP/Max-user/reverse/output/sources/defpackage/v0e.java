package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v0e {
    public static final String a = cei.m("Schedulers");

    public static void a(qo3 qo3Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        s5i s5iVarX = workDatabase.x();
        workDatabase.c();
        try {
            ArrayList arrayListK = s5iVarX.k(qo3Var.h);
            ArrayList arrayListJ = s5iVarX.j();
            if (arrayListK.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListK.iterator();
                while (it.hasNext()) {
                    s5iVarX.r(jCurrentTimeMillis, ((r5i) it.next()).a);
                }
            }
            workDatabase.q();
            workDatabase.k();
            if (arrayListK.size() > 0) {
                r5i[] r5iVarArr = (r5i[]) arrayListK.toArray(new r5i[arrayListK.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    k0e k0eVar = (k0e) it2.next();
                    if (k0eVar.b()) {
                        k0eVar.e(r5iVarArr);
                    }
                }
            }
            if (arrayListJ.size() > 0) {
                r5i[] r5iVarArr2 = (r5i[]) arrayListJ.toArray(new r5i[arrayListJ.size()]);
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    k0e k0eVar2 = (k0e) it3.next();
                    if (!k0eVar2.b()) {
                        k0eVar2.e(r5iVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
