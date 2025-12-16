package defpackage;

import android.os.CancellationSignal;
import java.util.Collection;
import java.util.Iterator;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ei {
    public final lrd a;
    public final ai b;
    public final bi c;

    public ei(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 0);
        this.c = new bi(oneMeRoomDatabase, 0);
    }

    public final Object a(Collection collection, q44 q44Var) {
        StringBuilder sbM = az1.m("SELECT * FROM animoji WHERE id IN (");
        int size = collection.size();
        lc4.a(sbM, size);
        sbM.append(")");
        dsd dsdVarC = dsd.c(size, sbM.toString());
        Iterator it = collection.iterator();
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
        return k7j.a(this.a, new CancellationSignal(), new di(this, dsdVarC, 1), q44Var);
    }
}
