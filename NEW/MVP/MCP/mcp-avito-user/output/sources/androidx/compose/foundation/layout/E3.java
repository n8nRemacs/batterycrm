package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/E3;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class E3 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Direction f28242p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28243q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f28244r;

    /* compiled from: Size.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f28246m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28247n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f28248o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f28249p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, androidx.compose.ui.layout.K0 k02, int i13, InterfaceC22369k0 interfaceC22369k0) {
            super(1);
            this.f28246m = i12;
            this.f28247n = k02;
            this.f28248o = i13;
            this.f28249p = interfaceC22369k0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            ?? r02 = E3.this.f28244r;
            K0.a.g(aVar, this.f28247n, ((androidx.compose.ui.unit.q) r02.invoke(androidx.compose.ui.unit.u.a(((this.f28246m - r1.f40345b) << 32) | ((this.f28248o - r1.f40346c) & 4294967295L)), this.f28249p.getF40388b())).f42864a);
            return kotlin.G0.f406611a;
        }
    }

    public E3() {
        throw null;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        Direction direction = this.f28242p;
        Direction direction2 = Direction.f28233b;
        int iL2 = direction != direction2 ? 0 : C22712b.l(j12);
        Direction direction3 = this.f28242p;
        Direction direction4 = Direction.f28234c;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22713c.a(iL2, (this.f28242p == direction2 || !this.f28243q) ? C22712b.j(j12) : Integer.MAX_VALUE, direction3 == direction4 ? C22712b.k(j12) : 0, (this.f28242p == direction4 || !this.f28243q) ? C22712b.i(j12) : Integer.MAX_VALUE));
        int iG2 = kotlin.ranges.s.g(k0I.f40345b, C22712b.l(j12), C22712b.j(j12));
        int iG3 = kotlin.ranges.s.g(k0I.f40346c, C22712b.k(j12), C22712b.i(j12));
        return interfaceC22369k0.L0(iG2, iG3, kotlin.collections.P0.c(), new a(iG2, k0I, iG3, interfaceC22369k0));
    }
}
