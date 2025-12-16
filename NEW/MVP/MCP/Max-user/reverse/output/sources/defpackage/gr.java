package defpackage;

import kotlin.coroutines.Continuation;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;

/* loaded from: classes.dex */
public final class gr extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ rt2 Y;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen Z;
    public rt2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(rt2 rt2Var, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = rt2Var;
        this.Z = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gr) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gr(this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        rt2 rt2Var;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = AppearanceSettingsMultiThemeScreen.Z;
            xr xrVarY0 = this.Z.y0();
            rt2Var = this.Y;
            this.o = rt2Var;
            this.X = 1;
            obj = xrVarY0.x(this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rt2Var = this.o;
            g8j.b(obj);
        }
        rt2Var.a((qt2) obj);
        return qqg.a;
    }
}
