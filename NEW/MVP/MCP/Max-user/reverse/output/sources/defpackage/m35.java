package defpackage;

import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* loaded from: classes2.dex */
public final class m35 {
    public final OneMeRoomDatabase_Impl a;
    public final ai b;
    public final bi c;
    public final bi d;

    public m35(OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl) {
        this.a = oneMeRoomDatabase_Impl;
        this.b = new ai(oneMeRoomDatabase_Impl, 6);
        this.c = new bi(oneMeRoomDatabase_Impl, 15);
        this.d = new bi(oneMeRoomDatabase_Impl, 16);
    }
}
