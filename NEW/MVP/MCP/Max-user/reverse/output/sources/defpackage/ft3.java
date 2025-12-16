package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ft3 {
    public int b;
    public boolean c;
    public final yt3 d;
    public final int e;
    public ft3 f;
    public m6f i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public ft3(yt3 yt3Var, int i) {
        this.d = yt3Var;
        this.e = i;
    }

    public final void a(ft3 ft3Var, int i) {
        b(ft3Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(ft3 ft3Var, int i, int i2, boolean z) {
        if (ft3Var == null) {
            j();
            return true;
        }
        if (!z && !i(ft3Var)) {
            return false;
        }
        this.f = ft3Var;
        if (ft3Var.a == null) {
            ft3Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, w2i w2iVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                h2f.a(((ft3) it.next()).d, i, arrayList, w2iVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        ft3 ft3Var;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (ft3Var = this.f) == null || ft3Var.d.g0 != 8) ? this.g : i;
    }

    public final ft3 f() {
        int i = this.e;
        int iV = az1.v(i);
        yt3 yt3Var = this.d;
        switch (iV) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return yt3Var.K;
            case 2:
                return yt3Var.L;
            case 3:
                return yt3Var.I;
            case 4:
                return yt3Var.J;
            default:
                throw new AssertionError(hf3.i(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ft3) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.ft3 r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto L65
        L5:
            yt3 r1 = r11.d
            int r11 = r11.e
            r2 = 6
            int r3 = r10.e
            r4 = 1
            if (r11 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r11 = r1.E
            if (r11 == 0) goto L65
            yt3 r11 = r10.d
            boolean r11 = r11.E
            if (r11 != 0) goto L63
            goto L65
        L1c:
            int r5 = defpackage.az1.v(r3)
            r6 = 8
            r7 = 9
            r8 = 4
            r9 = 2
            switch(r5) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            java.lang.String r0 = defpackage.hf3.i(r3)
            r11.<init>(r0)
            throw r11
        L33:
            if (r11 == r2) goto L65
            if (r11 == r6) goto L65
            if (r11 == r7) goto L65
            goto L63
        L3a:
            if (r11 == r9) goto L65
            if (r11 != r8) goto L63
            goto L65
        L3f:
            r2 = 3
            if (r11 == r2) goto L48
            r2 = 5
            if (r11 != r2) goto L46
            goto L48
        L46:
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            boolean r1 = r1 instanceof defpackage.hz6
            if (r1 == 0) goto L52
            if (r2 != 0) goto L63
            if (r11 != r7) goto L65
            goto L63
        L52:
            return r2
        L53:
            if (r11 == r9) goto L5a
            if (r11 != r8) goto L58
            goto L5a
        L58:
            r2 = r0
            goto L5b
        L5a:
            r2 = r4
        L5b:
            boolean r1 = r1 instanceof defpackage.hz6
            if (r1 == 0) goto L64
            if (r2 != 0) goto L63
            if (r11 != r6) goto L65
        L63:
            return r4
        L64:
            return r2
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft3.i(ft3):boolean");
    }

    public final void j() {
        HashSet hashSet;
        ft3 ft3Var = this.f;
        if (ft3Var != null && (hashSet = ft3Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        m6f m6fVar = this.i;
        if (m6fVar == null) {
            this.i = new m6f(1);
        } else {
            m6fVar.d();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + hf3.i(this.e);
    }
}
