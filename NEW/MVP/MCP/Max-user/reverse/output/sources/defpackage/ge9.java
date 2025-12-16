package defpackage;

import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final class ge9 extends dtf implements sm6 {
    public final /* synthetic */ MembersListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge9(Continuation continuation, MembersListWidget membersListWidget) {
        super(2, continuation);
        this.X = membersListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ge9 ge9Var = (ge9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ge9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ge9 ge9Var = new ge9(continuation, this.X);
        ge9Var.o = obj;
        return ge9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = MembersListWidget.C0;
        MembersListWidget membersListWidget = this.X;
        if (!membersListWidget.A0().u()) {
            w73 w73Var = membersListWidget.A0;
            if (w73Var != null) {
                membersListWidget.z0().p0(w73Var);
            }
            membersListWidget.A0 = null;
            yh4 yh4Var = membersListWidget.B0;
            if (yh4Var != null) {
                membersListWidget.z0().r0(yh4Var);
            }
            membersListWidget.B0 = null;
        } else if (membersListWidget.A0 == null) {
            final wu7 wu7Var = new wu7(15, membersListWidget);
            final int i = 0;
            final int i2 = 1;
            w73 w73Var2 = new w73(new de9(membersListWidget, i), new ia(wu7Var, 20, membersListWidget), new em6() { // from class: ee9
                @Override // defpackage.em6
                public final Object invoke(Object obj2) {
                    int i3 = i;
                    wu7 wu7Var2 = wu7Var;
                    Integer num = (Integer) obj2;
                    num.getClass();
                    switch (i3) {
                        case 0:
                            yy7[] yy7VarArr2 = MembersListWidget.C0;
                            return Boolean.valueOf(((lc9) wu7Var2.invoke(num)) != null);
                        default:
                            yy7[] yy7VarArr3 = MembersListWidget.C0;
                            lc9 lc9Var = (lc9) wu7Var2.invoke(num);
                            return Boolean.valueOf(lc9Var != null ? lc9Var.u0 : false);
                    }
                }
            }, new em6() { // from class: ee9
                @Override // defpackage.em6
                public final Object invoke(Object obj2) {
                    int i3 = i2;
                    wu7 wu7Var2 = wu7Var;
                    Integer num = (Integer) obj2;
                    num.getClass();
                    switch (i3) {
                        case 0:
                            yy7[] yy7VarArr2 = MembersListWidget.C0;
                            return Boolean.valueOf(((lc9) wu7Var2.invoke(num)) != null);
                        default:
                            yy7[] yy7VarArr3 = MembersListWidget.C0;
                            lc9 lc9Var = (lc9) wu7Var2.invoke(num);
                            return Boolean.valueOf(lc9Var != null ? lc9Var.u0 : false);
                    }
                }
            });
            membersListWidget.z0().j(w73Var2);
            membersListWidget.A0 = w73Var2;
            yh4 yh4Var2 = new yh4(membersListWidget.z0());
            membersListWidget.z0().l(yh4Var2);
            membersListWidget.B0 = yh4Var2;
        }
        membersListWidget.z0().Y();
        return qqg.a;
    }
}
