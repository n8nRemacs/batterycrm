package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final class ucc extends dtf implements sm6 {
    public final /* synthetic */ ProfileChangeLinkScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucc(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.X = profileChangeLinkScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ucc uccVar = (ucc) l((v82) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uccVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ucc uccVar = new ucc(continuation, this.X);
        uccVar.o = obj;
        return uccVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        v82 v82Var = (v82) this.o;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.X;
        ((yfb) profileChangeLinkScreen.Z.D(profileChangeLinkScreen, ProfileChangeLinkScreen.t0[3])).setTitle(v82Var.a);
        ProfileChangeLinkScreen.y0(profileChangeLinkScreen).setEnabled(v82Var.c);
        ProfileChangeLinkScreen.y0(profileChangeLinkScreen).setProgressEnabled(v82Var.d);
        int iOrdinal = profileChangeLinkScreen.z0().ordinal();
        if (iOrdinal == 0) {
            ProfileChangeLinkScreen.y0(profileChangeLinkScreen).setVisibility(0);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ProfileChangeLinkScreen.y0(profileChangeLinkScreen).setVisibility(v82Var.b ? 0 : 8);
        }
        return qqg.a;
    }
}
