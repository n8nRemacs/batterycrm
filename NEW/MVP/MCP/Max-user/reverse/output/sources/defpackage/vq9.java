package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class vq9 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vq9(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                MessagesLayoutManager messagesLayoutManager = (MessagesLayoutManager) this.c;
                int i = this.b;
                RecyclerView recyclerView = (RecyclerView) this.d;
                int iIntValue = ((Integer) obj).intValue();
                String str = messagesLayoutManager.F;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        phd adapter = recyclerView.getAdapter();
                        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.j()) : null;
                        StringBuilder sbK = wy1.k("LM smooth scroll finished by pos:", i, ", target:", iIntValue, ", curSize:");
                        sbK.append(numValueOf);
                        l6bVar.c(lg8Var, str, sbK.toString(), null);
                    }
                }
                messagesLayoutManager.J = null;
                return qqg.a;
            default:
                return Widget.childRouter$lambda$10((Widget) this.c, this.b, (em6) this.d, (ytd) obj);
        }
    }
}
