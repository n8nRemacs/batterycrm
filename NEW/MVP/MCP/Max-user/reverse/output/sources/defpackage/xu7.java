package defpackage;

import java.io.IOException;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.join.JoinChatWidget;

/* loaded from: classes.dex */
public final class xu7 extends dtf implements sm6 {
    public final /* synthetic */ JoinChatWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu7(JoinChatWidget joinChatWidget, Continuation continuation) {
        super(2, continuation);
        this.X = joinChatWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        xu7 xu7Var = (xu7) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xu7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xu7 xu7Var = new xu7(this.X, continuation);
        xu7Var.o = obj;
        return xu7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof cv7;
        JoinChatWidget joinChatWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = JoinChatWidget.B0;
            if (joinChatWidget.requireActivity() instanceof ksd) {
                joinChatWidget.getRouter().C();
                bv7 bv7Var = bv7.c;
                long jLongValue = ((Number) ((cv7) cdaVar).a).longValue();
                ii4 ii4VarP0 = bv7Var.p0();
                hi4 hi4Var = new hi4();
                hi4Var.a = ":chats";
                hi4Var.c(Long.valueOf(jLongValue), "id");
                hi4Var.c("local", "type");
                ii4VarP0.c(hi4Var.a(), null);
            } else {
                int i = MainActivity.a1;
                b6a.W(joinChatWidget.requireActivity(), a63.L0(a63.c, ((Number) ((cv7) cdaVar).a).longValue(), "local", null, null, null, null, 508), null, null, 12);
            }
            joinChatWidget.E0(false);
        } else if (cdaVar instanceof bpd) {
            joinChatWidget.E0(true);
            ccb ccbVar = new ccb(joinChatWidget);
            ccbVar.g(new n5g(u2d.snackbar_join_chat_restricted_error_title));
            ccbVar.e(new qcb(ivd.p1));
            ccbVar.f(new zcb(new n5g(u2d.snackbar_text_button_why)));
            ccbVar.d(new sl6(7, joinChatWidget));
            ccbVar.i();
        }
        return qqg.a;
    }
}
