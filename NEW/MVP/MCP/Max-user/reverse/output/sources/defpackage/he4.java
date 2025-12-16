package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class he4 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9b b;

    public /* synthetic */ he4(q9b q9bVar, int i) {
        this.a = i;
        this.b = q9bVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        q9b q9bVar = this.b;
        switch (i) {
            case 0:
                return q9bVar;
            default:
                g4b g4bVar = q9bVar.b;
                Context context = q9bVar.a;
                if (vmf.F("cache.db")) {
                    throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                }
                krd krdVar = new krd(context, OneMeRoomDatabase.class, "cache.db");
                krdVar.k = Build.VERSION.SDK_INT < 30 ? 2 : 3;
                krdVar.a((rz9[]) Arrays.copyOf(new rz9[]{new tz9(q9bVar.o, q9bVar.X), new sz9(4, 5, 10), new sz9(7, 8, 11), new sz9(14, 15, 9)}, 4));
                krdVar.g = g4bVar.c();
                krdVar.h = g4bVar.c();
                for (Object obj : q9bVar.c) {
                    krdVar.e.add(obj);
                }
                krdVar.d.add(new ja3(1));
                return krdVar.b();
        }
    }
}
