package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class po2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        po2 po2Var = (po2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        po2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        po2 po2Var = new po2(continuation, this.X);
        po2Var.o = obj;
        return po2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        kp2 kp2Var = (kp2) this.o;
        s5g s5gVar = kp2Var.a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.X;
        CharSequence charSequenceB = s5gVar != null ? s5gVar.b(chatMediaViewerScreen.getContext()) : null;
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        if (charSequenceB.length() > 0) {
            yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
            chatMediaViewerScreen.P0().setTitle(charSequenceB);
        }
        sfb sfbVar = new sfb(yud.v0, new jx0(1, chatMediaViewerScreen, ChatMediaViewerScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 10), 14);
        sfb sfbVar2 = kp2Var.b ? new sfb(y9b.g, new z11(3, chatMediaViewerScreen), 14) : null;
        yy7[] yy7VarArr2 = ChatMediaViewerScreen.Q0;
        if (chatMediaViewerScreen.getView() == null ? false : ((j09) ue3.J(chatMediaViewerScreen.R0().getCurrentItem(), chatMediaViewerScreen.G0.x0.f)) instanceof tz8) {
            chatMediaViewerScreen.P0().setRightActions(jfb.a);
        } else {
            hs hsVar = chatMediaViewerScreen.Z;
            yy7 yy7Var = ChatMediaViewerScreen.Q0[4];
            if (((Boolean) hsVar.a(chatMediaViewerScreen)).booleanValue()) {
                chatMediaViewerScreen.P0().setRightActions(new lfb(sfbVar2, sfbVar, null));
            } else {
                chatMediaViewerScreen.P0().setRightActions(new lfb(sfbVar2, sfbVar, null));
            }
        }
        return qqg.a;
    }
}
