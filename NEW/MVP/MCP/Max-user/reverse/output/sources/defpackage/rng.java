package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rng extends dtf implements sm6 {
    public o98 X;
    public o98 Y;
    public int Z;
    public sng o;
    public final /* synthetic */ sng s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rng(sng sngVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = sngVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rng) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rng(this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        o98 o98VarD;
        o98 o98Var;
        sng sngVar;
        int i = this.Z;
        sng sngVar2 = this.s0;
        if (i == 0) {
            g8j.b(obj);
            o98VarD = ve3.d();
            this.o = sngVar2;
            this.X = o98VarD;
            this.Y = o98VarD;
            this.Z = 1;
            Object objT = sng.t(sngVar2, o98VarD, this);
            g84 g84Var = g84.a;
            if (objT == g84Var) {
                return g84Var;
            }
            o98Var = o98VarD;
            sngVar = sngVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o98VarD = this.Y;
            o98Var = this.X;
            sngVar = this.o;
            g8j.b(obj);
        }
        yy7[] yy7VarArr = sng.x0;
        sngVar.getClass();
        o98VarD.add(new eng(4, new n5g(r4d.oneme_settings_twofa_disable_password_title), 1, e0d.oneme_settings_twofa_configuration_setting_disable_twofa, null, 32));
        sngVar2.Y.setValue(ve3.a(o98Var));
        return qqg.a;
    }
}
