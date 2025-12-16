package defpackage;

import java.util.ArrayList;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class rl1 implements g54 {
    public final /* synthetic */ CallScreen a;

    public rl1(CallScreen callScreen) {
        this.a = callScreen;
    }

    @Override // defpackage.g54
    public final void a(c54 c54Var, c54 c54Var2, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.g54
    public final void b(c54 c54Var, c54 c54Var2, boolean z) {
        Object value;
        rha rhaVar = CallScreen.N0;
        CallScreen callScreen = this.a;
        wo1 wo1VarH0 = callScreen.H0();
        c54 parentController = callScreen;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        ArrayList arrayListE = ytdVarE0 != null ? ytdVarE0.e() : null;
        boolean z2 = true ^ (arrayListE == null || arrayListE.isEmpty());
        tcf tcfVar = wo1VarH0.H0;
        do {
            value = tcfVar.getValue();
            ((Boolean) value).getClass();
        } while (!tcfVar.c(value, Boolean.valueOf(z2)));
    }
}
