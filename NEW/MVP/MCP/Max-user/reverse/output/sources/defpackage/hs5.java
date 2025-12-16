package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class hs5 {
    public final lrd a;
    public final ai b;
    public final bi c;

    public hs5(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 7);
        this.c = new bi(oneMeRoomDatabase, 17);
    }

    public static ArrayList b(long j, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Long l = (Long) list.get(i);
            wr5 wr5Var = new wr5();
            wr5Var.a = l.longValue();
            wr5Var.b = i + j;
            arrayList.add(wr5Var);
        }
        return arrayList;
    }

    public final void a(List list) {
        lrd lrdVar = this.a;
        lrdVar.c();
        try {
            new ik3(new kk3(2, new bm4(2, this)), 0, new kk3(2, new ci(this, 7, b(0L, list)))).a();
            lrdVar.q();
        } finally {
            lrdVar.k();
        }
    }

    public final ArrayList c() {
        dsd dsdVarC = dsd.c(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC");
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
