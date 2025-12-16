package defpackage;

import android.view.View;
import java.util.Collections;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class bue implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShareDataPickerScreen b;

    public /* synthetic */ bue(ShareDataPickerScreen shareDataPickerScreen, int i) {
        this.a = i;
        this.b = shareDataPickerScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        ShareDataPickerScreen shareDataPickerScreen = this.b;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yy7[] yy7VarArr = ShareDataPickerScreen.I0;
                shareDataPickerScreen.L0(zBooleanValue);
                break;
            case 1:
                yy7[] yy7VarArr2 = ShareDataPickerScreen.I0;
                h6j.a(1).B((View) obj).o(shareDataPickerScreen.G0 ? Collections.singletonList(new b44(wbb.h, new n5g(xbb.g), Integer.valueOf(yud.p1), (Integer) null, 20)) : Collections.singletonList(new b44(wbb.i, new n5g(xbb.h), Integer.valueOf(yud.o1), (Integer) null, 20))).f().build().u(shareDataPickerScreen);
                break;
            default:
                yy7[] yy7VarArr3 = ShareDataPickerScreen.I0;
                jva onBackPressedDispatcher = shareDataPickerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
        }
        return qqgVar;
    }
}
