package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class an9 {
    public final lrd a;
    public final ai b;
    public final bi c;
    public final bi d;

    public an9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 12);
        this.c = new bi(oneMeRoomDatabase, 25);
        this.d = new bi(oneMeRoomDatabase, 26);
    }
}
