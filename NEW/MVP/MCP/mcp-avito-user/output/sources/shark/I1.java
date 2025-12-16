package shark;

import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: HeapAnalyzer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "index", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class I1 extends kotlin.jvm.internal.N implements Y41.l<Integer, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.f f438086l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(l0.f fVar) {
        super(1);
        this.f438086l = fVar;
    }

    @Override // Y41.l
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue > this.f438086l.f406840b) {
            return Integer.valueOf(iIntValue - 1);
        }
        return null;
    }
}
