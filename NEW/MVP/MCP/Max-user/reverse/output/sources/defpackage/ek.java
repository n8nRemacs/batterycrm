package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class ek {
    public final lrd a;
    public final ai b;
    public final bi c;

    public ek(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new ai(oneMeRoomDatabase, 1);
        this.c = new bi(oneMeRoomDatabase, 1);
    }
}
