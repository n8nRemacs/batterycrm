package defpackage;

import android.view.View;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class f23 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ g23 c;

    public /* synthetic */ f23(View view, g23 g23Var, int i) {
        this.a = i;
        this.b = view;
        this.c = g23Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g23 g23Var = this.c;
                ((is7) g23Var.c.getValue()).a("show", "main", "invite_friends");
                if (g23Var.o) {
                    g23Var.a.q0(g23Var);
                    break;
                }
                break;
            default:
                g23 g23Var2 = this.c;
                if (((Boolean) g23Var2.b.invoke()).booleanValue()) {
                    ((nm8) e03.a.getAccessor().c(2)).b(Collections.singletonList(new brb(1)));
                    if (g23Var2.d) {
                        g23Var2.a.q0(g23Var2);
                        break;
                    }
                }
                break;
        }
    }
}
