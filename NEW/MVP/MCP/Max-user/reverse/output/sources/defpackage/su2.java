package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* loaded from: classes2.dex */
public final class su2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.o = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        su2 su2Var = (su2) l((ypf) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        su2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new su2(continuation, this.o);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ChatScreen chatScreen = this.o;
        String str = chatScreen.M0;
        yy7[] yy7VarArr = ChatScreen.l1;
        if (k8j.b(chatScreen.d1().a) == null) {
            c83 c83VarD1 = chatScreen.d1();
            ytd ytdVar = c83VarD1.a;
            if (!fni.a(c83VarD1.b(), "SuggestionsWidgetTag")) {
                ytdVar.R(false);
                bud budVarA = l8j.a(new SuggestionsWidget(str, null), null, null);
                budVarA.d("SuggestionsWidgetTag");
                ytdVar.S(budVarA);
            }
            ytd childRouter = chatScreen.getChildRouter(chatScreen.c1());
            childRouter.e = 1;
            childRouter.R(false);
            if (!childRouter.n()) {
                childRouter.S(l8j.a(new SuggestionsWidget(str, null), null, null));
            }
        }
        return qqg.a;
    }
}
