package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatAdminsScreen;

/* loaded from: classes2.dex */
public final class yb2 extends dtf implements sm6 {
    public final /* synthetic */ ChatAdminsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb2(ChatAdminsScreen chatAdminsScreen, Continuation continuation) {
        super(2, continuation);
        this.X = chatAdminsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yb2 yb2Var = (yb2) l((sd9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yb2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yb2 yb2Var = new yb2(this.X, continuation);
        yb2Var.o = obj;
        return yb2Var;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sd9 sd9Var = (sd9) this.o;
        boolean z = sd9Var instanceof od9;
        ChatAdminsScreen chatAdminsScreen = this.X;
        if (z) {
            kkc kkcVar = kkc.c;
            yy7[] yy7VarArr = ChatAdminsScreen.u0;
            long jZ0 = chatAdminsScreen.z0();
            long j = ((od9) sd9Var).a;
            kkcVar.getClass();
            kkcVar.s0(kkc.N0(jZ0, j));
        } else if (sd9Var instanceof md9) {
            md9 md9Var = (md9) sd9Var;
            int i = md9Var.a;
            long j2 = md9Var.b;
            yy7[] yy7VarArr2 = ChatAdminsScreen.u0;
            if (i == v8b.t0) {
                hc2 hc2VarY0 = chatAdminsScreen.y0();
                gw0.w(gw0.u(new mwd(new ec2(((l24) hc2VarY0.d.getValue()).c(j2), null, hc2VarY0, j2)), ((q2b) ((lzf) hc2VarY0.o.getValue())).b()), hc2VarY0.a);
            }
        } else if (sd9Var instanceof pd9) {
            if (((pd9) sd9Var).a == v8b.x0) {
                kkc kkcVar2 = kkc.c;
                yy7[] yy7VarArr3 = ChatAdminsScreen.u0;
                long jZ02 = chatAdminsScreen.z0();
                kkcVar2.p0().b(":profile/add-admins?chat_id=" + jZ02, null);
            }
        } else if (sd9Var instanceof rd9) {
            kkc kkcVar3 = kkc.c;
            yy7[] yy7VarArr4 = ChatAdminsScreen.u0;
            long jZ03 = chatAdminsScreen.z0();
            long jLongValue = ((Number) chatAdminsScreen.Y.getValue()).longValue();
            kkcVar3.getClass();
            kkcVar3.s0(kkc.N0(jZ03, jLongValue));
        } else if (sd9Var instanceof qd9) {
            kkc kkcVar4 = kkc.c;
            yy7[] yy7VarArr5 = ChatAdminsScreen.u0;
            long jZ04 = chatAdminsScreen.z0();
            long j3 = ((qd9) sd9Var).a;
            kkcVar4.getClass();
            kkcVar4.s0(kkc.N0(jZ04, j3));
        } else if (!(sd9Var instanceof nd9)) {
            throw new NoWhenBranchMatchedException();
        }
        return qqg.a;
    }
}
