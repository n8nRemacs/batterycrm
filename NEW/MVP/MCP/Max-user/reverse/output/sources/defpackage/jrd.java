package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class jrd {
    public static final ov5 g = new ov5(22);
    public final q9b a;
    public final bwf b;
    public final bwf c;
    public final bwf d;
    public final k18 e;
    public final bwf f = new bwf(k54.t0);

    public jrd(q9b q9bVar, k18 k18Var) {
        this.a = q9bVar;
        final int i = 0;
        this.b = new bwf(new cm6(this) { // from class: erd
            public final /* synthetic */ jrd b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.a.l()).u();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.a.l()).O();
                    default:
                        return ((OneMeRoomDatabase) this.b.a.l()).F();
                }
            }
        });
        final int i2 = 1;
        this.c = new bwf(new cm6(this) { // from class: erd
            public final /* synthetic */ jrd b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.a.l()).u();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.a.l()).O();
                    default:
                        return ((OneMeRoomDatabase) this.b.a.l()).F();
                }
            }
        });
        final int i3 = 2;
        this.d = new bwf(new cm6(this) { // from class: erd
            public final /* synthetic */ jrd b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((OneMeRoomDatabase) this.b.a.l()).u();
                    case 1:
                        return ((OneMeRoomDatabase) this.b.a.l()).O();
                    default:
                        return ((OneMeRoomDatabase) this.b.a.l()).F();
                }
            }
        });
        this.e = k18Var;
    }

    public final sf2 a(rg2 rg2Var) {
        ConcurrentHashMap concurrentHashMap = ((ul6) this.f.getValue()).a;
        long j = rg2Var.a;
        rf2 rf2Var = rg2Var.c;
        String str = rf2Var.g;
        if (str != null) {
            concurrentHashMap.put(Long.valueOf(j), str);
        }
        return new sf2(rg2Var.a, rf2Var);
    }

    public final void b() {
        m03 m03VarC = c();
        lrd lrdVar = m03VarC.a;
        lrdVar.c();
        try {
            m03.b(m03VarC);
            lrdVar.q();
            lrdVar.k();
            ((ul6) this.f.getValue()).a.clear();
            zxd zxdVarD = d();
            lrd lrdVar2 = zxdVarD.a;
            lrdVar2.b();
            crd crdVar = zxdVarD.d;
            vk6 vk6VarA = crdVar.a();
            try {
                lrdVar2.c();
                try {
                    vk6VarA.w();
                    lrdVar2.q();
                } finally {
                    lrdVar2.k();
                }
            } finally {
                crdVar.r(vk6VarA);
            }
        } catch (Throwable th) {
            lrdVar.k();
            throw th;
        }
    }

    public final m03 c() {
        return (m03) this.b.getValue();
    }

    public final zxd d() {
        return (zxd) this.c.getValue();
    }

    public final long e(rf2 rf2Var) {
        return ((Number) ((OneMeRoomDatabase) this.a.l()).o(new frd(0, new l3b(this, 20, rf2Var)))).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r5, defpackage.q44 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ird
            if (r0 == 0) goto L13
            r0 = r7
            ird r0 = (defpackage.ird) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ird r0 = new ird
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            jrd r5 = r0.d
            defpackage.g8j.b(r7)
            goto L59
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.g8j.b(r7)
            m03 r7 = r4.c()
            r0.d = r4
            r0.Y = r2
            r7.getClass()
            java.lang.String r1 = "SELECT * FROM chats WHERE id = ?"
            dsd r1 = defpackage.dsd.c(r2, r1)
            android.os.CancellationSignal r5 = defpackage.xrf.m(r1, r2, r5)
            lrd r6 = r7.a
            ci r2 = new ci
            r3 = 3
            r2.<init>(r7, r3, r1)
            java.lang.Object r7 = defpackage.k7j.a(r6, r5, r2, r0)
            g84 r5 = defpackage.g84.a
            if (r7 != r5) goto L58
            return r5
        L58:
            r5 = r4
        L59:
            rg2 r7 = (defpackage.rg2) r7
            if (r7 == 0) goto L62
            sf2 r5 = r5.a(r7)
            return r5
        L62:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrd.f(long, q44):java.lang.Object");
    }

    public final sf2 g(long j) {
        rg2 rg2Var;
        m03 m03VarC = c();
        m03VarC.getClass();
        dsd dsdVarC = dsd.c(1, "SELECT * FROM chats WHERE server_id = ?");
        dsdVarC.k(1, j);
        lrd lrdVar = m03VarC.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "server_id");
            int iC3 = s7j.c(cursorN, "data");
            int iC4 = s7j.c(cursorN, "favourite_index");
            int iC5 = s7j.c(cursorN, "sort_time");
            int iC6 = s7j.c(cursorN, "cid");
            if (cursorN.moveToFirst()) {
                rg2Var = new rg2(cursorN.getLong(iC), cursorN.getLong(iC2), m03VarC.a().c(cursorN.isNull(iC3) ? null : cursorN.getBlob(iC3)), cursorN.getLong(iC4), cursorN.getLong(iC5), cursorN.getLong(iC6));
            } else {
                rg2Var = null;
            }
            if (rg2Var != null) {
                return a(rg2Var);
            }
            return null;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final sf2 h(long j) {
        Object next;
        m03 m03VarC = c();
        m03VarC.getClass();
        dsd dsdVarC = dsd.c(1, "SELECT * FROM chats WHERE cid = ?");
        dsdVarC.k(1, j);
        lrd lrdVar = m03VarC.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "server_id");
            int iC3 = s7j.c(cursorN, "data");
            int iC4 = s7j.c(cursorN, "favourite_index");
            int iC5 = s7j.c(cursorN, "sort_time");
            int iC6 = s7j.c(cursorN, "cid");
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (true) {
                byte[] blob = null;
                if (!cursorN.moveToNext()) {
                    break;
                }
                long j2 = cursorN.getLong(iC);
                long j3 = cursorN.getLong(iC2);
                if (!cursorN.isNull(iC3)) {
                    blob = cursorN.getBlob(iC3);
                }
                arrayList.add(new rg2(j2, j3, m03VarC.a().c(blob), cursorN.getLong(iC4), cursorN.getLong(iC5), cursorN.getLong(iC6)));
            }
            cursorN.close();
            dsdVarC.y();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((rg2) next).c.b == pf2.a) {
                    break;
                }
            }
            rg2 rg2Var = (rg2) next;
            if (rg2Var != null) {
                return a(rg2Var);
            }
            return null;
        } catch (Throwable th) {
            cursorN.close();
            dsdVarC.y();
            throw th;
        }
    }

    public final void i(long j, rf2 rf2Var) {
        long jD = c().d(new rg2(j, rf2Var.a, rf2Var, rf2Var.a().e, o1j.a(((lq9) this.d.getValue()).k(rf2Var.j), rf2Var), rf2Var.l), ((ul6) this.f.getValue()).a);
        k18 k18Var = this.e;
        if (rf2Var.e(((l4e) k18Var.getValue()).a())) {
            d().b(((l4e) k18Var.getValue()).a(), jD);
        }
    }
}
