package defpackage;

import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class bbf implements cbb {
    public final /* synthetic */ StartConversationScreen a;

    public bbf(StartConversationScreen startConversationScreen) {
        this.a = startConversationScreen;
    }

    @Override // defpackage.cbb
    public final void J(CharSequence charSequence) {
        yy7[] yy7VarArr = StartConversationScreen.H0;
        StartConversationScreen startConversationScreen = this.a;
        hs hsVar = startConversationScreen.c;
        yy7[] yy7VarArr2 = StartConversationScreen.H0;
        yy7 yy7Var = yy7VarArr2[0];
        hsVar.b(startConversationScreen, Boolean.TRUE);
        hs hsVar2 = startConversationScreen.d;
        yy7 yy7Var2 = yy7VarArr2[1];
        hsVar2.b(startConversationScreen, charSequence);
        nbf nbfVarZ0 = startConversationScreen.z0();
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        ((f9a) nbfVarZ0.w0.g.getValue()).setValue(string);
    }

    @Override // defpackage.cbb
    public final void a0() {
        StartConversationScreen startConversationScreen = this.a;
        hs hsVar = startConversationScreen.o;
        yy7 yy7Var = StartConversationScreen.H0[2];
        hsVar.b(startConversationScreen, Boolean.FALSE);
        startConversationScreen.G0.f(false);
    }

    @Override // defpackage.cbb
    public final void m() {
        StartConversationScreen startConversationScreen = this.a;
        hs hsVar = startConversationScreen.o;
        yy7 yy7Var = StartConversationScreen.H0[2];
        hsVar.b(startConversationScreen, Boolean.TRUE);
        startConversationScreen.G0.f(true);
    }
}
