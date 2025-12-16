package defpackage;

import android.R;
import android.os.Bundle;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class gw0 {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};

    public static final m36 A(mwd mwdVar, long j, sm6 sm6Var) {
        if (j > 0) {
            return new m36(mwdVar, new t46(j, sm6Var, null));
        }
        throw new IllegalArgumentException(vb9.e(j, "Expected positive amount of retries, but had ").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(defpackage.x26 r4, defpackage.q44 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.r56
            if (r0 == 0) goto L13
            r0 = r5
            r56 r0 = (defpackage.r56) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            r56 r0 = new r56
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.o
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            uid r4 = r0.d
            defpackage.g8j.b(r5)
            goto L4f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.g8j.b(r5)
            uid r5 = new uid
            r5.<init>()
            kotlinx.coroutines.internal.Symbol r1 = defpackage.bqa.a
            r5.a = r1
            j56 r1 = new j56
            r3 = 2
            r1.<init>(r5, r3)
            r0.d = r5
            r0.X = r2
            java.lang.Object r4 = r4.d(r1, r0)
            g84 r0 = defpackage.g84.a
            if (r4 != r0) goto L4e
            return r0
        L4e:
            r4 = r5
        L4f:
            java.lang.Object r4 = r4.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.bqa.a
            if (r4 == r5) goto L56
            return r4
        L56:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw0.B(x26, q44):java.lang.Object");
    }

    public static final hbd C(x26 x26Var, f84 f84Var, zve zveVar, Object obj) {
        ft0 ft0VarA = wb4.a(x26Var, 1);
        tcf tcfVarA = ucf.a(obj);
        svi.d(f84Var, (x74) ft0VarA.d, zveVar.equals(yve.a) ? i84.a : i84.d, new u56(zveVar, (x26) ft0VarA.c, tcfVarA, obj, null));
        return new hbd(tcfVarA);
    }

    public static ArrayList D(Collection collection, om6 om6Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) om6Var.apply(it.next()));
        }
        return arrayList;
    }

    public static final fa2 E(x26 x26Var, um6 um6Var) {
        int i = i56.a;
        return new fa2(um6Var, x26Var, bd5.a, -2, 1);
    }

    public static final x26 a(x26 x26Var, int i, int i2) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(ho7.f(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i == -1 && i2 != 1) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            i = 0;
            i2 = 2;
        }
        int i3 = i;
        int i4 = i2;
        return x26Var instanceof pn6 ? me9.a((pn6) x26Var, null, i3, i4, 1) : new ba2(i3, i4, 2, null, x26Var);
    }

    public static /* synthetic */ x26 b(x26 x26Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return a(x26Var, i, 1);
    }

    public static final su1 c(sm6 sm6Var) {
        return new su1(sm6Var, bd5.a, -2, 1);
    }

    public static final o42 d(x26 x26Var) {
        if (!(x26Var instanceof o42)) {
            x26Var = new q42(x26Var);
        }
        return (o42) x26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable e(defpackage.q44 r5, defpackage.x26 r6, defpackage.z26 r7) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.q46
            if (r0 == 0) goto L13
            r0 = r5
            q46 r0 = (defpackage.q46) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            q46 r0 = new q46
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.o
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            uid r6 = r0.d
            defpackage.g8j.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L4b
        L27:
            r5 = move-exception
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r5)
            uid r5 = new uid
            r5.<init>()
            s46 r1 = new s46     // Catch: java.lang.Throwable -> L4d
            r1.<init>(r7, r5)     // Catch: java.lang.Throwable -> L4d
            r0.d = r5     // Catch: java.lang.Throwable -> L4d
            r0.X = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r5 = r6.d(r1, r0)     // Catch: java.lang.Throwable -> L4d
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L4b
            return r6
        L4b:
            r5 = 0
            return r5
        L4d:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r4
        L51:
            java.lang.Object r6 = r6.a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 == 0) goto L5d
            boolean r7 = r6.equals(r5)
            if (r7 != 0) goto L7d
        L5d:
            x74 r7 = r0.b
            wha r0 = defpackage.wha.w0
            v74 r7 = r7.get(r0)
            qt7 r7 = (defpackage.qt7) r7
            if (r7 == 0) goto L7e
            boolean r0 = r7.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r7 = r7.getCancellationException()
            if (r7 == 0) goto L7e
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L7d
            goto L7e
        L7d:
            throw r5
        L7e:
            if (r6 != 0) goto L81
            return r5
        L81:
            boolean r7 = r5 instanceof java.util.concurrent.CancellationException
            if (r7 == 0) goto L89
            defpackage.saj.a(r6, r5)
            throw r6
        L89:
            defpackage.saj.a(r5, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw0.e(q44, x26, z26):java.io.Serializable");
    }

    public static final u92 f(sm6 sm6Var) {
        return new u92(sm6Var, bd5.a, -2, 1);
    }

    public static final Object g(x26 x26Var, dtf dtfVar) {
        Object objD = x26Var.d(kia.a, dtfVar);
        return objD == g84.a ? objD : qqg.a;
    }

    public static final Object h(x26 x26Var, sm6 sm6Var, dtf dtfVar) {
        Object objG = g(b(x(x26Var, sm6Var), 0, 2), dtfVar);
        return objG == g84.a ? objG : qqg.a;
    }

    public static final y83 i(x26 x26Var, x26 x26Var2, x26 x26Var3, wm6 wm6Var) {
        return new y83(new x26[]{x26Var, x26Var2, x26Var3}, 7, wm6Var);
    }

    public static final c66 j(x26 x26Var, x26 x26Var2, x26 x26Var3, x26 x26Var4, ym6 ym6Var) {
        return new c66(new x26[]{x26Var, x26Var2, x26Var3, x26Var4}, ym6Var);
    }

    public static final x26 k(x26 x26Var, long j) {
        if (j >= 0) {
            return j == 0 ? x26Var : new m11(new h46(new c46(j, 0), x26Var, null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final yy4 l(x26 x26Var, sm6 sm6Var) {
        uog.d(2, sm6Var);
        if (x26Var instanceof yy4) {
            yy4 yy4Var = (yy4) x26Var;
            yy4Var.getClass();
            if (yy4Var.b == sm6Var) {
                return (yy4) x26Var;
            }
        }
        return new yy4(x26Var, sm6Var);
    }

    public static final x26 m(x26 x26Var) {
        if (x26Var instanceof mcf) {
            return x26Var;
        }
        boolean z = x26Var instanceof yy4;
        cj0 cj0Var = n5e.a;
        if (z) {
            yy4 yy4Var = (yy4) x26Var;
            yy4Var.getClass();
            if (yy4Var.b == cj0Var) {
                return (yy4) x26Var;
            }
        }
        return new yy4(x26Var, cj0Var);
    }

    public static final Object n(q44 q44Var, x26 x26Var, z26 z26Var) throws Throwable {
        if (z26Var instanceof g8g) {
            throw ((g8g) z26Var).a;
        }
        Object objD = x26Var.d(z26Var, q44Var);
        return objD == g84.a ? objD : qqg.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.x26 r4, defpackage.sm6 r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.n56
            if (r0 == 0) goto L13
            r0 = r6
            n56 r0 = (defpackage.n56) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            n56 r0 = new n56
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.Y
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            l56 r4 = r0.X
            uid r5 = r0.o
            dtf r0 = r0.d
            sm6 r0 = (defpackage.sm6) r0
            defpackage.g8j.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2d
            goto L69
        L2d:
            r6 = move-exception
            goto L65
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            defpackage.g8j.b(r6)
            uid r6 = new uid
            r6.<init>()
            kotlinx.coroutines.internal.Symbol r1 = defpackage.bqa.a
            r6.a = r1
            l56 r1 = new l56
            r3 = 0
            r1.<init>(r5, r6, r3)
            r3 = r5
            dtf r3 = (defpackage.dtf) r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.o = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.X = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            r0.Z = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            java.lang.Object r4 = r4.d(r1, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L60
            g84 r0 = defpackage.g84.a
            if (r4 != r0) goto L5d
            return r0
        L5d:
            r0 = r5
            r5 = r6
            goto L69
        L60:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r1
        L65:
            java.lang.Object r1 = r6.a
            if (r1 != r4) goto L84
        L69:
            java.lang.Object r4 = r5.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.bqa.a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L84:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw0.o(x26, sm6, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(defpackage.x26 r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof defpackage.m56
            if (r0 == 0) goto L13
            r0 = r5
            m56 r0 = (defpackage.m56) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            m56 r0 = new m56
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.X
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            j56 r4 = r0.o
            uid r0 = r0.d
            defpackage.g8j.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            goto L5e
        L29:
            r5 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.g8j.b(r5)
            uid r5 = new uid
            r5.<init>()
            kotlinx.coroutines.internal.Symbol r1 = defpackage.bqa.a
            r5.a = r1
            j56 r1 = new j56
            r3 = 0
            r1.<init>(r5, r3)
            r0.d = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.o = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            r0.Y = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            java.lang.Object r4 = r4.d(r1, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L56
            g84 r0 = defpackage.g84.a
            if (r4 != r0) goto L54
            return r0
        L54:
            r0 = r5
            goto L5e
        L56:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r1
        L5a:
            java.lang.Object r1 = r5.a
            if (r1 != r4) goto L6d
        L5e:
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.internal.Symbol r5 = defpackage.bqa.a
            if (r4 == r5) goto L65
            return r4
        L65:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L6d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw0.p(x26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.x26 r4, defpackage.q44 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.p56
            if (r0 == 0) goto L13
            r0 = r5
            p56 r0 = (defpackage.p56) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            p56 r0 = new p56
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.X
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            j56 r4 = r0.o
            uid r0 = r0.d
            defpackage.g8j.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            goto L5a
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.g8j.b(r5)
            uid r5 = new uid
            r5.<init>()
            j56 r1 = new j56
            r3 = 1
            r1.<init>(r5, r3)
            r0.d = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.o = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            r0.Y = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            java.lang.Object r4 = r4.d(r1, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L52
            g84 r0 = defpackage.g84.a
            if (r4 != r0) goto L50
            return r0
        L50:
            r0 = r5
            goto L5a
        L52:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r1
        L56:
            java.lang.Object r1 = r5.a
            if (r1 != r4) goto L5d
        L5a:
            java.lang.Object r4 = r0.a
            return r4
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw0.q(x26, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.hbd r4, defpackage.i8h r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.q56
            if (r0 == 0) goto L13
            r0 = r6
            q56 r0 = (defpackage.q56) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            q56 r0 = new q56
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            l56 r4 = r0.o
            uid r5 = r0.d
            defpackage.g8j.b(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L29
            goto L5e
        L29:
            r6 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.g8j.b(r6)
            uid r6 = new uid
            r6.<init>()
            l56 r1 = new l56
            r3 = 1
            r1.<init>(r5, r6, r3)
            r0.d = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            r0.o = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            r0.Y = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            mcf r4 = r4.a     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            java.lang.Object r4 = r4.d(r1, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L58
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L52
            return r5
        L52:
            r5 = r6
            goto L5e
        L54:
            r5 = r6
            r6 = r4
            r4 = r1
            goto L5a
        L58:
            r4 = move-exception
            goto L54
        L5a:
            java.lang.Object r0 = r6.a
            if (r0 != r4) goto L61
        L5e:
            java.lang.Object r4 = r5.a
            return r4
        L61:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw0.r(hbd, i8h, q44):java.lang.Object");
    }

    public static final d53 s(x26 x26Var, sm6 sm6Var) {
        int i = i56.a;
        return new d53(new g56(x26Var, sm6Var, 0), 10);
    }

    public static x26 t(x26 x26Var) {
        int i = i56.a;
        if (i > 0) {
            return i == 1 ? new d53(x26Var, 10) : new y92(i, -2, 1, bd5.a, x26Var);
        }
        throw new IllegalArgumentException(ho7.f(i, "Expected positive concurrency level, but had ").toString());
    }

    public static final x26 u(x26 x26Var, x74 x74Var) {
        if (x74Var.get(wha.w0) == null) {
            return x74Var.equals(bd5.a) ? x26Var : x26Var instanceof pn6 ? me9.a((pn6) x26Var, x74Var, 0, 0, 6) : new ba2(0, 0, 12, x74Var, x26Var);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + x74Var).toString());
    }

    public static zjd v(om6 om6Var, List list) {
        tg7 tg7VarI = wg7.i();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            tg7VarI.a(om6Var.apply(bundle));
        }
        return tg7VarI.i();
    }

    public static final x9f w(x26 x26Var, f84 f84Var) {
        return svi.e(f84Var, null, null, new b46(x26Var, null), 3);
    }

    public static final fa2 x(x26 x26Var, sm6 sm6Var) {
        int i = i56.a;
        return E(x26Var, new mo1(sm6Var, (Continuation) null, 2));
    }

    public static final u92 y(x26... x26VarArr) {
        int i = i56.a;
        return new u92(x26VarArr.length == 0 ? hd5.a : new zs(0, x26VarArr), bd5.a, -2, 1);
    }

    public static final int z(InputStream inputStream, int i, boolean z) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new IOException("no more bytes");
            }
            if (z) {
                i2 = (i5 & 255) << (i4 * 8);
            } else {
                i3 <<= 8;
                i2 = i5 & 255;
            }
            i3 |= i2;
        }
        return i3;
    }
}
