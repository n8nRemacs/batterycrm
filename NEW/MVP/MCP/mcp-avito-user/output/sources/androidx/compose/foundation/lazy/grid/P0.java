package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.I0;
import androidx.compose.foundation.lazy.layout.InterfaceC20732m0;
import androidx.compose.ui.semantics.C22554b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: LazySemantics.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/P0;", "Landroidx/compose/foundation/lazy/layout/m0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P0 implements InterfaceC20732m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f29069a;

    public P0(I0 i02) {
        this.f29069a = i02;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final Object a(int i12, Continuation<? super kotlin.G0> continuation) {
        I0.c cVar = I0.f29017w;
        Object objK = this.f29069a.k(i12, 0, continuation);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : kotlin.G0.f406611a;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final int b() {
        I0 i02 = this.f29069a;
        return i02.j().getF29196r() + i02.j().d();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final float c() {
        I0 i02 = this.f29069a;
        int iH2 = i02.h();
        int i12 = i02.i();
        return i02.b() ? (iH2 * 500) + i12 + 100 : (iH2 * 500) + i12;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final C22554b d() {
        return new C22554b(-1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final int e() {
        I0 i02 = this.f29069a;
        return (int) (i02.j().getF29195q() == Orientation.f27425b ? i02.j().c() & 4294967295L : i02.j().c() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final float f() {
        I0 i02 = this.f29069a;
        return (i02.h() * 500) + i02.i();
    }
}
