package androidx.view;

import M11.d;
import Y61.k;
import androidx.view.C23300M;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.P0;
import androidx.view.S0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NavHostController.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/y0;", "Landroidx/navigation/v;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23404y0 extends C23397v {
    public final void C(@k InterfaceC22983P interfaceC22983P) {
        Lifecycle lifecycle;
        if (interfaceC22983P.equals(this.f53220p)) {
            return;
        }
        InterfaceC22983P interfaceC22983P2 = this.f53220p;
        d dVar = this.f53224t;
        if (interfaceC22983P2 != null && (lifecycle = interfaceC22983P2.getLifecycle()) != null) {
            lifecycle.c(dVar);
        }
        this.f53220p = interfaceC22983P;
        interfaceC22983P.getLifecycle().a(dVar);
    }

    public final void D(@k S0 s02) {
        C23300M c23300m = this.f53221q;
        C23300M.f52804J.getClass();
        C23300M.a aVar = C23300M.f52805K;
        if (L.f(c23300m, (C23300M) new P0(s02, aVar, null, 4, null).a(C23300M.class))) {
            return;
        }
        if (!this.f53211g.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.f53221q = (C23300M) new P0(s02, aVar, null, 4, null).a(C23300M.class);
    }
}
