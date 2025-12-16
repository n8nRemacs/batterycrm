package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FlowLayoutOverflow.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/X0;", "", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class X0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FlowLayoutOverflow.OverflowType f28532a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28534c;

    /* renamed from: d, reason: collision with root package name */
    public int f28535d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f28536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public InterfaceC22363h0 f28537f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.K0 f28538g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public InterfaceC22363h0 f28539h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.K0 f28540i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public androidx.collection.E f28541j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public androidx.collection.E f28542k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Boolean, ? super Integer, ? extends InterfaceC22363h0> f28543l;

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType = FlowLayoutOverflow.OverflowType.f28263b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType2 = FlowLayoutOverflow.OverflowType.f28263b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FlowLayoutOverflow.OverflowType overflowType3 = FlowLayoutOverflow.OverflowType.f28263b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/K0;", "placeable", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.K0, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Z0 f28545m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Z0 z02) {
            super(1);
            this.f28545m = z02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.layout.K0 k02) {
            int iJ2;
            int iG2;
            androidx.compose.ui.layout.K0 k03 = k02;
            if (k03 != null) {
                Z0 z02 = this.f28545m;
                iJ2 = z02.j(k03);
                iG2 = z02.g(k03);
            } else {
                iJ2 = 0;
                iG2 = 0;
            }
            androidx.collection.E eA2 = androidx.collection.E.a(androidx.collection.E.b(iJ2, iG2));
            X0 x02 = X0.this;
            x02.f28541j = eA2;
            x02.f28538g = k03;
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: FlowLayoutOverflow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/K0;", "placeable", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.layout.K0, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Z0 f28547m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Z0 z02) {
            super(1);
            this.f28547m = z02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.layout.K0 k02) {
            int iJ2;
            int iG2;
            androidx.compose.ui.layout.K0 k03 = k02;
            if (k03 != null) {
                Z0 z02 = this.f28547m;
                iJ2 = z02.j(k03);
                iG2 = z02.g(k03);
            } else {
                iJ2 = 0;
                iG2 = 0;
            }
            androidx.collection.E eA2 = androidx.collection.E.a(androidx.collection.E.b(iJ2, iG2));
            X0 x02 = X0.this;
            x02.f28542k = eA2;
            x02.f28540i = k03;
            return kotlin.G0.f406611a;
        }
    }

    public X0(@Y61.k FlowLayoutOverflow.OverflowType overflowType, int i12, int i13) {
        this.f28532a = overflowType;
        this.f28533b = i12;
        this.f28534c = i13;
    }

    @Y61.l
    public final androidx.collection.E a(int i12, int i13, boolean z12) {
        int iOrdinal = this.f28532a.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return null;
        }
        if (iOrdinal == 2) {
            if (z12) {
                return this.f28541j;
            }
            return null;
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z12) {
            return this.f28541j;
        }
        if (i12 + 1 < this.f28533b || i13 < this.f28534c) {
            return null;
        }
        return this.f28542k;
    }

    public final void b(@Y61.l InterfaceC22391w interfaceC22391w, @Y61.l InterfaceC22391w interfaceC22391w2, boolean z12, long j12) {
        long jA2 = P1.a(j12, z12 ? LayoutOrientation.f28394b : LayoutOrientation.f28395c);
        if (interfaceC22391w != null) {
            int i12 = C22712b.i(jA2);
            AbstractC20606p0 abstractC20606p0 = S0.f28494a;
            int iG2 = z12 ? interfaceC22391w.G(i12) : interfaceC22391w.X(i12);
            this.f28541j = androidx.collection.E.a(androidx.collection.E.b(iG2, z12 ? interfaceC22391w.X(iG2) : interfaceC22391w.G(iG2)));
            this.f28537f = interfaceC22391w instanceof InterfaceC22363h0 ? (InterfaceC22363h0) interfaceC22391w : null;
            this.f28538g = null;
        }
        if (interfaceC22391w2 != null) {
            int i13 = C22712b.i(jA2);
            AbstractC20606p0 abstractC20606p02 = S0.f28494a;
            int iG3 = z12 ? interfaceC22391w2.G(i13) : interfaceC22391w2.X(i13);
            this.f28542k = androidx.collection.E.a(androidx.collection.E.b(iG3, z12 ? interfaceC22391w2.X(iG3) : interfaceC22391w2.G(iG3)));
            this.f28539h = interfaceC22391w2 instanceof InterfaceC22363h0 ? (InterfaceC22363h0) interfaceC22391w2 : null;
            this.f28540i = null;
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x02 = (X0) obj;
        return this.f28532a == x02.f28532a && this.f28533b == x02.f28533b && this.f28534c == x02.f28534c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28534c) + androidx.appcompat.app.r.e(this.f28533b, this.f28532a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlowLayoutOverflowState(type=");
        sb2.append(this.f28532a);
        sb2.append(", minLinesToShowCollapse=");
        sb2.append(this.f28533b);
        sb2.append(", minCrossAxisSizeToShowCollapse=");
        return androidx.appcompat.app.r.t(sb2, this.f28534c, ')');
    }
}
