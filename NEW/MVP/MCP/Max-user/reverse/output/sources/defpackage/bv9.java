package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class bv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bv9 bv9Var = (bv9) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bv9 bv9Var = new bv9(continuation, this.X);
        bv9Var.o = obj;
        return bv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        lg8 lg8Var = lg8.d;
        g8j.b(obj);
        List list = (List) this.o;
        if (this.X.getViewLifecycleOwner().p().d.compareTo(l38.d) >= 0) {
            String str = this.X.a;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                int size = list.size();
                Object objI = ue3.I(list);
                MessageModel messageModel = objI instanceof MessageModel ? (MessageModel) objI : null;
                String strN = messageModel != null ? messageModel.n() : null;
                Object objQ = ue3.Q(list);
                MessageModel messageModel2 = objQ instanceof MessageModel ? (MessageModel) objQ : null;
                l6bVar.c(lg8Var, str, "Got new messages on UI, size=" + size + ", first=" + strN + ", last=" + (messageModel2 != null ? messageModel2.n() : null), null);
            }
            RecyclerView recyclerView = (RecyclerView) this.X.findViewById(bzc.messages_list_recycler_view);
            if (recyclerView == null) {
                MessagesListWidget messagesListWidget = this.X;
                messagesListWidget.C0.F(list, new av9(messagesListWidget, list, 0));
            } else {
                MessagesListWidget messagesListWidget2 = this.X;
                y7j.c(1, recyclerView, new av9(messagesListWidget2, list, 1), new av9(messagesListWidget2, list, 2));
            }
        } else {
            String str2 = this.X.a;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                int size2 = list.size();
                Object objI2 = ue3.I(list);
                MessageModel messageModel3 = objI2 instanceof MessageModel ? (MessageModel) objI2 : null;
                String strN2 = messageModel3 != null ? messageModel3.n() : null;
                Object objQ2 = ue3.Q(list);
                MessageModel messageModel4 = objQ2 instanceof MessageModel ? (MessageModel) objQ2 : null;
                l6bVar2.c(lg8Var, str2, "Got new messages (lifecycle scope), size=" + size2 + ", first=" + strN2 + ", last=" + (messageModel4 != null ? messageModel4.n() : null), null);
            }
            MessagesListWidget messagesListWidget3 = this.X;
            messagesListWidget3.C0.F(list, new av9(messagesListWidget3, list, 3));
        }
        return qqg.a;
    }
}
