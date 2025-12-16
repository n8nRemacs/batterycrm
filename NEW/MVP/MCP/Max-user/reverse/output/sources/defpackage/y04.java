package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class y04 extends sm implements j1g, tsb {
    public final String X;
    public final String Y;
    public final String Z;
    public final long d;
    public final int o;
    public final String s0;

    public y04(int i, long j, long j2, String str, String str2, String str3, String str4) {
        super(j);
        this.d = j2;
        this.o = i;
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.s0 = str4;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        z04 z04Var = (z04) l0gVar;
        if (z04Var.c != null) {
            m().s(Collections.singletonList(z04Var.c), yv3.a);
        }
        ve2 ve2VarL = l();
        long j = this.d;
        pb2 pb2VarP = ve2VarL.P(j);
        if (pb2VarP == null) {
            return;
        }
        rf2 rf2Var = pb2VarP.b;
        long j2 = pb2VarP.a;
        int iV = az1.v(this.o);
        if (iV == 0) {
            l().t(j, of2.d);
            k().c(new n73(Collections.singletonList(Long.valueOf(j2)), true, false, null, null, 124));
            return;
        }
        if (iV == 1) {
            if (z04Var.c != null) {
                j().p(Collections.singletonList(Long.valueOf(z04Var.c.a)));
            }
            l().t(j, of2.a);
            j().f(rf2Var.a);
            k().c(new n73(Collections.singletonList(Long.valueOf(j2)), true, false, null, null, 124));
            return;
        }
        if (iV != 2) {
            if (iV != 3 && iV != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (z04Var.c != null) {
                j().p(Collections.singletonList(Long.valueOf(z04Var.c.a)));
            }
            j().f(rf2Var.a);
            k().c(new n73(Collections.singletonList(Long.valueOf(j2)), true, false, null, null, 124));
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        String str = pzfVar.b;
        boolean zC = qaj.c(str);
        long j = this.a;
        if (!zC) {
            int iV = az1.v(this.o);
            Object obj = null;
            long j2 = this.d;
            if (iV == 0) {
                qv3 qv3VarM = m();
                qv3VarM.getClass();
                wqi.c("ContactController", "undo block, id = " + j2, new Object[0]);
                qv3VarM.c(j2, new i62(14, obj));
                ((jzf) qv3VarM.k.get()).f(Collections.singletonList(Long.valueOf(j2)));
                qv3VarM.f.c(new t24(j2));
            } else if (iV == 1) {
                qv3 qv3VarM2 = m();
                qv3VarM2.getClass();
                wqi.c("ContactController", "undo unblock, id = " + j2, new Object[0]);
                qv3VarM2.c(j2, new i62(14, xv3.a));
                ((jzf) qv3VarM2.k.get()).f(Collections.singletonList(Long.valueOf(j2)));
                qv3VarM2.f.c(new t24(j2));
            } else if (iV == 2) {
                qv3 qv3VarM3 = m();
                qv3VarM3.getClass();
                wqi.c("ContactController", "undo remove, id = " + j2, new Object[0]);
                qv3VarM3.c(j2, new i00(yv3.a, 15, obj));
                qv3VarM3.q(j2, false);
                ((jzf) qv3VarM3.k.get()).f(Collections.singletonList(Long.valueOf(j2)));
                qv3VarM3.f.c(new t24(j2));
            } else if (iV == 3) {
                qv3 qv3VarM4 = m();
                qv3VarM4.getClass();
                wqi.c("ContactController", "undo add, id = " + j2, new Object[0]);
                qv3VarM4.c(j2, new i00(yv3.b, 15, obj));
                ((jzf) qv3VarM4.k.get()).f(Collections.singletonList(Long.valueOf(j2)));
                qv3VarM4.f.c(new t24(j2));
            } else {
                if (iV != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                qv3 qv3VarM5 = m();
                qv3VarM5.getClass();
                Long lValueOf = Long.valueOf(j2);
                String str2 = this.X;
                String str3 = this.Y;
                wqi.c("ContactController", "undo rename, id = %d => %s %s", lValueOf, str2, str3);
                qv3VarM5.c(j2, new lv3(str2, str3, 0));
                tw0 tw0Var = qv3VarM5.f;
                tw0Var.c(new t24(j2));
                ((jzf) qv3VarM5.k.get()).f(Collections.singletonList(Long.valueOf(j2)));
                tw0Var.c(new t24(j2));
            }
            if ("not.found".equals(str)) {
                m().o(j2);
            }
            r().d(j);
        }
        k().c(new rj0(j, pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ContactUpdate contactUpdate = new Tasks.ContactUpdate();
        contactUpdate.requestId = this.a;
        contactUpdate.contactId = this.d;
        String str = this.X;
        if (str != null) {
            contactUpdate.oldName = str;
        }
        String str2 = this.Y;
        if (str2 != null) {
            contactUpdate.oldLastName = str2;
        }
        String str3 = this.Z;
        if (str3 != null) {
            contactUpdate.newName = str3;
        }
        String str4 = this.s0;
        if (str4 != null) {
            contactUpdate.lastName = str4;
        }
        contactUpdate.action = hf3.a(this.o);
        return fl9.toByteArray(contactUpdate);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.o;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(null, 23);
        fh2Var.t(this.d, "contactId");
        int i = this.o;
        if (i != 0) {
            fh2Var.x("action", hf3.a(i));
        }
        String str = this.Z;
        if (!l8g.c(str)) {
            fh2Var.x("firstName", str);
        }
        String str2 = this.s0;
        if (l8g.d(str2)) {
            fh2Var.x("lastName", str2);
        }
        return fh2Var;
    }
}
