package Fc1;

import androidx.compose.runtime.InterfaceC22204y1;

/* renamed from: Fc1.n6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13684n6 extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.A, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f5707l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f5708m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C13696p0 f5709n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<androidx.compose.runtime.snapshots.D<P7>> f5710o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13684n6(InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1, androidx.compose.ui.unit.d dVar, C13696p0 c13696p0, Y41.a<androidx.compose.runtime.snapshots.D<P7>> aVar) {
        super(1);
        this.f5707l = interfaceC22204y1;
        this.f5708m = dVar;
        this.f5709n = c13696p0;
        this.f5710o = aVar;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(androidx.compose.ui.layout.A a12) {
        androidx.compose.ui.layout.A a13 = a12;
        InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1 = this.f5707l;
        if (!androidx.compose.ui.unit.u.c(interfaceC22204y1.getF42167b().f42872a, a13.a())) {
            interfaceC22204y1.setValue(androidx.compose.ui.unit.u.a(a13.a()));
            float fM02 = this.f5708m.M0(C13593d5.f5455c);
            int i12 = this.f5709n.f5740a;
            float fA2 = (((int) (a13.a() >> 32)) - fM02) / (i12 - 1);
            float f12 = 2;
            float f13 = (fM02 - fA2) / f12;
            for (int i13 = 0; i13 < i12; i13++) {
                float f14 = (i13 * fA2) + f13;
                Y41.a<androidx.compose.runtime.snapshots.D<P7>> aVar = this.f5710o;
                aVar.invoke().set(i13, new P7(f14, (fA2 / f12) + f14, f14 + fA2, aVar.invoke().get(i13).f5151d));
            }
        }
        return kotlin.G0.f406611a;
    }
}
