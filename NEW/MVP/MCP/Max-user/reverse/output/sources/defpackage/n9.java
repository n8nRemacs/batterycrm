package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* loaded from: classes2.dex */
public final class n9 extends dtf implements sm6 {
    public final /* synthetic */ AddChatMembersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.X = addChatMembersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        n9 n9Var = (n9) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        n9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        n9 n9Var = new n9(continuation, this.X);
        n9Var.o = obj;
        return n9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long[] jArrE0 = ue3.e0((Set) this.o);
        AddChatMembersScreen addChatMembersScreen = this.X;
        hs hsVar = addChatMembersScreen.v0;
        yy7 yy7Var = AddChatMembersScreen.y0[2];
        hsVar.b(addChatMembersScreen, jArrE0);
        return qqg.a;
    }
}
