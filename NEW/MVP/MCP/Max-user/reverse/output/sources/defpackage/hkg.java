package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;

/* loaded from: classes2.dex */
public final class hkg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACheckPassScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkg(Continuation continuation, TwoFACheckPassScreen twoFACheckPassScreen) {
        super(2, continuation);
        this.X = twoFACheckPassScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hkg hkgVar = (hkg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hkgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hkg hkgVar = new hkg(continuation, this.X);
        hkgVar.o = obj;
        return hkgVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        bkg bkgVar = (bkg) this.o;
        TwoFACheckPassScreen twoFACheckPassScreen = this.X;
        ?? r1 = twoFACheckPassScreen.o;
        yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
        if (fni.a(bkgVar, yjg.a)) {
            ((jrb) ykg.a.getAccessor().c(3)).c();
            cpi.b(twoFACheckPassScreen.getActivity());
            omg.c.p0().b(":chat-list", null);
        } else if (bkgVar instanceof akg) {
            cpi.b(twoFACheckPassScreen.getActivity());
            sp7 sp7Var = (sp7) r1.getValue();
            String str = ((akg) bkgVar).a;
            sp7Var.getClass();
            sp7Var.a(l8j.a(new TwoFASettingsScreen(str), null, null), "twofa_settings_screen");
        } else {
            if (!(bkgVar instanceof zjg)) {
                throw new NoWhenBranchMatchedException();
            }
            cpi.b(twoFACheckPassScreen.getActivity());
            ((OneMeButton) twoFACheckPassScreen.Z.D(twoFACheckPassScreen, TwoFACheckPassScreen.t0[2])).setProgressEnabled(false);
            sp7 sp7Var2 = (sp7) r1.getValue();
            zjg zjgVar = (zjg) bkgVar;
            String str2 = zjgVar.a;
            up7 up7Var = zjgVar.b;
            rp7 rp7Var = (rp7) twoFACheckPassScreen.b.getValue();
            sp7Var2.getClass();
            sp7Var2.a(l8j.a(new TwoFAStartRestoreScreen(rp7Var.name(), str2, up7Var), null, null), "twofa_start_restore_screen");
        }
        return qqg.a;
    }
}
