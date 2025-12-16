package I81;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class a extends N implements p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f7994l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f7995m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f7996n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f7997o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f7998p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C22096n f7999q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8000r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f8001s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, long j12, float f12, boolean z12, long j13, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f7994l = vVar;
        this.f7995m = j12;
        this.f7996n = f12;
        this.f7997o = z12;
        this.f7998p = j13;
        this.f7999q = c22096n;
        this.f8000r = i12;
        this.f8001s = i13;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA2 = C22066f2.a(this.f8000r | 1);
        C22096n c22096n = this.f7999q;
        b.a(this.f7994l, this.f7995m, this.f7996n, this.f7997o, this.f7998p, c22096n, (A) obj, iA2, this.f8001s);
        return G0.f406611a;
    }
}
