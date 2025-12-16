package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/h3;", "T", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/K;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.h3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21192h3<T> extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public C21398x<T> f33610p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public Y41.p<? super androidx.compose.ui.unit.u, ? super C22712b, ? extends kotlin.Q<? extends InterfaceC21153e3<T>, ? extends T>> f33611q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public Orientation f33612r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33613s;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.h3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f33614l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C21192h3<T> f33615m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f33616n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22369k0 interfaceC22369k0, C21192h3<T> c21192h3, androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f33614l = interfaceC22369k0;
            this.f33615m = c21192h3;
            this.f33616n = k02;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            boolean zI1 = this.f33614l.I1();
            C21192h3<T> c21192h3 = this.f33615m;
            float fC2 = zI1 ? c21192h3.f33610p.e().c(c21192h3.f33610p.f34354h.getF42167b()) : c21192h3.f33610p.g();
            Orientation orientation = c21192h3.f33612r;
            float f12 = orientation == Orientation.f27426c ? fC2 : 0.0f;
            if (orientation != Orientation.f27425b) {
                fC2 = 0.0f;
            }
            aVar2.e(this.f33616n, kotlin.math.b.b(f12), kotlin.math.b.b(fC2), 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public C21192h3() {
        throw null;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        this.f33613s = false;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
        if (!interfaceC22369k0.I1() || !this.f33613s) {
            kotlin.Q<? extends InterfaceC21153e3<T>, ? extends T> qInvoke = this.f33611q.invoke(androidx.compose.ui.unit.u.a(androidx.compose.ui.unit.v.a(k0I.f40345b, k0I.f40346c)), C22712b.a(j12));
            ((C21398x<T>) this.f33610p).l((InterfaceC21153e3) qInvoke.f406619b, qInvoke.f406620c);
        }
        this.f33613s = interfaceC22369k0.I1() || this.f33613s;
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(interfaceC22369k0, this, k0I));
    }
}
