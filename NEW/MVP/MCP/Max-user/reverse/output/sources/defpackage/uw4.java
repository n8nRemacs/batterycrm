package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public class uw4 extends zt4 {
    public int m;

    public uw4(z2i z2iVar) {
        super(z2iVar);
        if (z2iVar instanceof u67) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.zt4
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            wt4 wt4Var = (wt4) it.next();
            wt4Var.a(wt4Var);
        }
    }
}
