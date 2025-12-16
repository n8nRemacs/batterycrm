package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public abstract class gia {
    public final f84 a;
    public final k18 b;
    public x9f c;
    public x0a d;

    public gia(f84 f84Var, k18 k18Var) {
        this.a = f84Var;
        this.b = k18Var;
    }

    public final void a() {
        x9f x9fVar = this.c;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.c = null;
        eia eiaVar = (eia) this;
        ReentrantLock reentrantLock = eiaVar.f;
        reentrantLock.lock();
        try {
            eiaVar.e.c();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long b() {
        int i = s65.d;
        l5c l5cVar = ((z7c) this.b.getValue()).b;
        l5cVar.getClass();
        return v9j.i(l5cVar.m(PmsKey.f113noncontactcollectioninterval, TimeUnit.SECONDS.toMillis(10L)), y65.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.n8a r10, defpackage.q44 r11) {
        /*
            r9 = this;
            qqg r0 = defpackage.qqg.a
            boolean r1 = r11 instanceof defpackage.fia
            if (r1 == 0) goto L15
            r1 = r11
            fia r1 = (defpackage.fia) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            fia r1 = new fia
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.o
            g84 r2 = defpackage.g84.a
            int r3 = r1.Y
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 != r5) goto L30
            gia r10 = r1.d
            defpackage.g8j.b(r11)     // Catch: java.lang.Throwable -> L2c java.lang.Error -> L2e
            return r0
        L2c:
            r11 = move-exception
            goto L77
        L2e:
            r10 = move-exception
            goto L93
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.g8j.b(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            l6b r3 = defpackage.wqi.a
            if (r3 != 0) goto L48
            goto L5f
        L48:
            lg8 r6 = defpackage.lg8.d
            boolean r7 = r3.b(r6)
            if (r7 == 0) goto L5f
            r7 = 31
            java.lang.String r7 = defpackage.n8a.k(r10, r7)
            java.lang.String r8 = "request ids "
            java.lang.String r7 = r8.concat(r7)
            r3.c(r6, r11, r7, r4)
        L5f:
            boolean r11 = r10.i()
            if (r11 == 0) goto L66
            goto L7e
        L66:
            x0a r11 = r9.d     // Catch: java.lang.Error -> L2e java.lang.Throwable -> L75
            if (r11 == 0) goto L7e
            r1.d = r9     // Catch: java.lang.Error -> L2e java.lang.Throwable -> L75
            r1.Y = r5     // Catch: java.lang.Error -> L2e java.lang.Throwable -> L75
            java.lang.Object r10 = r11.invoke(r10, r1)     // Catch: java.lang.Error -> L2e java.lang.Throwable -> L75
            if (r10 != r2) goto L7e
            return r2
        L75:
            r11 = move-exception
            r10 = r9
        L77:
            r10.a()
            boolean r11 = r11 instanceof java.util.concurrent.CancellationException
            if (r11 == 0) goto L7f
        L7e:
            return r0
        L7f:
            eia r10 = (defpackage.eia) r10
            r10.a()
            f84 r11 = r10.a
            dia r1 = new dia
            r1.<init>(r10, r4)
            r2 = 3
            x9f r11 = defpackage.svi.e(r11, r4, r4, r1, r2)
            r10.c = r11
            return r0
        L93:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gia.c(n8a, q44):java.lang.Object");
    }
}
