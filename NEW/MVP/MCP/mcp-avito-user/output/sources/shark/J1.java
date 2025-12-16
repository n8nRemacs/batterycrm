package shark;

import java.util.Map;
import kotlin.Metadata;

/* compiled from: HeapAnalyzer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "objectId", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class J1 extends kotlin.jvm.internal.N implements Y41.l<Long, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f438089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ shark.internal.F0 f438090m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1(Map map, shark.internal.F0 f02) {
        super(1);
        this.f438089l = map;
        this.f438090m = f02;
    }

    @Override // Y41.l
    public final Integer invoke(Long l12) {
        long jLongValue = l12.longValue();
        Integer num = (Integer) this.f438089l.get(Long.valueOf(jLongValue));
        return Integer.valueOf(this.f438090m.a(jLongValue) + (num != null ? num.intValue() : 0));
    }
}
