package defpackage;

import android.view.Window;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class oc3 implements g54 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ oc3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void c(c54 c54Var, c54 c54Var2, boolean z) {
    }

    private final void d(c54 c54Var, c54 c54Var2, boolean z) {
    }

    private final void e(c54 c54Var, c54 c54Var2, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, k18] */
    @Override // defpackage.g54
    public final void a(c54 c54Var, c54 c54Var2, boolean z) {
        bud budVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                ChatScreen chatScreen = (ChatScreen) obj;
                if ((c54Var instanceof bda) && !fni.a(c54Var, chatScreen)) {
                    gda.g(chatScreen.o, ((bda) c54Var).n());
                }
                if (!fni.a(c54Var, chatScreen)) {
                    if (c54Var != 0 && !(c54Var instanceof nha)) {
                        yy7[] yy7VarArr = ChatScreen.l1;
                        xfh.r(chatScreen.Z0().d, wdd.a);
                        break;
                    } else {
                        yy7[] yy7VarArr2 = ChatScreen.l1;
                        xfh.r(chatScreen.Z0().d, vdd.a);
                        break;
                    }
                }
                break;
            case 2:
                MainActivity mainActivity = (MainActivity) obj;
                ?? r9 = mainActivity.V0;
                ub1 ub1Var = mainActivity.U0;
                boolean z2 = false;
                if (ub1Var != null && ub1Var.c()) {
                    z2 = true;
                }
                if (c54Var2 != 0) {
                    if (c54Var instanceof j2e) {
                        ((j2e) c54Var).c(mainActivity.getWindow());
                    } else {
                        j2e j2eVar = c54Var2 instanceof j2e ? (j2e) c54Var2 : null;
                        if (j2eVar != null) {
                            j2eVar.l(mainActivity.getWindow());
                        }
                        x21 x21Var = (x21) r9.getValue();
                        Window window = mainActivity.getWindow();
                        if (z2) {
                            eud eudVar = (eud) x21Var.a.invoke();
                            Object objW = (eudVar == null || (budVar = (bud) ue3.Q(((RootController) eudVar).H0().e())) == null) ? null : budVar.a;
                            if (objW == null) {
                                eud eudVar2 = (eud) x21Var.a.invoke();
                                objW = eudVar2 != null ? eudVar2.w() : null;
                            }
                            j2e j2eVar2 = objW instanceof j2e ? (j2e) objW : null;
                            if (j2eVar2 != null) {
                                j2eVar2.c(window);
                            }
                        } else {
                            x21Var.getClass();
                        }
                    }
                    if (c54Var == 0) {
                    }
                }
                x21 x21Var2 = (x21) r9.getValue();
                Window window2 = mainActivity.getWindow();
                x21Var2.getClass();
                x21.a(window2, c54Var2, c54Var, z2);
                break;
            default:
                RootController rootController = (RootController) obj;
                if (c54Var2 != 0 && rootController.E0().a.a.size() > 0 && (c54Var instanceof Widget) && !((Widget) c54Var).getE0()) {
                    rootController.E0().C();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.g54
    public final void b(c54 c54Var, c54 c54Var2, boolean z) {
        switch (this.a) {
            case 0:
                if (fni.a(c54Var2 != null ? c54Var2.getInstanceId() : null, (String) this.b) && z) {
                    wqi.c(oc3.class.getName(), "Close controller:" + c54Var2.getClass().getName() + " after push new controller", new Object[0]);
                    c54Var2.getRouter().B(c54Var2);
                    c54Var2.getRouter().L(this);
                    break;
                }
                break;
            case 1:
            case 2:
                break;
            default:
                if (!z) {
                    wqi.c("RootController", "pop to " + (c54Var != null ? c54Var.getClass().getName() : null), new Object[0]);
                    break;
                }
                break;
        }
    }

    public oc3(c54 c54Var) {
        this.a = 0;
        this.b = c54Var.getInstanceId();
    }
}
