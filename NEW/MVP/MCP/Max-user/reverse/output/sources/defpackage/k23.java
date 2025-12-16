package defpackage;

import java.util.concurrent.CancellationException;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes2.dex */
public final class k23 implements cbb {
    public final /* synthetic */ ChatsListSearchScreen a;
    public final /* synthetic */ yfb b;

    public k23(ChatsListSearchScreen chatsListSearchScreen, yfb yfbVar) {
        this.a = chatsListSearchScreen;
        this.b = yfbVar;
    }

    @Override // defpackage.cbb
    public final void J(CharSequence charSequence) {
        String string;
        yy7[] yy7VarArr = ChatsListSearchScreen.I0;
        b43 b43VarZ0 = this.a.z0();
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        String str = string;
        tcf tcfVar = b43VarZ0.H0;
        if (str.equals(((y23) tcfVar.getValue()).b)) {
            wqi.c(b43VarZ0.O0, "Same query for search, ignore it", new Object[0]);
            return;
        }
        tcfVar.m(null, new y23(x23.a, str, tc7.d, (str.length() <= 0 || !vmf.U(((y23) tcfVar.getValue()).b, str, false)) ? hd5.a : ((y23) tcfVar.getValue()).d, true, false));
        if (str.length() == 0) {
            b43VarZ0.y();
            return;
        }
        x9f x9fVar = b43VarZ0.R0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        b43VarZ0.d.c();
        x9f x9fVar2 = b43VarZ0.S0;
        if (x9fVar2 != null) {
            x9fVar2.cancel((CancellationException) null);
        }
        qt7 qt7Var = (qt7) b43VarZ0.U0.D(b43VarZ0, b43.W0[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        b43VarZ0.J0.m(null, str);
    }

    @Override // defpackage.cbb
    public final void o() {
        api.e(this.b);
        a63.c.p0().d();
    }
}
