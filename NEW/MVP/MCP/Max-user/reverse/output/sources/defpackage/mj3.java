package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class mj3 {
    public final lrd a;
    public final ai b;
    public final bi c;

    public mj3(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 2);
        this.c = new bi(oneMeRoomDatabase, 7);
    }

    public final void a() {
        lrd lrdVar = this.a;
        lrdVar.b();
        bi biVar = this.c;
        vk6 vk6VarA = biVar.a();
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            biVar.r(vk6VarA);
        }
    }
}
