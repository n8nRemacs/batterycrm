package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes2.dex */
public final class jr2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMembersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.X = chatMembersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jr2 jr2Var = (jr2) l((gr2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jr2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jr2 jr2Var = new jr2(continuation, this.X);
        jr2Var.o = obj;
        return jr2Var;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gr2 gr2Var = (gr2) this.o;
        yy7[] yy7VarArr = ChatMembersScreen.t0;
        ChatMembersScreen chatMembersScreen = this.X;
        chatMembersScreen.B0().setTitle(gr2Var.a);
        chatMembersScreen.B0().setSubtitle(gr2Var.b.b(chatMembersScreen.getContext()));
        chatMembersScreen.B0().setRightActions(gr2Var.c ? new lfb(new tfb(chatMembersScreen), new rfb(yud.G, new ir2(chatMembersScreen, 2)), null) : new lfb(null, new tfb(chatMembersScreen), null));
        String str = (String) chatMembersScreen.A0().t0.a.getValue();
        if (str != null) {
            fbb searchView = chatMembersScreen.B0().getSearchView();
            if (searchView != null) {
                searchView.setExpandWithAnimation(false);
            }
            fbb searchView2 = chatMembersScreen.B0().getSearchView();
            if (searchView2 != null && searchView2.v0) {
                searchView2.c(true);
                ?? r1 = searchView2.B0;
                if (r1.e()) {
                    ((w3b) r1.getValue()).setText(str);
                }
            }
            fbb searchView3 = chatMembersScreen.B0().getSearchView();
            if (searchView3 != null) {
                searchView3.setExpandWithAnimation(true);
            }
        }
        return qqg.a;
    }
}
