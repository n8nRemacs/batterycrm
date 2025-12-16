package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* loaded from: classes2.dex */
public final class zwb extends dtf implements sm6 {
    public final /* synthetic */ PickSubscribersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwb(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.X = pickSubscribersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zwb zwbVar = (zwb) l((jwb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zwbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zwb zwbVar = new zwb(this.X, continuation);
        zwbVar.o = obj;
        return zwbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        jwb jwbVar = (jwb) this.o;
        boolean z = jwbVar instanceof iwb;
        PickSubscribersScreen pickSubscribersScreen = this.X;
        if (z) {
            yy7[] yy7VarArr = PickSubscribersScreen.z0;
            pickSubscribersScreen.K0().setProgressEnabled(false);
            uaf.c.N0(new iqb(pickSubscribersScreen, jwbVar, 3));
        } else {
            if (!fni.a(jwbVar, hwb.a)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr2 = PickSubscribersScreen.z0;
            pickSubscribersScreen.K0().setProgressEnabled(false);
            uaf.c.N0(new vwb(pickSubscribersScreen, 1));
            ccb ccbVar = new ccb(pickSubscribersScreen);
            ccbVar.g(new n5g(odb.a));
            ccbVar.e(new qcb(yud.r1));
            ccbVar.i();
        }
        return qqg.a;
    }
}
