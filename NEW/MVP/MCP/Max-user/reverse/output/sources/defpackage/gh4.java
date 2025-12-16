package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class gh4 extends ih4 {
    public final vnc j;
    public final kme k;

    public gh4(jh4 jh4Var, hj0 hj0Var, oac oacVar, vnc vncVar, kme kmeVar, int i) {
        super(jh4Var, hj0Var, oacVar, i);
        this.j = vncVar;
        this.k = kmeVar;
        this.h = 0;
    }

    @Override // defpackage.ih4
    public final int n(ce5 ce5Var) {
        return this.j.f;
    }

    @Override // defpackage.ih4
    public final fh7 o() {
        int i = this.j.e;
        Object obj = this.k.b;
        boolean z = i >= 0;
        fh7 fh7Var = new fh7();
        fh7Var.a = i;
        fh7Var.b = z;
        fh7Var.c = false;
        return fh7Var;
    }

    @Override // defpackage.ih4
    public final synchronized boolean s(ce5 ce5Var, int i) {
        int iIntValue;
        if (ce5Var == null) {
            return false;
        }
        try {
            boolean zE = this.g.e(ce5Var, i);
            if (hj0.b(i) || hj0.l(i, 8)) {
                if (!hj0.l(i, 4) && ce5.h0(ce5Var)) {
                    ce5Var.i0();
                    if (ce5Var.b == mn4.a) {
                        if (!this.j.b(ce5Var)) {
                            return false;
                        }
                        int i2 = this.j.e;
                        int i3 = this.h;
                        if (i2 <= i3) {
                            return false;
                        }
                        Object obj = this.k.b;
                        List list = Collections.EMPTY_LIST;
                        if (list != null && !list.isEmpty()) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= list.size()) {
                                    iIntValue = Integer.MAX_VALUE;
                                    break;
                                }
                                if (((Integer) list.get(i4)).intValue() > i3) {
                                    iIntValue = ((Integer) list.get(i4)).intValue();
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            iIntValue = i3 + 1;
                        }
                        if (i2 < iIntValue && !this.j.g) {
                            return false;
                        }
                        this.h = i2;
                    }
                }
            }
            return zE;
        } catch (Throwable th) {
            throw th;
        }
    }
}
