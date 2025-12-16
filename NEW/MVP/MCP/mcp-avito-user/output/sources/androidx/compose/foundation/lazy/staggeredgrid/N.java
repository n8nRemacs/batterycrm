package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.InterfaceC20717f;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridItemProvider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class N extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f29576l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f29577m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o12, int i12) {
        super(2);
        this.f29576l = o12;
        this.f29577m = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (!a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        InterfaceC20717f.a<F> aVarB = this.f29576l.f29579b.f29574a.b(this.f29577m);
        int i12 = aVarB.f29411a;
        F f12 = aVarB.f29413c;
        int i13 = V.f29581a;
        throw null;
    }
}
