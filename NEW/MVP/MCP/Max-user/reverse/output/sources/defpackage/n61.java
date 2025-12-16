package defpackage;

import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.pip.PipScreen;

/* loaded from: classes.dex */
public final class n61 implements mi4 {
    public final /* synthetic */ int a;

    public /* synthetic */ n61(int i) {
        this.a = i;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                CallScreen.N0.getClass();
                return new CallScreen(gwi.b(new imb("type", "ACTIVE")));
            default:
                return new PipScreen();
        }
    }
}
