package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.G1;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC20722h0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.unit.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LazyGridScrollScope.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/C0;", "Landroidx/compose/foundation/lazy/layout/h0;", "Landroidx/compose/foundation/gestures/G1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C0 implements InterfaceC20722h0, G1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G1 f28983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I0 f28984b;

    public C0(G1 g12, I0 i02) {
        this.f28984b = i02;
        this.f28983a = g12;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int P() {
        return this.f28984b.j().getF29193o();
    }

    @Override // androidx.compose.foundation.gestures.G1
    public final float a(float f12) {
        return this.f28983a.a(f12);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int b() {
        return this.f28984b.i();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int c() {
        return this.f28984b.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int d() {
        O o12 = (O) C42745f0.S(this.f28984b.j().h());
        if (o12 != null) {
            return o12.getF29645a();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final void e(int i12, int i13) {
        this.f28984b.l(i12, i13);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int f(int i12) {
        Integer numValueOf;
        O o12;
        I0 i02 = this.f28984b;
        InterfaceC20675h0 interfaceC20675h0J = i02.j();
        if (interfaceC20675h0J.h().isEmpty()) {
            return 0;
        }
        int iH2 = i02.h();
        if (i12 > d() || iH2 > i12) {
            int i13 = ((C20689o0) ((C22082i3) i02.f29023e).getF42167b()).f29188j;
            return (((((i13 - 1) * (i12 < i02.h() ? -1 : 1)) + (i12 - i02.h())) / i13) * C20677i0.a(interfaceC20675h0J)) - i02.i();
        }
        List<O> listH = interfaceC20675h0J.h();
        int size = listH.size();
        int i14 = 0;
        while (true) {
            numValueOf = null;
            if (i14 >= size) {
                o12 = null;
                break;
            }
            o12 = listH.get(i14);
            if (o12.getF29645a() == i12) {
                break;
            }
            i14++;
        }
        O o13 = o12;
        if (interfaceC20675h0J.getF29195q() == Orientation.f27425b) {
            if (o13 != null) {
                long f29219v = o13.getF29219v();
                q.a aVar = androidx.compose.ui.unit.q.f42862b;
                numValueOf = Integer.valueOf((int) (f29219v & 4294967295L));
            }
        } else if (o13 != null) {
            long f29219v2 = o13.getF29219v();
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            numValueOf = Integer.valueOf((int) (f29219v2 >> 32));
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
