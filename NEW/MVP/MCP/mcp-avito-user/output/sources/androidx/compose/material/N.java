package androidx.compose.material;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.runtime.C22143q0;
import kotlin.Metadata;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class N extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20639x2 f32958l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f32959m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> f32960n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public N(InterfaceC20639x2 interfaceC20639x2, androidx.compose.foundation.layout.T1 t12, Y41.q<? super InterfaceC20572g2, ? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> qVar) {
        super(2);
        this.f32958l = interfaceC20639x2;
        this.f32959m = t12;
        this.f32960n = qVar;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C22143q0 c22143q0 = C21427z2.f34423a;
            C21414y2.f34415a.getClass();
            androidx.compose.runtime.S.a(c22143q0.b(Float.valueOf(C21414y2.c(a13))), androidx.compose.runtime.internal.r.c(600325466, new M(this.f32958l, this.f32959m, this.f32960n), a13), a13, 56);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
