package defpackage;

import android.os.CancellationSignal;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class kad {
    public final lrd a;
    public final ai b;
    public final hq9 c;

    public kad(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 19);
        this.c = new hq9(oneMeRoomDatabase, 26);
    }

    public final Object a(q44 q44Var) {
        dsd dsdVarC = dsd.c(1, "SELECT * FROM reactions_section WHERE id = ?");
        dsdVarC.f(1, "POPULAR");
        return k7j.a(this.a, new CancellationSignal(), new jad(this, 0, dsdVarC), q44Var);
    }
}
