package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.InterfaceC20732m0;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.ui.semantics.C22554b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: LazyLayoutSemanticState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/A;", "Landroidx/compose/foundation/lazy/layout/m0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A implements InterfaceC20732m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f28806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f28807b;

    public A(w0 w0Var, boolean z12) {
        this.f28806a = w0Var;
        this.f28807b = z12;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final Object a(int i12, Continuation<? super G0> continuation) {
        w0.c cVar = w0.f29712w;
        Object objK = this.f28806a.k(i12, 0, continuation);
        return objK == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objK : G0.f406611a;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final int b() {
        w0 w0Var = this.f28806a;
        return w0Var.j().getF28951q() + w0Var.j().d();
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final float c() {
        w0 w0Var = this.f28806a;
        int iH2 = w0Var.h();
        int i12 = w0Var.i();
        return w0Var.b() ? (iH2 * 500) + i12 + 100 : (iH2 * 500) + i12;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final C22554b d() {
        return this.f28807b ? new C22554b(-1, 1) : new C22554b(1, -1);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final int e() {
        w0 w0Var = this.f28806a;
        return (int) (w0Var.j().getF28950p() == Orientation.f27425b ? w0Var.j().c() & 4294967295L : w0Var.j().c() >> 32);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC20732m0
    public final float f() {
        w0 w0Var = this.f28806a;
        return (w0Var.h() * 500) + w0Var.i();
    }
}
