package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;

/* loaded from: classes2.dex */
public final class tdc extends dtf implements sm6 {
    public final /* synthetic */ ProfileDeletionInfoScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdc(Continuation continuation, ProfileDeletionInfoScreen profileDeletionInfoScreen) {
        super(2, continuation);
        this.X = profileDeletionInfoScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tdc tdcVar = (tdc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tdcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tdc tdcVar = new tdc(continuation, this.X);
        tdcVar.o = obj;
        return tdcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((cda) this.o) instanceof jc3) {
            this.X.getRouter().C();
        }
        return qqg.a;
    }
}
