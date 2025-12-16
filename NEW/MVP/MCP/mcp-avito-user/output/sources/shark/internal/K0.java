package shark.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import shark.AbstractC48368z1;
import shark.C48240c2;

/* compiled from: ThreadObjects.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "Lshark/z1$m;", "Lkotlin/internal/i;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class K0 extends kotlin.jvm.internal.N implements Y41.a<Map<Long, ? extends AbstractC48368z1.m>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48240c2 f438388l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C48240c2 c48240c2) {
        super(0);
        this.f438388l = c48240c2;
    }

    @Override // Y41.a
    public final Map<Long, ? extends AbstractC48368z1.m> invoke() {
        C43025h c43025hI = C43033p.i(new C42770s0(this.f438388l.f438260i.f438423h), J0.f438382l);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C43025h.a aVar = new C43025h.a(c43025hI);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            linkedHashMap.put(Long.valueOf(((AbstractC48368z1.m) next).f438833a), next);
        }
        return linkedHashMap;
    }
}
