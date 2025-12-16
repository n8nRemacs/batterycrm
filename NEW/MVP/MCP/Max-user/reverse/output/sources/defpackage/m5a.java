package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class m5a extends l0g {
    public List c;
    public long d;
    public int o;

    public m5a(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        switch (str) {
            case "marker":
                this.d = efi.l(tm9Var, 0L);
                break;
            case "result":
                this.c = sz.f(tm9Var);
                break;
            case "total":
                this.o = efi.k(tm9Var, 0);
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        int iA = zdi.a(this.c);
        long j = this.d;
        int i = this.o;
        StringBuilder sbM = u45.m(iA, j, "{result=", ", marker=");
        sbM.append(", total=");
        sbM.append(i);
        sbM.append("}");
        return sbM.toString();
    }
}
