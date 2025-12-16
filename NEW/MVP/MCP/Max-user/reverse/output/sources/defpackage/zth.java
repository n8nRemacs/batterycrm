package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class zth extends dtf implements sm6 {
    public final /* synthetic */ WebAppRootScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zth(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.X = webAppRootScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        zth zthVar = (zth) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zthVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zth zthVar = new zth(continuation, this.X);
        zthVar.o = obj;
        return zthVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        g8j.b(obj);
        zyd zydVar = (zyd) this.o;
        yy7[] yy7VarArr = WebAppRootScreen.R0;
        uvh uvhVarN0 = this.X.N0();
        uvhVarN0.getClass();
        if (zydVar.equals(uyd.a)) {
            yoh yohVar = uvhVarN0.i1;
            if (yohVar != null) {
                yohVar.b(zoh.c);
            }
        } else if (zydVar.equals(vyd.a)) {
            yoh yohVar2 = uvhVarN0.i1;
            if (yohVar2 != null) {
                yohVar2.b(aph.c);
            }
        } else if (zydVar.equals(wyd.a)) {
            yoh yohVar3 = uvhVarN0.i1;
            if (yohVar3 != null) {
                yohVar3.b(bph.c);
            }
        } else if (zydVar.equals(yyd.a)) {
            yoh yohVar4 = uvhVarN0.i1;
            if (yohVar4 != null) {
                yohVar4.b(cph.c);
            }
        } else {
            if (!(zydVar instanceof xyd)) {
                throw new NoWhenBranchMatchedException();
            }
            yoh yohVar5 = uvhVarN0.i1;
            if (yohVar5 != null) {
                yohVar5.a(((xyd) zydVar).a);
            }
        }
        uvhVarN0.c1.setValue(null);
        return qqg.a;
    }
}
