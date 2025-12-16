package defpackage;

import java.util.ArrayList;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class cdd implements tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ddd b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ cdd(ddd dddVar, ArrayList arrayList, int i) {
        this.a = i;
        this.b = dddVar;
        this.c = arrayList;
    }

    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new kk3(1, new add(this.b, (ocd) obj, this.c, 1));
            default:
                return new kk3(1, new add(this.b, (OneMeRoomDatabase) obj, this.c, 0));
        }
    }
}
