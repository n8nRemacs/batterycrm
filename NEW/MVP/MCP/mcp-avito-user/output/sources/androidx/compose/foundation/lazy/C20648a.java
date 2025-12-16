package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C20714d0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyListPrefetchStrategy.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/a;", "Landroidx/compose/foundation/lazy/k0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20648a implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f28880a;

    /* renamed from: b, reason: collision with root package name */
    public int f28881b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public C20714d0.b f28882c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28883d;

    public C20648a() {
        this(0, 1, null);
    }

    @Override // androidx.compose.foundation.lazy.k0
    public final void a(@Y61.k androidx.compose.foundation.lazy.layout.E0 e02, int i12) {
        for (int i13 = 0; i13 < this.f28880a; i13++) {
            e02.a(i12 + i13);
        }
    }

    @Override // androidx.compose.foundation.lazy.k0
    public final void b(@Y61.k f0 f0Var) {
        if (this.f28881b != -1) {
            List<g0> list = f0Var.f28945k;
            if (list.isEmpty()) {
                return;
            }
            if (this.f28881b != (this.f28883d ? ((K) C42745f0.Q(list)).getF29645a() + 1 : ((K) C42745f0.E(list)).getF29645a() - 1)) {
                this.f28881b = -1;
                C20714d0.b bVar = this.f28882c;
                if (bVar != null) {
                    bVar.cancel();
                }
                this.f28882c = null;
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.k0
    public final void c(@Y61.k w0.e eVar, float f12, @Y61.k Y y12) {
        C20714d0.b bVar;
        C20714d0.b bVar2;
        C20714d0.b bVar3;
        if (y12.h().isEmpty()) {
            return;
        }
        boolean z12 = f12 < 0.0f;
        int f29645a = z12 ? ((K) C42745f0.Q(y12.h())).getF29645a() + 1 : ((K) C42745f0.E(y12.h())).getF29645a() - 1;
        if (f29645a < 0 || f29645a >= y12.getF28948n()) {
            return;
        }
        if (f29645a != this.f28881b) {
            if (this.f28883d != z12 && (bVar3 = this.f28882c) != null) {
                bVar3.cancel();
            }
            this.f28883d = z12;
            this.f28881b = f29645a;
            eVar.getClass();
            AbstractC22167l.a aVar = AbstractC22167l.f38720e;
            w0 w0Var = w0.this;
            aVar.getClass();
            AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
            Y41.l<Object, G0> f38696h = abstractC22167lA != null ? abstractC22167lA.getF38713f() : null;
            AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
            try {
                long j12 = ((f0) ((C22082i3) w0Var.f29718e).getF42167b()).f28944j;
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
                this.f28882c = w0Var.f29728o.a(f29645a, j12);
            } catch (Throwable th2) {
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38696h);
                throw th2;
            }
        }
        if (!z12) {
            if (y12.getF28946l() - ((K) C42745f0.E(y12.h())).getF28968p() >= f12 || (bVar = this.f28882c) == null) {
                return;
            }
            bVar.b();
            return;
        }
        K k12 = (K) C42745f0.Q(y12.h());
        if (((k12.getF28969q() + k12.getF28968p()) + y12.getF28952r()) - y12.getF28947m() >= (-f12) || (bVar2 = this.f28882c) == null) {
            return;
        }
        bVar2.b();
    }

    public C20648a(int i12) {
        this.f28880a = i12;
        this.f28881b = -1;
    }

    public /* synthetic */ C20648a(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 2 : i12);
    }
}
