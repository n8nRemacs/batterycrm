package B2;

import gc1.InterfaceC40658b;
import kotlin.G0;
import kotlin.jvm.internal.N;
import sberid.sdk.ui.screens.compose.elk.root.o;
import sberid.sdk.ui.screens.compose.elk.root.w;

/* loaded from: classes10.dex */
public final class f extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f816l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f817m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w wVar, InterfaceC40658b.k kVar) {
        super(0);
        this.f816l = wVar;
        this.f817m = kVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        this.f816l.le(new o(this.f817m));
        return G0.f406611a;
    }
}
