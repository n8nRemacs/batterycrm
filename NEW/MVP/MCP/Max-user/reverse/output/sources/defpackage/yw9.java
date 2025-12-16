package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes2.dex */
public final class yw9 implements iw9 {
    public static final /* synthetic */ yy7[] o;
    public final Context a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final k18 g;
    public final k18 h;
    public Integer i;
    public final nxg j;
    public final tcf k;
    public final t9f l;
    public final n9a m;
    public final m8a n;

    static {
        z8a z8aVar = new z8a(yw9.class, "selfPersonJob", "getSelfPersonJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        o = new yy7[]{z8aVar};
    }

    public yw9(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, l4e l4eVar, lzf lzfVar, nxg nxgVar, qi8 qi8Var) {
        this.a = context;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        this.f = k18Var5;
        this.g = k18Var7;
        this.h = k18Var8;
        this.j = nxgVar;
        String string = context.getString(c5d.tt_you);
        ltb ltbVar = new ltb();
        ltbVar.a = string;
        ltbVar.b = null;
        ltbVar.c = null;
        ltbVar.d = null;
        ltbVar.e = false;
        ltbVar.f = false;
        this.k = ucf.a(ltbVar);
        this.l = c7j.c();
        Symbol symbol = o9a.a;
        this.m = new n9a();
        this.n = new m8a(25);
        zs0.e(new g56(new z41(new d53(gw0.d(gw0.m(((w4e) ((pb3) l4eVar.a.getValue())).t())), 24), this, l4eVar, 5), new nw9(this, lzfVar, k18Var6, k18Var3, null), 1), d7j.i(nxgVar, bia.a));
        new si8(nxgVar, qi8Var, new d46(qi8Var, this, null, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.yw9 r9, long r10, defpackage.q44 r12) {
        /*
            r9.getClass()
            qqg r0 = defpackage.qqg.a
            boolean r1 = r12 instanceof defpackage.pw9
            if (r1 == 0) goto L18
            r1 = r12
            pw9 r1 = (defpackage.pw9) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.Z = r2
            goto L1d
        L18:
            pw9 r1 = new pw9
            r1.<init>(r9, r12)
        L1d:
            java.lang.Object r12 = r1.X
            g84 r2 = defpackage.g84.a
            int r3 = r1.Z
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 == r4) goto L37
            r9 = 2
            if (r3 != r9) goto L2f
            defpackage.g8j.b(r12)
            return r0
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            long r10 = r1.o
            yw9 r9 = r1.d
            defpackage.g8j.b(r12)
            goto La9
        L3f:
            defpackage.g8j.b(r12)
            r5 = 0
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L50
            java.lang.String r9 = defpackage.zw9.a
            java.lang.String r10 = "cancelServerChatId: failed, serverChatId == 0L"
            defpackage.wqi.r(r9, r10)
            return r0
        L50:
            java.lang.String r12 = defpackage.zw9.a
            l6b r3 = defpackage.wqi.a
            if (r3 != 0) goto L57
            goto L7f
        L57:
            lg8 r5 = defpackage.lg8.d
            boolean r6 = r3.b(r5)
            if (r6 == 0) goto L7f
            n9a r6 = r9.m
            boolean r6 = r6.d()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "cancelServerChatId #"
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r8 = " locked="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r7 = 0
            r3.c(r5, r12, r6, r7)
        L7f:
            q7b r12 = r9.h()
            r12.getClass()
            int r12 = (int) r10
            r3 = 32
            long r5 = r10 >> r3
            int r3 = (int) r5
            int r12 = r12 + r3
            x7b r3 = r9.i()
            r3.a(r12)
            k18 r12 = r9.c
            java.lang.Object r12 = r12.getValue()
            dt2 r12 = (defpackage.dt2) r12
            r1.d = r9
            r1.o = r10
            r1.Z = r4
            java.lang.Object r12 = r12.c(r10, r1)
            if (r12 != r2) goto La9
            return r2
        La9:
            m8a r9 = r9.n
            r9.g(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw9.a(yw9, long, q44):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x023c, code lost:
    
        if (r0.m(r3) == r4) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.yw9 r19, defpackage.oma r20, defpackage.q44 r21) throws java.lang.NumberFormatException, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw9.b(yw9, oma, q44):java.lang.Object");
    }

    public static ltb c(gl9 gl9Var) {
        String str = gl9Var.f;
        long j = gl9Var.g;
        if (j == 0) {
            j = gl9Var.c;
        }
        String strValueOf = String.valueOf(j);
        Bitmap bitmap = gl9Var.h;
        IconCompat iconCompatB = bitmap != null ? IconCompat.b(bitmap) : null;
        ltb ltbVar = new ltb();
        ltbVar.a = str;
        ltbVar.b = iconCompatB;
        ltbVar.c = null;
        ltbVar.d = strValueOf;
        ltbVar.e = false;
        ltbVar.f = false;
        return ltbVar;
    }

    public final Object d(q44 q44Var) {
        String str = zw9.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("cancelAll, locked=", this.m.d()), null);
            }
        }
        Object objB = oxi.b(this.m, this, new ow9(this, null), q44Var);
        return objB == g84.a ? objB : qqg.a;
    }

    public final Object e(n8a n8aVar, kg4 kg4Var) {
        qqg qqgVar = qqg.a;
        if (!n8aVar.i()) {
            String str = zw9.a;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "cancelServerChatIds: " + n8aVar + ", locked=" + this.m.d(), null);
                }
            }
            Object objB = oxi.b(this.m, this, new qw9(this, n8aVar, null), kg4Var);
            if (objB == g84.a) {
                return objB;
            }
        }
        return qqgVar;
    }

    public final String f(boolean z) {
        boolean zD = ((tih) this.b.getValue()).d();
        k18 k18Var = this.f;
        if (zD) {
            yka ykaVar = (yka) k18Var.getValue();
            ykaVar.c.getClass();
            if (ykaVar.h("ru.oneme.app.inapp.2") == null) {
                ykaVar.f(ykaVar.e());
            }
            return "ru.oneme.app.inapp.2";
        }
        if (z) {
            yka ykaVar2 = (yka) k18Var.getValue();
            ykaVar2.c.getClass();
            if (ykaVar2.h("ru.oneme.app.dialogs") == null) {
                ykaVar2.f(ykaVar2.d());
            }
            return "ru.oneme.app.dialogs";
        }
        yka ykaVar3 = (yka) k18Var.getValue();
        ykaVar3.c.getClass();
        if (ykaVar3.h("ru.oneme.app.chats") == null) {
            ykaVar3.f(ykaVar3.c());
        }
        return "ru.oneme.app.chats";
    }

    public final nla g(String str) {
        Context context = this.a;
        nla nlaVar = str == null ? new nla(context, null) : new nla(context, str);
        h().getClass();
        nlaVar.F.icon = nxc.ic_notification;
        nlaVar.x = h().d();
        nlaVar.v = "msg";
        nlaVar.f(16, true);
        return nlaVar;
    }

    public final q7b h() {
        return (q7b) this.d.getValue();
    }

    public final x7b i() {
        return (x7b) this.e.getValue();
    }

    public final Object j(kg4 kg4Var) {
        String str = zw9.a;
        l6b l6bVar = wqi.a;
        Continuation continuation = null;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("notifyAllChats locked=", this.m.d()), null);
            }
        }
        Object objB = oxi.b(this.m, this, new sw9(this, continuation, 0), kg4Var);
        return objB == g84.a ? objB : qqg.a;
    }

    public final Object k(n8a n8aVar, q44 q44Var) {
        Object objB;
        qqg qqgVar = qqg.a;
        String str = zw9.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "notifyServerChatIds " + n8aVar + " locked=" + this.m.d(), null);
            }
        }
        return (!n8aVar.i() && (objB = oxi.b(this.m, this, new tw9(this, n8aVar, null), q44Var)) == g84.a) ? objB : qqgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:324:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x024f A[EDGE_INSN: B:375:0x024f->B:87:0x024f BREAK  A[LOOP:13: B:67:0x01ab->B:85:0x0241], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0241 A[LOOP:13: B:67:0x01ab->B:85:0x0241, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.oma r65, defpackage.q44 r66) throws java.lang.NumberFormatException, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 2848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw9.l(oma, q44):java.lang.Object");
    }

    public final Object m(q44 q44Var) {
        Object objD;
        lg8 lg8Var = lg8.d;
        qqg qqgVar = qqg.a;
        List listD = i().d("MESS_GROUP_NOTIF");
        String str = zw9.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, ho7.f(listD.size(), "tryToHideGroupNotification, groupsCount: "), null);
        }
        if (!listD.isEmpty()) {
            x7b x7bVarI = i();
            h().getClass();
            List listD2 = x7bVarI.d("CHAT_NOTIF");
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str, ho7.f(listD2.size(), "tryToHideGroupNotification, messageNotificationsCount: "), null);
            }
            if (listD2.isEmpty() && (objD = d(q44Var)) == g84.a) {
                return objD;
            }
        }
        return qqgVar;
    }
}
