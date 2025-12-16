package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class wpa {
    public final lrd a;
    public final ai b;
    public final hq9 c;
    public final hq9 d;

    public wpa(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 15);
        this.c = new hq9(oneMeRoomDatabase, 20);
        this.d = new hq9(oneMeRoomDatabase, 21);
    }

    public final Object a(long j, long j2, jpa jpaVar) {
        dsd dsdVarC = dsd.c(2, "SELECT * FROM notifications_tracker_messages WHERE chat_id=? AND message_id=?");
        dsdVarC.k(1, j);
        return k7j.a(this.a, xrf.m(dsdVarC, 2, j2), new ci(this, 25, dsdVarC), jpaVar);
    }
}
