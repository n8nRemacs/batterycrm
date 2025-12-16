package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final class je9 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ MembersListWidget o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je9(MembersListWidget membersListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.o = membersListWidget;
        this.X = j;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        je9 je9Var = (je9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        je9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new je9(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = MembersListWidget.C0;
        MembersListWidget membersListWidget = this.o;
        em6 em6Var = membersListWidget.A0().b;
        long j = this.X;
        List list = (List) em6Var.invoke(Long.valueOf(j));
        boolean z = membersListWidget.y0().c;
        qqg qqgVar = qqg.a;
        if (z && !list.isEmpty()) {
            Long l = new Long(j);
            hs hsVar = membersListWidget.Y;
            yy7 yy7Var = MembersListWidget.C0[2];
            hsVar.b(membersListWidget, l);
            h6j.a(2).o(list).B(this.Y).v(vw4.d().getDisplayMetrics().density * 12.0f).build().u(membersListWidget);
        }
        return qqgVar;
    }
}
