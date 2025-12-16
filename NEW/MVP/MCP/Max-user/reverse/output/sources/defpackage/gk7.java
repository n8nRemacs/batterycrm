package defpackage;

import android.os.CancellationSignal;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class gk7 {
    public final lrd a;
    public final ai b;

    public gk7(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 11);
        new bi(oneMeRoomDatabase, 23);
        new bi(oneMeRoomDatabase, 24);
    }

    public final Object a(String str, dtf dtfVar) {
        dsd dsdVarC = dsd.c(1, "SELECT * FROM informer_banner WHERE id = ? LIMIT 1");
        if (str == null) {
            dsdVarC.S(1);
        } else {
            dsdVarC.f(1, str);
        }
        return k7j.a(this.a, new CancellationSignal(), new fk7(this, dsdVarC, 1), dtfVar);
    }
}
