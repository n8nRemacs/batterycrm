package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PullRefreshIndicator.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f33931l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f33932m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f33933n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f33934o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t tVar, long j12, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f33931l = tVar;
        this.f33932m = j12;
        this.f33933n = vVar;
        this.f33934o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f33934o | 1);
        long j12 = this.f33932m;
        androidx.compose.ui.v vVar = this.f33933n;
        j.b(this.f33931l, j12, vVar, a12, iA2);
        return G0.f406611a;
    }
}
