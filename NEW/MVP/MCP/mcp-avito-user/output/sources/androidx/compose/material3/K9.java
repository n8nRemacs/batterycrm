package androidx.compose.material3;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: InteractiveComponentSize.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/K9;", "Landroidx/compose/ui/layout/N;", "Landroidx/compose/ui/unit/l;", "size", "<init>", "(JLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class K9 implements androidx.compose.ui.layout.N {

    /* renamed from: b, reason: collision with root package name */
    public final long f35000b;

    /* compiled from: InteractiveComponentSize.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f35001l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f35002m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f35003n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f35001l = i12;
            this.f35002m = k02;
            this.f35003n = i13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.e(this.f35002m, kotlin.math.b.b((this.f35001l - r0.f40345b) / 2.0f), kotlin.math.b.b((this.f35003n - r0.f40346c) / 2.0f), 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public K9(long j12, C42822w c42822w) {
        this.f35000b = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        K9 k92 = obj instanceof K9 ? (K9) obj : null;
        if (k92 == null) {
            return false;
        }
        return androidx.compose.ui.unit.l.b(this.f35000b, k92.f35000b);
    }

    @Override // androidx.compose.ui.layout.N
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
        int i12 = k0I.f40345b;
        long j13 = this.f35000b;
        int iMax = Math.max(i12, interfaceC22369k0.y0(androidx.compose.ui.unit.l.d(j13)));
        int iMax2 = Math.max(k0I.f40346c, interfaceC22369k0.y0(androidx.compose.ui.unit.l.c(j13)));
        return interfaceC22369k0.L0(iMax, iMax2, kotlin.collections.P0.c(), new a(iMax, iMax2, k0I));
    }

    public final int hashCode() {
        l.a aVar = androidx.compose.ui.unit.l.f42859b;
        return Long.hashCode(this.f35000b);
    }
}
