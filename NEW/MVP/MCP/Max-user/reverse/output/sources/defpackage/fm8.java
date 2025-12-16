package defpackage;

import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class fm8 extends dtf implements sm6 {
    public final /* synthetic */ MainScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm8(Continuation continuation, MainScreen mainScreen) {
        super(2, continuation);
        this.X = mainScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fm8 fm8Var = (fm8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fm8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fm8 fm8Var = new fm8(continuation, this.X);
        fm8Var.o = obj;
        return fm8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        zya zyaVar = (zya) this.o;
        rha rhaVar = MainScreen.Y;
        ytd ytdVarA0 = this.X.A0();
        c54 c54VarG = ytdVarA0 != null ? ytdVarA0.g(zyaVar.d) : null;
        s3e s3eVar = c54VarG instanceof s3e ? (s3e) c54VarG : null;
        if (s3eVar != null) {
            s3eVar.f0();
        }
        return qqg.a;
    }
}
