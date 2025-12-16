package Fc1;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.InterfaceC22204y1;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.c5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13584c5 extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.g f5438l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f5439m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13584c5(androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar, InterfaceC22204y1 interfaceC22204y1, int i12) {
        super(4);
        this.f5438l = gVar;
        this.f5439m = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            E2.a(interfaceC20793y2, (C13602e5) this.f5438l.get(iIntValue), this.f5439m, a13, (i12 & 14) | 448);
        }
        return kotlin.G0.f406611a;
    }
}
