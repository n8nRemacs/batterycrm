package defpackage;

import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public final class cpb extends z74 {
    public final ay4 a = new ay4();

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        ay4 ay4Var = this.a;
        ay4Var.getClass();
        ep4 ep4Var = gy4.a;
        wl8 immediate = MainDispatcherLoader.dispatcher.getImmediate();
        if (immediate.isDispatchNeeded(x74Var) || ay4Var.b || !ay4Var.a) {
            immediate.mo13dispatch(x74Var, new kr4(ay4Var, 4, runnable));
        } else {
            if (!ay4Var.d.offer(runnable)) {
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
            ay4Var.a();
        }
    }

    @Override // defpackage.z74
    public final boolean isDispatchNeeded(x74 x74Var) {
        ep4 ep4Var = gy4.a;
        if (MainDispatcherLoader.dispatcher.getImmediate().isDispatchNeeded(x74Var)) {
            return true;
        }
        ay4 ay4Var = this.a;
        return !(ay4Var.b || !ay4Var.a);
    }
}
