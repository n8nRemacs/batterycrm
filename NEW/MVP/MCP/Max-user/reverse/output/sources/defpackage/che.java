package defpackage;

import java.util.Collections;
import java.util.concurrent.TimeUnit;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class che extends ghe {
    public static final /* synthetic */ int x0 = 0;
    public final cf8 t0;
    public final float u0;
    public final boolean v0;
    public final long w0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r6.b == 0.0d) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public che(defpackage.bhe r6) {
        /*
            r5 = this;
            r5.<init>(r6)
            cf8 r0 = r6.g
            r5.t0 = r0
            float r1 = r6.h
            r5.u0 = r1
            long r1 = r6.i
            r5.w0 = r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L30
            boolean r0 = r0.a()
            if (r0 == 0) goto L2c
            cf8 r6 = r6.g
            double r0 = r6.a
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L26
            goto L2c
        L26:
            double r0 = r6.b
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L30
        L2c:
            r6 = 1
            r5.v0 = r6
            return
        L30:
            r6 = 0
            r5.v0 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.che.<init>(bhe):void");
    }

    @Override // defpackage.ghe
    public final ri9 v() {
        x10 x10Var = new x10();
        long j = ((w4e) i()).j();
        long j2 = this.w0;
        long millis = BuildConfig.MAX_TIME_TO_UPLOAD;
        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            millis = TimeUnit.SECONDS.toMillis(j2) + j;
        }
        g10 g10Var = new g10();
        g10Var.a = this.t0;
        g10Var.g = this.u0;
        g10Var.b = j2;
        g10Var.c = j;
        g10Var.d = millis;
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        g10Var.f = ((lv4) igeVar.d.getValue()).a();
        h10 h10VarA = g10Var.a();
        x00 x00Var = new x00();
        x00Var.v = h10VarA;
        x00Var.a = s10.w0;
        if (this.v0) {
            x00Var.i = p10.o;
        }
        x10Var.a = Collections.singletonList(x00Var.a());
        jdc jdcVarC = x10Var.c();
        ri9 ri9Var = new ri9();
        ri9Var.g = null;
        ri9Var.n = jdcVarC;
        return ri9Var;
    }

    @Override // defpackage.ghe
    public final long w(pb2 pb2Var, long j) {
        long jW = super.w(pb2Var, j);
        if (this.v0) {
            wqi.c("che", "specifyLocation, start TaskLocationRequest to define location", new Object[0]);
            s().c(new wge(((w4e) i()).k(), j, this.w0 != 0));
        }
        return jW;
    }
}
