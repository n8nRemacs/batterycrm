package defpackage;

import android.view.Window;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* loaded from: classes.dex */
public final class x21 {
    public final jl8 a;

    public x21(jl8 jl8Var) {
        this.a = jl8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Window window, c54 c54Var, c54 c54Var2, boolean z) {
        if ((c54Var2 instanceof CallIndicatorWidget) || (c54Var2 instanceof CallIncomingScreen) || (c54Var2 instanceof CallScreen)) {
            j2e j2eVar = c54Var2 instanceof j2e ? (j2e) c54Var2 : null;
            if (j2eVar != null) {
                j2eVar.c(window);
            }
        }
        if (!(c54Var instanceof CallIndicatorWidget) || z) {
            return;
        }
        j2e j2eVar2 = c54Var != 0 ? (j2e) c54Var : null;
        if (j2eVar2 != null) {
            j2eVar2.l(window);
        }
    }
}
