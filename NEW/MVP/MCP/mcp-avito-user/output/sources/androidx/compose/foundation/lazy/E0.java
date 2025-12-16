package androidx.compose.foundation.lazy;

import androidx.compose.runtime.I3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyItemScopeImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/E0;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class E0 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    public float f28816p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public I3<Integer> f28817q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public I3<Integer> f28818r;

    /* compiled from: LazyItemScopeImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f28819l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K0 k02) {
            super(1);
            this.f28819l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.e(this.f28819l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    public /* synthetic */ E0(float f12, I3 i32, I3 i33, int i12, C42822w c42822w) {
        this(f12, (i12 & 2) != 0 ? null : i32, (i12 & 4) != 0 ? null : i33);
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        I3<Integer> i32 = this.f28817q;
        int iRound = (i32 == null || i32.getF42167b().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(i32.getF42167b().floatValue() * this.f28816p);
        I3<Integer> i33 = this.f28818r;
        int iRound2 = (i33 == null || i33.getF42167b().intValue() == Integer.MAX_VALUE) ? Integer.MAX_VALUE : Math.round(i33.getF42167b().floatValue() * this.f28816p);
        int iL2 = iRound != Integer.MAX_VALUE ? iRound : C22712b.l(j12);
        int iK2 = iRound2 != Integer.MAX_VALUE ? iRound2 : C22712b.k(j12);
        if (iRound == Integer.MAX_VALUE) {
            iRound = C22712b.j(j12);
        }
        if (iRound2 == Integer.MAX_VALUE) {
            iRound2 = C22712b.i(j12);
        }
        K0 k0I = interfaceC22363h0.I(C22713c.a(iL2, iRound, iK2, iRound2));
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new a(k0I));
    }

    public E0(float f12, @Y61.l I3<Integer> i32, @Y61.l I3<Integer> i33) {
        this.f28816p = f12;
        this.f28817q = i32;
        this.f28818r = i33;
    }
}
