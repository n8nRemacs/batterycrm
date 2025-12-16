package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class fuf {
    public final lrd a;
    public final ai b;
    public final crd c;
    public final crd d;

    public fuf(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 27);
        this.c = new crd(oneMeRoomDatabase, 11);
        this.d = new crd(oneMeRoomDatabase, 12);
    }
}
