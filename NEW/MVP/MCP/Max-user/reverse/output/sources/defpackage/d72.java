package defpackage;

import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class d72 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d72(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kce kceVar = (kce) ((kh1) obj2).F0;
                ((CharSequence) obj).toString();
                kceVar.getClass();
                int iIntValue = ((Number) ((f9a) ((l5c) ((age) f.a.getAccessor().c(47))).j.getValue()).getValue()).intValue();
                sg4 sg4Var = sg4.DISABLED;
                if (iIntValue == 3) {
                    j.c.p0().b(":settings/dev", null);
                    break;
                }
                break;
            case 1:
                ((jx0) obj2).invoke((ub9) obj);
                break;
            case 2:
                ((ox3) obj2).invoke(Long.valueOf(((xx3) obj).a), view);
                break;
            case 3:
                cff cffVar = (cff) obj;
                fff fffVar = ((tk8) obj2).G0;
                if (fffVar != null) {
                    cffVar.e(fffVar);
                    break;
                }
                break;
            case 4:
                ((rw) obj2).invoke(Long.valueOf(((lc9) obj).a), view);
                break;
            case 5:
                bi9 bi9Var = (bi9) obj;
                long j = bi9Var.J0;
                bi9Var.g();
                MessagesListWidget messagesListWidget = ((kv9) ((sh9) obj2)).a;
                yy7[] yy7VarArr = MessagesListWidget.b1;
                messagesListWidget.L0();
                messagesListWidget.K0().D().h(j);
                break;
            case 6:
                fxb fxbVar = (fxb) obj;
                break;
            case 7:
                cff cffVar2 = (cff) obj;
                fff fffVar2 = ((tk8) obj2).G0;
                if (fffVar2 != null) {
                    cffVar2.e(fffVar2);
                    break;
                }
                break;
            case 8:
                em6 em6Var = (em6) obj;
                h8e h8eVar = ((zff) obj2).I0;
                if (h8eVar != null) {
                    em6Var.invoke(h8eVar);
                    break;
                }
                break;
            default:
                cff cffVar3 = (cff) obj;
                fff fffVar3 = ((tk8) obj2).G0;
                if (fffVar3 != null) {
                    cffVar3.e(fffVar3);
                    break;
                }
                break;
        }
        return true;
    }
}
