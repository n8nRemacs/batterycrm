package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import k51.j;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.u0;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes8.dex */
final class c extends N implements Y41.a<O> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f408277l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g0 f408278m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a f408279n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q0 f408280o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f408281p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, g0 g0Var, a aVar, q0 q0Var, j jVar) {
        super(0);
        this.f408277l = dVar;
        this.f408278m = g0Var;
        this.f408279n = aVar;
        this.f408280o = q0Var;
        this.f408281p = jVar;
    }

    @Override // Y41.a
    public final O invoke() {
        u0 u0Var = this.f408277l.f408285d;
        InterfaceC42853f interfaceC42853fB = this.f408280o.b();
        return u0Var.b(this.f408278m, a.e(a.e(this.f408279n, null, false, null, interfaceC42853fB != null ? interfaceC42853fB.q() : null, 31), null, this.f408281p.S(), null, null, 59));
    }
}
