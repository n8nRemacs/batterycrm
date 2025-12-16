package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Size.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/u2;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/unit/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20627u2 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    public float f28749p;

    /* renamed from: q, reason: collision with root package name */
    public float f28750q;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.u2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28751l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28751l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.h(this.f28751l, 0, 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20627u2(float f12, float f13, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f12 = androidx.compose.ui.unit.h.f42851e;
        }
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f13 = androidx.compose.ui.unit.h.f42851e;
        }
        this(f12, f13, null);
    }

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        int iR2 = interfaceC22391w.R(i12);
        int iY02 = !Float.isNaN(this.f28750q) ? x12.y0(this.f28750q) : 0;
        return iR2 < iY02 ? iY02 : iR2;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        int iL2;
        int iK2;
        if (Float.isNaN(this.f28749p) || C22712b.l(j12) != 0) {
            iL2 = C22712b.l(j12);
        } else {
            int iY02 = interfaceC22369k0.y0(this.f28749p);
            iL2 = C22712b.j(j12);
            if (iY02 < 0) {
                iY02 = 0;
            }
            if (iY02 <= iL2) {
                iL2 = iY02;
            }
        }
        int iJ2 = C22712b.j(j12);
        if (Float.isNaN(this.f28750q) || C22712b.k(j12) != 0) {
            iK2 = C22712b.k(j12);
        } else {
            int iY03 = interfaceC22369k0.y0(this.f28750q);
            iK2 = C22712b.i(j12);
            int i12 = iY03 >= 0 ? iY03 : 0;
            if (i12 <= iK2) {
                iK2 = i12;
            }
        }
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22713c.a(iL2, iJ2, iK2, C22712b.i(j12)));
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(k0I));
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        int iG2 = interfaceC22391w.G(i12);
        int iY02 = !Float.isNaN(this.f28749p) ? x12.y0(this.f28749p) : 0;
        return iG2 < iY02 ? iY02 : iG2;
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        int iX2 = interfaceC22391w.X(i12);
        int iY02 = !Float.isNaN(this.f28750q) ? x12.y0(this.f28750q) : 0;
        return iX2 < iY02 ? iY02 : iX2;
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        int iB02 = interfaceC22391w.b0(i12);
        int iY02 = !Float.isNaN(this.f28749p) ? x12.y0(this.f28749p) : 0;
        return iB02 < iY02 ? iY02 : iB02;
    }

    public C20627u2(float f12, float f13, C42822w c42822w) {
        this.f28749p = f12;
        this.f28750q = f13;
    }
}
