package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.members.list.MembersListWidget;

/* loaded from: classes2.dex */
public final class fe9 extends dtf implements sm6 {
    public final /* synthetic */ MembersListWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe9(Continuation continuation, MembersListWidget membersListWidget, View view) {
        super(2, continuation);
        this.X = membersListWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fe9 fe9Var = (fe9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fe9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fe9 fe9Var = new fe9(continuation, this.X, this.Y);
        fe9Var.o = obj;
        return fe9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        MembersListWidget membersListWidget = this.X;
        z71 z71Var = membersListWidget.w0;
        b0i b0iVar = membersListWidget.u0;
        b0i b0iVar2 = membersListWidget.t0;
        g8j.b(obj);
        ud9 ud9Var = (ud9) this.o;
        boolean z = ud9Var.d;
        List list = ud9Var.a;
        List listSingletonList = hd5.a;
        if (z) {
            b0iVar2.E(listSingletonList);
            b0iVar.E(listSingletonList);
            if (list.isEmpty()) {
                listSingletonList = Collections.singletonList(od5.a);
            }
            z71Var.E(listSingletonList);
        } else {
            b0iVar2.E(ud9Var.b);
            z71Var.E(listSingletonList);
            b0iVar.E(ud9Var.c);
        }
        yy7[] yy7VarArr = MembersListWidget.C0;
        membersListWidget.z0().setOverScrollMode(membersListWidget.d != null ? 2 : 1);
        membersListWidget.s0.E(list);
        membersListWidget.z0().setRefreshingNext(ud9Var.e);
        return qqg.a;
    }
}
