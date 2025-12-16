package androidx.compose.material;

import androidx.compose.runtime.internal.InterfaceC22085c;
import kotlin.Metadata;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class R1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f33095l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22085c f33096m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(androidx.compose.foundation.layout.T1 t12, InterfaceC22085c interfaceC22085c) {
        super(2);
        this.f33095l = t12;
        this.f33096m = interfaceC22085c;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C21365u5.f34242a.getClass();
            dc.a(C21365u5.c(a13).f34343k, androidx.compose.runtime.internal.r.c(-630330208, new Q1(this.f33095l, this.f33096m), a13), a13, 48);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
