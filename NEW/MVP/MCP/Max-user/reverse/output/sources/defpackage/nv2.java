package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class nv2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.o = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nv2 nv2Var = (nv2) l((z26) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nv2(continuation, this.o);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String strB = ari.b(this.o);
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, strB, "Start subscribing on viewModel.events", null);
            }
        }
        ChatScreen chatScreen = this.o;
        yy7[] yy7VarArr = ChatScreen.l1;
        zx2 zx2VarG1 = chatScreen.g1();
        zx2VarG1.getClass();
        wqi.c(zx2.class.getName(), "restore draft", new Object[0]);
        zx2VarG1.W0.O(zx2VarG1, zx2.h1[10], svi.d(zx2VarG1.a, ((q2b) zx2VarG1.y()).b(), i84.b, new ax2(zx2VarG1, null)));
        return qqg.a;
    }
}
