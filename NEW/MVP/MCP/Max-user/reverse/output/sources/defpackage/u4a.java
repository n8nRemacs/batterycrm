package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class u4a extends sm implements j1g, tsb {
    public static final /* synthetic */ int x0 = 0;
    public final long X;
    public final long Y;
    public final jm9 Z;
    public final long d;
    public final long o;
    public final List s0;
    public final List t0;
    public final boolean u0;
    public final String v0;
    public final String w0;

    public u4a(long j, long j2, long j3, long j4, long j5, String str, String str2, jm9 jm9Var, List list, List list2, boolean z) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = j5;
        this.Z = jm9Var;
        this.s0 = list;
        this.t0 = list2;
        this.u0 = z;
        this.v0 = str == null ? "" : str;
        this.w0 = str2 == null ? "" : str2;
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        qi9 qi9VarD = tmVar.d();
        long j = this.o;
        si9 si9VarM = qi9VarD.m(j);
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        ve2 ve2VarC = tmVar2.c();
        long j2 = this.d;
        pb2 pb2VarM = ve2VarC.M(j2);
        tm tmVar3 = this.c;
        if (tmVar3 == null) {
            tmVar3 = null;
        }
        a3g a3gVarE = tmVar3.e();
        usb usbVar = usb.s0;
        long j3 = this.a;
        Iterator it = a3gVarE.h(j3, usbVar).iterator();
        while (it.hasNext()) {
            u4a u4aVar = (u4a) ((r2g) it.next()).f;
            if (u4aVar.d == j2 && u4aVar.o == j) {
                wqi.c("u4a", "onPreExecute: later edit task found, REMOVE", new Object[0]);
                return 3;
            }
        }
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED || pb2VarM == null || !(pb2VarM.F() || pb2VarM.V())) {
            wqi.c("u4a", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        }
        long j4 = this.Y;
        if (j4 == 0) {
            wqi.c("u4a", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        }
        boolean z = this.u0;
        if (z && si9VarM.s(s10.c)) {
            List<w10> listG = si9VarM.g();
            if (listG == null) {
                listG = hd5.a;
            }
            for (w10 w10Var : listG) {
                if (w10Var.f()) {
                    k10 k10Var = w10Var.b;
                    long j5 = j4;
                    if (k10Var.Z != 0 && l8g.c(k10Var.Y)) {
                        tm tmVar4 = this.c;
                        if (tmVar4 == null) {
                            tmVar4 = null;
                        }
                        if (tmVar4.e().j(j3).c > 20) {
                            wqi.c("u4a", "onPreExecute: taskDb.failsCount > 20, REMOVE", new Object[0]);
                            f();
                            return 3;
                        }
                        tm tmVar5 = this.c;
                        if (tmVar5 == null) {
                            tmVar5 = null;
                        }
                        tmVar5.a().y(this.X, Collections.singletonList(Long.valueOf(j5)));
                        tm tmVar6 = this.c;
                        (tmVar6 != null ? tmVar6 : null).e().c(j3);
                        wqi.c("u4a", "onPreExecute: attaches not ready, SKIP", new Object[0]);
                        return 2;
                    }
                    j4 = j5;
                }
            }
        }
        if (z) {
            if (!((!si9VarM.v() && si9VarM.t()) ? d20.a(si9VarM.x0) : true)) {
                wqi.c("u4a", "onPreExecute: attaches not ready, SKIP", new Object[0]);
                return 2;
            }
        }
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        fh9 fh9Var;
        v4a v4aVar = (v4a) l0gVar;
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        qi9 qi9VarD = tmVar.d();
        long j = this.o;
        si9 si9VarM = qi9VarD.m(j);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED || (fh9Var = v4aVar.c) == null) {
            return;
        }
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        qi9 qi9VarD2 = tmVar2.d();
        ((OneMeRoomDatabase) qi9VarD2.a.c.a.l()).o(new frd(1, new fq(qi9VarD2, fh9Var, si9VarM, this, 5)));
        tm tmVar3 = this.c;
        if (tmVar3 == null) {
            tmVar3 = null;
        }
        ve2 ve2VarC = tmVar3.c();
        long j2 = this.d;
        pb2 pb2VarM = ve2VarC.M(j2);
        if (si9VarM.R0.c() && pb2VarM != null && pb2VarM.b.j == j) {
            tm tmVar4 = this.c;
            if (tmVar4 == null) {
                tmVar4 = null;
            }
            tmVar4.c().H(j2);
        }
        tm tmVar5 = this.c;
        (tmVar5 != null ? tmVar5 : null).b().c(new itg(this.d, si9VarM.a, false));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) throws Throwable {
        String str = pzfVar.b;
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        si9 si9VarM = tmVar.d().m(this.o);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            return;
        }
        if (!qaj.c(str)) {
            if ("attachment.not.ready".equals(str)) {
                tm tmVar2 = this.c;
                if (tmVar2 == null) {
                    tmVar2 = null;
                }
                ((d20) tmVar2.D.getValue()).b(si9VarM);
            } else {
                f();
                tm tmVar3 = this.c;
                if (tmVar3 == null) {
                    tmVar3 = null;
                }
                tmVar3.b().c(new rj0(this.a, pzfVar));
            }
        }
        tm tmVar4 = this.c;
        (tmVar4 != null ? tmVar4 : null).b().c(new itg(this.d, si9VarM.a, false));
    }

    @Override // defpackage.tsb
    public final void f() throws Throwable {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.e().d(this.a);
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        si9 si9VarM = tmVar2.d().m(this.o);
        if (si9VarM != null) {
            tm tmVar3 = this.c;
            if (tmVar3 == null) {
                tmVar3 = null;
            }
            tmVar3.d().t(si9VarM, xi9.o);
            tm tmVar4 = this.c;
            ((w85) (tmVar4 != null ? tmVar4 : null).F.getValue()).a(this.o, this.d, this.w0, this.t0, this.Z, this.s0, this.u0);
        }
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.MsgEdit msgEdit = new Tasks.MsgEdit();
        msgEdit.requestId = this.a;
        msgEdit.chatId = this.d;
        msgEdit.messageId = this.o;
        msgEdit.chatServerId = this.X;
        msgEdit.messageServerId = this.Y;
        msgEdit.text = this.v0;
        msgEdit.oldText = this.w0;
        msgEdit.oldStatus = this.Z.a;
        msgEdit.editAttaches = this.u0;
        List list = this.s0;
        if (list != null) {
            x10 x10Var = new x10();
            x10Var.a = list;
            msgEdit.oldAttaches = a.f(x10Var.c());
        }
        List list2 = this.t0;
        if (list2 != null) {
            msgEdit.oldElements = dj9.c(list2);
        }
        return fl9.toByteArray(msgEdit);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.s0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() throws Throwable {
        sz szVar;
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        pb2 pb2VarM = tmVar.c().M(this.d);
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        si9 si9VarM = tmVar2.d().m(this.o);
        if (pb2VarM == null || si9VarM == null) {
            return null;
        }
        if (this.u0) {
            sz szVarD = po8.d(si9VarM.x0);
            if (szVarD == null) {
                szVarD = new sz();
            }
            szVar = szVarD;
        } else {
            szVar = null;
        }
        List list = si9VarM.N0;
        return new zf8(pb2VarM.b.a, this.Y, this.v0, szVar, list != null ? po8.t(list) : null, si9VarM.Q0);
    }
}
