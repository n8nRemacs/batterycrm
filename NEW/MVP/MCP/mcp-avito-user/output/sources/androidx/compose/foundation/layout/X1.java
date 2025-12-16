package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Padding.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/X1;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class X1 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public T1 f28548p;

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28549l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f28550m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f28551n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28549l = k02;
            this.f28550m = i12;
            this.f28551n = i13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.e(this.f28549l, this.f28550m, this.f28551n, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        float fC2 = this.f28548p.c(interfaceC22369k0.getF40388b());
        float f28512b = this.f28548p.getF28512b();
        float fA2 = this.f28548p.a(interfaceC22369k0.getF40388b());
        float f28514d = this.f28548p.getF28514d();
        float f12 = 0;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        if (!((Float.compare(f28514d, f12) >= 0) & (Float.compare(fC2, f12) >= 0) & (Float.compare(f28512b, f12) >= 0) & (Float.compare(fA2, f12) >= 0))) {
            N.a.a("Padding must be non-negative");
        }
        int iY02 = interfaceC22369k0.y0(fC2);
        int iY03 = interfaceC22369k0.y0(fA2) + iY02;
        int iY04 = interfaceC22369k0.y0(f28512b);
        int iY05 = interfaceC22369k0.y0(f28514d) + iY04;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22713c.i(-iY03, -iY05, j12));
        return interfaceC22369k0.L0(C22713c.g(k0I.f40345b + iY03, j12), C22713c.f(k0I.f40346c + iY05, j12), kotlin.collections.P0.c(), new a(iY02, iY04, k0I));
    }
}
