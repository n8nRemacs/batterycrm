package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContextMenuArea.android.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class d extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f27012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f27013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f27014n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v.a f27015o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f27016p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f27017q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22096n f27018r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f27019s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f27020t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(s sVar, Y41.a aVar, Y41.l lVar, v.a aVar2, boolean z12, Y41.a aVar3, C22096n c22096n, int i12, int i13) {
        super(2);
        this.f27012l = sVar;
        this.f27013m = aVar;
        this.f27014n = (N) lVar;
        this.f27015o = aVar2;
        this.f27016p = z12;
        this.f27017q = aVar3;
        this.f27018r = c22096n;
        this.f27019s = i12;
        this.f27020t = i13;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f27019s | 1);
        C22096n c22096n = this.f27018r;
        ?? r22 = this.f27014n;
        boolean z12 = this.f27016p;
        f.b(this.f27012l, this.f27013m, r22, this.f27015o, z12, this.f27017q, c22096n, a12, iA2, this.f27020t);
        return G0.f406611a;
    }
}
