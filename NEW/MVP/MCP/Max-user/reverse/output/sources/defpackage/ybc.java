package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* loaded from: classes2.dex */
public final class ybc extends dtf implements sm6 {
    public final /* synthetic */ ProfileAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybc(Continuation continuation, ProfileAvatarsScreen profileAvatarsScreen) {
        super(2, continuation);
        this.X = profileAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ybc ybcVar = (ybc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ybcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ybc ybcVar = new ybc(continuation, this.X);
        ybcVar.o = obj;
        return ybcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        ProfileAvatarsScreen profileAvatarsScreen = this.X;
        obc obcVar = profileAvatarsScreen.v0;
        if (!obcVar.v0.isEmpty() || list.isEmpty()) {
            mw4 mw4VarB = q08.b(new ea1(3, obcVar.v0, list));
            obcVar.v0 = list;
            mw4VarB.a(new iv6(2, obcVar));
        } else {
            obcVar.v0 = list;
            obcVar.p(0, list.size());
        }
        ProfileAvatarsScreen.I0(profileAvatarsScreen, profileAvatarsScreen.N0().b.getTitle(), profileAvatarsScreen.O0().getCurrentItem());
        return qqg.a;
    }
}
