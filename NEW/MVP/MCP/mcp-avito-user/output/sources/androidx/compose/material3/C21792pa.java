package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC22118l0;
import androidx.view.C23489g;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.pa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21792pa implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P9 f37037a;

    public C21792pa(P9 p92) {
        this.f37037a = p92;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        P9 p92 = this.f37037a;
        p92.d();
        androidx.view.V0.b(p92, null);
        C23489g.b(p92, null);
        p92.f35291l.getViewTreeObserver().removeOnGlobalLayoutListener(p92);
        p92.f35293n.removeViewImmediate(p92);
    }
}
