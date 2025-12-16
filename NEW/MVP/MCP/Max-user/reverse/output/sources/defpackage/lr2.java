package defpackage;

import java.util.Collections;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes2.dex */
public final class lr2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMembersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.X = chatMembersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lr2 lr2Var = (lr2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lr2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lr2 lr2Var = new lr2(continuation, this.X);
        lr2Var.o = obj;
        return lr2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Set set = (Set) this.o;
        ChatMembersScreen chatMembersScreen = this.X;
        if (set != null) {
            yy7[] yy7VarArr = ChatMembersScreen.t0;
            chatMembersScreen.B0().c(String.valueOf(set.size()), Collections.singletonList(new vfb(10101, mvd.E0, ivd.T0)), new tl2(5, chatMembersScreen), new hu1(set, 1, chatMembersScreen));
        } else {
            yy7[] yy7VarArr2 = ChatMembersScreen.t0;
            chatMembersScreen.B0().a();
        }
        return qqg.a;
    }
}
