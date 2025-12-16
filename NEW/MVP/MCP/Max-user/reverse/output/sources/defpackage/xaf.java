package defpackage;

import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class xaf implements sx3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ xaf(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    @Override // defpackage.sx3
    public final boolean b(int i) {
        int i2 = this.a;
        StartConversationScreen startConversationScreen = this.b;
        switch (i2) {
            case 0:
                if (i != startConversationScreen.y0.j() + startConversationScreen.C0.j() + startConversationScreen.x0.j()) {
                    if (i != startConversationScreen.E0.j()) {
                        return false;
                    }
                    CharSequence charSequenceY0 = startConversationScreen.y0();
                    if (charSequenceY0 != null && charSequenceY0.length() != 0) {
                        return false;
                    }
                }
                return true;
            default:
                yy7[] yy7VarArr = StartConversationScreen.H0;
                CharSequence charSequenceY02 = startConversationScreen.y0();
                return !(charSequenceY02 == null || charSequenceY02.length() == 0);
        }
    }
}
