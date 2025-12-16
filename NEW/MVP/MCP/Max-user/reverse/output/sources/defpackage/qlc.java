package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class qlc extends dtf implements sm6 {
    public final /* synthetic */ ProfileScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlc(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.X = profileScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qlc qlcVar = (qlc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qlcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qlc qlcVar = new qlc(continuation, this.X);
        qlcVar.o = obj;
        return qlcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        yy7[] yy7VarArr = ProfileScreen.C0;
        phd adapter = this.X.C0().getAdapter();
        amc amcVar = adapter instanceof amc ? (amc) adapter : null;
        if (amcVar != null) {
            amcVar.E(list);
        }
        return qqg.a;
    }
}
