package defpackage;

import android.view.View;
import one.me.calls.ui.ui.call.CallScreen;

/* loaded from: classes.dex */
public final class pl1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ pl1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        CallScreen callScreen = this.b;
        switch (i9) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                rha rhaVar = CallScreen.N0;
                callScreen.G0().c();
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                rha rhaVar2 = CallScreen.N0;
                callScreen.G0().c();
                break;
        }
    }
}
