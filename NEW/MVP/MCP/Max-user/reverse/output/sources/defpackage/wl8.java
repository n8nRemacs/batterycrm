package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public abstract class wl8 extends z74 {
    public abstract wl8 getImmediate();

    @Override // defpackage.z74
    public z74 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    @Override // defpackage.z74
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        return getClass().getSimpleName() + '@' + zg4.a(this);
    }

    public final String toStringInternalImpl() {
        wl8 immediate;
        ep4 ep4Var = gy4.a;
        wl8 wl8Var = MainDispatcherLoader.dispatcher;
        if (this == wl8Var) {
            return "Dispatchers.Main";
        }
        try {
            immediate = wl8Var.getImmediate();
        } catch (UnsupportedOperationException unused) {
            immediate = null;
        }
        if (this == immediate) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
