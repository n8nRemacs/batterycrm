package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class vs5 {
    public final lrd a;
    public final ai b;
    public final bi c;
    public final bi d;
    public final bi e;

    public vs5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 9);
        this.c = new bi(oneMeRoomDatabase, 19);
        this.d = new bi(oneMeRoomDatabase, 20);
        this.e = new bi(oneMeRoomDatabase, 21);
    }

    public final Object a(List list, ipa ipaVar) {
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            upa upaVar = (upa) it.next();
            arrayList.add(upaVar.a + "_" + upaVar.b);
        }
        StringBuilder sbM = az1.m("SELECT * FROM fcm_notifications_analytics WHERE chat_id||'_'||msg_id IN (");
        int size = arrayList.size();
        lc4.a(sbM, size);
        sbM.append(") AND analytics_status = (");
        sbM.append("?");
        sbM.append(")");
        int i = size + 1;
        dsd dsdVarC = dsd.c(i, sbM.toString());
        Iterator it2 = arrayList.iterator();
        int i2 = 1;
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (str == null) {
                dsdVarC.S(i2);
            } else {
                dsdVarC.f(i2, str);
            }
            i2++;
        }
        return k7j.a(this.a, xrf.m(dsdVarC, i, 1), new ci(this, 14, dsdVarC), ipaVar);
    }
}
