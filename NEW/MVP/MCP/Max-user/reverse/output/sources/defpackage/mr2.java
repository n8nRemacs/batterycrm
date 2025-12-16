package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class mr2 extends sm implements j1g, tsb {
    public final int X;
    public final List Y;
    public final br2 Z;
    public final long d;
    public long o;
    public final boolean s0;
    public final int t0;
    public final int u0;
    public final String v0;

    public mr2(long j, long j2, long j3, int i, List list, br2 br2Var, boolean z, int i2, int i3) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = i;
        this.Y = list;
        this.Z = br2Var;
        this.s0 = z;
        this.t0 = i2;
        this.u0 = i3;
        this.v0 = mr2.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() {
        rf2 rf2Var;
        of2 of2Var;
        pb2 pb2VarM = l().M(this.d);
        if (pb2VarM == null || (of2Var = (rf2Var = pb2VarM.b).c) == of2.X || of2Var == of2.o || of2Var == of2.d) {
            return 3;
        }
        if (this.o == 0) {
            long j = rf2Var.a;
            if (j != 0) {
                this.o = j;
            }
        }
        return this.o != 0 ? 1 : 2;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        pb2 pb2VarM;
        nr2 nr2Var = (nr2) l0gVar;
        boolean zIsEmpty = nr2Var.o.isEmpty();
        long j = this.d;
        if (!zIsEmpty) {
            ArrayList arrayListJ = n().j(j, ue3.e0(nr2Var.o));
            if (!arrayListJ.isEmpty()) {
                ArrayList arrayList = new ArrayList(we3.q(arrayListJ, 10));
                Iterator it = arrayListJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((si9) it.next()).a));
                }
                n().c(j, arrayList);
                k().c(new q4a(j, arrayList, null));
            }
        }
        if (nr2Var.c != null) {
            l().m0(Collections.singletonList(nr2Var.c));
        }
        br2 br2Var = br2.ADMIN;
        br2 br2Var2 = this.Z;
        if (br2Var2 == br2Var && this.X == 1 && (pb2VarM = l().M(j)) != null) {
            Iterator it2 = this.Y.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!pb2VarM.b.R.containsKey(Long.valueOf(((Number) it2.next()).longValue()))) {
                    k().c(new rj0(this.a, new pzf("friend.blocks.me", "friend.blocks.me", null)));
                    break;
                }
            }
        }
        k().c(new or2(this.a, this.Y, br2Var2, this.d, this.X));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (!qaj.c(pzfVar.b)) {
            f();
        }
        k().c(new rj0(this.a, pzfVar));
        if (this.Z == br2.MEMBER) {
            k().c(new s9c(pzfVar, this.d, this.Y));
        }
    }

    @Override // defpackage.tsb
    public final void f() {
        wqi.c(this.v0, "onMaxFailCount", new Object[0]);
        int iOrdinal = this.Z.ordinal();
        int i = this.X;
        List list = this.Y;
        long j = this.d;
        if (iOrdinal == 0) {
            int iV = az1.v(i);
            if (iV == 0) {
                ve2 ve2VarL = l();
                pb2 pb2VarM = ve2VarL.M(j);
                if (pb2VarM != null) {
                    ve2VarL.r(j, false, new je2(1, list));
                    ve2VarL.n.c(new n73(Collections.singletonList(Long.valueOf(pb2VarM.a)), false));
                }
            } else {
                if (iV != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                l().o(j, list);
            }
        } else if (iOrdinal == 1) {
            int iV2 = az1.v(i);
            if (iV2 == 0) {
                ve2 ve2VarL2 = l();
                pb2 pb2VarM2 = ve2VarL2.M(j);
                if (pb2VarM2 != null) {
                    ve2VarL2.r(j, false, new je2(2, list));
                    ve2VarL2.n.c(new n73(Collections.singletonList(Long.valueOf(pb2VarM2.a)), false));
                }
            } else {
                if (iV2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ve2 ve2VarL3 = l();
                pb2 pb2VarM3 = ve2VarL3.M(j);
                if (pb2VarM3 != null) {
                    ve2VarL3.r(j, false, new le2(ve2VarL3, list, this.u0));
                    ve2VarL3.n.c(new n73(Collections.singletonList(Long.valueOf(pb2VarM3.a)), false));
                }
            }
        } else if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        j().f(this.o);
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatMembersUpdate chatMembersUpdate = new Tasks.ChatMembersUpdate();
        chatMembersUpdate.requestId = this.a;
        chatMembersUpdate.chatId = this.d;
        chatMembersUpdate.chatServerId = this.o;
        chatMembersUpdate.operation = wy1.b(this.X);
        chatMembersUpdate.userIds = jqi.c(this.Y);
        chatMembersUpdate.chatMemberType = this.Z.a;
        chatMembersUpdate.showHistory = this.s0;
        return fl9.toByteArray(chatMembersUpdate);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.C0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        return new fh2(this.o, this.X, this.Y, this.Z, this.s0, this.t0, this.u0);
    }
}
