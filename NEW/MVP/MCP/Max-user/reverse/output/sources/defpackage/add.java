package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final /* synthetic */ class add implements p6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ddd b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Object d;

    public /* synthetic */ add(ddd dddVar, Object obj, List list, int i) {
        this.a = i;
        this.b = dddVar;
        this.d = obj;
        this.c = list;
    }

    @Override // defpackage.p6
    public final void run() {
        int i = this.a;
        int i2 = 0;
        List list = this.c;
        Object obj = this.d;
        ddd dddVar = this.b;
        switch (i) {
            case 0:
                ((OneMeRoomDatabase) obj).p(new d8c(dddVar, 12, (ArrayList) list));
                return;
            case 1:
                ocd ocdVar = (ocd) obj;
                ArrayList arrayList = (ArrayList) list;
                long j = ((w4e) dddVar.b).j();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    arrayList2.add(xcd.a((scd) arrayList.get(i3), j - i3));
                }
                lrd lrdVar = ocdVar.a;
                lrdVar.c();
                try {
                    new ik3(new kk3(2, new bm4(13, ocdVar)), 0, new kk3(2, new jad(ocdVar, 1, arrayList2))).a();
                    lrdVar.q();
                    return;
                } finally {
                    lrdVar.k();
                }
            default:
                OneMeRoomDatabase oneMeRoomDatabase = (OneMeRoomDatabase) obj;
                oneMeRoomDatabase.p(new zcd(dddVar, oneMeRoomDatabase, list, i2));
                return;
        }
    }
}
