package defpackage;

import android.os.CancellationSignal;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class mt5 {
    public final lrd a;
    public final ai b;
    public final bi c;

    public mt5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 10);
        this.c = new bi(oneMeRoomDatabase, 22);
    }

    public final Object a(List list, q44 q44Var) {
        StringBuilder sbM = az1.m("SELECT * FROM fcm_notifications_history WHERE chat_id IN (");
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
        return k7j.a(this.a, new CancellationSignal(), new ci(this, 16, dsdVarC), q44Var);
    }
}
