package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class qlh {
    public final lrd a;
    public final cwg b;
    public final am4 c;
    public final crd d;
    public final crd e;

    public qlh(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new cwg(oneMeRoomDatabase, 2);
        this.c = new am4(oneMeRoomDatabase, 8);
        this.d = new crd(oneMeRoomDatabase, 28);
        this.e = new crd(oneMeRoomDatabase, 29);
        new olh(oneMeRoomDatabase, 0);
        new olh(oneMeRoomDatabase, 1);
    }

    public final Object a(long j, long j2, dtf dtfVar) {
        dsd dsdVarC = dsd.c(2, "SELECT * FROM webapp_biometry WHERE user_id = ? AND bot_id = ?");
        dsdVarC.k(1, j);
        return k7j.a(this.a, xrf.m(dsdVarC, 2, j2), new nlh(this, dsdVarC, 1), dtfVar);
    }
}
