package androidx.compose.material;

import androidx.compose.runtime.internal.InterfaceC22085c;
import kotlin.Metadata;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class S1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f33141l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.layout.T1 f33142m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22085c f33143n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(androidx.compose.runtime.I3 i32, androidx.compose.foundation.layout.T1 t12, InterfaceC22085c interfaceC22085c) {
        super(2);
        this.f33141l = i32;
        this.f33142m = t12;
        this.f33143n = interfaceC22085c;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.runtime.S.a(C21427z2.f34423a.b(Float.valueOf(androidx.compose.ui.graphics.T.e(this.f33141l.getF42167b().f39331a))), androidx.compose.runtime.internal.r.c(-1699085201, new R1(this.f33142m, this.f33143n), a13), a13, 56);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
