package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class cs5 implements drf {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cs5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.drf
    public final Object get() {
        switch (this.a) {
            case 0:
                gs5 gs5Var = (gs5) this.c;
                return gs5Var.a(new bs5(gs5Var, this.b, 0));
            default:
                js5 js5Var = (js5) this.c;
                o3f o3fVar = new o3f();
                ConcurrentHashMap concurrentHashMap = js5Var.f;
                hwa hwaVar = js5Var.a;
                concurrentHashMap.put(Long.valueOf(hwaVar.u().c(new cu(4, hwaVar.t().a.k(), this.b), false, 0L, (12 & 8) != 0 ? 0 : 1)), o3fVar);
                return o3fVar;
        }
    }
}
