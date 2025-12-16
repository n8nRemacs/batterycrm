package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC20732m0;
import androidx.compose.ui.semantics.C22554b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: LazyLayoutSemanticState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/l;", "Landroidx/compose/foundation/lazy/layout/m0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.pager.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20818l implements InterfaceC20732m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f29946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f29947b;

    public C20818l(m0 m0Var, boolean z12) {
        this.f29946a = m0Var;
        this.f29947b = z12;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final Object a(int i12, Continuation<? super G0> continuation) {
        m0 m0Var = this.f29946a;
        Object objE = m0Var.e(MutatePriority.f26797b, new o0(m0Var, i12, null), continuation);
        if (objE != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objE = G0.f406611a;
        }
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : G0.f406611a;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final int b() {
        m0 m0Var = this.f29946a;
        return m0Var.l().getF29869d() + m0Var.l().d();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final float c() {
        m0 m0Var = this.f29946a;
        return p0.a(m0Var.l(), m0Var.m());
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final C22554b d() {
        boolean z12 = this.f29947b;
        m0 m0Var = this.f29946a;
        return z12 ? new C22554b(m0Var.m(), 1) : new C22554b(1, m0Var.m());
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final int e() {
        m0 m0Var = this.f29946a;
        return (int) (m0Var.l().getF29870e() == Orientation.f27425b ? m0Var.l().c() & 4294967295L : m0Var.l().c() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final float f() {
        return d0.a(this.f29946a);
    }
}
