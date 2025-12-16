package defpackage;

import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.MainDispatchersKt;
import kotlinx.coroutines.internal.SystemPropsKt;

/* loaded from: classes.dex */
public abstract class lm4 {
    public static final ms4 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ms4 ms4Var;
        if (SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false)) {
            ep4 ep4Var = gy4.a;
            wl8 wl8Var = MainDispatcherLoader.dispatcher;
            ms4Var = (MainDispatchersKt.isMissing(wl8Var) || !(wl8Var instanceof ms4)) ? km4.Z : (ms4) wl8Var;
        } else {
            ms4Var = km4.Z;
        }
        a = ms4Var;
    }
}
