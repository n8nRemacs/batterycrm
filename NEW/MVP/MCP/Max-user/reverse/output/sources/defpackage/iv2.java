package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class iv2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        iv2 iv2Var = (iv2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iv2 iv2Var = new iv2(continuation, this.X);
        iv2Var.o = obj;
        return iv2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        MessageWriteWidget messageWriteWidgetW0;
        View view;
        g8j.b(obj);
        cs9 cs9Var = (cs9) this.o;
        boolean z = cs9Var instanceof bs9;
        ChatScreen chatScreen = this.X;
        if (z) {
            yy7[] yy7VarArr = ChatScreen.l1;
            Long lZ = chatScreen.V0().z();
            bs9 bs9Var = (bs9) cs9Var;
            long j = bs9Var.a;
            if (lZ != null && lZ.longValue() == j && (messageWriteWidgetW0 = chatScreen.W0()) != null && (view = messageWriteWidgetW0.getView()) != null) {
                view.requestFocus();
            }
            chatScreen.V0().G(new Long(bs9Var.a));
        } else if (cs9Var instanceof as9) {
            yy7[] yy7VarArr2 = ChatScreen.l1;
            no9 no9VarV0 = chatScreen.V0();
            Long l = new Long(((as9) cs9Var).a);
            MessageWriteWidget messageWriteWidgetW02 = chatScreen.W0();
            CharSequence text = messageWriteWidgetW02 != null ? messageWriteWidgetW02.C0().getText() : null;
            MessageWriteWidget messageWriteWidgetW03 = chatScreen.W0();
            no9.F(no9VarV0, l, text, messageWriteWidgetW03 != null ? new Integer(messageWriteWidgetW03.C0().getCursorPosition()) : null, 8);
        } else if (cs9Var instanceof yr9) {
            yy7[] yy7VarArr3 = ChatScreen.l1;
            if (chatScreen.b1().getState() == dbb.c || chatScreen.b1().getState() == dbb.d) {
                chatScreen.b1().b();
            }
        } else {
            if (!(cs9Var instanceof zr9)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr4 = ChatScreen.l1;
            zx2 zx2VarG1 = chatScreen.g1();
            String str = ((zr9) cs9Var).a;
            Long lZ2 = chatScreen.V0().z();
            on9 on9VarY = chatScreen.V0().y();
            pb2 pb2Var = (pb2) zx2VarG1.a1.a.getValue();
            if (pb2Var != null) {
                zx2VarG1.R0.O(zx2VarG1, zx2.h1[5], svi.d(zx2VarG1.a, ((q2b) zx2VarG1.y()).b(), i84.b, new cx2(str, pb2Var, zx2VarG1, lZ2, on9VarY, null)));
            }
        }
        return qqg.a;
    }
}
