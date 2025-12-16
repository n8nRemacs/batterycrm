package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class tu2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tu2 tu2Var = (tu2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tu2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tu2 tu2Var = new tu2(continuation, this.X);
        tu2Var.o = obj;
        return tu2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        imb imbVar = (imb) this.o;
        tz2 tz2Var = (tz2) imbVar.a;
        g7e g7eVar = (g7e) imbVar.b;
        ChatScreen chatScreen = this.X;
        View view = chatScreen.getView();
        if (view != null) {
            yy7[] yy7VarArr = ChatScreen.l1;
            if (fni.a(chatScreen.e1().getRightActions(), jfb.a) || !fni.a(chatScreen.e1().getRightActions(), tz2Var.g)) {
                chatScreen.e1().setRightActions(tz2Var.g);
            }
            chatScreen.e1().setTitle(tz2Var.b);
            ChatScreen.I0(chatScreen, chatScreen.e1(), tz2Var.d);
            chatScreen.e1().setSubtitle(tz2Var.c.b(view.getContext()));
            chatScreen.e1().setAvatar(new pfb(tz2Var.e, tz2Var.f, tz2Var.a, tz2Var.h, 8));
            boolean z = g7eVar instanceof d7e;
            dbb dbbVar = dbb.d;
            dbb dbbVar2 = dbb.c;
            if (z) {
                if (chatScreen.b1().getState() == dbbVar2 || chatScreen.b1().getState() == dbbVar) {
                    chatScreen.b1().b();
                }
            } else if (g7eVar instanceof e7e) {
                if (chatScreen.b1().getState() != dbbVar2 && chatScreen.b1().getState() != dbbVar && chatScreen.getView() != null) {
                    chatScreen.e1().f(false);
                    fbb fbbVarB1 = chatScreen.b1();
                    fbbVarB1.setExpandWithAnimation(((e7e) g7eVar).a);
                    fbbVarB1.c(true);
                }
            } else if (!(g7eVar instanceof c7e)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return qqg.a;
    }
}
