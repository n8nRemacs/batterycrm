package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class d3g {
    public final lrd a;
    public final ai b;
    public final slf c = new slf();
    public final crd d;
    public final crd e;
    public final crd f;
    public final crd g;
    public final crd h;
    public final crd i;

    public d3g(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(this, oneMeRoomDatabase);
        new am4(this, oneMeRoomDatabase);
        this.d = new crd(oneMeRoomDatabase, 15);
        new crd(oneMeRoomDatabase, 16);
        this.e = new crd(oneMeRoomDatabase, 17);
        this.f = new crd(oneMeRoomDatabase, 18);
        this.g = new crd(oneMeRoomDatabase, 19);
        this.h = new crd(oneMeRoomDatabase, 20);
        this.i = new crd(oneMeRoomDatabase, 21);
    }

    public static void a(d3g d3gVar, long j) {
        d3gVar.c(j, c3g.d);
        lrd lrdVar = d3gVar.a;
        lrdVar.b();
        crd crdVar = d3gVar.f;
        vk6 vk6VarA = crdVar.a();
        vk6VarA.k(1, j);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            crdVar.r(vk6VarA);
        }
    }

    public final ArrayList b(int i, List list) {
        StringBuilder sbM = az1.m("SELECT id FROM tasks WHERE status in (");
        int size = list.size();
        lc4.a(sbM, size);
        sbM.append(") LIMIT ");
        sbM.append("?");
        int i2 = size + 1;
        dsd dsdVarC = dsd.c(i2, sbM.toString());
        Iterator it = list.iterator();
        int i3 = 1;
        while (it.hasNext()) {
            dsdVarC.k(i3, ((c3g) it.next()).a);
            i3++;
        }
        dsdVarC.k(i2, i);
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

    public final void c(long j, c3g c3gVar) {
        lrd lrdVar = this.a;
        lrdVar.b();
        crd crdVar = this.d;
        vk6 vk6VarA = crdVar.a();
        vk6VarA.k(1, c3gVar.a);
        vk6VarA.k(2, j);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            crdVar.r(vk6VarA);
        }
    }
}
