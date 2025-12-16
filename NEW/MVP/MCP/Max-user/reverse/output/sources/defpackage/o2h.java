package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class o2h {
    public final lrd a;
    public final cwg b;
    public final crd c;
    public final crd d;

    public o2h(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new cwg(oneMeRoomDatabase, 1);
        this.c = new crd(oneMeRoomDatabase, 26);
        this.d = new crd(oneMeRoomDatabase, 27);
    }
}
