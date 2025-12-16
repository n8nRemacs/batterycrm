package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullToRefresh.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f37086l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f37087m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f37088n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f37089o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f37090p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, s sVar, v.a aVar, long j12, int i12) {
        super(2);
        this.f37086l = fVar;
        this.f37087m = sVar;
        this.f37088n = aVar;
        this.f37089o = j12;
        this.f37090p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        this.f37086l.a(this.f37087m, this.f37088n, this.f37089o, a12, C22066f2.a(this.f37090p | 1));
        return G0.f406611a;
    }
}
