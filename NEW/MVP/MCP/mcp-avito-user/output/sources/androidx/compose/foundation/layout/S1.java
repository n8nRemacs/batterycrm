package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Padding.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/S1;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/unit/h;", "start", "top", "end", "bottom", "", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class S1 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: p, reason: collision with root package name */
    public float f28497p;

    /* renamed from: q, reason: collision with root package name */
    public float f28498q;

    /* renamed from: r, reason: collision with root package name */
    public float f28499r;

    /* renamed from: s, reason: collision with root package name */
    public float f28500s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28501t;

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28503m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f28504n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, InterfaceC22369k0 interfaceC22369k0) {
            super(1);
            this.f28503m = k02;
            this.f28504n = interfaceC22369k0;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            S1 s12 = S1.this;
            boolean z12 = s12.f28501t;
            InterfaceC22369k0 interfaceC22369k0 = this.f28504n;
            androidx.compose.ui.layout.K0 k02 = this.f28503m;
            if (z12) {
                aVar2.h(k02, interfaceC22369k0.y0(s12.f28497p), interfaceC22369k0.y0(s12.f28498q), 0.0f);
            } else {
                aVar2.e(k02, interfaceC22369k0.y0(s12.f28497p), interfaceC22369k0.y0(s12.f28498q), 0.0f);
            }
            return kotlin.G0.f406611a;
        }
    }

    public S1(float f12, float f13, float f14, float f15, boolean z12, C42822w c42822w) {
        this.f28497p = f12;
        this.f28498q = f13;
        this.f28499r = f14;
        this.f28500s = f15;
        this.f28501t = z12;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        int iY02 = interfaceC22369k0.y0(this.f28499r) + interfaceC22369k0.y0(this.f28497p);
        int iY03 = interfaceC22369k0.y0(this.f28500s) + interfaceC22369k0.y0(this.f28498q);
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22713c.i(-iY02, -iY03, j12));
        return interfaceC22369k0.L0(C22713c.g(k0I.f40345b + iY02, j12), C22713c.f(k0I.f40346c + iY03, j12), kotlin.collections.P0.c(), new a(k0I, interfaceC22369k0));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S1(float f12, float f13, float f14, float f15, boolean z12, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            f12 = 0;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
        }
        float f16 = f12;
        if ((i12 & 2) != 0) {
            f13 = 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        }
        float f17 = f13;
        if ((i12 & 4) != 0) {
            f14 = 0;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        }
        float f18 = f14;
        if ((i12 & 8) != 0) {
            f15 = 0;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        }
        this(f16, f17, f18, f15, z12, null);
    }
}
