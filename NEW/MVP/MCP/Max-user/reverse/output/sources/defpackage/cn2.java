package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* loaded from: classes2.dex */
public final class cn2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaTabWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn2(Continuation continuation, ChatMediaTabWidget chatMediaTabWidget) {
        super(2, continuation);
        this.X = chatMediaTabWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cn2 cn2Var = (cn2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cn2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cn2 cn2Var = new cn2(continuation, this.X);
        cn2Var.o = obj;
        return cn2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zm2 zm2Var = (zm2) this.o;
        yy7[] yy7VarArr = ChatMediaTabWidget.v0;
        sn0 sn0Var = this.X.o;
        yy7 yy7Var = ChatMediaTabWidget.v0[0];
        yfb yfbVar = (yfb) sn0Var.getValue();
        yfbVar.setTitle(zm2Var.b);
        yfbVar.setAvatar(zm2Var.a);
        return qqg.a;
    }
}
