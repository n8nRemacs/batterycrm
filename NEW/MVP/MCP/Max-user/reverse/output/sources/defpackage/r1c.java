package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* loaded from: classes.dex */
public final class r1c implements er1 {
    public final Object X;
    public final ax1 a;
    public final p1c b;
    public qj1 c;
    public final tcf d;
    public final hbd o;

    public r1c(nnb nnbVar, tv1 tv1Var, ax1 ax1Var, p1c p1cVar, k18 k18Var) {
        bwf bwfVarD = e51.a.getAccessor().d(30);
        k18 k18Var2 = fm1.a;
        bwf bwfVarD2 = gm1.a.getAccessor().d(508);
        k18 k18VarE = fm1.e();
        this.a = ax1Var;
        this.b = p1cVar;
        tcf tcfVarA = ucf.a(new xib(null, null, null, false, false, true, null, uxg.d, false, null));
        this.d = tcfVarA;
        this.o = new hbd(tcfVarA);
        k18 k18VarB = ipi.b(3, new zfb(19));
        this.X = k18VarB;
        ax1Var.d(this);
        gw0.w(new g56(((x4h) k18VarB.getValue()).e, new o1c(2, null), 1), (f84) bwfVarD.getValue());
        gw0.w(gw0.u(new z41(new z41(new xnb(((qv1) bwfVarD2.getValue()).p, 5), ((dob) nnbVar).z0, new kga(3, (Continuation) null, 8), 3), ((hw1) tv1Var).b1, new uh1(this, k18Var, null), 3), ((q2b) ((lzf) ((bwf) k18VarE).getValue())).a()), (f84) bwfVarD.getValue());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        this.b.a();
        this.c = null;
    }
}
