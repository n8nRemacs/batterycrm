package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/D1;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
abstract class D1 extends v.d implements androidx.compose.ui.node.K {

    /* compiled from: Intrinsic.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28228l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28228l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            androidx.compose.ui.unit.q.f42862b.getClass();
            LayoutDirection f40413c = aVar2.getF40413c();
            LayoutDirection layoutDirection = LayoutDirection.f42838b;
            androidx.compose.ui.layout.K0 k02 = this.f28228l;
            if (f40413c == layoutDirection || aVar2.getF40412b() == 0) {
                K0.a.a(k02, aVar2);
                k02.k0(androidx.compose.ui.unit.q.e(0L, k02.f40349f), 0.0f, null);
            } else {
                long f40412b = ((aVar2.getF40412b() - k02.f40345b) - r1) << 32;
                K0.a.a(k02, aVar2);
                k02.k0(androidx.compose.ui.unit.q.e((((int) 0) & 4294967295L) | f40412b, k02.f40349f), 0.0f, null);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.node.K
    public int A(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return interfaceC22391w.R(i12);
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        long jK2 = k2(interfaceC22363h0, j12);
        if (getF28239q()) {
            jK2 = C22713c.e(j12, jK2);
        }
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(jK2);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(k0I));
    }

    public abstract long k2(@Y61.k InterfaceC22363h0 interfaceC22363h0, long j12);

    /* renamed from: l2 */
    public abstract boolean getF28239q();

    @Override // androidx.compose.ui.node.K
    public int m(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return interfaceC22391w.G(i12);
    }

    @Override // androidx.compose.ui.node.K
    public int x(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return interfaceC22391w.X(i12);
    }

    @Override // androidx.compose.ui.node.K
    public int z(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return interfaceC22391w.b0(i12);
    }
}
