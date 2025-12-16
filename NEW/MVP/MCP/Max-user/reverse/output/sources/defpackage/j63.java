package defpackage;

import android.database.Cursor;
import java.util.Collections;

/* loaded from: classes2.dex */
public final /* synthetic */ class j63 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;

    public /* synthetic */ j63(Object obj, long j, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        rg2 rg2Var;
        switch (this.a) {
            case 0:
                ve2 ve2VarI = ((w63) this.b).i();
                long j = this.c;
                pb2 pb2VarP = ve2VarI.P(j);
                if (pb2VarP == null || !(pb2VarP.F() || pb2VarP.V())) {
                    return ve2VarI.m(pf2.a, Collections.singletonList(Long.valueOf(j)), null, null);
                }
                return pb2VarP;
            case 1:
                return ((w63) this.b).i().J(this.c);
            default:
                jrd jrdVar = (jrd) this.b;
                ayd aydVarA = jrdVar.d().a(this.c);
                if (aydVarA == null) {
                    return null;
                }
                m03 m03VarC = jrdVar.c();
                long j2 = aydVarA.b;
                m03VarC.getClass();
                dsd dsdVarC = dsd.c(1, "SELECT * FROM chats WHERE id = ?");
                dsdVarC.k(1, j2);
                lrd lrdVar = m03VarC.a;
                lrdVar.b();
                Cursor cursorN = lrdVar.n(dsdVarC);
                try {
                    int iC = s7j.c(cursorN, "id");
                    int iC2 = s7j.c(cursorN, "server_id");
                    int iC3 = s7j.c(cursorN, "data");
                    int iC4 = s7j.c(cursorN, "favourite_index");
                    int iC5 = s7j.c(cursorN, "sort_time");
                    int iC6 = s7j.c(cursorN, "cid");
                    if (cursorN.moveToFirst()) {
                        rg2Var = new rg2(cursorN.getLong(iC), cursorN.getLong(iC2), m03VarC.a().c(cursorN.isNull(iC3) ? null : cursorN.getBlob(iC3)), cursorN.getLong(iC4), cursorN.getLong(iC5), cursorN.getLong(iC6));
                    } else {
                        rg2Var = null;
                    }
                    if (rg2Var != null) {
                        return jrdVar.a(rg2Var);
                    }
                    return null;
                } finally {
                    cursorN.close();
                    dsdVarC.y();
                }
        }
    }
}
