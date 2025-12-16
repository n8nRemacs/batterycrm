package defpackage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class w06 implements s06 {
    public final List a;
    public final enb b;

    public w06(List list, enb enbVar) {
        this.a = list;
        this.b = enbVar;
    }

    @Override // defpackage.s06
    public final boolean a() {
        List list = this.a;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((s06) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.s06
    public final void b() {
        if (a()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s06) it.next()).b();
        }
    }

    @Override // defpackage.s06
    public final void c() {
        if (a()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s06) it.next()).c();
        }
    }

    @Override // defpackage.s06
    public final void d(vdf vdfVar) {
        boolean z;
        a7d a7dVarP = this.b.p(vdfVar);
        u42 u42VarC = a7dVarP.c();
        if (u42VarC == null) {
            return;
        }
        k5i k5iVarD = lbj.d(lbj.e(a7dVarP.c, u42VarC));
        ArrayList arrayList = (ArrayList) k5iVarD.b;
        boolean z2 = false;
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                BigInteger bigInteger = ((f9f) it.next()).j;
                if (bigInteger != null && bigInteger.compareTo(BigInteger.ZERO) > 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        ArrayList arrayList2 = (ArrayList) k5iVarD.c;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BigInteger bigInteger2 = ((j9f) it2.next()).j;
                if (bigInteger2 != null && bigInteger2.compareTo(BigInteger.ZERO) > 0) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z || z2) {
            Iterator it3 = this.a.iterator();
            while (it3.hasNext()) {
                ((s06) it3.next()).d(vdfVar);
            }
        }
    }

    @Override // defpackage.s06
    public final void e() {
        if (a()) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((s06) it.next()).e();
        }
    }
}
