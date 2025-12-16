package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* compiled from: JobSupport.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class Y0 extends kotlin.jvm.internal.H implements Y41.q<V0, Object, Object, Object> {
    static {
        new Y0();
    }

    public Y0() {
        super(3, V0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // Y41.q
    public final Object invoke(V0 v02, Object obj, Object obj2) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V0.f410723b;
        v02.getClass();
        if (obj2 instanceof E) {
            throw ((E) obj2).f410693a;
        }
        return obj2;
    }
}
