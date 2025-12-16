package I81;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.InterfaceC22085c;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class k extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f8016l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22085c f8017m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8018n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, InterfaceC22085c interfaceC22085c, int i12) {
        super(2);
        this.f8016l = vVar;
        this.f8017m = interfaceC22085c;
        this.f8018n = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f8018n | 1);
        l.a(this.f8016l, this.f8017m, (A) obj, iA2);
        return G0.f406611a;
    }
}
