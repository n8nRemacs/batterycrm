package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class md8 implements uj6 {
    public static final /* synthetic */ yy7[] i;
    public final ContextScope c;
    public final int g;
    public volatile long h;
    public rj6 a = rj6.d;
    public final String b = md8.class.getName();
    public final tcf d = ucf.a(hd5.a);
    public final t9f e = c7j.c();
    public final bwf f = new bwf(new c38(4));

    static {
        z8a z8aVar = new z8a(md8.class, "framesJob", "getFramesJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        i = new yy7[]{z8aVar};
    }

    public md8(lzf lzfVar, hrb hrbVar, a84 a84Var) {
        int i2;
        this.c = d7j.a(((q2b) lzfVar).b().plus(a84Var.plus(new c84("Load frames scope"))));
        int iOrdinal = hrbVar.a.ordinal();
        if (iOrdinal == 0) {
            i2 = 5;
        } else if (iOrdinal == 1) {
            i2 = 10;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 20;
        }
        this.g = i2;
    }

    @Override // defpackage.uj6
    public final boolean a() {
        g2h g2hVar = this.a.a;
        return g2hVar != null && g2hVar.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.uj6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r9, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.kd8
            if (r0 == 0) goto L13
            r0 = r11
            kd8 r0 = (defpackage.kd8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L1a
        L13:
            kd8 r0 = new kd8
            q44 r11 = (defpackage.q44) r11
            r0.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r9 = r0.o
            md8 r10 = r0.d
            defpackage.g8j.b(r11)
            goto L66
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.g8j.b(r11)
            int r11 = r8.g
            int r11 = r11 - r3
            double r4 = (double) r11
            float r9 = (float) r9
            long r10 = r8.h
            int r2 = r8.g
            long r6 = (long) r2
            long r10 = r10 / r6
            float r10 = (float) r10
            float r9 = r9 / r10
            double r9 = (double) r9
            double r9 = java.lang.Math.floor(r9)
            int r9 = (int) r9
            double r9 = (double) r9
            double r9 = java.lang.Math.min(r4, r9)
            int r9 = (int) r9
            tcf r10 = r8.d
            jd8 r11 = new jd8
            r11.<init>(r10, r9)
            r0.d = r8
            r0.o = r9
            r0.Z = r3
            java.lang.Object r11 = defpackage.gw0.q(r11, r0)
            if (r11 != r1) goto L65
            return r1
        L65:
            r10 = r8
        L66:
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto L7c
            sj6 r0 = new sj6
            java.lang.Object r9 = r11.get(r9)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            rj6 r10 = r10.a
            int r11 = r10.b
            int r10 = r10.c
            r0.<init>(r11, r10, r9)
            return r0
        L7c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md8.b(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.uj6
    public final rj6 getData() {
        return this.a;
    }

    @Override // defpackage.uj6
    public final void prepare() {
        g2h g2hVar = this.a.a;
        if (g2hVar == null) {
            wqi.e(this.b, "You should call init before prepare!", null);
            return;
        }
        tcf tcfVar = this.d;
        List list = (List) tcfVar.getValue();
        tcfVar.m(null, hd5.a);
        x9f x9fVarE = svi.e(this.c, null, null, new ld8(this, list, g2hVar, null), 3);
        this.e.O(this, i[0], x9fVarE);
    }
}
