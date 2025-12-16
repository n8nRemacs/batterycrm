package Fc1;

import java.util.List;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.i6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13639i6 extends kotlin.jvm.internal.N implements Y41.l<Object, Object> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D<Object> f5582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<List<Object>, kotlin.G0> f5583m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13639i6(androidx.compose.runtime.snapshots.D<Object> d12, Y41.l<? super List<Object>, kotlin.G0> lVar) {
        super(1);
        this.f5582l = d12;
        this.f5583m = lVar;
    }

    @Override // Y41.l
    @Y61.k
    public final Object invoke(@Y61.k Object obj) {
        boolean z12 = obj instanceof kotlin.G0;
        androidx.compose.runtime.snapshots.D<Object> d12 = this.f5582l;
        if (z12) {
            return d12.e().f38613c;
        }
        d12.addAll((List) obj);
        this.f5583m.invoke(obj);
        return kotlin.G0.f406611a;
    }
}
