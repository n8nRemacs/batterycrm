package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class qs5 {
    public final lrd a;
    public final ai b;
    public final bi c;

    public qs5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 8);
        this.c = new bi(oneMeRoomDatabase, 18);
    }

    public static ArrayList b(int i, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            Long l = (Long) list.get(i2);
            cr5 cr5Var = new cr5();
            cr5Var.a = l.longValue();
            cr5Var.b = i + i2;
            arrayList.add(cr5Var);
        }
        return arrayList;
    }

    public final void a(List list) {
        lrd lrdVar = this.a;
        lrdVar.c();
        try {
            new ik3(new kk3(2, new bm4(3, this)), 0, new kk3(2, new ci(this, 10, b(0, list)))).a();
            lrdVar.q();
        } finally {
            lrdVar.k();
        }
    }

    public final ArrayList c() {
        dsd dsdVarC = dsd.c(0, "SELECT id FROM favorite_stickers ORDER BY `index` ASC");
        lrd lrdVar = this.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }
}
