package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class tgf {
    public final lrd a;
    public final ai b;
    public final crd c;

    public tgf(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 26);
        this.c = new crd(oneMeRoomDatabase, 10);
    }
}
