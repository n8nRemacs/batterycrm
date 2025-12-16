package defpackage;

import java.util.Collections;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class sq9 {
    public final tw0 a;
    public final long b;
    public final long c;
    public final jve d = kve.b(0, 0, 7);
    public final ContextScope e;
    public final bwf f;

    public sq9(long j, long j2, tw0 tw0Var, lzf lzfVar) {
        this.a = tw0Var;
        this.b = j;
        this.c = j2;
        this.e = d7j.a(((q2b) lzfVar).c().getImmediate());
        tw0Var.d(this);
        this.f = new bwf(new fr7(16, this));
    }

    @vnf
    public final void onEvent(itg itgVar) {
        if (itgVar.b != this.b) {
            return;
        }
        svi.e(this.e, null, null, new mq9(this, new nj9(Collections.singleton(Long.valueOf(itgVar.c))), null), 3);
    }

    @vnf
    public final void onEvent(jtg jtgVar) {
        if (jtgVar.b != this.b) {
            return;
        }
        svi.e(this.e, null, null, new mq9(this, new nj9(ue3.h0(jtgVar.c)), null), 3);
    }

    @vnf
    public final void onEvent(gj7 gj7Var) {
        if (gj7Var.b != this.b) {
            return;
        }
        long j = this.c;
        svi.e(this.e, null, null, new mq9(this, new hj9(Collections.singleton(Long.valueOf(gj7Var.c)), j != 0 && gj7Var.Y == j), null), 3);
    }

    @vnf
    public final void onEvent(xjb xjbVar) {
        if (xjbVar.b != this.b) {
            return;
        }
        svi.e(this.e, null, null, new mq9(this, new hj9(Collections.singleton(Long.valueOf(xjbVar.d)), true), null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    @defpackage.vnf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(defpackage.q4a r8) {
        /*
            r7 = this;
            java.util.List r0 = r8.o
            long r1 = r8.b
            long r3 = r7.b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lb
            goto L3a
        Lb:
            long r1 = r8.c
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L20
            long r5 = r8.d
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 >= 0) goto L20
            lj9 r8 = new lj9
            r8.<init>(r1, r5)
            goto L2d
        L20:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L2c
            kj9 r8 = new kj9
            r8.<init>(r0)
            goto L2d
        L2c:
            r8 = r4
        L2d:
            if (r8 == 0) goto L3a
            mq9 r0 = new mq9
            r0.<init>(r7, r8, r4)
            r8 = 3
            kotlinx.coroutines.internal.ContextScope r1 = r7.e
            defpackage.svi.e(r1, r4, r4, r0, r8)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq9.onEvent(q4a):void");
    }

    @vnf
    public final void onEvent(n73 n73Var) {
        if (n73Var.b.contains(Long.valueOf(this.b))) {
            svi.e(this.e, null, null, new mq9(this, new ij9(), null), 3);
        }
    }

    @vnf
    public final void onEvent(ph8 ph8Var) {
        svi.e(this.e, null, null, new mq9(this, jj9.a, null), 3);
    }
}
