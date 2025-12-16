package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f37097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f37098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37099n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Y41.a<Float> aVar, long j12, int i12) {
        super(2);
        this.f37097l = aVar;
        this.f37098m = j12;
        this.f37099n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f37099n | 1);
        r.a(this.f37097l, this.f37098m, a12, iA2);
        return G0.f406611a;
    }
}
