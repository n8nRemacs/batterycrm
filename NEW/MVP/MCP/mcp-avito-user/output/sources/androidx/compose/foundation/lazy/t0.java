package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.G1;
import androidx.compose.foundation.lazy.layout.InterfaceC20722h0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: LazyListScrollScope.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/t0;", "Landroidx/compose/foundation/lazy/layout/h0;", "Landroidx/compose/foundation/gestures/G1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 implements InterfaceC20722h0, G1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G1 f29710a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f29711b;

    public t0(G1 g12, w0 w0Var) {
        this.f29711b = w0Var;
        this.f29710a = g12;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int P() {
        return this.f29711b.j().getF28948n();
    }

    @Override // androidx.compose.foundation.gestures.G1
    public final float a(float f12) {
        return this.f29710a.a(f12);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int b() {
        return this.f29711b.i();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int c() {
        return this.f29711b.h();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int d() {
        K k12 = (K) C42745f0.S(this.f29711b.j().h());
        if (k12 != null) {
            return k12.getF29645a();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final void e(int i12, int i13) {
        this.f29711b.l(i12, i13);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20722h0
    public final int f(int i12) {
        K k12;
        w0 w0Var = this.f29711b;
        Y yJ2 = w0Var.j();
        if (yJ2.h().isEmpty()) {
            return 0;
        }
        int iH2 = w0Var.h();
        if (i12 > d() || iH2 > i12) {
            return ((i12 - w0Var.h()) * Z.a(yJ2)) - w0Var.i();
        }
        List<K> listH = yJ2.h();
        int size = listH.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                k12 = null;
                break;
            }
            k12 = listH.get(i13);
            if (k12.getF29645a() == i12) {
                break;
            }
            i13++;
        }
        K k13 = k12;
        if (k13 != null) {
            return k13.getF28968p();
        }
        return 0;
    }
}
