package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ewg {
    public final lrd a;
    public final cwg b;
    public final crd c;
    public final crd d;
    public final crd e;
    public final crd f;

    public ewg(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new cwg(oneMeRoomDatabase, 0);
        this.c = new crd(oneMeRoomDatabase, 22);
        this.d = new crd(oneMeRoomDatabase, 23);
        this.e = new crd(oneMeRoomDatabase, 24);
        this.f = new crd(oneMeRoomDatabase, 25);
    }
}
