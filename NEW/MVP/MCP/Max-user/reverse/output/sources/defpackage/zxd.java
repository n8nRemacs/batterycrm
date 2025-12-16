package defpackage;

import android.database.Cursor;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class zxd {
    public final lrd a;
    public final crd b;
    public final crd c;
    public final crd d;

    public zxd(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new crd(oneMeRoomDatabase, 4);
        this.c = new crd(oneMeRoomDatabase, 5);
        this.d = new crd(oneMeRoomDatabase, 6);
    }

    public final ayd a(long j) {
        dsd dsdVarC = dsd.c(1, "SELECT * FROM saved_msg_chat WHERE user_id = ?");
        dsdVarC.k(1, j);
        lrd lrdVar = this.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            return cursorN.moveToFirst() ? new ayd(cursorN.getLong(s7j.c(cursorN, "user_id")), cursorN.getLong(s7j.c(cursorN, "chat_id"))) : null;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public final void b(long j, long j2) {
        lrd lrdVar = this.a;
        lrdVar.b();
        crd crdVar = this.b;
        vk6 vk6VarA = crdVar.a();
        vk6VarA.k(1, j);
        vk6VarA.k(2, j2);
        try {
            lrdVar.c();
            try {
                vk6VarA.l();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            crdVar.r(vk6VarA);
        }
    }
}
