package E81;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class b extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f3798l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f3799m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f3800n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f3801o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f3802p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f3803q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3804r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3805s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Y41.a aVar, v vVar, long j12, float f12, String str, long j13, int i12, int i13) {
        super(2);
        this.f3798l = (N) aVar;
        this.f3799m = vVar;
        this.f3800n = j12;
        this.f3801o = f12;
        this.f3802p = str;
        this.f3803q = j13;
        this.f3804r = i12;
        this.f3805s = i13;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f3804r | 1);
        ?? r02 = this.f3798l;
        String str = this.f3802p;
        long j12 = this.f3803q;
        c.a(r02, this.f3799m, this.f3800n, this.f3801o, str, j12, (A) obj, iA2, this.f3805s);
        return G0.f406611a;
    }
}
