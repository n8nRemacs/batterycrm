package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* loaded from: classes2.dex */
public final class jng extends dtf implements sm6 {
    public final /* synthetic */ TwoFASettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jng(Continuation continuation, TwoFASettingsScreen twoFASettingsScreen) {
        super(2, continuation);
        this.X = twoFASettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jng jngVar = (jng) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jngVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jng jngVar = new jng(continuation, this.X);
        jngVar.o = obj;
        return jngVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        ?? r0 = this.X.o;
        int i = TwoFASettingsScreen.X;
        if (cdaVar instanceof ei4) {
            omg.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof flg) {
            flg flgVar = (flg) cdaVar;
            if (flgVar instanceof elg) {
                sp7 sp7Var = (sp7) r0.getValue();
                String str = ((elg) flgVar).b;
                sp7Var.getClass();
                sp7Var.a(l8j.a(new TwoFACreationScreen("EDIT", "CREATE_PASSWORD", "SETTINGS", str, null), null, null), "CREATE_PASSWORD");
            } else {
                if (!(flgVar instanceof dlg)) {
                    throw new NoWhenBranchMatchedException();
                }
                sp7 sp7Var2 = (sp7) r0.getValue();
                dlg dlgVar = (dlg) flgVar;
                String str2 = dlgVar.b;
                up7 up7Var = dlgVar.c;
                sp7Var2.getClass();
                sp7Var2.a(l8j.a(new TwoFACreationScreen("EDIT", "ADD_EMAIL", "SETTINGS", str2, up7Var), null, null), "ADD_EMAIL");
            }
        }
        return qqg.a;
    }
}
