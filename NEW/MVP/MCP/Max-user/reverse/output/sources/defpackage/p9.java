package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* loaded from: classes2.dex */
public final class p9 extends dtf implements sm6 {
    public final /* synthetic */ AddChatMembersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.X = addChatMembersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        p9 p9Var = (p9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        p9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        p9 p9Var = new p9(continuation, this.X);
        p9Var.o = obj;
        return p9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((cda) this.o) instanceof jc3) {
            this.X.getRouter().C();
        }
        return qqg.a;
    }
}
