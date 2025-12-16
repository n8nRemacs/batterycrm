package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.debug.internal.b;

/* compiled from: DebugProbesImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class p extends N implements Y41.a<G0> {
    static {
        new p();
    }

    public p() {
        super(0);
    }

    @Override // Y41.a
    public final G0 invoke() {
        b<CoroutineStackFrame, g> bVar = i.f411075d;
        ReferenceQueue<CoroutineStackFrame> referenceQueue = bVar.f411048b;
        if (referenceQueue == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                t tVar = (t) referenceQueue.remove();
                b.a aVar = (b.a) b.f411047d.get(bVar);
                aVar.getClass();
                int i12 = (tVar.f411076a * (-1640531527)) >>> aVar.f411051b;
                while (true) {
                    t tVar2 = (t) aVar.f411053d.get(i12);
                    if (tVar2 != null) {
                        if (tVar2 == tVar) {
                            aVar.c(i12);
                            break;
                        }
                        if (i12 == 0) {
                            i12 = aVar.f411050a;
                        }
                        i12--;
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return G0.f406611a;
            }
        }
    }
}
