package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class sub {
    public final lrd a;
    public final ai b;
    public final am4 c;
    public final hq9 d;
    public final hq9 e;
    public final hq9 f;

    public sub(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 16);
        this.c = new am4(oneMeRoomDatabase, 4);
        this.d = new hq9(oneMeRoomDatabase, 22);
        this.e = new hq9(oneMeRoomDatabase, 23);
        this.f = new hq9(oneMeRoomDatabase, 24);
    }

    public static void a(sub subVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            lrd lrdVar = subVar.a;
            lrdVar.b();
            hq9 hq9Var = subVar.f;
            vk6 vk6VarA = hq9Var.a();
            vk6VarA.k(1, jLongValue);
            try {
                lrdVar.c();
                try {
                    vk6VarA.w();
                    lrdVar.q();
                } finally {
                }
            } finally {
                hq9Var.r(vk6VarA);
            }
        }
    }
}
