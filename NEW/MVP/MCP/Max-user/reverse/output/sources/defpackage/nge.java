package defpackage;

/* loaded from: classes2.dex */
public final class nge extends hge {
    public final long b;
    public final long c;
    public final String d = nge.class.getName();

    public nge(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.hge
    public final void u() {
        lg8 lg8Var = lg8.c;
        String str = this.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, a9h.e("process: ", this.b, ", ", d8j.a(Long.valueOf(this.c))), null);
        }
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        pb2 pb2Var = (pb2) ((w63) igeVar.H.getValue()).j(this.b).a.getValue();
        if (pb2Var == null) {
            return;
        }
        if (pb2Var.b.a != 0 || b().Y(pb2Var)) {
            boolean z = pb2Var.N() && pb2Var.b.d == pb2Var.X;
            if ((pb2Var.Q() || pb2Var.b.c != of2.c) && !pb2Var.X()) {
                String str2 = this.d;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                    l6bVar2.c(lg8Var, str2, "process: updateMessagesStatusesLessEqThan", null);
                }
                l().u(this.b, this.c, jm9.DELETED);
            } else {
                String str3 = this.d;
                l6b l6bVar3 = wqi.a;
                if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                    l6bVar3.c(lg8Var, str3, "process: chat.isLeaving || chat.isLeft", null);
                }
            }
            hwa hwaVarA = a();
            long j = pb2Var.a;
            long j2 = pb2Var.b.a;
            long j3 = this.c;
            if (hwaVarA.j(j)) {
                hwa.r(hwaVarA, new wf2(hwaVarA.t().a.k(), j, j2, j3, z));
            }
        } else {
            wqi.m(this.d, "delete local chat with serverId = 0", new Object[0]);
            ige igeVar2 = this.a;
            ((ma3) (igeVar2 != null ? igeVar2 : null).t.getValue()).a(this.b, this.c);
        }
        k().c(l().h(this.b));
    }
}
