package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/O1;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class O1 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super androidx.compose.ui.unit.d, androidx.compose.ui.unit.q> f28446p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28447q;

    /* compiled from: Offset.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f28449m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28450n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22369k0 interfaceC22369k0, androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28449m = interfaceC22369k0;
            this.f28450n = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            O1 o12 = O1.this;
            long j12 = o12.f28446p.invoke(this.f28449m).f42864a;
            boolean z12 = o12.f28447q;
            androidx.compose.ui.layout.K0 k02 = this.f28450n;
            if (z12) {
                K0.a.j(aVar2, k02, (int) (j12 >> 32), (int) (j12 & 4294967295L));
            } else {
                K0.a.m(aVar2, k02, (int) (j12 >> 32), (int) (j12 & 4294967295L), null, 12);
            }
            return kotlin.G0.f406611a;
        }
    }

    public O1() {
        throw null;
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(interfaceC22369k0, k0I));
    }
}
