package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class bs5 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bs5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                hwa hwaVar = ((gs5) this.c).a;
                return Long.valueOf(hwaVar.u().c(new cu(5, hwaVar.t().a.k(), this.b), false, 0L, (12 & 8) != 0 ? 0 : 1));
            default:
                return ((tef) ((ps5) this.c).b.get()).d(Collections.singletonList(Long.valueOf(this.b)));
        }
    }
}
