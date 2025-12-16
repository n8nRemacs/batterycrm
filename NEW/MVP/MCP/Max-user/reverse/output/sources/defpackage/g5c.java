package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g5c extends r9g {
    public final int[] X;
    public final int[] Y;
    public final r9g[] Z;
    public final int b;
    public final gze c;
    public final int d;
    public final int o;
    public final Object[] s0;
    public final HashMap t0;

    public g5c(ArrayList arrayList, gze gzeVar) {
        this.c = gzeVar;
        this.b = gzeVar.b.length;
        int size = arrayList.size();
        this.X = new int[size];
        this.Y = new int[size];
        this.Z = new r9g[size];
        this.s0 = new Object[size];
        this.t0 = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i = 0;
        while (it.hasNext()) {
            o99 o99Var = (o99) it.next();
            this.Z[i] = o99Var.a();
            this.Y[i] = iO;
            this.X[i] = iH;
            iO += this.Z[i].o();
            iH += this.Z[i].h();
            this.s0[i] = o99Var.getUid();
            this.t0.put(this.s0[i], Integer.valueOf(i));
            i++;
        }
        this.d = iO;
        this.o = iH;
    }

    @Override // defpackage.r9g
    public final int a(boolean z) {
        if (this.b != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.c.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                r9g[] r9gVarArr = this.Z;
                if (!r9gVarArr[iQ].p()) {
                    return r9gVarArr[iQ].a(z) + this.Y[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // defpackage.r9g
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.t0.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.Z[iIntValue].b(obj3)) != -1) {
                return this.X[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // defpackage.r9g
    public final int c(boolean z) {
        int iR;
        int i = this.b;
        if (i != 0) {
            if (z) {
                int[] iArr = this.c.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                r9g[] r9gVarArr = this.Z;
                if (!r9gVarArr[iR].p()) {
                    return r9gVarArr[iR].c(z) + this.Y[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // defpackage.r9g
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.Y;
        int iC = xxg.c(i + 1, iArr);
        int i3 = iArr[iC];
        r9g[] r9gVarArr = this.Z;
        int iE = r9gVarArr[iC].e(i - i3, i2 == 2 ? 0 : i2, z);
        if (iE != -1) {
            return i3 + iE;
        }
        int iQ = q(iC, z);
        while (iQ != -1 && r9gVarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return r9gVarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.r9g
    public final l9g f(int i, l9g l9gVar, boolean z) {
        int[] iArr = this.X;
        int iC = xxg.c(i + 1, iArr);
        int i2 = this.Y[iC];
        this.Z[iC].f(i - iArr[iC], l9gVar, z);
        l9gVar.c += i2;
        if (z) {
            Object obj = this.s0[iC];
            Object obj2 = l9gVar.b;
            obj2.getClass();
            l9gVar.b = Pair.create(obj, obj2);
        }
        return l9gVar;
    }

    @Override // defpackage.r9g
    public final l9g g(Object obj, l9g l9gVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.t0.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.Y[iIntValue];
        this.Z[iIntValue].g(obj3, l9gVar);
        l9gVar.c += i;
        l9gVar.b = obj;
        return l9gVar;
    }

    @Override // defpackage.r9g
    public final int h() {
        return this.o;
    }

    @Override // defpackage.r9g
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.Y;
        int iC = xxg.c(i + 1, iArr);
        int i3 = iArr[iC];
        r9g[] r9gVarArr = this.Z;
        int iK = r9gVarArr[iC].k(i - i3, i2 == 2 ? 0 : i2, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iC, z);
        while (iR != -1 && r9gVarArr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return r9gVarArr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.r9g
    public final Object l(int i) {
        int[] iArr = this.X;
        int iC = xxg.c(i + 1, iArr);
        return Pair.create(this.s0[iC], this.Z[iC].l(i - iArr[iC]));
    }

    @Override // defpackage.r9g
    public final p9g m(int i, p9g p9gVar, long j) {
        int[] iArr = this.Y;
        int iC = xxg.c(i + 1, iArr);
        int i2 = iArr[iC];
        int i3 = this.X[iC];
        this.Z[iC].m(i - i2, p9gVar, j);
        Object objCreate = this.s0[iC];
        if (!p9g.B0.equals(p9gVar.a)) {
            objCreate = Pair.create(objCreate, p9gVar.a);
        }
        p9gVar.a = objCreate;
        p9gVar.y0 += i3;
        p9gVar.z0 += i3;
        return p9gVar;
    }

    @Override // defpackage.r9g
    public final int o() {
        return this.d;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        gze gzeVar = this.c;
        int i2 = gzeVar.c[i] + 1;
        int[] iArr = gzeVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        gze gzeVar = this.c;
        int i2 = gzeVar.c[i] - 1;
        if (i2 >= 0) {
            return gzeVar.b[i2];
        }
        return -1;
    }
}
