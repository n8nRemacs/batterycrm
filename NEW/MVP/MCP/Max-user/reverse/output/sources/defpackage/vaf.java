package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class vaf implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;
    public final /* synthetic */ RecyclerView c;

    public /* synthetic */ vaf(StartConversationScreen startConversationScreen, RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = startConversationScreen;
        this.c = recyclerView;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        RecyclerView recyclerView = this.c;
        StartConversationScreen startConversationScreen = this.b;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                yy7[] yy7VarArr = StartConversationScreen.H0;
                CharSequence charSequenceY0 = startConversationScreen.y0();
                if (charSequenceY0 == null || charSequenceY0.length() == 0) {
                    return null;
                }
                int iL = startConversationScreen.E0.l(iIntValue);
                if (iL == u1b.o) {
                    return recyclerView.getResources().getString(avd.B0);
                }
                if (iL == u1b.r) {
                    return recyclerView.getResources().getString(avd.D0);
                }
                if (iL == u1b.u) {
                    return recyclerView.getResources().getString(avd.E0);
                }
                return null;
            default:
                yy7[] yy7VarArr2 = StartConversationScreen.H0;
                CharSequence charSequenceY02 = startConversationScreen.y0();
                if ((charSequenceY02 == null || charSequenceY02.length() == 0) && startConversationScreen.E0.l(iIntValue) == u1b.u) {
                    return recyclerView.getResources().getString(odb.w);
                }
                return null;
        }
    }
}
