package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.staggeredgrid.Y;
import kotlin.Metadata;

/* compiled from: Collections.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "", "K", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;", "kotlin/collections/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.N implements Y41.l<Y.b, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Integer f29588l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Integer num) {
        super(1);
        this.f29588l = num;
    }

    @Override // Y41.l
    public final Integer invoke(Y.b bVar) {
        return Integer.valueOf(kotlin.comparisons.a.b(Integer.valueOf(bVar.f29585a), this.f29588l));
    }
}
