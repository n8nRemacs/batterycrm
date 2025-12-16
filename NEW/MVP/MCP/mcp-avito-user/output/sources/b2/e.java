package B2;

import Y41.l;
import gc1.InterfaceC40658b;
import kotlin.jvm.internal.N;
import sberid.sdk.ui.screens.compose.elk.root.w;

/* loaded from: classes10.dex */
public final class e extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f814l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f815m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, InterfaceC40658b.k kVar) {
        super(1);
        this.f814l = wVar;
        this.f815m = kVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        return new d(this.f814l, this.f815m);
    }
}
