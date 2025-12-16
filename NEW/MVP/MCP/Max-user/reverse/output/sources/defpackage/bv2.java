package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class bv2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bv2 bv2Var = (bv2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bv2 bv2Var = new bv2(continuation, this.X);
        bv2Var.o = obj;
        return bv2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        Boolean bool = (Boolean) this.o;
        bool.booleanValue();
        yy7[] yy7VarArr = ChatScreen.l1;
        ChatScreen chatScreen = this.X;
        c54 c54VarB = k8j.b(((c83) chatScreen.Y0.D(chatScreen, ChatScreen.l1[18])).a);
        VideoMessageWidget videoMessageWidget = c54VarB instanceof VideoMessageWidget ? (VideoMessageWidget) c54VarB : null;
        if (videoMessageWidget != null) {
            tcf tcfVar = videoMessageWidget.G0().X;
            do {
                value = tcfVar.getValue();
                ((Boolean) value).getClass();
            } while (!tcfVar.c(value, bool));
        }
        return qqg.a;
    }
}
