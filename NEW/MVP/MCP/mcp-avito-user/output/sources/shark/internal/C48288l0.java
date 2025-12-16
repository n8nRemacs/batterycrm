package shark.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import shark.AbstractC48368z1;
import shark.C48240c2;

/* compiled from: JavaFrames.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0001\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "Lshark/z1$d;", "Lkotlin/internal/i;", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48288l0 extends kotlin.jvm.internal.N implements Y41.a<Map<Integer, ? extends List<? extends AbstractC48368z1.d>>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48240c2 f438572l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48288l0(C48240c2 c48240c2) {
        super(0);
        this.f438572l = c48240c2;
    }

    @Override // Y41.a
    public final Map<Integer, ? extends List<? extends AbstractC48368z1.d>> invoke() {
        C43025h c43025hI = C43033p.i(new C42770s0(this.f438572l.f438260i.f438423h), C48286k0.f438570l);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C43025h.a aVar = new C43025h.a(c43025hI);
        while (aVar.hasNext()) {
            Object next = aVar.next();
            Integer numValueOf = Integer.valueOf(((AbstractC48368z1.d) next).f438816b);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(next);
        }
        return linkedHashMap;
    }
}
