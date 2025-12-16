package I81;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.InterfaceC22085c;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class d extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f8004l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8005m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f8006n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f8007o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22085c f8008p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8009q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8010r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, long j12, float f12, float f13, InterfaceC22085c interfaceC22085c, int i12, int i13) {
        super(2);
        this.f8004l = vVar;
        this.f8005m = j12;
        this.f8006n = f12;
        this.f8007o = f13;
        this.f8008p = interfaceC22085c;
        this.f8009q = i12;
        this.f8010r = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f8009q | 1);
        float f12 = this.f8007o;
        InterfaceC22085c interfaceC22085c = this.f8008p;
        e.a(this.f8004l, this.f8005m, this.f8006n, f12, interfaceC22085c, (A) obj, iA2, this.f8010r);
        return G0.f406611a;
    }
}
