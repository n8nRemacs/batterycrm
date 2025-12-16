package B2;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import androidx.fragment.app.ActivityC22955m;
import gc1.InterfaceC40658b;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes10.dex */
public final class g extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f818l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActivityC22955m f819m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f820n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f821o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC40658b.k kVar, ActivityC22955m activityC22955m, v vVar, int i12) {
        super(2);
        this.f818l = kVar;
        this.f819m = activityC22955m;
        this.f820n = vVar;
        this.f821o = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f821o | 1);
        j.b(this.f818l, this.f819m, (A) obj, iA2);
        return G0.f406611a;
    }
}
