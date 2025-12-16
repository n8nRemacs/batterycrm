package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class r extends dtf implements sm6 {
    public final /* synthetic */ a0 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.X = a0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((r) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new r(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        a0 a0Var = this.X;
        tcf tcfVar = a0Var.Y;
        o98 o98VarD = ve3.d();
        l5c l5cVar = (l5c) a0Var.b;
        l5cVar.getClass();
        if (l5cVar.m(PmsKey.f148userdebugreport, 0L) != 0) {
            o98VarD.add(nde.a);
        }
        int i2 = vxc.about_app_version;
        n5g n5gVar = new n5g(t2d.about_app_settings_version);
        ((eza) a0Var.o.getValue()).getClass();
        o98VarD.add(new x0f(i2, n5gVar, new r5g("25.19.0")));
        o98 o98VarA = ve3.a(o98VarD);
        this.o = 1;
        tcfVar.setValue(o98VarA);
        g84 g84Var = g84.a;
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}
