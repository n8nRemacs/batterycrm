package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.I0;
import androidx.compose.foundation.lazy.layout.C20714d0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyGridPrefetchStrategy.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/a;", "Landroidx/compose/foundation/lazy/grid/v0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20660a implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29079a;

    /* renamed from: b, reason: collision with root package name */
    public int f29080b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<C20714d0.b> f29081c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29082d;

    public C20660a() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.grid.v0
    public final void a(@Y61.k androidx.compose.foundation.lazy.layout.E0 e02, int i12) {
        for (int i13 = 0; i13 < this.f29079a; i13++) {
            e02.a(i12 + i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.foundation.lazy.grid.v0
    public final void b(@Y61.k I0.e eVar, float f12, @Y61.k InterfaceC20675h0 interfaceC20675h0) {
        int f29220w;
        int f29645a;
        boolean z12;
        if (interfaceC20675h0.h().isEmpty()) {
            return;
        }
        boolean z13 = f12 < 0.0f;
        if (z13) {
            O o12 = (O) C42745f0.Q(interfaceC20675h0.h());
            f29220w = (interfaceC20675h0.getF29195q() == Orientation.f27425b ? o12.getF29220w() : o12.getF29221x()) + 1;
            f29645a = ((O) C42745f0.Q(interfaceC20675h0.h())).getF29645a() + 1;
        } else {
            O o13 = (O) C42745f0.E(interfaceC20675h0.h());
            f29220w = (interfaceC20675h0.getF29195q() == Orientation.f27425b ? o13.getF29220w() : o13.getF29221x()) - 1;
            f29645a = ((O) C42745f0.E(interfaceC20675h0.h())).getF29645a() - 1;
        }
        if (f29645a < 0 || f29645a >= interfaceC20675h0.getF29193o()) {
            return;
        }
        int i12 = this.f29080b;
        androidx.compose.runtime.collection.e<C20714d0.b> eVar2 = this.f29081c;
        if (f29220w == i12 || f29220w < 0) {
            z12 = z13;
        } else {
            if (this.f29082d != z13) {
                C20714d0.b[] bVarArr = eVar2.f38260b;
                int i13 = eVar2.f38262d;
                for (int i14 = 0; i14 < i13; i14++) {
                    bVarArr[i14].cancel();
                }
            }
            this.f29082d = z13;
            this.f29080b = f29220w;
            eVar2.g();
            eVar.getClass();
            ArrayList arrayList = new ArrayList();
            AbstractC22167l.a aVar = AbstractC22167l.f38720e;
            I0 i02 = I0.this;
            aVar.getClass();
            AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
            Y41.l<Object, kotlin.G0> f38696h = abstractC22167lA != null ? abstractC22167lA.getF38713f() : null;
            AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
            try {
                C20689o0 c20689o0 = i02.f29020b ? i02.f29021c : (C20689o0) ((C22082i3) i02.f29023e).getF42167b();
                if (c20689o0 != null) {
                    List list = (List) c20689o0.f29189k.invoke(Integer.valueOf(f29220w));
                    int size = list.size();
                    int i15 = 0;
                    while (i15 < size) {
                        kotlin.Q q12 = (kotlin.Q) list.get(i15);
                        arrayList.add(i02.f29033o.a(((Number) q12.f406619b).intValue(), ((C22712b) q12.f406620c).f42843a));
                        i15++;
                        z13 = z13;
                    }
                    z12 = z13;
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } else {
                    z12 = z13;
                }
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
                eVar2.d(eVar2.f38262d, arrayList);
            } catch (Throwable th2) {
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
                throw th2;
            }
        }
        if (!z12) {
            if (interfaceC20675h0.getF29191m() - androidx.compose.foundation.gestures.snapping.f.a((O) C42745f0.E(interfaceC20675h0.h()), interfaceC20675h0.getF29195q()) < f12) {
                C20714d0.b[] bVarArr2 = eVar2.f38260b;
                int i16 = eVar2.f38262d;
                for (int i17 = 0; i17 < i16; i17++) {
                    bVarArr2[i17].b();
                }
                return;
            }
            return;
        }
        O o14 = (O) C42745f0.Q(interfaceC20675h0.h());
        if (((androidx.compose.foundation.gestures.snapping.f.a(o14, interfaceC20675h0.getF29195q()) + ((int) (interfaceC20675h0.getF29195q() == Orientation.f27425b ? o14.getF29218u() & 4294967295L : o14.getF29218u() >> 32))) + interfaceC20675h0.getF29197s()) - interfaceC20675h0.getF29192n() < (-f12)) {
            C20714d0.b[] bVarArr3 = eVar2.f38260b;
            int i18 = eVar2.f38262d;
            for (int i19 = 0; i19 < i18; i19++) {
                bVarArr3[i19].b();
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.v0
    public final void c(@Y61.k C20689o0 c20689o0) {
        int f29220w;
        if (this.f29080b == -1 || c20689o0.h().isEmpty()) {
            return;
        }
        boolean z12 = this.f29082d;
        Orientation orientation = c20689o0.f29195q;
        if (z12) {
            O o12 = (O) C42745f0.Q(c20689o0.h());
            f29220w = (orientation == Orientation.f27425b ? o12.getF29220w() : o12.getF29221x()) + 1;
        } else {
            O o13 = (O) C42745f0.E(c20689o0.h());
            f29220w = (orientation == Orientation.f27425b ? o13.getF29220w() : o13.getF29221x()) - 1;
        }
        if (this.f29080b != f29220w) {
            this.f29080b = -1;
            androidx.compose.runtime.collection.e<C20714d0.b> eVar = this.f29081c;
            C20714d0.b[] bVarArr = eVar.f38260b;
            int i12 = eVar.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                bVarArr[i13].cancel();
            }
            eVar.g();
        }
    }

    public C20660a(int i12) {
        this.f29079a = i12;
        this.f29080b = -1;
        this.f29081c = new androidx.compose.runtime.collection.e<>(new C20714d0.b[16], 0);
    }

    public /* synthetic */ C20660a(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 2 : i12);
    }
}
