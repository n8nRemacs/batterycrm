package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class cn7 extends dtf implements um6 {
    public /* synthetic */ yeb X;
    public final /* synthetic */ InputPhoneScreen Y;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn7(InputPhoneScreen inputPhoneScreen, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = inputPhoneScreen;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                cn7 cn7Var = new cn7(this.Y, (Continuation) obj3, 0);
                cn7Var.X = (yeb) obj2;
                qqg qqgVar = qqg.a;
                cn7Var.n(qqgVar);
                return qqgVar;
            default:
                cn7 cn7Var2 = new cn7(this.Y, (Continuation) obj3, 1);
                cn7Var2.X = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                cn7Var2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        InputPhoneScreen inputPhoneScreen = this.Y;
        switch (i) {
            case 0:
                g8j.b(obj);
                yeb yebVar = this.X;
                yy7[] yy7VarArr = InputPhoneScreen.C0;
                inputPhoneScreen.C0().onThemeChanged(yebVar);
                break;
            default:
                g8j.b(obj);
                yeb yebVar2 = this.X;
                yy7[] yy7VarArr2 = InputPhoneScreen.C0;
                Drawable background = ((View) inputPhoneScreen.Z.D(inputPhoneScreen, InputPhoneScreen.C0[1])).getBackground();
                v0a v0aVar = background instanceof v0a ? (v0a) background : null;
                if (v0aVar != null) {
                    v0aVar.onThemeChanged(yebVar2);
                    break;
                }
                break;
        }
        return qqgVar;
    }
}
