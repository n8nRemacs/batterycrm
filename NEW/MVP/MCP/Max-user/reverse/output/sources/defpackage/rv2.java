package defpackage;

import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class rv2 implements cbb {
    public final /* synthetic */ ChatScreen a;

    public rv2(ChatScreen chatScreen) {
        this.a = chatScreen;
    }

    @Override // defpackage.cbb
    public final void J(CharSequence charSequence) {
        yy7[] yy7VarArr = ChatScreen.l1;
        zr2 zr2Var = this.a.a1().d;
        if (charSequence != null) {
            zr2Var.getClass();
            charSequence.toString();
        }
        cs2 cs2Var = (cs2) zr2Var.a;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        String str = string;
        wqi.c("cs2", "Search text changed ".concat(str), new Object[0]);
        cs2Var.a();
        cs2Var.c = str;
        if (str.length() != 0) {
            svi.e(cs2Var.e, null, null, new as2(cs2Var, str, 0L, null), 3);
            return;
        }
        zr2 zr2Var2 = cs2Var.g;
        if (zr2Var2 != null) {
            zr2Var2.d();
        }
    }

    @Override // defpackage.cbb
    public final void a0() {
        ChatScreen chatScreen = this.a;
        if (chatScreen.getView() != null) {
            if (chatScreen.e1().b()) {
                chatScreen.e1().postDelayed(new vy1(16, chatScreen), 200L);
            } else {
                chatScreen.e1().f(true);
            }
            chatScreen.a1().t();
        }
    }

    @Override // defpackage.cbb
    public final void e() {
        ChatScreen chatScreen = this.a;
        if (chatScreen.getView() != null) {
            yy7[] yy7VarArr = ChatScreen.l1;
            chatScreen.e1().f(false);
        }
    }

    @Override // defpackage.cbb
    public final void m() {
        yy7[] yy7VarArr = ChatScreen.l1;
        this.a.a1().u(true);
    }
}
