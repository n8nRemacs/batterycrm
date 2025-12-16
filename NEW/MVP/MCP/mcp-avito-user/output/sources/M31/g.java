package m31;

import Yb1.a;
import java.net.SocketException;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class g extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Ub1.b f414292l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Ub1.b bVar) {
        super(0);
        this.f414292l = bVar;
    }

    @Override // Y41.a
    public final Object invoke() throws SocketException {
        Ub1.b bVar = this.f414292l;
        bVar.setVisibility(8);
        if (!bVar.f16498h) {
            bVar.f16498h = true;
            e31.g globalAnalytic = bVar.getGlobalAnalytic();
            d1.h[] hVarArr = d1.h.f393613b;
            globalAnalytic.getClass();
            globalAnalytic.f394946a.a(new a.d("version", "android_4.0.0", ((e.h) globalAnalytic.f394947b).a(), (String) y31.c.f442880b.getValue(), null, 16, null));
        }
        C43874b c43874b = bVar.f16507q;
        if (!c43874b.hasChanged()) {
            bVar.setVisibility(8);
            bVar.c();
            c43874b.setChanged();
            c43874b.notifyObservers();
        }
        return G0.f406611a;
    }
}
