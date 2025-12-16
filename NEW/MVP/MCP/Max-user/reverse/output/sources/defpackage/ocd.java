package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ocd {
    public final lrd a;
    public final ai b;
    public final am4 c;
    public final hq9 d;

    public ocd(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 20);
        this.c = new am4(oneMeRoomDatabase, 5);
        this.d = new hq9(oneMeRoomDatabase, 27);
    }
}
