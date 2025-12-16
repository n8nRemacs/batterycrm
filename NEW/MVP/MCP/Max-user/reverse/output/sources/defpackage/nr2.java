package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class nr2 extends l0g {
    public qb2 c;
    public fh9 d;
    public List o;

    public nr2(tm9 tm9Var) {
        super(tm9Var);
        if (this.o == null) {
            this.o = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        int i;
        ArrayList arrayList;
        str.getClass();
        switch (str) {
            case "deletedMessageIds":
                if (tm9Var.w().a() == 7) {
                    arrayList = new ArrayList();
                    int iN0 = tm9Var.n0();
                    for (i = 0; i < iN0; i++) {
                        arrayList.add(Long.valueOf(efi.l(tm9Var, 0L)));
                    }
                } else {
                    tm9Var.v();
                    arrayList = null;
                }
                this.o = arrayList;
                break;
            case "chat":
                this.c = qb2.a(tm9Var);
                break;
            case "message":
                this.d = ovi.a(tm9Var);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        qb2 qb2Var = this.c;
        fh9 fh9Var = this.d;
        int iA = zdi.a(this.o);
        StringBuilder sb = new StringBuilder("{chat=");
        sb.append(qb2Var);
        sb.append(", message=");
        sb.append(fh9Var);
        sb.append(", deletedMessageIds=");
        return ho7.j(sb, iA, "}");
    }
}
