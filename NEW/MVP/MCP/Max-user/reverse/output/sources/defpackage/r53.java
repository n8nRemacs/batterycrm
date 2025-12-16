package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class r53 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r53(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.X = chatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        r53 r53Var = (r53) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        r53Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        r53 r53Var = new r53(continuation, this.X);
        r53Var.o = obj;
        return r53Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        yy7[] yy7VarArr = ChatsListWidget.L0;
        ChatsListWidget chatsListWidget = this.X;
        if (zBooleanValue) {
            OneMeButton oneMeButton = chatsListWidget.z0().u0;
            oneMeButton.setText((CharSequence) null);
            oneMeButton.setOnClickListener(null);
            oneMeButton.setVisibility(8);
        } else {
            chatsListWidget.z0().f(chatsListWidget.getContext().getString(g3d.chats_list_empty_state_action), new j6(13, chatsListWidget));
        }
        return qqg.a;
    }
}
