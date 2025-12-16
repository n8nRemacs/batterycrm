package defpackage;

import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class de9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MembersListWidget b;

    public /* synthetic */ de9(MembersListWidget membersListWidget, int i) {
        this.a = i;
        this.b = membersListWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        MembersListWidget membersListWidget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = MembersListWidget.C0;
                return kk4.j(membersListWidget.z0().getContext());
            case 1:
                return new ce9(membersListWidget.b, membersListWidget.c, new bwf(new de9(membersListWidget, 2)), membersListWidget.d, new de9(membersListWidget, 3), membersListWidget.A0().d);
            case 2:
                yy7[] yy7VarArr2 = MembersListWidget.C0;
                ld9 ld9Var = ld9.a;
                bwf bwfVarD = ld9Var.getAccessor().d(8);
                bwf bwfVarD2 = ld9Var.getAccessor().d(123);
                bwf bwfVarD3 = ld9Var.getAccessor().d(109);
                bwf bwfVarD4 = ld9Var.getAccessor().d(360);
                bwf bwfVarD5 = ld9Var.getAccessor().d(99);
                bwf bwfVarD6 = ld9Var.getAccessor().d(46);
                bwf bwfVarD7 = ld9Var.getAccessor().d(150);
                long j = membersListWidget.b;
                br2 br2Var = membersListWidget.c;
                pb2 pb2Var = (pb2) ((w63) bwfVarD3.getValue()).j(j).a.getValue();
                if (pb2Var != null) {
                    return (pb2Var.b.c() > 99 || pb2Var.M()) ? new an0(j, br2Var, (lzf) bwfVarD.getValue(), bwfVarD3, bwfVarD2, bwfVarD4, bwfVarD7) : new e5f(j, br2Var, (pb3) bwfVarD6.getValue(), bwfVarD3, bwfVarD2, bwfVarD5, (lzf) bwfVarD.getValue(), bwfVarD7);
                }
                wqi.e(me9.class.getName(), a9h.d(j, "We're trying to create members loader for chat(#", ") without the chat in cache"), null);
                return new ke9();
            default:
                yy7[] yy7VarArr3 = MembersListWidget.C0;
                return membersListWidget.A0().c;
        }
    }
}
