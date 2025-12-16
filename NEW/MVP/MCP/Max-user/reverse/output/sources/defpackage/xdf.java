package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class xdf {
    public final lrd a;
    public final ai b;
    public final crd c;
    public final crd d;

    public xdf(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 24);
        this.c = new crd(oneMeRoomDatabase, 7);
        this.d = new crd(oneMeRoomDatabase, 8);
    }
}
