package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;

/* loaded from: classes2.dex */
public final class pl2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.X = chatMediaListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pl2 pl2Var = (pl2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pl2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pl2 pl2Var = new pl2(continuation, this.X);
        pl2Var.o = obj;
        return pl2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        in2 in2Var = (in2) this.o;
        ChatMediaListWidget chatMediaListWidget = this.X;
        ChatMediaListWidget.y0(chatMediaListWidget).setRefreshingNext(false);
        a layoutManager = ChatMediaListWidget.y0(chatMediaListWidget).getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer num = linearLayoutManager != null ? new Integer(linearLayoutManager.U0()) : null;
        phd adapter = ChatMediaListWidget.y0(chatMediaListWidget).getAdapter();
        ll2 ll2Var = adapter instanceof ll2 ? (ll2) adapter : null;
        if (ll2Var != null) {
            ll2Var.E(in2Var.a);
        }
        if (num != null && num.intValue() == 0) {
            ChatMediaListWidget.y0(chatMediaListWidget).B0(0);
        }
        return qqg.a;
    }
}
