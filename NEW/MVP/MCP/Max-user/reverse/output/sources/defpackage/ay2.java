package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class ay2 extends l0g {
    public List c;
    public int d;
    public String o;

    public ay2(tm9 tm9Var) {
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
                this.o = efi.o(tm9Var);
                break;
            case "result":
                this.c = sz.f(tm9Var);
                break;
            case "total":
                this.d = tm9Var.s0();
                break;
            default:
                tm9Var.v();
                break;
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        int iA = zdi.a(this.c);
        int i = this.d;
        return ho7.l(wy1.k("{result=", iA, ", total=", i, ", marker='"), this.o, "'}");
    }
}
