package defpackage;

import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.source.hls.SampleQueueMappingException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class z57 implements ixd {
    public final int a;
    public final h67 b;
    public int c = -1;

    public z57(h67 h67Var, int i) {
        this.b = h67Var;
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            int r0 = r6.c
            r1 = 1
            r2 = -1
            if (r0 != r2) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = 0
        L9:
            defpackage.fsi.b(r0)
            h67 r0 = r6.b
            r0.c()
            int[] r3 = r0.U0
            r3.getClass()
            int[] r3 = r0.U0
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.T0
            mfg r0 = r0.S0
            kfg r0 = r0.a(r4)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L2f
            r3 = -3
            goto L3a
        L2f:
            r3 = r5
            goto L3a
        L31:
            boolean[] r0 = r0.X0
            boolean r2 = r0[r3]
            if (r2 == 0) goto L38
            goto L2f
        L38:
            r0[r3] = r1
        L3a:
            r6.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z57.a():void");
    }

    @Override // defpackage.ixd
    public final void b() throws DrmSession$DrmSessionException, SampleQueueMappingException {
        int i = this.c;
        h67 h67Var = this.b;
        if (i == -2) {
            h67Var.c();
            String str = h67Var.S0.a(this.a).c[0].v0;
            StringBuilder sb = new StringBuilder(u45.f(60, str));
            sb.append("Unable to bind a sample queue to TrackGroup with mime type ");
            sb.append(str);
            sb.append(".");
            throw new SampleQueueMappingException(sb.toString());
        }
        if (i == -1) {
            h67Var.u();
        } else if (i != -3) {
            h67Var.u();
            h67Var.F0[i].t();
        }
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.ixd
    public final boolean e() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i = this.c;
        h67 h67Var = this.b;
        return !h67Var.s() && h67Var.F0[i].r(h67Var.d1);
    }

    @Override // defpackage.ixd
    public final int g(long j) throws Throwable {
        if (!c()) {
            return 0;
        }
        int i = this.c;
        h67 h67Var = this.b;
        if (h67Var.s()) {
            return 0;
        }
        f67 f67Var = h67Var.F0[i];
        int iP = f67Var.p(j, h67Var.d1);
        r47 r47Var = (r47) uni.d(h67Var.x0);
        if (r47Var != null && !r47Var.U0) {
            iP = Math.min(iP, r47Var.f(i) - f67Var.n());
        }
        f67Var.z(iP);
        return iP;
    }

    @Override // defpackage.ixd
    public final int i(i5i i5iVar, oh4 oh4Var, int i) {
        gf6 gf6Var;
        if (this.c == -3) {
            oh4Var.a(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            h67 h67Var = this.b;
            ArrayList arrayList = h67Var.x0;
            if (!h67Var.s()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((r47) arrayList.get(i4)).u0;
                        int length = h67Var.F0.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (h67Var.X0[i6] && h67Var.F0[i6].v() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    xxg.G(arrayList, 0, i4);
                    r47 r47Var = (r47) arrayList.get(0);
                    gf6 gf6Var2 = r47Var.d;
                    if (!gf6Var2.equals(h67Var.Q0)) {
                        h67Var.u0.b(h67Var.b, gf6Var2, r47Var.o, r47Var.X, r47Var.Y);
                    }
                    h67Var.Q0 = gf6Var2;
                }
                if (arrayList.isEmpty() || ((r47) arrayList.get(0)).U0) {
                    int iW = h67Var.F0[i2].w(i5iVar, oh4Var, i, h67Var.d1);
                    if (iW == -5) {
                        gf6 gf6VarC = (gf6) i5iVar.b;
                        gf6VarC.getClass();
                        if (i2 == h67Var.L0) {
                            int iV = h67Var.F0[i2].v();
                            while (i3 < arrayList.size() && ((r47) arrayList.get(i3)).u0 != iV) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                gf6Var = ((r47) arrayList.get(i3)).d;
                            } else {
                                gf6Var = h67Var.P0;
                                gf6Var.getClass();
                            }
                            gf6VarC = gf6VarC.c(gf6Var);
                        }
                        i5iVar.b = gf6VarC;
                    }
                    return iW;
                }
            }
        }
        return -3;
    }
}
