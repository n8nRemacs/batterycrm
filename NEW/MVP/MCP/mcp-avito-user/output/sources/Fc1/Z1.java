package Fc1;

import androidx.compose.foundation.lazy.InterfaceC20793y;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class Z1 extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.snapshots.D f5347l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C13608f2 f5348m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5349n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(int i12, C13608f2 c13608f2, androidx.compose.runtime.snapshots.D d12) {
        super(4);
        this.f5347l = d12;
        this.f5348m = c13608f2;
        this.f5349n = i12;
    }

    @Override // Y41.r
    public final kotlin.G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((i12 & 731) == 146 && a13.c()) {
            a13.f();
        } else {
            C13562a1.a((C13602e5) this.f5347l.get(iIntValue), this.f5348m, a13, ((this.f5349n << 3) & 112) | 8);
        }
        return kotlin.G0.f406611a;
    }
}
