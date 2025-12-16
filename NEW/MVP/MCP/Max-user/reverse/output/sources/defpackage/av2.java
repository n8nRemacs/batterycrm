package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class av2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        av2 av2Var = (av2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        av2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        av2 av2Var = new av2(continuation, this.X);
        av2Var.o = obj;
        return av2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        ChatScreen chatScreen = this.X;
        bbd bbdVar = chatScreen.Y0;
        yy7[] yy7VarArr = ChatScreen.l1;
        chatScreen.f1().setVisibility(zBooleanValue ? 0 : 8);
        if (zBooleanValue) {
            c83 c83Var = (c83) bbdVar.D(chatScreen, ChatScreen.l1[18]);
            ytd ytdVar = c83Var.a;
            if (!fni.a(c83Var.b(), "video_msg_controller")) {
                ytdVar.R(false);
                bud budVarA = l8j.a(new VideoMessageWidget(), null, null);
                budVarA.d("video_msg_controller");
                ytdVar.S(budVarA);
            }
        } else {
            ((c83) bbdVar.D(chatScreen, ChatScreen.l1[18])).a();
        }
        return qqg.a;
    }
}
