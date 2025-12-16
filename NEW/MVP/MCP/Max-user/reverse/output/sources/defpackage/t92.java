package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class t92 implements pn6 {
    public final x74 a;
    public final int b;
    public final int c;

    public t92(x74 x74Var, int i, int i2) {
        this.a = x74Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.x26
    public Object d(z26 z26Var, Continuation continuation) {
        Object objD = d7j.d(new r92(z26Var, this, null), continuation);
        return objD == g84.a ? objD : qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    @Override // defpackage.pn6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.x26 e(defpackage.x74 r5, int r6, int r7) {
        /*
            r4 = this;
            x74 r0 = r4.a
            x74 r5 = r5.plus(r0)
            r1 = 1
            int r2 = r4.c
            int r3 = r4.b
            if (r7 == r1) goto Le
            goto L25
        Le:
            r7 = -3
            if (r3 != r7) goto L12
            goto L24
        L12:
            if (r6 != r7) goto L16
        L14:
            r6 = r3
            goto L24
        L16:
            r7 = -2
            if (r3 != r7) goto L1a
            goto L24
        L1a:
            if (r6 != r7) goto L1d
            goto L14
        L1d:
            int r6 = r6 + r3
            if (r6 < 0) goto L21
            goto L24
        L21:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L24:
            r7 = r2
        L25:
            boolean r0 = defpackage.fni.a(r5, r0)
            if (r0 == 0) goto L30
            if (r6 != r3) goto L30
            if (r7 != r2) goto L30
            return r4
        L30:
            t92 r5 = r4.k(r5, r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t92.e(x74, int, int):x26");
    }

    public String f() {
        return null;
    }

    public abstract Object j(sac sacVar, Continuation continuation);

    public abstract t92 k(x74 x74Var, int i, int i2);

    public x26 l() {
        return null;
    }

    public ccd m(f84 f84Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        s92 s92Var = new s92(this, null);
        pac pacVar = new pac(z6j.c(f84Var, this.a), gzi.a(i, this.c, 4));
        pacVar.start(i84.c, pacVar, s92Var);
        return pacVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strF = f();
        if (strF != null) {
            arrayList.add(strF);
        }
        bd5 bd5Var = bd5.a;
        x74 x74Var = this.a;
        if (x74Var != bd5Var) {
            arrayList.add("context=" + x74Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(xc0.o(i2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return u45.l(sb, ue3.N(arrayList, ", ", null, null, null, 62), ']');
    }
}
