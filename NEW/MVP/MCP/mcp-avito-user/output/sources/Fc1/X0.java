package Fc1;

import java.util.List;

/* loaded from: classes9.dex */
public final class X0 extends kotlin.jvm.internal.N implements Y41.l<Object, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D<Object> f5307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Q1 f5308m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(androidx.compose.runtime.snapshots.D d12, Q1 q12) {
        super(1);
        this.f5307l = d12;
        this.f5308m = q12;
    }

    @Override // Y41.l
    @Y61.k
    public final Object invoke(@Y61.k Object obj) {
        boolean z12 = obj instanceof kotlin.G0;
        androidx.compose.runtime.snapshots.D<Object> d12 = this.f5307l;
        if (z12) {
            return d12.e().f38613c;
        }
        Q1 q12 = this.f5308m;
        d12.addAll((List) obj);
        q12.invoke(obj);
        return kotlin.G0.f406611a;
    }
}
