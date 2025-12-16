package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class dz2 extends dtf implements sm6 {
    public final /* synthetic */ ChatTitleIconScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.X = chatTitleIconScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dz2 dz2Var = (dz2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dz2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dz2 dz2Var = new dz2(continuation, this.X);
        dz2Var.o = obj;
        return dz2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        iz2 iz2Var = (iz2) this.o;
        String str = iz2Var.b;
        String str2 = iz2Var.a;
        if (str != null && !vmf.F(str)) {
            str2 = iz2Var.b;
        } else if (str2 == null || vmf.F(str2)) {
            str2 = null;
        }
        uxa uxaVarY0 = ChatTitleIconScreen.y0(this.X);
        uxaVarY0.setAvatarUrl(str2);
        uxaVarY0.setCloseBadgeVisibility(true ^ (str2 == null || str2.length() == 0));
        return qqg.a;
    }
}
