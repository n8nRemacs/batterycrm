package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public final class qrg extends z74 {
    public static final qrg a = new qrg();

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        ep4 ep4Var = ep4.b;
        ep4Var.a.w(runnable, e3g.h, false);
    }

    @Override // defpackage.z74
    public final void dispatchYield(x74 x74Var, Runnable runnable) {
        ep4 ep4Var = ep4.b;
        ep4Var.a.w(runnable, e3g.h, true);
    }

    @Override // defpackage.z74
    public final z74 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= e3g.d ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    @Override // defpackage.z74
    /* renamed from: toString */
    public final String getName() {
        return "Dispatchers.IO";
    }
}
