package coil.util;

import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: Lifecycles.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/util/h;", "Landroidx/lifecycle/q;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r f58779b;

    public h(kotlinx.coroutines.r rVar) {
        this.f58779b = rVar;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStart(@Y61.k InterfaceC22983P interfaceC22983P) {
        int i12 = Z.f406624c;
        this.f58779b.resumeWith(G0.f406611a);
    }
}
