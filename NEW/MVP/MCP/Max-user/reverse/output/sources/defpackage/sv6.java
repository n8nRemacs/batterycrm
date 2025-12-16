package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class sv6 {
    public final Context a;
    public final String b;
    public final xo8 c;
    public final el d;
    public final cm e;
    public final Looper f;
    public final int g;
    public final yai h;
    public final tha i;
    public final xv6 j;

    public sv6(Context context, xo8 xo8Var, GoogleSignInOptions googleSignInOptions, tha thaVar) {
        this(context, xo8Var, googleSignInOptions, new rv6(thaVar, Looper.getMainLooper()));
    }

    public final te8 a() {
        te8 te8Var = new te8();
        Set set = Collections.EMPTY_SET;
        if (((xs) te8Var.c) == null) {
            te8Var.c = new xs(0);
        }
        ((xs) te8Var.c).addAll(set);
        Context context = this.a;
        te8Var.b = context.getClass().getName();
        te8Var.a = context.getPackageName();
        return te8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ybj b(int r12, defpackage.mg7 r13) {
        /*
            r11 = this;
            n2g r0 = new n2g
            r0.<init>()
            tha r1 = r11.i
            xv6 r2 = r11.j
            r2.getClass()
            int r3 = r13.b
            if (r3 == 0) goto L8a
            cm r4 = r11.e
            boolean r5 = r2.a()
            if (r5 != 0) goto L19
            goto L56
        L19:
            usd r5 = defpackage.usd.h()
            java.lang.Object r5 = r5.b
            vsd r5 = (defpackage.vsd) r5
            r6 = 1
            if (r5 == 0) goto L58
            boolean r7 = r5.b
            if (r7 == 0) goto L56
            boolean r5 = r5.c
            java.util.concurrent.ConcurrentHashMap r7 = r2.t0
            java.lang.Object r7 = r7.get(r4)
            wai r7 = (defpackage.wai) r7
            if (r7 == 0) goto L54
            fl r8 = r7.d
            boolean r9 = r8 instanceof com.google.android.gms.common.internal.a
            if (r9 == 0) goto L56
            com.google.android.gms.common.internal.a r8 = (com.google.android.gms.common.internal.a) r8
            cwi r9 = r8.E0
            if (r9 == 0) goto L54
            boolean r9 = r8.c()
            if (r9 != 0) goto L54
            ls3 r5 = defpackage.cf2.b(r7, r8, r3)
            if (r5 == 0) goto L56
            int r8 = r7.n
            int r8 = r8 + r6
            r7.n = r8
            boolean r6 = r5.c
            goto L58
        L54:
            r6 = r5
            goto L58
        L56:
            r3 = 0
            goto L78
        L58:
            cf2 r5 = new cf2
            r7 = 0
            if (r6 == 0) goto L63
            long r9 = java.lang.System.currentTimeMillis()
            goto L64
        L63:
            r9 = r7
        L64:
            if (r6 == 0) goto L6a
            long r7 = android.os.SystemClock.elapsedRealtime()
        L6a:
            r5.<init>()
            r5.d = r2
            r5.a = r3
            r5.o = r4
            r5.b = r9
            r5.c = r7
            r3 = r5
        L78:
            if (r3 == 0) goto L8a
            ybj r4 = r0.a
            y1a r5 = r2.w0
            r5.getClass()
            bo0 r6 = new bo0
            r7 = 2
            r6.<init>(r5, r7)
            r4.b(r6, r3)
        L8a:
            sbi r3 = new sbi
            r3.<init>(r12, r13, r0, r1)
            java.util.concurrent.atomic.AtomicInteger r12 = r2.s0
            fbi r13 = new fbi
            int r12 = r12.get()
            r13.<init>(r3, r12, r11)
            y1a r12 = r2.w0
            r1 = 4
            android.os.Message r13 = r12.obtainMessage(r1, r13)
            r12.sendMessage(r13)
            ybj r12 = r0.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sv6.b(int, mg7):ybj");
    }

    public sv6(Context context, xo8 xo8Var, el elVar, rv6 rv6Var) {
        s5j.h(context, "Null context is not permitted.");
        s5j.h(xo8Var, "Api must not be null.");
        s5j.h(rv6Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        s5j.h(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = xo8Var;
        this.d = elVar;
        this.f = rv6Var.b;
        this.e = new cm(xo8Var, elVar, attributionTag);
        this.h = new yai(this);
        xv6 xv6VarE = xv6.e(applicationContext);
        this.j = xv6VarE;
        this.g = xv6VarE.Z.getAndIncrement();
        this.i = rv6Var.a;
        y1a y1aVar = xv6VarE.w0;
        y1aVar.sendMessage(y1aVar.obtainMessage(7, this));
    }
}
