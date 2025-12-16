package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.C0;
import androidx.compose.foundation.lazy.layout.InterfaceC20717f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LazyLayoutPager.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class N extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f29821l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f29822m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o12, int i12) {
        super(2);
        this.f29821l = o12;
        this.f29822m = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            O o12 = this.f29821l;
            C0 c02 = ((M) o12.f29824b).f29820c;
            int i12 = this.f29822m;
            InterfaceC20717f.a aVarB = c02.b(i12);
            int i13 = i12 - aVarB.f29411a;
            C20829x c20829x = (C20829x) aVarB.f29413c;
            c20829x.f30045b.invoke(o12.f29826d, Integer.valueOf(i13), a13, 0);
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
