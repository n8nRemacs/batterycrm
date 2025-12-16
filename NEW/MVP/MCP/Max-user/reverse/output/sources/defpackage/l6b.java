package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.exception.IssueKeyException;

/* loaded from: classes2.dex */
public final class l6b {
    public final ContextScope a;
    public final String b = l6b.class.getName();
    public final tcf c = ucf.a(lg8.c);
    public final tcf d;
    public final tcf e;
    public final tcf f;
    public int g;
    public iz5 h;
    public final x4b i;
    public final dh4 j;
    public mq k;

    public l6b(mwa mwaVar, mwa mwaVar2, mwa mwaVar3, ContextScope contextScope) {
        this.a = contextScope;
        Boolean bool = Boolean.FALSE;
        this.d = ucf.a(bool);
        this.e = ucf.a(bool);
        this.f = ucf.a(bool);
        this.g = 1;
        this.i = new x4b(mwaVar, contextScope, mwaVar3);
        this.j = new dh4(mwaVar2, contextScope);
    }

    public static /* synthetic */ void d(l6b l6bVar, lg8 lg8Var, String str, String str2) {
        l6bVar.c(lg8Var, str, str2, null);
    }

    public static /* synthetic */ void f(l6b l6bVar, lg8 lg8Var, String str, String str2, Object[] objArr, Throwable th, int i) {
        if ((i & 8) != 0) {
            objArr = null;
        }
        if ((i & 16) != 0) {
            th = null;
        }
        l6bVar.e(lg8Var, str, str2, objArr, th);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009e A[PHI: r0
  0x009e: PHI (r0v6 java.lang.Object) = (r0v4 java.lang.Object), (r0v8 java.lang.Object) binds: [B:37:0x00c6, B:25:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable a(defpackage.q44 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.e6b
            if (r0 == 0) goto L13
            r0 = r8
            e6b r0 = (defpackage.e6b) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            e6b r0 = new e6b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.nio.file.Path r0 = r0.d
            defpackage.g8j.b(r8)
            return r0
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.g8j.b(r8)
            java.lang.String r8 = "DUMP_LOG"
            java.lang.String r1 = "Dumping all logs"
            r3 = 0
            defpackage.wqi.h(r8, r1, r3)
            iz5 r8 = r7.h
            if (r8 != 0) goto L3f
            r8 = r3
        L3f:
            r8.getClass()
            android.content.Context r8 = r8.c
            java.lang.String r8 = defpackage.iz5.b(r8)
            java.lang.String r1 = "logsCache"
            java.io.File r8 = defpackage.iz5.g(r8, r1)
            x4b r1 = r7.i
            java.text.SimpleDateFormat r4 = r1.e
            java.time.Instant r5 = java.time.Instant.now()
            java.util.Date r5 = java.util.Date.from(r5)
            java.lang.String r4 = r4.format(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = ".zip"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.io.File r8 = defpackage.jz5.g(r8, r4)
            java.nio.file.Path r8 = r8.toPath()
            r0.d = r8
            r0.Y = r2
            int r4 = r7.g
            int r4 = defpackage.az1.v(r4)
            g84 r5 = defpackage.g84.a
            qqg r6 = defpackage.qqg.a
            if (r4 == 0) goto La6
            if (r4 != r2) goto La0
            dh4 r1 = r7.j
            r1.getClass()
            m4b r2 = new m4b
            r4 = 1
            r2.<init>(r8, r1, r3, r4)
            java.lang.Object r0 = r1.d(r2, r0)
            if (r0 != r5) goto L9b
            goto L9c
        L9b:
            r0 = r6
        L9c:
            if (r0 != r5) goto Lc9
        L9e:
            r6 = r0
            goto Lc9
        La0:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        La6:
            kotlinx.coroutines.internal.ContextScope r2 = r1.b
            x74 r2 = r2.getCoroutineContext()
            y74 r4 = defpackage.z74.Key
            v74 r2 = r2.get(r4)
            z74 r2 = (defpackage.z74) r2
            if (r2 == 0) goto Lb7
            goto Lb9
        Lb7:
            bd5 r2 = defpackage.bd5.a
        Lb9:
            n4b r4 = new n4b
            r4.<init>(r1, r8, r3)
            java.lang.Object r0 = defpackage.svi.i(r2, r4, r0)
            if (r0 != r5) goto Lc5
            goto Lc6
        Lc5:
            r0 = r6
        Lc6:
            if (r0 != r5) goto Lc9
            goto L9e
        Lc9:
            if (r6 != r5) goto Lcc
            return r5
        Lcc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6b.a(q44):java.lang.Comparable");
    }

    public final boolean b(lg8 lg8Var) {
        if (lg8Var.compareTo((lg8) this.c.getValue()) >= 0) {
            return ((Boolean) this.e.getValue()).booleanValue() || ((Boolean) this.f.getValue()).booleanValue() || this.k != null;
        }
        return false;
    }

    public final void c(lg8 lg8Var, String str, String str2, Throwable th) {
        int i = ((lg8) this.c.getValue()).a;
        int i2 = lg8Var.a;
        if (i <= i2) {
            if (((Boolean) this.e.getValue()).booleanValue()) {
                Log.println(i2, str, str2 == null ? "" : str2);
            }
            if (((Boolean) this.f.getValue()).booleanValue()) {
                x4b x4bVar = this.i;
                j4b j4bVarE = x4bVar.e();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String name = Thread.currentThread().getName();
                j4bVarE.a = jCurrentTimeMillis;
                j4bVarE.b = name;
                j4bVarE.c = lg8Var;
                j4bVarE.d = str;
                j4bVarE.e = str2;
                j4bVarE.f = th;
                pv0 pv0Var = x4bVar.h;
                if (pv0Var.g(j4bVarE) instanceof ma2) {
                    int iV = az1.v(1);
                    if (iV == 0) {
                        x4bVar.m.incrementAndGet();
                        x4bVar.i.g(j4bVarE);
                    } else {
                        if (iV != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        izi.b(pv0Var, j4bVarE);
                    }
                }
            }
            if (this.k == null || ((jeg) mq.d.getValue()) == null || i2 <= 2) {
                return;
            }
            if (str2 != null && str2.length() != 0) {
                jeg.a(str + ": " + str2);
            }
            if (i2 < 6 || th == null) {
                return;
            }
            IssueKeyException issueKeyException = th instanceof IssueKeyException ? (IssueKeyException) th : null;
            if (issueKeyException == null) {
                Throwable cause = th.getCause();
                issueKeyException = cause instanceof IssueKeyException ? (IssueKeyException) cause : null;
            }
            jeg.b(i2 == 3 ? sse.Z : i2 == 4 ? sse.Y : i2 == 5 ? sse.o : i2 == 6 ? sse.d : i2 == 7 ? sse.c : sse.X, th, issueKeyException != null ? issueKeyException.a : null);
        }
    }

    public void e(lg8 lg8Var, String str, String str2, Object[] objArr, Throwable th) {
        String str3;
        String strConcat;
        String strI = str2 == null ? "" : str2;
        if (str2 != null && objArr != null) {
            try {
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                strConcat = String.format(locale, str2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            } catch (Throwable unused) {
                strConcat = str2.concat(ys.A(objArr, null, 63));
            }
            strI = strConcat;
        }
        if (th != null) {
            try {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    str3 = "\n" + vmf.c0(stringWriter.toString()).toString();
                    printWriter.close();
                } finally {
                }
            } catch (Throwable unused2) {
                str3 = "\ncould not get stacktrace from error: " + th;
            }
            strI = az1.i(strI, str3);
        }
        if (strI.length() > 0) {
            c(lg8Var, str, strI, th);
        }
    }
}
