package kotlinx.coroutines.sync;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.selects.r;
import kotlinx.coroutines.selects.s;
import kotlinx.coroutines.sync.d;
import kotlinx.coroutines.sync.d.b;

/* compiled from: Mutex.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class e extends H implements Y41.q<d, r<?>, Object, G0> {
    static {
        new e();
    }

    public e() {
        super(3, d.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // Y41.q
    public final G0 invoke(d dVar, r<?> rVar, Object obj) {
        int andDecrement;
        d dVar2 = dVar;
        r<?> rVar2 = rVar;
        if (obj != null) {
            while (true) {
                if (!dVar2.a()) {
                    break;
                }
                Object obj2 = d.f412256h.get(dVar2);
                if (obj2 != j.f412267a) {
                    if (obj2 == obj) {
                        rVar2.d(j.f412268b);
                    }
                }
            }
        } else {
            dVar2.getClass();
        }
        d.b bVar = dVar2.new b((s) rVar2, obj);
        while (true) {
            dVar2.getClass();
            do {
                andDecrement = l.f412273g.getAndDecrement(dVar2);
            } while (andDecrement > dVar2.f412274a);
            if (andDecrement > 0) {
                bVar.d(G0.f406611a);
                break;
            }
            if (dVar2.e(bVar)) {
                break;
            }
        }
        return G0.f406611a;
    }
}
