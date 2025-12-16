package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class qpa {
    public static final /* synthetic */ int e = 0;
    public final lzf a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public qpa(k18 k18Var, k18 k18Var2, k18 k18Var3, lzf lzfVar) {
        this.a = lzfVar;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.qpa r4, java.util.List r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ipa
            if (r0 == 0) goto L13
            r0 = r6
            ipa r0 = (defpackage.ipa) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ipa r0 = new ipa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L46
            return r6
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.g8j.b(r6)
            k18 r4 = r4.b     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L46
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L46
            vs5 r4 = (defpackage.vs5) r4     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L46
            r0.X = r2     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L46
            java.lang.Object r4 = r4.a(r5, r0)     // Catch: java.lang.Throwable -> L44 java.util.concurrent.CancellationException -> L46
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L43
            return r5
        L43:
            return r4
        L44:
            r4 = move-exception
            goto L48
        L46:
            r4 = move-exception
            goto L52
        L48:
            java.lang.String r5 = "qpa"
            java.lang.String r6 = "getAnalyticsEntries: failed"
            defpackage.wqi.b(r5, r6, r4)
            hd5 r4 = defpackage.hd5.a
            return r4
        L52:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpa.a(qpa, java.util.List, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.qpa r4, long r5, long r7, defpackage.q44 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.jpa
            if (r0 == 0) goto L14
            r0 = r9
            jpa r0 = (defpackage.jpa) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            jpa r0 = new jpa
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.X
            int r1 = r9.Z
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r7 = r9.o
            long r5 = r9.d
            defpackage.g8j.b(r0)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L51
            return r0
        L2b:
            r0 = move-exception
            r4 = r0
            goto L54
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            defpackage.g8j.b(r0)
            k18 r4 = r4.d     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L51
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L51
            wpa r4 = (defpackage.wpa) r4     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L51
            r9.d = r5     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L51
            r9.o = r7     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L51
            r9.Z = r2     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L51
            java.lang.Object r4 = r4.a(r5, r7, r9)     // Catch: java.lang.Throwable -> L2b java.util.concurrent.CancellationException -> L51
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L50
            return r5
        L50:
            return r4
        L51:
            r0 = move-exception
            r4 = r0
            goto L69
        L54:
            java.lang.String r9 = "getProcessedMessage: failed for chatServerId="
            java.lang.String r0 = ", messageId="
            java.lang.StringBuilder r5 = defpackage.az1.l(r5, r9, r0)
            java.lang.String r6 = " "
            java.lang.String r5 = defpackage.ho7.k(r5, r7, r6)
            java.lang.String r6 = "qpa"
            defpackage.wqi.b(r6, r5, r4)
            r4 = 0
            return r4
        L69:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpa.b(qpa, long, long, q44):java.lang.Object");
    }

    public static final Object c(qpa qpaVar, List list, List list2, boolean z, dtf dtfVar) {
        Object objH;
        Object next;
        qpaVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ws5 ws5Var = (ws5) it.next();
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                upa upaVar = (upa) next;
                if (upaVar.a == ws5Var.b && upaVar.b == ws5Var.c) {
                    break;
                }
            }
            upa upaVar2 = (upa) next;
            if (upaVar2 != null) {
                long j = upaVar2.a;
                long j2 = upaVar2.b;
                if (upaVar2 instanceof tpa) {
                    StringBuilder sbL = az1.l(j2, "onMessagesProcessed: show, messageId=", ", chatId=");
                    sbL.append(j);
                    wqi.c("qpa", sbL.toString(), new Object[0]);
                    boolean z2 = ((tpa) upaVar2).d;
                    rpa rpaVarE = qpaVar.e();
                    rpaVarE.getClass();
                    String str = ws5Var.k;
                    try {
                        if (str.length() != 0) {
                            us usVar = new us(0);
                            rpa.a(usVar, ws5Var);
                            usVar.put("p_op", "show");
                            rpaVarE.b().b(str, usVar);
                        }
                    } catch (Exception e2) {
                        wqi.b(rpa.d, "onNotificationShow: failed", e2);
                        ((y3b) rpaVarE.c()).a(new il4("failed to log notification show", e2));
                    }
                    arrayList.add(ws5.a(ws5Var));
                } else {
                    if (!(upaVar2 instanceof spa)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    x55 x55Var = ((spa) upaVar2).d;
                    StringBuilder sbL2 = az1.l(j2, "onMessagesProcessed: drop, messageId=", ", chatId=");
                    sbL2.append(j);
                    sbL2.append(", reason=");
                    sbL2.append(x55Var);
                    wqi.c("qpa", sbL2.toString(), new Object[0]);
                    rpa rpaVarE2 = qpaVar.e();
                    rpaVarE2.getClass();
                    String str2 = ws5Var.k;
                    try {
                        if (str2.length() != 0) {
                            HashMap map = new HashMap();
                            rpa.a(map, ws5Var);
                            map.put("p_op", "drop");
                            map.put("p_dr", x55Var.a);
                            rpaVarE2.b().b(str2, map);
                        }
                    } catch (Exception e3) {
                        wqi.b(rpa.d, "onNotificationShow: failed", e3);
                        ((y3b) rpaVarE2.c()).a(new il4("failed to log notification drop", e3));
                    }
                    arrayList.add(ws5.a(ws5Var));
                }
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        qqg qqgVar = qqg.a;
        return (zIsEmpty || (objH = qpaVar.h(arrayList, dtfVar)) != g84.a) ? qqgVar : objH;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.qpa r4, java.util.ArrayList r5, defpackage.q44 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ppa
            if (r0 == 0) goto L13
            r0 = r6
            ppa r0 = (defpackage.ppa) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            ppa r0 = new ppa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            goto L57
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.g8j.b(r6)
            k18 r4 = r4.d     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            wpa r4 = (defpackage.wpa) r4     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            r0.X = r2     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            lrd r6 = r4.a     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            ci r1 = new ci     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            r2 = 24
            r1.<init>(r4, r2, r5)     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            java.lang.Object r4 = defpackage.k7j.b(r6, r1, r0)     // Catch: java.lang.Throwable -> L4c java.util.concurrent.CancellationException -> L4e
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L57
            return r5
        L4c:
            r4 = move-exception
            goto L50
        L4e:
            r4 = move-exception
            goto L5a
        L50:
            java.lang.String r5 = "qpa"
            java.lang.String r6 = "storeMessagesProcessed: failed "
            defpackage.wqi.b(r5, r6, r4)
        L57:
            qqg r4 = defpackage.qqg.a
            return r4
        L5a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpa.d(qpa, java.util.ArrayList, q44):java.lang.Object");
    }

    public final rpa e() {
        return (rpa) this.c.getValue();
    }

    public final Object f(lt5 lt5Var, ws5 ws5Var, qqc qqcVar) {
        Object objI = svi.i(((q2b) this.a).b(), new kpa(ws5Var, this, lt5Var, null), qqcVar);
        return objI == g84.a ? objI : qqg.a;
    }

    public final Object g(long j, long j2, dtf dtfVar) {
        Object objI = svi.i(((q2b) this.a).b(), new mpa(this, j, j2, null), dtfVar);
        return objI == g84.a ? objI : qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r5, defpackage.q44 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.npa
            if (r0 == 0) goto L13
            r0 = r6
            npa r0 = (defpackage.npa) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            npa r0 = new npa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.g8j.b(r6)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            goto L57
        L25:
            r5 = move-exception
            goto L50
        L27:
            r5 = move-exception
            goto L5a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r6)
            k18 r6 = r4.b     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            vs5 r6 = (defpackage.vs5) r6     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            r0.X = r2     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            lrd r1 = r6.a     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            ci r2 = new ci     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            r3 = 13
            r2.<init>(r6, r3, r5)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            java.lang.Object r5 = defpackage.k7j.b(r1, r2, r0)     // Catch: java.lang.Throwable -> L25 java.util.concurrent.CancellationException -> L27
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L57
            return r6
        L50:
            java.lang.String r6 = "qpa"
            java.lang.String r0 = "putAnalyticsEntries: failed"
            defpackage.wqi.b(r6, r0, r5)
        L57:
            qqg r5 = defpackage.qqg.a
            return r5
        L5a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpa.h(java.util.List, q44):java.lang.Object");
    }
}
