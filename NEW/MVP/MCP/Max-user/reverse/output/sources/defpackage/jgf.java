package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class jgf {
    public final lrd a;
    public final ai b;
    public final crd c;

    public jgf(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 25);
        this.c = new crd(oneMeRoomDatabase, 9);
    }
}
