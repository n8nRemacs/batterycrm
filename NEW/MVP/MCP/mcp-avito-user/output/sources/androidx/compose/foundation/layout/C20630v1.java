package androidx.compose.foundation.layout;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22713c;
import kotlin.Metadata;

/* compiled from: WindowInsetsPadding.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/v1;", "Landroidx/compose/ui/layout/N;", "Landroidx/compose/ui/modifier/d;", "Landroidx/compose/ui/modifier/m;", "Landroidx/compose/foundation/layout/x2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.v1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20630v1 implements androidx.compose.ui.layout.N, androidx.compose.ui.modifier.d, androidx.compose.ui.modifier.m<InterfaceC20639x2> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28755b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f28756c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f28757d;

    /* compiled from: WindowInsetsPadding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.v1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28758l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f28759m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f28760n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f28758l = k02;
            this.f28759m = i12;
            this.f28760n = i13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.e(this.f28758l, this.f28759m, this.f28760n, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    public C20630v1(@Y61.k InterfaceC20639x2 interfaceC20639x2) {
        this.f28755b = interfaceC20639x2;
        this.f28756c = C22126m3.g(interfaceC20639x2);
        this.f28757d = C22126m3.g(interfaceC20639x2);
    }

    @Override // androidx.compose.ui.modifier.d
    public final void Q1(@Y61.k androidx.compose.ui.modifier.q qVar) {
        InterfaceC20639x2 interfaceC20639x2 = (InterfaceC20639x2) qVar.G(N2.f28440a);
        InterfaceC20639x2 interfaceC20639x22 = this.f28755b;
        ((C22082i3) this.f28756c).setValue(new C20621t0(interfaceC20639x22, interfaceC20639x2));
        ((C22082i3) this.f28757d).setValue(new C20619s2(interfaceC20639x2, interfaceC20639x22));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C20630v1) {
            return kotlin.jvm.internal.L.f(((C20630v1) obj).f28755b, this.f28755b);
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.N
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        InterfaceC22204y1 interfaceC22204y1 = this.f28756c;
        int iD2 = ((InterfaceC20639x2) ((C22082i3) interfaceC22204y1).getF42167b()).d(interfaceC22369k0, interfaceC22369k0.getF40524b());
        int iB2 = ((InterfaceC20639x2) ((C22082i3) interfaceC22204y1).getF42167b()).b(interfaceC22369k0);
        int iA2 = ((InterfaceC20639x2) ((C22082i3) interfaceC22204y1).getF42167b()).a(interfaceC22369k0, interfaceC22369k0.getF40524b()) + iD2;
        int iC2 = ((InterfaceC20639x2) ((C22082i3) interfaceC22204y1).getF42167b()).c(interfaceC22369k0) + iB2;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22713c.i(-iA2, -iC2, j12));
        return interfaceC22369k0.L0(C22713c.g(k0I.f40345b + iA2, j12), C22713c.f(k0I.f40346c + iC2, j12), kotlin.collections.P0.c(), new a(iD2, iB2, k0I));
    }

    @Override // androidx.compose.ui.modifier.m
    @Y61.k
    public final androidx.compose.ui.modifier.s<InterfaceC20639x2> getKey() {
        return N2.f28440a;
    }

    @Override // androidx.compose.ui.modifier.m
    public final InterfaceC20639x2 getValue() {
        return (InterfaceC20639x2) ((C22082i3) this.f28757d).getF42167b();
    }

    public final int hashCode() {
        return this.f28755b.hashCode();
    }
}
