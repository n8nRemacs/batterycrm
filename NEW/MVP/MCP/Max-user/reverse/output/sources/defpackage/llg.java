package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* loaded from: classes2.dex */
public final class llg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACreationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llg(Continuation continuation, TwoFACreationScreen twoFACreationScreen) {
        super(2, continuation);
        this.X = twoFACreationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        llg llgVar = (llg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        llgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        llg llgVar = new llg(continuation, this.X);
        llgVar.o = obj;
        return llgVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        tmg tmgVar = (tmg) this.o;
        TwoFACreationScreen twoFACreationScreen = this.X;
        ?? r1 = twoFACreationScreen.X;
        ?? r2 = twoFACreationScreen.d;
        yy7[] yy7VarArr = TwoFACreationScreen.w0;
        if (tmgVar instanceof qmg) {
            sp7 sp7Var = (sp7) r1.getValue();
            qmg qmgVar = (qmg) tmgVar;
            String str = qmgVar.a;
            up7 up7Var = qmgVar.b;
            jlg jlgVarB0 = twoFACreationScreen.B0();
            rp7 rp7Var = (rp7) r2.getValue();
            sp7Var.getClass();
            sp7Var.a(l8j.a(new TwoFACreationScreen(jlgVarB0.name(), "CREATE_HINT", rp7Var.name(), str, up7Var), null, null), "CREATE_HINT");
        } else if (tmgVar instanceof pmg) {
            sp7 sp7Var2 = (sp7) r1.getValue();
            pmg pmgVar = (pmg) tmgVar;
            String str2 = pmgVar.a;
            up7 up7Var2 = pmgVar.b;
            jlg jlgVarB02 = twoFACreationScreen.B0();
            rp7 rp7Var2 = (rp7) r2.getValue();
            sp7Var2.getClass();
            sp7Var2.a(l8j.a(new TwoFACreationScreen(jlgVarB02.name(), "ADD_EMAIL", rp7Var2.name(), str2, up7Var2), null, null), "ADD_EMAIL");
        } else if (tmgVar instanceof smg) {
            sp7 sp7Var3 = (sp7) r1.getValue();
            smg smgVar = (smg) tmgVar;
            String str3 = smgVar.a;
            up7 up7Var3 = smgVar.b;
            jlg jlgVarB03 = twoFACreationScreen.B0();
            rp7 rp7Var3 = (rp7) r2.getValue();
            sp7Var3.getClass();
            sp7Var3.a(l8j.a(new TwoFACreationScreen(jlgVarB03.name(), "VERIFY_EMAIL", rp7Var3.name(), str3, up7Var3), null, null), "VERIFY_EMAIL");
        } else {
            if (!fni.a(tmgVar, rmg.a)) {
                throw new NoWhenBranchMatchedException();
            }
            cpi.b(twoFACreationScreen.getActivity());
            int iOrdinal = twoFACreationScreen.B0().ordinal();
            if (iOrdinal == 0) {
                omg.c.p0().b(":settings/privacy/onboarding-twofa?state=finish", null);
            } else if (iOrdinal == 1) {
                omg.c.p0().b(":settings/privacy", null);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int iOrdinal2 = ((rp7) r2.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    ((jrb) ykg.a.getAccessor().c(3)).c();
                    omg.c.p0().b(":chat-list", null);
                } else {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    omg.c.p0().b(":settings/privacy", null);
                }
            }
        }
        return qqg.a;
    }
}
