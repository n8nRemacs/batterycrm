package defpackage;

import androidx.media3.exoplayer.hls.SampleQueueMappingException;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a67 implements jxd {
    public final int a;
    public final i67 b;
    public int c = -1;

    public a67(i67 i67Var, int i) {
        this.b = i67Var;
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
            defpackage.hsi.b(r0)
            i67 r0 = r6.b
            r0.e()
            int[] r3 = r0.U0
            r3.getClass()
            int[] r3 = r0.U0
            int r4 = r6.a
            r3 = r3[r4]
            r5 = -2
            if (r3 != r2) goto L31
            java.util.Set r1 = r0.T0
            nfg r0 = r0.S0
            lfg r0 = r0.a(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a67.a():void");
    }

    @Override // defpackage.jxd
    public final void b() throws IOException {
        int i = this.c;
        i67 i67Var = this.b;
        if (i == -2) {
            i67Var.e();
            throw new SampleQueueMappingException(ho7.i("Unable to bind a sample queue to TrackGroup with MIME type ", i67Var.S0.a(this.a).d[0].n, "."));
        }
        if (i == -1) {
            i67Var.D();
        } else if (i != -3) {
            i67Var.D();
            i67Var.F0[i].w();
        }
    }

    public final boolean c() {
        int i = this.c;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // defpackage.jxd
    public final boolean e() {
        if (this.c == -3) {
            return true;
        }
        if (!c()) {
            return false;
        }
        int i = this.c;
        i67 i67Var = this.b;
        return !i67Var.A() && i67Var.F0[i].u(i67Var.d1);
    }

    @Override // defpackage.jxd
    public final int g(long j) {
        if (!c()) {
            return 0;
        }
        int i = this.c;
        i67 i67Var = this.b;
        if (i67Var.A()) {
            return 0;
        }
        g67 g67Var = i67Var.F0[i];
        int iS = g67Var.s(j, i67Var.d1);
        s47 s47Var = (s47) uni.d(i67Var.x0);
        if (s47Var != null && !s47Var.g()) {
            iS = Math.min(iS, s47Var.f(i) - g67Var.q());
        }
        g67Var.D(iS);
        return iS;
    }

    @Override // defpackage.jxd
    public final int i(xt4 xt4Var, ph4 ph4Var, int i) {
        hf6 hf6Var;
        if (this.c == -3) {
            ph4Var.a(4);
            return -4;
        }
        if (c()) {
            int i2 = this.c;
            i67 i67Var = this.b;
            ArrayList arrayList = i67Var.x0;
            if (!i67Var.A()) {
                int i3 = 0;
                if (!arrayList.isEmpty()) {
                    int i4 = 0;
                    loop0: while (i4 < arrayList.size() - 1) {
                        int i5 = ((s47) arrayList.get(i4)).u0;
                        int length = i67Var.F0.length;
                        for (int i6 = 0; i6 < length; i6++) {
                            if (i67Var.X0[i6] && i67Var.F0[i6].y() == i5) {
                                break loop0;
                            }
                        }
                        i4++;
                    }
                    zxg.b0(arrayList, 0, i4);
                    s47 s47Var = (s47) arrayList.get(0);
                    hf6 hf6Var2 = s47Var.d;
                    if (!hf6Var2.equals(i67Var.Q0)) {
                        i67Var.u0.y(i67Var.b, hf6Var2, s47Var.o, s47Var.X, s47Var.Y);
                    }
                    i67Var.Q0 = hf6Var2;
                }
                if (arrayList.isEmpty() || ((s47) arrayList.get(0)).g()) {
                    int iZ = i67Var.F0[i2].z(xt4Var, ph4Var, i, i67Var.d1);
                    if (iZ == -5) {
                        hf6 hf6VarE = (hf6) xt4Var.c;
                        hf6VarE.getClass();
                        if (i2 == i67Var.L0) {
                            int iB = jni.b(i67Var.F0[i2].y());
                            while (i3 < arrayList.size() && ((s47) arrayList.get(i3)).u0 != iB) {
                                i3++;
                            }
                            if (i3 < arrayList.size()) {
                                hf6Var = ((s47) arrayList.get(i3)).d;
                            } else {
                                hf6Var = i67Var.P0;
                                hf6Var.getClass();
                            }
                            hf6VarE = hf6VarE.e(hf6Var);
                        }
                        xt4Var.c = hf6VarE;
                    }
                    return iZ;
                }
            }
        }
        return -3;
    }
}
