package B2;

import Y41.p;
import androidx.fragment.app.ActivityC22955m;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import kotlin.G0;
import kotlin.jvm.internal.N;
import sberid.sdk.ui.screens.compose.elk.root.k;
import sberid.sdk.ui.screens.compose.elk.root.w;

/* loaded from: classes10.dex */
public final class h extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f822l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f823m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f824n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w wVar, InterfaceC40658b.k kVar, ActivityC22955m activityC22955m) {
        super(2);
        this.f822l = wVar;
        this.f823m = kVar;
        this.f824n = activityC22955m;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        this.f822l.le(new k(this.f823m, (C40657a) obj2, this.f824n));
        return G0.f406611a;
    }
}
