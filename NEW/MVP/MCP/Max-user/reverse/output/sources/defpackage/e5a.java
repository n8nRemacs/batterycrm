package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class e5a extends sm implements j1g {
    public final List X;
    public final long d;
    public final long o;

    public e5a(long j, long j2, long j3, List list) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = list;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        f5a f5aVar = (f5a) l0gVar;
        qi9 qi9VarN = n();
        Map map = f5aVar.c;
        bsd bsdVar = qi9VarN.a.c;
        ((OneMeRoomDatabase) bsdVar.a.l()).p(new d8c(map, 20, bsdVar));
        Iterator it = f5aVar.c.keySet().iterator();
        while (it.hasNext()) {
            si9 si9VarI = n().i(this.d, ((Long) it.next()).longValue());
            if (si9VarI != null) {
                k().c(new itg(this.d, si9VarI.a, false));
            }
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        k().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.sm
    public final n2 i() {
        return new zf8(this.o, this.X);
    }
}
