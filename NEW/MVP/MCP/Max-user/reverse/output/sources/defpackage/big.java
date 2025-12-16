package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class big extends shg {
    public int S0;
    public ArrayList Q0 = new ArrayList();
    public boolean R0 = true;
    public boolean T0 = false;
    public int U0 = 0;

    @Override // defpackage.shg
    public final void B(View view) {
        super.B(view);
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((shg) this.Q0.get(i)).B(view);
        }
    }

    @Override // defpackage.shg
    public final void C() {
        this.K0 = 0L;
        int i = 0;
        aig aigVar = new aig(this, i);
        while (i < this.Q0.size()) {
            shg shgVar = (shg) this.Q0.get(i);
            shgVar.a(aigVar);
            shgVar.C();
            long j = shgVar.K0;
            if (this.R0) {
                this.K0 = Math.max(this.K0, j);
            } else {
                long j2 = this.K0;
                shgVar.L0 = j2;
                this.K0 = j2 + j;
            }
            i++;
        }
    }

    @Override // defpackage.shg
    public final shg D(rhg rhgVar) {
        super.D(rhgVar);
        return this;
    }

    @Override // defpackage.shg
    public final void E(View view) {
        for (int i = 0; i < this.Q0.size(); i++) {
            ((shg) this.Q0.get(i)).E(view);
        }
        this.X.remove(view);
    }

    @Override // defpackage.shg
    public final void F(View view) {
        super.F(view);
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((shg) this.Q0.get(i)).F(view);
        }
    }

    @Override // defpackage.shg
    public final void G() {
        if (this.Q0.isEmpty()) {
            O();
            n();
            return;
        }
        aig aigVar = new aig();
        aigVar.b = this;
        Iterator it = this.Q0.iterator();
        while (it.hasNext()) {
            ((shg) it.next()).a(aigVar);
        }
        this.S0 = this.Q0.size();
        if (this.R0) {
            Iterator it2 = this.Q0.iterator();
            while (it2.hasNext()) {
                ((shg) it2.next()).G();
            }
            return;
        }
        for (int i = 1; i < this.Q0.size(); i++) {
            ((shg) this.Q0.get(i - 1)).a(new aig((shg) this.Q0.get(i), 2));
        }
        shg shgVar = (shg) this.Q0.get(0);
        if (shgVar != null) {
            shgVar.G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.shg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.big.H(long, long):void");
    }

    @Override // defpackage.shg
    public final void J(ave aveVar) {
        this.I0 = aveVar;
        this.U0 |= 8;
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((shg) this.Q0.get(i)).J(aveVar);
        }
    }

    @Override // defpackage.shg
    public final void K(TimeInterpolator timeInterpolator) {
        this.U0 |= 1;
        ArrayList arrayList = this.Q0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((shg) this.Q0.get(i)).K(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.shg
    public final void L(dwf dwfVar) {
        super.L(dwfVar);
        this.U0 |= 4;
        if (this.Q0 != null) {
            for (int i = 0; i < this.Q0.size(); i++) {
                ((shg) this.Q0.get(i)).L(dwfVar);
            }
        }
    }

    @Override // defpackage.shg
    public final void M(uha uhaVar) {
        this.H0 = uhaVar;
        this.U0 |= 2;
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((shg) this.Q0.get(i)).M(uhaVar);
        }
    }

    @Override // defpackage.shg
    public final void N(long j) {
        this.b = j;
    }

    @Override // defpackage.shg
    public final String P(String str) {
        String strP = super.P(str);
        for (int i = 0; i < this.Q0.size(); i++) {
            StringBuilder sbO = ho7.o(strP, "\n");
            sbO.append(((shg) this.Q0.get(i)).P(str + "  "));
            strP = sbO.toString();
        }
        return strP;
    }

    public final void Q(rhg rhgVar) {
        super.a(rhgVar);
    }

    public final void R(shg shgVar) {
        this.Q0.add(shgVar);
        shgVar.u0 = this;
        long j = this.c;
        if (j >= 0) {
            shgVar.I(j);
        }
        if ((this.U0 & 1) != 0) {
            shgVar.K(this.d);
        }
        if ((this.U0 & 2) != 0) {
            shgVar.M(this.H0);
        }
        if ((this.U0 & 4) != 0) {
            shgVar.L(this.J0);
        }
        if ((this.U0 & 8) != 0) {
            shgVar.J(this.I0);
        }
    }

    public final shg S(int i) {
        if (i < 0 || i >= this.Q0.size()) {
            return null;
        }
        return (shg) this.Q0.get(i);
    }

    @Override // defpackage.shg
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void I(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.Q0) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((shg) this.Q0.get(i)).I(j);
        }
    }

    public final void U(int i) {
        if (i == 0) {
            this.R0 = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(ho7.f(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.R0 = false;
        }
    }

    @Override // defpackage.shg
    public final void b(View view) {
        for (int i = 0; i < this.Q0.size(); i++) {
            ((shg) this.Q0.get(i)).b(view);
        }
        this.X.add(view);
    }

    @Override // defpackage.shg
    public final void d() {
        super.d();
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((shg) this.Q0.get(i)).d();
        }
    }

    @Override // defpackage.shg
    public final void e(eig eigVar) {
        if (y(eigVar.b)) {
            Iterator it = this.Q0.iterator();
            while (it.hasNext()) {
                shg shgVar = (shg) it.next();
                if (shgVar.y(eigVar.b)) {
                    shgVar.e(eigVar);
                    eigVar.c.add(shgVar);
                }
            }
        }
    }

    @Override // defpackage.shg
    public final void g(eig eigVar) {
        super.g(eigVar);
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((shg) this.Q0.get(i)).g(eigVar);
        }
    }

    @Override // defpackage.shg
    public final void h(eig eigVar) {
        if (y(eigVar.b)) {
            Iterator it = this.Q0.iterator();
            while (it.hasNext()) {
                shg shgVar = (shg) it.next();
                if (shgVar.y(eigVar.b)) {
                    shgVar.h(eigVar);
                    eigVar.c.add(shgVar);
                }
            }
        }
    }

    @Override // defpackage.shg
    /* renamed from: k */
    public final shg clone() {
        big bigVar = (big) super.clone();
        bigVar.Q0 = new ArrayList();
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            shg shgVarClone = ((shg) this.Q0.get(i)).clone();
            bigVar.Q0.add(shgVarClone);
            shgVarClone.u0 = bigVar;
        }
        return bigVar;
    }

    @Override // defpackage.shg
    public final void m(ViewGroup viewGroup, fa6 fa6Var, fa6 fa6Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            shg shgVar = (shg) this.Q0.get(i);
            if (j > 0 && (this.R0 || i == 0)) {
                long j2 = shgVar.b;
                if (j2 > 0) {
                    shgVar.N(j2 + j);
                } else {
                    shgVar.N(j);
                }
            }
            shgVar.m(viewGroup, fa6Var, fa6Var2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.shg
    public final void p(int i) {
        for (int i2 = 0; i2 < this.Q0.size(); i2++) {
            ((shg) this.Q0.get(i2)).p(i);
        }
        super.p(i);
    }

    @Override // defpackage.shg
    public final void q(ViewGroup viewGroup) {
        super.q(viewGroup);
        int size = this.Q0.size();
        for (int i = 0; i < size; i++) {
            ((shg) this.Q0.get(i)).q(viewGroup);
        }
    }

    @Override // defpackage.shg
    public final boolean w() {
        for (int i = 0; i < this.Q0.size(); i++) {
            if (((shg) this.Q0.get(i)).w()) {
                return true;
            }
        }
        return false;
    }
}
