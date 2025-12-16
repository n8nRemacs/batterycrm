package defpackage;

import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class w85 {
    public final qi9 a;
    public final ve2 b;
    public final c7c c;
    public final tw0 d;
    public final pb3 e;

    public w85(qi9 qi9Var, ve2 ve2Var, c7c c7cVar, tw0 tw0Var, pb3 pb3Var) {
        this.a = qi9Var;
        this.b = ve2Var;
        this.c = c7cVar;
        this.d = tw0Var;
        this.e = pb3Var;
    }

    public final void a(final long j, long j2, final String str, final List list, final jm9 jm9Var, final List list2, final boolean z) {
        this.c.c.remove(Long.valueOf(j));
        final long j3 = ((w4e) this.e).j();
        cm6 cm6Var = new cm6() { // from class: v85
            @Override // defpackage.cm6
            public final Object invoke() throws Throwable {
                w85 w85Var = this.a;
                qi9 qi9Var = w85Var.a;
                long j4 = j;
                qi9Var.w(j4, j3);
                if (z) {
                    qi9Var.a.c.s(j4, new oh2(16, list2));
                }
                w85Var.a.v(j4, str, list, w85Var.b, jm9Var);
                return null;
            }
        };
        qi9 qi9Var = this.a;
        ((OneMeRoomDatabase) qi9Var.a.c.a.l()).o(new frd(1, cm6Var));
        ve2 ve2Var = this.b;
        pb2 pb2VarM = ve2Var.M(j2);
        if (pb2VarM != null && pb2VarM.b.j == j) {
            ve2Var.s0(j2, qi9Var.m(j), true);
        }
        if (pb2VarM != null && pb2VarM.b.L == j && qi9Var.m(j) != null) {
            ve2Var.w0(j2);
        }
        this.d.c(new itg(j2, j, false));
    }
}
