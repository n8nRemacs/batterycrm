package defpackage;

import android.view.View;
import java.util.Collections;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ig6 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ForwardPickerScreen b;

    public /* synthetic */ ig6(ForwardPickerScreen forwardPickerScreen, int i) {
        this.a = i;
        this.b = forwardPickerScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        ForwardPickerScreen forwardPickerScreen = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yy7[] yy7VarArr = ForwardPickerScreen.I0;
                forwardPickerScreen.P0(zBooleanValue);
                break;
            case 1:
                yy7[] yy7VarArr2 = ForwardPickerScreen.I0;
                jva onBackPressedDispatcher = forwardPickerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            default:
                yy7[] yy7VarArr3 = ForwardPickerScreen.I0;
                h6j.a(1).B((View) obj).o(forwardPickerScreen.O0() ? Collections.singletonList(new b44(f1b.e, new n5g(h1b.b), Integer.valueOf(yud.p1), (Integer) null, 20)) : Collections.singletonList(new b44(f1b.f, new n5g(h1b.c), Integer.valueOf(yud.o1), (Integer) null, 20))).f().build().u(forwardPickerScreen);
                break;
        }
        return qqgVar;
    }
}
