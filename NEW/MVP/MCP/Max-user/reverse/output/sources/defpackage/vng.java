package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;

/* loaded from: classes2.dex */
public final class vng extends dtf implements sm6 {
    public final /* synthetic */ TwoFAStartRestoreScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vng(Continuation continuation, TwoFAStartRestoreScreen twoFAStartRestoreScreen) {
        super(2, continuation);
        this.X = twoFAStartRestoreScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vng vngVar = (vng) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vngVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vng vngVar = new vng(continuation, this.X);
        vngVar.o = obj;
        return vngVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        bng bngVar = (bng) this.o;
        yy7[] yy7VarArr = TwoFAStartRestoreScreen.s0;
        if (bngVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        TwoFAStartRestoreScreen twoFAStartRestoreScreen = this.X;
        twoFAStartRestoreScreen.getRouter().C();
        sp7 sp7Var = (sp7) twoFAStartRestoreScreen.o.getValue();
        String str = bngVar.b;
        rp7 rp7Var = (rp7) twoFAStartRestoreScreen.b.getValue();
        up7 up7Var = bngVar.c;
        sp7Var.getClass();
        sp7Var.a(l8j.a(new TwoFACreationScreen("RESTORE", "CREATE_PASSWORD", rp7Var.name(), str, up7Var), null, null), "CREATE_PASSWORD");
        return qqg.a;
    }
}
