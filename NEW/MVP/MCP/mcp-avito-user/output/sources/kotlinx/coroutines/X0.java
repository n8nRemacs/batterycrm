package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.V0.d;

/* compiled from: JobSupport.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class X0 extends kotlin.jvm.internal.H implements Y41.q<V0, kotlinx.coroutines.selects.r<?>, Object, kotlin.G0> {
    static {
        new X0();
    }

    public X0() {
        super(3, V0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(V0 v02, kotlinx.coroutines.selects.r<?> rVar, Object obj) {
        V0 v03 = v02;
        kotlinx.coroutines.selects.r<?> rVar2 = rVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.f410723b;
        while (true) {
            Object objJ0 = v03.j0();
            if (!(objJ0 instanceof F0)) {
                if (!(objJ0 instanceof E)) {
                    objJ0 = C43077a1.a(objJ0);
                }
                rVar2.d(objJ0);
            } else if (v03.y0(objJ0) >= 0) {
                rVar2.b(Q0.g(v03, v03.new d(rVar2), 3));
                break;
            }
        }
        return kotlin.G0.f406611a;
    }
}
