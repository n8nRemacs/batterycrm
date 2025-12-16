package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* loaded from: classes2.dex */
public final class wwb extends dtf implements sm6 {
    public final /* synthetic */ PickSubscribersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwb(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.X = pickSubscribersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wwb wwbVar = (wwb) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wwbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wwb wwbVar = new wwb(this.X, continuation);
        wwbVar.o = obj;
        return wwbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long[] jArrE0 = ue3.e0((Set) this.o);
        PickSubscribersScreen pickSubscribersScreen = this.X;
        hs hsVar = pickSubscribersScreen.t0;
        yy7 yy7Var = PickSubscribersScreen.z0[0];
        hsVar.b(pickSubscribersScreen, jArrE0);
        return qqg.a;
    }
}
