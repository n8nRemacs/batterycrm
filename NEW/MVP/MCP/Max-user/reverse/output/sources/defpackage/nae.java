package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class nae implements u25 {
    public final long a;
    public final long b;
    public final ze4 c;
    public final xmb d;
    public final ArrayList e;
    public final jy0 f;
    public final ey0 g;
    public final uy0 h;
    public final Executor i;
    public final long j;
    public final ArrayList k;
    public volatile boolean l;

    public nae(k09 k09Var, xmb xmbVar, jy0 jy0Var, Executor executor, long j, long j2) {
        a09 a09Var = k09Var.b;
        a09Var.getClass();
        this.c = d(a09Var.a);
        this.d = xmbVar;
        this.e = new ArrayList(a09Var.e);
        this.f = jy0Var;
        this.i = executor;
        this.a = j;
        this.b = j2;
        ey0 ey0Var = jy0Var.a;
        ey0Var.getClass();
        this.g = ey0Var;
        this.h = jy0Var.c;
        this.k = new ArrayList();
        this.j = zxg.U(20000L);
    }

    public static ze4 d(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        hsi.i(uri, "The uri must be set.");
        return new ze4(uri, 0L, 1, null, map, 0L, -1L, null, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(java.util.List r21, defpackage.uy0 r22, long r23) {
        /*
            r0 = r21
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = r2
        L9:
            int r4 = r0.size()
            if (r2 >= r4) goto Lb0
            java.lang.Object r4 = r0.get(r2)
            lae r4 = (defpackage.lae) r4
            ze4 r5 = r4.b
            r6 = r22
            java.lang.String r7 = r6.h(r5)
            java.lang.Object r8 = r1.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 != 0) goto L27
            r9 = 0
            goto L31
        L27:
            int r9 = r8.intValue()
            java.lang.Object r9 = r0.get(r9)
            lae r9 = (defpackage.lae) r9
        L31:
            if (r9 == 0) goto La0
            long r10 = r9.a
            ze4 r9 = r9.b
            long r12 = r4.a
            long r14 = r10 + r23
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 > 0) goto La0
            android.net.Uri r12 = r9.a
            long r13 = r9.g
            android.net.Uri r15 = r5.a
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto La0
            r15 = -1
            int r12 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r12 == 0) goto La0
            r17 = r13
            long r12 = r9.f
            long r12 = r12 + r17
            r19 = r12
            long r12 = r5.f
            int r12 = (r19 > r12 ? 1 : (r19 == r12 ? 0 : -1))
            if (r12 != 0) goto La0
            java.lang.String r12 = r9.h
            java.lang.String r13 = r5.h
            boolean r12 = java.util.Objects.equals(r12, r13)
            if (r12 == 0) goto La0
            int r12 = r9.i
            int r13 = r5.i
            if (r12 != r13) goto La0
            int r12 = r9.c
            int r13 = r5.c
            if (r12 != r13) goto La0
            java.util.Map r12 = r9.e
            java.util.Map r13 = r5.e
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto La0
            long r4 = r5.g
            int r7 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r7 != 0) goto L87
        L85:
            r4 = r15
            goto L8a
        L87:
            long r15 = r17 + r4
            goto L85
        L8a:
            r12 = 0
            ze4 r4 = r9.d(r12, r4)
            r8.getClass()
            int r5 = r8.intValue()
            lae r7 = new lae
            r7.<init>(r10, r4)
            r0.set(r5, r7)
            goto Lac
        La0:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.put(r7, r5)
            r0.set(r3, r4)
            int r3 = r3 + 1
        Lac:
            int r2 = r2 + 1
            goto L9
        Lb0:
            int r1 = r0.size()
            defpackage.zxg.b0(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nae.f(java.util.List, uy0, long):void");
    }

    @Override // defpackage.u25
    public final void a(i25 i25Var) {
        ly0 ly0VarC;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            ly0 ly0VarC2 = this.f.c();
            mz5 mz5Var = (mz5) c(new iae(this, ly0VarC2, this.c), false);
            if (!this.e.isEmpty()) {
                mz5Var = (mz5) mz5Var.a(this.e);
            }
            ArrayList arrayListE = e(ly0VarC2, mz5Var, false);
            Collections.sort(arrayListE);
            f(arrayListE, this.h, this.j);
            int size = arrayListE.size();
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = arrayListE.size() - 1; size2 >= 0; size2--) {
                ze4 ze4Var = ((lae) arrayListE.get(size2)).b;
                String strH = this.h.h(ze4Var);
                long j3 = ze4Var.g;
                if (j3 == -1) {
                    long jA = i34.a(((b1f) this.g).i(strH));
                    if (jA != -1) {
                        j3 = jA - ze4Var.f;
                    }
                }
                long j4 = j3;
                long jG = ((b1f) this.g).g(ze4Var.f, j4, strH);
                j2 += jG;
                if (j4 != -1) {
                    if (j4 == jG) {
                        i++;
                        arrayListE.remove(size2);
                    }
                    if (j != -1) {
                        j += j4;
                    }
                } else {
                    j = -1;
                }
            }
            kae kaeVar = new kae(i25Var, j, size, j2, i);
            arrayDeque.addAll(arrayListE);
            while (!this.l && !arrayDeque.isEmpty()) {
                if (arrayDeque2.isEmpty()) {
                    ly0VarC = this.f.c();
                    bArr = new byte[131072];
                } else {
                    mae maeVar = (mae) arrayDeque2.removeFirst();
                    ly0VarC = maeVar.s0;
                    bArr = maeVar.u0;
                }
                mae maeVar2 = new mae((lae) arrayDeque.removeFirst(), ly0VarC, kaeVar, bArr);
                b(maeVar2);
                this.i.execute(maeVar2);
                for (int size3 = this.k.size() - 1; size3 >= 0; size3--) {
                    mae maeVar3 = (mae) this.k.get(size3);
                    if (arrayDeque.isEmpty() || maeVar3.b.e()) {
                        try {
                            maeVar3.get();
                            g(size3);
                            arrayDeque2.addLast(maeVar3);
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                                if (!(cause instanceof IOException)) {
                                    throw cause;
                                }
                                throw ((IOException) cause);
                            }
                            arrayDeque.addFirst(maeVar3.Z);
                            g(size3);
                            arrayDeque2.addLast(maeVar3);
                        }
                    }
                }
                maeVar2.a.b();
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                ((svd) this.k.get(i2)).cancel(true);
            }
            for (int size4 = this.k.size() - 1; size4 >= 0; size4--) {
                ((svd) this.k.get(size4)).a();
                g(size4);
            }
        } catch (Throwable th) {
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                ((svd) this.k.get(i3)).cancel(true);
            }
            for (int size5 = this.k.size() - 1; size5 >= 0; size5--) {
                ((svd) this.k.get(size5)).a();
                g(size5);
            }
            throw th;
        }
    }

    public final void b(svd svdVar) {
        synchronized (this.k) {
            try {
                if (this.l) {
                    throw new InterruptedException();
                }
                this.k.add(svdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object c(svd svdVar, boolean z) throws ExecutionException, InterruptedException, IOException {
        if (z) {
            svdVar.run();
            try {
                return svdVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                String str = zxg.a;
                throw e;
            }
        }
        while (!this.l) {
            b(svdVar);
            this.i.execute(svdVar);
            try {
                return svdVar.get();
            } catch (ExecutionException e2) {
                Throwable cause2 = e2.getCause();
                cause2.getClass();
                if (!(cause2 instanceof PriorityTaskManager$PriorityTooLowException)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    String str2 = zxg.a;
                    throw e2;
                }
            } finally {
                svdVar.a();
                h(svdVar);
            }
        }
        throw new InterruptedException();
    }

    @Override // defpackage.u25
    public final void cancel() {
        synchronized (this.k) {
            try {
                this.l = true;
                for (int i = 0; i < this.k.size(); i++) {
                    ((svd) this.k.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ArrayList e(ly0 ly0Var, mz5 mz5Var, boolean z);

    public final void g(int i) {
        synchronized (this.k) {
            this.k.remove(i);
        }
    }

    public final void h(svd svdVar) {
        synchronized (this.k) {
            this.k.remove(svdVar);
        }
    }

    @Override // defpackage.u25
    public final void remove() {
        uy0 uy0Var = this.h;
        ey0 ey0Var = this.g;
        ze4 ze4Var = this.c;
        jy0 jy0Var = this.f;
        ly0 ly0VarD = jy0Var.d(null, jy0Var.f | 1, -4000);
        try {
            try {
                ArrayList arrayListE = e(ly0VarD, (mz5) c(new iae(this, ly0VarD, ze4Var), true), true);
                for (int i = 0; i < arrayListE.size(); i++) {
                    ((b1f) ey0Var).l(uy0Var.h(((lae) arrayListE.get(i)).b));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            ((b1f) ey0Var).l(uy0Var.h(ze4Var));
        }
    }
}
