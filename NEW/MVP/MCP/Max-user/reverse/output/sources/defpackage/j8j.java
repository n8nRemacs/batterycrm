package defpackage;

import android.content.Intent;
import one.me.android.root.RootController;

/* loaded from: classes.dex */
public abstract class j8j {
    public static final void a(RootController rootController, Intent intent) {
        if (rootController.G0().n()) {
            return;
        }
        t1b t1bVar = t1b.a;
        rya ryaVar = (rya) t1bVar.getAccessor().c(147);
        if (ryaVar.a()) {
            ryaVar.b();
            return;
        }
        if (!((fxa) t1bVar.getAccessor().c(31)).b()) {
            ksd.U.getClass();
            if (ue3.A(jsd.b, intent.getAction())) {
                return;
            }
        }
        ii4 ii4VarP0 = im8.c.p0();
        xl8.b.getClass();
        ii4VarP0.b(oi4.a(xl8.e.a), null);
    }

    public static void b(StringBuilder sb, Object obj) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final RootController c(d6 d6Var) {
        ksd ksdVar = (ksd) d6Var;
        if (ksdVar.k().n()) {
            RootController rootController = (RootController) ksdVar.k().g("RootController");
            ksdVar.k().J();
            return rootController;
        }
        RootController rootController2 = new RootController();
        ytd ytdVarK = ksdVar.k();
        bud budVarA = l8j.a(rootController2, null, null);
        budVarA.d("RootController");
        ytdVarK.S(budVarA);
        return rootController2;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0266  */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.d6 r19, android.content.Intent r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8j.d(d6, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.d6 r14, defpackage.cdb r15) {
        /*
            kcb r0 = r15.o
            t1b r1 = defpackage.t1b.a
            b3b r1 = r1.k()
            eud r1 = r1.f()
            one.me.android.root.RootController r1 = (one.me.android.root.RootController) r1
            ytd r1 = r1.G0()
            java.util.ArrayList r1 = r1.e()
            java.lang.Object r1 = defpackage.ue3.I(r1)
            bud r1 = (defpackage.bud) r1
            r2 = 0
            if (r1 == 0) goto L22
            c54 r1 = r1.a
            goto L23
        L22:
            r1 = r2
        L23:
            boolean r3 = r1 instanceof one.me.sdk.arch.Widget
            if (r3 == 0) goto L2a
            one.me.sdk.arch.Widget r1 = (one.me.sdk.arch.Widget) r1
            goto L2b
        L2a:
            r1 = r2
        L2b:
            if (r1 == 0) goto L94
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r3 = "detect snackbar"
            defpackage.wqi.d(r14, r3)
            int r14 = r0.a
            r3 = 2
            r4 = 0
            if (r14 != r3) goto L72
            r14 = r1
        L41:
            c54 r3 = r14.getParentController()
            if (r3 == 0) goto L4c
            c54 r14 = r14.getParentController()
            goto L41
        L4c:
            android.view.View r14 = r14.getView()
            if (r14 == 0) goto L57
            android.view.ViewParent r14 = r14.getParent()
            goto L58
        L57:
            r14 = r2
        L58:
            boolean r3 = r14 instanceof android.view.View
            if (r3 == 0) goto L5f
            android.view.View r14 = (android.view.View) r14
            goto L60
        L5f:
            r14 = r2
        L60:
            if (r14 == 0) goto L6b
            int r2 = defpackage.m6b.a
            android.view.View r14 = r14.findViewById(r2)
            r2 = r14
            aza r2 = (defpackage.aza) r2
        L6b:
            if (r2 == 0) goto L72
            int r14 = r2.getHeight()
            goto L73
        L72:
            r14 = r4
        L73:
            ccb r2 = new ccb
            r2.<init>(r1)
            kcb r10 = new kcb
            int r0 = r0.c
            int r14 = r14 + r0
            r0 = 3
            r10.<init>(r4, r4, r14, r0)
            r12 = 0
            r13 = 111(0x6f, float:1.56E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r5 = r15
            cdb r14 = defpackage.cdb.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2.b = r14
            r2.i()
            return
        L94:
            java.lang.Class r14 = r14.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r15 = "widget is null for snackbar"
            defpackage.wqi.r(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8j.e(d6, cdb):void");
    }

    public static final void f(d6 d6Var, Intent intent) {
        Object ipdVar;
        cdb cdbVar;
        if (intent == null) {
            intent = d6Var.getIntent();
        }
        try {
            ipdVar = (cdb) rmi.a(intent, "snackbar", cdb.class);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.p(d6Var.getClass().getName(), "showSnackbarIfNeeded fail", thA);
        }
        if ((ipdVar instanceof ipd) || (cdbVar = (cdb) ipdVar) == null) {
            return;
        }
        e(d6Var, cdbVar);
    }
}
