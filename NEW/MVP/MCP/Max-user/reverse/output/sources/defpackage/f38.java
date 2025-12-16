package defpackage;

import android.database.Cursor;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f38 extends dtf implements sm6 {
    public final /* synthetic */ uy5 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f38(uy5 uy5Var, Continuation continuation) {
        super(2, continuation);
        this.o = uy5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f38 f38Var = (f38) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f38Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new f38(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        qv3 qv3Var = (qv3) ((k18) this.o.t0).getValue();
        m14 m14VarR = ((ie4) qv3Var.e.get()).d.r();
        m14VarR.getClass();
        dsd dsdVarC = dsd.c(0, "SELECT COUNT(*) FROM contact_title");
        lrd lrdVar = m14VarR.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int i = cursorN.moveToFirst() ? cursorN.getInt(0) : 0;
            cursorN.close();
            dsdVarC.y();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "ContactController", "ContactController contacts.size=" + qv3Var.a.size() + " titlesCount=" + i, null);
                }
            }
            if (i < qv3Var.a.size()) {
                try {
                    ((ie4) qv3Var.e.get()).a();
                    qv3Var.a.forEach(new ov3(0, qv3Var));
                    ((ie4) qv3Var.e.get()).c();
                } finally {
                    ((ie4) qv3Var.e.get()).b();
                }
            }
            return qqg.a;
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }
}
