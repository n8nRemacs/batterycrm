package B2;

import androidx.compose.runtime.InterfaceC22118l0;
import gc1.InterfaceC40658b;
import sberid.sdk.ui.screens.compose.elk.root.n;
import sberid.sdk.ui.screens.compose.elk.root.w;

/* loaded from: classes10.dex */
public final class d implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f813b;

    public d(w wVar, InterfaceC40658b.k kVar) {
        this.f812a = wVar;
        this.f813b = kVar;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        this.f812a.le(new n(this.f813b));
    }
}
