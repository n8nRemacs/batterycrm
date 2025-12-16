package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class ru2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ru2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ru2(continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objD;
        int i = this.o;
        qqg qqgVar = qqg.a;
        ChatScreen chatScreen = this.X;
        if (i == 0) {
            g8j.b(obj);
            if (chatScreen.getView() != null && !chatScreen.Y0().n()) {
                zx2 zx2VarG1 = chatScreen.g1();
                this.o = 1;
                objD = zx2VarG1.D(this);
                g84 g84Var = g84.a;
                if (objD == g84Var) {
                    return g84Var;
                }
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g8j.b(obj);
        objD = obj;
        long jLongValue = ((Number) objD).longValue();
        yy7[] yy7VarArr = ChatScreen.l1;
        ytd ytdVarY0 = chatScreen.Y0();
        String str = chatScreen.M0;
        long j = chatScreen.getArgs().getLong("load_mark");
        long j2 = chatScreen.getArgs().getLong("message_id");
        Object obj2 = chatScreen.getArgs().get("highlights");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list == null) {
            list = hd5.a;
        }
        MessagesListWidget messagesListWidget = new MessagesListWidget(str, jLongValue, j, list, j2, chatScreen.getArgs().getBoolean("highlight_message"), chatScreen.getArgs().getBoolean("from_forward"), null);
        messagesListWidget.L0 = chatScreen.a1;
        ytdVarY0.S(new bud(messagesListWidget, null, null, null, false, -1));
        return qqgVar;
    }
}
