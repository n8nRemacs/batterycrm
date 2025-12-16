package B2;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import gc1.InterfaceC40658b;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes10.dex */
public final class i extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40658b.k f825l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f826m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f827n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f828o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f829p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(v vVar, InterfaceC40658b.k kVar, long j12, h hVar, int i12) {
        super(2);
        this.f825l = kVar;
        this.f826m = vVar;
        this.f827n = j12;
        this.f828o = hVar;
        this.f829p = i12;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f829p | 1);
        InterfaceC40658b.k kVar = this.f825l;
        h hVar = this.f828o;
        j.a(this.f826m, kVar, this.f827n, hVar, (A) obj, iA2);
        return G0.f406611a;
    }
}
