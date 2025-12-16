package defpackage;

import android.database.Cursor;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class m03 {
    public final lrd a;
    public final l03 b;
    public m73 c;
    public final bi d;
    public final bi e;
    public final bi f;
    public final bi g;
    public final bi h;

    public m03(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new l03(this, oneMeRoomDatabase, 0);
        this.d = new bi(oneMeRoomDatabase, 2);
        this.e = new bi(oneMeRoomDatabase, 3);
        this.f = new bi(oneMeRoomDatabase, 4);
        this.g = new bi(oneMeRoomDatabase, 5);
        this.h = new bi(oneMeRoomDatabase, 6);
    }

    public static void b(m03 m03Var) {
        lrd lrdVar = m03Var.a;
        lrdVar.b();
        bi biVar = m03Var.e;
        vk6 vk6VarA = biVar.a();
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
                biVar.r(vk6VarA);
                lrdVar.b();
                bi biVar2 = m03Var.h;
                vk6 vk6VarA2 = biVar2.a();
                try {
                    lrdVar.c();
                    try {
                        vk6VarA2.w();
                        lrdVar.q();
                    } finally {
                    }
                } finally {
                    biVar2.r(vk6VarA2);
                }
            } finally {
            }
        } catch (Throwable th) {
            biVar.r(vk6VarA);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (defpackage.k7j.b(r9.a, new defpackage.us5(r9, r7, 4), r0) != r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.m03 r7, long r8, defpackage.lq9 r10, defpackage.zxd r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof defpackage.i03
            if (r0 == 0) goto L13
            r0 = r12
            i03 r0 = (defpackage.i03) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            i03 r0 = new i03
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.Y
            int r1 = r0.s0
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            g84 r6 = defpackage.g84.a
            if (r1 == 0) goto L4c
            if (r1 == r5) goto L40
            if (r1 == r4) goto L36
            if (r1 != r3) goto L2e
            defpackage.g8j.b(r12)
            goto L92
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            long r7 = r0.X
            java.lang.Object r9 = r0.d
            zxd r9 = (defpackage.zxd) r9
            defpackage.g8j.b(r12)
            goto L7f
        L40:
            long r8 = r0.X
            zxd r11 = r0.o
            java.lang.Object r7 = r0.d
            m03 r7 = (defpackage.m03) r7
            defpackage.g8j.b(r12)
            goto L66
        L4c:
            defpackage.g8j.b(r12)
            r0.d = r7
            r0.o = r11
            r0.X = r8
            r0.s0 = r5
            lrd r12 = r10.a
            us5 r1 = new us5
            r5 = 1
            r1.<init>(r10, r8, r5)
            java.lang.Object r10 = defpackage.k7j.b(r12, r1, r0)
            if (r10 != r6) goto L66
            goto L91
        L66:
            r0.d = r11
            r0.o = r2
            r0.X = r8
            r0.s0 = r4
            lrd r10 = r7.a
            k03 r12 = new k03
            r1 = 0
            r12.<init>(r7, r8, r1)
            java.lang.Object r7 = defpackage.i8j.a(r10, r12, r0)
            if (r7 != r6) goto L7d
            goto L91
        L7d:
            r7 = r8
            r9 = r11
        L7f:
            r0.d = r2
            r0.s0 = r3
            lrd r10 = r9.a
            us5 r11 = new us5
            r12 = 4
            r11.<init>(r9, r7, r12)
            java.lang.Object r7 = defpackage.k7j.b(r10, r11, r0)
            if (r7 != r6) goto L92
        L91:
            return r6
        L92:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m03.c(m03, long, lq9, zxd, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final synchronized m73 a() {
        try {
            if (this.c == null) {
                this.c = (m73) this.a.l.get(m73.class);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final long d(rg2 rg2Var, ConcurrentHashMap concurrentHashMap) {
        vl6 vl6VarA;
        rf2 rf2Var = rg2Var.c;
        lrd lrdVar = this.a;
        lrdVar.b();
        lrdVar.c();
        try {
            long jC = this.b.C(rg2Var);
            lrdVar.q();
            lrdVar.k();
            Object obj = concurrentHashMap.get(Long.valueOf(jC));
            if (!(obj == null ? false : obj.equals(rf2Var.g))) {
                concurrentHashMap.remove(Long.valueOf(jC));
                String str = rf2Var.g;
                if (str != null) {
                    if (str.length() == 0) {
                        str = null;
                    }
                    if (str != null && (vl6VarA = xl6.a(str)) != null) {
                        String str2 = vl6VarA.a;
                        String str3 = vl6VarA.b;
                        vl6 vl6Var = vl6VarA.c;
                        String str4 = vl6Var != null ? vl6Var.a : null;
                        String str5 = vl6Var != null ? vl6Var.b : null;
                        long j = rg2Var.e;
                        lrdVar.b();
                        bi biVar = this.f;
                        vk6 vk6VarA = biVar.a();
                        vk6VarA.k(1, jC);
                        if (str2 == null) {
                            vk6VarA.S(2);
                        } else {
                            vk6VarA.f(2, str2);
                        }
                        if (str3 == null) {
                            vk6VarA.S(3);
                        } else {
                            vk6VarA.f(3, str3);
                        }
                        if (str4 == null) {
                            vk6VarA.S(4);
                        } else {
                            vk6VarA.f(4, str4);
                        }
                        if (str5 == null) {
                            vk6VarA.S(5);
                        } else {
                            vk6VarA.f(5, str5);
                        }
                        vk6VarA.k(6, j);
                        try {
                            lrdVar.c();
                            try {
                                vk6VarA.l();
                                lrdVar.q();
                                biVar.r(vk6VarA);
                                String str6 = rf2Var.g;
                                if (str6 != null) {
                                    concurrentHashMap.put(Long.valueOf(jC), str6);
                                }
                                wy1.q(jC, "update_fts_title_chat for #", m03.class.getName());
                                return jC;
                            } finally {
                            }
                        } catch (Throwable th) {
                            biVar.r(vk6VarA);
                            throw th;
                        }
                    }
                }
            }
            return jC;
        } finally {
        }
    }

    public final long e(long j) {
        dsd dsdVarC = dsd.c(1, "SELECT id FROM chats WHERE server_id = ?");
        dsdVarC.k(1, j);
        lrd lrdVar = this.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            return cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }
}
