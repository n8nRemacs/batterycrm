package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class e6i implements Runnable {
    public static final String C0 = cei.m("WorkerWrapper");
    public volatile boolean B0;
    public ma8 X;
    public final u5i Y;
    public final Context a;
    public final String b;
    public final List c;
    public final hc8 d;
    public final r5i o;
    public final qo3 s0;
    public final jac t0;
    public final WorkDatabase u0;
    public final s5i v0;
    public final xt4 w0;
    public final ArrayList x0;
    public String y0;
    public la8 Z = la8.a();
    public final ike z0 = new ike();
    public final ike A0 = new ike();

    public e6i(j35 j35Var) {
        this.a = (Context) j35Var.c;
        this.Y = (u5i) j35Var.b;
        this.t0 = (jac) j35Var.d;
        r5i r5iVar = (r5i) j35Var.Y;
        this.o = r5iVar;
        this.b = r5iVar.a;
        this.c = (List) j35Var.Z;
        this.d = (hc8) j35Var.t0;
        this.X = null;
        this.s0 = (qo3) j35Var.o;
        WorkDatabase workDatabase = (WorkDatabase) j35Var.X;
        this.u0 = workDatabase;
        this.v0 = workDatabase.x();
        this.w0 = workDatabase.s();
        this.x0 = (ArrayList) j35Var.s0;
    }

    public final void a(la8 la8Var) {
        boolean z = la8Var instanceof ka8;
        r5i r5iVar = this.o;
        String str = C0;
        if (!z) {
            if (la8Var instanceof ja8) {
                cei.g().i(str, "Worker result RETRY for " + this.y0);
                c();
                return;
            }
            cei.g().i(str, "Worker result FAILURE for " + this.y0);
            if (r5iVar.d()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        cei.g().i(str, "Worker result SUCCESS for " + this.y0);
        if (r5iVar.d()) {
            d();
            return;
        }
        xt4 xt4Var = this.w0;
        String str2 = this.b;
        s5i s5iVar = this.v0;
        WorkDatabase workDatabase = this.u0;
        workDatabase.c();
        try {
            s5iVar.v(w4i.c, str2);
            s5iVar.u(str2, ((ka8) this.Z).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = xt4Var.x(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (s5iVar.n(str3) == w4i.o) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) xt4Var.b;
                    dsd dsdVarC = dsd.c(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        dsdVarC.S(1);
                    } else {
                        dsdVarC.f(1, str3);
                    }
                    workDatabase_Impl.b();
                    Cursor cursorN = workDatabase_Impl.n(dsdVarC);
                    try {
                        if (cursorN.moveToFirst() && cursorN.getInt(0) != 0) {
                            cei.g().i(str, "Setting status to enqueued for " + str3);
                            s5iVar.v(w4i.a, str3);
                            s5iVar.t(jCurrentTimeMillis, str3);
                        }
                    } finally {
                        cursorN.close();
                        dsdVarC.y();
                    }
                }
            }
            workDatabase.q();
            workDatabase.k();
            e(false);
        } catch (Throwable th) {
            workDatabase.k();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean zH = h();
        String str = this.b;
        WorkDatabase workDatabase = this.u0;
        if (!zH) {
            workDatabase.c();
            try {
                w4i w4iVarN = this.v0.n(str);
                workDatabase.w().b(str);
                if (w4iVarN == null) {
                    e(false);
                } else if (w4iVarN == w4i.b) {
                    a(this.Z);
                } else if (!w4iVarN.a()) {
                    c();
                }
                workDatabase.q();
                workDatabase.k();
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
        List list = this.c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((k0e) it.next()).c(str);
            }
            v0e.a(this.s0, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.b;
        s5i s5iVar = this.v0;
        WorkDatabase workDatabase = this.u0;
        workDatabase.c();
        try {
            s5iVar.v(w4i.a, str);
            s5iVar.t(System.currentTimeMillis(), str);
            s5iVar.r(-1L, str);
            workDatabase.q();
        } finally {
            workDatabase.k();
            e(true);
        }
    }

    public final void d() {
        String str = this.b;
        s5i s5iVar = this.v0;
        WorkDatabase workDatabase = this.u0;
        workDatabase.c();
        try {
            s5iVar.t(System.currentTimeMillis(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s5iVar.a;
            s5iVar.v(w4i.a, str);
            workDatabase_Impl.b();
            olh olhVar = (olh) s5iVar.j;
            vk6 vk6VarA = olhVar.a();
            if (str == null) {
                vk6VarA.S(1);
            } else {
                vk6VarA.f(1, str);
            }
            workDatabase_Impl.c();
            try {
                vk6VarA.w();
                workDatabase_Impl.q();
                workDatabase_Impl.k();
                olhVar.r(vk6VarA);
                workDatabase_Impl.b();
                olhVar = (olh) s5iVar.f;
                vk6VarA = olhVar.a();
                if (str == null) {
                    vk6VarA.S(1);
                } else {
                    vk6VarA.f(1, str);
                }
                workDatabase_Impl.c();
                try {
                    vk6VarA.w();
                    workDatabase_Impl.q();
                    workDatabase_Impl.k();
                    olhVar.r(vk6VarA);
                    s5iVar.r(-1L, str);
                    workDatabase.q();
                } finally {
                }
            } finally {
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r5) {
        /*
            r4 = this;
            androidx.work.impl.WorkDatabase r0 = r4.u0
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r4.u0     // Catch: java.lang.Throwable -> L41
            s5i r0 = r0.x()     // Catch: java.lang.Throwable -> L41
            r0.getClass()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            dsd r1 = defpackage.dsd.c(r2, r1)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L41
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L41
            r0.b()     // Catch: java.lang.Throwable -> L41
            android.database.Cursor r0 = r0.n(r1)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            r3 = 1
            goto L31
        L2e:
            r5 = move-exception
            goto L9a
        L30:
            r3 = r2
        L31:
            r0.close()     // Catch: java.lang.Throwable -> L41
            r1.y()     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L43
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L41
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.klb.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r5 = move-exception
            goto La1
        L43:
            if (r5 == 0) goto L57
            s5i r0 = r4.v0     // Catch: java.lang.Throwable -> L41
            w4i r1 = defpackage.w4i.a     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r4.b     // Catch: java.lang.Throwable -> L41
            r0.v(r1, r2)     // Catch: java.lang.Throwable -> L41
            s5i r0 = r4.v0     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L41
            r2 = -1
            r0.r(r2, r1)     // Catch: java.lang.Throwable -> L41
        L57:
            r5i r0 = r4.o     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L86
            ma8 r0 = r4.X     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L86
            jac r0 = r4.t0     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r0.v0     // Catch: java.lang.Throwable -> L41
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L41
            java.util.HashMap r0 = r0.X     // Catch: java.lang.Throwable -> L83
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L86
            jac r0 = r4.t0     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r4.b     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r0.v0     // Catch: java.lang.Throwable -> L41
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L41
            java.util.HashMap r3 = r0.X     // Catch: java.lang.Throwable -> L80
            r3.remove(r1)     // Catch: java.lang.Throwable -> L80
            r0.i()     // Catch: java.lang.Throwable -> L80
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            goto L86
        L80:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L80
            throw r5     // Catch: java.lang.Throwable -> L41
        L83:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L83
            throw r5     // Catch: java.lang.Throwable -> L41
        L86:
            androidx.work.impl.WorkDatabase r0 = r4.u0     // Catch: java.lang.Throwable -> L41
            r0.q()     // Catch: java.lang.Throwable -> L41
            androidx.work.impl.WorkDatabase r0 = r4.u0
            r0.k()
            ike r0 = r4.z0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.i(r5)
            return
        L9a:
            r0.close()     // Catch: java.lang.Throwable -> L41
            r1.y()     // Catch: java.lang.Throwable -> L41
            throw r5     // Catch: java.lang.Throwable -> L41
        La1:
            androidx.work.impl.WorkDatabase r0 = r4.u0
            r0.k()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6i.e(boolean):void");
    }

    public final void f() {
        s5i s5iVar = this.v0;
        String str = this.b;
        w4i w4iVarN = s5iVar.n(str);
        w4i w4iVar = w4i.b;
        String str2 = C0;
        if (w4iVarN == w4iVar) {
            cei.g().c(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        cei.g().c(str2, "Status for " + str + " is " + w4iVarN + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.b;
        WorkDatabase workDatabase = this.u0;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                s5i s5iVar = this.v0;
                if (zIsEmpty) {
                    s5iVar.u(str, ((ia8) this.Z).a);
                    workDatabase.q();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (s5iVar.n(str2) != w4i.X) {
                        s5iVar.v(w4i.d, str2);
                    }
                    linkedList.addAll(this.w0.x(str2));
                }
            }
        } finally {
            workDatabase.k();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.B0) {
            return false;
        }
        cei.g().c(C0, "Work interrupted for " + this.y0);
        if (this.v0.n(this.b) == null) {
            e(false);
            return true;
        }
        e(!r0.a());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: all -> 0x007c, TryCatch #2 {all -> 0x007c, blocks: (B:14:0x0050, B:17:0x005a, B:22:0x007f, B:24:0x0085, B:26:0x0089, B:36:0x00c0, B:31:0x0092, B:33:0x009e), top: B:107:0x0050 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e6i.run():void");
    }
}
