package Fc1;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.C22143q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.g7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13622g7 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f5533l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5534m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C13623h f5535n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13622g7(boolean z12, int i12, C13623h c13623h) {
        super(3);
        this.f5533l = z12;
        this.f5534m = i12;
        this.f5535n = c13623h;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            float f12 = 8;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            C13792z7.a((this.f5534m & 112) | 6, a13, androidx.compose.foundation.layout.R1.m(aVar, f12, 0.0f, 0.0f, 0.0f, 14), this.f5533l);
            androidx.compose.ui.v vVarI = androidx.compose.foundation.layout.R1.i(aVar, f12);
            C13623h c13623h = this.f5535n;
            C22143q0 c22143q0 = C13707q2.f5762a;
            C13698p2.a(c13623h.f5538c, vVarI, ((InterfaceC13779y3) a13.o(c22143q0)).j(), ((InterfaceC13779y3) a13.o(c22143q0)).n(), null, a13, 48, 16);
        }
        return kotlin.G0.f406611a;
    }
}
