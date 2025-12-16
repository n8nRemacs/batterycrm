package defpackage;

import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.util.List;

/* loaded from: classes2.dex */
public final class lhb extends e9 {
    public final sgb A;
    public final Object B;
    public int C;
    public float D;
    public final int E;
    public final int F;
    public final float G;
    public int H;
    public final dh0 v;
    public final List w;
    public final mwf x;
    public final wfg y;
    public final sgb z;

    public lhb(lfg lfgVar, int[] iArr, dh0 dh0Var, wg7 wg7Var, sgb sgbVar, sgb sgbVar2) {
        super(lfgVar, iArr, dh0Var, WorkRequest.MIN_BACKOFF_MILLIS, 25000L, 25000L, wg7Var);
        this.v = dh0Var;
        this.w = wg7Var;
        this.x = mwf.a;
        this.y = wfg.a;
        this.z = sgbVar;
        this.A = sgbVar2;
        this.B = ipi.b(3, new ffb(2, this));
        this.D = 1.0f;
        this.E = 1279;
        this.F = 719;
        this.G = 0.7f;
    }

    @Override // defpackage.e9, defpackage.bn5
    public final int b() {
        return this.C;
    }

    @Override // defpackage.e9, defpackage.dl0, defpackage.bn5
    public final int g(long j, List list) {
        int i;
        int i2;
        int size = list.size();
        this.x.getClass();
        if (!y(SystemClock.elapsedRealtime(), list)) {
            return list.size();
        }
        if (!list.isEmpty()) {
        }
        if (list.isEmpty()) {
            return 0;
        }
        long jG = zxg.G(this.D, ((aw8) list.get(size - 1)).Y - j);
        long j2 = this.j;
        if (jG >= j2) {
            hf6 hf6Var = this.d[this.C];
            for (int i3 = 0; i3 < size; i3++) {
                aw8 aw8Var = (aw8) list.get(i3);
                hf6 hf6Var2 = aw8Var.d;
                if (zxg.G(this.D, aw8Var.Y - j) >= j2 && hf6Var2.j < hf6Var.j && (i = hf6Var2.v) != -1 && i <= this.F && (i2 = hf6Var2.u) != -1 && i2 <= this.E && i < hf6Var.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.e9, defpackage.bn5
    public final int k() {
        return this.H;
    }

    @Override // defpackage.e9, defpackage.dl0, defpackage.bn5
    public final void l(float f) {
        this.q = f;
        this.D = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f3  */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, k18] */
    @Override // defpackage.e9, defpackage.bn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(long r18, long r20, long r22, java.util.List r24, defpackage.cw8[] r25) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhb.r(long, long, long, java.util.List, cw8[]):void");
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public final int z(long r8, long r10) {
        /*
            r7 = this;
            dh0 r0 = r7.v
            long r1 = r0.f()
            float r1 = (float) r1
            float r2 = r7.G
            float r1 = r1 * r2
            long r1 = (long) r1
            long r3 = r0.b()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L31
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 != 0) goto L1d
            goto L31
        L1d:
            float r10 = (float) r10
            float r11 = r7.D
            float r11 = r10 / r11
            float r0 = (float) r3
            float r11 = r11 - r0
            double r3 = (double) r11
            r5 = 0
            double r3 = java.lang.Math.max(r3, r5)
            float r11 = (float) r3
            float r0 = (float) r1
            float r0 = r0 * r11
            float r0 = r0 / r10
            long r10 = (long) r0
            goto L36
        L31:
            float r10 = (float) r1
            float r11 = r7.D
            float r10 = r10 / r11
            long r10 = (long) r10
        L36:
            java.util.List r0 = r7.w
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3f
            goto L77
        L3f:
            r1 = 1
            r2 = r1
        L41:
            int r3 = r0.size()
            int r3 = r3 - r1
            if (r2 >= r3) goto L57
            java.lang.Object r3 = r0.get(r2)
            c9 r3 = (defpackage.c9) r3
            long r3 = r3.a
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L57
            int r2 = r2 + 1
            goto L41
        L57:
            int r1 = r2 + (-1)
            java.lang.Object r1 = r0.get(r1)
            c9 r1 = (defpackage.c9) r1
            java.lang.Object r0 = r0.get(r2)
            c9 r0 = (defpackage.c9) r0
            long r2 = r1.a
            long r10 = r10 - r2
            float r10 = (float) r10
            long r4 = r0.a
            long r4 = r4 - r2
            float r11 = (float) r4
            float r10 = r10 / r11
            long r1 = r1.b
            long r3 = r0.b
            long r3 = r3 - r1
            float r11 = (float) r3
            float r10 = r10 * r11
            long r10 = (long) r10
            long r10 = r10 + r1
        L77:
            r0 = 0
            r1 = r0
        L79:
            int r2 = r7.b
            if (r0 >= r2) goto L99
            r2 = -9223372036854775808
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 == 0) goto L89
            boolean r2 = r7.q(r0, r8)
            if (r2 != 0) goto L96
        L89:
            hf6[] r1 = r7.d
            r1 = r1[r0]
            int r1 = r1.j
            long r1 = (long) r1
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 > 0) goto L95
            return r0
        L95:
            r1 = r0
        L96:
            int r0 = r0 + 1
            goto L79
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lhb.z(long, long):int");
    }
}
